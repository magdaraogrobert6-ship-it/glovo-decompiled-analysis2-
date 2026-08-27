package com.roadrunner.home.nest.config;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.geojson.Point;
import com.mapbox.maps.MapboxMap;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi;
import com.mapbox.navigation.ui.maps.route.line.api.MapboxRouteLineApi$findClosestRoute$1;
import com.roadrunner.auth.data.SignInDataStore;
import com.roadrunner.delivery.ontheway.tripplanner.actions.api.navigator.ActionsParams;
import com.roadrunner.delivery.pickupdropoff.confirmbutton.presentation.ConfirmButtonV1UiModelImpl;
import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$extractValue$1;
import com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl;
import com.roadrunner.map.integration.mapbox.route.RouteLineApi$findClosestRoute$2$1;
import com.roadrunner.settings.SettingsViewModel$special$$inlined$map$1;
import com.sentiance.core.model.events.N$b;
import io.grpc.LoadBalancer$Helper;
import io.sentry.CombinedScopeView;
import java.util.List;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ExtensionWindowAreaStatusRequirements;
import o.ShortNewsContentCardView;
import o.buildCompositionParentHierarchy;
import o.createFromParcel;
import o.createInAppMessageEventSubscriber;
import o.deleteSurroundingTextInCodePoints;
import o.eh;
import o.endStream;
import o.f8;
import o.getContentViewGroupParentLayout;
import o.getDecimalPjHm6EE;
import o.instance_delegatelambda0;
import o.kb;
import o.loadAsync;
import o.m7;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk;
import o.x1;

/* JADX INFO: loaded from: classes3.dex */
public final class GetNestScope$invoke$$inlined$map$1 implements Flow {
    private static int MediaMetadataCompat = 1;
    private static int write;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Flow serializer;

    /* JADX INFO: renamed from: com.roadrunner.home.nest.config.GetNestScope$invoke$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        private static int IconCompatParcelizer = 0;
        private static int MediaBrowserCompatMediaItem = 1;
        public final /* synthetic */ Object RemoteActionCompatParcelizer;
        public final /* synthetic */ int read;
        public final /* synthetic */ Object serializer;
        public final /* synthetic */ Object write;

