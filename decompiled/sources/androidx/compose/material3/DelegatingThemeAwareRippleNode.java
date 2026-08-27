package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import o.getVirtualJ9_QTjY;

/* JADX INFO: loaded from: classes.dex */
public final class DelegatingThemeAwareRippleNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    public final MutableInteractionSourceImpl IconCompatParcelizer;
    private final ColorProducer color;
    public final boolean read;
    public final float serializer;
    public DelegatableNode write;

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        ObserverModifierNodeKt.observeReads(this, new getVirtualJ9_QTjY(this));
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new getVirtualJ9_QTjY(this));
    }

    public DelegatingThemeAwareRippleNode(MutableInteractionSourceImpl mutableInteractionSourceImpl, boolean z, float f, ColorProducer colorProducer) {
        this.IconCompatParcelizer = mutableInteractionSourceImpl;
        this.read = z;
        this.serializer = f;
        this.color = colorProducer;
    }
}
