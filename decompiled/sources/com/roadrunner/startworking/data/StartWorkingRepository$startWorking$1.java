package com.roadrunner.startworking.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class StartWorkingRepository$startWorking$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public int RemoteActionCompatParcelizer;
    public final /* synthetic */ StartWorkingRepository read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartWorkingRepository$startWorking$1(StartWorkingRepository startWorkingRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = startWorkingRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.write = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM5070startWorkinggIAlus = this.read.m5070startWorkinggIAlus(null, this);
        if (objM5070startWorkinggIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            onItemDismiss onitemdismiss = new onItemDismiss(objM5070startWorkinggIAlus);
            int i2 = IconCompatParcelizer + 53;
            serializer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return onitemdismiss;
        }
        int i4 = serializer;
        int i5 = i4 + 105;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        int i7 = i4 + 111;
        IconCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return objM5070startWorkinggIAlus;
    }
}
