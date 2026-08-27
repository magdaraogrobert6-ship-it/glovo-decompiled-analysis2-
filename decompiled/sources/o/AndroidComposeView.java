package o;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.Metadata;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class AndroidComposeView implements Runnable {
    public static final Object RemoteActionCompatParcelizer = new Object();
    public static Boolean read;
    public static Boolean serializer;
    public final Context IconCompatParcelizer;
    public final PowerManager.WakeLock MediaDescriptionCompat;
    public final r8lambdaGBNkvgSHmmv9lTp9Y9dUExj6Ic MediaSessionCompatQueueItem;
    public final long RatingCompat;
    public final Metadata write;

    public final boolean RemoteActionCompatParcelizer() {
        boolean z;
        synchronized (this) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.IconCompatParcelizer.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        return z;
    }

    public static boolean IconCompatParcelizer(Context context) {
        boolean zBooleanValue;
        synchronized (RemoteActionCompatParcelizer) {
            Boolean bool = serializer;
            if (bool == null && bool == null) {
                zBooleanValue = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                if (!zBooleanValue) {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
            } else {
                zBooleanValue = bool.booleanValue();
            }
            serializer = Boolean.valueOf(zBooleanValue);
        }
        return zBooleanValue;
    }

    public static boolean RemoteActionCompatParcelizer(Context context) {
        boolean zBooleanValue;
        synchronized (RemoteActionCompatParcelizer) {
            Boolean bool = read;
            if (bool == null && bool == null) {
                zBooleanValue = context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0;
                if (!zBooleanValue) {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
            } else {
                zBooleanValue = bool.booleanValue();
            }
            read = Boolean.valueOf(zBooleanValue);
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r8lambdaGBNkvgSHmmv9lTp9Y9dUExj6Ic r8lambdagbnkvgshmmv9ltp9y9duexj6ic = this.MediaSessionCompatQueueItem;
        Context context = this.IconCompatParcelizer;
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context);
        PowerManager.WakeLock wakeLock = this.MediaDescriptionCompat;
        if (zRemoteActionCompatParcelizer) {
            wakeLock.acquire(180000L);
        }
        try {
            try {
                try {
                    r8lambdagbnkvgshmmv9ltp9y9duexj6ic.IconCompatParcelizer(true);
                    if (!this.write.RemoteActionCompatParcelizer()) {
                        r8lambdagbnkvgshmmv9ltp9y9duexj6ic.IconCompatParcelizer(false);
                        if (!RemoteActionCompatParcelizer(context)) {
                            return;
                        }
                    } else {
                        if (!IconCompatParcelizer(context) || RemoteActionCompatParcelizer()) {
                            if (r8lambdagbnkvgshmmv9ltp9y9duexj6ic.write()) {
                                r8lambdagbnkvgshmmv9ltp9y9duexj6ic.IconCompatParcelizer(false);
                            } else {
                                r8lambdagbnkvgshmmv9ltp9y9duexj6ic.RemoteActionCompatParcelizer(this.RatingCompat);
                            }
                            if (RemoteActionCompatParcelizer(context)) {
                                wakeLock.release();
                                return;
                            }
                            return;
                        }
                        r8lambdaTCv4mWygRVUofdfoGfRKeTcqM r8lambdatcv4mwygrvuofdfogfrketcqm = new r8lambdaTCv4mWygRVUofdfoGfRKeTcqM();
                        r8lambdatcv4mwygrvuofdfogfrketcqm.read = this;
                        Log.isLoggable("FirebaseMessaging", 3);
                        context.registerReceiver(r8lambdatcv4mwygrvuofdfogfrketcqm, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        if (!RemoteActionCompatParcelizer(context)) {
                            return;
                        }
                    }
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                    }
                } catch (IOException e) {
                    SentryLogcatAdapter.serializer("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    r8lambdagbnkvgshmmv9ltp9y9duexj6ic.IconCompatParcelizer(false);
                    if (RemoteActionCompatParcelizer(context)) {
                        wakeLock.release();
                    }
                }
            } catch (RuntimeException unused2) {
            }
        } catch (Throwable th) {
            if (RemoteActionCompatParcelizer(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused3) {
                }
            }
            throw th;
        }
    }

    public AndroidComposeView(r8lambdaGBNkvgSHmmv9lTp9Y9dUExj6Ic r8lambdagbnkvgshmmv9ltp9y9duexj6ic, Context context, Metadata metadata, long j) {
        this.MediaSessionCompatQueueItem = r8lambdagbnkvgshmmv9ltp9y9duexj6ic;
        this.IconCompatParcelizer = context;
        this.RatingCompat = j;
        this.write = metadata;
        this.MediaDescriptionCompat = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
}
