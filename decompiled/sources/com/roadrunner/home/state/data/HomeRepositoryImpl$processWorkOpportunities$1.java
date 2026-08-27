package com.roadrunner.home.state.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeRepositoryImpl$processWorkOpportunities$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ HomeRepositoryImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeRepositoryImpl$processWorkOpportunities$1(HomeRepositoryImpl homeRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = homeRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM4978processWorkOpportunitiesgIAlus = this.serializer.m4978processWorkOpportunitiesgIAlus(null, this);
        if (objM4978processWorkOpportunitiesgIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4978processWorkOpportunitiesgIAlus);
        }
        int i4 = IconCompatParcelizer + 29;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return objM4978processWorkOpportunitiesgIAlus;
        }
        obj2.hashCode();
        throw null;
    }
}
