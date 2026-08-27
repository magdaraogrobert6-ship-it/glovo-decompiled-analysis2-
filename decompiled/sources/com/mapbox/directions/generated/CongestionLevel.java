package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum CongestionLevel {
    Unknown((byte) 0),
    UnknownCongestion((byte) 1),
    Low((byte) 2),
    Moderate((byte) 3),
    Heavy((byte) 4),
    Severe((byte) 5);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CongestionLevel fromByteOrThrow(byte b) {
            if (b == 0) {
                return CongestionLevel.Unknown;
            }
            if (b == 1) {
                return CongestionLevel.UnknownCongestion;
            }
            if (b == 2) {
                return CongestionLevel.Low;
            }
            if (b == 3) {
                return CongestionLevel.Moderate;
            }
            if (b == 4) {
                return CongestionLevel.Heavy;
            }
            if (b == 5) {
                return CongestionLevel.Severe;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown CongestionLevel value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    CongestionLevel(byte b) {
        this.byteValue = b;
    }
}
