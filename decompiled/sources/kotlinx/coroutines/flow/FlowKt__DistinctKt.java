package kotlinx.coroutines.flow;

import androidx.compose.ui.text.SaversKt$$ExternalSyntheticLambda7;
import o.accessisRelatedToAutoCommit;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class FlowKt__DistinctKt {
    public static final accessisRelatedToAutoCommit IconCompatParcelizer = new accessisRelatedToAutoCommit(29);
    public static final SaversKt$$ExternalSyntheticLambda7 read = new SaversKt$$ExternalSyntheticLambda7(6);

    public static final Flow write(Flow flow, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        if (flow instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) flow;
            if (distinctFlowImpl.read == r8lambdaunavo3sxub_pc9xroryotnrlvsm && distinctFlowImpl.IconCompatParcelizer == r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
                return flow;
            }
        }
        return new DistinctFlowImpl(flow, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }
}
