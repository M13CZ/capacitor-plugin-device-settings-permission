import Foundation
import Capacitor
import UserNotifications

@objc(DeviceSettingsPermissionPlugin)
public class DeviceSettingsPermissionPlugin: CAPPlugin {
    private let implementation = DeviceSettingsPermission()

    @objc func requestNotificationPermission(_ call: CAPPluginCall) {
        let result = implementation.requestNotificationPermission()
        call.resolve(["permission": result])
    }

    @objc func getNotificationPermission(_ call: CAPPluginCall) {
        let result = implementation.getNotificationPermission()
        call.resolve(["permission": result])
    }

    @objc func openSettings(_ call: CAPPluginCall) {
        let settingName = call.getString("settingName") ?? ""
        if settingName.isEmpty {
            call.reject("Invalid settingName")
        } else {
            let result = implementation.openSettings(settingName: settingName)
            call.resolve(["result": result])
        }
    }
}