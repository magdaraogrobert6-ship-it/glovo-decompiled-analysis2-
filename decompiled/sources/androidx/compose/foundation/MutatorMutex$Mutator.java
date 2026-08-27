package androidx.compose.foundation;

import o.applyMeasureResultfoundation;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class MutatorMutex$Mutator {
    public final setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 IconCompatParcelizer;
    public final applyMeasureResultfoundation write;

    public final boolean write(MutatorMutex$Mutator mutatorMutex$Mutator) {
        return this.write.compareTo(mutatorMutex$Mutator.write) >= 0;
    }

    public MutatorMutex$Mutator(applyMeasureResultfoundation applymeasureresultfoundation, setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0) {
        this.write = applymeasureresultfoundation;
        this.IconCompatParcelizer = setallviewgroupchildrenasnonaccessibilityimportantlambda0;
    }

    public final void write() {
        this.IconCompatParcelizer.write(new MutationInterruptedException("Mutation interrupted"));
    }
}
