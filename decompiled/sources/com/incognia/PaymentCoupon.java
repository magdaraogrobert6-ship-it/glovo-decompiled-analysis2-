package com.incognia;

import bo.app.ff$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class PaymentCoupon {
    public static final Companion Companion = new Companion(null);
    public static final String FIXED_VALUE_TYPE = "fixed_value";
    public static final String PERCENT_OFF_TYPE = "percent_off";
    private final String id;
    private final Double maxDiscount;
    private final String name;
    private final String type;
    private final Double value;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private String id;
        private Double maxDiscount;
        private String name;
        private String type;
        private Double value;

        public final Builder id(String str) {
            this.id = str;
            return this;
        }

        public final Builder maxDiscount(Double d) {
            this.maxDiscount = d;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }

        public final Builder type(String str) {
            this.type = str;
            return this;
        }

        public final Builder value(Double d) {
            this.value = d;
            return this;
        }

        public final PaymentCoupon build() {
            String str = this.type;
            if (str == null) {
                str = null;
            }
            return new PaymentCoupon(str, this.value, this.maxDiscount, this.id, this.name);
        }
    }

    public final String component1() {
        return this.type;
    }

    public final Double component2() {
        return this.value;
    }

    public final Double component3() {
        return this.maxDiscount;
    }

    public final String component4() {
        return this.id;
    }

    public final String component5() {
        return this.name;
    }

    public final String getId() {
        return this.id;
    }

    public final Double getMaxDiscount() {
        return this.maxDiscount;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final Double getValue() {
        return this.value;
    }

    public final PaymentCoupon copy(String str, Double d, Double d2, String str2, String str3) {
        return new PaymentCoupon(str, d, d2, str2, str3);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode();
        Double d = this.value;
        int iHashCode2 = d == null ? 0 : d.hashCode();
        Double d2 = this.maxDiscount;
        int iHashCode3 = d2 == null ? 0 : d2.hashCode();
        String str = this.id;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ PaymentCoupon copy$default(PaymentCoupon paymentCoupon, String str, Double d, Double d2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentCoupon.type;
        }
        if ((i & 2) != 0) {
            d = paymentCoupon.value;
        }
        Double d3 = d;
        if ((i & 4) != 0) {
            d2 = paymentCoupon.maxDiscount;
        }
        Double d4 = d2;
        if ((i & 8) != 0) {
            str2 = paymentCoupon.id;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = paymentCoupon.name;
        }
        return paymentCoupon.copy(str, d3, d4, str4, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentCoupon)) {
            return false;
        }
        PaymentCoupon paymentCoupon = (PaymentCoupon) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, paymentCoupon.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, paymentCoupon.value}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.maxDiscount, paymentCoupon.maxDiscount}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, paymentCoupon.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, paymentCoupon.name}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentCoupon(type=");
        sb.append(this.type);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", maxDiscount=");
        sb.append(this.maxDiscount);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", name=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.name, ')');
    }

    public /* synthetic */ PaymentCoupon(String str, Double d, Double d2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : d, (i & 4) != 0 ? null : d2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    public PaymentCoupon(String str, Double d, Double d2, String str2, String str3) {
        this.type = str;
        this.value = d;
        this.maxDiscount = d2;
        this.id = str2;
        this.name = str3;
    }
}
