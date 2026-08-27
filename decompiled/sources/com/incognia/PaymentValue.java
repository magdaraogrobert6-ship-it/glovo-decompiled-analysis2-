package com.incognia;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class PaymentValue {
    private final double amount;
    private final String currency;
    private final Double discountAmount;
    private final Integer installments;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private double amount;
        private String currency;
        private Double discountAmount;
        private Integer installments;

        public final Builder amount(double d) {
            this.amount = d;
            return this;
        }

        public final Builder currency(String str) {
            this.currency = str;
            return this;
        }

        public final Builder discountAmount(Double d) {
            this.discountAmount = d;
            return this;
        }

        public final Builder installments(Integer num) {
            this.installments = num;
            return this;
        }

        public final PaymentValue build() {
            return new PaymentValue(this.amount, this.currency, this.installments, this.discountAmount);
        }

        public Builder(double d) {
            this.amount = d;
        }
    }

    public final double component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final Integer component3() {
        return this.installments;
    }

    public final Double component4() {
        return this.discountAmount;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getDiscountAmount() {
        return this.discountAmount;
    }

    public final Integer getInstallments() {
        return this.installments;
    }

    public final PaymentValue copy(double d, String str, Integer num, Double d2) {
        return new PaymentValue(d, str, num, d2);
    }

    public int hashCode() {
        int iHashCode = Double.hashCode(this.amount);
        String str = this.currency;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.installments;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Double d = this.discountAmount;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (d != null ? d.hashCode() : 0);
    }

    public static /* synthetic */ PaymentValue copy$default(PaymentValue paymentValue, double d, String str, Integer num, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = paymentValue.amount;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            str = paymentValue.currency;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            num = paymentValue.installments;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            d2 = paymentValue.discountAmount;
        }
        return paymentValue.copy(d3, str2, num2, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentValue)) {
            return false;
        }
        PaymentValue paymentValue = (PaymentValue) obj;
        if (Double.compare(this.amount, paymentValue.amount) != 0) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currency, paymentValue.currency}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.installments, paymentValue.installments}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.discountAmount, paymentValue.discountAmount}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "PaymentValue(amount=" + this.amount + ", currency=" + this.currency + ", installments=" + this.installments + ", discountAmount=" + this.discountAmount + ')';
    }

    public /* synthetic */ PaymentValue(double d, String str, Integer num, Double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : d2);
    }

    public PaymentValue(double d, String str) {
        this(d, str, null, null, 12, null);
    }

    public PaymentValue(double d, String str, Integer num) {
        this(d, str, num, null, 8, null);
    }

    public PaymentValue(double d, String str, Integer num, Double d2) {
        this.amount = d;
        this.currency = str;
        this.installments = num;
        this.discountAmount = d2;
    }

    public PaymentValue(double d) {
        this(d, null, null, null, 14, null);
    }
}
