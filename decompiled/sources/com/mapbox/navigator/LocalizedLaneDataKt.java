package com.mapbox.navigator;

import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class LocalizedLaneDataKt {
    public static /* synthetic */ LocalizedLaneData localizedLaneData$default(long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigator.LocalizedLaneDataKt.localizedLaneData.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((LocalizedLaneData.Builder) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(LocalizedLaneData.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return localizedLaneData(j, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }

    public static final /* synthetic */ LocalizedLaneData localizedLaneData(long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        LocalizedLaneData.Builder builder = new LocalizedLaneData.Builder(j);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return builder.build();
    }
}
