package com.roadrunner.delivery.ontheway.routepreview.naver.domain;

import com.roadrunner.appinitialize.InitializeAppStartupItemsImpl;
import o.accessdraw;
import o.getRearDisplayMetrics;

/* JADX INFO: loaded from: classes3.dex */
public final class FetchRoutePreviewRoutes {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final InitializeAppStartupItemsImpl RemoteActionCompatParcelizer;
    public final getRearDisplayMetrics serializer;
    public final accessdraw write;

    public FetchRoutePreviewRoutes(InitializeAppStartupItemsImpl initializeAppStartupItemsImpl, getRearDisplayMetrics getreardisplaymetrics, accessdraw accessdrawVar) {
        this.RemoteActionCompatParcelizer = initializeAppStartupItemsImpl;
        this.serializer = getreardisplaymetrics;
        this.write = accessdrawVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        if (r11 == r3) goto L31;
     */
    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4920invokegIAlus(o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r12 instanceof com.roadrunner.delivery.ontheway.routepreview.naver.domain.FetchRoutePreviewRoutes$invoke$1
            r2 = 0
            if (r1 == 0) goto L2a
            int r1 = com.roadrunner.delivery.ontheway.routepreview.naver.domain.FetchRoutePreviewRoutes.IconCompatParcelizer
            int r1 = r1 + 121
            int r3 = r1 % 128
            com.roadrunner.delivery.ontheway.routepreview.naver.domain.FetchRoutePreviewRoutes.read = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L22
            r1 = r12
            com.roadrunner.delivery.ontheway.routepreview.naver.domain.FetchRoutePreviewRoutes$invoke$1 r1 = (com.roadrunner.delivery.ontheway.routepreview.naver.domain.FetchRoutePreviewRoutes$invoke$1) r1
            int r3 = r1.read
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L2a
            int r3 = r3 + r4
            r1.read = r3
            goto L2f
        L22:
            com.roadrunner.delivery.ontheway.routepreview.naver.domain.FetchRoutePreviewRoutes$invoke$1 r12 = (com.roadrunner.delivery.ontheway.routepreview.naver.domain.FetchRoutePreviewRoutes$invoke$1) r12
            int r11 = r12.read
            r2.hashCode()
            throw r2
        L2a:
            com.roadrunner.delivery.ontheway.routepreview.naver.domain.FetchRoutePreviewRoutes$invoke$1 r1 = new com.roadrunner.delivery.ontheway.routepreview.naver.domain.FetchRoutePreviewRoutes$invoke$1
            r1.<init>(r10, r12)
        L2f:
            java.lang.Object r12 = r1.write
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r1.read
            o.accessdraw r5 = r10.write
            r6 = 1
            if (r4 == 0) goto L60
            if (r4 == r6) goto L5a
            int r11 = com.roadrunner.delivery.ontheway.routepreview.naver.domain.FetchRoutePreviewRoutes.IconCompatParcelizer
            int r11 = r11 + 51
            int r1 = r11 % 128
            com.roadrunner.delivery.ontheway.routepreview.naver.domain.FetchRoutePreviewRoutes.read = r1
            int r11 = r11 % r0
            if (r11 == 0) goto L4a
            if (r4 != r0) goto L54
            goto L4c
        L4a:
            if (r4 != r0) goto L54
        L4c:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            o.onItemDismiss r12 = (o.onItemDismiss) r12
            java.lang.Object r11 = r12.IconCompatParcelizer
            goto L90
        L54:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r11)
            return r2
        L5a:
            o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k r11 = r1.IconCompatParcelizer
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            goto L70
        L60:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r12)
            r1.IconCompatParcelizer = r11
            r1.read = r6
            o.getRearDisplayMetrics r12 = r10.serializer
            java.lang.Object r12 = r12.RemoteActionCompatParcelizer(r1)
            if (r12 != r3) goto L70
            goto L8f
        L70:
            android.location.Location r12 = (android.location.Location) r12
            if (r12 == 0) goto La4
            double r6 = r12.getLatitude()
            double r8 = r12.getLongitude()
            o.AndroidViewHolderlayoutNode12 r12 = new o.AndroidViewHolderlayoutNode12
            r12.<init>(r6, r8)
            boolean r4 = r5.serializer
            r1.IconCompatParcelizer = r2
            r1.read = r0
            com.roadrunner.appinitialize.InitializeAppStartupItemsImpl r2 = r10.RemoteActionCompatParcelizer
            java.lang.Object r11 = r2.m4857getRoutePreviewBWLJW6A(r4, r12, r11, r1)
            if (r11 != r3) goto L90
        L8f:
            return r3
        L90:
            boolean r12 = r11 instanceof o.isItemDismissable
            if (r12 != 0) goto La3
            int r12 = com.roadrunner.delivery.ontheway.routepreview.naver.domain.FetchRoutePreviewRoutes.IconCompatParcelizer
            int r12 = r12 + 11
            int r1 = r12 % 128
            com.roadrunner.delivery.ontheway.routepreview.naver.domain.FetchRoutePreviewRoutes.read = r1
            int r12 = r12 % r0
            r0 = 0
            r12 = r11
            o.setColorRPmYEkk r12 = (o.setColorRPmYEkk) r12
            r5.serializer = r0
        La3:
            return r11
        La4:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Rider location was null"
            r11.<init>(r12)
            o.isItemDismissable r12 = new o.isItemDismissable
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.delivery.ontheway.routepreview.naver.domain.FetchRoutePreviewRoutes.m4920invokegIAlus(o.r8lambdaeRWhGgzq_gqGn8CuLtNvrcsHm8k, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
