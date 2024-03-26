package com.meljalil.plugins.devicesettingspermission;

import static android.provider.Settings.ACTION_APPLICATION_SETTINGS;
import static android.provider.Settings.ACTION_APP_NOTIFICATION_SETTINGS;
import static android.provider.Settings.ACTION_LOCALE_SETTINGS;

public class DeviceSettingsPermission {

    static final String PUSH_NOTIFICATIONS = "notifications";

    public static String getSettingAction(String settingName) {
        switch (settingName) {
            case "notification":
                return ACTION_APP_NOTIFICATION_SETTINGS;
            case "location":
                return ACTION_LOCATION_SOURCE_SETTINGS;
            case "tracking":
                return ACTION_APPLICATION_DETAILS_SETTINGS;
            case "general":
                return ACTION_APPLICATION_SETTINGS;
        }
        return ACTION_SETTINGS;
    }

    public boolean checkSDKVersionOrPermissionGranted(Plugin plugin) {
        return (
            Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU || plugin.getPermissionState(PUSH_NOTIFICATIONS) == PermissionState.GRANTED
        );
    }

    public String getNotificationPermissionText(Context context) {
        if (areNotificationsEnabled(context)) {
            return "granted";
        } else {
            return "denied";
        }
    }

    private boolean areNotificationsEnabled(Context context) {
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        return notificationManager.areNotificationsEnabled();
    }
}
