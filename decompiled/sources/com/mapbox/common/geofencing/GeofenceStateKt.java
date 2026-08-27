package com.mapbox.common.geofencing;

import com.mapbox.geojson.Feature;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class GeofenceStateKt {
    public static final /* synthetic */ GeofenceState geofenceState(Feature feature, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        feature.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        GeofenceState.Builder builder = new GeofenceState.Builder(feature);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ GeofenceState geofenceState$default(Feature feature, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.geofencing.GeofenceStateKt.geofenceState.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((GeofenceState.Builder) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(GeofenceState.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return geofenceState(feature, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
