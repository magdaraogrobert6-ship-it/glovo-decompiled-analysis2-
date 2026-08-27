package com.mapbox.navigator;

import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class PerceptionTrafficSignFeatureKt {
    public static final /* synthetic */ PerceptionTrafficSignFeature perceptionTrafficSignFeature(TrafficSignType trafficSignType, PerceptionFeatureData perceptionFeatureData, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        trafficSignType.getClass();
        perceptionFeatureData.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        PerceptionTrafficSignFeature.Builder builder = new PerceptionTrafficSignFeature.Builder(trafficSignType, perceptionFeatureData);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ PerceptionTrafficSignFeature perceptionTrafficSignFeature$default(TrafficSignType trafficSignType, PerceptionFeatureData perceptionFeatureData, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 4) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigator.PerceptionTrafficSignFeatureKt.perceptionTrafficSignFeature.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PerceptionTrafficSignFeature.Builder) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(PerceptionTrafficSignFeature.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return perceptionTrafficSignFeature(trafficSignType, perceptionFeatureData, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
