package o;

import android.os.Build;
import android.util.Log;
import com.huawei.riemann.location.common.utils.Constant;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class accessdrawImageAZ2fEMsjd {
    public static final boolean IconCompatParcelizer;
    public static final File RemoteActionCompatParcelizer;
    public static volatile accessdrawImageAZ2fEMsjd read;
    public static final boolean write;
    public int serializer;
    public boolean MediaSessionCompatQueueItem = true;
    public final AtomicBoolean MediaDescriptionCompat = new AtomicBoolean(false);
    public final int RatingCompat = 20000;

    public static accessdrawImageAZ2fEMsjd serializer() {
        if (read == null) {
            synchronized (accessdrawImageAZ2fEMsjd.class) {
                if (read == null) {
                    read = new accessdrawImageAZ2fEMsjd();
                }
            }
        }
        return read;
    }

    public final boolean RemoteActionCompatParcelizer(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (!z) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (!IconCompatParcelizer) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (write && !this.MediaDescriptionCompat.get()) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (z2) {
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        if (i >= 0 && i2 >= 0) {
            synchronized (this) {
                int i3 = this.serializer + 1;
                this.serializer = i3;
                if (i3 >= 50) {
                    this.serializer = 0;
                    int length = RemoteActionCompatParcelizer.list().length;
                    long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                    boolean z4 = ((long) length) < jRemoteActionCompatParcelizer;
                    this.MediaSessionCompatQueueItem = z4;
                    if (!z4 && Log.isLoggable("Downsampler", 5)) {
                        SentryLogcatAdapter.IconCompatParcelizer("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jRemoteActionCompatParcelizer);
                    }
                }
                z3 = this.MediaSessionCompatQueueItem;
            }
            if (z3) {
                return true;
            }
            Log.isLoggable("HardwareConfig", 2);
            return false;
        }
        Log.isLoggable("HardwareConfig", 2);
        return false;
    }

    static {
        write = Build.VERSION.SDK_INT < 29;
        IconCompatParcelizer = true;
        RemoteActionCompatParcelizer = new File("/proc/self/fd");
    }

    public final int RemoteActionCompatParcelizer() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return Constant.ERROR_UNKNOWN;
                }
            }
        }
        return this.RatingCompat;
    }
}
