package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum TransportMode {
    Unknown((byte) 0),
    Driving((byte) 1),
    Walking((byte) 2),
    Cycling((byte) 3),
    Ferry((byte) 4),
    Train((byte) 5),
    Unaccessible((byte) 6);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TransportMode fromByteOrThrow(byte b) {
            if (b == 0) {
                return TransportMode.Unknown;
            }
            if (b == 1) {
                return TransportMode.Driving;
            }
            if (b == 2) {
                return TransportMode.Walking;
            }
            if (b == 3) {
                return TransportMode.Cycling;
            }
            if (b == 4) {
                return TransportMode.Ferry;
            }
            if (b == 5) {
                return TransportMode.Train;
            }
            if (b == 6) {
                return TransportMode.Unaccessible;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown TransportMode value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    TransportMode(byte b) {
        this.byteValue = b;
    }
}
