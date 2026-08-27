package com.mapbox.directions.generated;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public enum LanePaymentMethod {
    Unknown((byte) 0),
    General((byte) 1),
    Etc((byte) 2),
    Etcx((byte) 3),
    Cash((byte) 4),
    ExactCash((byte) 5),
    Coins((byte) 6),
    Notes((byte) 7),
    DebitCards((byte) 8),
    PassCard((byte) 9),
    CreditCards((byte) 10),
    Video((byte) 11),
    Cryptocurrencies((byte) 12),
    App((byte) 13),
    Etc2((byte) 14);

    public static final Companion Companion = new Companion(null);
    private final byte byteValue;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LanePaymentMethod fromByteOrThrow(byte b) {
            if (b == 0) {
                return LanePaymentMethod.Unknown;
            }
            if (b == 1) {
                return LanePaymentMethod.General;
            }
            if (b == 2) {
                return LanePaymentMethod.Etc;
            }
            if (b == 3) {
                return LanePaymentMethod.Etcx;
            }
            if (b == 4) {
                return LanePaymentMethod.Cash;
            }
            if (b == 5) {
                return LanePaymentMethod.ExactCash;
            }
            if (b == 6) {
                return LanePaymentMethod.Coins;
            }
            if (b == 7) {
                return LanePaymentMethod.Notes;
            }
            if (b == 8) {
                return LanePaymentMethod.DebitCards;
            }
            if (b == 9) {
                return LanePaymentMethod.PassCard;
            }
            if (b == 10) {
                return LanePaymentMethod.CreditCards;
            }
            if (b == 11) {
                return LanePaymentMethod.Video;
            }
            if (b == 12) {
                return LanePaymentMethod.Cryptocurrencies;
            }
            if (b == 13) {
                return LanePaymentMethod.App;
            }
            if (b == 14) {
                return LanePaymentMethod.Etc2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(c8$$ExternalSyntheticOutline0.m(b, "Unknown LanePaymentMethod value: "));
            return null;
        }

        private Companion() {
        }
    }

    public final byte getByteValue() {
        return this.byteValue;
    }

    LanePaymentMethod(byte b) {
        this.byteValue = b;
    }
}
