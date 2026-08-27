package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
@onItemDismisslambda0
public interface FocusOrderModifier extends Modifier.Element {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusOrderModifier focusOrderModifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return FocusOrderModifier.super.all(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Deprecated
        public static boolean any(FocusOrderModifier focusOrderModifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return FocusOrderModifier.super.any(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Deprecated
        public static <R> R foldIn(FocusOrderModifier focusOrderModifier, R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return (R) FocusOrderModifier.super.foldIn(r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }

        @Deprecated
        public static <R> R foldOut(FocusOrderModifier focusOrderModifier, R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return (R) FocusOrderModifier.super.foldOut(r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }

        @Deprecated
        public static Modifier then(FocusOrderModifier focusOrderModifier, Modifier modifier) {
            return FocusOrderModifier.super.then(modifier);
        }
    }

    void populateFocusOrder(FocusOrder focusOrder);
}
