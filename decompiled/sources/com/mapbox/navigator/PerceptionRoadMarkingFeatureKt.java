package com.mapbox.navigator;

import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class PerceptionRoadMarkingFeatureKt {
    public static final /* synthetic */ PerceptionRoadMarkingFeature perceptionRoadMarkingFeature(RoadMarkingType roadMarkingType, PerceptionFeatureData perceptionFeatureData, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        roadMarkingType.getClass();
        perceptionFeatureData.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        PerceptionRoadMarkingFeature.Builder builder = new PerceptionRoadMarkingFeature.Builder(roadMarkingType, perceptionFeatureData);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ PerceptionRoadMarkingFeature perceptionRoadMarkingFeature$default(RoadMarkingType roadMarkingType, PerceptionFeatureData perceptionFeatureData, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 4) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigator.PerceptionRoadMarkingFeatureKt.perceptionRoadMarkingFeature.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((PerceptionRoadMarkingFeature.Builder) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(PerceptionRoadMarkingFeature.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return perceptionRoadMarkingFeature(roadMarkingType, perceptionFeatureData, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
