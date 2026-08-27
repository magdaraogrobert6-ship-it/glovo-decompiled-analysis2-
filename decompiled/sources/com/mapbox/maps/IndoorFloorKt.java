package com.mapbox.maps;

import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class IndoorFloorKt {
    @com.mapbox.annotation.MapboxExperimental
    public static final /* synthetic */ IndoorFloor indoorFloor(String str, String str2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        str.getClass();
        str2.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        IndoorFloor.Builder builder = new IndoorFloor.Builder(str, str2);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ IndoorFloor indoorFloor$default(String str, String str2, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 4) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.IndoorFloorKt.indoorFloor.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((IndoorFloor.Builder) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(IndoorFloor.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return indoorFloor(str, str2, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
