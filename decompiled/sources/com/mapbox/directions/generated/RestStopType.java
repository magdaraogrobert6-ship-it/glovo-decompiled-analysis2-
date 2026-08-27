package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum RestStopType {
    Unknown((byte) 0),
    RestArea((byte) 1),
    ServiceArea((byte) 2);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RestStopType fromByteOrThrow(byte b) {
            if (b == 0) {
                return RestStopType.Unknown;
            }
            if (b == 1) {
                return RestStopType.RestArea;
            }
            if (b == 2) {
                return RestStopType.ServiceArea;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown RestStopType value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    RestStopType(byte b) {
        this.byteValue = b;
    }
}
