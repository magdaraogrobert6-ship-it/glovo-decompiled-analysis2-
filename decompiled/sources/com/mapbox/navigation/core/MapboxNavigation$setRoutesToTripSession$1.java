package com.mapbox.navigation.core;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigation$setRoutesToTripSession$1 extends ContinuationImpl {
    public MapboxNavigation L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MapboxNavigation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxNavigation$setRoutesToTripSession$1(MapboxNavigation mapboxNavigation, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mapboxNavigation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MapboxNavigation.access$setRoutesToTripSession(this.this$0, null, null, this);
    }
}
