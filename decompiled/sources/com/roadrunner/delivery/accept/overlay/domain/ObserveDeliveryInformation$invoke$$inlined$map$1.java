package com.roadrunner.delivery.accept.overlay.domain;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveDeliveryInformation$invoke$$inlined$map$1 implements Flow {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 read;

    public /* synthetic */ ObserveDeliveryInformation$invoke$$inlined$map$1(FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.read = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r1 != 2) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r10 = r7.collect(new com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1.AnonymousClass2(r10, 15), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r10 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        r10 = r7.collect(new com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1.AnonymousClass2(r10, 1), r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r10 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        r11 = com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1.write;
        r1 = r11 + 29;
        com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1.IconCompatParcelizer = r1 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r1 = r1 % 2;
        r11 = r11 + 59;
        com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1.IconCompatParcelizer = r11 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if ((r11 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r11 = 5 % 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r1 != 2) goto L13;
     */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r10, o.ShortNewsContentCardView r11) {
        /*
            r9 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1.IconCompatParcelizer
            r2 = 7
            int r1 = r1 + r2
            int r3 = r1 % 128
            com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1.write = r3
            int r1 = r1 % r0
            r3 = 4
            r4 = 59
            r5 = 1
            if (r1 != 0) goto L21
            int r1 = r9.RemoteActionCompatParcelizer
            o.createFromParcel r6 = o.createFromParcel.INSTANCE
            kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r7 = r9.read
            int r8 = r4 / 0
            if (r1 == 0) goto L78
            if (r1 == r5) goto L60
            if (r1 == r0) goto L3e
            goto L2d
        L21:
            int r1 = r9.RemoteActionCompatParcelizer
            o.createFromParcel r6 = o.createFromParcel.INSTANCE
            kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 r7 = r9.read
            if (r1 == 0) goto L78
            if (r1 == r5) goto L60
            if (r1 == r0) goto L3e
        L2d:
            com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1$2 r0 = new com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1$2
            r1 = 15
            r0.<init>(r10, r1)
            java.lang.Object r10 = r7.collect(r0, r11)
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r10 != r11) goto L3d
            r6 = r10
        L3d:
            return r6
        L3e:
            com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1$2 r1 = new com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1$2
            r1.<init>(r10, r5)
            java.lang.Object r10 = r7.collect(r1, r11)
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r10 != r11) goto L5f
            int r11 = com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1.write
            int r1 = r11 + 29
            int r2 = r1 % 128
            com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1.IconCompatParcelizer = r2
            int r1 = r1 % r0
            int r11 = r11 + r4
            int r1 = r11 % 128
            com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1.IconCompatParcelizer = r1
            int r11 = r11 % r0
            if (r11 == 0) goto L5e
            r11 = 5
            int r11 = r11 % r3
        L5e:
            r6 = r10
        L5f:
            return r6
        L60:
            com.roadrunner.delivery.accept.tags.domain.ObserveTagsUiState$invoke$$inlined$map$1$2 r1 = new com.roadrunner.delivery.accept.tags.domain.ObserveTagsUiState$invoke$$inlined$map$1$2
            r1.<init>(r10, r2)
            java.lang.Object r10 = r7.collect(r1, r11)
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r10 != r11) goto L77
            int r11 = com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1.IconCompatParcelizer
            int r11 = r11 + 97
            int r1 = r11 % 128
            com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1.write = r1
            int r11 = r11 % r0
            r6 = r10
        L77:
            return r6
        L78:
            com.roadrunner.delivery.accept.tags.domain.ObserveTagsUiState$invoke$$inlined$map$1$2 r1 = new com.roadrunner.delivery.accept.tags.domain.ObserveTagsUiState$invoke$$inlined$map$1$2
            r1.<init>(r10, r3)
            java.lang.Object r10 = r7.collect(r1, r11)
            kotlin.coroutines.intrinsics.CoroutineSingletons r11 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r10 != r11) goto L86
            r6 = r10
        L86:
            int r10 = com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1.IconCompatParcelizer
            int r10 = r10 + 49
            int r11 = r10 % 128
            com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1.write = r11
            int r10 = r10 % r0
            if (r10 == 0) goto L92
            return r6
        L92:
            r10 = 0
            r10.hashCode()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.accept.overlay.domain.ObserveDeliveryInformation$invoke$$inlined$map$1.collect(kotlinx.coroutines.flow.FlowCollector, o.ShortNewsContentCardView):java.lang.Object");
    }
}
