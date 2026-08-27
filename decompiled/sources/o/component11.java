package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.WindowInsetsAnimationCompat$Callback;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class component11 extends component13 {
    public static final PathInterpolator RatingCompat = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final drawVerticesTPEHhCM IconCompatParcelizer = new drawVerticesTPEHhCM();
    public static final DecelerateInterpolator MediaDescriptionCompat = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator MediaMetadataCompat = new AccelerateInterpolator(1.5f);

    public component11(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    public static WindowInsets read(View view, WindowInsets windowInsets) {
        return view.getTag(com.logistics.rider.glovo.R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static WindowInsetsAnimationCompat$Callback write(View view) {
        Object tag = view.getTag(com.logistics.rider.glovo.R.id.tag_window_insets_animation_callback);
        if (tag instanceof component12) {
            return ((component12) tag).read;
        }
        return null;
    }

    public static void read(View view, WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$Callback) {
        View.OnApplyWindowInsetsListener component12Var = windowInsetsAnimationCompat$Callback != null ? new component12(view, windowInsetsAnimationCompat$Callback) : null;
        view.setTag(com.logistics.rider.glovo.R.id.tag_window_insets_animation_callback, component12Var);
        if (view.getTag(com.logistics.rider.glovo.R.id.tag_compat_insets_dispatch) == null && view.getTag(com.logistics.rider.glovo.R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(component12Var);
        }
    }

    public static void IconCompatParcelizer(View view, FocusRequesterModifierKt focusRequesterModifierKt, List list) {
        WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$CallbackWrite = write(view);
        if (windowInsetsAnimationCompat$CallbackWrite != null) {
            focusRequesterModifierKt = windowInsetsAnimationCompat$CallbackWrite.onProgress(focusRequesterModifierKt, list);
            if (windowInsetsAnimationCompat$CallbackWrite.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                IconCompatParcelizer(viewGroup.getChildAt(i), focusRequesterModifierKt, list);
            }
        }
    }

    public static void RemoteActionCompatParcelizer(View view, component14 component14Var, component15 component15Var) {
        WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$CallbackWrite = write(view);
        if (windowInsetsAnimationCompat$CallbackWrite != null) {
            windowInsetsAnimationCompat$CallbackWrite.onStart(component14Var, component15Var);
            if (windowInsetsAnimationCompat$CallbackWrite.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                RemoteActionCompatParcelizer(viewGroup.getChildAt(i), component14Var, component15Var);
            }
        }
    }

    public static void write(View view, component14 component14Var) {
        WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$CallbackWrite = write(view);
        if (windowInsetsAnimationCompat$CallbackWrite != null) {
            windowInsetsAnimationCompat$CallbackWrite.onEnd(component14Var);
            if (windowInsetsAnimationCompat$CallbackWrite.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                write(viewGroup.getChildAt(i), component14Var);
            }
        }
    }

    public static void read(View view, component14 component14Var, FocusRequesterModifierKt focusRequesterModifierKt, boolean z) {
        WindowInsetsAnimationCompat$Callback windowInsetsAnimationCompat$CallbackWrite = write(view);
        if (windowInsetsAnimationCompat$CallbackWrite != null) {
            windowInsetsAnimationCompat$CallbackWrite.RemoteActionCompatParcelizer = focusRequesterModifierKt;
            if (!z) {
                windowInsetsAnimationCompat$CallbackWrite.onPrepare(component14Var);
                z = windowInsetsAnimationCompat$CallbackWrite.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                read(viewGroup.getChildAt(i), component14Var, focusRequesterModifierKt, z);
            }
        }
    }
}
