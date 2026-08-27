package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfServiceCustomerChatRepositoryImpl$getChatId$1 extends ContinuationImpl {
    private static int serializer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ SelfServiceCustomerChatRepositoryImpl read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfServiceCustomerChatRepositoryImpl$getChatId$1(SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = selfServiceCustomerChatRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 37;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4890getChatIdgIAlus = this.read.m4890getChatIdgIAlus(null, this);
        if (objM4890getChatIdgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4890getChatIdgIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4890getChatIdgIAlus);
        int i4 = write + 115;
        serializer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return onitemdismiss;
        }
        throw null;
    }
}
