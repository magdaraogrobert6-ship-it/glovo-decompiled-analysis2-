package com.mapbox.maps.plugin.locationcomponent;

import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.location.Location;
import com.mapbox.geojson.Point;
import com.roadrunner.delivery.accept.earnings.domain.ObserveMultiplier$invoke$$inlined$map$1$2;
import com.roadrunner.startingarea.domain.NavigateToStartingArea$invoke$$inlined$flatMapLatest$1;
import java.util.Arrays;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultLocationProvider$collectLocationFlow$1$1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
    public final /* synthetic */ LocationComponentPluginImpl $locationConsumer;
    public final /* synthetic */ Flow $locationFlow;
    public final /* synthetic */ int $r8$classId = 1;
    public int label;
    public final /* synthetic */ DefaultLocationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultLocationProvider$collectLocationFlow$1$1(DefaultLocationProvider defaultLocationProvider, Flow flow, LocationComponentPluginImpl locationComponentPluginImpl, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.this$0 = defaultLocationProvider;
        this.$locationFlow = flow;
        this.$locationConsumer = locationComponentPluginImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
        int i = this.$r8$classId;
        LocationComponentPluginImpl locationComponentPluginImpl = this.$locationConsumer;
        Flow flow = this.$locationFlow;
        DefaultLocationProvider defaultLocationProvider = this.this$0;
        return i != 0 ? new DefaultLocationProvider$collectLocationFlow$1$1(defaultLocationProvider, flow, locationComponentPluginImpl, shortNewsContentCardView) : new DefaultLocationProvider$collectLocationFlow$1$1(flow, locationComponentPluginImpl, defaultLocationProvider, shortNewsContentCardView);
    }

    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) obj;
        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) obj2;
        return i != 0 ? ((DefaultLocationProvider$collectLocationFlow$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel) : ((DefaultLocationProvider$collectLocationFlow$1$1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createfromparcel);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        LocationComponentPluginImpl locationComponentPluginImpl = this.$locationConsumer;
        Flow flow = this.$locationFlow;
        DefaultLocationProvider defaultLocationProvider = this.this$0;
        int i2 = 1;
        if (i != 0) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.label;
            if (i3 != 0) {
                if (i3 == 1) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    return createfromparcel;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            ChannelFlowTransformLatest channelFlowTransformLatestRemoteActionCompatParcelizer = FlowKt.RemoteActionCompatParcelizer(defaultLocationProvider.puckBearingFlow, new NavigateToStartingArea$invoke$$inlined$flatMapLatest$1((ShortNewsContentCardView) null, defaultLocationProvider, flow));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(locationComponentPluginImpl, i2);
            this.label = 1;
            return channelFlowTransformLatestRemoteActionCompatParcelizer.collect(anonymousClass2, this) == coroutineSingletons ? coroutineSingletons : createfromparcel;
        }
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 == 1) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                return createfromparcel;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        AnonymousClass2 anonymousClass3 = new AnonymousClass2(locationComponentPluginImpl, defaultLocationProvider);
        this.label = 1;
        Object objCollect = flow.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(anonymousClass3, 1), this);
        if (objCollect != coroutineSingletons2) {
            objCollect = createfromparcel;
        }
        return objCollect == coroutineSingletons2 ? coroutineSingletons2 : createfromparcel;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ LocationComponentPluginImpl $locationConsumer;
        public final /* synthetic */ int $r8$classId;

        public AnonymousClass2(LocationComponentPluginImpl locationComponentPluginImpl, DefaultLocationProvider defaultLocationProvider) {
            this.$r8$classId = 0;
            this.$locationConsumer = locationComponentPluginImpl;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            LocationComponentPluginImpl locationComponentPluginImpl = this.$locationConsumer;
            if (i == 0) {
                Point point = (Point) obj;
                point.getClass();
                locationComponentPluginImpl.onLocationUpdated(new Point[]{point}, null);
                return createfromparcel;
            }
            if (i == 1) {
                double[] dArr = {((Number) obj).doubleValue()};
                LocationPuckManager locationPuckManager = locationComponentPluginImpl.locationPuckManager;
                if (locationPuckManager != null) {
                    LocationPuckManager.updateCurrentBearing$default(locationPuckManager, Arrays.copyOf(dArr, 1), null, 4);
                }
                return createfromparcel;
            }
            Double horizontalAccuracy = ((Location) obj).getHorizontalAccuracy();
            if (horizontalAccuracy != null) {
                double[] dArr2 = {horizontalAccuracy.doubleValue()};
                LocationPuckManager locationPuckManager2 = locationComponentPluginImpl.locationPuckManager;
                if (locationPuckManager2 != null) {
                    locationPuckManager2.updateHorizontalAccuracyRadius(Arrays.copyOf(dArr2, 1));
                }
            }
            return createfromparcel;
        }

        public /* synthetic */ AnonymousClass2(LocationComponentPluginImpl locationComponentPluginImpl, int i) {
            this.$r8$classId = i;
            this.$locationConsumer = locationComponentPluginImpl;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultLocationProvider$collectLocationFlow$1$1(Flow flow, LocationComponentPluginImpl locationComponentPluginImpl, DefaultLocationProvider defaultLocationProvider, ShortNewsContentCardView shortNewsContentCardView) {
        super(2, shortNewsContentCardView);
        this.$locationFlow = flow;
        this.$locationConsumer = locationComponentPluginImpl;
        this.this$0 = defaultLocationProvider;
    }
}
