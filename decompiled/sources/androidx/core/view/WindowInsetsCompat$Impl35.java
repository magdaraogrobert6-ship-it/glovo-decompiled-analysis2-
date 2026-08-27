package androidx.core.view;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;
import o.FocusRequesterModifierKt;
import o.FocusRestorerKt;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsCompat$Impl35 extends WindowInsetsCompat$Impl34 {
    public WindowInsetsCompat$Impl35(FocusRequesterModifierKt focusRequesterModifierKt, WindowInsets windowInsets) {
        super(focusRequesterModifierKt, windowInsets);
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl20, androidx.core.view.WindowInsetsCompat$Impl
    public void initTypeBoundingRectsMaps() {
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl20, androidx.core.view.WindowInsetsCompat$Impl
    public List<Rect> getBoundingRects(int i) {
        return this.mPlatformInsets.getBoundingRects(FocusRestorerKt.write(i));
    }

    @Override // androidx.core.view.WindowInsetsCompat$Impl20, androidx.core.view.WindowInsetsCompat$Impl
    public List<Rect> getBoundingRectsIgnoringVisibility(int i) {
        return this.mPlatformInsets.getBoundingRectsIgnoringVisibility(FocusRestorerKt.write(i));
    }

    public WindowInsetsCompat$Impl35(FocusRequesterModifierKt focusRequesterModifierKt, WindowInsetsCompat$Impl35 windowInsetsCompat$Impl35) {
        super(focusRequesterModifierKt, windowInsetsCompat$Impl35);
    }
}
