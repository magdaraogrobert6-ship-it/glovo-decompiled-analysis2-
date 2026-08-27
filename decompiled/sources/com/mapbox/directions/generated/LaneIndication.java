package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum LaneIndication {
    Unknown((byte) 0),
    Straight((byte) 1),
    Left((byte) 2),
    Right((byte) 3),
    SlightLeft((byte) 4),
    SlightRight((byte) 5),
    SharpLeft((byte) 6),
    SharpRight((byte) 7),
    Uturn((byte) 8),
    None((byte) 9);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LaneIndication fromByteOrThrow(byte b) {
            if (b == 0) {
                return LaneIndication.Unknown;
            }
            if (b == 1) {
                return LaneIndication.Straight;
            }
            if (b == 2) {
                return LaneIndication.Left;
            }
            if (b == 3) {
                return LaneIndication.Right;
            }
            if (b == 4) {
                return LaneIndication.SlightLeft;
            }
            if (b == 5) {
                return LaneIndication.SlightRight;
            }
            if (b == 6) {
                return LaneIndication.SharpLeft;
            }
            if (b == 7) {
                return LaneIndication.SharpRight;
            }
            if (b == 8) {
                return LaneIndication.Uturn;
            }
            if (b == 9) {
                return LaneIndication.None;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown LaneIndication value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    LaneIndication(byte b) {
        this.byteValue = b;
    }
}
