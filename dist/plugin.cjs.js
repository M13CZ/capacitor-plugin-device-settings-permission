'use strict';

Object.defineProperty(exports, '__esModule', { value: true });

var core = require('@capacitor/core');

exports.NotificationPermissions = void 0;
(function (NotificationPermissions) {
    NotificationPermissions["GRANTED"] = "granted";
    NotificationPermissions["DENIED"] = "denied";
})(exports.NotificationPermissions || (exports.NotificationPermissions = {}));
exports.AppSettingsType = void 0;
(function (AppSettingsType) {
    AppSettingsType["NOTIFICATION"] = "notification";
    AppSettingsType["LOCATION"] = "location";
    AppSettingsType["TRACING"] = "tracing";
    AppSettingsType["GENERAL"] = "general";
})(exports.AppSettingsType || (exports.AppSettingsType = {}));

const DeviceSettingsPermission = core.registerPlugin('DeviceSettingsPermission');

exports.DeviceSettingsPermission = DeviceSettingsPermission;
//# sourceMappingURL=plugin.cjs.js.map
