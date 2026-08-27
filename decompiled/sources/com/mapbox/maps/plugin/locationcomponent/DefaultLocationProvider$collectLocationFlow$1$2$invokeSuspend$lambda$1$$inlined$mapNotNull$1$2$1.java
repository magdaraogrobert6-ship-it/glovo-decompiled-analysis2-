package com.mapbox.maps.plugin.locationcomponent;

import com.roadrunner.delivery.accept.earnings.domain.ObserveMultiplier$invoke$$inlined$map$1$2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ObserveMultiplier$invoke$$inlined$map$1$2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1(ObserveMultiplier$invoke$$inlined$map$1$2 observeMultiplier$invoke$$inlined$map$1$2, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.this$0 = observeMultiplier$invoke$$inlined$map$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
