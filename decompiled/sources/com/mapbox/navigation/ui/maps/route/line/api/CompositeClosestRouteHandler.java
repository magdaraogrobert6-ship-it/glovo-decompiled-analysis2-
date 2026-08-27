package com.mapbox.navigation.ui.maps.route.line.api;

import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositeClosestRouteHandler implements ClosestRouteHandler {
    public final /* synthetic */ int $r8$classId;
    public final List handlers;

    /* JADX INFO: renamed from: com.mapbox.navigation.ui.maps.route.line.api.CompositeClosestRouteHandler$handle$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public MapboxMap L$0;
        public ScreenCoordinate L$1;
        public List L$2;
        public Iterator L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CompositeClosestRouteHandler.this.handle(null, null, null, this);
        }
    }

    public /* synthetic */ CompositeClosestRouteHandler(List list, int i) {
        this.$r8$classId = i;
        this.handlers = list;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0094  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0096 -> B:16:0x0061). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.mapbox.navigation.ui.maps.route.line.api.ClosestRouteHandler
    public final java.lang.Object handle(com.mapbox.maps.MapboxMap r8, com.mapbox.maps.ScreenCoordinate r9, java.util.List r10, o.ShortNewsContentCardView r11) {
        /*
            r7 = this;
            int r0 = r7.$r8$classId
            java.util.List r1 = r7.handlers
            r2 = 0
            if (r0 == 0) goto L2b
            o.ShortNewsContentCardView r11 = io.grpc.LoadBalancer$Helper.intercepted(r11)
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.UNDECIDED
            kotlin.coroutines.SafeContinuation r3 = new kotlin.coroutines.SafeContinuation
            r3.<init>(r11, r0)
            com.mapbox.maps.RenderedQueryGeometry r11 = new com.mapbox.maps.RenderedQueryGeometry
            r11.<init>(r9)
            com.mapbox.maps.RenderedQueryOptions r9 = new com.mapbox.maps.RenderedQueryOptions
            r9.<init>(r1, r2)
            com.google.re2j.Parser$Pair r0 = new com.google.re2j.Parser$Pair
            r1 = 8
            r0.<init>(r10, r1, r3)
            r8.queryRenderedFeatures(r11, r9, r0)
            java.lang.Object r8 = r3.getOrThrow()
            return r8
        L2b:
            boolean r0 = r11 instanceof com.mapbox.navigation.ui.maps.route.line.api.CompositeClosestRouteHandler.AnonymousClass1
            if (r0 == 0) goto L3e
            r0 = r11
            com.mapbox.navigation.ui.maps.route.line.api.CompositeClosestRouteHandler$handle$1 r0 = (com.mapbox.navigation.ui.maps.route.line.api.CompositeClosestRouteHandler.AnonymousClass1) r0
            int r3 = r0.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L3e
            int r3 = r3 + r4
            r0.label = r3
            goto L45
        L3e:
            kotlin.coroutines.jvm.internal.ContinuationImpl r11 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r11
            com.mapbox.navigation.ui.maps.route.line.api.CompositeClosestRouteHandler$handle$1 r0 = new com.mapbox.navigation.ui.maps.route.line.api.CompositeClosestRouteHandler$handle$1
            r0.<init>(r11)
        L45:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r0.label
            r5 = 1
            if (r4 == 0) goto L69
            if (r4 != r5) goto L63
            java.util.Iterator r8 = r0.L$3
            java.util.List r9 = r0.L$2
            r10 = r9
            java.util.List r10 = (java.util.List) r10
            com.mapbox.maps.ScreenCoordinate r10 = r0.L$1
            com.mapbox.maps.MapboxMap r1 = r0.L$0
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            r6 = r0
            r0 = r9
            r9 = r1
        L61:
            r1 = r6
            goto L9a
        L63:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0.write(r8)
            goto Lb0
        L69:
            coil3.ExtrasKt.RemoteActionCompatParcelizer(r11)
            java.util.Iterator r11 = r1.iterator()
            r6 = r9
            r9 = r8
            r8 = r11
            r11 = r10
            r10 = r6
        L75:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto La7
            java.lang.Object r1 = r8.next()
            com.mapbox.navigation.ui.maps.route.line.api.ClosestRouteHandler r1 = (com.mapbox.navigation.ui.maps.route.line.api.ClosestRouteHandler) r1
            r0.L$0 = r9
            r0.L$1 = r10
            r2 = r11
            java.util.List r2 = (java.util.List) r2
            r0.L$2 = r11
            r0.L$3 = r8
            r0.label = r5
            java.lang.Object r1 = r1.handle(r9, r10, r11, r0)
            if (r1 != r3) goto L96
            r2 = r3
            goto Lb0
        L96:
            r6 = r0
            r0 = r11
            r11 = r1
            goto L61
        L9a:
            r2 = r11
            com.mapbox.bindgen.Expected r2 = (com.mapbox.bindgen.Expected) r2
            boolean r11 = r2.isValue()
            if (r11 == 0) goto La4
            goto Lb0
        La4:
            r11 = r0
            r0 = r1
            goto L75
        La7:
            o.createFromParcel r8 = o.createFromParcel.INSTANCE
            com.mapbox.bindgen.Expected r2 = com.mapbox.bindgen.ExpectedFactory.createError(r8)
            r2.getClass()
        Lb0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.navigation.ui.maps.route.line.api.CompositeClosestRouteHandler.handle(com.mapbox.maps.MapboxMap, com.mapbox.maps.ScreenCoordinate, java.util.List, o.ShortNewsContentCardView):java.lang.Object");
    }
}
