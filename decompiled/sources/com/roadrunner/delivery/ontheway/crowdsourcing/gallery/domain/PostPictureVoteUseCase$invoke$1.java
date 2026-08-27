package com.roadrunner.delivery.ontheway.crowdsourcing.gallery.domain;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class PostPictureVoteUseCase$invoke$1 extends ContinuationImpl {
    private static int IconCompatParcelizer = 0;
    private static int serializer = 1;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ ReportPictureUseCase write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPictureVoteUseCase$invoke$1(ReportPictureUseCase reportPictureUseCase, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.write = reportPictureUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = serializer + 103;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.read = obj;
        this.RemoteActionCompatParcelizer |= Integer.MIN_VALUE;
        Object objM4916invokegIAlus = this.write.m4916invokegIAlus(null, this);
        if (objM4916invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i4 = serializer + 115;
            IconCompatParcelizer = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 38 / 0;
            }
            return objM4916invokegIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4916invokegIAlus);
        int i6 = serializer + 39;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return onitemdismiss;
    }
}
