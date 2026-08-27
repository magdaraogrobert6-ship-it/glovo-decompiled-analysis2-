package o;

import android.content.Context;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class accessgetTvInputComponent2cp {
    public static void read(Context context, Throwable th) {
        try {
            accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        } catch (Exception e) {
            SentryLogcatAdapter.read("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }
}
