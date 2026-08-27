package com.incognia;

import androidx.compose.ui.graphics.Fields;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
public final class PaymentEvent {
    private final String accountId;
    private final List<PaymentAddress> addresses;
    private final String externalId;
    private final EventLocation location;
    private final PaymentCoupon paymentCoupon;
    private final List<PaymentMethod> paymentMethods;
    private final PaymentValue paymentValue;
    private final EventProperties properties;
    private final String status;
    private final String storeId;
    private final String tag;

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private String accountId = "";
        private List<PaymentAddress> addresses;
        private String externalId;
        private EventLocation location;
        private PaymentCoupon paymentCoupon;
        private List<PaymentMethod> paymentMethods;
        private PaymentValue paymentValue;
        private EventProperties properties;
        private String status;
        private String storeId;
        private String tag;

        public final Builder accountId(String str) {
            this.accountId = str;
            return this;
        }

        public final Builder addresses(List<PaymentAddress> list) {
            this.addresses = list;
            return this;
        }

        public final Builder externalId(String str) {
            this.externalId = str;
            return this;
        }

        public final Builder location(EventLocation eventLocation) {
            this.location = eventLocation;
            return this;
        }

        public final Builder paymentCoupon(PaymentCoupon paymentCoupon) {
            this.paymentCoupon = paymentCoupon;
            return this;
        }

        public final Builder paymentMethods(List<PaymentMethod> list) {
            this.paymentMethods = list;
            return this;
        }

        public final Builder paymentValue(PaymentValue paymentValue) {
            this.paymentValue = paymentValue;
            return this;
        }

        public final Builder properties(EventProperties eventProperties) {
            this.properties = eventProperties;
            return this;
        }

        public final Builder status(String str) {
            this.status = str;
            return this;
        }

        public final Builder storeId(String str) {
            this.storeId = str;
            return this;
        }

        public final Builder tag(String str) {
            this.tag = str;
            return this;
        }

        public final PaymentEvent build() {
            return new PaymentEvent(this.accountId, this.externalId, this.location, this.addresses, this.paymentValue, this.paymentCoupon, this.paymentMethods, this.storeId, this.tag, this.properties, this.status);
        }
    }

    public final String component1() {
        return this.accountId;
    }

    public final EventProperties component10() {
        return this.properties;
    }

    public final String component11() {
        return this.status;
    }

    public final String component2() {
        return this.externalId;
    }

    public final EventLocation component3() {
        return this.location;
    }

    public final List<PaymentAddress> component4() {
        return this.addresses;
    }

    public final PaymentValue component5() {
        return this.paymentValue;
    }

    public final PaymentCoupon component6() {
        return this.paymentCoupon;
    }

    public final List<PaymentMethod> component7() {
        return this.paymentMethods;
    }

    public final String component8() {
        return this.storeId;
    }

    public final String component9() {
        return this.tag;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final List<PaymentAddress> getAddresses() {
        return this.addresses;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final EventLocation getLocation() {
        return this.location;
    }

    public final PaymentCoupon getPaymentCoupon() {
        return this.paymentCoupon;
    }

    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final PaymentValue getPaymentValue() {
        return this.paymentValue;
    }

    public final EventProperties getProperties() {
        return this.properties;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getStoreId() {
        return this.storeId;
    }

    public final String getTag() {
        return this.tag;
    }

    public final PaymentEvent copy(String str, String str2, EventLocation eventLocation, List<PaymentAddress> list, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List<PaymentMethod> list2, String str3, String str4, EventProperties eventProperties, String str5) {
        return new PaymentEvent(str, str2, eventLocation, list, paymentValue, paymentCoupon, list2, str3, str4, eventProperties, str5);
    }

    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        String str = this.externalId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        EventLocation eventLocation = this.location;
        int iHashCode3 = eventLocation == null ? 0 : eventLocation.hashCode();
        List<PaymentAddress> list = this.addresses;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        PaymentValue paymentValue = this.paymentValue;
        int iHashCode5 = paymentValue == null ? 0 : paymentValue.hashCode();
        PaymentCoupon paymentCoupon = this.paymentCoupon;
        int iHashCode6 = paymentCoupon == null ? 0 : paymentCoupon.hashCode();
        List<PaymentMethod> list2 = this.paymentMethods;
        int iHashCode7 = list2 == null ? 0 : list2.hashCode();
        String str2 = this.storeId;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tag;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        EventProperties eventProperties = this.properties;
        int iHashCode10 = eventProperties == null ? 0 : eventProperties.hashCode();
        String str4 = this.status;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentEvent)) {
            return false;
        }
        PaymentEvent paymentEvent = (PaymentEvent) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accountId, paymentEvent.accountId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.externalId, paymentEvent.externalId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.location, paymentEvent.location}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.addresses, paymentEvent.addresses}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentValue, paymentEvent.paymentValue}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentCoupon, paymentEvent.paymentCoupon}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentMethods, paymentEvent.paymentMethods}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.storeId, paymentEvent.storeId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tag, paymentEvent.tag}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.properties, paymentEvent.properties}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.status, paymentEvent.status}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PaymentEvent(accountId=");
        sb.append(this.accountId);
        sb.append(", externalId=");
        sb.append(this.externalId);
        sb.append(", location=");
        sb.append(this.location);
        sb.append(", addresses=");
        sb.append(this.addresses);
        sb.append(", paymentValue=");
        sb.append(this.paymentValue);
        sb.append(", paymentCoupon=");
        sb.append(this.paymentCoupon);
        sb.append(", paymentMethods=");
        sb.append(this.paymentMethods);
        sb.append(", storeId=");
        sb.append(this.storeId);
        sb.append(", tag=");
        sb.append(this.tag);
        sb.append(", properties=");
        sb.append(this.properties);
        sb.append(", status=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.status, ')');
    }

    public /* synthetic */ PaymentEvent(String str, String str2, EventLocation eventLocation, List list, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List list2, String str3, String str4, EventProperties eventProperties, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : eventLocation, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : paymentValue, (i & 32) != 0 ? null : paymentCoupon, (i & 64) != 0 ? null : list2, (i & Fields.SpotShadowColor) != 0 ? null : str3, (i & Fields.RotationX) != 0 ? null : str4, (i & Fields.RotationY) != 0 ? null : eventProperties, (i & Fields.RotationZ) == 0 ? str5 : null);
    }

    public PaymentEvent(String str, String str2, EventLocation eventLocation, List<PaymentAddress> list, PaymentValue paymentValue, PaymentCoupon paymentCoupon, List<PaymentMethod> list2, String str3, String str4, EventProperties eventProperties, String str5) {
        this.accountId = str;
        this.externalId = str2;
        this.location = eventLocation;
        this.addresses = list;
        this.paymentValue = paymentValue;
        this.paymentCoupon = paymentCoupon;
        this.paymentMethods = list2;
        this.storeId = str3;
        this.tag = str4;
        this.properties = eventProperties;
        this.status = str5;
    }
}
