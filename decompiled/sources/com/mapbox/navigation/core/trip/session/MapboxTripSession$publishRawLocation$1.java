package com.mapbox.navigation.core.trip.session;

import com.mapbox.common.location.Location;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxTripSession$publishRawLocation$1 extends ContinuationImpl {
    public int I$0;
    public long J$0;
    public Location L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MapboxTripSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxTripSession$publishRawLocation$1(MapboxTripSession mapboxTripSession, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = mapboxTripSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MapboxTripSession.access$publishRawLocation(this.this$0, null, this);
    }
}
