package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.domain.InitiateTransferChangeUseCase;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.AnimationSearchSearch;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ExecuteComponentApiCallUseCase$invoke$1 extends ContinuationImpl {
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    public /* synthetic */ Object IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public AnimationSearchSearch read;
    public int serializer;
    public final /* synthetic */ InitiateTransferChangeUseCase write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExecuteComponentApiCallUseCase$invoke$1(InitiateTransferChangeUseCase initiateTransferChangeUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = initiateTransferChangeUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 67;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM4929invoke0E7RQCE = this.write.m4929invoke0E7RQCE(null, null, this);
        if (objM4929invoke0E7RQCE != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4929invoke0E7RQCE);
        }
        int i4 = MediaMetadataCompat + 53;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return objM4929invoke0E7RQCE;
    }
}
