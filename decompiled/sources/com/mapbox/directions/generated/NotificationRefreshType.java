package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum NotificationRefreshType {
    Unknown((byte) 0),
    Static((byte) 1),
    Dynamic((byte) 2);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NotificationRefreshType fromByteOrThrow(byte b) {
            if (b == 0) {
                return NotificationRefreshType.Unknown;
            }
            if (b == 1) {
                return NotificationRefreshType.Static;
            }
            if (b == 2) {
                return NotificationRefreshType.Dynamic;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown NotificationRefreshType value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    NotificationRefreshType(byte b) {
        this.byteValue = b;
    }
}
