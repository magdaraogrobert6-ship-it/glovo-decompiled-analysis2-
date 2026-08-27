package com.mapbox.maps;

import java.util.List;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class IndoorStateKt {
    @com.mapbox.annotation.MapboxExperimental
    public static final /* synthetic */ IndoorState indoorState(List list, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        list.getClass();
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        IndoorState.Builder builder = new IndoorState.Builder(list, str);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ IndoorState indoorState$default(List list, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 4) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.maps.IndoorStateKt.indoorState.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((IndoorState.Builder) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(IndoorState.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return indoorState(list, str, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
