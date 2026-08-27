package o;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.SyncTask$ConnectivityChangeReceiver;
import io.grpc.SynchronizationContext$1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class getMethodQuietly implements Runnable {
    public final Object IconCompatParcelizer;
    public final Executor RemoteActionCompatParcelizer;
    public final long read;
    public final Object serializer;
    public final /* synthetic */ int write;

    public getMethodQuietly(FirebaseMessaging firebaseMessaging, long j) {
        this.write = 1;
        this.RemoteActionCompatParcelizer = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new accessgetTvInputHdmi1cp("firebase-iid-executor"));
        this.serializer = firebaseMessaging;
        this.read = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.getApplicationContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.IconCompatParcelizer = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.write;
        Object obj = this.IconCompatParcelizer;
        if (i == 0) {
            ((getMethodQuietlylambda1) this.RemoteActionCompatParcelizer).execute((invokeMethodQuietlylambda0) obj);
            return;
        }
        PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
        androidx.transition.TransitionValuesMaps transitionValuesMaps = androidx.transition.TransitionValuesMaps.read();
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.serializer;
        if (transitionValuesMaps.IconCompatParcelizer(firebaseMessaging.getApplicationContext())) {
            wakeLock.acquire();
        }
        try {
            firebaseMessaging.setSyncScheduledOrRunning(true);
            if (!firebaseMessaging.isGmsCorePresent()) {
                firebaseMessaging.setSyncScheduledOrRunning(false);
            } else if (!androidx.transition.TransitionValuesMaps.read().RemoteActionCompatParcelizer(firebaseMessaging.getApplicationContext()) || serializer()) {
                if (write()) {
                    firebaseMessaging.setSyncScheduledOrRunning(false);
                } else {
                    firebaseMessaging.syncWithDelaySecondsInternal(this.read);
                }
            } else {
                SyncTask$ConnectivityChangeReceiver syncTask$ConnectivityChangeReceiver = new SyncTask$ConnectivityChangeReceiver();
                syncTask$ConnectivityChangeReceiver.serializer = this;
                syncTask$ConnectivityChangeReceiver.read();
            }
        } catch (IOException e) {
            SentryLogcatAdapter.serializer("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
            firebaseMessaging.setSyncScheduledOrRunning(false);
        } finally {
            if (androidx.transition.TransitionValuesMaps.read().IconCompatParcelizer(firebaseMessaging.getApplicationContext())) {
                wakeLock.release();
            }
        }
    }

    public boolean serializer() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.serializer).getApplicationContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean write() throws IOException {
        try {
            if (((FirebaseMessaging) this.serializer).blockingGetToken() == null) {
                SentryLogcatAdapter.serializer("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            SentryLogcatAdapter.IconCompatParcelizer("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    public String toString() {
        if (this.write != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((SynchronizationContext$1) this.serializer).toString());
        sb.append("(scheduled in SynchronizationContext with delay of ");
        return c8$$ExternalSyntheticOutline0.m(this.read, ")", sb);
    }

    public getMethodQuietly(getMethodQuietlylambda1 getmethodquietlylambda1, invokeMethodQuietlylambda0 invokemethodquietlylambda0, SynchronizationContext$1 synchronizationContext$1, long j) {
        this.write = 0;
        this.RemoteActionCompatParcelizer = getmethodquietlylambda1;
        this.IconCompatParcelizer = invokemethodquietlylambda0;
        this.serializer = synchronizationContext$1;
        this.read = j;
    }
}
