package com.braze.models.recommended.ecommerce;

import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.recommended.RecommendedEvent;
import com.braze.support.ValidationUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.DrawableTransformation;
import o.hideCurrentlyDisplayingInAppMessage;

/* JADX INFO: loaded from: classes.dex */
public abstract class EcommerceEvent implements RecommendedEvent {
    private final String currency;
    private final BrazeProperties metadata;
    private final List<EcommerceProduct> products;
    private final String source;
    private final Double totalValue;

    public final String getCurrency() {
        return this.currency;
    }

    public final BrazeProperties getMetadata() {
        return this.metadata;
    }

    public final List<EcommerceProduct> getProducts() {
        return this.products;
    }

    public final String getSource() {
        return this.source;
    }

    public final Double getTotalValue() {
        return this.totalValue;
    }

    public EcommerceEvent(String str, String str2, Double d, List<EcommerceProduct> list, BrazeProperties brazeProperties) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.source = str2;
        this.totalValue = d;
        this.products = list;
        this.metadata = brazeProperties;
        String string = hideCurrentlyDisplayingInAppMessage.read((CharSequence) str).toString();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = string.toUpperCase(locale);
        upperCase.getClass();
        this.currency = upperCase;
        if (!ValidationUtils.INSTANCE.getVALID_CURRENCY_CODES().contains(upperCase)) {
            DrawableTransformation.serializer((Object) "currency must be a valid ISO 4217 code. Received: ".concat(str));
            throw null;
        }
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str2) || str2.length() > 255) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("source must be non-blank and at most 255 characters.");
            throw null;
        }
        if (d != null && d.doubleValue() < 0.0d) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("totalValue must be non-negative.");
            throw null;
        }
        if (list.isEmpty()) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("products must contain at least one item.");
            throw null;
        }
    }

    public /* synthetic */ EcommerceEvent(String str, String str2, Double d, List list, BrazeProperties brazeProperties, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, list, (i & 16) != 0 ? null : brazeProperties);
    }
}
