package androidx.compose.ui.tooling;

import io.sentry.android.core.SentryLogcatAdapter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewLogger {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void logError$ui_tooling(String str, Throwable th) {
            SentryLogcatAdapter.read("PreviewLogger", str, th);
        }

        public final void logWarning$ui_tooling(String str, Throwable th) {
            SentryLogcatAdapter.write("PreviewLogger", str, th);
        }

        private Companion() {
        }

        public static /* synthetic */ void logError$ui_tooling$default(Companion companion, String str, Throwable th, int i, Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            companion.logError$ui_tooling(str, th);
        }

        public static /* synthetic */ void logWarning$ui_tooling$default(Companion companion, String str, Throwable th, int i, Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            companion.logWarning$ui_tooling(str, th);
        }
    }
}
