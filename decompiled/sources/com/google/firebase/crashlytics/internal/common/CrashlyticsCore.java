package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.WorkerWrapper;
import bo.app.w4$$ExternalSyntheticLambda0;
import coil3.ComponentRegistry$Builder;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.play.core.appupdate.zzz;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import io.sentry.android.core.SentryLogcatAdapter;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import o.ParentDataModifierDefaultImpls;
import o.access500;
import o.checkChildrenPlaceOrderForUpdates;
import o.getCachedAlignmentLinesMap;
import o.getConstraintsmsEJaDkui;
import o.getDetachedFromParentLookaheadPlacement;
import o.getLayoutPending;
import o.setLayoutState;

/* JADX INFO: loaded from: classes2.dex */
public final class CrashlyticsCore {
    public zzbv IconCompatParcelizer;
    public final WorkerWrapper.Builder MediaBrowserCompatMediaItem;
    public final IdManager MediaDescriptionCompat;
    public final ComponentRegistry$Builder MediaMetadataCompat;
    public boolean MediaSessionCompatQueueItem;
    public final setLayoutState MediaSessionCompatResultReceiverWrapper;
    public final zzz MediaSessionCompatToken;
    public final getDetachedFromParentLookaheadPlacement ParcelableVolumeInfo;
    public zzbv PlaybackStateCompat;
    public final getCachedAlignmentLinesMap PlaybackStateCompatCustomAction;
    public final CrashlyticsWorkers RatingCompat;
    public checkChildrenPlaceOrderForUpdates RemoteActionCompatParcelizer;
    public final long r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
    public final getConstraintsmsEJaDkui read;
    public final Context serializer;
    public final getConstraintsmsEJaDkui write;

    public final void read(access500 access500Var) {
        Future<?> futureSubmit = this.RatingCompat.read.read.submit(new w4$$ExternalSyntheticLambda0(this, 15, access500Var));
        Log.isLoggable("FirebaseCrashlytics", 3);
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            SentryLogcatAdapter.read("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            SentryLogcatAdapter.read("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            SentryLogcatAdapter.read("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void write() {
        CrashlyticsWorkers.checkBackgroundThread();
        try {
            zzbv zzbvVar = this.PlaybackStateCompat;
            WorkerWrapper.Builder builder = (WorkerWrapper.Builder) zzbvVar.RemoteActionCompatParcelizer;
            String str = (String) zzbvVar.write;
            builder.getClass();
            if (new File((File) builder.read, str).delete()) {
                return;
            }
            SentryLogcatAdapter.write("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            SentryLogcatAdapter.read("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }

    public CrashlyticsCore(FirebaseApp firebaseApp, IdManager idManager, getCachedAlignmentLinesMap getcachedalignmentlinesmap, ComponentRegistry$Builder componentRegistry$Builder, getConstraintsmsEJaDkui getconstraintsmsejadkui, getConstraintsmsEJaDkui getconstraintsmsejadkui2, WorkerWrapper.Builder builder, getDetachedFromParentLookaheadPlacement getdetachedfromparentlookaheadplacement, zzz zzzVar, CrashlyticsWorkers crashlyticsWorkers) {
        this.MediaMetadataCompat = componentRegistry$Builder;
        firebaseApp.IconCompatParcelizer();
        this.serializer = firebaseApp.read;
        this.MediaDescriptionCompat = idManager;
        this.PlaybackStateCompatCustomAction = getcachedalignmentlinesmap;
        this.write = getconstraintsmsejadkui;
        this.read = getconstraintsmsejadkui2;
        this.MediaBrowserCompatMediaItem = builder;
        this.ParcelableVolumeInfo = getdetachedfromparentlookaheadplacement;
        this.MediaSessionCompatToken = zzzVar;
        this.RatingCompat = crashlyticsWorkers;
        this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = System.currentTimeMillis();
        this.MediaSessionCompatResultReceiverWrapper = new setLayoutState(0);
    }

    public final void serializer(access500 access500Var) {
        CrashlyticsWorkers.checkBackgroundThread();
        CrashlyticsWorkers.checkBackgroundThread();
        this.PlaybackStateCompat.RemoteActionCompatParcelizer();
        Log.isLoggable("FirebaseCrashlytics", 2);
        try {
            try {
                this.write.read(new getLayoutPending(this));
                this.RemoteActionCompatParcelizer.read();
                if (!access500Var.write().read.RemoteActionCompatParcelizer) {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.RemoteActionCompatParcelizer.read(access500Var)) {
                    SentryLogcatAdapter.write("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.RemoteActionCompatParcelizer.serializer(((ParentDataModifierDefaultImpls) ((AtomicReference) access500Var.RemoteActionCompatParcelizer).get()).RemoteActionCompatParcelizer);
                write();
            } catch (Exception e) {
                SentryLogcatAdapter.read("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                write();
            }
        } catch (Throwable th) {
            write();
            throw th;
        }
    }
}
