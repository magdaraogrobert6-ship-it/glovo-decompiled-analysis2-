package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class getCenterEnd implements androidx.compose.ui.layout.MeasurePolicy {
    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 RemoteActionCompatParcelizer;

    public getCenterEnd(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.RemoteActionCompatParcelizer = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo6measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, List list, long j) {
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, androidx.compose.ui.unit.Constraints.m3626getMaxWidthimpl(j), androidx.compose.ui.unit.Constraints.m3625getMaxHeightimpl(j), null, new waitForFirstLayout(list, 23, this), 4, null);
    }
}
