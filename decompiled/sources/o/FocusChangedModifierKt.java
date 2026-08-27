package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class FocusChangedModifierKt {
    public static final ThreadLocal serializer = new ThreadLocal();
    public static final ThreadLocal read = new ThreadLocal();

    public static void write(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, View view, android.graphics.Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            View view2 = (View) parent;
            write(coordinatorLayout, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
