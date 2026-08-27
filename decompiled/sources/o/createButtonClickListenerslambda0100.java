package o;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class createButtonClickListenerslambda0100 {
    public static boolean read(DefaultContentCardsViewBindingHandlerWhenMappings defaultContentCardsViewBindingHandlerWhenMappings, Map.Entry entry) {
        entry.getClass();
        V v = defaultContentCardsViewBindingHandlerWhenMappings.get(entry.getKey());
        if (v != 0) {
            return v.equals(entry.getValue());
        }
        return entry.getValue() == null && defaultContentCardsViewBindingHandlerWhenMappings.containsKey(entry.getKey());
    }

    public static void IconCompatParcelizer(AccessibilityEvent accessibilityEvent, boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            saveFocusedChild.IconCompatParcelizer(accessibilityEvent, z);
        }
    }
}
