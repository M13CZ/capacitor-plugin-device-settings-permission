import Foundation
import UserNotifications
import UIKit

@objc(DeviceSettingsPermissionPlugin) public class DeviceSettingsPermission: NSObject {

    let settingsPaths = [
        "general": "App-prefs:General",
        "location": "App-prefs:Privacy&path=LOCATION",
        "notification": "App-prefs:NOTIFICATIONS_ID",
        "tracking": "App-prefs:Privacy&path=USER_TRACKING",
    ]

    @objc public func requestNotificationPermission() -> String {
        let semaphore = DispatchSemaphore(value: 0)
        var result = "denied"
        UNUserNotificationCenter.current().requestAuthorization(options: [.alert, .sound, .badge]) { granted, _ in
            result = granted ? "granted" : "denied"
            semaphore.signal()
        }
        semaphore.wait()
        return result
    }

    @objc public func getNotificationPermission() -> String {
        let semaphore = DispatchSemaphore(value: 0)
        var result = "denied"
        UNUserNotificationCenter.current().getNotificationSettings { settings in
            result = settings.authorizationStatus == .authorized ? "granted" : "denied"
            semaphore.signal()
        }
        semaphore.wait()
        return result
    }

    @objc public func openSettings(settingName: String) -> Bool {
        guard let path = settingsPaths[settingName] else {
            return false
        }
        if let url = URL(string: path) {
            if UIApplication.shared.canOpenURL(url) {
                UIApplication.shared.open(url, options: [:], completionHandler: nil)
                return true
            } else {
                return false
            }
        }
        return false
    }
}