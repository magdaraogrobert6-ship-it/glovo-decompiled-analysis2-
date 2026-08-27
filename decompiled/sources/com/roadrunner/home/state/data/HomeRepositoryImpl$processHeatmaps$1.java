package com.roadrunner.home.state.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeRepositoryImpl$processHeatmaps$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ HomeRepositoryImpl serializer;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepositoryImpl$processHeatmaps$1(HomeRepositoryImpl homeRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = homeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4974processHeatmapsgIAlus = this.serializer.m4974processHeatmapsgIAlus(null, this);
        if (objM4974processHeatmapsgIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4974processHeatmapsgIAlus);
        }
        int i4 = read + 33;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objM4974processHeatmapsgIAlus;
        }
        throw null;
    }
}
