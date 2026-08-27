package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum IncidentType {
    Unknown((byte) 0),
    Accident((byte) 1),
    Congestion((byte) 2),
    Construction((byte) 3),
    DisabledVehicle((byte) 4),
    LaneRestriction((byte) 5),
    MassTransit((byte) 6),
    Miscellaneous((byte) 7),
    OtherNews((byte) 8),
    PlannedEvent((byte) 9),
    RoadClosure((byte) 10),
    RoadHazard((byte) 11),
    Weather((byte) 12);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IncidentType fromByteOrThrow(byte b) {
            if (b == 0) {
                return IncidentType.Unknown;
            }
            if (b == 1) {
                return IncidentType.Accident;
            }
            if (b == 2) {
                return IncidentType.Congestion;
            }
            if (b == 3) {
                return IncidentType.Construction;
            }
            if (b == 4) {
                return IncidentType.DisabledVehicle;
            }
            if (b == 5) {
                return IncidentType.LaneRestriction;
            }
            if (b == 6) {
                return IncidentType.MassTransit;
            }
            if (b == 7) {
                return IncidentType.Miscellaneous;
            }
            if (b == 8) {
                return IncidentType.OtherNews;
            }
            if (b == 9) {
                return IncidentType.PlannedEvent;
            }
            if (b == 10) {
                return IncidentType.RoadClosure;
            }
            if (b == 11) {
                return IncidentType.RoadHazard;
            }
            if (b == 12) {
                return IncidentType.Weather;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown IncidentType value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    IncidentType(byte b) {
        this.byteValue = b;
    }
}
