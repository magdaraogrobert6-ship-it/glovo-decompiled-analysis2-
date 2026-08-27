package androidx.compose.ui.contentcapture;

import androidx.compose.ui.ExperimentalComposeUiApi;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalComposeUiApi
public interface ContentCaptureManager {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean isEnabled = true;

        private Companion() {
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void isEnabled$annotations() {
        }

        public final boolean isEnabled() {
            return isEnabled;
        }

        public final void setEnabled(boolean z) {
            isEnabled = z;
        }
    }
}
