package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
@onItemDismisslambda0
public final class InspectableModifier extends InspectorValueInfo implements Modifier.Element {
    public static final int $stable = 0;
    private final End end;

    public final class End implements Modifier.Element {
        public End() {
        }
    }

    public final End getEnd() {
        return this.end;
    }

    public InspectableModifier(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        super(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        this.end = new End();
    }
}
