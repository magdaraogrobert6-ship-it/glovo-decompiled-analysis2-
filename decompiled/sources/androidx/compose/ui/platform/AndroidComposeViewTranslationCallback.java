package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;

/* JADX INFO: loaded from: classes4.dex */
final class AndroidComposeViewTranslationCallback implements ViewTranslationCallback {
    public static final AndroidComposeViewTranslationCallback INSTANCE = new AndroidComposeViewTranslationCallback();

    private AndroidComposeViewTranslationCallback() {
    }

    public boolean onClearTranslation(View view) {
        view.getClass();
        ((AndroidComposeView) view).getContentCaptureManager$ui().onClearTranslation$ui();
        return true;
    }

    public boolean onHideTranslation(View view) {
        view.getClass();
        ((AndroidComposeView) view).getContentCaptureManager$ui().onHideTranslation$ui();
        return true;
    }

    public boolean onShowTranslation(View view) {
        view.getClass();
        ((AndroidComposeView) view).getContentCaptureManager$ui().onShowTranslation$ui();
        return true;
    }
}
