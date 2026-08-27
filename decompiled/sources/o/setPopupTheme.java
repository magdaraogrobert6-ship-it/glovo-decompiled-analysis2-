package o;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public abstract class setPopupTheme {
    public static void read(PopupWindow popupWindow, android.graphics.Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void write(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }
}
