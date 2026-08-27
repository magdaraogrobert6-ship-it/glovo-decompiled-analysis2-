package com.braze.models.recommended.ecommerce;

import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.models.outgoing.BrazeProperties;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public final class EcommerceProduct {
    private final String imageUrl;
    private final BrazeProperties metadata;
    private final double price;
    private final String productId;
    private final String productName;
    private final String productUrl;
    private final long quantity;
    private final String variantId;

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.productName;
    }

    public final String component3() {
        return this.variantId;
    }

    public final double component4() {
        return this.price;
    }

    public final long component5() {
        return this.quantity;
    }

    public final String component6() {
        return this.imageUrl;
    }

    public final String component7() {
        return this.productUrl;
    }

    public final BrazeProperties component8() {
        return this.metadata;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final BrazeProperties getMetadata() {
        return this.metadata;
    }

    public final double getPrice() {
        return this.price;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final String getProductUrl() {
        return this.productUrl;
    }

    public final long getQuantity() {
        return this.quantity;
    }

    public final String getVariantId() {
        return this.variantId;
    }

    public int hashCode() {
        int iM = d$$ExternalSyntheticOutline0.m(r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.price, af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.productId.hashCode() * 31, 31, this.productName), 31, this.variantId), 31), 31, this.quantity);
        String str = this.imageUrl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.productUrl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        BrazeProperties brazeProperties = this.metadata;
        return ((((iM + iHashCode) * 31) + iHashCode2) * 31) + (brazeProperties != null ? brazeProperties.hashCode() : 0);
    }

    public String toString() {
        String str = this.productId;
        String str2 = this.productName;
        String str3 = this.variantId;
        double d = this.price;
        long j = this.quantity;
        String str4 = this.imageUrl;
        String str5 = this.productUrl;
        BrazeProperties brazeProperties = this.metadata;
        StringBuilder sbM = c8$$ExternalSyntheticOutline0.m("EcommerceProduct(productId=", str, ", productName=", str2, ", variantId=");
        sbM.append(str3);
        sbM.append(", price=");
        sbM.append(d);
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write(sbM, ", quantity=", j, ", imageUrl=");
        c8$$ExternalSyntheticOutline0.m(sbM, str4, ", productUrl=", str5, ", metadata=");
        sbM.append(brazeProperties);
        sbM.append(")");
        return sbM.toString();
    }

    public EcommerceProduct(String str, String str2, String str3, double d, long j, String str4, String str5, BrazeProperties brazeProperties) {
        af$$ExternalSyntheticOutline0.m3978m(str, str2, str3);
        this.productId = str;
        this.productName = str2;
        this.variantId = str3;
        this.price = d;
        this.quantity = j;
        this.imageUrl = str4;
        this.productUrl = str5;
        this.metadata = brazeProperties;
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) || str.length() > 255) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("productId must be non-blank and at most 255 characters.");
            throw null;
        }
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2) || str2.length() > 255) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("productName must be non-blank and at most 255 characters.");
            throw null;
        }
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str3) || str3.length() > 255) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("variantId must be non-blank and at most 255 characters.");
            throw null;
        }
        if (d < 0.0d) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("price must be non-negative.");
            throw null;
        }
        if (j < 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("quantity must be non-negative.");
            throw null;
        }
        if (str4 != null && (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4) || str4.length() > 255)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("imageUrl must be non-blank and at most 255 characters.");
            throw null;
        }
        if (str5 != null) {
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str5) || str5.length() > 255) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("productUrl must be non-blank and at most 255 characters.");
                throw null;
            }
        }
    }

    public final EcommerceProduct copy(String str, String str2, String str3, double d, long j, String str4, String str5, BrazeProperties brazeProperties) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new EcommerceProduct(str, str2, str3, d, j, str4, str5, brazeProperties);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcommerceProduct)) {
            return false;
        }
        EcommerceProduct ecommerceProduct = (EcommerceProduct) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.productId, ecommerceProduct.productId}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.productName, ecommerceProduct.productName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variantId, ecommerceProduct.variantId}, getCieXyz.write())).booleanValue() || Double.compare(this.price, ecommerceProduct.price) != 0 || this.quantity != ecommerceProduct.quantity) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.imageUrl, ecommerceProduct.imageUrl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.productUrl, ecommerceProduct.productUrl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.metadata, ecommerceProduct.metadata}, getCieXyz.write())).booleanValue();
    }

    public /* synthetic */ EcommerceProduct(String str, String str2, String str3, double d, long j, String str4, String str5, BrazeProperties brazeProperties, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d, j, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & Fields.SpotShadowColor) != 0 ? null : brazeProperties);
    }
}
