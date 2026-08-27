package androidx.core.view;

import android.view.WindowInsets;
import o.FocusRequesterModifierKt;
import o.setRight;

/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat$Impl21 extends WindowInsetsCompat$Impl20 {
    public setRight mStableInsets;

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public void setStableInsets(setRight setright) {
        this.mStableInsets = setright;
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public FocusRequesterModifierKt consumeStableInsets() {
        return FocusRequesterModifierKt.write(null, this.mPlatformInsets.consumeStableInsets());
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public FocusRequesterModifierKt consumeSystemWindowInsets() {
        return FocusRequesterModifierKt.write(null, this.mPlatformInsets.consumeSystemWindowInsets());
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public boolean isConsumed() {
        return this.mPlatformInsets.isConsumed();
    }

    public WindowInsetsCompat$Impl21(FocusRequesterModifierKt focusRequesterModifierKt, WindowInsetsCompat$Impl21 windowInsetsCompat$Impl21) {
        super(focusRequesterModifierKt, windowInsetsCompat$Impl21);
        this.mStableInsets = null;
        this.mStableInsets = windowInsetsCompat$Impl21.mStableInsets;
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public final setRight getStableInsets() {
        if (this.mStableInsets == null) {
            WindowInsets windowInsets = this.mPlatformInsets;
            this.mStableInsets = setRight.IconCompatParcelizer(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.mStableInsets;
    }

    public WindowInsetsCompat$Impl21(FocusRequesterModifierKt focusRequesterModifierKt, WindowInsets windowInsets) {
        super(focusRequesterModifierKt, windowInsets);
        this.mStableInsets = null;
    }
}
