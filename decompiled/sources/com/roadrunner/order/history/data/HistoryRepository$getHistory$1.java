package com.roadrunner.order.history.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import o.onItemDismiss;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes3.dex */
public final class HistoryRepository$getHistory$1 extends ContinuationImpl {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public long IconCompatParcelizer;
    public final /* synthetic */ HistoryRepository MediaSessionCompatQueueItem;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public Object read;
    public LocalDate serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryRepository$getHistory$1(HistoryRepository historyRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.MediaSessionCompatQueueItem = historyRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        this.RemoteActionCompatParcelizer = obj;
        this.write |= Integer.MIN_VALUE;
        Object obj2 = null;
        Object objM4997getHistory0E7RQCE = this.MediaSessionCompatQueueItem.m4997getHistory0E7RQCE(0L, null, this);
        if (objM4997getHistory0E7RQCE == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i2 = MediaBrowserCompatMediaItem + 95;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return objM4997getHistory0E7RQCE;
        }
        onItemDismiss onitemdismiss = new onItemDismiss(objM4997getHistory0E7RQCE);
        int i4 = RatingCompat + 13;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return onitemdismiss;
        }
        obj2.hashCode();
        throw null;
    }
}
