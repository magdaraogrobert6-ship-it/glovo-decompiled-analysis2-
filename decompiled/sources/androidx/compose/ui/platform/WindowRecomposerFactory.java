package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.InternalComposeUiApi;
import o.sendContentCaptureAppearEvents;

/* JADX INFO: loaded from: classes.dex */
@InternalComposeUiApi
public interface WindowRecomposerFactory {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final WindowRecomposerFactory LifecycleAware = new WindowRecomposerFactory() { // from class: androidx.compose.ui.platform.WindowRecomposerFactory$Companion$$ExternalSyntheticLambda0
            @Override // androidx.compose.ui.platform.WindowRecomposerFactory
            public final sendContentCaptureAppearEvents createRecomposer(View view) {
                return WindowRecomposerFactory.Companion.LifecycleAware$lambda$0(view);
            }
        };

        private Companion() {
        }

        public final WindowRecomposerFactory getLifecycleAware() {
            return LifecycleAware;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sendContentCaptureAppearEvents LifecycleAware$lambda$0(View view) {
            return WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer$default(view, null, null, 3, null);
        }
    }

    sendContentCaptureAppearEvents createRecomposer(View view);
}
