package com.sentiance.sdk.trip;

import com.sentiance.core.model.thrift.DetectionTrigger;
import com.sentiance.sdk.DontObfuscate;
import o.migrateFeatureFlagStorageToJsonlambda4;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public enum TripType {
    EXTERNAL_TRIP,
    SDK_TRIP,
    ANY;

    public DetectionTrigger getTrigger() {
        int i = migrateFeatureFlagStorageToJsonlambda4.write[ordinal()];
        if (i == 1) {
            return DetectionTrigger.EXTERNAL;
        }
        if (i != 2) {
            return null;
        }
        return DetectionTrigger.SDK;
    }
}
