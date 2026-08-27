package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum SpeedLimitSign {
    Unknown((byte) 0),
    Mutcd((byte) 1),
    Vienna((byte) 2);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SpeedLimitSign fromByteOrThrow(byte b) {
            if (b == 0) {
                return SpeedLimitSign.Unknown;
            }
            if (b == 1) {
                return SpeedLimitSign.Mutcd;
            }
            if (b == 2) {
                return SpeedLimitSign.Vienna;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown SpeedLimitSign value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    SpeedLimitSign(byte b) {
        this.byteValue = b;
    }
}
