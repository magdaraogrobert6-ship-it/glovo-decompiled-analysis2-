package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
final class Api35Impl {
    public static final Api35Impl INSTANCE = new Api35Impl();

    private Api35Impl() {
    }

    public static final void setRequestedFrameRate(View view, float f) {
        view.setRequestedFrameRate(f);
    }
}
