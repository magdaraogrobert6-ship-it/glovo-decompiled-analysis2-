package com.roadrunner.map.integration.mapbox.navigation;

import androidx.activity.compose.ComposePredictiveBackHandler$launchNewGesture$1$1;
import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.maps.MapboxMap;
import com.mapbox.navigation.core.MapboxNavigation;
import com.mapbox.navigation.core.MapboxNavigation$prepareNavigationForRoutesParsing$2;
import com.roadrunner.auth.data.SignInDataStore$clear$2;
import com.roadrunner.home.nest.config.GetNestScope$invoke$$inlined$map$1;
import com.roadrunner.realtime.domain.GetAppStateImpl$invoke$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.hf;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes3.dex */
public final class MapNavigationImpl$processFlows$2$1$1$2 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final /* synthetic */ MapboxMap IconCompatParcelizer;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public int read;
    public final /* synthetic */ MapNavigationImpl serializer;
    public final /* synthetic */ MapboxNavigation write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapNavigationImpl$processFlows$2$1$1$2(MapNavigationImpl mapNavigationImpl, MapboxNavigation mapboxNavigation, MapboxMap mapboxMap, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(2, shortNewsContentCardView);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = mapNavigationImpl;
        this.write = mapboxNavigation;
        this.IconCompatParcelizer = mapboxMap;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return ((com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2) create(r6, r7)).invokeSuspend(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        r6 = ((com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2) create(r6, r7)).invokeSuspend(r3);
        r7 = com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2.RatingCompat + 39;
        com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2.MediaSessionCompatQueueItem = r7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (r1 != 1) goto L11;
     */
    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r6, java.lang.Object r7) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2.RatingCompat
            int r1 = r1 + 119
            int r2 = r1 % 128
            com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2.MediaSessionCompatQueueItem = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L20
            int r1 = r5.RemoteActionCompatParcelizer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r6 = (o.getContentViewGroupParentLayout) r6
            o.ShortNewsContentCardView r7 = (o.ShortNewsContentCardView) r7
            r4 = 8
            int r4 = r4 / 0
            if (r1 == 0) goto L4b
            if (r1 == r2) goto L37
            goto L2c
        L20:
            int r1 = r5.RemoteActionCompatParcelizer
            o.createFromParcel r3 = o.createFromParcel.INSTANCE
            o.getContentViewGroupParentLayout r6 = (o.getContentViewGroupParentLayout) r6
            o.ShortNewsContentCardView r7 = (o.ShortNewsContentCardView) r7
            if (r1 == 0) goto L4b
            if (r1 == r2) goto L37
        L2c:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2 r6 = (com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2) r6
            java.lang.Object r6 = r6.invokeSuspend(r3)
            return r6
        L37:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2 r6 = (com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2) r6
            java.lang.Object r6 = r6.invokeSuspend(r3)
            int r7 = com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2.RatingCompat
            int r7 = r7 + 39
            int r1 = r7 % 128
            com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2.MediaSessionCompatQueueItem = r1
            int r7 = r7 % r0
            return r6
        L4b:
            o.ShortNewsContentCardView r6 = r5.create(r6, r7)
            com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2 r6 = (com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2) r6
            java.lang.Object r6 = r6.invokeSuspend(r3)
            int r7 = com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2.MediaSessionCompatQueueItem
            int r7 = r7 + 81
            int r1 = r7 % 128
            com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2.RatingCompat = r1
            int r7 = r7 % r0
            if (r7 == 0) goto L61
            return r6
        L61:
            r6 = 0
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.roadrunner.map.integration.mapbox.navigation.MapNavigationImpl$processFlows$2$1$1$2.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = RatingCompat + 95;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        if (i4 == 0) {
            return new MapNavigationImpl$processFlows$2$1$1$2(this.serializer, this.write, this.IconCompatParcelizer, shortNewsContentCardView, 0);
        }
        if (i4 != 1) {
            return new MapNavigationImpl$processFlows$2$1$1$2(this.serializer, this.write, this.IconCompatParcelizer, shortNewsContentCardView, 2);
        }
        MapNavigationImpl$processFlows$2$1$1$2 mapNavigationImpl$processFlows$2$1$1$2 = new MapNavigationImpl$processFlows$2$1$1$2(this.serializer, this.write, this.IconCompatParcelizer, shortNewsContentCardView, 1);
        int i5 = MediaSessionCompatQueueItem + 109;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return mapNavigationImpl$processFlows$2$1$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        MapboxMap mapboxMap = this.IconCompatParcelizer;
        MapboxNavigation mapboxNavigation = this.write;
        MapNavigationImpl mapNavigationImpl = this.serializer;
        Object obj2 = createFromParcel.INSTANCE;
        Object obj3 = null;
        if (i2 == 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.read;
            if (i3 == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                this.read = 1;
                mapNavigationImpl.getClass();
                mapboxNavigation.getClass();
                Object objCollect = new FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1(new SignInDataStore$clear$2(2, 14, null), new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(FlowKt.write(new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, null, 7)), mapNavigationImpl.RemoteActionCompatParcelizer, new ComposePredictiveBackHandler$launchNewGesture$1$1(3, 3, null))).collect(new MapNavigationImpl$collectRoutesUpdated$$inlined$filter$1$2(new MapNavigationImpl$collectRouteProgress$2(mapNavigationImpl, mapboxMap, 2), mapboxNavigation, 0), this);
                if (objCollect != coroutineSingletons) {
                    objCollect = obj2;
                }
                if (objCollect != coroutineSingletons) {
                    objCollect = obj2;
                }
                if (objCollect == coroutineSingletons) {
                    int i4 = MediaSessionCompatQueueItem + 63;
                    RatingCompat = i4 % Fields.SpotShadowColor;
                    int i5 = i4 % 2;
                    obj2 = coroutineSingletons;
                }
            } else if (i3 == 1) {
                int i6 = MediaSessionCompatQueueItem + 111;
                RatingCompat = i6 % Fields.SpotShadowColor;
                if (i6 % 2 == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    int i7 = 46 / 0;
                } else {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
            } else {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                obj2 = null;
            }
            int i8 = MediaSessionCompatQueueItem + 83;
            RatingCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return obj2;
        }
        if (i2 != 1) {
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.read;
            if (i10 != 0) {
                int i11 = MediaSessionCompatQueueItem + 99;
                RatingCompat = i11 % Fields.SpotShadowColor;
                if (i11 % 2 != 0 ? i10 != 1 : i10 != 0) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return obj2;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.read = 1;
            mapNavigationImpl.getClass();
            mapboxNavigation.getClass();
            Object objCollect2 = ((ChannelFlow) FlowKt.write(new MapboxNavigation$prepareNavigationForRoutesParsing$2(mapboxNavigation, null, 6))).collect(new MapNavigationImpl$collectRouteProgress$2(mapNavigationImpl, mapboxMap, 0), this);
            if (objCollect2 != coroutineSingletons2) {
                objCollect2 = obj2;
            }
            if (objCollect2 != coroutineSingletons2) {
                return obj2;
            }
            int i12 = RatingCompat + 71;
            MediaSessionCompatQueueItem = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            return coroutineSingletons2;
        }
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = this.read;
        if (i14 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.read = 1;
            SharedFlowImpl sharedFlowImpl = ((hf) mapNavigationImpl._init_lambda4).MediaDescriptionCompat;
            GetNestScope$invoke$$inlined$map$1.AnonymousClass2 anonymousClass2 = new GetNestScope$invoke$$inlined$map$1.AnonymousClass2(new GetAppStateImpl$invoke$$inlined$map$1.AnonymousClass2(new GetNestScope$invoke$$inlined$map$1.AnonymousClass2(mapNavigationImpl, mapboxMap, mapboxNavigation, 10), 5), mapboxNavigation, mapNavigationImpl, 9);
            sharedFlowImpl.getClass();
            Object objCollect$suspendImpl = SharedFlowImpl.collect$suspendImpl(sharedFlowImpl, anonymousClass2, this);
            if (objCollect$suspendImpl != coroutineSingletons3) {
                objCollect$suspendImpl = obj2;
            }
            if (objCollect$suspendImpl != coroutineSingletons3) {
                objCollect$suspendImpl = obj2;
            }
            if (objCollect$suspendImpl != coroutineSingletons3) {
                objCollect$suspendImpl = obj2;
            }
            return objCollect$suspendImpl == coroutineSingletons3 ? coroutineSingletons3 : obj2;
        }
        int i15 = MediaSessionCompatQueueItem;
        int i16 = i15 + 71;
        RatingCompat = i16 % Fields.SpotShadowColor;
        int i17 = i16 % 2;
        if (i14 != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            int i18 = RatingCompat + 13;
            MediaSessionCompatQueueItem = i18 % Fields.SpotShadowColor;
            int i19 = i18 % 2;
            return null;
        }
        int i20 = i15 + 7;
        RatingCompat = i20 % Fields.SpotShadowColor;
        if (i20 % 2 != 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj2;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        obj3.hashCode();
        throw null;
    }
}
