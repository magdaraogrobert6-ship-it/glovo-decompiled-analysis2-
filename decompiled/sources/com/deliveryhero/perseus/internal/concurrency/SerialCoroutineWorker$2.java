package com.deliveryhero.perseus.internal.concurrency;

import androidx.emoji2.text.EmojiProcessor;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferedChannel;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.onBackCancelledlambda3;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class SerialCoroutineWorker$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public int IconCompatParcelizer;
    public final /* synthetic */ EmojiProcessor MediaBrowserCompatMediaItem;
    public int MediaDescriptionCompat;
    public BufferedChannel.BufferedChannelIterator RatingCompat;
    public onBackCancelledlambda3 RemoteActionCompatParcelizer;
    public EmojiProcessor read;
    public int serializer;
    public int write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new SerialCoroutineWorker$2(this.MediaBrowserCompatMediaItem, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((SerialCoroutineWorker$2) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081 A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #4 {all -> 0x00bf, blocks: (B:20:0x005d, B:24:0x0079, B:26:0x0081, B:33:0x00b0), top: B:52:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ab -> B:9:0x001f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.internal.concurrency.SerialCoroutineWorker$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerialCoroutineWorker$2(EmojiProcessor emojiProcessor, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaBrowserCompatMediaItem = emojiProcessor;
    }
}
