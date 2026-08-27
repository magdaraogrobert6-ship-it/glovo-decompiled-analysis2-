package o;

import androidx.compose.ui.node.LayoutNode$$ExternalSyntheticLambda1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class accessgetPerformMeasureConstraintsp {
    public static final io.sentry.cache.read read = new io.sentry.cache.read(1);
    public static final LayoutNode$$ExternalSyntheticLambda1 write = new LayoutNode$$ExternalSyntheticLambda1(4);
    public final androidx.work.impl.WorkerWrapper.Builder IconCompatParcelizer;
    public String RemoteActionCompatParcelizer = null;
    public String serializer = null;

    public accessgetPerformMeasureConstraintsp(androidx.work.impl.WorkerWrapper.Builder builder) {
        this.IconCompatParcelizer = builder;
    }

    public static void IconCompatParcelizer(androidx.work.impl.WorkerWrapper.Builder builder, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            builder.RemoteActionCompatParcelizer(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e) {
            SentryLogcatAdapter.write("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e);
        }
    }
}
