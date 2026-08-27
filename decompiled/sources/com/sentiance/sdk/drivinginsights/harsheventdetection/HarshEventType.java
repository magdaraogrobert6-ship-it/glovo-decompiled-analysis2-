package com.sentiance.sdk.drivinginsights.harsheventdetection;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.setUpGeofenceslambda1;

/* JADX INFO: loaded from: classes4.dex */
public enum HarshEventType {
    NONE(0),
    ACCELERATION(1),
    BRAKING(2),
    TURN(3);

    public static final read Companion = new read(null);
    private final int modelOutputValue;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class read {
        public read(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public final int getModelOutputValue() {
        return this.modelOutputValue;
    }

    public final boolean isHarshEvent() {
        return this.modelOutputValue != NONE.modelOutputValue;
    }

    public final byte toEventConstant() {
        int i = setUpGeofenceslambda1.IconCompatParcelizer[ordinal()];
        if (i == 1) {
            return (byte) 0;
        }
        if (i == 2) {
            return (byte) 1;
        }
        if (i == 3) {
            return (byte) 2;
        }
        if (i == 4) {
            return (byte) 3;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return (byte) 0;
    }

    HarshEventType(int i) {
        this.modelOutputValue = i;
    }
}
