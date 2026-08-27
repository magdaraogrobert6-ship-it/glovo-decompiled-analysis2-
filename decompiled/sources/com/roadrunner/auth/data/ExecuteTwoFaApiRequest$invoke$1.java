package com.roadrunner.auth.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecuteTwoFaApiRequest$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 1;
    private static int serializer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ ExecuteTwoFaApiRequest read;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteTwoFaApiRequest$invoke$1(ExecuteTwoFaApiRequest executeTwoFaApiRequest, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = executeTwoFaApiRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM4863invokegIAlus = this.read.m4863invokegIAlus(null, this);
        if (objM4863invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4863invokegIAlus);
        }
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 65;
        serializer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 15;
        serializer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return objM4863invokegIAlus;
        }
        obj2.hashCode();
        throw null;
    }
}
