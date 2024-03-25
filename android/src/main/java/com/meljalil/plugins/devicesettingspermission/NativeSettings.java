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
            case "accessibility":
                return ACTION_ACCESSIBILITY_SETTINGS;
            case "add_account":
                return ACTION_ADD_ACCOUNT;
            case "airplane_mode":
                return ACTION_AIRPLANE_MODE_SETTINGS;
            case "apn":
                return ACTION_APN_SETTINGS;
            case "application_details":
                return ACTION_APPLICATION_DETAILS_SETTINGS;
            case "application_development":
                return ACTION_APPLICATION_DEVELOPMENT_SETTINGS;
            case "application":
                return ACTION_APPLICATION_SETTINGS;
            case "app_notification":
                return ACTION_APP_NOTIFICATION_SETTINGS;
            case "bluetooth":
                return ACTION_BLUETOOTH_SETTINGS;
            case "captioning":
                return ACTION_CAPTIONING_SETTINGS;
            case "cast":
                return ACTION_CAST_SETTINGS;
            case "data_roaming":
                return ACTION_DATA_ROAMING_SETTINGS;
            case "date":
                return ACTION_DATE_SETTINGS;
            case "display":
                return ACTION_DISPLAY_SETTINGS;
            case "dream":
                return ACTION_DREAM_SETTINGS;
            case "home":
                return ACTION_HOME_SETTINGS;
            case "ignore_battery_optimization":
                return ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS;
            case "input_method":
                return ACTION_INPUT_METHOD_SETTINGS;
            case "input_method_subtype":
                return ACTION_INPUT_METHOD_SUBTYPE_SETTINGS;
            case "internal_storage":
                return ACTION_INTERNAL_STORAGE_SETTINGS;
            case "locale":
                return ACTION_LOCALE_SETTINGS;
            case "location_source":
                return ACTION_LOCATION_SOURCE_SETTINGS;
            case "manage_all_applications":
                return ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS;
            case "manage_applications":
                return ACTION_MANAGE_APPLICATIONS_SETTINGS;
            case "memory_card":
                return ACTION_MEMORY_CARD_SETTINGS;
            case "network_operator":
                return ACTION_NETWORK_OPERATOR_SETTINGS;
            case "nfc_sharing":
                return ACTION_NFCSHARING_SETTINGS;
            case "nfc_payment":
                return ACTION_NFC_PAYMENT_SETTINGS;
            case "nfc":
                return ACTION_NFC_SETTINGS;
            case "print":
                return ACTION_PRINT_SETTINGS;
            case "privacy":
                return ACTION_PRIVACY_SETTINGS;
            case "quick_launch":
                return ACTION_QUICK_LAUNCH_SETTINGS;
            case "search":
                return ACTION_SEARCH_SETTINGS;
            case "security":
                return ACTION_SECURITY_SETTINGS;
            case "settings":
                return ACTION_SETTINGS;
            case "show_regulatory_info":
                return ACTION_SHOW_REGULATORY_INFO;
            case "sound":
                return ACTION_SOUND_SETTINGS;
        }
        return ACTION_SETTINGS;
    }
}
