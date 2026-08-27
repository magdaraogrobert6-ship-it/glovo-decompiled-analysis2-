package com.roadrunner.delivery.accept.acknowledgment.implementation;

import androidx.compose.ui.graphics.Fields;
import io.sentry.metrics.MetricsBatchProcessor;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setFitInsetsSides;

/* JADX INFO: loaded from: classes3.dex */
public final class AcknowledgeCurrentDeliveries$invoke$4 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    public long IconCompatParcelizer;
    public final /* synthetic */ MetricsBatchProcessor MediaMetadataCompat;
    public int MediaSessionCompatQueueItem;
    public int RemoteActionCompatParcelizer;
    public /* synthetic */ Object read;
    public Iterator serializer;
    public MetricsBatchProcessor write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcknowledgeCurrentDeliveries$invoke$4(MetricsBatchProcessor metricsBatchProcessor, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.MediaMetadataCompat = metricsBatchProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        AcknowledgeCurrentDeliveries$invoke$4 acknowledgeCurrentDeliveries$invoke$4 = new AcknowledgeCurrentDeliveries$invoke$4(this.MediaMetadataCompat, shortNewsContentCardView);
        acknowledgeCurrentDeliveries$invoke$4.read = obj;
        int i2 = MediaBrowserCompatMediaItem + 63;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return acknowledgeCurrentDeliveries$invoke$4;
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 5;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((AcknowledgeCurrentDeliveries$invoke$4) create((setFitInsetsSides) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
            throw null;
        }
        Object objInvokeSuspend = ((AcknowledgeCurrentDeliveries$invoke$4) create((setFitInsetsSides) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createFromParcel.INSTANCE);
        int i3 = RatingCompat + 47;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return objInvokeSuspend;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ac A[LOOP:0: B:18:0x007b->B:23:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r0 == r10) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r8 = r17
            r9 = 2
            int r0 = r9 % r9
            int r0 = com.roadrunner.delivery.accept.acknowledgment.implementation.AcknowledgeCurrentDeliveries$invoke$4.RatingCompat
            int r0 = r0 + 49
            int r1 = r0 % 128
            com.roadrunner.delivery.accept.acknowledgment.implementation.AcknowledgeCurrentDeliveries$invoke$4.MediaBrowserCompatMediaItem = r1
            int r0 = r0 % r9
            java.lang.Object r0 = r8.read
            o.setFitInsetsSides r0 = (o.setFitInsetsSides) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r10 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.MediaSessionCompatQueueItem
            io.sentry.metrics.MetricsBatchProcessor r2 = r8.MediaMetadataCompat
            r3 = 1
            r11 = 0
            if (r1 == 0) goto L4e
            if (r1 == r3) goto L48
            if (r1 != r9) goto L42
            int r0 = com.roadrunner.delivery.accept.acknowledgment.implementation.AcknowledgeCurrentDeliveries$invoke$4.RatingCompat
            int r0 = r0 + 57
            int r1 = r0 % 128
            com.roadrunner.delivery.accept.acknowledgment.implementation.AcknowledgeCurrentDeliveries$invoke$4.MediaBrowserCompatMediaItem = r1
            int r0 = r0 % r9
            if (r0 != 0) goto L3b
            int r0 = r8.RemoteActionCompatParcelizer
            long r1 = r8.IconCompatParcelizer
            java.util.Iterator r3 = r8.serializer
            io.sentry.metrics.MetricsBatchProcessor r4 = r8.write
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r18)
            r12 = r0
            r13 = r1
            r7 = r3
            r15 = r4
            goto L7b
        L3b:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r18)
            r11.hashCode()
            throw r11
        L42:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r0)
            return r11
        L48:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r18)
            r0 = r18
            goto L60
        L4e:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r18)
            java.lang.Object r1 = r2.serializer
            com.roadrunner.delivery.accept.acknowledgment.implementation.domain.GetAcknowledgmentParamsImpl r1 = (com.roadrunner.delivery.accept.acknowledgment.implementation.domain.GetAcknowledgmentParamsImpl) r1
            r8.read = r11
            r8.MediaSessionCompatQueueItem = r3
            java.io.Serializable r0 = r1.invoke(r0, r8)
            if (r0 != r10) goto L60
            goto Lab
        L60:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r2.read
            com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0 r1 = (com.roadrunner.delivery.state.StateV3$$ExternalSyntheticLambda0) r1
            java.lang.Object r1 = r1.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r7 = r0
            r12 = r1
            r15 = r2
            r13 = r3
        L7b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r7.next()
            o.TextLinkStylesSaverlambda1 r0 = (o.TextLinkStylesSaverlambda1) r0
            java.lang.String r1 = r0.RemoteActionCompatParcelizer()
            long r2 = r0.read()
            java.lang.String r4 = r0.IconCompatParcelizer()
            r8.read = r11
            r8.write = r15
            r8.serializer = r7
            r8.IconCompatParcelizer = r13
            r8.RemoteActionCompatParcelizer = r12
            r8.MediaSessionCompatQueueItem = r9
            r0 = r15
            r5 = r13
            r16 = r7
            r7 = r17
            java.lang.Object r0 = io.sentry.metrics.MetricsBatchProcessor.access$fireAcknowledgeWorker(r0, r1, r2, r4, r5, r7)
            if (r0 != r10) goto Lac
        Lab:
            return r10
        Lac:
            r7 = r16
            goto L7b
        Laf:
            o.createFromParcel r0 = o.createFromParcel.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.acknowledgment.implementation.AcknowledgeCurrentDeliveries$invoke$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
