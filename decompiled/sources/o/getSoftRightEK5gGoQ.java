package o;

import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import coil3.Extras$Key;
import com.google.android.gms.internal.measurement.zzdi;
import com.google.android.gms.internal.measurement.zzdr;
import com.google.android.gms.internal.measurement.zzfa;
import com.google.android.gms.location.DeviceOrientationRequest;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class getSoftRightEK5gGoQ {
    public static volatile getSoftRightEK5gGoQ write;
    public int IconCompatParcelizer;
    public boolean MediaBrowserCompatMediaItem;
    public volatile getProgramRedEK5gGoQ MediaDescriptionCompat;
    public final ArrayList RemoteActionCompatParcelizer;
    public final Extras$Key read;
    public final ExecutorService serializer;

    public getSoftRightEK5gGoQ(Context context, Bundle bundle) {
        getShiftLeftEK5gGoQ getshiftleftek5ggoq = new getShiftLeftEK5gGoQ(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), getshiftleftek5ggoq);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.serializer = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.read = new Extras$Key(23, this);
        this.RemoteActionCompatParcelizer = new ArrayList();
        int i = 0;
        try {
            Object[] objArr = {context, MeasureScopelayout1.RemoteActionCompatParcelizer(context)};
            if (((String) TuplesKt.RemoteActionCompatParcelizer(-1772022421, getSelectionEndui_text.IconCompatParcelizer(), objArr, getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), getSelectionEndui_text.IconCompatParcelizer(), 1772022425)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getSoftRightEK5gGoQ.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.MediaBrowserCompatMediaItem = true;
                    SentryLogcatAdapter.IconCompatParcelizer("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        write(new zzdr(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            SentryLogcatAdapter.IconCompatParcelizer("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new zzfa(i, this));
        }
    }

    public final int read(String str) {
        getProgramBlueEK5gGoQ getprogramblueek5ggoq = new getProgramBlueEK5gGoQ();
        write(new getSixEK5gGoQ(this, str, getprogramblueek5ggoq));
        Integer num = (Integer) getProgramBlueEK5gGoQ.IconCompatParcelizer(getprogramblueek5ggoq.RemoteActionCompatParcelizer(DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final void read(minWidth minwidth) {
        ArrayList arrayList = this.RemoteActionCompatParcelizer;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (minwidth.equals(((Pair) arrayList.get(i)).first)) {
                    SentryLogcatAdapter.IconCompatParcelizer("FA", "OnEventListener already registered.");
                    return;
                }
            }
            getSlashEK5gGoQ getslashek5ggoq = new getSlashEK5gGoQ(1, minwidth);
            arrayList.add(new Pair(minwidth, getslashek5ggoq));
            if (this.MediaDescriptionCompat != null) {
                try {
                    this.MediaDescriptionCompat.registerOnMeasurementEventListener(getslashek5ggoq);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    SentryLogcatAdapter.IconCompatParcelizer("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            write(new getScrollLockEK5gGoQ(this, getslashek5ggoq));
        }
    }

    public final List serializer(String str, String str2) {
        getProgramBlueEK5gGoQ getprogramblueek5ggoq = new getProgramBlueEK5gGoQ();
        write(new getRoEK5gGoQ(this, str, str2, getprogramblueek5ggoq));
        List list = (List) getProgramBlueEK5gGoQ.IconCompatParcelizer(getprogramblueek5ggoq.RemoteActionCompatParcelizer(DeviceOrientationRequest.OUTPUT_PERIOD_FAST), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final Map write(String str, String str2, boolean z) {
        getProgramBlueEK5gGoQ getprogramblueek5ggoq = new getProgramBlueEK5gGoQ();
        write(new getSetTopBoxPowerEK5gGoQ(this, str, str2, z, getprogramblueek5ggoq));
        Bundle bundleRemoteActionCompatParcelizer = getprogramblueek5ggoq.RemoteActionCompatParcelizer(DeviceOrientationRequest.OUTPUT_PERIOD_FAST);
        if (bundleRemoteActionCompatParcelizer == null || bundleRemoteActionCompatParcelizer.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleRemoteActionCompatParcelizer.size());
        for (String str3 : bundleRemoteActionCompatParcelizer.keySet()) {
            Object obj = bundleRemoteActionCompatParcelizer.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void write(getSleepEK5gGoQ getsleepek5ggoq) {
        this.serializer.execute(getsleepek5ggoq);
    }

    public static getSoftRightEK5gGoQ write(Context context, Bundle bundle) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(context);
        if (write == null) {
            synchronized (getSoftRightEK5gGoQ.class) {
                if (write == null) {
                    write = new getSoftRightEK5gGoQ(context, bundle);
                }
            }
        }
        return write;
    }

    public final void RemoteActionCompatParcelizer(Exception exc, boolean z, boolean z2) {
        this.MediaBrowserCompatMediaItem |= z;
        if (z) {
            SentryLogcatAdapter.write("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            write(new zzdi(this, exc));
        }
        SentryLogcatAdapter.write("FA", "Error with data collection. Data lost.", exc);
    }
}
