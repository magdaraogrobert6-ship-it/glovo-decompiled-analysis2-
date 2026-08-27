package com.roadrunner.common.data.api;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecuteDatabaseRequest$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    public final /* synthetic */ ExecuteDatabaseRequest read;
    public /* synthetic */ Object serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteDatabaseRequest$invoke$1(ExecuteDatabaseRequest executeDatabaseRequest, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = executeDatabaseRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.serializer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM4876invokegIAlus = this.read.m4876invokegIAlus(null, this);
        if (objM4876invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = IconCompatParcelizer + 45;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objM4876invokegIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4876invokegIAlus);
        int i4 = RemoteActionCompatParcelizer + 49;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
        return onitemdismiss;
    }
}
