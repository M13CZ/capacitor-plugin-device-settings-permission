package com.meljalil.plugins.devicesettingspermission;


import android.content.Context;
import android.os.Build;

import androidx.core.app.NotificationManagerCompat;

import com.getcapacitor.PermissionState;
import com.getcapacitor.Plugin;

public class NotificationPermission {

    static final String PUSH_NOTIFICATIONS = "notifications";

    public boolean checkSDKVersionOrPermissionGranted(Plugin plugin) {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU || plugin.getPermissionState(PUSH_NOTIFICATIONS) == PermissionState.GRANTED;
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

