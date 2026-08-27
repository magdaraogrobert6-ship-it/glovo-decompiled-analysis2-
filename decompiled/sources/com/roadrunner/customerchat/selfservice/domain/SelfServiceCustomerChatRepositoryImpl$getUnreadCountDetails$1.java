package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ SelfServiceCustomerChatRepositoryImpl write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfServiceCustomerChatRepositoryImpl$getUnreadCountDetails$1(SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = selfServiceCustomerChatRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 95;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            this.read = obj;
            this.IconCompatParcelizer |= Integer.MIN_VALUE;
            this.write.m4891getUnreadCountDetailsIoAF18A(this);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            throw null;
        }
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4891getUnreadCountDetailsIoAF18A = this.write.m4891getUnreadCountDetailsIoAF18A(this);
        if (objM4891getUnreadCountDetailsIoAF18A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM4891getUnreadCountDetailsIoAF18A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4891getUnreadCountDetailsIoAF18A);
        int i3 = RemoteActionCompatParcelizer + 25;
        serializer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return onitemdismiss;
        }
        throw null;
    }
}
