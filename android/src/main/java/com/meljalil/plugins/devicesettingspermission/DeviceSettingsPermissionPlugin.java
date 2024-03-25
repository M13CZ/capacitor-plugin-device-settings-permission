package com.meljalil.plugins.devicesettingspermission;

import static com.meljalil.plugins.devicesettingspermission.DeviceSettingsPermission.PUSH_NOTIFICATIONS;

import android.Manifest;
import android.content.Intent;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.getcapacitor.annotation.Permission;
import com.getcapacitor.annotation.PermissionCallback;

@CapacitorPlugin(
    name = "DeviceSettingsPermission",
    permissions = @Permission(strings = { Manifest.permission.POST_NOTIFICATIONS }, alias = PUSH_NOTIFICATIONS)
)
public class DeviceSettingsPermissionPlugin extends Plugin {

    private final NotificationPermission implementation = new NotificationPermission();

    @PluginMethod
    public void requestNotificationPermission(PluginCall call) {
        if (implementation.checkSDKVersionOrPermissionGranted(this)) {
            JSObject permissionsResultJSON = new JSObject();
            permissionsResultJSON.put("value", implementation.getNotificationPermissionText(getContext()));
            call.resolve(permissionsResultJSON);
        } else {
            requestPermissionForAlias(PUSH_NOTIFICATIONS, call, "permissionsCallback");
        }
    }

    @PluginMethod
    public void getNotificationPermission(PluginCall call) {
        JSObject permissionsResultJSON = new JSObject();
        permissionsResultJSON.put("value", implementation.getNotificationPermissionText(getContext()));
        call.resolve(permissionsResultJSON);
    }

    @PermissionCallback
    private void permissionsCallback(PluginCall call) {
        JSObject permissionsResultJSON = new JSObject();
        permissionsResultJSON.put("value", implementation.getNotificationPermissionText(getContext()));
        call.resolve(permissionsResultJSON);
    }

    @PluginMethod
    public void openSettings(PluginCall call) {
        final String packageName = getContext().getPackageName();
        final String settingName = call.getString("settingName");

        if (settingName == null || settingName.isEmpty()) {
            call.reject("Invalid settingName");
        }

        String settingAction = implementation.getSettingAction(settingName);

        Intent intent = new Intent(settingAction);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setPackage(packageName);

        getContext().startActivity(intent);

        call.resolve();
    }
}
