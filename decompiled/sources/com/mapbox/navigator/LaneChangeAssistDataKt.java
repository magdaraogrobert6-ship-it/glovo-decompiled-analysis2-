package com.mapbox.navigator;

import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes5.dex */
public final class LaneChangeAssistDataKt {
    public static final /* synthetic */ LaneChangeAssistData laneChangeAssistData(LaneChangeDirection laneChangeDirection, LaneChangeState laneChangeState, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        laneChangeDirection.getClass();
        laneChangeState.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        LaneChangeAssistData.Builder builder = new LaneChangeAssistData.Builder(laneChangeDirection, laneChangeState, j);
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ LaneChangeAssistData laneChangeAssistData$default(LaneChangeDirection laneChangeDirection, LaneChangeState laneChangeState, long j, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 8) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.mapbox.navigator.LaneChangeAssistDataKt.laneChangeAssistData.1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((LaneChangeAssistData.Builder) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(LaneChangeAssistData.Builder builder) {
                    builder.getClass();
                }
            };
        }
        return laneChangeAssistData(laneChangeDirection, laneChangeState, j, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
    }
}
