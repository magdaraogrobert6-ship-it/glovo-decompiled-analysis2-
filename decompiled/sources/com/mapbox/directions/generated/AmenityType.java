package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum AmenityType {
    Unknown((byte) 0),
    GasStation((byte) 1),
    ElectricChargingStation((byte) 2),
    Toilet((byte) 3),
    Coffee((byte) 4),
    Restaurant((byte) 5),
    Snack((byte) 6),
    Atm((byte) 7),
    Info((byte) 8),
    BabyCare((byte) 9),
    FacilitiesForDisabled((byte) 10),
    Shop((byte) 11),
    Telephone((byte) 12),
    Hotel((byte) 13),
    Hotspring((byte) 14),
    Shower((byte) 15),
    PicnicShelter((byte) 16),
    Post((byte) 17),
    Fax((byte) 18);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AmenityType fromByteOrThrow(byte b) {
            if (b == 0) {
                return AmenityType.Unknown;
            }
            if (b == 1) {
                return AmenityType.GasStation;
            }
            if (b == 2) {
                return AmenityType.ElectricChargingStation;
            }
            if (b == 3) {
                return AmenityType.Toilet;
            }
            if (b == 4) {
                return AmenityType.Coffee;
            }
            if (b == 5) {
                return AmenityType.Restaurant;
            }
            if (b == 6) {
                return AmenityType.Snack;
            }
            if (b == 7) {
                return AmenityType.Atm;
            }
            if (b == 8) {
                return AmenityType.Info;
            }
            if (b == 9) {
                return AmenityType.BabyCare;
            }
            if (b == 10) {
                return AmenityType.FacilitiesForDisabled;
            }
            if (b == 11) {
                return AmenityType.Shop;
            }
            if (b == 12) {
                return AmenityType.Telephone;
            }
            if (b == 13) {
                return AmenityType.Hotel;
            }
            if (b == 14) {
                return AmenityType.Hotspring;
            }
            if (b == 15) {
                return AmenityType.Shower;
            }
            if (b == 16) {
                return AmenityType.PicnicShelter;
            }
            if (b == 17) {
                return AmenityType.Post;
            }
            if (b == 18) {
                return AmenityType.Fax;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown AmenityType value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    AmenityType(byte b) {
        this.byteValue = b;
    }
}
