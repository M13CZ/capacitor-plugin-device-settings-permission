import { registerPlugin } from '@capacitor/core';

import type { DeviceSettingsPermissionPlugin } from './definitions';

const DeviceSettingsPermission = registerPlugin<DeviceSettingsPermissionPlugin>('DeviceSettingsPermission', {
  web: () => import('./web').then(m => new m.DeviceSettingsPermissionWeb()),
});

export * from './definitions';
export { DeviceSettingsPermission };