        public AnonymousClass2(x1 x1Var, createInAppMessageEventSubscriber createinappmessageeventsubscriber, FlowCollector flowCollector) {
            this.read = 11;
            this.RemoteActionCompatParcelizer = x1Var;
            this.write = createinappmessageeventsubscriber;
            this.serializer = flowCollector;
        }

        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, Object obj3, int i) {
            this.read = i;
            this.serializer = obj;
            this.RemoteActionCompatParcelizer = obj2;
            this.write = obj3;
        }

        /* JADX WARN: Code duplicated, block: B:120:0x0259  */
        /* JADX WARN: Code duplicated, block: B:141:0x02af  */
        /* JADX WARN: Code duplicated, block: B:176:0x0385  */
        /* JADX WARN: Code duplicated, block: B:192:0x03ef  */
        /* JADX WARN: Code duplicated, block: B:193:0x03f5  */
        /* JADX WARN: Code duplicated, block: B:204:0x0414  */
        /* JADX WARN: Code duplicated, block: B:234:0x0485  */
        /* JADX WARN: Code duplicated, block: B:268:0x050f  */
        /* JADX WARN: Code duplicated, block: B:305:0x05d1  */
        /* JADX WARN: Code duplicated, block: B:326:0x0635  */
        /* JADX WARN: Code duplicated, block: B:353:0x06b2  */
        /* JADX WARN: Code duplicated, block: B:389:0x0758  */
        /* JADX WARN: Code duplicated, block: B:475:0x0aa8  */
        /* JADX WARN: Code duplicated, block: B:54:0x0118  */
        /* JADX WARN: Code duplicated, block: B:559:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:571:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x01af  */
        /* JADX WARN: Code duplicated, block: B:88:0x01c4 A[PHI: r12
  0x01c4: PHI (r12v3 o.se) = 
  (r12v2 o.se)
  (r12v2 o.se)
  (r12v2 o.se)
  (r12v2 o.se)
  (r12v2 o.se)
  (r12v6 o.se)
  (r12v2 o.se)
  (r12v2 o.se)
  (r12v7 o.se)
 binds: [B:10:0x0048, B:12:0x0065, B:18:0x0073, B:65:0x0164, B:94:0x01d0, B:87:0x01b2, B:34:0x00ca, B:58:0x0127, B:64:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:165:0x0368, code lost:
        
            if (r5.emit(r1, r3) == r4) goto L166;
         */
        /*  JADX ERROR: JadxRuntimeException in pass: LoopRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v56 java.lang.Object, still in use, count: 2, list:
              (r2v56 java.lang.Object) from 0x03e5: PHI (r2 I:??) = (r2v53 java.lang.Object), (r2v56 java.lang.Object) binds: [B:189:0x03e4, B:520:0x03e5] A[DONT_GENERATE, DONT_INLINE]
              (r2v56 java.lang.Object) from 0x03b4: CHECK_CAST (o.uiMode) (r2v56 java.lang.Object)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.processIfRequested(IfRegionVisitor.java:36)
            	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:56)
            */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r35, o.ShortNewsContentCardView r36) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2930
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.home.nest.config.GetNestScope$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, o.ShortNewsContentCardView):java.lang.Object");
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0038 A[PHI: r4 r6
  0x0038: PHI (r4v16 o.kb) = (r4v15 o.kb), (r4v18 o.kb) binds: [B:10:0x0036, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x0038: PHI (r6v4 int) = (r6v3 int), (r6v6 int) binds: [B:10:0x0036, B:7:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:12:0x003c  */
        public Object emit(eh ehVar, ShortNewsContentCardView shortNewsContentCardView) {
            kb kbVar;
            int i;
            int i2 = 2 % 2;
            MapboxMap mapboxMap = (MapboxMap) this.RemoteActionCompatParcelizer;
            MapNavigationImpl mapNavigationImpl = (MapNavigationImpl) this.serializer;
            if (shortNewsContentCardView instanceof kb) {
                int i3 = IconCompatParcelizer + 19;
                MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
                if (i3 % 2 == 0) {
                    kbVar = (kb) shortNewsContentCardView;
                    i = kbVar.write;
                    int i4 = 39 / 0;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kbVar.write = i - Integer.MIN_VALUE;
                    } else {
                        kbVar = new kb(this, shortNewsContentCardView);
                    }
                } else {
                    kbVar = (kb) shortNewsContentCardView;
                    i = kbVar.write;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kbVar.write = i - Integer.MIN_VALUE;
                    } else {
                        kbVar = new kb(this, shortNewsContentCardView);
                    }
                }
            } else {
                kbVar = new kb(this, shortNewsContentCardView);
            }
            Object orThrow = kbVar.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = kbVar.write;
            Object obj = null;
            if (i5 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(orThrow);
                m7 m7Var = mapNavigationImpl.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                f8 f8Var = ehVar.serializer;
                kbVar.write = 1;
                if (m7Var.IconCompatParcelizer == null) {
                    orThrow = instance_delegatelambda0.write;
                } else {
                    SafeContinuation safeContinuation = new SafeContinuation(LoadBalancer$Helper.intercepted(kbVar));
                    MapboxRouteLineApi mapboxRouteLineApiIconCompatParcelizer = m7Var.IconCompatParcelizer();
                    Point pointFromLngLat = Point.fromLngLat(f8Var.read, f8Var.serializer);
                    pointFromLngLat.getClass();
                    float f = m7Var.MediaSessionCompatResultReceiverWrapper;
                    RouteLineApi$findClosestRoute$2$1 routeLineApi$findClosestRoute$2$1 = new RouteLineApi$findClosestRoute$2$1(m7Var, safeContinuation);
                    ContextScope contextScope = mapboxRouteLineApiIconCompatParcelizer.calculationsScope;
                    DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                    BuildersKt.RemoteActionCompatParcelizer(contextScope, MainDispatcherLoader.read, null, new MapboxRouteLineApi$findClosestRoute$1(mapboxMap, routeLineApi$findClosestRoute$2$1, mapboxRouteLineApiIconCompatParcelizer, pointFromLngLat, f, null), 2);
                    orThrow = safeContinuation.getOrThrow();
                }
                if (orThrow == coroutineSingletons) {
                    int i6 = MediaBrowserCompatMediaItem + 69;
                    IconCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    int i8 = IconCompatParcelizer + 55;
                    MediaBrowserCompatMediaItem = i8 % Fields.SpotShadowColor;
                    if (i8 % 2 != 0) {
                        return null;
                    }
                    obj.hashCode();
                    throw null;
                }
                int i9 = MediaBrowserCompatMediaItem + 111;
                IconCompatParcelizer = i9 % Fields.SpotShadowColor;
                int i10 = i9 % 2;
                ExtrasKt.RemoteActionCompatParcelizer(orThrow);
                mapboxMap = mapboxMap;
            }
            mapNavigationImpl.RemoteActionCompatParcelizer((List) orThrow, (MapboxNavigation) this.write, mapboxMap);
            return createFromParcel.INSTANCE;
        }
    }

    public /* synthetic */ GetNestScope$invoke$$inlined$map$1(Flow flow, Object obj, Object obj2, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = flow;
        this.IconCompatParcelizer = obj;
        this.read = obj2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj = this.read;
        Object obj2 = this.IconCompatParcelizer;
        Flow flow = this.serializer;
        switch (i3) {
            case 0:
                Object objCollect = ((FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1) flow).collect(new AnonymousClass2(flowCollector, (getContentViewGroupParentLayout) obj2, (SignInDataStore) obj, 0), shortNewsContentCardView);
                if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i4 = write + 31;
                MediaMetadataCompat = i4 % Fields.SpotShadowColor;
                if (i4 % 2 == 0) {
                    int i5 = 50 / 0;
                }
                return objCollect;
            case 1:
                Object objCollect2 = ((ObserveDivider$invoke$$inlined$extractValue$1) flow).collect(new AnonymousClass2(flowCollector, (SignInDataStore) obj2, (loadAsync) obj, i), shortNewsContentCardView);
                if (objCollect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i6 = MediaMetadataCompat + 11;
                write = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    return objCollect2;
                }
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            case 2:
                Object objCollect3 = flow.collect(new AnonymousClass2(flowCollector, (deleteSurroundingTextInCodePoints) obj2, (getDecimalPjHm6EE) obj, 3), shortNewsContentCardView);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : createfromparcel;
            case 3:
                Object objCollect4 = flow.collect(new AnonymousClass2(flowCollector, (getDecimalPjHm6EE) obj2, (String) obj, 4), shortNewsContentCardView);
                if (objCollect4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return createfromparcel;
                }
                int i7 = MediaMetadataCompat + 107;
                write = i7 % Fields.SpotShadowColor;
                int i8 = i7 % 2;
                return objCollect4;
            case 4:
                Object objCollect5 = ((SettingsViewModel$special$$inlined$map$1) flow).collect(new AnonymousClass2(flowCollector, (SignInDataStore) obj2, (ActionsParams) obj, 5), shortNewsContentCardView);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : createfromparcel;
            case 5:
                Object objCollect6 = flow.collect(new AnonymousClass2(flowCollector, (ConfirmButtonV1UiModelImpl) obj2, (buildCompositionParentHierarchy) obj, 6), shortNewsContentCardView);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : createfromparcel;
            case 6:
                Object objCollect7 = flow.collect(new AnonymousClass2(flowCollector, (r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk) obj2, (String) obj, 7), shortNewsContentCardView);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : createfromparcel;
            case 7:
                Object objCollect8 = ((FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) flow).collect(new AnonymousClass2(flowCollector, (endStream) obj2, (N$b) obj, 8), shortNewsContentCardView);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : createfromparcel;
            default:
                Object objCollect9 = flow.collect(new AnonymousClass2(flowCollector, (CombinedScopeView) obj2, (ExtensionWindowAreaStatusRequirements) obj, 12), shortNewsContentCardView);
                return objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect9 : createfromparcel;
        }
    }
}
