package com.braze.models.recommended.ecommerce;

import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.braze.models.outgoing.BrazeProperties;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class ProductViewedEvent extends EcommerceEvent {
    private final String eventName;

    @Override // com.braze.models.recommended.RecommendedEvent
    public String getEventName() {
        return this.eventName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductViewedEvent(String str, String str2, String str3, double d, String str4, String str5, String str6, String str7, BrazeProperties brazeProperties) {
        super(str4, str5, Double.valueOf(d), SQLite.IconCompatParcelizer(new EcommerceProduct(str, str2, str3, d, 1L, str6, str7, brazeProperties)), null, 16, null);
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        this.eventName = "ecommerce.product_viewed";
    }

    public /* synthetic */ ProductViewedEvent(String str, String str2, String str3, double d, String str4, String str5, String str6, String str7, BrazeProperties brazeProperties, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d, str4, str5, (i & 64) != 0 ? null : str6, (i & Fields.SpotShadowColor) != 0 ? null : str7, (i & Fields.RotationX) != 0 ? null : brazeProperties);
    }
}
