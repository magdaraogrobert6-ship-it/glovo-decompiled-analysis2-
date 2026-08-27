package o;

import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class invalidateFocusui {
    public static void IconCompatParcelizer(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }

    public static boolean serializer(android.view.accessibility.AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }
}
