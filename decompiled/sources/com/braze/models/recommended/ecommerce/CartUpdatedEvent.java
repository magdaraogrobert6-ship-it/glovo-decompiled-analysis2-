package com.braze.models.recommended.ecommerce;

import com.braze.models.outgoing.BrazeProperties;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public final class CartUpdatedEvent extends EcommerceEvent {
    private final CartUpdatedAction action;
    private final String cartId;
    private final String eventName;

    public final CartUpdatedAction getAction() {
        return this.action;
    }

    public final String getCartId() {
        return this.cartId;
    }

    @Override // com.braze.models.recommended.RecommendedEvent
    public String getEventName() {
        return this.eventName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartUpdatedEvent(String str, String str2, String str3, Double d, List<EcommerceProduct> list, BrazeProperties brazeProperties, CartUpdatedAction cartUpdatedAction) {
        super(str2, str3, d, list, brazeProperties);
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        cartUpdatedAction.getClass();
        this.cartId = str;
        this.action = cartUpdatedAction;
        this.eventName = "ecommerce.cart_updated";
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str) || str.length() > 255) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("cartId must be non-blank and at most 255 characters.");
            throw null;
        }
        if (cartUpdatedAction == CartUpdatedAction.REPLACE && d == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("totalValue is required when action is replace or omitted.");
            throw null;
        }
    }

    public /* synthetic */ CartUpdatedEvent(String str, String str2, String str3, Double d, List list, BrazeProperties brazeProperties, CartUpdatedAction cartUpdatedAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : d, list, (i & 32) != 0 ? null : brazeProperties, (i & 64) != 0 ? CartUpdatedAction.REPLACE : cartUpdatedAction);
    }
}
