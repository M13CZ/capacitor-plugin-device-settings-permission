import { WebPlugin } from '@capacitor/core';

import type { DeviceSettingsPermissionPlugin } from './definitions';

export class DeviceSettingsPermissionWeb extends WebPlugin implements DeviceSettingsPermissionPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
