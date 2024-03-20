package com.meljalil.plugins.devicesettingspermission;

import static com.meljalil.plugins.devicesettingspermission.NotificationPermission.PUSH_NOTIFICATIONS;

import android.Manifest;
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

    private final NotificationPermission notificationPermission = new NotificationPermission();

    @PluginMethod
    public void requestNotificationPermission(PluginCall call) {
        if (notificationPermission.checkSDKVersionOrPermissionGranted(this)) {
            JSObject permissionsResultJSON = new JSObject();
            permissionsResultJSON.put("value", notificationPermission.getNotificationPermissionText(getContext()));
            call.resolve(permissionsResultJSON);
        } else {
            requestPermissionForAlias(PUSH_NOTIFICATIONS, call, "permissionsCallback");
        }
    }

    @PermissionCallback
    private void permissionsCallback(PluginCall call) {
        JSObject permissionsResultJSON = new JSObject();
        permissionsResultJSON.put("value", notificationPermission.getNotificationPermissionText(getContext()));
        call.resolve(permissionsResultJSON);
    }
}
