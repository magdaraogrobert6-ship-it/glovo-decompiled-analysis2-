package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public interface OnRemeasuredModifier extends Modifier.Element {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnRemeasuredModifier onRemeasuredModifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return OnRemeasuredModifier.super.all(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Deprecated
        public static boolean any(OnRemeasuredModifier onRemeasuredModifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return OnRemeasuredModifier.super.any(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Deprecated
        public static <R> R foldIn(OnRemeasuredModifier onRemeasuredModifier, R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return (R) OnRemeasuredModifier.super.foldIn(r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }

        @Deprecated
        public static <R> R foldOut(OnRemeasuredModifier onRemeasuredModifier, R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return (R) OnRemeasuredModifier.super.foldOut(r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }

        @Deprecated
        public static Modifier then(OnRemeasuredModifier onRemeasuredModifier, Modifier modifier) {
            return OnRemeasuredModifier.super.then(modifier);
        }
    }

    /* JADX INFO: renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    void m2269onRemeasuredozmzZPI(long j);
}
