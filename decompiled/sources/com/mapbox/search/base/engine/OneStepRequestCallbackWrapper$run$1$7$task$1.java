package com.mapbox.search.base.engine;

import com.airbnb.lottie.parser.DropShadowEffect;
import com.mapbox.search.base.BaseResponseInfo;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.accessprocessDragStart;
import o.createFromParcel;
import o.onItemDismiss;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes3.dex */
public final class OneStepRequestCallbackWrapper$run$1$7$task$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $index;
    public final /* synthetic */ BaseResponseInfo $responseInfo;
    public final /* synthetic */ List $responseResult;
    public final /* synthetic */ accessprocessDragStart $results;
    public final /* synthetic */ DropShadowEffect this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStepRequestCallbackWrapper$run$1$7$task$1(accessprocessDragStart accessprocessdragstart, int i, List list, DropShadowEffect dropShadowEffect, BaseResponseInfo baseResponseInfo) {
        super(1);
        this.$results = accessprocessdragstart;
        this.$index = i;
        this.$responseResult = list;
        this.this$0 = dropShadowEffect;
        this.$responseInfo = baseResponseInfo;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        onItemDismiss onitemdismiss = new onItemDismiss(((onItemDismiss) obj).IconCompatParcelizer);
        accessprocessDragStart accessprocessdragstart = this.$results;
        accessprocessdragstart.serializer(this.$index, onitemdismiss);
        DropShadowEffect.run$lambda$4$notifyCallbackIfNeeded(accessprocessdragstart, this.$responseResult, this.this$0, this.$responseInfo);
        return createFromParcel.INSTANCE;
    }
}
