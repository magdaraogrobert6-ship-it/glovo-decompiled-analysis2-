package o;

import android.graphics.Point;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public enum SemanticsModifierNode {
    LEFT,
    RIGHT,
    TOP,
    BOTTOM;

    /* JADX INFO: Access modifiers changed from: private */
    public static Point getPoint(SemanticsModifierNode semanticsModifierNode, View view) {
        view.measure(-2, -2);
        int i = SemanticsModifierNodeKt.IconCompatParcelizer[semanticsModifierNode.ordinal()];
        if (i == 1) {
            return new Point(view.getMeasuredWidth() * (-1), 0);
        }
        if (i == 2) {
            return new Point(view.getMeasuredWidth(), 0);
        }
        if (i != 3) {
            return i != 4 ? new Point(0, view.getMeasuredHeight() * (-1)) : new Point(0, view.getMeasuredHeight());
        }
        return new Point(0, view.getMeasuredHeight() * (-1));
    }
}
