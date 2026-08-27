package o;

import androidx.cardview.widget.CardView$1;
import androidx.compose.foundation.ScrollState$$ExternalSyntheticLambda3;

/* JADX INFO: loaded from: classes.dex */
public final class ForgottenCoroutineScopeException extends androidx.compose.foundation.pager.PagerState {
    public static final CardView$1 RemoteActionCompatParcelizer = getPositionInRoot.serializer(new ScrollState$$ExternalSyntheticLambda3(3), new getViewportSizeYbymL2g(22));
    public final PopulateViewStructure_androidKtpopulate7 write;

    @Override // androidx.compose.foundation.pager.PagerState
    public final int read() {
        return ((Number) ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) ((onShowTranslationui) this.write).getValue()).invoke()).intValue();
    }

    public ForgottenCoroutineScopeException(int i, float f, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        super(i, f);
        this.write = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }
}
