package com.braze.models.recommended.ecommerce;

import androidx.compose.ui.graphics.Fields;
import com.braze.models.outgoing.BrazeProperties;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public final class OrderPlacedEvent extends EcommerceEvent {
    private final String cartId;
    private final List<Object> discounts;
    private final String eventName;
    private final String orderId;
    private final Double totalDiscounts;

    public final String getCartId() {
        return this.cartId;
    }

    public final List<Object> getDiscounts() {
        return this.discounts;
    }

    @Override // com.braze.models.recommended.RecommendedEvent
    public String getEventName() {
        return this.eventName;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final Double getTotalDiscounts() {
        return this.totalDiscounts;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderPlacedEvent(String str, String str2, String str3, double d, List<EcommerceProduct> list, String str4, Double d2, List<? extends Object> list2, BrazeProperties brazeProperties) {
        super(str2, str3, Double.valueOf(d), list, brazeProperties);
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.orderId = str;
        this.cartId = str4;
        this.totalDiscounts = d2;
        this.discounts = list2;
        this.eventName = "ecommerce.order_placed";
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) || str.length() > 255) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("orderId must be non-blank and at most 255 characters.");
            throw null;
        }
        if (str4 != null && (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4) || str4.length() > 255)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("cartId must be non-blank and at most 255 characters.");
            throw null;
        }
        if (d2 == null || d2.doubleValue() >= 0.0d) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("totalDiscounts must be non-negative.");
        throw null;
    }

    public /* synthetic */ OrderPlacedEvent(String str, String str2, String str3, double d, List list, String str4, Double d2, List list2, BrazeProperties brazeProperties, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d, list, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : d2, (i & Fields.SpotShadowColor) != 0 ? null : list2, (i & Fields.RotationX) != 0 ? null : brazeProperties);
    }
}
