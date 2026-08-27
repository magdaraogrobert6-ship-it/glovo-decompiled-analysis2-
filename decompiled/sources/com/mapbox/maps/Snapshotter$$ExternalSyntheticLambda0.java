package com.mapbox.maps;

import com.huawei.wisesecurity.ucs_credential.g0;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.bindgen.DataRef;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.BillingServiceError;
import com.mapbox.common.EventsServiceResponseCallback;
import com.mapbox.common.LoggingLevel;
import com.mapbox.common.OnBillingServiceError;
import com.mapbox.common.ResourceData;
import com.mapbox.common.ResourceLoadError;
import com.mapbox.common.ResourceLoadResult;
import com.mapbox.common.geofencing.GeofencingError;
import com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.maps.module.telemetry.MapTelemetryImpl;
import com.mapbox.navigation.core.trip.session.NativeSetRouteError;
import com.mapbox.navigation.tripdata.maneuver.model.TurnIconError;
import com.mapbox.navigation.ui.components.maneuver.view.MapboxTurnIconManeuver;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineClearValue;
import com.mapbox.navigation.ui.maps.route.line.model.RouteLineData;
import com.mapbox.navigation.ui.maps.route.line.model.RouteSetValue;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigation.voice.api.MapboxSpeechProvider$WhenMappings;
import com.mapbox.navigator.SetRoutesResult;
import com.sentiance.core.model.events.E$b;
import com.sentiance.okio.c$b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.containsImportantForAccessibilityui;
import o.createFromParcel;
import o.instance_delegatelambda0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Snapshotter$$ExternalSyntheticLambda0 implements StyleImageRemoveUnusedCallback, RenderFrameFinishedCallback, SourceRemovedCallback, StyleDataLoadedCallback, CameraChangedCallback, RenderFrameStartedCallback, StyleLoadedCallback, SourceAddedCallback, SourceDataLoadedCallback, MapLoadingErrorDelegate, Expected.Transformer, EventsServiceResponseCallback, GeofencingUtilsUserConsentResponseCallback, OnBillingServiceError, Expected.Action {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Snapshotter$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) throws Throwable {
        DataRef data;
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        ByteBuffer buffer = null;
        switch (i) {
            case 11:
                return Snapshotter.cameraForCoordinates$lambda$20((String) obj);
            case 12:
            case 13:
            case 16:
            case 17:
            case 18:
            case 24:
            default:
                ResourceLoadResult resourceLoadResult = (ResourceLoadResult) obj;
                resourceLoadResult.getClass();
                int i2 = MapboxSpeechProvider$WhenMappings.$EnumSwitchMapping$0[resourceLoadResult.getStatus().ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        return x.createError("Your token cannot access this resource.");
                    }
                    if (i2 == 3) {
                        return x.createError("Resource is missing.");
                    }
                    return x.createError("Unknown error (status: " + resourceLoadResult.getStatus() + ").");
                }
                ResourceData data2 = resourceLoadResult.getData();
                if (data2 != null && (data = data2.getData()) != null) {
                    buffer = data.getBuffer();
                }
                if (buffer == null) {
                    return x.createError("No data available.");
                }
                Expected expectedCreateValue = ExpectedFactory.createValue(new c$b(buffer));
                expectedCreateValue.getClass();
                return expectedCreateValue;
            case 14:
                String str = (String) obj;
                str.getClass();
                LoggerProviderKt.logE("NavigationRoute", "Failed to parse a route. Reason: ".concat(str));
                return instance_delegatelambda0.write;
            case 15:
                List list = (List) obj;
                list.getClass();
                return list;
            case 19:
                String str2 = (String) obj;
                str2.getClass();
                return new NativeSetRouteError(str2);
            case 20:
                SetRoutesResult setRoutesResult = (SetRoutesResult) obj;
                setRoutesResult.getClass();
                return setRoutesResult.getAlternatives();
            case 21:
                String str3 = (String) obj;
                str3.getClass();
                return new NativeSetRouteError(str3);
            case 22:
                TurnIconError turnIconError = (TurnIconError) obj;
                int i3 = MapboxTurnIconManeuver.$r8$clinit;
                turnIconError.getClass();
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                    LoggerProviderKt.logE(turnIconError.errorMessage, "MapboxTurnIconManeuver");
                }
                return createfromparcel;
            case 23:
                TurnIconError turnIconError2 = (TurnIconError) obj;
                int i4 = MapboxTurnIconManeuver.$r8$clinit;
                turnIconError2.getClass();
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                    LoggerProviderKt.logE(turnIconError2.errorMessage, "MapboxTurnIconManeuver");
                }
                return createfromparcel;
            case 25:
                ((createFromParcel) obj).getClass();
                return ExpectedFactory.createError(new g0(0));
            case 26:
                RouteLineClearValue routeLineClearValue = (RouteLineClearValue) obj;
                routeLineClearValue.getClass();
                RouteLineData routeLineData = new RouteLineData(routeLineClearValue.getPrimaryRouteSource$ui_maps_release(), null);
                List<FeatureCollection> alternativeRoutesSources$ui_maps_release = routeLineClearValue.getAlternativeRoutesSources$ui_maps_release();
                ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(alternativeRoutesSources$ui_maps_release, 10));
                Iterator<T> it = alternativeRoutesSources$ui_maps_release.iterator();
                while (it.hasNext()) {
                    arrayList.add(new RouteLineData((FeatureCollection) it.next(), null));
                }
                return new RouteSetValue(routeLineData, arrayList, routeLineClearValue.getWaypointsSource$ui_maps_release(), routeLineClearValue.getCallouts$ui_maps_release(), null);
            case 27:
                Throwable th = (Throwable) obj;
                th.getClass();
                throw th;
            case 28:
                ResourceLoadError resourceLoadError = (ResourceLoadError) obj;
                resourceLoadError.getClass();
                return x.createError(resourceLoadError.getType() + ": " + resourceLoadError.getMessage());
        }
    }

    @Override // com.mapbox.common.EventsServiceResponseCallback
    public void run(Expected expected) {
        if (this.$r8$classId == 12) {
            MapTelemetryImpl.sendEvent$lambda$2(expected);
            return;
        }
        expected.getClass();
        GeofencingError geofencingError = (GeofencingError) expected.getError();
        if (geofencingError != null) {
            MapboxLogger.logW("GeofencingConsent", "Unable to set user consent: " + geofencingError.getType());
        }
    }

    @Override // com.mapbox.maps.MapLoadingErrorDelegate
    public void sendMapLoadingError(MapLoadingError mapLoadingError) {
        if (this.$r8$classId != 0) {
            mapLoadingError.getClass();
        } else {
            mapLoadingError.getClass();
        }
    }

    public /* synthetic */ Snapshotter$$ExternalSyntheticLambda0(int i, Object obj) {
        this.$r8$classId = i;
    }

    @Override // com.mapbox.maps.CameraChangedCallback
    public void run(CameraChanged cameraChanged) {
        NativeObserver.addOnCameraChangeListener$lambda$2(null, cameraChanged);
    }

    @Override // com.mapbox.maps.RenderFrameFinishedCallback
    public void run(RenderFrameFinished renderFrameFinished) {
        NativeObserver.addOnRenderFrameFinishedListener$lambda$14(null, renderFrameFinished);
    }

    @Override // com.mapbox.maps.RenderFrameStartedCallback
    public void run(RenderFrameStarted renderFrameStarted) {
        NativeObserver.addOnRenderFrameStartedListener$lambda$13(null, renderFrameStarted);
    }

    @Override // com.mapbox.maps.SourceAddedCallback
    public void run(SourceAdded sourceAdded) {
        NativeObserver.addOnSourceAddedListener$lambda$9(null, sourceAdded);
    }

    @Override // com.mapbox.maps.SourceDataLoadedCallback
    public void run(SourceDataLoaded sourceDataLoaded) {
        NativeObserver.addOnSourceDataLoadedListener$lambda$8(null, sourceDataLoaded);
    }

    @Override // com.mapbox.maps.SourceRemovedCallback
    public void run(SourceRemoved sourceRemoved) {
        NativeObserver.addOnSourceRemovedListener$lambda$10(null, sourceRemoved);
    }

    @Override // com.mapbox.maps.StyleDataLoadedCallback
    public void run(StyleDataLoaded styleDataLoaded) {
        NativeObserver.addOnStyleDataLoadedListener$lambda$7(null, styleDataLoaded);
    }

    @Override // com.mapbox.maps.StyleImageRemoveUnusedCallback
    public void run(StyleImageRemoveUnused styleImageRemoveUnused) {
        NativeObserver.addOnStyleImageUnusedListener$lambda$12(null, styleImageRemoveUnused);
    }

    @Override // com.mapbox.maps.StyleLoadedCallback
    public void run(StyleLoaded styleLoaded) {
        NativeObserver.addOnStyleLoadedListener$lambda$6(null, styleLoaded);
    }

    @Override // com.mapbox.bindgen.Expected.Action
    public void run(Object obj) {
        ((containsImportantForAccessibilityui) obj).getClass();
        LoggerProviderKt.logE("An arrow must have at least 2 points.", "MapboxRouteArrowView");
    }

    @Override // com.mapbox.common.OnBillingServiceError
    public void run(BillingServiceError billingServiceError) {
        if (this.$r8$classId != 16) {
            billingServiceError.getClass();
            E$b.handlerError(billingServiceError);
        } else {
            billingServiceError.getClass();
            E$b.handlerError(billingServiceError);
        }
    }
}
