package com.roadrunner.common.data.api;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecuteApiRequest$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public final /* synthetic */ ExecuteApiRequest RemoteActionCompatParcelizer;
    public int read;
    public /* synthetic */ Object write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteApiRequest$invoke$1(ExecuteApiRequest executeApiRequest, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = executeApiRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 119;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.write = obj;
        this.read |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM4875invokegIAlus = this.RemoteActionCompatParcelizer.m4875invokegIAlus(null, this);
        if (objM4875invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4875invokegIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4875invokegIAlus);
        int i4 = IconCompatParcelizer + 107;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return onitemdismiss;
        }
        obj2.hashCode();
        throw null;
    }
}
