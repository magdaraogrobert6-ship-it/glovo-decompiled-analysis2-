package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class FocusChangedModifierKt {
    public static final Modifier onFocusChanged(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new FocusChangedElement(r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }
}
