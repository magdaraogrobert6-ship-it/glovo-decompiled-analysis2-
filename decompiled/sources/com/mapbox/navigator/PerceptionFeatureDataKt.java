package com.mapbox.navigator;

import java.util.List;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class PerceptionFeatureDataKt {
    public static final /* synthetic */ PerceptionFeatureData perceptionFeatureData(List list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        list.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        PerceptionFeatureData.Builder builder = new PerceptionFeatureData.Builder(list);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ PerceptionFeatureData perceptionFeatureData$default(List list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigator.PerceptionFeatureDataKt.perceptionFeatureData.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PerceptionFeatureData.Builder) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(PerceptionFeatureData.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return perceptionFeatureData(list, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
