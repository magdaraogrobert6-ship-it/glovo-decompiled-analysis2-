package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum ManeuverType {
    Unknown((byte) 0),
    Turn((byte) 1),
    NewName((byte) 2),
    Depart((byte) 3),
    Arrive((byte) 4),
    Merge((byte) 5),
    OnRamp((byte) 6),
    OffRamp((byte) 7),
    Fork((byte) 8),
    EndOfRoad((byte) 9),
    Continue((byte) 10),
    Roundabout((byte) 11),
    Rotary((byte) 12),
    RoundaboutTurn((byte) 13),
    Notification((byte) 14),
    ExitRoundabout((byte) 15),
    ExitRotary((byte) 16);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ManeuverType fromByteOrThrow(byte b) {
            if (b == 0) {
                return ManeuverType.Unknown;
            }
            if (b == 1) {
                return ManeuverType.Turn;
            }
            if (b == 2) {
                return ManeuverType.NewName;
            }
            if (b == 3) {
                return ManeuverType.Depart;
            }
            if (b == 4) {
                return ManeuverType.Arrive;
            }
            if (b == 5) {
                return ManeuverType.Merge;
            }
            if (b == 6) {
                return ManeuverType.OnRamp;
            }
            if (b == 7) {
                return ManeuverType.OffRamp;
            }
            if (b == 8) {
                return ManeuverType.Fork;
            }
            if (b == 9) {
                return ManeuverType.EndOfRoad;
            }
            if (b == 10) {
                return ManeuverType.Continue;
            }
            if (b == 11) {
                return ManeuverType.Roundabout;
            }
            if (b == 12) {
                return ManeuverType.Rotary;
            }
            if (b == 13) {
                return ManeuverType.RoundaboutTurn;
            }
            if (b == 14) {
                return ManeuverType.Notification;
            }
            if (b == 15) {
                return ManeuverType.ExitRoundabout;
            }
            if (b == 16) {
                return ManeuverType.ExitRotary;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown ManeuverType value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    ManeuverType(byte b) {
        this.byteValue = b;
    }
}
