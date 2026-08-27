package com.mapbox.navigation.ui.maps.internal.camera;

import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.instance_delegatelambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class OverviewViewportDataSource$updateDebugger$1 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ OverviewViewportDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverviewViewportDataSource$updateDebugger$1(OverviewViewportDataSource overviewViewportDataSource, ArrayList arrayList) {
        super(0);
        this.$r8$classId = 0;
        this.this$0 = overviewViewportDataSource;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        OverviewViewportDataSource overviewViewportDataSource = this.this$0;
        if (i == 0) {
            overviewViewportDataSource.getClass();
            return createfromparcel;
        }
        if (i == 1) {
            overviewViewportDataSource.simplifiedRemainingPointsOnRoutes = accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(accessgetInstancedelegatecp.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(overviewViewportDataSource.simplifiedCompleteRoutesPoints)));
            return createfromparcel;
        }
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        overviewViewportDataSource.simplifiedCompleteRoutesPoints = instance_delegatelambda0Var;
        overviewViewportDataSource.simplifiedRemainingPointsOnRoutes = instance_delegatelambda0Var;
        return createfromparcel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OverviewViewportDataSource$updateDebugger$1(OverviewViewportDataSource overviewViewportDataSource, int i) {
        super(0);
        this.$r8$classId = i;
        this.this$0 = overviewViewportDataSource;
    }
}
