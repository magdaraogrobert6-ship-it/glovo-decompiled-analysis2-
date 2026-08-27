package o;

import androidx.lifecycle.BlockRunner$cancel$1;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
public final class LazyLayoutItemAnimatorDisplayingDisappearingItemsNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.DrawModifierNode {
    public boolean IconCompatParcelizer;
    public boolean read;
    public final androidx.compose.foundation.interaction.MutableInteractionSourceImpl serializer;
    public boolean write;

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (this.IconCompatParcelizer) {
            androidx.compose.ui.graphics.drawscope.DrawScope.m1298drawRectnJ9OG0$default(contentDrawScope, androidx.compose.ui.graphics.Color.m721copywmQWz5c$default(androidx.compose.ui.graphics.Color.Companion.m748getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo1304getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
        } else if (this.read || this.write) {
            androidx.compose.ui.graphics.drawscope.DrawScope.m1298drawRectnJ9OG0$default(contentDrawScope, androidx.compose.ui.graphics.Color.m721copywmQWz5c$default(androidx.compose.ui.graphics.Color.Companion.m748getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo1304getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
        }
    }

    public LazyLayoutItemAnimatorDisplayingDisappearingItemsNode(androidx.compose.foundation.interaction.MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        this.serializer = mutableInteractionSourceImpl;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new BlockRunner$cancel$1(this, (ShortNewsContentCardView) null, 3), 3);
    }
}
