package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
@onItemDismisslambda0
public interface FocusRequesterModifier extends Modifier.Element {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusRequesterModifier focusRequesterModifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return FocusRequesterModifier.super.all(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Deprecated
        public static boolean any(FocusRequesterModifier focusRequesterModifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return FocusRequesterModifier.super.any(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Deprecated
        public static <R> R foldIn(FocusRequesterModifier focusRequesterModifier, R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return (R) FocusRequesterModifier.super.foldIn(r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }

        @Deprecated
        public static <R> R foldOut(FocusRequesterModifier focusRequesterModifier, R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return (R) FocusRequesterModifier.super.foldOut(r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }

        @Deprecated
        public static Modifier then(FocusRequesterModifier focusRequesterModifier, Modifier modifier) {
            return FocusRequesterModifier.super.then(modifier);
        }
    }

    FocusRequester getFocusRequester();
}
