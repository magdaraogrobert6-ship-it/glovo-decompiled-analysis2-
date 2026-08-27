package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum TollCollectionType {
    Unknown((byte) 0),
    TollBooth((byte) 1),
    TollGantry((byte) 2);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TollCollectionType fromByteOrThrow(byte b) {
            if (b == 0) {
                return TollCollectionType.Unknown;
            }
            if (b == 1) {
                return TollCollectionType.TollBooth;
            }
            if (b == 2) {
                return TollCollectionType.TollGantry;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown TollCollectionType value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    TollCollectionType(byte b) {
        this.byteValue = b;
    }
}
