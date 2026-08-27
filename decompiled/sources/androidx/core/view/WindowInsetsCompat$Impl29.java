package androidx.core.view;

import android.view.WindowInsets;
import o.FocusRequesterModifierKt;
import o.setRight;

/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat$Impl29 extends WindowInsetsCompat$Impl28 {
    public setRight mMandatorySystemGestureInsets;
    public setRight mSystemGestureInsets;
    public setRight mTappableElementInsets;

    @Override // androidx.core.view.WindowInsetsCompat$Impl21, androidx.core.view.WindowInsetsCompat$Impl
    public void setStableInsets(setRight setright) {
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl20, androidx.core.view.WindowInsetsCompat$Impl
    public FocusRequesterModifierKt inset(int i, int i2, int i3, int i4) {
        return FocusRequesterModifierKt.write(null, this.mPlatformInsets.inset(i, i2, i3, i4));
    }

    public WindowInsetsCompat$Impl29(FocusRequesterModifierKt focusRequesterModifierKt, WindowInsets windowInsets) {
        super(focusRequesterModifierKt, windowInsets);
        this.mSystemGestureInsets = null;
        this.mMandatorySystemGestureInsets = null;
        this.mTappableElementInsets = null;
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public setRight getMandatorySystemGestureInsets() {
        if (this.mMandatorySystemGestureInsets == null) {
            this.mMandatorySystemGestureInsets = setRight.bs_(this.mPlatformInsets.getMandatorySystemGestureInsets());
        }
        return this.mMandatorySystemGestureInsets;
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public setRight getSystemGestureInsets() {
        if (this.mSystemGestureInsets == null) {
            this.mSystemGestureInsets = setRight.bs_(this.mPlatformInsets.getSystemGestureInsets());
        }
        return this.mSystemGestureInsets;
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl
    public setRight getTappableElementInsets() {
        if (this.mTappableElementInsets == null) {
            this.mTappableElementInsets = setRight.bs_(this.mPlatformInsets.getTappableElementInsets());
        }
        return this.mTappableElementInsets;
    }

    public WindowInsetsCompat$Impl29(FocusRequesterModifierKt focusRequesterModifierKt, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29) {
        super(focusRequesterModifierKt, windowInsetsCompat$Impl29);
        this.mSystemGestureInsets = null;
        this.mMandatorySystemGestureInsets = null;
        this.mTappableElementInsets = null;
    }
}
