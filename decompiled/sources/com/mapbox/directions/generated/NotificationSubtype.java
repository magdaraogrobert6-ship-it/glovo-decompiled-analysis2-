package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum NotificationSubtype {
    Unknown((byte) 0),
    MaxHeight((byte) 1),
    MaxWidth((byte) 2),
    MaxWeight((byte) 3),
    Unpaved((byte) 4),
    PointExclusion((byte) 5),
    CountryBorderCrossing((byte) 6),
    StateBorderCrossing((byte) 7),
    EvMinChargeAtChargingStation((byte) 8),
    EvMinChargeAtDestination((byte) 9),
    Tunnel((byte) 10),
    EvInsufficientCharge((byte) 11),
    EvStationUnavailable((byte) 12),
    BatteryPreconditioningRange((byte) 13);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NotificationSubtype fromByteOrThrow(byte b) {
            if (b == 0) {
                return NotificationSubtype.Unknown;
            }
            if (b == 1) {
                return NotificationSubtype.MaxHeight;
            }
            if (b == 2) {
                return NotificationSubtype.MaxWidth;
            }
            if (b == 3) {
                return NotificationSubtype.MaxWeight;
            }
            if (b == 4) {
                return NotificationSubtype.Unpaved;
            }
            if (b == 5) {
                return NotificationSubtype.PointExclusion;
            }
            if (b == 6) {
                return NotificationSubtype.CountryBorderCrossing;
            }
            if (b == 7) {
                return NotificationSubtype.StateBorderCrossing;
            }
            if (b == 8) {
                return NotificationSubtype.EvMinChargeAtChargingStation;
            }
            if (b == 9) {
                return NotificationSubtype.EvMinChargeAtDestination;
            }
            if (b == 10) {
                return NotificationSubtype.Tunnel;
            }
            if (b == 11) {
                return NotificationSubtype.EvInsufficientCharge;
            }
            if (b == 12) {
                return NotificationSubtype.EvStationUnavailable;
            }
            if (b == 13) {
                return NotificationSubtype.BatteryPreconditioningRange;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown NotificationSubtype value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    NotificationSubtype(byte b) {
        this.byteValue = b;
    }
}
