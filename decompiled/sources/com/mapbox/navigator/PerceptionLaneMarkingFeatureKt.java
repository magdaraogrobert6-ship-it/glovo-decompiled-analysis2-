package com.mapbox.navigator;

import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class PerceptionLaneMarkingFeatureKt {
    public static final /* synthetic */ PerceptionLaneMarkingFeature perceptionLaneMarkingFeature(LaneMarkingType laneMarkingType, PerceptionFeatureData perceptionFeatureData, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        laneMarkingType.getClass();
        perceptionFeatureData.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        PerceptionLaneMarkingFeature.Builder builder = new PerceptionLaneMarkingFeature.Builder(laneMarkingType, perceptionFeatureData);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ PerceptionLaneMarkingFeature perceptionLaneMarkingFeature$default(LaneMarkingType laneMarkingType, PerceptionFeatureData perceptionFeatureData, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 4) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigator.PerceptionLaneMarkingFeatureKt.perceptionLaneMarkingFeature.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PerceptionLaneMarkingFeature.Builder) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(PerceptionLaneMarkingFeature.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return perceptionLaneMarkingFeature(laneMarkingType, perceptionFeatureData, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
