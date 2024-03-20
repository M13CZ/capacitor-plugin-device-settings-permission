import { registerPlugin } from '@capacitor/core';

import type { DeviceSettingsPermissionPlugin } from './definitions';

const DeviceSettingsPermission = registerPlugin<DeviceSettingsPermissionPlugin>(
  'DeviceSettingsPermission',
);

export * from './definitions';
export { DeviceSettingsPermission };
