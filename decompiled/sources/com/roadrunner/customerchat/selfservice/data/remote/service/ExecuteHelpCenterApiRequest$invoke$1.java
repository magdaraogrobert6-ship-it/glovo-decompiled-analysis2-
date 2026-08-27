package com.roadrunner.customerchat.selfservice.data.remote.service;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecuteHelpCenterApiRequest$invoke$1 extends ContinuationImpl {
    private static int read = 0;
    private static int serializer = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ ExecuteHelpCenterApiRequest RemoteActionCompatParcelizer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteHelpCenterApiRequest$invoke$1(ExecuteHelpCenterApiRequest executeHelpCenterApiRequest, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.RemoteActionCompatParcelizer = executeHelpCenterApiRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 121;
        read = i2 % Fields.SpotShadowColor;
        Object obj2 = null;
        if (i2 % 2 != 0) {
            this.IconCompatParcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            this.RemoteActionCompatParcelizer.m4882invokegIAlus(null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            obj2.hashCode();
            throw null;
        }
        this.IconCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object objM4882invokegIAlus = this.RemoteActionCompatParcelizer.m4882invokegIAlus(null, this);
        if (objM4882invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4882invokegIAlus);
        }
        int i3 = serializer + 71;
        read = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objM4882invokegIAlus;
    }
}
