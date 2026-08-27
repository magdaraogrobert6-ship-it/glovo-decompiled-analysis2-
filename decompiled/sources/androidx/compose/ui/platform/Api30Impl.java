package androidx.compose.ui.platform;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class Api30Impl {
    public static final Api30Impl INSTANCE = new Api30Impl();

    private Api30Impl() {
    }

    public final boolean isShowingLayoutBounds(View view) {
        return view.isShowingLayoutBounds();
    }
}
