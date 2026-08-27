package com.mapbox.maps.plugin.locationcomponent;

import android.content.Context;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.room.Room;
import coil3.RealImageLoader$execute$2$job$1;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.location.AccuracyLevel;
import com.mapbox.common.location.DeviceLocationProvider;
import com.mapbox.common.location.IntervalSettings;
import com.mapbox.common.location.LocationError;
import com.mapbox.common.location.LocationErrorCode;
import com.mapbox.common.location.LocationProviderRequest;
import com.mapbox.common.location.LocationService;
import com.mapbox.common.location.LocationServiceFactory;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.plugin.PuckBearing;
import com.roadrunner.auth.data.SignInDataStore$set$2;
import io.sentry.util.UrlUtils;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getStringId9Hzcbyc;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultLocationProvider implements LocationProvider {
    public final Flow deviceOrientationFlow;
    public final LocationCompassEngine locationCompassEngine;
    public final ConcurrentHashMap locationConsumersJobs;
    public final LocationError locationProviderNotAvailable;
    public final Flow locationUpdatesFlow;
    public final MainCoroutineDispatcher mainCoroutineDispatcher;
    public final MutableStateFlow puckBearingFlow;

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        public final /* synthetic */ Object $applicationContext;
        public final /* synthetic */ Object $locationProvider;
        public final /* synthetic */ int $r8$classId = 0;
        public long J$0;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, getStringId9Hzcbyc getstringid9hzcbyc, long j, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$applicationContext = contentInViewNode;
            this.$locationProvider = updatableAnimationState;
            this.this$0 = getstringid9hzcbyc;
            this.J$0 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView create(Object obj, ShortNewsContentCardView shortNewsContentCardView) {
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            Object obj3 = this.$locationProvider;
            Object obj4 = this.$applicationContext;
            if (i != 0) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((ContentInViewNode) obj4, (UpdatableAnimationState) obj3, (getStringId9Hzcbyc) obj2, this.J$0, shortNewsContentCardView);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }
            AnonymousClass1 anonymousClass2 = new AnonymousClass1((Context) obj4, (DeviceLocationProvider) obj3, (DefaultLocationProvider) obj2, shortNewsContentCardView);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(Object obj, Object obj2) {
            int i = this.$r8$classId;
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            return i != 0 ? ((AnonymousClass1) create((getContentViewGroupParentLayout) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel) : ((AnonymousClass1) create((InAppMessageBackEventHandler1inAppMessageBackAnimationCallback1) obj, (ShortNewsContentCardView) obj2)).invokeSuspend(createfromparcel);
        }

        /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0117, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(r5, r21) == r0) goto L59;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0117 -> B:61:0x011b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 294
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, DeviceLocationProvider deviceLocationProvider, DefaultLocationProvider defaultLocationProvider, ShortNewsContentCardView shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$applicationContext = context;
            this.$locationProvider = deviceLocationProvider;
            this.this$0 = defaultLocationProvider;
        }
    }

    public DefaultLocationProvider(Context context) {
        Flow flowSerializer;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        LocationCompassEngine locationCompassEngine = new LocationCompassEngine(applicationContext);
        LocationService orCreate = LocationServiceFactory.getOrCreate();
        orCreate.getClass();
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        MainCoroutineDispatcher mainCoroutineDispatcherIconCompatParcelizer = MainDispatcherLoader.read.IconCompatParcelizer();
        mainCoroutineDispatcherIconCompatParcelizer.getClass();
        this.locationCompassEngine = locationCompassEngine;
        this.mainCoroutineDispatcher = mainCoroutineDispatcherIconCompatParcelizer;
        ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(Room.read(UrlUtils.serializer(), mainCoroutineDispatcherIconCompatParcelizer));
        this.puckBearingFlow = StateFlowKt.read(PuckBearing.COURSE);
        this.deviceOrientationFlow = FlowKt.read(FlowKt.write(new RealImageLoader$execute$2$job$1(this, (ShortNewsContentCardView) null, 17)), contextScopeRemoteActionCompatParcelizer, SharingStarted.Companion.read(1));
        this.locationConsumersJobs = new ConcurrentHashMap();
        Expected<LocationError, DeviceLocationProvider> deviceLocationProvider = orCreate.getDeviceLocationProvider(new LocationProviderRequest.Builder().accuracy(AccuracyLevel.HIGH).interval(new IntervalSettings.Builder().minimumInterval(1000L).interval(1000L).build()).displacement(Float.valueOf(0.1f)).build());
        if (deviceLocationProvider.isValue()) {
            Context applicationContext2 = context.getApplicationContext();
            DeviceLocationProvider value = deviceLocationProvider.getValue();
            value.getClass();
            flowSerializer = FlowKt.read(FlowKt.write(new AnonymousClass1(applicationContext2, value, this, null)), contextScopeRemoteActionCompatParcelizer, SharingStarted.Companion.read(1));
        } else {
            LocationError error = deviceLocationProvider.getError();
            error.getClass();
            MapboxLogger.logE("MapboxLocationProvider", "LocationService error: " + error);
            this.locationProviderNotAvailable = new LocationError(LocationErrorCode.NOT_AVAILABLE, "LiveTrackingClient not available");
            flowSerializer = FlowKt.serializer();
        }
        this.locationUpdatesFlow = flowSerializer;
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationProvider
    public final void unRegisterLocationConsumer(LocationComponentPluginImpl locationComponentPluginImpl) {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.locationConsumersJobs.remove(locationComponentPluginImpl);
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
    }

    @Override // com.mapbox.maps.plugin.locationcomponent.LocationProvider
    public final void registerLocationConsumer(LocationComponentPluginImpl locationComponentPluginImpl) {
        LocationError locationError = this.locationProviderNotAvailable;
        if (locationError != null) {
            if (locationComponentPluginImpl.locationPuckManager != null) {
                MapboxLogger.logW("LocationPuckManager", "Location error: " + locationError);
                return;
            }
            return;
        }
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) this.locationConsumersJobs.put(locationComponentPluginImpl, BuildersKt.RemoteActionCompatParcelizer(YieldKt.RemoteActionCompatParcelizer(Room.read(JobKt.RemoteActionCompatParcelizer(), this.mainCoroutineDispatcher)), null, null, new SignInDataStore$set$2(this, locationComponentPluginImpl, (ShortNewsContentCardView) null, 8), 3));
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
    }
}
