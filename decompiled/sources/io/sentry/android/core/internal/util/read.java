package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.SystemClock;
import androidx.sqlite.SQLite;
import io.sentry.SentryOptions;
import io.sentry.android.core._init_lambda3;
import io.sentry.android.core.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
import io.sentry.android.core.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
import io.sentry.android.core.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.UriActionExternalSyntheticLambda4;
import o.getActionTypeandroid_sdk_ui_release;
import o.parseandroid_sdk_ui_release;
import o.parselambda1;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class read implements parseandroid_sdk_ui_release, r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 {
    public static volatile ConnectivityManager write;
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ MediaBrowserCompatMediaItem;
    public final ArrayList MediaMetadataCompat;
    public volatile NetworkCapabilities MediaSessionCompatQueueItem;
    public final io.sentry.util.RemoteActionCompatParcelizer MediaSessionCompatResultReceiverWrapper;
    public volatile write MediaSessionCompatToken;
    public volatile Network ParcelableVolumeInfo;
    public final AtomicBoolean PlaybackStateCompat;
    public volatile long PlaybackStateCompatCustomAction;
    public final Context RatingCompat;
    public final serializer r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final SentryOptions r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public static final io.sentry.util.RemoteActionCompatParcelizer serializer = new io.sentry.util.RemoteActionCompatParcelizer();
    public static final io.sentry.util.RemoteActionCompatParcelizer IconCompatParcelizer = new io.sentry.util.RemoteActionCompatParcelizer();
    public static final ArrayList RemoteActionCompatParcelizer = new ArrayList();
    public static final int[] MediaDescriptionCompat = {1, 0, 3, 2};
    public static final int[] read = new int[2];

    public static String write(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    public read(Context context, SentryOptions sentryOptions, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq) {
        serializer serializerVar = serializer.IconCompatParcelizer;
        this.MediaSessionCompatResultReceiverWrapper = new io.sentry.util.RemoteActionCompatParcelizer();
        this.PlaybackStateCompatCustomAction = 0L;
        this.PlaybackStateCompat = new AtomicBoolean(false);
        Context applicationContext = context.getApplicationContext();
        this.RatingCompat = applicationContext != null ? applicationContext : context;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = sentryOptions;
        this.MediaBrowserCompatMediaItem = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = serializerVar;
        this.MediaMetadataCompat = new ArrayList();
        int[] iArr = read;
        iArr[0] = 12;
        iArr[1] = 16;
        read(new RemoteActionCompatParcelizer(this, 0));
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer.serializer(this);
    }

    @Override // o.parseandroid_sdk_ui_release
    public final getActionTypeandroid_sdk_ui_release IconCompatParcelizer() {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        if (SystemClock.uptimeMillis() - this.PlaybackStateCompatCustomAction >= 120000) {
            IconCompatParcelizer(null);
        }
        return write();
    }

    public final void IconCompatParcelizer(NetworkCapabilities networkCapabilities) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatResultReceiverWrapper.serializer();
        try {
            if (networkCapabilities != null) {
                this.MediaSessionCompatQueueItem = networkCapabilities;
            } else {
                if (!SQLite.serializer(this.RatingCompat)) {
                    this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.MediaSessionCompatQueueItem = null;
                    this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                    this.PlaybackStateCompatCustomAction = SystemClock.uptimeMillis();
                    uriActionExternalSyntheticLambda4Serializer.close();
                    return;
                }
                this.MediaBrowserCompatMediaItem.getClass();
                ConnectivityManager connectivityManagerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.RatingCompat, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getLogger());
                if (connectivityManagerRemoteActionCompatParcelizer != null) {
                    Network activeNetwork = connectivityManagerRemoteActionCompatParcelizer.getActiveNetwork();
                    this.MediaSessionCompatQueueItem = activeNetwork != null ? connectivityManagerRemoteActionCompatParcelizer.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.MediaSessionCompatQueueItem = null;
                }
            }
            this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
            this.PlaybackStateCompatCustomAction = SystemClock.uptimeMillis();
            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Cache updated - Status: " + write() + ", Type: " + MediaDescriptionCompat(), new Object[0]);
        } catch (Throwable th) {
            try {
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to update connection status cache", th);
                this.MediaSessionCompatQueueItem = null;
                this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
                this.PlaybackStateCompatCustomAction = SystemClock.uptimeMillis();
            } catch (Throwable th2) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        uriActionExternalSyntheticLambda4Serializer.close();
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatResultReceiverWrapper.serializer();
        if (z) {
            try {
                this.MediaMetadataCompat.clear();
            } catch (Throwable th) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        write writeVar = this.MediaSessionCompatToken;
        this.MediaSessionCompatToken = null;
        if (writeVar != null) {
            Context context = this.RatingCompat;
            BrazeActionParserExternalSyntheticLambda0 logger = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getLogger();
            ConnectivityManager connectivityManagerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, logger);
            if (connectivityManagerRemoteActionCompatParcelizer != null) {
                try {
                    connectivityManagerRemoteActionCompatParcelizer.unregisterNetworkCallback(writeVar);
                } catch (Throwable th3) {
                    logger.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "unregisterNetworkCallback failed", th3);
                }
            }
        }
        this.MediaSessionCompatQueueItem = null;
        this.ParcelableVolumeInfo = null;
        this.PlaybackStateCompatCustomAction = 0L;
        uriActionExternalSyntheticLambda4Serializer.close();
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Network callback unregistered", new Object[0]);
    }

    public final void read(Runnable runnable) {
        SentryOptions sentryOptions = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        try {
            sentryOptions.getExecutorService().RemoteActionCompatParcelizer(runnable);
        } catch (Throwable th) {
            sentryOptions.getLogger().serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "AndroidConnectionStatusProvider submit failed", th);
        }
    }

    @Override // o.parseandroid_sdk_ui_release
    public final boolean read(parselambda1 parselambda1Var) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatResultReceiverWrapper.serializer();
        try {
            this.MediaMetadataCompat.add(parselambda1Var);
            uriActionExternalSyntheticLambda4Serializer.close();
            read();
            return this.MediaSessionCompatToken != null;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.parseandroid_sdk_ui_release
    public final void write(parselambda1 parselambda1Var) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatResultReceiverWrapper.serializer();
        try {
            this.MediaMetadataCompat.remove(parselambda1Var);
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean write(Context context, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq, ConnectivityManager.NetworkCallback networkCallback) {
        r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.getClass();
        if (!SQLite.serializer(context)) {
            brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = IconCompatParcelizer.serializer();
        try {
            RemoteActionCompatParcelizer.add(networkCallback);
            uriActionExternalSyntheticLambda4Serializer.close();
            return true;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        read(new IconCompatParcelizer(this, 0));
    }

    public static ConnectivityManager RemoteActionCompatParcelizer(Context context, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        if (write != null) {
            return write;
        }
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = serializer.serializer();
        try {
            if (write != null) {
                ConnectivityManager connectivityManager = write;
                uriActionExternalSyntheticLambda4Serializer.close();
                return connectivityManager;
            }
            write = (ConnectivityManager) context.getSystemService("connectivity");
            if (write == null) {
                brazeActionParserExternalSyntheticLambda0.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = write;
            uriActionExternalSyntheticLambda4Serializer.close();
            return connectivityManager2;
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String MediaDescriptionCompat() {
        NetworkCapabilities networkCapabilities = this.MediaSessionCompatQueueItem;
        if (networkCapabilities != null) {
            return write(networkCapabilities);
        }
        Context context = this.RatingCompat;
        BrazeActionParserExternalSyntheticLambda0 logger = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getLogger();
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = this.MediaBrowserCompatMediaItem;
        ConnectivityManager connectivityManagerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, logger);
        if (connectivityManagerRemoteActionCompatParcelizer != null) {
            if (!SQLite.serializer(context)) {
                logger.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                return null;
            }
            try {
                r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.getClass();
                Network activeNetwork = connectivityManagerRemoteActionCompatParcelizer.getActiveNetwork();
                if (activeNetwork == null) {
                    logger.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities2 = connectivityManagerRemoteActionCompatParcelizer.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities2 == null) {
                    logger.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport = networkCapabilities2.hasTransport(3);
                boolean zHasTransport2 = networkCapabilities2.hasTransport(1);
                boolean zHasTransport3 = networkCapabilities2.hasTransport(0);
                if (zHasTransport) {
                    return "ethernet";
                }
                if (zHasTransport2) {
                    return "wifi";
                }
                if (zHasTransport3) {
                    return "cellular";
                }
            } catch (Throwable th) {
                logger.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to retrieve network info", th);
                return null;
            }
        }
        return null;
    }

    public final getActionTypeandroid_sdk_ui_release write() {
        if (this.MediaSessionCompatQueueItem != null) {
            NetworkCapabilities networkCapabilities = this.MediaSessionCompatQueueItem;
            if (networkCapabilities != null) {
                boolean zHasCapability = networkCapabilities.hasCapability(12);
                this.MediaBrowserCompatMediaItem.getClass();
                if (zHasCapability && networkCapabilities.hasCapability(16)) {
                    for (int i : MediaDescriptionCompat) {
                        if (networkCapabilities.hasTransport(i)) {
                            return getActionTypeandroid_sdk_ui_release.CONNECTED;
                        }
                    }
                }
            }
            return getActionTypeandroid_sdk_ui_release.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.RatingCompat, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getLogger());
        if (connectivityManagerRemoteActionCompatParcelizer == null) {
            return getActionTypeandroid_sdk_ui_release.UNKNOWN;
        }
        Context context = this.RatingCompat;
        BrazeActionParserExternalSyntheticLambda0 logger = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getLogger();
        if (!SQLite.serializer(context)) {
            logger.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return getActionTypeandroid_sdk_ui_release.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManagerRemoteActionCompatParcelizer.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? getActionTypeandroid_sdk_ui_release.CONNECTED : getActionTypeandroid_sdk_ui_release.DISCONNECTED;
            }
            logger.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return getActionTypeandroid_sdk_ui_release.DISCONNECTED;
        } catch (Throwable th) {
            logger.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Could not retrieve Connection Status", th);
            return getActionTypeandroid_sdk_ui_release.UNKNOWN;
        }
    }

    public final void read() {
        if (_init_lambda3.IconCompatParcelizer() && this.MediaSessionCompatToken == null) {
            UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaSessionCompatResultReceiverWrapper.serializer();
            try {
                if (this.MediaSessionCompatToken != null) {
                    uriActionExternalSyntheticLambda4Serializer.close();
                    return;
                }
                write writeVar = new write(0, this);
                Context context = this.RatingCompat;
                BrazeActionParserExternalSyntheticLambda0 logger = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getLogger();
                this.MediaBrowserCompatMediaItem.getClass();
                ConnectivityManager connectivityManagerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, logger);
                if (connectivityManagerRemoteActionCompatParcelizer != null) {
                    if (SQLite.serializer(context)) {
                        try {
                            connectivityManagerRemoteActionCompatParcelizer.registerDefaultNetworkCallback(writeVar);
                            this.MediaSessionCompatToken = writeVar;
                            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Network callback registered successfully", new Object[0]);
                        } catch (Throwable th) {
                            logger.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "registerDefaultNetworkCallback failed", th);
                            this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to register network callback", new Object[0]);
                        }
                        uriActionExternalSyntheticLambda4Serializer.close();
                    }
                    logger.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                }
                this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to register network callback", new Object[0]);
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                try {
                    uriActionExternalSyntheticLambda4Serializer.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // io.sentry.android.core.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
    public final void D_() {
        if (this.MediaSessionCompatToken == null) {
            return;
        }
        read(new IconCompatParcelizer(this, 1));
    }

    @Override // io.sentry.android.core.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8
    public final void RemoteActionCompatParcelizer() {
        if (this.MediaSessionCompatToken != null) {
            return;
        }
        read(new RemoteActionCompatParcelizer(this, 1));
    }

    @Override // o.parseandroid_sdk_ui_release
    public final String serializer() {
        this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getClass();
        if (SystemClock.uptimeMillis() - this.PlaybackStateCompatCustomAction >= 120000) {
            IconCompatParcelizer(null);
        }
        return MediaDescriptionCompat();
    }
}
