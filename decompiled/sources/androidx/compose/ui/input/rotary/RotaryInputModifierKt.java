package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class RotaryInputModifierKt {
    public static final Modifier onPreRotaryScrollEvent(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new RotaryInputElement(null, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }

    public static final Modifier onRotaryScrollEvent(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new RotaryInputElement(r8lambdaunavo3sxub_pc9xroryotnrlvsm, null));
    }
}
