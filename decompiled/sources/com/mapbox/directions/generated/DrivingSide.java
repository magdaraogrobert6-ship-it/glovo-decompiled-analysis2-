package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum DrivingSide {
    Unknown((byte) 0),
    Left((byte) 1),
    Right((byte) 2);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DrivingSide fromByteOrThrow(byte b) {
            if (b == 0) {
                return DrivingSide.Unknown;
            }
            if (b == 1) {
                return DrivingSide.Left;
            }
            if (b == 2) {
                return DrivingSide.Right;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown DrivingSide value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    DrivingSide(byte b) {
        this.byteValue = b;
    }
}
