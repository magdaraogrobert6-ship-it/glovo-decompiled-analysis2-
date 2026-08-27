package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;
import o.FocusRequesterModifierKt;
import o.FocusRestorerKt;
import o.setRight;

/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat$Impl34 extends WindowInsetsCompat$Impl31 {
    public static final FocusRequesterModifierKt CONSUMED = FocusRequesterModifierKt.write(null, WindowInsets.CONSUMED);

    public WindowInsetsCompat$Impl34(FocusRequesterModifierKt focusRequesterModifierKt, WindowInsets windowInsets) {
        super(focusRequesterModifierKt, windowInsets);
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl20, androidx.core.view.WindowInsetsCompat$Impl
    public void initDisplayShape(View view) {
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl30, androidx.core.view.WindowInsetsCompat$Impl20, androidx.core.view.WindowInsetsCompat$Impl
    public setRight getInsets(int i) {
        return setRight.bs_(this.mPlatformInsets.getInsets(FocusRestorerKt.write(i)));
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl30, androidx.core.view.WindowInsetsCompat$Impl20, androidx.core.view.WindowInsetsCompat$Impl
    public setRight getInsetsIgnoringVisibility(int i) {
        return setRight.bs_(this.mPlatformInsets.getInsetsIgnoringVisibility(FocusRestorerKt.write(i)));
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl30, androidx.core.view.WindowInsetsCompat$Impl20, androidx.core.view.WindowInsetsCompat$Impl
    public boolean isVisible(int i) {
        return this.mPlatformInsets.isVisible(FocusRestorerKt.write(i));
    }

    public WindowInsetsCompat$Impl34(FocusRequesterModifierKt focusRequesterModifierKt, WindowInsetsCompat$Impl34 windowInsetsCompat$Impl34) {
        super(focusRequesterModifierKt, windowInsetsCompat$Impl34);
    }
}
