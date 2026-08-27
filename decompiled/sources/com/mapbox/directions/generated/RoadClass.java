package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum RoadClass {
    Unknown((byte) 0),
    Toll((byte) 1),
    Ferry((byte) 2),
    Restricted((byte) 3),
    Motorway((byte) 4),
    Tunnel((byte) 5);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RoadClass fromByteOrThrow(byte b) {
            if (b == 0) {
                return RoadClass.Unknown;
            }
            if (b == 1) {
                return RoadClass.Toll;
            }
            if (b == 2) {
                return RoadClass.Ferry;
            }
            if (b == 3) {
                return RoadClass.Restricted;
            }
            if (b == 4) {
                return RoadClass.Motorway;
            }
            if (b == 5) {
                return RoadClass.Tunnel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown RoadClass value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    RoadClass(byte b) {
        this.byteValue = b;
    }
}
