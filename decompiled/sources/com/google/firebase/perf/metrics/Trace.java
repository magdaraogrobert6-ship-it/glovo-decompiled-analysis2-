package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.common.zza;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import com.huawei.hms.framework.common.BundleUtil;
import com.roadrunner.home.CreateHomeScope;
import io.sentry.android.core.SentryLogcatAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import o.accesssetAddChangeCallbackMethodcp;
import o.getIntentArrayWithConfiguredBackStacklambda4;
import o.getWindowInfoannotations;
import o.handleMotionEvent8iAsVTc;
import o.installLocalRetainedValuesStore;
import o.moveFocusInChildrenViewFocusFix3ESFkO8;
import o.packZIaKswc;

/* JADX INFO: loaded from: classes2.dex */
public class Trace extends AppStateUpdateHandler implements Parcelable, installLocalRetainedValuesStore {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;
    public static final getWindowInfoannotations IconCompatParcelizer = getWindowInfoannotations.write();
    public final String MediaBrowserCompatMediaItem;
    public final List MediaDescriptionCompat;
    public final WeakReference MediaMetadataCompat;
    public final Trace MediaSessionCompatQueueItem;
    public Timer MediaSessionCompatResultReceiverWrapper;
    public final moveFocusInChildrenViewFocusFix3ESFkO8 MediaSessionCompatToken;
    public final ArrayList PlaybackStateCompatCustomAction;
    public final GaugeManager RatingCompat;
    public final ConcurrentHashMap RemoteActionCompatParcelizer;
    public Timer read;
    public final getIntentArrayWithConfiguredBackStacklambda4 serializer;
    public final ConcurrentHashMap write;

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final boolean write() {
        return this.read != null;
    }

    public static Trace IconCompatParcelizer(String str) {
        return new Trace(str, moveFocusInChildrenViewFocusFix3ESFkO8.write, new getIntentArrayWithConfiguredBackStacklambda4(29), AppStateMonitor.read(), GaugeManager.getInstance());
    }

    @Override // o.installLocalRetainedValuesStore
    public final void RemoteActionCompatParcelizer(PerfSession perfSession) {
        if (perfSession == null) {
            IconCompatParcelizer.read("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (this.MediaSessionCompatResultReceiverWrapper == null || write()) {
                return;
            }
            this.MediaDescriptionCompat.add(perfSession);
        }
    }

