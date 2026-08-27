package o;

import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class ItemFoundInScroll {
    public static final long RemoteActionCompatParcelizer = android.view.ViewConfiguration.getTapTimeout();

    public static final boolean RemoteActionCompatParcelizer(androidx.compose.foundation.AbstractClickableNode abstractClickableNode) {
        ViewParent parent = androidx.compose.ui.node.DelegatableNode_androidKt.requireView(abstractClickableNode).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
