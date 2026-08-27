package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfServiceCustomerChatRepositoryImpl$sendMessage$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ SelfServiceCustomerChatRepositoryImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfServiceCustomerChatRepositoryImpl$sendMessage$1(SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = selfServiceCustomerChatRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 21;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            this.RemoteActionCompatParcelizer = obj;
            this.read |= Integer.MIN_VALUE;
            this.serializer.m4893sendMessage0E7RQCE(null, null, this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.RemoteActionCompatParcelizer = obj;
        this.read |= Integer.MIN_VALUE;
        Object objM4893sendMessage0E7RQCE = this.serializer.m4893sendMessage0E7RQCE(null, null, this);
        if (objM4893sendMessage0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4893sendMessage0E7RQCE;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4893sendMessage0E7RQCE);
        int i3 = IconCompatParcelizer + 51;
        write = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return onitemdismiss;
    }
}
