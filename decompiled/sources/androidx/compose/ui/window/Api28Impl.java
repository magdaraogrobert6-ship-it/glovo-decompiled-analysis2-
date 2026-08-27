package androidx.compose.ui.window;

import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
final class Api28Impl {
    public static final Api28Impl INSTANCE = new Api28Impl();

    private Api28Impl() {
    }

    public final void setLayoutInDisplayCutout(WindowManager.LayoutParams layoutParams) {
        layoutParams.layoutInDisplayCutoutMode = 3;
    }
}
