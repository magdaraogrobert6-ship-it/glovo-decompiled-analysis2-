package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import o.EnumC0151autofill;
import o.accessgetAlpha8cp;
import o.installLocalRetainedValuesStore;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class SessionManager extends AppStateUpdateHandler {

    @SuppressLint
    private static final SessionManager instance = new SessionManager();
    private final AppStateMonitor appStateMonitor;
    private final Set<WeakReference<installLocalRetainedValuesStore>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    public static SessionManager getInstance() {
        return instance;
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, PerfSession perfSession) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.read) {
            this.gaugeManager.logGaugeMetadata(perfSession.IconCompatParcelizer, EnumC0151autofill.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(EnumC0151autofill enumC0151autofill) {
        PerfSession perfSession = this.perfSession;
        if (perfSession.read) {
            this.gaugeManager.logGaugeMetadata(perfSession.IconCompatParcelizer, enumC0151autofill);
        }
    }

    private void startOrStopCollectingGauges(EnumC0151autofill enumC0151autofill) {
        PerfSession perfSession = this.perfSession;
        boolean z = perfSession.read;
        GaugeManager gaugeManager = this.gaugeManager;
        if (z) {
            gaugeManager.startCollectingGauges(perfSession, enumC0151autofill);
        } else {
            gaugeManager.stopCollectingGauges();
        }
    }

    public void initializeGaugeCollection() {
        EnumC0151autofill enumC0151autofill = EnumC0151autofill.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(enumC0151autofill);
        startOrStopCollectingGauges(enumC0151autofill);
    }

    public void registerForSessionUpdates(WeakReference<installLocalRetainedValuesStore> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new accessgetAlpha8cp(this, context, this.perfSession, 6));
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.RemoteActionCompatParcelizer()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<installLocalRetainedValuesStore> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(PerfSession perfSession) {
        if (perfSession.IconCompatParcelizer == this.perfSession.IconCompatParcelizer) {
            return;
        }
        this.perfSession = perfSession;
        synchronized (this.clients) {
            Iterator<WeakReference<installLocalRetainedValuesStore>> it = this.clients.iterator();
            while (it.hasNext()) {
                installLocalRetainedValuesStore installlocalretainedvaluesstore = it.next().get();
                if (installlocalretainedvaluesstore != null) {
                    installlocalretainedvaluesstore.RemoteActionCompatParcelizer(perfSession);
                } else {
                    it.remove();
                }
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.PlaybackStateCompatCustomAction);
        startOrStopCollectingGauges(this.appStateMonitor.PlaybackStateCompatCustomAction);
    }

    @Override // com.google.firebase.perf.application.AppStateUpdateHandler, o.accesssetDispatchOnScrollChangedMethodcp
    public void onUpdateAppState(EnumC0151autofill enumC0151autofill) {
        super.onUpdateAppState(enumC0151autofill);
        if (this.appStateMonitor.PlaybackStateCompat) {
            return;
        }
        if (enumC0151autofill == EnumC0151autofill.FOREGROUND) {
            updatePerfSession(PerfSession.read(UUID.randomUUID().toString()));
        } else if (this.perfSession.RemoteActionCompatParcelizer()) {
            updatePerfSession(PerfSession.read(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(enumC0151autofill);
        }
    }

    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, AppStateMonitor appStateMonitor) {
        super(AppStateMonitor.read());
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = appStateMonitor;
        registerForAppState();
    }

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.read(UUID.randomUUID().toString()), AppStateMonitor.read());
    }
}
