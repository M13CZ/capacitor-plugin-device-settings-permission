package com.meljalil.plugins.devicesettingspermission;

import static android.provider.Settings.ACTION_ACCESSIBILITY_SETTINGS;
import static android.provider.Settings.ACTION_ADD_ACCOUNT;
import static android.provider.Settings.ACTION_AIRPLANE_MODE_SETTINGS;
import static android.provider.Settings.ACTION_APN_SETTINGS;
import static android.provider.Settings.ACTION_APPLICATION_DETAILS_SETTINGS;
import static android.provider.Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS;
import static android.provider.Settings.ACTION_APPLICATION_SETTINGS;
import static android.provider.Settings.ACTION_APP_NOTIFICATION_SETTINGS;
import static android.provider.Settings.ACTION_BLUETOOTH_SETTINGS;
import static android.provider.Settings.ACTION_CAPTIONING_SETTINGS;
import static android.provider.Settings.ACTION_CAST_SETTINGS;
import static android.provider.Settings.ACTION_DATA_ROAMING_SETTINGS;
import static android.provider.Settings.ACTION_DATE_SETTINGS;
import static android.provider.Settings.ACTION_DISPLAY_SETTINGS;
import static android.provider.Settings.ACTION_DREAM_SETTINGS;
import static android.provider.Settings.ACTION_HOME_SETTINGS;
import static android.provider.Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS;
import static android.provider.Settings.ACTION_INPUT_METHOD_SETTINGS;
import static android.provider.Settings.ACTION_INPUT_METHOD_SUBTYPE_SETTINGS;
import static android.provider.Settings.ACTION_INTERNAL_STORAGE_SETTINGS;
import static android.provider.Settings.ACTION_LOCALE_SETTINGS;
import static android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS;
import static android.provider.Settings.ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS;
import static android.provider.Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS;
import static android.provider.Settings.ACTION_MEMORY_CARD_SETTINGS;
import static android.provider.Settings.ACTION_NETWORK_OPERATOR_SETTINGS;
import static android.provider.Settings.ACTION_NFCSHARING_SETTINGS;
import static android.provider.Settings.ACTION_NFC_PAYMENT_SETTINGS;
import static android.provider.Settings.ACTION_NFC_SETTINGS;
import static android.provider.Settings.ACTION_PRINT_SETTINGS;
import static android.provider.Settings.ACTION_PRIVACY_SETTINGS;
import static android.provider.Settings.ACTION_QUICK_LAUNCH_SETTINGS;
import static android.provider.Settings.ACTION_SEARCH_SETTINGS;
import static android.provider.Settings.ACTION_SECURITY_SETTINGS;
import static android.provider.Settings.ACTION_SETTINGS;
import static android.provider.Settings.ACTION_SHOW_REGULATORY_INFO;
import static android.provider.Settings.ACTION_SOUND_SETTINGS;
import static android.provider.Settings.ACTION_SYNC_SETTINGS;
import static android.provider.Settings.ACTION_USAGE_ACCESS_SETTINGS;
import static android.provider.Settings.ACTION_USER_DICTIONARY_SETTINGS;
import static android.provider.Settings.ACTION_VOICE_INPUT_SETTINGS;
import static android.provider.Settings.ACTION_WIFI_IP_SETTINGS;
import static android.provider.Settings.ACTION_WIFI_SETTINGS;
import static android.provider.Settings.ACTION_WIRELESS_SETTINGS;

public class NativeSettings {

    public static String getSettingAction(String settingName) {
        switch (settingName) {
            case "notification":
                return ACTION_APP_NOTIFICATION_SETTINGS;
            case "location":
                return ACTION_LOCATION_SOURCE_SETTINGS;
            case "others":
                return ACTION_APPLICATION_SETTINGS;
        }
        return ACTION_SETTINGS;
    }
}
