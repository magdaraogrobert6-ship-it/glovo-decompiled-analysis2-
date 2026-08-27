package com.mapbox.navigation.core.reroute;

import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.core.internal.router.GetRouteSignature;
import com.mapbox.navigation.core.telemetry.events.FeedbackEvent;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import o.SimpleItemTouchHelperCallback;
import o.onMove;

/* JADX INFO: loaded from: classes2.dex */
public final class CleanupCARelatedParamsAdapter implements InternalRerouteOptionsAdapter {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CleanupCARelatedParamsAdapter(int i) {
        this.$r8$classId = i;
    }

    @Override // com.mapbox.navigation.core.reroute.InternalRerouteOptionsAdapter
    public final RouteOptions onRouteOptions(RouteOptions routeOptions, RouteOptionsAdapterParams routeOptionsAdapterParams) {
        int i = this.$r8$classId;
        routeOptions.getClass();
        if (i == 0) {
            RouteOptions.Builder builder = routeOptions.toBuilder();
            Map<String, JsonElement> unrecognizedJsonProperties = routeOptions.getUnrecognizedJsonProperties();
            RouteOptions routeOptionsBuild = builder.unrecognizedJsonProperties(unrecognizedJsonProperties != null ? onMove.IconCompatParcelizer(unrecognizedJsonProperties, SQLite.read("current_alternatives", "optimize_alternatives")) : null).build();
            routeOptionsBuild.getClass();
            return routeOptionsBuild;
        }
        try {
            return addContextAndReasonToRequest(routeOptionsAdapterParams.signature, routeOptions);
        } catch (Throwable th) {
            if (!LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                return routeOptions;
            }
            LoggerProviderKt.logE("Unhandled error: " + th + ". Leaving original route options as is", "RerouteContextReasonOptionsAdapter");
            return routeOptions;
        }
    }

    public static RouteOptions addContextAndReasonToRequest(GetRouteSignature getRouteSignature, RouteOptions routeOptions) {
        String str;
        Map<String, JsonElement> unrecognizedJsonProperties = routeOptions.getUnrecognizedJsonProperties();
        if (unrecognizedJsonProperties == null) {
            unrecognizedJsonProperties = SimpleItemTouchHelperCallback.serializer;
        }
        int i = RerouteContextReasonOptionsAdapter$WhenMappings.$EnumSwitchMapping$0[getRouteSignature.reason.ordinal()];
        if (i == 1) {
            return routeOptions;
        }
        if (i == 2) {
            str = "deviation";
        } else {
            if (i != 3) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return null;
            }
            str = "parameters_change";
        }
        LoggerProviderKt.logD("RerouteContextReasonOptionsAdapter", "Adding reroute " + str + " to reroute request");
        RouteOptions.Builder builder = routeOptions.toBuilder();
        Map mapSingletonMap = Collections.singletonMap("context", new JsonPrimitive(FeedbackEvent.REROUTE));
        mapSingletonMap.getClass();
        LinkedHashMap linkedHashMapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(unrecognizedJsonProperties, mapSingletonMap);
        Map mapSingletonMap2 = Collections.singletonMap("reason", new JsonPrimitive(str));
        mapSingletonMap2.getClass();
        RouteOptions routeOptionsBuild = builder.unrecognizedJsonProperties(onMove.RemoteActionCompatParcelizer(linkedHashMapRemoteActionCompatParcelizer, mapSingletonMap2)).build();
        routeOptionsBuild.getClass();
        return routeOptionsBuild;
    }
}
