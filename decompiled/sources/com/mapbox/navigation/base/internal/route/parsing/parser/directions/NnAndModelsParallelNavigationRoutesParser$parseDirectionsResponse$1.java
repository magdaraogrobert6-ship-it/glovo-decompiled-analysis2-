package com.mapbox.navigation.base.internal.route.parsing.parser.directions;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes2.dex */
public final class NnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ NnAndModelsParallelNavigationRoutesParser this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NnAndModelsParallelNavigationRoutesParser$parseDirectionsResponse$1(NnAndModelsParallelNavigationRoutesParser nnAndModelsParallelNavigationRoutesParser, ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
        this.this$0 = nnAndModelsParallelNavigationRoutesParser;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo4782parseDirectionsResponsegIAlus = this.this$0.mo4782parseDirectionsResponsegIAlus(null, this);
        return objMo4782parseDirectionsResponsegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo4782parseDirectionsResponsegIAlus : new onItemDismiss(objMo4782parseDirectionsResponsegIAlus);
    }
}
