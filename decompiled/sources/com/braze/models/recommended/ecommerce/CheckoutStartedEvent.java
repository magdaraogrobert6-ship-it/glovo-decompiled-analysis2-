package com.braze.models.recommended.ecommerce;

import com.braze.models.outgoing.BrazeProperties;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public final class CheckoutStartedEvent extends EcommerceEvent {
    private final String cartId;
    private final String checkoutId;
    private final String eventName;

    public final String getCartId() {
        return this.cartId;
    }

    public final String getCheckoutId() {
        return this.checkoutId;
    }

    @Override // com.braze.models.recommended.RecommendedEvent
    public String getEventName() {
        return this.eventName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutStartedEvent(String str, String str2, String str3, double d, List<EcommerceProduct> list, String str4, BrazeProperties brazeProperties) {
        super(str2, str3, Double.valueOf(d), list, brazeProperties);
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.checkoutId = str;
        this.cartId = str4;
        this.eventName = "ecommerce.checkout_started";
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) || str.length() > 255) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("checkoutId must be non-blank and at most 255 characters.");
            throw null;
        }
        if (str4 != null) {
            if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str4) || str4.length() > 255) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("cartId must be non-blank and at most 255 characters.");
                throw null;
            }
        }
    }

    public /* synthetic */ CheckoutStartedEvent(String str, String str2, String str3, double d, List list, String str4, BrazeProperties brazeProperties, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d, list, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : brazeProperties);
    }
}
