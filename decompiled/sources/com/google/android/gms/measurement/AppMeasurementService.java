package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.net.zza;
import io.sentry.android.core.SentryLogcatAdapter;
import o.LookaheadScopeKtLookaheadScope221;
import o.LookaheadScopeKtdefaultPlacementApproachInProgress1;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.enableZ;
import o.getLookaheadDelegate;
import o.setMinFractionVisible;

/* JADX INFO: loaded from: classes4.dex */
public final class AppMeasurementService extends Service implements setMinFractionVisible {
    public PinnableContainerKtLocalPinnableContainer1 read;

    @Override // o.setMinFractionVisible
    public final boolean write(int i) {
        return stopSelfResult(i);
    }

    @Override // o.setMinFractionVisible
    public final void RemoteActionCompatParcelizer(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((Service) RemoteActionCompatParcelizer().serializer).getClass().getSimpleName().concat(" is starting up.");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer.getClass();
        if (intent == null) {
            SentryLogcatAdapter.serializer("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new LookaheadScopeKtdefaultPlacementApproachInProgress1(zzpg.write((Service) pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer.serializer));
        }
        SentryLogcatAdapter.IconCompatParcelizer("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((Service) RemoteActionCompatParcelizer().serializer).getClass().getSimpleName().concat(" is shutting down.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (intent == null) {
            pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer.getClass();
            SentryLogcatAdapter.IconCompatParcelizer("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer.serializer;
        final getLookaheadDelegate getlookaheaddelegate = LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(service, null, null).ParcelableVolumeInfo;
        LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate);
        String action = intent.getAction();
        getlookaheaddelegate.PlaybackStateCompat.serializer("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: o.startTimer
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = (Service) pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer.serializer;
                setMinFractionVisible setminfractionvisible = (setMinFractionVisible) service2;
                int i3 = i2;
                if (setminfractionvisible.write(i3)) {
                    getlookaheaddelegate.PlaybackStateCompat.serializer(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    getLookaheadDelegate getlookaheaddelegate2 = LookaheadScopeKtLookaheadScope221.IconCompatParcelizer(service2, null, null).ParcelableVolumeInfo;
                    LookaheadScopeKtLookaheadScope221.write(getlookaheaddelegate2);
                    getlookaheaddelegate2.PlaybackStateCompat.RemoteActionCompatParcelizer("Completed wakeful intent.");
                    setminfractionvisible.IconCompatParcelizer(intent);
                }
            }
        };
        zzpg zzpgVarWrite = zzpg.write(service);
        zzpgVarWrite.PlaybackStateCompat().write((Runnable) new zza(pinnableContainerKtLocalPinnableContainer1RemoteActionCompatParcelizer, zzpgVarWrite, runnable));
        return 2;
    }

    @Override // o.setMinFractionVisible
    public final void IconCompatParcelizer(Intent intent) {
        SparseArray sparseArray = enableZ.RemoteActionCompatParcelizer;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = enableZ.RemoteActionCompatParcelizer;
        synchronized (sparseArray2) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray2.remove(intExtra);
            } else {
                SentryLogcatAdapter.IconCompatParcelizer("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            }
        }
    }

    public final PinnableContainerKtLocalPinnableContainer1 RemoteActionCompatParcelizer() {
        if (this.read == null) {
            this.read = new PinnableContainerKtLocalPinnableContainer1(12, this);
        }
        return this.read;
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        RemoteActionCompatParcelizer();
        if (intent == null) {
            SentryLogcatAdapter.serializer("FA", "onRebind called with null intent");
        } else {
            "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        RemoteActionCompatParcelizer();
        if (intent == null) {
            SentryLogcatAdapter.serializer("FA", "onUnbind called with null intent");
            return true;
        }
        "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction()));
        return true;
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }
}
