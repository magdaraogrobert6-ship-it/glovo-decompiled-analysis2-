package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.MeasuredSizeAwareModifierNode;
import androidx.compose.ui.unit.IntSize;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class OnSizeChangedNode extends Modifier.Node implements MeasuredSizeAwareModifierNode {
    public static final int $stable = 8;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM onSizeChanged;
    private final boolean shouldAutoInvalidate = true;
    private long previousSize = IntSize.m3839constructorimpl(-9223372034707292160L);

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public void mo28onRemeasuredozmzZPI(long j) {
        if (IntSize.m3842equalsimpl0(this.previousSize, j)) {
            return;
        }
        this.onSizeChanged.invoke(IntSize.m3836boximpl(j));
        this.previousSize = j;
    }

    public OnSizeChangedNode(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onSizeChanged = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void update(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.onSizeChanged = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.previousSize = IntSize.m3839constructorimpl(-9223372034707292160L);
    }
}
