package com.google.firebase.perf.application;

import java.lang.ref.WeakReference;
import o.EnumC0151autofill;
import o.accesssetDispatchOnScrollChangedMethodcp;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AppStateUpdateHandler implements accesssetDispatchOnScrollChangedMethodcp {
    private final AppStateMonitor appStateMonitor;
    private boolean write = false;
    private EnumC0151autofill serializer = EnumC0151autofill.APPLICATION_PROCESS_STATE_UNKNOWN;
    private final WeakReference<accesssetDispatchOnScrollChangedMethodcp> read = new WeakReference<>(this);

    public EnumC0151autofill getAppState() {
        return this.serializer;
    }

    public WeakReference<accesssetDispatchOnScrollChangedMethodcp> getAppStateCallback() {
        return this.read;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.ResultReceiver.addAndGet(i);
    }

    @Override // o.accesssetDispatchOnScrollChangedMethodcp
    public void onUpdateAppState(EnumC0151autofill enumC0151autofill) {
        EnumC0151autofill enumC0151autofill2 = this.serializer;
        EnumC0151autofill enumC0151autofill3 = EnumC0151autofill.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (enumC0151autofill2 == enumC0151autofill3) {
            this.serializer = enumC0151autofill;
        } else {
            if (enumC0151autofill2 == enumC0151autofill || enumC0151autofill == enumC0151autofill3) {
                return;
            }
            this.serializer = EnumC0151autofill.FOREGROUND_BACKGROUND;
        }
    }

    public AppStateUpdateHandler(AppStateMonitor appStateMonitor) {
        this.appStateMonitor = appStateMonitor;
    }

    public void registerForAppState() {
        if (this.write) {
            return;
        }
        AppStateMonitor appStateMonitor = this.appStateMonitor;
        this.serializer = appStateMonitor.PlaybackStateCompatCustomAction;
        WeakReference<accesssetDispatchOnScrollChangedMethodcp> weakReference = this.read;
        synchronized (appStateMonitor.MediaBrowserCompatMediaItem) {
            appStateMonitor.MediaBrowserCompatMediaItem.add(weakReference);
        }
        this.write = true;
    }

    public void unregisterForAppState() {
        if (this.write) {
            AppStateMonitor appStateMonitor = this.appStateMonitor;
            WeakReference<accesssetDispatchOnScrollChangedMethodcp> weakReference = this.read;
            synchronized (appStateMonitor.MediaBrowserCompatMediaItem) {
                appStateMonitor.MediaBrowserCompatMediaItem.remove(weakReference);
            }
            this.write = false;
        }
    }
}
