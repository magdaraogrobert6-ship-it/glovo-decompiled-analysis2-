package androidx.compose.ui;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
final class SensitiveContentNode extends Modifier.Node {
    private boolean _isContentSensitive;
    private boolean isContentSensitive;
    private boolean isCountedSensitive;

    private final boolean component1() {
        return this._isContentSensitive;
    }

    public final boolean isContentSensitive() {
        return this.isContentSensitive;
    }

    public final SensitiveContentNode copy(boolean z) {
        return new SensitiveContentNode(z);
    }

    public int hashCode() {
        return Boolean.hashCode(this._isContentSensitive);
    }

    public SensitiveContentNode(boolean z) {
        this._isContentSensitive = z;
        this.isContentSensitive = z;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        super.onAttach();
        if (this.isContentSensitive) {
            if (this.isCountedSensitive) {
                InlineClassHelperKt.throwIllegalStateException("invalid sensitive content state");
            }
            DelegatableNodeKt.requireOwner(this).incrementSensitiveComponentCount();
            this.isCountedSensitive = true;
        }
    }

    public static /* synthetic */ SensitiveContentNode copy$default(SensitiveContentNode sensitiveContentNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sensitiveContentNode._isContentSensitive;
        }
        return sensitiveContentNode.copy(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SensitiveContentNode) && this._isContentSensitive == ((SensitiveContentNode) obj)._isContentSensitive;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        if (this.isCountedSensitive) {
            DelegatableNodeKt.requireOwner(this).decrementSensitiveComponentCount();
            this.isCountedSensitive = false;
        }
        super.onDetach();
    }

    public final void setContentSensitive(boolean z) {
        this.isContentSensitive = z;
        if (z && !this.isCountedSensitive) {
            DelegatableNodeKt.requireOwner(this).incrementSensitiveComponentCount();
            this.isCountedSensitive = true;
        } else {
            if (z || !this.isCountedSensitive) {
                return;
            }
            DelegatableNodeKt.requireOwner(this).decrementSensitiveComponentCount();
            this.isCountedSensitive = false;
        }
    }

    public String toString() {
        return IconCompatParcelizer.IconCompatParcelizer(new StringBuilder("SensitiveContentNode(_isContentSensitive="), this._isContentSensitive, ')');
    }
}
