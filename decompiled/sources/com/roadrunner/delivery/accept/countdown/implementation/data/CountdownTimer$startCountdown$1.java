package com.roadrunner.delivery.accept.countdown.implementation.data;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCollapsedimpl;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class CountdownTimer$startCountdown$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ getCollapsedimpl MediaSessionCompatQueueItem;
    public int RatingCompat;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ int serializer;
    public float write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountdownTimer$startCountdown$1(int i, int i2, getCollapsedimpl getcollapsedimpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = i;
        this.IconCompatParcelizer = i2;
        this.MediaSessionCompatQueueItem = getcollapsedimpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        CountdownTimer$startCountdown$1 countdownTimer$startCountdown$1 = new CountdownTimer$startCountdown$1(this.serializer, this.IconCompatParcelizer, this.MediaSessionCompatQueueItem, shortNewsContentCardView);
        countdownTimer$startCountdown$1.RemoteActionCompatParcelizer = obj;
        int i2 = MediaDescriptionCompat + 5;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return countdownTimer$startCountdown$1;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 121;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        Object objInvokeSuspend = ((CountdownTimer$startCountdown$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i4 = MediaBrowserCompatMediaItem + 51;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:24:0x0066 A[PHI: r3
  0x0066: PHI (r3v6 int) = (r3v5 int), (r3v12 int) binds: [B:23:0x0064, B:20:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b5, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r13) == r2) goto L36;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0051, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00b5 -> B:37:0x00b8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.countdown.implementation.data.CountdownTimer$startCountdown$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
