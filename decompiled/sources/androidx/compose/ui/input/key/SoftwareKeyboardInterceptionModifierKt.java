package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class SoftwareKeyboardInterceptionModifierKt {
    public static final Modifier onInterceptKeyBeforeSoftKeyboard(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new SoftKeyboardInterceptionElement(r8lambdaunavo3sxub_pc9xroryotnrlvsm, null));
    }

    public static final Modifier onPreInterceptKeyBeforeSoftKeyboard(Modifier modifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        return modifier.then(new SoftKeyboardInterceptionElement(null, r8lambdaunavo3sxub_pc9xroryotnrlvsm));
    }
}
