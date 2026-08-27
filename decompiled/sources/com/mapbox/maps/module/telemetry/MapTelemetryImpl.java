package com.mapbox.maps.module.telemetry;

import android.content.Context;
import android.os.Bundle;
import bo.app.d$$ExternalSyntheticOutline0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.common.Event;
import com.mapbox.common.EventPriority;
import com.mapbox.common.EventsServerOptions;
import com.mapbox.common.EventsService;
import com.mapbox.common.EventsServiceInterface;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.TelemetryCollectionState;
import com.mapbox.common.TelemetryService;
import com.mapbox.common.TelemetryUtils;
import com.mapbox.common.TurnstileEvent;
import com.mapbox.common.UserSKUIdentifier;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda0;
import com.mapbox.maps.module.MapTelemetry;
import io.sentry.util.UrlUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getInAppMessageViewLifecycleListener;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;

/* JADX INFO: loaded from: classes4.dex */
public final class MapTelemetryImpl implements MapTelemetry {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = "MapTelemetryImpl";
    private final Context appContext;
    private final getContentViewGroupParentLayout bgScope;
    private final EventsServiceInterface eventsService;
    private final EventsServerOptions eventsServiceOptions;
    private final TelemetryService telemetryService;

    /* JADX INFO: renamed from: com.mapbox.maps.module.telemetry.MapTelemetryImpl$sendMapLoadEvent$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return MapTelemetryImpl.this.new AnonymousClass1(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            try {
                MapLoadEvent mapLoadEventBuildMapLoadEvent = MapEventFactory.INSTANCE.buildMapLoadEvent(new PhoneState(MapTelemetryImpl.this.appContext));
                MapTelemetryImpl mapTelemetryImpl = MapTelemetryImpl.this;
                String json = new Gson().toJson(mapLoadEventBuildMapLoadEvent);
                json.getClass();
                mapTelemetryImpl.sendEvent(json);
            } catch (Throwable th) {
                MapboxLogger.logW(MapTelemetryImpl.TAG, "sendMapLoadEvent error: " + th);
            }
            return createFromParcel.INSTANCE;
        }

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void disableTelemetrySession() {
        enableTelemetryCollection(false);
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void setUserTelemetryRequestState(boolean z) {
        enableTelemetryCollection(z);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MapTelemetryImpl(Context context) {
        context.getClass();
        this.appContext = context;
        EventsServerOptions eventsServerOptions = new EventsServerOptions(new SdkInformation(com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_IDENTIFIER, com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_VERSION, null), null);
        this.eventsServiceOptions = eventsServerOptions;
        EventsService orCreate = EventsService.getOrCreate(eventsServerOptions);
        orCreate.getClass();
        this.eventsService = orCreate;
        TelemetryService orCreate2 = TelemetryService.getOrCreate();
        orCreate2.getClass();
        this.telemetryService = orCreate2;
        TextAnnouncementContentCardView textAnnouncementContentCardViewPlus = new getInAppMessageViewLifecycleListener(TAG).plus(UrlUtils.serializer());
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        this.bgScope = YieldKt.RemoteActionCompatParcelizer(textAnnouncementContentCardViewPlus.plus(DefaultIoScheduler.RemoteActionCompatParcelizer));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enableTelemetryCollection$lambda$3(Expected expected) {
        expected.getClass();
        if (expected.isError()) {
            MapboxLogger.logE(TAG, "setEventsCollectionState error: " + expected.getError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAppUserTurnstileEvent$lambda$0(Expected expected) {
        expected.getClass();
        if (expected.isError()) {
            MapboxLogger.logE(TAG, "sendTurnstileEvent error: " + expected.getError());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendEvent$lambda$2(Expected expected) {
        expected.getClass();
        if (expected.isError()) {
            MapboxLogger.logE(TAG, "sendEvent error: " + expected.getError());
        }
    }

    private final void enableTelemetryCollection(boolean z) {
        TelemetryUtils.setEventsCollectionState(z, new r8lambdayUqGVEpC1kg8ua3jc9a113shNIE(13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(String str) {
        Expected<String, Value> expectedFromJson = Value.fromJson(str);
        expectedFromJson.getClass();
        Value value = expectedFromJson.getValue();
        Event event = value != null ? new Event(EventPriority.QUEUED, value, null) : null;
        if (event != null) {
            this.eventsService.sendEvent(event, new Snapshotter$$ExternalSyntheticLambda0(12));
        }
    }

    private final boolean shouldSendEvents() {
        return TelemetryUtils.getClientServerEventsCollectionState() != TelemetryCollectionState.TURNSTILE_EVENTS_ONLY;
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void onAppUserTurnstileEvent() {
        this.eventsService.sendTurnstileEvent(new TurnstileEvent(UserSKUIdentifier.MAPS_MAUS), new r8lambdayUqGVEpC1kg8ua3jc9a113shNIE(12));
        if (shouldSendEvents()) {
            sendMapLoadEvent();
        }
    }

    private final void sendMapLoadEvent() {
        BuildersKt.RemoteActionCompatParcelizer(this.bgScope, null, null, new AnonymousClass1(null), 3);
    }

    @Override // com.mapbox.maps.module.MapTelemetry
    public void onPerformanceEvent(Bundle bundle) {
        if (shouldSendEvents()) {
            MapEventFactory mapEventFactory = MapEventFactory.INSTANCE;
            PhoneState phoneState = new PhoneState(this.appContext);
            String strM = d$$ExternalSyntheticOutline0.m();
            if (bundle == null) {
                bundle = new Bundle();
            }
            String json = new Gson().toJson(mapEventFactory.buildPerformanceEvent(phoneState, strM, bundle));
            json.getClass();
            sendEvent(json);
        }
    }

    public MapTelemetryImpl(Context context, EventsServiceInterface eventsServiceInterface, TelemetryService telemetryService, EventsServerOptions eventsServerOptions, CoroutineDispatcher coroutineDispatcher) {
        context.getClass();
        eventsServiceInterface.getClass();
        telemetryService.getClass();
        eventsServerOptions.getClass();
        coroutineDispatcher.getClass();
        this.appContext = context;
        this.eventsService = eventsServiceInterface;
        this.telemetryService = telemetryService;
        this.eventsServiceOptions = eventsServerOptions;
        this.bgScope = YieldKt.RemoteActionCompatParcelizer(new getInAppMessageViewLifecycleListener(TAG).plus(UrlUtils.serializer()).plus(coroutineDispatcher));
    }
}
