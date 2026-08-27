package com.sentiance.sdk.offthegrid;

import com.sentiance.sdk.configuration.ConfigurationManager;
import com.sentiance.sdk.devicestate.LocationSetting;
import o.isGeofencesEnabledFromEnvironmentlambda1;

/* JADX INFO: loaded from: classes3.dex */
public class OffTheGridLocationSettingStateProvider {
    private final ConfigurationManager serializer;
    private final isGeofencesEnabledFromEnvironmentlambda1 write;

    public enum State {
        OFF,
        BATTERY_SAVING,
        DEVICE_ONLY,
        OK
    }

    public final State read() {
        ConfigurationManager configurationManager = this.serializer;
        boolean zIconCompatParcelizer = configurationManager.IconCompatParcelizer("gps");
        boolean zIconCompatParcelizer2 = configurationManager.IconCompatParcelizer("network");
        LocationSetting locationSettingIconCompatParcelizer = this.write.IconCompatParcelizer();
        if (!locationSettingIconCompatParcelizer.IconCompatParcelizer() && !locationSettingIconCompatParcelizer.write() && (zIconCompatParcelizer || zIconCompatParcelizer2)) {
            return State.OFF;
        }
        if (!zIconCompatParcelizer || locationSettingIconCompatParcelizer.IconCompatParcelizer() || zIconCompatParcelizer2) {
            return (!zIconCompatParcelizer2 || locationSettingIconCompatParcelizer.write()) ? State.OK : State.DEVICE_ONLY;
        }
        return State.BATTERY_SAVING;
    }

    public OffTheGridLocationSettingStateProvider(isGeofencesEnabledFromEnvironmentlambda1 isgeofencesenabledfromenvironmentlambda1, ConfigurationManager configurationManager) {
        this.write = isgeofencesenabledfromenvironmentlambda1;
        this.serializer = configurationManager;
    }
}
