package com.roadrunner.delivery.pickupdropoff.tasks.cardcashpayment.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class GetSoftPosDeeplinkUseCaseImpl$invoke$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public int IconCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ GetSoftPosDeeplinkUseCaseImpl serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSoftPosDeeplinkUseCaseImpl$invoke$1(GetSoftPosDeeplinkUseCaseImpl getSoftPosDeeplinkUseCaseImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = getSoftPosDeeplinkUseCaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 51;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4928invokegIAlus = this.serializer.m4928invokegIAlus(null, this);
        if (objM4928invokegIAlus != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return new onItemDismiss(objM4928invokegIAlus);
        }
        int i4 = RemoteActionCompatParcelizer + 123;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objM4928invokegIAlus;
        }
        throw null;
    }
}
