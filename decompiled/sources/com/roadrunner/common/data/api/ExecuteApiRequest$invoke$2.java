package com.roadrunner.common.data.api;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecuteApiRequest$invoke$2 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ ExecuteApiRequest RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteApiRequest$invoke$2(ExecuteApiRequest executeApiRequest, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = executeApiRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM4874invoke0E7RQCE = this.RemoteActionCompatParcelizer.m4874invoke0E7RQCE(null, null, this);
        if (objM4874invoke0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = write + 75;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objM4874invoke0E7RQCE;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4874invoke0E7RQCE);
        int i4 = write + 37;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}
