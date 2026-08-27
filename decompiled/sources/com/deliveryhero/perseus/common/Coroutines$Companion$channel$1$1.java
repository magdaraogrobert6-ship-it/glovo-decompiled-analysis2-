package com.deliveryhero.perseus.common;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferedChannel;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.onBackCancelledlambda3;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class Coroutines$Companion$channel$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ BufferedChannel IconCompatParcelizer;
    public BufferedChannel.BufferedChannelIterator MediaBrowserCompatMediaItem;
    public int RatingCompat;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int serializer;
    public onBackCancelledlambda3 write;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        return new Coroutines$Companion$channel$1$1(this.IconCompatParcelizer, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        return ((Coroutines$Companion$channel$1$1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:7:0x0017, B:16:0x0040, B:20:0x0059, B:22:0x0061, B:12:0x002f, B:15:0x0038), top: B:32:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r12.join(r11) == r0) goto L24;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0077 -> B:8:0x001a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.RatingCompat
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L33
            if (r1 == r4) goto L25
            if (r1 != r3) goto L1f
            int r1 = r11.read
            int r5 = r11.serializer
            int r6 = r11.RemoteActionCompatParcelizer
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r7 = r11.MediaBrowserCompatMediaItem
            o.onBackCancelledlambda3 r8 = r11.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)     // Catch: java.lang.Throwable -> L80
        L1a:
            r12 = r7
            r9 = r6
            r6 = r1
            r1 = r9
            goto L40
        L1f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r12)
            return r2
        L25:
            int r1 = r11.read
            int r5 = r11.serializer
            int r6 = r11.RemoteActionCompatParcelizer
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r7 = r11.MediaBrowserCompatMediaItem
            o.onBackCancelledlambda3 r8 = r11.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)     // Catch: java.lang.Throwable -> L80
            goto L59
        L33:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            kotlinx.coroutines.channels.BufferedChannel r8 = r11.IconCompatParcelizer
            kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator r12 = new kotlinx.coroutines.channels.BufferedChannel$BufferedChannelIterator     // Catch: java.lang.Throwable -> L80
            r12.<init>()     // Catch: java.lang.Throwable -> L80
            r1 = 0
            r5 = r1
            r6 = r5
        L40:
            r11.write = r8     // Catch: java.lang.Throwable -> L80
            r11.MediaBrowserCompatMediaItem = r12     // Catch: java.lang.Throwable -> L80
            r11.RemoteActionCompatParcelizer = r1     // Catch: java.lang.Throwable -> L80
            r11.serializer = r5     // Catch: java.lang.Throwable -> L80
            r11.read = r6     // Catch: java.lang.Throwable -> L80
            r11.RatingCompat = r4     // Catch: java.lang.Throwable -> L80
            java.lang.Object r7 = r12.hasNext(r11)     // Catch: java.lang.Throwable -> L80
            if (r7 != r0) goto L53
            goto L79
        L53:
            r9 = r7
            r7 = r12
            r12 = r9
            r10 = r6
            r6 = r1
            r1 = r10
        L59:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L80
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L80
            if (r12 == 0) goto L7a
            java.lang.Object r12 = r7.write()     // Catch: java.lang.Throwable -> L80
            o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 r12 = (o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) r12     // Catch: java.lang.Throwable -> L80
            r11.write = r8     // Catch: java.lang.Throwable -> L80
            r11.MediaBrowserCompatMediaItem = r7     // Catch: java.lang.Throwable -> L80
            r11.RemoteActionCompatParcelizer = r6     // Catch: java.lang.Throwable -> L80
            r11.serializer = r5     // Catch: java.lang.Throwable -> L80
            r11.read = r1     // Catch: java.lang.Throwable -> L80
            r11.RatingCompat = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r12 = r12.join(r11)     // Catch: java.lang.Throwable -> L80
            if (r12 != r0) goto L1a
        L79:
            return r0
        L7a:
            r8.write(r2)
            o.createFromParcel r12 = o.createFromParcel.INSTANCE
            return r12
        L80:
            r12 = move-exception
            throw r12     // Catch: java.lang.Throwable -> L82
        L82:
            r0 = move-exception
            o.setNativeShader.IconCompatParcelizer(r8, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.deliveryhero.perseus.common.Coroutines$Companion$channel$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Coroutines$Companion$channel$1$1(BufferedChannel bufferedChannel, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.IconCompatParcelizer = bufferedChannel;
    }
}
