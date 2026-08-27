package o;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class accessgetCancelcp {
    public static void serializer(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(com.logistics.rider.glovo.R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void write(View view, FocusPropertiesImpl focusPropertiesImpl) {
        requestFocus3ESFkO8default requestfocus3esfko8default = focusPropertiesImpl != null ? new requestFocus3ESFkO8default(view, focusPropertiesImpl) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(com.logistics.rider.glovo.R.id.tag_on_apply_window_listener, requestfocus3esfko8default);
        }
        if (view.getTag(com.logistics.rider.glovo.R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (requestfocus3esfko8default != null) {
            view.setOnApplyWindowInsetsListener(requestfocus3esfko8default);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(com.logistics.rider.glovo.R.id.tag_window_insets_animation_callback));
        }
    }

    public static FocusRequesterModifierKt RemoteActionCompatParcelizer(View view, FocusRequesterModifierKt focusRequesterModifierKt, android.graphics.Rect rect) {
        WindowInsets windowInsetsIconCompatParcelizer = focusRequesterModifierKt.IconCompatParcelizer();
        if (windowInsetsIconCompatParcelizer != null) {
            return FocusRequesterModifierKt.write(view, view.computeSystemWindowInsets(windowInsetsIconCompatParcelizer, rect));
        }
        rect.setEmpty();
        return focusRequesterModifierKt;
    }
}
