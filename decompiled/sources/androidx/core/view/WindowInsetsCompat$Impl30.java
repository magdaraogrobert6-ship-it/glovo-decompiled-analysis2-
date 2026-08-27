package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import o.FocusRequesterModifierKt;
import o.getFallback;
import o.setRight;

/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat$Impl30 extends WindowInsetsCompat$Impl29 {
    public static final FocusRequesterModifierKt CONSUMED = FocusRequesterModifierKt.write(null, WindowInsets.CONSUMED);

    public WindowInsetsCompat$Impl30(FocusRequesterModifierKt focusRequesterModifierKt, WindowInsets windowInsets) {
        super(focusRequesterModifierKt, windowInsets);
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl20, androidx.core.view.WindowInsetsCompat$Impl
    public final void copyRootViewBounds(View view) {
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl20, androidx.core.view.WindowInsetsCompat$Impl
    public setRight getInsets(int i) {
        return setRight.bs_(this.mPlatformInsets.getInsets(getFallback.RemoteActionCompatParcelizer(i)));
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl20, androidx.core.view.WindowInsetsCompat$Impl
    public setRight getInsetsIgnoringVisibility(int i) {
        return setRight.bs_(this.mPlatformInsets.getInsetsIgnoringVisibility(getFallback.RemoteActionCompatParcelizer(i)));
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl20, androidx.core.view.WindowInsetsCompat$Impl
    public boolean isVisible(int i) {
        return this.mPlatformInsets.isVisible(getFallback.RemoteActionCompatParcelizer(i));
    }

    public WindowInsetsCompat$Impl30(FocusRequesterModifierKt focusRequesterModifierKt, WindowInsetsCompat$Impl30 windowInsetsCompat$Impl30) {
        super(focusRequesterModifierKt, windowInsetsCompat$Impl30);
    }
}
