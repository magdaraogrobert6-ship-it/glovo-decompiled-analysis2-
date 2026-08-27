package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public interface RemeasurementModifier extends Modifier.Element {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(RemeasurementModifier remeasurementModifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return RemeasurementModifier.super.all(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Deprecated
        public static boolean any(RemeasurementModifier remeasurementModifier, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return RemeasurementModifier.super.any(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        @Deprecated
        public static <R> R foldIn(RemeasurementModifier remeasurementModifier, R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return (R) RemeasurementModifier.super.foldIn(r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }

        @Deprecated
        public static <R> R foldOut(RemeasurementModifier remeasurementModifier, R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return (R) RemeasurementModifier.super.foldOut(r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        }

        @Deprecated
        public static Modifier then(RemeasurementModifier remeasurementModifier, Modifier modifier) {
            return RemeasurementModifier.super.then(modifier);
        }
    }

    void onRemeasurementAvailable(Remeasurement remeasurement);
}
