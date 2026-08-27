package androidx.compose.ui.node;

import coil3.util.UtilsKt;
import o.r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U;

/* JADX INFO: loaded from: classes.dex */
public interface TraversableNode extends DelegatableNode {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public enum TraverseDescendantsAction {
            ContinueTraversal,
            SkipSubtreeAndContinueTraversal,
            CancelTraversal;

            private static final /* synthetic */ r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U $ENTRIES = UtilsKt.read((Enum[]) values());

            public static r8lambdaCQ4V2AQoD74IHhWV724N_B6w0U getEntries() {
                return $ENTRIES;
            }
        }

        private Companion() {
        }
    }

    Object getTraverseKey();
}
