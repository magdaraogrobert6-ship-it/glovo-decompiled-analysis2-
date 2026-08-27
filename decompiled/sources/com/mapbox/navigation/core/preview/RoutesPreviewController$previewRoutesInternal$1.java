package com.mapbox.navigation.core.preview;

import com.airbnb.lottie.parser.DropShadowEffect;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class RoutesPreviewController$previewRoutesInternal$1 extends ContinuationImpl {
    public DropShadowEffect L$0;
    public List L$1;
    public DropShadowEffect L$2;
    public List L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DropShadowEffect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutesPreviewController$previewRoutesInternal$1(DropShadowEffect dropShadowEffect, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dropShadowEffect;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DropShadowEffect.access$previewRoutesInternal(this.this$0, null, 0, this);
    }
}
