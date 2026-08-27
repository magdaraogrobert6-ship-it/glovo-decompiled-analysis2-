package androidx.compose.ui.tooling;

import java.util.Set;
import o.BlurredEdgeTreatmentCompanion;

/* JADX INFO: loaded from: classes.dex */
public interface CompositionDataRecord {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final CompositionDataRecord create() {
            return new CompositionDataRecordImpl();
        }
    }

    Set<BlurredEdgeTreatmentCompanion> getStore();
}
