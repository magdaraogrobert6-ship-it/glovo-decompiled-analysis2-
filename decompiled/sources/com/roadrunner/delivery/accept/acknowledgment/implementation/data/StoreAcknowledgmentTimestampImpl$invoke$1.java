package com.roadrunner.delivery.accept.acknowledgment.implementation.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;

/* JADX INFO: loaded from: classes3.dex */
public final class StoreAcknowledgmentTimestampImpl$invoke$1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int write;
    public long IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ StoreAcknowledgmentTimestampImpl read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreAcknowledgmentTimestampImpl$invoke$1(StoreAcknowledgmentTimestampImpl storeAcknowledgmentTimestampImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.read = storeAcknowledgmentTimestampImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 105;
        write = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.serializer |= Integer.MIN_VALUE;
        Object objM4896invokegIAlus = this.read.m4896invokegIAlus(null, this);
        if (objM4896invokegIAlus == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i4 = write + 83;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                int i5 = 48 / 0;
            }
            return objM4896invokegIAlus;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4896invokegIAlus);
        int i6 = write + 51;
        MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return onitemdismiss;
    }
}
