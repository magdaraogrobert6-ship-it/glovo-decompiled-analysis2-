package androidx.compose.ui.tooling;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import o.BlurredEdgeTreatmentCompanion;

/* JADX INFO: loaded from: classes.dex */
final class CompositionDataRecordImpl implements CompositionDataRecord {
    private final Set<BlurredEdgeTreatmentCompanion> store = Collections.newSetFromMap(new WeakHashMap());

    @Override // androidx.compose.ui.tooling.CompositionDataRecord
    public Set<BlurredEdgeTreatmentCompanion> getStore() {
        return this.store;
    }
}
