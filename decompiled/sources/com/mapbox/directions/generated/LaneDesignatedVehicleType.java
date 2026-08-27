package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum LaneDesignatedVehicleType {
    Unknown((byte) 0),
    Bicycle((byte) 1),
    Bus((byte) 2),
    Hov((byte) 3),
    Moped((byte) 4),
    Motorcycle((byte) 5),
    Taxi((byte) 6);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LaneDesignatedVehicleType fromByteOrThrow(byte b) {
            if (b == 0) {
                return LaneDesignatedVehicleType.Unknown;
            }
            if (b == 1) {
                return LaneDesignatedVehicleType.Bicycle;
            }
            if (b == 2) {
                return LaneDesignatedVehicleType.Bus;
            }
            if (b == 3) {
                return LaneDesignatedVehicleType.Hov;
            }
            if (b == 4) {
                return LaneDesignatedVehicleType.Moped;
            }
            if (b == 5) {
                return LaneDesignatedVehicleType.Motorcycle;
            }
            if (b == 6) {
                return LaneDesignatedVehicleType.Taxi;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown LaneDesignatedVehicleType value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    LaneDesignatedVehicleType(byte b) {
        this.byteValue = b;
    }
}
