package o;

import android.graphics.Bitmap;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class saveFocusedChild {
    public static int IconCompatParcelizer(android.view.ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static void IconCompatParcelizer(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static boolean IconCompatParcelizer(Bitmap bitmap) {
        return bitmap.hasGainmap();
    }

    public static int serializer(android.view.ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }
}
