package androidx.compose.ui.layout;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutInfo_androidKt {
    public static final View getView(LayoutInfo layoutInfo) {
        layoutInfo.getClass();
        Object owner$ui = ((LayoutNode) layoutInfo).getOwner$ui();
        if (owner$ui instanceof View) {
            return (View) owner$ui;
        }
        return null;
    }
}
