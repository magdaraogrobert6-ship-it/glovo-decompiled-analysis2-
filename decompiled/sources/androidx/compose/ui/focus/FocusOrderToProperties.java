package androidx.compose.ui.focus;

import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class FocusOrderToProperties implements FocusPropertiesScope {
    public static final int $stable = 0;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM focusOrderReceiver;

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getFocusOrderReceiver() {
        return this.focusOrderReceiver;
    }

    public FocusOrderToProperties(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.focusOrderReceiver = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesScope
    public void apply(FocusProperties focusProperties) {
        this.focusOrderReceiver.invoke(new FocusOrder(focusProperties));
    }
}
