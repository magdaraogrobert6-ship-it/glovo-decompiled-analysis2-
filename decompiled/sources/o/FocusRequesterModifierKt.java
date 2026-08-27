package o;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat$Impl;
import androidx.core.view.WindowInsetsCompat$Impl20;
import androidx.core.view.WindowInsetsCompat$Impl21;
import androidx.core.view.WindowInsetsCompat$Impl28;
import androidx.core.view.WindowInsetsCompat$Impl29;
import androidx.core.view.WindowInsetsCompat$Impl30;
import androidx.core.view.WindowInsetsCompat$Impl31;
import androidx.core.view.WindowInsetsCompat$Impl34;
import androidx.core.view.WindowInsetsCompat$Impl35;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class FocusRequesterModifierKt {
    public static final FocusRequesterModifierKt read;
    public final WindowInsetsCompat$Impl IconCompatParcelizer;

    public static FocusRequesterModifierKt write(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        FocusRequesterModifierKt focusRequesterModifierKt = new FocusRequesterModifierKt(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            FocusRequesterModifierKt focusRequesterModifierKt2 = findFocusTargetui.read(view);
            WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKt.IconCompatParcelizer;
            windowInsetsCompat$Impl.setRootWindowInsets(focusRequesterModifierKt2);
            View rootView = view.getRootView();
            windowInsetsCompat$Impl.copyRootViewBounds(rootView);
            windowInsetsCompat$Impl.initDisplayShape(rootView);
            windowInsetsCompat$Impl.initTypeBoundingRectsMaps();
            windowInsetsCompat$Impl.setSystemUiVisibility(view.getWindowSystemUiVisibility());
        }
        return focusRequesterModifierKt;
    }

    public final WindowInsets IconCompatParcelizer() {
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = this.IconCompatParcelizer;
        if (windowInsetsCompat$Impl instanceof WindowInsetsCompat$Impl20) {
            return ((WindowInsetsCompat$Impl20) windowInsetsCompat$Impl).mPlatformInsets;
        }
        return null;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer.getSystemWindowInsets().write;
    }

    public final int read() {
        return this.IconCompatParcelizer.getSystemWindowInsets().RemoteActionCompatParcelizer;
    }

    public final int serializer() {
        return this.IconCompatParcelizer.getSystemWindowInsets().read;
    }

    public final int write() {
        return this.IconCompatParcelizer.getSystemWindowInsets().serializer;
    }

    public static setRight IconCompatParcelizer(setRight setright, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, setright.RemoteActionCompatParcelizer - i);
        int iMax2 = Math.max(0, setright.write - i2);
        int iMax3 = Math.max(0, setright.read - i3);
        int iMax4 = Math.max(0, setright.serializer - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? setright : setRight.IconCompatParcelizer(iMax, iMax2, iMax3, iMax4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusRequesterModifierKt) {
            return Objects.equals(this.IconCompatParcelizer, ((FocusRequesterModifierKt) obj).IconCompatParcelizer);
        }
        return false;
    }

    public FocusRequesterModifierKt(FocusRequesterModifierKt focusRequesterModifierKt) {
        if (focusRequesterModifierKt == null) {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl(this);
            return;
        }
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKt.IconCompatParcelizer;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (windowInsetsCompat$Impl instanceof WindowInsetsCompat$Impl35)) {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl35(this, (WindowInsetsCompat$Impl35) windowInsetsCompat$Impl);
        } else if (i >= 34 && (windowInsetsCompat$Impl instanceof WindowInsetsCompat$Impl34)) {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl34(this, (WindowInsetsCompat$Impl34) windowInsetsCompat$Impl);
        } else if (i >= 31 && (windowInsetsCompat$Impl instanceof WindowInsetsCompat$Impl31)) {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl31(this, (WindowInsetsCompat$Impl31) windowInsetsCompat$Impl);
        } else if (i >= 30 && (windowInsetsCompat$Impl instanceof WindowInsetsCompat$Impl30)) {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl30(this, (WindowInsetsCompat$Impl30) windowInsetsCompat$Impl);
        } else if (i >= 29 && (windowInsetsCompat$Impl instanceof WindowInsetsCompat$Impl29)) {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl29(this, (WindowInsetsCompat$Impl29) windowInsetsCompat$Impl);
        } else if (windowInsetsCompat$Impl instanceof WindowInsetsCompat$Impl28) {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl28(this, (WindowInsetsCompat$Impl28) windowInsetsCompat$Impl);
        } else if (windowInsetsCompat$Impl instanceof WindowInsetsCompat$Impl21) {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl21(this, (WindowInsetsCompat$Impl21) windowInsetsCompat$Impl);
        } else if (windowInsetsCompat$Impl instanceof WindowInsetsCompat$Impl20) {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl20(this, (WindowInsetsCompat$Impl20) windowInsetsCompat$Impl);
        } else {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl(this);
        }
        windowInsetsCompat$Impl.copyWindowDataInto(this);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            read = WindowInsetsCompat$Impl34.CONSUMED;
        } else if (i >= 30) {
            read = WindowInsetsCompat$Impl30.CONSUMED;
        } else {
            read = WindowInsetsCompat$Impl.CONSUMED;
        }
    }

    public final int hashCode() {
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = this.IconCompatParcelizer;
        if (windowInsetsCompat$Impl == null) {
            return 0;
        }
        return windowInsetsCompat$Impl.hashCode();
    }

    public FocusRequesterModifierKt(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl35(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl34(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl31(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl30(this, windowInsets);
        } else if (i >= 29) {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl29(this, windowInsets);
        } else {
            this.IconCompatParcelizer = new WindowInsetsCompat$Impl28(this, windowInsets);
        }
    }
}
