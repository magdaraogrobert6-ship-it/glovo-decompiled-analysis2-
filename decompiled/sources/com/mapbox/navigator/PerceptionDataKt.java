package com.mapbox.navigator;

import java.util.List;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class PerceptionDataKt {
    public static final /* synthetic */ PerceptionData perceptionData(long j, List list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        list.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        PerceptionData.Builder builder = new PerceptionData.Builder(j, list);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ PerceptionData perceptionData$default(long j, List list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 4) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigator.PerceptionDataKt.perceptionData.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PerceptionData.Builder) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(PerceptionData.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return perceptionData(j, list, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
