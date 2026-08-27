package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public interface SemanticsModifier extends Modifier.Element {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(SemanticsModifier semanticsModifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return SemanticsModifier.super.all(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Deprecated
        public static boolean any(SemanticsModifier semanticsModifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return SemanticsModifier.super.any(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Deprecated
        public static <R> R foldIn(SemanticsModifier semanticsModifier, R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return (R) SemanticsModifier.super.foldIn(r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }

        @Deprecated
        public static <R> R foldOut(SemanticsModifier semanticsModifier, R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return (R) SemanticsModifier.super.foldOut(r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }

        @Deprecated
        public static int getId(SemanticsModifier semanticsModifier) {
            return SemanticsModifier.super.getId();
        }

        @onItemDismisslambda0
        public static /* synthetic */ void getId$annotations() {
        }

        @Deprecated
        public static Modifier then(SemanticsModifier semanticsModifier, Modifier modifier) {
            return SemanticsModifier.super.then(modifier);
        }
    }

    default int getId() {
        return -1;
    }

    SemanticsConfiguration getSemanticsConfiguration();
}
