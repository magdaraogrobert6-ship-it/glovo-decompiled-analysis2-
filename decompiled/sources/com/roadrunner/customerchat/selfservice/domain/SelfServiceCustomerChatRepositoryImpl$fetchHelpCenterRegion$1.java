package com.roadrunner.customerchat.selfservice.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ SelfServiceCustomerChatRepositoryImpl read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfServiceCustomerChatRepositoryImpl$fetchHelpCenterRegion$1(SelfServiceCustomerChatRepositoryImpl selfServiceCustomerChatRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = selfServiceCustomerChatRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM4889fetchHelpCenterRegionIoAF18A = this.read.m4889fetchHelpCenterRegionIoAF18A(this);
        if (objM4889fetchHelpCenterRegionIoAF18A != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4889fetchHelpCenterRegionIoAF18A);
        }
        int i4 = write + 21;
        RemoteActionCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return objM4889fetchHelpCenterRegionIoAF18A;
    }
}
