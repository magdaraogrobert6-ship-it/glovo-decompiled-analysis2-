package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum MergingAreaType {
    Unknown((byte) 0),
    FromLeft((byte) 1),
    FromRight((byte) 2),
    FromBothSides((byte) 3);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MergingAreaType fromByteOrThrow(byte b) {
            if (b == 0) {
                return MergingAreaType.Unknown;
            }
            if (b == 1) {
                return MergingAreaType.FromLeft;
            }
            if (b == 2) {
                return MergingAreaType.FromRight;
            }
            if (b == 3) {
                return MergingAreaType.FromBothSides;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown MergingAreaType value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    MergingAreaType(byte b) {
        this.byteValue = b;
    }
}
