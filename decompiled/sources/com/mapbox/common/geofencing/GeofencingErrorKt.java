package com.mapbox.common.geofencing;

import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class GeofencingErrorKt {
    public static final /* synthetic */ GeofencingError geofencingError(GeofencingErrorType geofencingErrorType, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        geofencingErrorType.getClass();
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        GeofencingError.Builder builder = new GeofencingError.Builder(geofencingErrorType, str);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ GeofencingError geofencingError$default(GeofencingErrorType geofencingErrorType, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 4) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.common.geofencing.GeofencingErrorKt.geofencingError.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((GeofencingError.Builder) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(GeofencingError.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return geofencingError(geofencingErrorType, str, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
