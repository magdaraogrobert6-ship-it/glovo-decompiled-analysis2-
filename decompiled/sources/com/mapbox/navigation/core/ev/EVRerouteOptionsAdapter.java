package com.mapbox.navigation.core.ev;

import androidx.sqlite.SQLite;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzmi;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.re2j.Parser;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigation.base.route.NavigationRoute;
import com.mapbox.navigation.base.trip.model.RouteProgress;
import com.mapbox.navigation.core.reroute.CleanupCARelatedParamsAdapter;
import com.mapbox.navigation.core.reroute.InternalRerouteOptionsAdapter;
import com.mapbox.navigation.core.reroute.RouteOptionsAdapterParams;
import com.mapbox.navigation.core.trip.session.MapboxTripSession;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import com.mapbox.navigator.RouteInterface;
import com.mapbox.search.SearchOptionsKt$validateLimit$1;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.SimpleItemTouchHelperCallback;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.onMove;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class EVRerouteOptionsAdapter implements InternalRerouteOptionsAdapter {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object evDynamicDataHolder;

    public EVRerouteOptionsAdapter(Parser.Pair pair, EVRerouteOptionsAdapter eVRerouteOptionsAdapter, CleanupCARelatedParamsAdapter cleanupCARelatedParamsAdapter, CleanupCARelatedParamsAdapter cleanupCARelatedParamsAdapter2) {
        pair.getClass();
        this.evDynamicDataHolder = SQLite.read(new EVRerouteOptionsAdapter(pair), eVRerouteOptionsAdapter, cleanupCARelatedParamsAdapter, cleanupCARelatedParamsAdapter2);
    }

    @Override // com.mapbox.navigation.core.reroute.InternalRerouteOptionsAdapter
    public final RouteOptions onRouteOptions(RouteOptions routeOptions, RouteOptionsAdapterParams routeOptionsAdapterParams) {
        int i = this.$r8$classId;
        Object obj = this.evDynamicDataHolder;
        routeOptions.getClass();
        if (i != 0) {
            if (i == 1) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    routeOptions = ((InternalRerouteOptionsAdapter) it.next()).onRouteOptions(routeOptions, routeOptionsAdapterParams);
                }
                if (LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.INFO)) {
                    LoggerProviderKt.logI("Initial options for reroute: " + routeOptions.toUrl("***"), "MapboxRerouteOptionsAdapter");
                }
                return routeOptions;
            }
            try {
                return onRouteOptionsInternal(routeOptions);
            } catch (Throwable th) {
                if (!LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                    return routeOptions;
                }
                LoggerProviderKt.logE("Unhandled error: " + th + ". Leaving original route options as is", "RouteHistoryOptionsAdapter");
                return routeOptions;
            }
        }
        if (!zzmi.isEVRoute(routeOptions.getUnrecognizedJsonProperties())) {
            return routeOptions;
        }
        Parser.Pair pair = (Parser.Pair) obj;
        Map<String, JsonElement> unrecognizedJsonProperties = routeOptions.getUnrecognizedJsonProperties();
        if (unrecognizedJsonProperties == null) {
            unrecognizedJsonProperties = SimpleItemTouchHelperCallback.serializer;
        }
        HashMap mapCurrentData = pair.currentData(unrecognizedJsonProperties);
        LinkedHashMap linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(mapCurrentData.size()));
        for (Map.Entry entry : mapCurrentData.entrySet()) {
            linkedHashMap.put(entry.getKey(), new JsonPrimitive((String) entry.getValue()));
        }
        Map<String, JsonElement> map = new HashMap<>(linkedHashMap);
        RouteOptions.Builder builder = routeOptions.toBuilder();
        Map<String, JsonElement> unrecognizedJsonProperties2 = routeOptions.getUnrecognizedJsonProperties();
        if (unrecognizedJsonProperties2 != null) {
            unrecognizedJsonProperties2.putAll(map);
        } else {
            unrecognizedJsonProperties2 = null;
        }
        if (unrecognizedJsonProperties2 != null) {
            map = unrecognizedJsonProperties2;
        }
        RouteOptions routeOptionsBuild = builder.unrecognizedJsonProperties(map).build();
        routeOptionsBuild.getClass();
        return routeOptionsBuild;
    }

    public RouteOptions onRouteOptionsInternal(RouteOptions routeOptions) {
        String strConcat;
        RouteProgress routeProgress = ((MapboxTripSession) ((SearchOptionsKt$validateLimit$1) this.evDynamicDataHolder).$limit).routeProgress;
        if (routeProgress != null) {
            NavigationRoute navigationRoute = routeProgress.navigationRoute;
            String str = navigationRoute.origin;
            RouteInterface routeInterface = navigationRoute.nativeRoute;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, "ONLINE"}, getCieXyz.write())).booleanValue()) {
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{navigationRoute.responseOriginAPI, "DIRECTIONS_API"}, getCieXyz.write())).booleanValue()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{routeOptions.profile(), "driving-traffic"}, getCieXyz.write())).booleanValue()) {
                        String responseUuid = routeInterface.getResponseUuid();
                        responseUuid.getClass();
                        int routeIndex = routeInterface.getRouteIndex();
                        int i = routeProgress.currentRouteGeometryIndex;
                        Map<String, JsonElement> unrecognizedJsonProperties = routeOptions.getUnrecognizedJsonProperties();
                        if (unrecognizedJsonProperties == null) {
                            unrecognizedJsonProperties = SimpleItemTouchHelperCallback.serializer;
                        }
                        JsonElement jsonElement = unrecognizedJsonProperties.get("routes_history");
                        if (jsonElement != null) {
                            String asString = jsonElement.getAsString();
                            asString.getClass();
                            strConcat = ";".concat(onContentCardDismissed.IconCompatParcelizer(onContentCardDismissed.read(hideCurrentlyDisplayingInAppMessage.serializer(asString, new String[]{";"}, 6), 9), ";", null, null, new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM(1) { // from class: com.mapbox.navigation.core.reroute.RouteHistoryOptionsAdapter$addCurrentRouteToHistory$previousHistory$1$1
                                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                                public final Object invoke(Object obj) {
                                    String str2 = (String) obj;
                                    str2.getClass();
                                    return str2;
                                }
                            }, 30));
                        } else {
                            strConcat = null;
                        }
                        if (strConcat == null) {
                            strConcat = "";
                        }
                        StringBuilder sbM = m1$$ExternalSyntheticOutline0.m("Adding uuid=[", routeIndex, responseUuid, "], routeIndex=[", "], geometryIndex=[");
                        sbM.append(i);
                        sbM.append("] to history");
                        LoggerProviderKt.logD("RouteHistoryOptionsAdapter", sbM.toString());
                        RouteOptions.Builder builder = routeOptions.toBuilder();
                        Map mapSingletonMap = Collections.singletonMap("routes_history", new JsonPrimitive(responseUuid + ',' + routeIndex + ',' + i + strConcat));
                        mapSingletonMap.getClass();
                        RouteOptions routeOptionsBuild = builder.unrecognizedJsonProperties(onMove.RemoteActionCompatParcelizer(unrecognizedJsonProperties, mapSingletonMap)).build();
                        routeOptionsBuild.getClass();
                        return routeOptionsBuild;
                    }
                }
            }
        }
        return routeOptions;
    }

    public EVRerouteOptionsAdapter(SearchOptionsKt$validateLimit$1 searchOptionsKt$validateLimit$1) {
        this.evDynamicDataHolder = searchOptionsKt$validateLimit$1;
    }

    public EVRerouteOptionsAdapter(Parser.Pair pair) {
        pair.getClass();
        this.evDynamicDataHolder = pair;
    }
}
