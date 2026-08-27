package com.roadrunner.push.core.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateApplicantPushToken$invoke$1 extends ContinuationImpl {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ UpdateApplicantPushToken IconCompatParcelizer;
    public /* synthetic */ Object read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateApplicantPushToken$invoke$1(UpdateApplicantPushToken updateApplicantPushToken, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.IconCompatParcelizer = updateApplicantPushToken;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.read = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM5005invokegIAlus = this.IconCompatParcelizer.m5005invokegIAlus(null, this);
        if (objM5005invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = write + 119;
            RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objM5005invokegIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM5005invokegIAlus);
        int i4 = RemoteActionCompatParcelizer + 75;
        write = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}
