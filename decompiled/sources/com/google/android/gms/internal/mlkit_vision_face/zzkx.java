package com.google.android.gms.internal.mlkit_vision_face;

import androidx.collection.ObjectList$toString$1;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.DirectionsRouteFBWrapper;
import com.mapbox.api.directions.v5.models.utils.FlatbuffersListWrapper;
import com.mapbox.bindgen.DataRef;
import com.mapbox.common.LoggingLevel;
import com.mapbox.directions.generated.route_request.IntersectionDistances;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigation.utils.internal.LoggingLevelUtilKt;
import java.nio.ByteBuffer;
import java.util.List;
import o.instance_delegatelambda0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzkx {
    public static final List getIntersectionsDistancesFromNroOrNull(DirectionsRoute directionsRoute) {
        directionsRoute.getClass();
        if (!(directionsRoute instanceof DirectionsRouteFBWrapper)) {
            return null;
        }
        try {
            DataRef intersectionsDistances = ((DirectionsRouteFBWrapper) directionsRoute).getContext().getIntersectionsDistances(20.0d);
            IntersectionDistances.Companion companion = IntersectionDistances.Companion;
            ByteBuffer buffer = intersectionsDistances.getBuffer();
            buffer.getClass();
            IntersectionDistances rootAsIntersectionDistances = companion.getRootAsIntersectionDistances(buffer);
            List list = FlatbuffersListWrapper.INSTANCE.get(rootAsIntersectionDistances.getLegsLength(), new ObjectList$toString$1(16, rootAsIntersectionDistances));
            return list == null ? instance_delegatelambda0.write : list;
        } catch (Throwable th) {
            if (!LoggingLevelUtilKt.accepts(LoggerProviderKt.logLevel(), LoggingLevel.ERROR)) {
                return null;
            }
            LoggerProviderKt.logE("failed to compute intersections distances, returning null. error: " + th.getMessage(), "NRO-OPERATIONS");
            return null;
        }
    }
}
