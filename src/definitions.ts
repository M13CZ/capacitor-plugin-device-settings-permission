export interface DeviceSettingsPermissionPlugin {
  requestNotificationPermission(): Promise<{
    permission: NotificationPermissions;
  }>;
  openAppSettings(type: AppSettingsType): Promise<void>;
}

export enum NotificationPermissions {
  GRANTED = 'granted',
  DENIED = 'denied',
}

export enum AppSettingsType {
  NOTIFICATION = 'notification',
}
