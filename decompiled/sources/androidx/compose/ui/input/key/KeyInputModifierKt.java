package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class KeyInputModifierKt {
    public static final Modifier onKeyEvent(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new KeyInputElement(r8lambdaunavo3sxub_pc9xroryotnrlvsm, null));
    }

    public static final Modifier onPreviewKeyEvent(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new KeyInputElement(null, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }
}
