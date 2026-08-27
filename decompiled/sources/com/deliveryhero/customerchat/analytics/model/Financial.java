package com.deliveryhero.customerchat.analytics.model;

import androidx.compose.ui.text.android.LayoutCompat;
import bo.app.af$$ExternalSyntheticOutline0;
import java.util.Map;
import o.getCieXyz;
import o.getDensityDpi;
import o.getImageLoaderCacheSize;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
@getImageLoaderCacheSize(write = LayoutCompat.DEFAULT_FALLBACK_LINE_SPACING)
public final class Financial {
    private final int compensationValue;
    private final String currencyCode;
    private final Map<String, String> details;
    private final String id;
    private final Map<String, String> paymentMedium;
    private final int refundValue;

    public final String component1() {
        return this.id;
    }

    public final Map<String, String> component2() {
        return this.paymentMedium;
    }

    public final String component3() {
        return this.currencyCode;
    }

    public final int component4() {
        return this.refundValue;
    }

    public final int component5() {
        return this.compensationValue;
    }

    public final Map<String, String> component6() {
        return this.details;
    }

    public final int getCompensationValue() {
        return this.compensationValue;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final Map<String, String> getDetails() {
        return this.details;
    }

    public final String getId() {
        return this.id;
    }

    public final Map<String, String> getPaymentMedium() {
        return this.paymentMedium;
    }

    public final int getRefundValue() {
        return this.refundValue;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode();
        Map<String, String> map = this.paymentMedium;
        int iHashCode2 = map == null ? 0 : map.hashCode();
        String str = this.currencyCode;
        int iM = af$$ExternalSyntheticOutline0.m(this.compensationValue, af$$ExternalSyntheticOutline0.m(this.refundValue, ((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Map<String, String> map2 = this.details;
        return iM + (map2 != null ? map2.hashCode() : 0);
    }

    public Financial(@getDensityDpi(serializer = "id") String str, @getDensityDpi(serializer = "paymentMedium") Map<String, String> map, @getDensityDpi(serializer = "currencyCode") String str2, @getDensityDpi(serializer = "refundValue") int i, @getDensityDpi(serializer = "compensationValue") int i2, @getDensityDpi(serializer = "details") Map<String, String> map2) {
        str.getClass();
        this.id = str;
        this.paymentMedium = map;
        this.currencyCode = str2;
        this.refundValue = i;
        this.compensationValue = i2;
        this.details = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Financial copy$default(Financial financial, String str, Map map, String str2, int i, int i2, Map map2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = financial.id;
        }
        if ((i3 & 2) != 0) {
            map = financial.paymentMedium;
        }
        Map map3 = map;
        if ((i3 & 4) != 0) {
            str2 = financial.currencyCode;
        }
        String str3 = str2;
        if ((i3 & 8) != 0) {
            i = financial.refundValue;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = financial.compensationValue;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            map2 = financial.details;
        }
        return financial.copy(str, map3, str3, i4, i5, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Financial)) {
            return false;
        }
        Financial financial = (Financial) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, financial.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.paymentMedium, financial.paymentMedium}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.currencyCode, financial.currencyCode}, getCieXyz.write())).booleanValue() || this.refundValue != financial.refundValue || this.compensationValue != financial.compensationValue) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.details, financial.details}, getCieXyz.write())).booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Financial(id=");
        sb.append(this.id);
        sb.append(", paymentMedium=");
        sb.append(this.paymentMedium);
        sb.append(", currencyCode=");
        sb.append(this.currencyCode);
        sb.append(", refundValue=");
        sb.append(this.refundValue);
        sb.append(", compensationValue=");
        sb.append(this.compensationValue);
        sb.append(", details=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, (Map) this.details, ')');
    }

    public final Financial copy(@getDensityDpi(serializer = "id") String str, @getDensityDpi(serializer = "paymentMedium") Map<String, String> map, @getDensityDpi(serializer = "currencyCode") String str2, @getDensityDpi(serializer = "refundValue") int i, @getDensityDpi(serializer = "compensationValue") int i2, @getDensityDpi(serializer = "details") Map<String, String> map2) {
        str.getClass();
        return new Financial(str, map, str2, i, i2, map2);
    }
}
