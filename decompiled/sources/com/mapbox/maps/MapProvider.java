package com.mapbox.maps;

import android.content.Context;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.annotation.module.MapboxModuleType;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.EventsServerOptions;
import com.mapbox.common.EventsService;
import com.mapbox.common.SdkInformation;
import com.mapbox.common.TelemetryService;
import com.mapbox.common.module.provider.MapboxModuleProvider;
import com.mapbox.common.module.provider.ModuleProviderArgument;
import com.mapbox.maps.geofencing.MapGeofencingConsent;
import com.mapbox.maps.module.MapTelemetry;
import com.mapbox.maps.plugin.MapDelegateProviderImpl;
import com.mapbox.maps.plugin.MapPluginRegistry;
import io.sentry.util.UrlUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.TextAnnouncementContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.getInAppMessageViewLifecycleListener;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class MapProvider {
    public static final MapProvider INSTANCE = new MapProvider();
    private static final getContentViewGroupParentLayout mainScope;
    private static MapTelemetry mapTelemetry;

    /* JADX INFO: renamed from: com.mapbox.maps.MapProvider$getMapTelemetryInstance$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        int label;

        public AnonymousClass3(ShortNewsContentCardView<? super AnonymousClass3> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new AnonymousClass3(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            MapTelemetry mapTelemetry = MapProvider.mapTelemetry;
            if (mapTelemetry != null) {
                mapTelemetry.onAppUserTurnstileEvent();
                return createFromParcel.INSTANCE;
            }
            removeNodeAtDepth.serializer("mapTelemetry");
            throw null;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass3) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    private MapProvider() {
    }

    private final MapController getController(MapView mapView) {
        return mapView.getMapController$maps_sdk_release();
    }

    static {
        TextAnnouncementContentCardView textAnnouncementContentCardViewPlus = new getInAppMessageViewLifecycleListener(MapController.TAG).plus(UrlUtils.serializer());
        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
        mainScope = YieldKt.RemoteActionCompatParcelizer(textAnnouncementContentCardViewPlus.plus(MainDispatcherLoader.read));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ModuleProviderArgument[] paramsProvider(Context context, MapboxModuleType mapboxModuleType) {
        if (WhenMappings.$EnumSwitchMapping$0[mapboxModuleType.ordinal()] == 1) {
            return new ModuleProviderArgument[]{new ModuleProviderArgument(Context.class, context.getApplicationContext())};
        }
        throw new IllegalArgumentException(mapboxModuleType.name() + " module is not supported by the Maps SDK");
    }

    public final MapGeofencingConsent getMapGeofencingConsent() {
        return new MapGeofencingConsentImpl();
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MapboxModuleType.values().length];
            try {
                iArr[MapboxModuleType.MapTelemetry.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flushPendingEvents$lambda$1(Expected expected) {
        expected.getClass();
        String str = (String) expected.getError();
        if (str != null) {
            MapboxLogger.logW(MapController.TAG, "EventsService flush error: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flushPendingEvents$lambda$3(Expected expected) {
        expected.getClass();
        String str = (String) expected.getError();
        if (str != null) {
            MapboxLogger.logW(MapController.TAG, "TelemetryService flush error: ".concat(str));
        }
    }

    public final MapPluginRegistry getMapPluginRegistry(MapboxMap mapboxMap, MapController mapController, MapTelemetry mapTelemetry2, MapGeofencingConsent mapGeofencingConsent) {
        mapboxMap.getClass();
        mapController.getClass();
        mapTelemetry2.getClass();
        mapGeofencingConsent.getClass();
        return new MapPluginRegistry(new MapDelegateProviderImpl(mapboxMap, mapController, mapTelemetry2, mapGeofencingConsent));
    }

    public final MapTelemetry getMapTelemetryInstance(final Context context) {
        context.getClass();
        if (mapTelemetry == null) {
            mapTelemetry = (MapTelemetry) MapboxModuleProvider.INSTANCE.createModule(MapboxModuleType.MapTelemetry, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.MapProvider.getMapTelemetryInstance.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public final ModuleProviderArgument[] invoke(MapboxModuleType mapboxModuleType) {
                    mapboxModuleType.getClass();
                    return MapProvider.INSTANCE.paramsProvider(context, MapboxModuleType.MapTelemetry);
                }
            });
        }
        BuildersKt.RemoteActionCompatParcelizer(mainScope, null, null, new AnonymousClass3(null), 3);
        MapTelemetry mapTelemetry2 = mapTelemetry;
        if (mapTelemetry2 != null) {
            return mapTelemetry2;
        }
        removeNodeAtDepth.serializer("mapTelemetry");
        throw null;
    }

    public final MapboxMap getMapboxMap(NativeMapImpl nativeMapImpl, NativeObserver nativeObserver, float f) {
        nativeMapImpl.getClass();
        nativeObserver.getClass();
        return MapboxMap.Companion.invoke$maps_sdk_release(nativeMapImpl, nativeObserver, f);
    }

    public final Map getNativeMapCore(MapView mapView) {
        mapView.getClass();
        return getController(mapView).getNativeMap().getMap();
    }

    public final NativeMapImpl getNativeMapWrapper(MapInitOptions mapInitOptions, MapClient mapClient) {
        mapInitOptions.getClass();
        mapClient.getClass();
        return new NativeMapImpl(new Map(mapClient, mapInitOptions.getMapOptions()));
    }

    public final void flushPendingEvents() {
        EventsService.getOrCreate(new EventsServerOptions(new SdkInformation(com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_IDENTIFIER, com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_VERSION, null), null)).flush(new MapboxMap$$ExternalSyntheticLambda0(21));
        TelemetryService.getOrCreate().flush(new MapboxMap$$ExternalSyntheticLambda0(22));
    }
}
