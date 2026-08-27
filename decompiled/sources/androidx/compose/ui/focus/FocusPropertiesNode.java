package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;

/* JADX INFO: loaded from: classes4.dex */
final class FocusPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode {
    private FocusPropertiesScope focusPropertiesScope;

    public final FocusPropertiesScope getFocusPropertiesScope() {
        return this.focusPropertiesScope;
    }

    public final void setFocusPropertiesScope(FocusPropertiesScope focusPropertiesScope) {
        this.focusPropertiesScope = focusPropertiesScope;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        this.focusPropertiesScope.apply(focusProperties);
    }

    public FocusPropertiesNode(FocusPropertiesScope focusPropertiesScope) {
        this.focusPropertiesScope = focusPropertiesScope;
    }
}
