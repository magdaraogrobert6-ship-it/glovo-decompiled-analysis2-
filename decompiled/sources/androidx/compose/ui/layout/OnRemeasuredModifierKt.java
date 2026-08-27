package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class OnRemeasuredModifierKt {
    public static final Modifier onSizeChanged(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new OnSizeChangedModifier(r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }
}
