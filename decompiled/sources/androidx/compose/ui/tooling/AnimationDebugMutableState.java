package androidx.compose.ui.tooling;

import o.PopulateViewStructure_androidKtpopulate7;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class AnimationDebugMutableState<T> implements PopulateViewStructure_androidKtpopulate7 {
    public static final int $stable = 0;
    private final /* synthetic */ PopulateViewStructure_androidKtpopulate7 $$delegate_0;
    private final String label;
    private final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 states;

    public final String getLabel() {
        return this.label;
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getStates() {
        return this.states;
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    public T component1() {
        return (T) this.$$delegate_0.component1();
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    public r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM component2() {
        return this.$$delegate_0.component2();
    }

    @Override // o.onViewAttachedToWindow
    public T getValue() {
        return (T) this.$$delegate_0.getValue();
    }

    @Override // o.PopulateViewStructure_androidKtpopulate7
    public void setValue(T t) {
        this.$$delegate_0.setValue(t);
    }

    public AnimationDebugMutableState(PopulateViewStructure_androidKtpopulate7 populateViewStructure_androidKtpopulate7, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, String str) {
        this.$$delegate_0 = populateViewStructure_androidKtpopulate7;
        this.states = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.label = str;
    }
}
