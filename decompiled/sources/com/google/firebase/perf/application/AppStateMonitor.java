package com.google.firebase.perf.application;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.ScreenTraceUtil;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o.EnumC0151autofill;
import o.accessgetSystemPropertiesClasscp;
import o.accessget_viewTreeOwners;
import o.accesssetAddChangeCallbackMethodcp;
import o.accesssetDispatchOnScrollChangedMethodcp;
import o.getIntentArrayWithConfiguredBackStacklambda4;
import o.getLegacyTextInputServiceAndroid;
import o.getWindowInfoannotations;
import o.moveFocusInChildrenViewFocusFix3ESFkO8;
import o.onCheckIsTextEditor;
import o.packZIaKswc;
import o.r8lambdaU31FnmCtqQics3i75Jr9dkZcEk;
import o.recalculateWindowPosition;
import o.sendMotionEvent8iAsVTc;

/* JADX INFO: loaded from: classes2.dex */
public final class AppStateMonitor implements Application.ActivityLifecycleCallbacks {
    public static volatile AppStateMonitor read;
    public static final getWindowInfoannotations serializer = getWindowInfoannotations.write();
    public final moveFocusInChildrenViewFocusFix3ESFkO8 ComponentActivity;
    public final WeakHashMap IconCompatParcelizer;
    public final HashSet MediaBrowserCompatMediaItem;
    public final HashSet MediaDescriptionCompat;
    public final WeakHashMap MediaMetadataCompat;
    public final getIntentArrayWithConfiguredBackStacklambda4 MediaSessionCompatQueueItem;
    public boolean MediaSessionCompatResultReceiverWrapper;
    public final HashMap MediaSessionCompatToken;
    public Timer ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public EnumC0151autofill PlaybackStateCompatCustomAction;
    public final accesssetAddChangeCallbackMethodcp RatingCompat;
    public final WeakHashMap RemoteActionCompatParcelizer;
    public final AtomicInteger ResultReceiver;
    public Timer r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
    public final boolean r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    public final WeakHashMap write;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        read(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        synchronized (this) {
            if (this.write.isEmpty()) {
                this.MediaSessionCompatQueueItem.getClass();
                this.ParcelableVolumeInfo = new Timer();
                this.write.put(activity, Boolean.TRUE);
                if (this.PlaybackStateCompat) {
                    RemoteActionCompatParcelizer(EnumC0151autofill.FOREGROUND);
                    IconCompatParcelizer();
                    this.PlaybackStateCompat = false;
                } else {
                    write(packZIaKswc.BACKGROUND_TRACE_NAME.toString(), this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys, this.ParcelableVolumeInfo);
                    RemoteActionCompatParcelizer(EnumC0151autofill.FOREGROUND);
                }
            } else {
                this.write.put(activity, Boolean.TRUE);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        synchronized (this) {
            if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus && this.RatingCompat.read()) {
                if (!this.RemoteActionCompatParcelizer.containsKey(activity)) {
                    read(activity);
                }
                accessget_viewTreeOwners accessget_viewtreeowners = (accessget_viewTreeOwners) this.RemoteActionCompatParcelizer.get(activity);
                Activity activity2 = accessget_viewtreeowners.serializer;
                if (accessget_viewtreeowners.read) {
                    accessget_viewTreeOwners.write.RemoteActionCompatParcelizer("FrameMetricsAggregator is already recording %s", activity2.getClass().getSimpleName());
                } else {
                    accessget_viewtreeowners.RemoteActionCompatParcelizer.IconCompatParcelizer(activity2);
                    accessget_viewtreeowners.read = true;
                }
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.ComponentActivity, this.MediaSessionCompatQueueItem, this);
                trace.start();
                this.MediaMetadataCompat.put(activity, trace);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        synchronized (this) {
            if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) {
                serializer(activity);
            }
            if (this.write.containsKey(activity)) {
                this.write.remove(activity);
                if (this.write.isEmpty()) {
                    this.MediaSessionCompatQueueItem.getClass();
                    this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = new Timer();
                    write(packZIaKswc.FOREGROUND_TRACE_NAME.toString(), this.ParcelableVolumeInfo, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                    RemoteActionCompatParcelizer(EnumC0151autofill.BACKGROUND);
                }
            }
        }
    }

    public final void IconCompatParcelizer() {
        synchronized (this.MediaDescriptionCompat) {
            Iterator it = this.MediaDescriptionCompat.iterator();
            while (it.hasNext()) {
                if (((accessgetSystemPropertiesClasscp) it.next()) != null) {
                    try {
                        FirebasePerformance.read();
                    } catch (IllegalStateException e) {
                        accessgetSystemPropertiesClasscp.write.write("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
                    }
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer(String str) {
        synchronized (this.MediaSessionCompatToken) {
            Long l = (Long) this.MediaSessionCompatToken.get(str);
            HashMap map = this.MediaSessionCompatToken;
            if (l == null) {
                map.put(str, 1L);
            } else {
                map.put(str, Long.valueOf(l.longValue() + 1));
            }
        }
    }

    public final void RemoteActionCompatParcelizer(EnumC0151autofill enumC0151autofill) {
        this.PlaybackStateCompatCustomAction = enumC0151autofill;
        synchronized (this.MediaBrowserCompatMediaItem) {
            Iterator it = this.MediaBrowserCompatMediaItem.iterator();
            while (it.hasNext()) {
                accesssetDispatchOnScrollChangedMethodcp accesssetdispatchonscrollchangedmethodcp = (accesssetDispatchOnScrollChangedMethodcp) ((WeakReference) it.next()).get();
                if (accesssetdispatchonscrollchangedmethodcp != null) {
                    accesssetdispatchonscrollchangedmethodcp.onUpdateAppState(this.PlaybackStateCompatCustomAction);
                } else {
                    it.remove();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.RemoteActionCompatParcelizer.remove(activity);
        WeakHashMap weakHashMap = this.IconCompatParcelizer;
        if (weakHashMap.containsKey(activity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().read((FragmentManager$FragmentLifecycleCallbacks) weakHashMap.remove(activity));
        }
    }

    public final void serializer(Activity activity) {
        sendMotionEvent8iAsVTc sendmotionevent8iasvtc;
        WeakHashMap weakHashMap = this.MediaMetadataCompat;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        accessget_viewTreeOwners accessget_viewtreeowners = (accessget_viewTreeOwners) this.RemoteActionCompatParcelizer.get(activity);
        FrameMetricsAggregator frameMetricsAggregator = accessget_viewtreeowners.RemoteActionCompatParcelizer;
        HashMap map = accessget_viewtreeowners.IconCompatParcelizer;
        getWindowInfoannotations getwindowinfoannotations = accessget_viewTreeOwners.write;
        if (accessget_viewtreeowners.read) {
            if (!map.isEmpty()) {
                getwindowinfoannotations.read();
                map.clear();
            }
            sendMotionEvent8iAsVTc sendmotionevent8iasvtcWrite = accessget_viewtreeowners.write();
            try {
                frameMetricsAggregator.RemoteActionCompatParcelizer(accessget_viewtreeowners.serializer);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                getwindowinfoannotations.write("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                sendmotionevent8iasvtcWrite = new sendMotionEvent8iAsVTc();
            }
            r8lambdaU31FnmCtqQics3i75Jr9dkZcEk r8lambdau31fnmctqqics3i75jr9dkzcek = frameMetricsAggregator.serializer;
            Object obj = r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat;
            r8lambdau31fnmctqqics3i75jr9dkzcek.MediaMetadataCompat = new SparseIntArray[9];
            accessget_viewtreeowners.read = false;
            sendmotionevent8iasvtc = sendmotionevent8iasvtcWrite;
        } else {
            getwindowinfoannotations.read();
            sendmotionevent8iasvtc = new sendMotionEvent8iAsVTc();
        }
        if (sendmotionevent8iasvtc.serializer()) {
            ScreenTraceUtil.IconCompatParcelizer(trace, (getLegacyTextInputServiceAndroid) sendmotionevent8iasvtc.RemoteActionCompatParcelizer());
            trace.stop();
        } else {
            serializer.write("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        }
    }

    public final void write(String str, Timer timer, Timer timer2) {
        if (this.RatingCompat.read()) {
            onCheckIsTextEditor oncheckistexteditorNewBuilder = TraceMetric.newBuilder();
            oncheckistexteditorNewBuilder.read(str);
            oncheckistexteditorNewBuilder.read(timer.read);
            oncheckistexteditorNewBuilder.write(timer.IconCompatParcelizer(timer2));
            PerfSession perfSessionSerializer = SessionManager.getInstance().perfSession().serializer();
            oncheckistexteditorNewBuilder.RemoteActionCompatParcelizer();
            ((TraceMetric) oncheckistexteditorNewBuilder.RemoteActionCompatParcelizer).addPerfSessions(perfSessionSerializer);
            int andSet = this.ResultReceiver.getAndSet(0);
            synchronized (this.MediaSessionCompatToken) {
                HashMap map = this.MediaSessionCompatToken;
                oncheckistexteditorNewBuilder.RemoteActionCompatParcelizer();
                ((TraceMetric) oncheckistexteditorNewBuilder.RemoteActionCompatParcelizer).getMutableCountersMap().putAll(map);
                if (andSet != 0) {
                    oncheckistexteditorNewBuilder.write(andSet, recalculateWindowPosition.TRACE_STARTED_NOT_STOPPED.toString());
                }
                this.MediaSessionCompatToken.clear();
            }
            this.ComponentActivity.serializer((TraceMetric) oncheckistexteditorNewBuilder.serializer(), EnumC0151autofill.FOREGROUND_BACKGROUND);
        }
    }

    public AppStateMonitor(moveFocusInChildrenViewFocusFix3ESFkO8 movefocusinchildrenviewfocusfix3esfko8, getIntentArrayWithConfiguredBackStacklambda4 getintentarraywithconfiguredbackstacklambda4) {
        accesssetAddChangeCallbackMethodcp accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer = accesssetAddChangeCallbackMethodcp.RemoteActionCompatParcelizer();
        getWindowInfoannotations getwindowinfoannotations = accessget_viewTreeOwners.write;
        this.write = new WeakHashMap();
        this.RemoteActionCompatParcelizer = new WeakHashMap();
        this.IconCompatParcelizer = new WeakHashMap();
        this.MediaMetadataCompat = new WeakHashMap();
        this.MediaSessionCompatToken = new HashMap();
        this.MediaBrowserCompatMediaItem = new HashSet();
        this.MediaDescriptionCompat = new HashSet();
        this.ResultReceiver = new AtomicInteger(0);
        this.PlaybackStateCompatCustomAction = EnumC0151autofill.BACKGROUND;
        this.MediaSessionCompatResultReceiverWrapper = false;
        this.PlaybackStateCompat = true;
        this.ComponentActivity = movefocusinchildrenviewfocusfix3esfko8;
        this.MediaSessionCompatQueueItem = getintentarraywithconfiguredbackstacklambda4;
        this.RatingCompat = accesssetaddchangecallbackmethodcpRemoteActionCompatParcelizer;
        this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = true;
    }

    public static AppStateMonitor read() {
        if (read == null) {
            synchronized (AppStateMonitor.class) {
                if (read == null) {
                    read = new AppStateMonitor(moveFocusInChildrenViewFocusFix3ESFkO8.write, new getIntentArrayWithConfiguredBackStacklambda4(29));
                }
            }
        }
        return read;
    }

    public final void read(Activity activity) {
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus && this.RatingCompat.read()) {
            accessget_viewTreeOwners accessget_viewtreeowners = new accessget_viewTreeOwners(activity);
            this.RemoteActionCompatParcelizer.put(activity, accessget_viewtreeowners);
            if (activity instanceof FragmentActivity) {
                FragmentStateMonitor fragmentStateMonitor = new FragmentStateMonitor(this.MediaSessionCompatQueueItem, this.ComponentActivity, this, accessget_viewtreeowners);
                this.IconCompatParcelizer.put(activity, fragmentStateMonitor);
                ((FragmentActivity) activity).getSupportFragmentManager().RemoteActionCompatParcelizer((FragmentManager$FragmentLifecycleCallbacks) fragmentStateMonitor, true);
            }
        }
    }
}
