package o;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class getNestedScrollAxes {
    public static final int[] read = {android.R.attr.state_checked};
    public static final int[] RemoteActionCompatParcelizer = new int[0];
    public static final android.graphics.Rect write = new android.graphics.Rect();

    public static void RemoteActionCompatParcelizer(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(read);
        } else {
            drawable.setState(RemoteActionCompatParcelizer);
        }
        drawable.setState(state);
    }

    public static android.graphics.Rect read(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return setTitleOptional.IconCompatParcelizer(drawable);
        }
        Insets insetsV_ = generateLayoutParams.V_(drawable);
        return new android.graphics.Rect(insetsV_.left, insetsV_.top, insetsV_.right, insetsV_.bottom);
    }

    public static PorterDuff.Mode IconCompatParcelizer(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i != 9) {
            switch (i) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
                default:
                    return mode;
            }
        }
        return PorterDuff.Mode.SRC_ATOP;
    }
}
