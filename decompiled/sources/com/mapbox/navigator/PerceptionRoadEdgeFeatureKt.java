package com.mapbox.navigator;

import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class PerceptionRoadEdgeFeatureKt {
    public static final /* synthetic */ PerceptionRoadEdgeFeature perceptionRoadEdgeFeature(RoadEdgeType roadEdgeType, PerceptionFeatureData perceptionFeatureData, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        roadEdgeType.getClass();
        perceptionFeatureData.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        PerceptionRoadEdgeFeature.Builder builder = new PerceptionRoadEdgeFeature.Builder(roadEdgeType, perceptionFeatureData);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ PerceptionRoadEdgeFeature perceptionRoadEdgeFeature$default(RoadEdgeType roadEdgeType, PerceptionFeatureData perceptionFeatureData, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 4) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigator.PerceptionRoadEdgeFeatureKt.perceptionRoadEdgeFeature.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PerceptionRoadEdgeFeature.Builder) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(PerceptionRoadEdgeFeature.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return perceptionRoadEdgeFeature(roadEdgeType, perceptionFeatureData, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
