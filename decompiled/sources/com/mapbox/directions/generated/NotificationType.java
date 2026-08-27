package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum NotificationType {
    Unknown((byte) 0),
    Violation((byte) 1),
    Alert((byte) 2);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NotificationType fromByteOrThrow(byte b) {
            if (b == 0) {
                return NotificationType.Unknown;
            }
            if (b == 1) {
                return NotificationType.Violation;
            }
            if (b == 2) {
                return NotificationType.Alert;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown NotificationType value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    NotificationType(byte b) {
        this.byteValue = b;
    }
}
