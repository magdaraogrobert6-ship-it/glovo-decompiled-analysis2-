package androidx.compose.ui.spatial;

import androidx.compose.ui.Actual_androidKt;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
final class ExecuteDelayUsingPostAndRemove implements ExecuteDelayed {
    public static final ExecuteDelayUsingPostAndRemove INSTANCE = new ExecuteDelayUsingPostAndRemove();

    private ExecuteDelayUsingPostAndRemove() {
    }

    @Override // androidx.compose.ui.spatial.ExecuteDelayed
    public Object executeDelayed(long j, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return Actual_androidKt.postDelayed(j, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }

    @Override // androidx.compose.ui.spatial.ExecuteDelayed
    public void removeDelayedExecution(Object obj) {
        Actual_androidKt.removePost(obj);
    }
}
