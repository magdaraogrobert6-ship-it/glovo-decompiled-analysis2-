package com.mapbox.common.geofencing;

import com.mapbox.geojson.Feature;
import java.util.Date;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class GeofencingEventKt {
    public static final /* synthetic */ GeofencingEvent geofencingEvent(Feature feature, Date date, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        feature.getClass();
        date.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        GeofencingEvent.Builder builder = new GeofencingEvent.Builder(feature, date);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ GeofencingEvent geofencingEvent$default(Feature feature, Date date, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 4) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.geofencing.GeofencingEventKt.geofencingEvent.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((GeofencingEvent.Builder) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(GeofencingEvent.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return geofencingEvent(feature, date, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
