package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.navigation.core.arrival.ArrivalProgressObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.voice.api.MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
import com.sentiance.sdk.task.e$$ExternalSyntheticLambda0;
import io.sentry.exception.ExceptionMechanismException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.BannerViewExternalSyntheticLambda2;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.internalHeightCallbacklambda0;
import o.pauseWebviewIfNecessarylambda10;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;

/* JADX INFO: loaded from: classes4.dex */
public final class ANRWatchDog extends Thread {
    public final ArrivalProgressObserver$$ExternalSyntheticLambda0 IconCompatParcelizer;
    public final MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0 MediaBrowserCompatMediaItem;
    public final AtomicBoolean MediaDescriptionCompat;
    public final long MediaMetadataCompat;
    public final e$$ExternalSyntheticLambda0 MediaSessionCompatQueueItem;
    public final r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ ParcelableVolumeInfo;
    public final boolean RatingCompat;
    public final long RemoteActionCompatParcelizer;
    public final BrazeActionParserExternalSyntheticLambda0 read;
    public final Context serializer;
    public volatile long write;

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws IOException {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        this.MediaSessionCompatQueueItem.run();
        while (!isInterrupted()) {
            ((Handler) this.ParcelableVolumeInfo.write).post(this.MediaSessionCompatQueueItem);
            try {
                Thread.sleep(this.RemoteActionCompatParcelizer);
                this.MediaBrowserCompatMediaItem.getClass();
                if (SystemClock.uptimeMillis() - this.write > this.MediaMetadataCompat) {
                    if (this.RatingCompat || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.serializer.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                processesInErrorState = activityManager.getProcessesInErrorState();
                            } catch (Throwable th) {
                                this.read.serializer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th);
                                processesInErrorState = null;
                            }
                            if (processesInErrorState != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (it.next().condition == 2) {
                                        }
                                    }
                                }
                            }
                        }
                        if (this.MediaDescriptionCompat.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(c8$$ExternalSyntheticOutline0.m(this.MediaMetadataCompat, " ms.", new StringBuilder("Application Not Responding for at least ")), ((Handler) this.ParcelableVolumeInfo.write).getLooper().getThread());
                            ArrivalProgressObserver$$ExternalSyntheticLambda0 arrivalProgressObserver$$ExternalSyntheticLambda0 = this.IconCompatParcelizer;
                            Object obj = arrivalProgressObserver$$ExternalSyntheticLambda0.f$0;
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) arrivalProgressObserver$$ExternalSyntheticLambda0.f$2;
                            ANRWatchDog aNRWatchDog = AnrIntegration.serializer;
                            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean zEquals = Boolean.TRUE.equals(r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.serializer.read);
                            String strConcat = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (zEquals) {
                                strConcat = "Background ".concat(strConcat);
                            }
                            ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(strConcat, applicationNotResponding.write);
                            io.sentry.protocol.ParcelableVolumeInfo parcelableVolumeInfo = new io.sentry.protocol.ParcelableVolumeInfo();
                            parcelableVolumeInfo.MediaDescriptionCompat = "ANR";
                            BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2 = new BannerViewExternalSyntheticLambda2(new ExceptionMechanismException(parcelableVolumeInfo, applicationNotResponding2, applicationNotResponding2.write, true));
                            bannerViewExternalSyntheticLambda2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR;
                            internalHeightCallbacklambda0.IconCompatParcelizer().RemoteActionCompatParcelizer(bannerViewExternalSyntheticLambda2, pauseWebviewIfNecessarylambda10.IconCompatParcelizer(new r8lambda54BeH8ZsBru0CXI2CCSP2syNys(zEquals)));
                        }
                    } else {
                        this.read.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.MediaDescriptionCompat.set(true);
                    }
                }
            } catch (InterruptedException e) {
                try {
                    Thread.currentThread().interrupt();
                    this.read.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Interrupted: %s", e.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.read.IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Failed to interrupt due to SecurityException: %s", e.getMessage());
                    return;
                }
            }
        }
    }

    public ANRWatchDog(long j, boolean z, ArrivalProgressObserver$$ExternalSyntheticLambda0 arrivalProgressObserver$$ExternalSyntheticLambda0, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0, Context context) {
        MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0 mapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0 = new MapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0(22);
        r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = new r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ();
        super("|ANR-WatchDog|");
        this.write = 0L;
        this.MediaDescriptionCompat = new AtomicBoolean(false);
        this.MediaBrowserCompatMediaItem = mapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0;
        this.MediaMetadataCompat = j;
        this.RemoteActionCompatParcelizer = 500L;
        this.RatingCompat = z;
        this.IconCompatParcelizer = arrivalProgressObserver$$ExternalSyntheticLambda0;
        this.read = brazeActionParserExternalSyntheticLambda0;
        this.ParcelableVolumeInfo = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq;
        this.serializer = context;
        this.MediaSessionCompatQueueItem = new e$$ExternalSyntheticLambda0(this, 15, mapboxVoiceInstructionsPlayer$Companion$$ExternalSyntheticLambda0);
        if (j >= 1000) {
            return;
        }
        ActivityLifecycleIntegration$$ExternalSyntheticLambda1.IconCompatParcelizer("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", new Object[]{1000L});
        throw null;
    }
}
