package o;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class captureFocus {
    public static CharSequence IconCompatParcelizer(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static void IconCompatParcelizer(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static boolean RemoteActionCompatParcelizer(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void serializer(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    public static boolean serializer(View view) {
        return view.isAccessibilityHeading();
    }

    public static void write(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }
}
