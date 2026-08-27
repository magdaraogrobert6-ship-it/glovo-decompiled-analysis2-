package androidx.compose.ui.semantics;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsConfigurationKt {
    public static final <T> T getOrNull(SemanticsConfiguration semanticsConfiguration, SemanticsPropertyKey<T> semanticsPropertyKey) {
        return (T) semanticsConfiguration.getOrElseNullable(semanticsPropertyKey, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull.1
            @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
            public final T invoke() {
                return null;
            }
        });
    }
}
