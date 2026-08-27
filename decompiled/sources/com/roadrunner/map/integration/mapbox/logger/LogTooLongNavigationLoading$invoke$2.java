package com.roadrunner.map.integration.mapbox.logger;

import androidx.compose.ui.graphics.Fields;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getStrictnessusljTpc;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class LogTooLongNavigationLoading$invoke$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ long read;
    public int serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LogTooLongNavigationLoading$invoke$2(long j, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.read = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r1 = new com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2(r5.read, r7, r2);
        r1.IconCompatParcelizer = r6;
        r6 = com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2.MediaMetadataCompat + 59;
        com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2.write = r6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r5.RemoteActionCompatParcelizer != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r5.RemoteActionCompatParcelizer != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r2 = new com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2(r5.read, r7, 1);
        r2.IconCompatParcelizer = r6;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.ShortNewsContentCardView create(java.lang.Object r6, o.ShortNewsContentCardView r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2.write
            int r1 = r1 + 113
            int r2 = r1 % 128
            com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2.MediaMetadataCompat = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L17
            int r1 = r5.RemoteActionCompatParcelizer
            r3 = 24
            int r3 = r3 / r2
            if (r1 == 0) goto L26
            goto L1b
        L17:
            int r1 = r5.RemoteActionCompatParcelizer
            if (r1 == 0) goto L26
        L1b:
            long r0 = r5.read
            com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2 r2 = new com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2
            r3 = 1
            r2.<init>(r0, r7, r3)
            r2.IconCompatParcelizer = r6
            return r2
        L26:
            long r3 = r5.read
            com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2 r1 = new com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2
            r1.<init>(r3, r7, r2)
            r1.IconCompatParcelizer = r6
            int r6 = com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2.MediaMetadataCompat
            int r6 = r6 + 59
            int r7 = r6 % 128
            com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2.write = r7
            int r6 = r6 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2.create(java.lang.Object, o.ShortNewsContentCardView):o.ShortNewsContentCardView");
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = write + 21;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        Object obj3 = null;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel2 = createFromParcel.INSTANCE;
        if (i3 != 0) {
            return ((LogTooLongNavigationLoading$invoke$2) create((FlowCollector) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        }
        Object objInvokeSuspend = ((LogTooLongNavigationLoading$invoke$2) create((getStrictnessusljTpc) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel2);
        int i4 = MediaMetadataCompat + 45;
        write = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return objInvokeSuspend;
        }
        obj3.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r2, r10) == r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r2, r10) == r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return r8;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = r10.RemoteActionCompatParcelizer
            long r2 = r10.read
            o.createFromParcel r4 = o.createFromParcel.INSTANCE
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L44
            java.lang.Object r1 = r10.IconCompatParcelizer
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r9 = r10.serializer
            if (r9 == 0) goto L2a
            if (r9 == r7) goto L26
            if (r9 != r0) goto L21
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            goto L43
        L21:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r5)
            r4 = r6
            goto L43
        L26:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            goto L38
        L2a:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            r10.IconCompatParcelizer = r1
            r10.serializer = r7
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r2, r10)
            if (r11 != r8) goto L38
            goto L42
        L38:
            r10.IconCompatParcelizer = r6
            r10.serializer = r0
            java.lang.Object r11 = r1.emit(r4, r10)
            if (r11 != r8) goto L43
        L42:
            r4 = r8
        L43:
            return r4
        L44:
            java.lang.Object r1 = r10.IconCompatParcelizer
            o.getStrictnessusljTpc r1 = (o.getStrictnessusljTpc) r1
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r9 = r10.serializer
            if (r9 == 0) goto L62
            if (r9 != r7) goto L5d
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            int r11 = com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2.write
            int r11 = r11 + 15
            int r1 = r11 % 128
            com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2.MediaMetadataCompat = r1
            int r11 = r11 % r0
            goto L9c
        L5d:
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r5)
            r4 = r6
            goto Lae
        L62:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            boolean r11 = r1 instanceof o.LineBreakCompanion
            if (r11 == 0) goto Lae
            int r11 = com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2.write
            int r11 = r11 + 37
            int r1 = r11 % 128
            com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2.MediaMetadataCompat = r1
            int r11 = r11 % r0
            java.lang.String r0 = "Navigation routes request called from Loading state"
            r1 = 0
            if (r11 != 0) goto L89
            timber.log.Timber$Forest r11 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.Object[] r5 = new java.lang.Object[r7]
            r11.IconCompatParcelizer(r0, r5)
            r10.IconCompatParcelizer = r6
            r10.serializer = r1
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r2, r10)
            if (r11 != r8) goto L9c
            goto L9a
        L89:
            timber.log.Timber$Forest r11 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r11.IconCompatParcelizer(r0, r1)
            r10.IconCompatParcelizer = r6
            r10.serializer = r7
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r2, r10)
            if (r11 != r8) goto L9c
        L9a:
            r4 = r8
            goto Lae
        L9c:
            timber.log.Timber$Forest r11 = timber.log.Timber.RemoteActionCompatParcelizer
            java.lang.String r0 = "Navigation stuck in Loading state for over "
            java.lang.String r1 = " ms"
            java.lang.String r0 = bo.app.m1$$ExternalSyntheticOutline0.m(r2, r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r11.write(r1)
        Lae:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.map.integration.mapbox.logger.LogTooLongNavigationLoading$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
