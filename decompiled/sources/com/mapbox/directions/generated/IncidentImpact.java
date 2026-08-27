package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum IncidentImpact {
    Unknown((byte) 0),
    UnknownImpact((byte) 1),
    Critical((byte) 2),
    Major((byte) 3),
    Minor((byte) 4),
    Low((byte) 5);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IncidentImpact fromByteOrThrow(byte b) {
            if (b == 0) {
                return IncidentImpact.Unknown;
            }
            if (b == 1) {
                return IncidentImpact.UnknownImpact;
            }
            if (b == 2) {
                return IncidentImpact.Critical;
            }
            if (b == 3) {
                return IncidentImpact.Major;
            }
            if (b == 4) {
                return IncidentImpact.Minor;
            }
            if (b == 5) {
                return IncidentImpact.Low;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown IncidentImpact value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    IncidentImpact(byte b) {
        this.byteValue = b;
    }
}
