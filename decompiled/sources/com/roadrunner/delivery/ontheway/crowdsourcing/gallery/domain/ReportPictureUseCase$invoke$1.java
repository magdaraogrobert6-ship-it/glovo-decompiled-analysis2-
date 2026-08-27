package com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class ReportPictureUseCase$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object serializer;
    public final /* synthetic */ ReportPictureUseCase write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportPictureUseCase$invoke$1(ReportPictureUseCase reportPictureUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = reportPictureUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.serializer = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4915invokeBWLJW6A = this.write.m4915invokeBWLJW6A(null, null, this, false);
        if (objM4915invokeBWLJW6A == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = read + 107;
            IconCompatParcelizer = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objM4915invokeBWLJW6A;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4915invokeBWLJW6A);
        int i4 = IconCompatParcelizer + 109;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}
