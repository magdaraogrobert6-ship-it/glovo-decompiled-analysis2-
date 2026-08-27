package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public enum clipRectN_I0leg {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    public static final clipPathmtrdDE Companion = new clipPathmtrdDE();

    public static final clipRectN_I0leg from(int i) {
        Companion.getClass();
        return clipPathmtrdDE.write(i);
    }

    public final void applyState(View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        div7Ah8Wj8.RemoteActionCompatParcelizer(2);
        int i = disableZ.IconCompatParcelizer[ordinal()];
        if (i == 1) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                    view.toString();
                    viewGroup2.toString();
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (i == 2) {
            if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                view.toString();
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (i == 3) {
            if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                view.toString();
            }
            view.setVisibility(8);
        } else {
            if (i != 4) {
                return;
            }
            if (div7Ah8Wj8.RemoteActionCompatParcelizer(2)) {
                view.toString();
            }
            view.setVisibility(4);
        }
    }
}
