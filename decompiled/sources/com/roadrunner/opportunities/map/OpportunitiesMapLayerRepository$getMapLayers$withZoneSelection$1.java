package com.roadrunner.opportunities.map;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.WorkDatabase_Impl;
import o.createFromParcel;
import o.getFailureResponseData;
import o.getWindowAreaDisplayMetrics;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E;
import o.se;
import o.xd;

/* JADX INFO: loaded from: classes3.dex */
public final class OpportunitiesMapLayerRepository$getMapLayers$withZoneSelection$1 extends SuspendLambda implements r8lambdagdus9EWsajL31FKA79xR2Pb0c4E {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read;
    public /* synthetic */ WorkDatabase_Impl IconCompatParcelizer;
    public /* synthetic */ boolean RemoteActionCompatParcelizer;
    public /* synthetic */ getWindowAreaDisplayMetrics serializer;
    public /* synthetic */ onViewAttachedToWindowlambda0 write;

    public OpportunitiesMapLayerRepository$getMapLayers$withZoneSelection$1() {
        super(5, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = this.write;
        boolean z = this.RemoteActionCompatParcelizer;
        WorkDatabase_Impl workDatabase_Impl = this.IconCompatParcelizer;
        getWindowAreaDisplayMetrics getwindowareadisplaymetrics = this.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        xd xdVar = new xd((se) onviewattachedtowindowlambda0.serializer, (getFailureResponseData) onviewattachedtowindowlambda0.write, z, workDatabase_Impl, getwindowareadisplaymetrics);
        int i2 = MediaBrowserCompatMediaItem + 105;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return xdVar;
    }

    @Override // o.r8lambdagdus9EWsajL31FKA79xR2Pb0c4E
    public final Object serializer(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = 2 % 2;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        OpportunitiesMapLayerRepository$getMapLayers$withZoneSelection$1 opportunitiesMapLayerRepository$getMapLayers$withZoneSelection$1 = new OpportunitiesMapLayerRepository$getMapLayers$withZoneSelection$1(5, (ShortNewsContentCardView) obj5);
        opportunitiesMapLayerRepository$getMapLayers$withZoneSelection$1.write = (onViewAttachedToWindowlambda0) obj;
        opportunitiesMapLayerRepository$getMapLayers$withZoneSelection$1.RemoteActionCompatParcelizer = zBooleanValue;
        opportunitiesMapLayerRepository$getMapLayers$withZoneSelection$1.IconCompatParcelizer = (WorkDatabase_Impl) obj3;
        opportunitiesMapLayerRepository$getMapLayers$withZoneSelection$1.serializer = (getWindowAreaDisplayMetrics) obj4;
        Object objInvokeSuspend = opportunitiesMapLayerRepository$getMapLayers$withZoneSelection$1.invokeSuspend(createFromParcel.INSTANCE);
        int i2 = read + 35;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return objInvokeSuspend;
    }

    public OpportunitiesMapLayerRepository$getMapLayers$withZoneSelection$1(int i, ShortNewsContentCardView shortNewsContentCardView) {
        super(i, shortNewsContentCardView);
    }
}
