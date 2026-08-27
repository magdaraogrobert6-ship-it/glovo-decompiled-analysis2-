package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzdi;
import com.google.android.gms.measurement.internal.zzpg;
import com.google.android.gms.net.zza;
import io.grpc.SynchronizationContext$1;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.Objects;
import o.PinnableContainerKtLocalPinnableContainer1;
import o.accessgetSystemNavigationDowncp;
import o.accessgetWcp;
import o.getLookaheadDelegate;
import o.getSoftRightEK5gGoQ;
import o.setMinFractionVisible;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi
public final class AppMeasurementJobService extends JobService implements setMinFractionVisible {
    public PinnableContainerKtLocalPinnableContainer1 RemoteActionCompatParcelizer;

    @Override // o.setMinFractionVisible
    public final void IconCompatParcelizer(Intent intent) {
    }

    @Override // o.setMinFractionVisible
    public final void RemoteActionCompatParcelizer(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // o.setMinFractionVisible
    public final boolean write(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        ((Service) IconCompatParcelizer().serializer).getClass().getSimpleName().concat(" is starting up.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((Service) IconCompatParcelizer().serializer).getClass().getSimpleName().concat(" is shutting down.");
        super.onDestroy();
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1IconCompatParcelizer = IconCompatParcelizer();
        Service service = (Service) pinnableContainerKtLocalPinnableContainer1IconCompatParcelizer.serializer;
        String string = jobParameters.getExtras().getString("action");
        "onStartJob received action: ".concat(String.valueOf(string));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) string);
            zzpg zzpgVarWrite = zzpg.write(service);
            getLookaheadDelegate getlookaheaddelegateRatingCompat = zzpgVarWrite.RatingCompat();
            accessgetWcp accessgetwcp = zzpgVarWrite.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.MediaSessionCompatQueueItem;
            getlookaheaddelegateRatingCompat.PlaybackStateCompat.serializer(string, "Local AppMeasurementJobService called. action");
            zzpgVarWrite.PlaybackStateCompat().write((Runnable) new zza(pinnableContainerKtLocalPinnableContainer1IconCompatParcelizer, zzpgVarWrite, new SynchronizationContext$1(pinnableContainerKtLocalPinnableContainer1IconCompatParcelizer, getlookaheaddelegateRatingCompat, jobParameters, 13)));
        }
        if (Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            accessgetSystemNavigationDowncp.IconCompatParcelizer((Object) string);
            getSoftRightEK5gGoQ getsoftrightek5ggoqWrite = getSoftRightEK5gGoQ.write(service, null);
            zza zzaVar = new zza(pinnableContainerKtLocalPinnableContainer1IconCompatParcelizer, 23, jobParameters);
            getsoftrightek5ggoqWrite.getClass();
            getsoftrightek5ggoqWrite.write(new zzdi(getsoftrightek5ggoqWrite, zzaVar, 1));
        }
        return true;
    }

    public final PinnableContainerKtLocalPinnableContainer1 IconCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new PinnableContainerKtLocalPinnableContainer1(12, this);
        }
        return this.RemoteActionCompatParcelizer;
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        IconCompatParcelizer();
        if (intent == null) {
            SentryLogcatAdapter.serializer("FA", "onRebind called with null intent");
        } else {
            "onRebind called. action: ".concat(String.valueOf(intent.getAction()));
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        IconCompatParcelizer();
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
