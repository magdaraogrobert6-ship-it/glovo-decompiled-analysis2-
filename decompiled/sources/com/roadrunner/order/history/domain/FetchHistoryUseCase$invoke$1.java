package com.roadrunner.order.history.domain;

import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchHistoryUseCase$invoke$1 extends ContinuationImpl {
    private static int read = 0;
    private static int write = 1;
    public int IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ BlockRunner serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchHistoryUseCase$invoke$1(BlockRunner blockRunner, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.serializer = blockRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = write + 61;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.IconCompatParcelizer |= Integer.MIN_VALUE;
        Object objM3950invokegIAlus = this.serializer.m3950invokegIAlus((LocalDate) null, this);
        if (objM3950invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return objM3950invokegIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM3950invokegIAlus);
        int i4 = write + 119;
        read = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return onitemdismiss;
    }
}
