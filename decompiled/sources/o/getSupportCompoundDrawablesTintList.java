package o;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class getSupportCompoundDrawablesTintList {
    public static void IconCompatParcelizer(PopupWindow popupWindow, android.transition.Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void RemoteActionCompatParcelizer(PopupWindow popupWindow, android.transition.Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
