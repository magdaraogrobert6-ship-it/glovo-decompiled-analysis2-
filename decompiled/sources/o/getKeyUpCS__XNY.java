package o;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import coil3.Extras$Key;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class getKeyUpCS__XNY {
    public final Runnable IconCompatParcelizer;
    public volatile Map MediaDescriptionCompat;
    public final ContentResolver serializer;
    public final Uri write;
    public static final ConcurrentHashMap read = new ConcurrentHashMap();
    public static final String[] RemoteActionCompatParcelizer = {"key", "value"};
    public KeyEvent MediaSessionCompatQueueItem = null;
    public volatile boolean RatingCompat = true;
    public final Object MediaBrowserCompatMediaItem = new Object();
    public final ArrayList MediaMetadataCompat = new ArrayList();

    public static void RemoteActionCompatParcelizer() {
        Iterator it = read.values().iterator();
        while (it.hasNext()) {
            getKeyUpCS__XNY getkeyupcs__xny = (getKeyUpCS__XNY) it.next();
            synchronized (getkeyupcs__xny) {
                if (getkeyupcs__xny.RatingCompat) {
                    getkeyupcs__xny.RatingCompat = false;
                } else {
                    KeyEvent keyEvent = getkeyupcs__xny.MediaSessionCompatQueueItem;
                    if (keyEvent != null) {
                        getkeyupcs__xny.serializer.unregisterContentObserver(keyEvent);
                        getkeyupcs__xny.MediaSessionCompatQueueItem = null;
                    }
                }
            }
            it.remove();
        }
    }

    public getKeyUpCS__XNY(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        contentResolver.getClass();
        uri.getClass();
        this.serializer = contentResolver;
        this.write = uri;
        this.IconCompatParcelizer = runnable;
    }

    public static getKeyUpCS__XNY serializer(final ContentResolver contentResolver, final Uri uri, final Runnable runnable) {
        getKeyUpCS__XNY getkeyupcs__xny = (getKeyUpCS__XNY) read.computeIfAbsent(uri, new Function() { // from class: o.accessgetKeyUpcp
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                return new getKeyUpCS__XNY(contentResolver, uri, runnable);
            }
        });
        try {
            if (!getkeyupcs__xny.RatingCompat) {
                return getkeyupcs__xny;
            }
            synchronized (getkeyupcs__xny) {
                if (getkeyupcs__xny.RatingCompat) {
                    KeyEvent keyEvent = new KeyEvent(getkeyupcs__xny);
                    getkeyupcs__xny.serializer.registerContentObserver(getkeyupcs__xny.write, false, keyEvent);
                    getkeyupcs__xny.MediaSessionCompatQueueItem = keyEvent;
                    getkeyupcs__xny.RatingCompat = false;
                }
            }
            return getkeyupcs__xny;
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.StrictMode$ThreadPolicy, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Map serializer() {
        Map map;
        ?? r0;
        Object objM_;
        Map map2 = this.MediaDescriptionCompat;
        ?? r1 = map2;
        if (map2 == null) {
            synchronized (this.MediaBrowserCompatMediaItem) {
                ?? r2 = this.MediaDescriptionCompat;
                r0 = r2;
                if (r2 == 0) {
                    try {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                Extras$Key extras$Key = new Extras$Key(22, this);
                                try {
                                    objM_ = extras$Key.m_();
                                } catch (SecurityException unused) {
                                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                                    try {
                                        objM_ = extras$Key.m_();
                                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                                    } catch (Throwable th) {
                                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                                        throw th;
                                    }
                                }
                                map = (Map) objM_;
                            } catch (SecurityException e) {
                                e = e;
                                SentryLogcatAdapter.write("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                                map = Collections.EMPTY_MAP;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            SentryLogcatAdapter.write("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                        } catch (IllegalStateException e3) {
                            e = e3;
                            SentryLogcatAdapter.write("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                            map = Collections.EMPTY_MAP;
                        }
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        this.MediaDescriptionCompat = map;
                        r0 = map;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(r2);
                        throw th2;
                    }
                }
            }
            r1 = r0;
        }
        return r1 != 0 ? r1 : Collections.EMPTY_MAP;
    }
}
