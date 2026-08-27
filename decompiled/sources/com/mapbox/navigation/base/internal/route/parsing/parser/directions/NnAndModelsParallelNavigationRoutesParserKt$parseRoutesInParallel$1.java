package com.mapbox.navigation.base.internal.route.parsing.parser.directions;

import com.google.android.gms.internal.mlkit_vision_common.zzlq;
import com.mapbox.navigation.core.routerefresh.MapboxHistoryRecorderWrapper;
import com.mapbox.navigation.utils.internal.Time$SystemClockImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.ShortNewsContentCardView;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes2.dex */
public final class NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1 extends ContinuationImpl {
    public Time$SystemClockImpl L$0;
    public MapboxHistoryRecorderWrapper L$1;
    public String L$2;
    public int label;
    public /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object routesInParallel = zzlq.parseRoutesInParallel(null, 0L, null, null, null, null, null, null, null, null, null, this);
        return routesInParallel == CoroutineSingletons.COROUTINE_SUSPENDED ? routesInParallel : new onItemDismiss(routesInParallel);
    }

    public NnAndModelsParallelNavigationRoutesParserKt$parseRoutesInParallel$1(ShortNewsContentCardView shortNewsContentCardView) {
        super(shortNewsContentCardView);
    }
}
