package com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.data;

import androidx.compose.ui.graphics.Fields;
import com.huawei.location.Vw$Vw;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class CountDownTimer$startSystemClockCountDown$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;
    public int IconCompatParcelizer;
    public final /* synthetic */ Vw$Vw MediaSessionCompatQueueItem;
    public long RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public final /* synthetic */ long serializer;
    public int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimer$startSystemClockCountDown$1(long j, Vw$Vw vw$Vw, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.serializer = j;
        this.MediaSessionCompatQueueItem = vw$Vw;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        CountDownTimer$startSystemClockCountDown$1 countDownTimer$startSystemClockCountDown$1 = new CountDownTimer$startSystemClockCountDown$1(this.serializer, this.MediaSessionCompatQueueItem, shortNewsContentCardView);
        countDownTimer$startSystemClockCountDown$1.read = obj;
        int i2 = MediaBrowserCompatMediaItem + 97;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return countDownTimer$startSystemClockCountDown$1;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 115;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ((CountDownTimer$startSystemClockCountDown$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        }
        Object objInvokeSuspend = ((CountDownTimer$startSystemClockCountDown$1) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i3 = 87 / 0;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        if (r4.emit(o.getAnimations.write, r17) == r5) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1000, r17) == r5) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r4.emit(r3, r17) == r5) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d4, code lost:
    
        r2 = com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.data.CountDownTimer$startSystemClockCountDown$1.MediaMetadataCompat + 29;
        com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.data.CountDownTimer$startSystemClockCountDown$1.MediaBrowserCompatMediaItem = r2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
    
        if ((r2 % 2) != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        throw null;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ad -> B:35:0x00b0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.pickupdropoff.tasks.customerunavailable.data.CountDownTimer$startSystemClockCountDown$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
