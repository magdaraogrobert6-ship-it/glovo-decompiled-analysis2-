package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes.dex */
public abstract class setSupportBackgroundTintList {
    public static final ThreadLocal MediaBrowserCompatMediaItem = new ThreadLocal();
    public static final int[] write = {-16842910};
    public static final int[] serializer = {android.R.attr.state_focused};
    public static final int[] read = {android.R.attr.state_pressed};
    public static final int[] IconCompatParcelizer = {android.R.attr.state_checked};
    public static final int[] RemoteActionCompatParcelizer = new int[0];
    public static final int[] RatingCompat = new int[1];

    public static void read(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(onUserLeaveHint.AppCompatTheme);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                SentryLogcatAdapter.serializer("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int IconCompatParcelizer(Context context, int i) {
        int[] iArr = RatingCompat;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList RemoteActionCompatParcelizer(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = RatingCompat;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = FocusListener.write(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int write(Context context, int i) {
        ColorStateList colorStateListRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, i);
        if (colorStateListRemoteActionCompatParcelizer != null && colorStateListRemoteActionCompatParcelizer.isStateful()) {
            return colorStateListRemoteActionCompatParcelizer.getColorForState(write, colorStateListRemoteActionCompatParcelizer.getDefaultColor());
        }
        ThreadLocal threadLocal = MediaBrowserCompatMediaItem;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iIconCompatParcelizer = IconCompatParcelizer(context, i);
        return setPrevious.write(iIconCompatParcelizer, Math.round(android.graphics.Color.alpha(iIconCompatParcelizer) * f));
    }
}
