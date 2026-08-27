package com.incognia;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class PaymentMethod {
    public static final String AMERICAN_EXPRESS_BRAND = "amex";
    public static final String APPLE_PAY_TYPE = "apple_pay";
    public static final String ARGENCARD_BRAND = "argencard";
    public static final String CABAL_BRAND = "cabal";
    public static final String CREDIT_CARD_TYPE = "credit_card";
    public static final Companion Companion = new Companion(null);
    public static final String DEBIT_CARD_TYPE = "debit_card";
    public static final String GOOGLE_PAY_TYPE = "google_pay";
    public static final String MASTERCARD_BRAND = "mastercard";
    public static final String MEAL_VOUCHER_TYPE = "meal_voucher";
    public static final String NU_PAY_TYPE = "nu_pay";
    public static final String PIX_TYPE = "pix";
    public static final String TARJETA_NARANJA_BRAND = "tarjeta_naranja";
    public static final String VISA_BRAND = "visa";
    private final String brand;
    private final CardInfo creditCardInfo;
    private final CardInfo debitCardInfo;
    private final String identifier;
    private final String type;

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.identifier;
    }

    public final String component3() {
        return this.brand;
    }

    public final CardInfo component4() {
        return this.creditCardInfo;
    }

    public final CardInfo component5() {
        return this.debitCardInfo;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final CardInfo getCreditCardInfo() {
        return this.creditCardInfo;
    }

    public final CardInfo getDebitCardInfo() {
        return this.debitCardInfo;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getType() {
        return this.type;
    }

    public final PaymentMethod copy(String str, String str2, String str3, CardInfo cardInfo, CardInfo cardInfo2) {
        return new PaymentMethod(str, str2, str3, cardInfo, cardInfo2);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode();
        String str = this.identifier;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.brand;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        CardInfo cardInfo = this.creditCardInfo;
        int iHashCode4 = cardInfo == null ? 0 : cardInfo.hashCode();
        CardInfo cardInfo2 = this.debitCardInfo;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (cardInfo2 != null ? cardInfo2.hashCode() : 0);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, String str2, String str3, CardInfo cardInfo, CardInfo cardInfo2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethod.type;
        }
        if ((i & 2) != 0) {
            str2 = paymentMethod.identifier;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = paymentMethod.brand;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            cardInfo = paymentMethod.creditCardInfo;
        }
        CardInfo cardInfo3 = cardInfo;
        if ((i & 16) != 0) {
            cardInfo2 = paymentMethod.debitCardInfo;
        }
        return paymentMethod.copy(str, str4, str5, cardInfo3, cardInfo2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, paymentMethod.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.identifier, paymentMethod.identifier}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brand, paymentMethod.brand}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.creditCardInfo, paymentMethod.creditCardInfo}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.debitCardInfo, paymentMethod.debitCardInfo}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "PaymentMethod(type=" + this.type + ", identifier=" + this.identifier + ", brand=" + this.brand + ", creditCardInfo=" + this.creditCardInfo + ", debitCardInfo=" + this.debitCardInfo + ')';
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private String brand;
        private CardInfo creditCardInfo;
        private CardInfo debitCardInfo;
        private String identifier;
        private String type;

        public final Builder brand(String str) {
            this.brand = str;
            return this;
        }

        public final Builder creditCardInfo(CardInfo cardInfo) {
            this.creditCardInfo = cardInfo;
            return this;
        }

        public final Builder debitCardInfo(CardInfo cardInfo) {
            this.debitCardInfo = cardInfo;
            return this;
        }

        public final Builder identifier(String str) {
            this.identifier = str;
            return this;
        }

        public final Builder type(String str) {
            this.type = str;
            return this;
        }

        public final PaymentMethod build() {
            String str = this.type;
            if (str == null) {
                str = null;
            }
            return new PaymentMethod(str, this.identifier, this.brand, this.creditCardInfo, this.debitCardInfo);
        }
    }

    public /* synthetic */ PaymentMethod(String str, String str2, String str3, CardInfo cardInfo, CardInfo cardInfo2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : cardInfo, (i & 16) != 0 ? null : cardInfo2);
    }

    public PaymentMethod(String str, String str2, String str3, CardInfo cardInfo, CardInfo cardInfo2) {
        this.type = str;
        this.identifier = str2;
        this.brand = str3;
        this.creditCardInfo = cardInfo;
        this.debitCardInfo = cardInfo2;
    }
}
