package o;

import android.util.Log;
import com.roadrunner.home.CreateHomeScope;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class markNodeAndSubtreeAsPlaced implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler IconCompatParcelizer;
    public final AtomicBoolean RemoteActionCompatParcelizer = new AtomicBoolean(false);
    public final access500 read;
    public final CreateHomeScope serializer;
    public final getCachedAlignmentLinesMap write;

    public markNodeAndSubtreeAsPlaced(CreateHomeScope createHomeScope, access500 access500Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, getCachedAlignmentLinesMap getcachedalignmentlinesmap) {
        this.serializer = createHomeScope;
        this.read = access500Var;
        this.IconCompatParcelizer = uncaughtExceptionHandler;
        this.write = getcachedalignmentlinesmap;
    }

    public final boolean IconCompatParcelizer(Thread thread, Throwable th) {
        if (thread == null) {
            SentryLogcatAdapter.read("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            SentryLogcatAdapter.read("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (!this.write.RemoteActionCompatParcelizer()) {
            return true;
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.IconCompatParcelizer;
        AtomicBoolean atomicBoolean = this.RemoteActionCompatParcelizer;
        atomicBoolean.set(true);
        try {
            if (IconCompatParcelizer(thread, th)) {
                this.serializer.serializer(this.read, thread, th);
            } else {
                Log.isLoggable("FirebaseCrashlytics", 3);
            }
        } catch (Exception e) {
            SentryLogcatAdapter.read("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e);
        } finally {
            if (uncaughtExceptionHandler != null) {
                Log.isLoggable("FirebaseCrashlytics", 3);
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } else {
                Log.isLoggable("FirebaseCrashlytics", 3);
                System.exit(1);
            }
            atomicBoolean.set(false);
        }
    }
}
