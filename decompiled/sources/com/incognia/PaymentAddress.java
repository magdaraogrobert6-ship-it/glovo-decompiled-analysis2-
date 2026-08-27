package com.incognia;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class PaymentAddress {
    private static final String BILLING_TYPE = "billing";
    public static final Companion Companion = new Companion(null);
    private static final String HOME_TYPE = "home";
    private static final String SHIPPING_TYPE = "shipping";
    private final EventAddress address;
    private final String type;

    public final String component1() {
        return this.type;
    }

    public final EventAddress component2() {
        return this.address;
    }

    public final EventAddress getAddress() {
        return this.address;
    }

    public final String getType() {
        return this.type;
    }

    public static final PaymentAddress billingAddress(EventAddress eventAddress) {
        return Companion.billingAddress(eventAddress);
    }

    public static final PaymentAddress homeAddress(EventAddress eventAddress) {
        return Companion.homeAddress(eventAddress);
    }

    public static final PaymentAddress shippingAddress(EventAddress eventAddress) {
        return Companion.shippingAddress(eventAddress);
    }

    public final PaymentAddress copy(String str, EventAddress eventAddress) {
        return new PaymentAddress(str, eventAddress);
    }

    public int hashCode() {
        return this.address.hashCode() + (this.type.hashCode() * 31);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PaymentAddress billingAddress(EventAddress eventAddress) {
            return new PaymentAddress(PaymentAddress.BILLING_TYPE, eventAddress);
        }

        public final PaymentAddress homeAddress(EventAddress eventAddress) {
            return new PaymentAddress(PaymentAddress.HOME_TYPE, eventAddress);
        }

        public final PaymentAddress shippingAddress(EventAddress eventAddress) {
            return new PaymentAddress(PaymentAddress.SHIPPING_TYPE, eventAddress);
        }
    }

    public PaymentAddress(String str, EventAddress eventAddress) {
        this.type = str;
        this.address = eventAddress;
    }

    public static /* synthetic */ PaymentAddress copy$default(PaymentAddress paymentAddress, String str, EventAddress eventAddress, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentAddress.type;
        }
        if ((i & 2) != 0) {
            eventAddress = paymentAddress.address;
        }
        return paymentAddress.copy(str, eventAddress);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentAddress)) {
            return false;
        }
        PaymentAddress paymentAddress = (PaymentAddress) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, paymentAddress.type}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, paymentAddress.address}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        return "PaymentAddress(type=" + this.type + ", address=" + this.address + ')';
    }
}
