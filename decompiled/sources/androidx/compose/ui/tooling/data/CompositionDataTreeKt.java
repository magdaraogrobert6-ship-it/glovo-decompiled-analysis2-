package androidx.compose.ui.tooling.data;

import java.util.List;
import java.util.Set;
import o.BlurredEdgeTreatmentCompanion;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes.dex */
public final class CompositionDataTreeKt {
    public static /* synthetic */ List makeTree$default(Set set, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, ContextCache contextCache, int i, Object obj) {
        if ((i & 8) != 0) {
            contextCache = new ContextCache();
        }
        return makeTree(set, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, contextCache);
    }

    @UiToolingDataApi
    public static final <T, R> List<R> makeTree(Set<? extends BlurredEdgeTreatmentCompanion> set, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, ContextCache contextCache) {
        return new CompositionDataTree(set, r8lambdaunavo3sxub_pc9xroryotnrlvsm, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, contextCache).build();
    }
}
