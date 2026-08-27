package o;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetSubcomposePausablecp {
    public static final ThreadLocal RemoteActionCompatParcelizer = new ThreadLocal();
    public static final ThreadLocal write = new ThreadLocal();

    public static void read(TextInputLayout textInputLayout, View view, android.graphics.Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != textInputLayout) {
            View view2 = (View) parent;
            read(textInputLayout, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
