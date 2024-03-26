export interface DeviceSettingsPermissionPlugin {
  /**
   * Request permission to show notifications.
   * @since 1.0.0
   * @returns A promise that resolves with the current permission status.
   * @example
   * ```typescript
   * const { permission } = await DeviceSettingsPermission.requestNotificationPermission();
   * if (permission === 'granted') {
   *  // Notifications can be shown
   * } else {
   *  // Notifications cannot be shown
   * }
   */
  requestNotificationPermission(): Promise<{
    permission: NotificationPermissions;
  }>;

  /**
   * Open the app settings for the app.
   * @since 1.0.0
   * @param type The type of settings to open.
   * @returns A promise that resolves once the settings are opened.
   * @example
   * ```typescript
   * await DeviceSettingsPermission.openAppSettings('notification');
   * ```
   */
  openAppSettings(type: AppSettingsType): Promise<void>;
}

export enum NotificationPermissions {
  GRANTED = 'granted',
  DENIED = 'denied',
}

export enum AppSettingsType {
  NOTIFICATION = 'notification',
  LOCATION = 'location',
  TRACING = 'tracing',
  GENERAL = 'general',
}
