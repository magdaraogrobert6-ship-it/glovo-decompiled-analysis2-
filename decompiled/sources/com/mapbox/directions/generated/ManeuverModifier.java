package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum ManeuverModifier {
    Unknown((byte) 0),
    Uturn((byte) 1),
    SharpRight((byte) 2),
    Right((byte) 3),
    SlightRight((byte) 4),
    Straight((byte) 5),
    SlightLeft((byte) 6),
    Left((byte) 7),
    SharpLeft((byte) 8);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ManeuverModifier fromByteOrThrow(byte b) {
            if (b == 0) {
                return ManeuverModifier.Unknown;
            }
            if (b == 1) {
                return ManeuverModifier.Uturn;
            }
            if (b == 2) {
                return ManeuverModifier.SharpRight;
            }
            if (b == 3) {
                return ManeuverModifier.Right;
            }
            if (b == 4) {
                return ManeuverModifier.SlightRight;
            }
            if (b == 5) {
                return ManeuverModifier.Straight;
            }
            if (b == 6) {
                return ManeuverModifier.SlightLeft;
            }
            if (b == 7) {
                return ManeuverModifier.Left;
            }
            if (b == 8) {
                return ManeuverModifier.SharpLeft;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown ManeuverModifier value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    ManeuverModifier(byte b) {
        this.byteValue = b;
    }
}
