package com.google.android.gms.internal.mlkit_vision_face;

import androidx.sqlite.SQLite;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.api.directions.v5.models.DirectionsResponse;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.DataRef;
import com.mapbox.navigation.base.internal.CongestionNumericOverride;
import com.mapbox.navigation.base.internal.route.parsing.ResponseToParse;
import com.mapbox.navigation.base.internal.route.parsing.models.DirectionsParsedRouteData;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.DirectionsResponseParsingResult;
import com.mapbox.navigation.base.internal.route.parsing.models.directions.DirectionsRouteModelParsingResult;
import com.sentiance.okio.c$b;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.ensureSubscribedToInAppMessageEvents;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzmq {
    public static final DirectionsResponseParsingResult access$parseDirectionsResponseJava(ResponseToParse responseToParse) throws IOException {
        RouteOptions routeOptionsFromUrl = RouteOptions.fromUrl(new URL(responseToParse.routeRequest));
        routeOptionsFromUrl.getClass();
        DataRef dataRef = responseToParse.responseBody;
        dataRef.getClass();
        ByteBuffer buffer = dataRef.getBuffer();
        buffer.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new c$b(buffer), ensureSubscribedToInAppMessageEvents.write);
        try {
            DirectionsResponse directionsResponseFromJson = DirectionsResponse.fromJson(inputStreamReader);
            inputStreamReader.close();
            directionsResponseFromJson.getClass();
            String str = responseToParse.routerOrigin;
            List<DirectionsRoute> listRoutes = directionsResponseFromJson.routes();
            listRoutes.getClass();
            List<DirectionsRoute> list = listRoutes;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            int i = 0;
            for (Object obj : list) {
                if (i < 0) {
                    SQLite.serializer();
                    throw null;
                }
                DirectionsRoute directionsRouteBuild = directionsResponseFromJson.routes().get(i).toBuilder().requestUuid(directionsResponseFromJson.uuid()).routeIndex(String.valueOf(i)).routeOptions(routeOptionsFromUrl).build();
                directionsRouteBuild.getClass();
                List<DirectionsWaypoint> listWaypoints = directionsResponseFromJson.routes().get(i).waypoints();
                if (listWaypoints == null) {
                    listWaypoints = directionsResponseFromJson.waypoints();
                }
                DirectionsParsedRouteData directionsParsedRouteData = new DirectionsParsedRouteData(directionsRouteBuild, listWaypoints, directionsResponseFromJson.uuid(), routeOptionsFromUrl, i, str, "DIRECTIONS_API");
                arrayList.add(new DirectionsRouteModelParsingResult(directionsParsedRouteData, new x(directionsParsedRouteData, (CongestionNumericOverride) null)));
                i++;
            }
            return new DirectionsResponseParsingResult(arrayList, routeOptionsFromUrl, directionsResponseFromJson.uuid());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{inputStreamReader, th}, sourceInformationContextOfdefault.read());
                throw th2;
            }
        }
    }
}
