package o;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat$Impl;

/* JADX INFO: loaded from: classes.dex */
public abstract class findFocusTargetui {
    public static FocusRequesterModifierKt read(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        FocusRequesterModifierKt focusRequesterModifierKtWrite = FocusRequesterModifierKt.write(null, rootWindowInsets);
        WindowInsetsCompat$Impl windowInsetsCompat$Impl = focusRequesterModifierKtWrite.IconCompatParcelizer;
        windowInsetsCompat$Impl.setRootWindowInsets(focusRequesterModifierKtWrite);
        View rootView = view.getRootView();
        windowInsetsCompat$Impl.copyRootViewBounds(rootView);
        windowInsetsCompat$Impl.initDisplayShape(rootView);
        windowInsetsCompat$Impl.initTypeBoundingRectsMaps();
        return focusRequesterModifierKtWrite;
    }
}
