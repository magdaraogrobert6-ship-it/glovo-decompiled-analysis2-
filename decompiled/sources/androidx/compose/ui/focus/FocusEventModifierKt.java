package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class FocusEventModifierKt {
    public static final Modifier onFocusEvent(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new FocusEventElement(r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }
}