    @Keep
    public String getAttribute(String str) {
        return (String) this.RemoteActionCompatParcelizer.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.RemoteActionCompatParcelizer);
    }

    @Keep
    public long getLongMetric(String str) {
        Counter counter = str != null ? (Counter) this.write.get(str.trim()) : null;
        if (counter == null) {
            return 0L;
        }
        return counter.IconCompatParcelizer.get();
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.RemoteActionCompatParcelizer;
        getWindowInfoannotations getwindowinfoannotations = IconCompatParcelizer;
        try {
            str = str.trim();
            str2 = str2.trim();
            boolean zWrite = write();
            String str3 = this.MediaBrowserCompatMediaItem;
            if (zWrite) {
                Locale locale = Locale.ENGLISH;
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer(ff$$ExternalSyntheticOutline0.m("Trace '", str3, "' has been stopped"));
            } else if (concurrentHashMap.containsKey(str) || concurrentHashMap.size() < 5) {
                handleMotionEvent8iAsVTc.write(str, str2);
            } else {
                Locale locale2 = Locale.ENGLISH;
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Exceeds max limit of number of attributes - 5");
            }
            getwindowinfoannotations.RemoteActionCompatParcelizer("Setting attribute '%s' to '%s' on trace '%s'", str, str2, str3);
            z = true;
        } catch (Exception e) {
            getwindowinfoannotations.read("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            concurrentHashMap.put(str, str2);
        }
    }

    @Keep
    public void stop() {
        Timer timer = this.MediaSessionCompatResultReceiverWrapper;
        String str = this.MediaBrowserCompatMediaItem;
        getWindowInfoannotations getwindowinfoannotations = IconCompatParcelizer;
        if (timer == null) {
            getwindowinfoannotations.read("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (write()) {
            getwindowinfoannotations.read("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.MediaMetadataCompat);
        unregisterForAppState();
        this.serializer.getClass();
        Timer timer2 = new Timer();
        this.read = timer2;
        if (this.MediaSessionCompatQueueItem == null) {
            ArrayList arrayList = this.PlaybackStateCompatCustomAction;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) af$$ExternalSyntheticOutline0.m(1, arrayList);
                if (trace.read == null) {
                    trace.read = timer2;
                }
            }
            if (str.isEmpty()) {
                if (getwindowinfoannotations.write) {
                    getwindowinfoannotations.read.getClass();
                    SentryLogcatAdapter.serializer("FirebasePerformance", "Trace name is empty, no log is sent to server");
                    return;
                }
                return;
            }
            this.MediaSessionCompatToken.serializer(new CreateHomeScope(this).read(), getAppState());
            if (SessionManager.getInstance().perfSession().read) {
                this.RatingCompat.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().write);
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.MediaSessionCompatQueueItem, 0);
        parcel.writeString(this.MediaBrowserCompatMediaItem);
        parcel.writeList(this.PlaybackStateCompatCustomAction);
        parcel.writeMap(this.write);
        parcel.writeParcelable(this.MediaSessionCompatResultReceiverWrapper, 0);
        parcel.writeParcelable(this.read, 0);
        synchronized (this.MediaDescriptionCompat) {
            parcel.writeList(this.MediaDescriptionCompat);
        }
    }

    static {
        new ConcurrentHashMap();
        CREATOR = new zza(14);
    }

    @Keep
    public void incrementMetric(String str, long j) {
        String strRemoteActionCompatParcelizer = handleMotionEvent8iAsVTc.RemoteActionCompatParcelizer(str);
        getWindowInfoannotations getwindowinfoannotations = IconCompatParcelizer;
        if (strRemoteActionCompatParcelizer != null) {
            getwindowinfoannotations.read("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strRemoteActionCompatParcelizer);
            return;
        }
        Timer timer = this.MediaSessionCompatResultReceiverWrapper;
        String str2 = this.MediaBrowserCompatMediaItem;
        if (timer == null) {
            getwindowinfoannotations.write("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (write()) {
            getwindowinfoannotations.write("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.write;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        AtomicLong atomicLong = counter.IconCompatParcelizer;
        atomicLong.addAndGet(j);
        getwindowinfoannotations.RemoteActionCompatParcelizer("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    @Keep
    public void putMetric(String str, long j) {
        String strRemoteActionCompatParcelizer = handleMotionEvent8iAsVTc.RemoteActionCompatParcelizer(str);
        getWindowInfoannotations getwindowinfoannotations = IconCompatParcelizer;
        if (strRemoteActionCompatParcelizer != null) {
            getwindowinfoannotations.read("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strRemoteActionCompatParcelizer);
            return;
        }
        Timer timer = this.MediaSessionCompatResultReceiverWrapper;
        String str2 = this.MediaBrowserCompatMediaItem;
        if (timer == null) {
            getwindowinfoannotations.write("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (write()) {
            getwindowinfoannotations.write("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.write;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        counter.IconCompatParcelizer.set(j);
        getwindowinfoannotations.RemoteActionCompatParcelizer("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
    }

    @Keep
    public void start() {
        String str;
        boolean z = accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer().read();
        getWindowInfoannotations getwindowinfoannotations = IconCompatParcelizer;
        if (!z) {
            getwindowinfoannotations.read();
            return;
        }
        Pattern pattern = handleMotionEvent8iAsVTc.RatingCompat;
        String str2 = this.MediaBrowserCompatMediaItem;
        if (str2 != null) {
            if (str2.length() <= 100) {
                if (!str2.startsWith(BundleUtil.UNDERLINE_TAG)) {
                    str = null;
                    break;
                }
                packZIaKswc[] packziakswcArrValues = packZIaKswc.values();
                int length = packziakswcArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        if (!str2.startsWith("_st_")) {
                            str = "Trace name must not start with '_'";
                            break;
                        }
                        break;
                    } else if (!packziakswcArrValues[i].toString().equals(str2)) {
                        i++;
                    }
                    str = null;
                    break;
                }
            } else {
                Locale locale = Locale.US;
                str = "Trace name must not exceed 100 characters";
            }
        } else {
            str = "Trace name must not be null";
        }
        if (str != null) {
            getwindowinfoannotations.read("Cannot start trace '%s'. Trace name is invalid.(%s)", str2, str);
            return;
        }
        if (this.MediaSessionCompatResultReceiverWrapper != null) {
            getwindowinfoannotations.read("Trace '%s' has already started, should not start again!", str2);
            return;
        }
        this.serializer.getClass();
        this.MediaSessionCompatResultReceiverWrapper = new Timer();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.MediaMetadataCompat);
        RemoteActionCompatParcelizer(perfSession);
        if (perfSession.read) {
            this.RatingCompat.collectGaugeMetricOnce(perfSession.write);
        }
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : AppStateMonitor.read());
        this.MediaMetadataCompat = new WeakReference(this);
        this.MediaSessionCompatQueueItem = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.MediaBrowserCompatMediaItem = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.PlaybackStateCompatCustomAction = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.write = concurrentHashMap;
        this.RemoteActionCompatParcelizer = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.MediaSessionCompatResultReceiverWrapper = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.read = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.MediaDescriptionCompat = listSynchronizedList;
        parcel.readList(listSynchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.MediaSessionCompatToken = null;
            this.serializer = null;
            this.RatingCompat = null;
        } else {
            this.MediaSessionCompatToken = moveFocusInChildrenViewFocusFix3ESFkO8.write;
            this.serializer = new getIntentArrayWithConfiguredBackStacklambda4(29);
            this.RatingCompat = GaugeManager.getInstance();
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (!write()) {
            this.RemoteActionCompatParcelizer.remove(str);
            return;
        }
        getWindowInfoannotations getwindowinfoannotations = IconCompatParcelizer;
        if (getwindowinfoannotations.write) {
            getwindowinfoannotations.read.getClass();
            SentryLogcatAdapter.serializer("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.MediaSessionCompatResultReceiverWrapper != null && !write()) {
                IconCompatParcelizer.write("Trace '%s' is started but not stopped when it is destructed!", this.MediaBrowserCompatMediaItem);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    public Trace(String str, moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8, getIntentArrayWithConfiguredBackStacklambda4 getintentarraywithconfiguredbackstacklambda4, AppStateMonitor appStateMonitor, GaugeManager gaugeManager) {
        super(appStateMonitor);
        this.MediaMetadataCompat = new WeakReference(this);
        this.MediaSessionCompatQueueItem = null;
        this.MediaBrowserCompatMediaItem = str.trim();
        this.PlaybackStateCompatCustomAction = new ArrayList();
        this.write = new ConcurrentHashMap();
        this.RemoteActionCompatParcelizer = new ConcurrentHashMap();
        this.serializer = getintentarraywithconfiguredbackstacklambda4;
        this.MediaSessionCompatToken = movefocusinchildrenviewfocusfix3esfko8;
        this.MediaDescriptionCompat = Collections.synchronizedList(new ArrayList());
        this.RatingCompat = gaugeManager;
    }

    public Trace(String str, moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8, getIntentArrayWithConfiguredBackStacklambda4 getintentarraywithconfiguredbackstacklambda4, AppStateMonitor appStateMonitor) {
        this(str, movefocusinchildrenviewfocusfix3esfko8, getintentarraywithconfiguredbackstacklambda4, appStateMonitor, GaugeManager.getInstance());
    }
}
