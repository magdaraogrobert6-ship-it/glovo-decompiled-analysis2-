package o;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class placeRelativedefault {
    /* JADX INFO: Access modifiers changed from: private */
    public static ColorStateList write(Drawable drawable) {
        if (drawable instanceof ColorStateListDrawable) {
            return ((ColorStateListDrawable) drawable).getColorStateList();
        }
        return null;
    }
}
