var capacitorDeviceSettingsPermission = (function (exports, core) {
    'use strict';

    exports.NotificationPermissions = void 0;
    (function (NotificationPermissions) {
        NotificationPermissions["GRANTED"] = "granted";
        NotificationPermissions["DENIED"] = "denied";
    })(exports.NotificationPermissions || (exports.NotificationPermissions = {}));
    exports.AppSettingsType = void 0;
    (function (AppSettingsType) {
        AppSettingsType["NOTIFICATION"] = "notification";
    })(exports.AppSettingsType || (exports.AppSettingsType = {}));

    const DeviceSettingsPermission = core.registerPlugin('DeviceSettingsPermission');

    exports.DeviceSettingsPermission = DeviceSettingsPermission;

    Object.defineProperty(exports, '__esModule', { value: true });

    return exports;

})({}, capacitorExports);
//# sourceMappingURL=plugin.js.map
