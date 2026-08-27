package com.roadrunner.home.state.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeRepositoryImpl$processGarnet$1 extends ContinuationImpl {
    private static int read = 1;
    private static int serializer;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ HomeRepositoryImpl RemoteActionCompatParcelizer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepositoryImpl$processGarnet$1(HomeRepositoryImpl homeRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = homeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 61;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM4973processGarnetgIAlus = this.RemoteActionCompatParcelizer.m4973processGarnetgIAlus(null, this);
        if (objM4973processGarnetgIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4973processGarnetgIAlus);
        }
        int i4 = read;
        int i5 = i4 + 55;
        serializer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 59;
        serializer = i7 % Fields.SpotShadowColor;
        if (i7 % 2 == 0) {
            return objM4973processGarnetgIAlus;
        }
        obj2.hashCode();
        throw null;
    }
}
