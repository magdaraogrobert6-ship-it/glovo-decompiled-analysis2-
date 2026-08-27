package androidx.core.view;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;
import o.FocusRequesterModifierKt;
import o.setEnter;

/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat$Impl28 extends WindowInsetsCompat$Impl21 {
    public WindowInsetsCompat$Impl28(FocusRequesterModifierKt focusRequesterModifierKt, WindowInsets windowInsets) {
        super(focusRequesterModifierKt, windowInsets);
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public FocusRequesterModifierKt consumeDisplayCutout() {
        return FocusRequesterModifierKt.write(null, this.mPlatformInsets.consumeDisplayCutout());
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public setEnter getDisplayCutout() {
        DisplayCutout displayCutout = this.mPlatformInsets.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new setEnter(displayCutout);
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public int hashCode() {
        return this.mPlatformInsets.hashCode();
    }

    public WindowInsetsCompat$Impl28(FocusRequesterModifierKt focusRequesterModifierKt, WindowInsetsCompat$Impl28 windowInsetsCompat$Impl28) {
        super(focusRequesterModifierKt, windowInsetsCompat$Impl28);
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl20, androidx.core.view.WindowInsetsCompat$Impl
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat$Impl28)) {
            return false;
        }
        WindowInsetsCompat$Impl28 windowInsetsCompat$Impl28 = (WindowInsetsCompat$Impl28) obj;
        return Objects.equals(this.mPlatformInsets, windowInsetsCompat$Impl28.mPlatformInsets) && Objects.equals(this.mRootViewVisibleInsets, windowInsetsCompat$Impl28.mRootViewVisibleInsets) && WindowInsetsCompat$Impl20.systemBarVisibilityEquals(this.mSystemUiVisibility, windowInsetsCompat$Impl28.mSystemUiVisibility);
    }
}
