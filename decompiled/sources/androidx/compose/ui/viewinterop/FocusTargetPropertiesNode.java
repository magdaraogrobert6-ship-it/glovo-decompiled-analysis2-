package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.geometry.Rect;

/* JADX INFO: loaded from: classes.dex */
final class FocusTargetPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode {
    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        Rect rectCalculateFocusRectRelativeTo;
        View embeddedView = FocusGroupNode_androidKt.getEmbeddedView(this);
        focusProperties.setCanFocus(getNode().isAttached() && FocusGroupNode_androidKt.getEmbeddedView(this).hasFocusable());
        View viewFindFocus = embeddedView.findFocus();
        if (viewFindFocus == null || (rectCalculateFocusRectRelativeTo = FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(viewFindFocus, embeddedView)) == null) {
            return;
        }
        focusProperties.setFocusRect(rectCalculateFocusRectRelativeTo);
    }
}
