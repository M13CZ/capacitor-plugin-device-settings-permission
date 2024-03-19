export interface DeviceSettingsPermissionPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
