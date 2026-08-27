package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import o.onItemDismisslambda0;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final class OnFirstVisibleModifierKt {
    @onItemDismisslambda0
    public static final Modifier onFirstVisible(Modifier modifier, long j, float f, LayoutBoundsHolder layoutBoundsHolder, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return modifier.then(new OnFirstVisibleElement(j, f, layoutBoundsHolder, r8lambdardpfsr94j4iebcwx_kpqzpm8k0));
    }

    public static /* synthetic */ Modifier onFirstVisible$default(Modifier modifier, long j, float f, LayoutBoundsHolder layoutBoundsHolder, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 4) != 0) {
            layoutBoundsHolder = null;
        }
        return onFirstVisible(modifier, j2, f2, layoutBoundsHolder, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }
}
