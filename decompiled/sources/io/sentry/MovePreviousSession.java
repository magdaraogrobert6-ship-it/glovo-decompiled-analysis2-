package io.sentry;

import android.os.Process;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.ui.graphics.Fields;
import androidx.drawerlayout.widget.DrawerLayout;
import coil3.ImageLoader$Builder;
import com.bumptech.glide.RequestManager;
import com.deliveryhero.performance.core.screenmetric.rendering.JankStatsFrameTracker$$ExternalSyntheticLambda3;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.huawei.hms.location.ActivityIdentificationData;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.cache.RemoteActionCompatParcelizer;
import io.sentry.cache.serializer;
import java.io.File;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.Date;
import java.util.LinkedList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.io.TextStreamsKt;
import o.CSSParseException;
import o.InAppMessageHtmlFullView;
import o.OnFirstVisibleNode;
import o.accessgetApparentToRealOffsetnOccac;
import o.clearChildFocusdefault;
import o.getButton14EK5gGoQ;
import o.getButtonThumbLeftEK5gGoQ;
import o.getCACHE_SUFFIX_PREFERENCES_FILEannotations;
import o.getCacheFileSuffixlambda0;
import o.getContactsEK5gGoQ;
import o.getLocalHtmlUrlFromRemoteUrllambda2;
import o.getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release;
import o.getMediaEjectEK5gGoQ;
import o.getMethodQuietlylambda1;
import o.hasTooManyZipEntrieslambda0;
import o.intersect;
import o.isAutomaticGeofenceRequestsEnabled;
import o.isEmpty;
import o.isValidLogPurchaseInputlambda0;
import o.logPurchaseWithJSONlambda0;
import o.onCreateWindowlambda1;
import o.onCreateWindowlambda2;
import o.onCreateWindowlambda3;
import o.onRenderProcessGone;
import o.optEnum;
import o.r8lambda1DLeNeBWPKsDsvf_XikspXtDEU;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdaboXpAyKq1hl7y9NGvej_RiDUF1A;
import o.r8lambday78CcsNUxER22a2WVqifR2BmBdo;
import o.replacePrefetchedUrlsWithLocalAssetslambda1;
import o.scale0AR0LA0default;
import o.setResourcePackageNamelambda0;
import o.startActivityForResult;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public final class MovePreviousSession implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final Object options;

    public MovePreviousSession(OnFirstVisibleNode onFirstVisibleNode) {
        this.$r8$classId = 9;
        Objects.requireNonNull(onFirstVisibleNode);
        this.options = onFirstVisibleNode;
    }

    private final void serializer() {
        AdvertisingIdClient.Info advertisingIdInfo;
        getButton14EK5gGoQ getbutton14ek5ggoq = (getButton14EK5gGoQ) this.options;
        Process.setThreadPriority(10);
        while (true) {
            if (getbutton14ek5ggoq.write) {
                getMediaEjectEK5gGoQ getmediaejectek5ggoq = getbutton14ek5ggoq.MediaSessionCompatQueueItem;
                try {
                    advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(getmediaejectek5ggoq.write.MediaBrowserCompatMediaItem);
                } catch (GooglePlayServicesNotAvailableException e) {
                    getmediaejectek5ggoq.write.write = false;
                    getButtonThumbLeftEK5gGoQ.read("GooglePlayServicesNotAvailableException getting Advertising Id Info", e);
                    advertisingIdInfo = null;
                } catch (GooglePlayServicesRepairableException e2) {
                    getButtonThumbLeftEK5gGoQ.read("GooglePlayServicesRepairableException getting Advertising Id Info", e2);
                    advertisingIdInfo = null;
                } catch (IOException e3) {
                    getButtonThumbLeftEK5gGoQ.read("IOException getting Ad Id Info", e3);
                    advertisingIdInfo = null;
                } catch (IllegalStateException e4) {
                    getButtonThumbLeftEK5gGoQ.read("IllegalStateException getting Advertising Id Info", e4);
                    advertisingIdInfo = null;
                } catch (Exception e5) {
                    getButtonThumbLeftEK5gGoQ.read("Unknown exception. Could not get the Advertising Id Info.", e5);
                    advertisingIdInfo = null;
                }
            } else {
                advertisingIdInfo = null;
            }
            if (advertisingIdInfo != null) {
                getbutton14ek5ggoq.IconCompatParcelizer = advertisingIdInfo;
                getbutton14ek5ggoq.MediaDescriptionCompat = System.currentTimeMillis();
                int iWrite = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
                int iWrite2 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
                int iWrite3 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
                ((Boolean) Options.Companion.read(iWrite, 1921293490, iWrite2, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{4}, iWrite3, -1921293486)).booleanValue();
            }
            synchronized (getbutton14ek5ggoq) {
                getbutton14ek5ggoq.notifyAll();
            }
            try {
                Object obj = getbutton14ek5ggoq.MediaMetadataCompat;
                synchronized (obj) {
                    try {
                        obj.wait(900000L);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (InterruptedException unused) {
                int iWrite4 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
                int iWrite5 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
                int iWrite6 = SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write();
                ((Boolean) Options.Companion.read(iWrite4, 1921293490, iWrite5, SystemEventsBreadcrumbsIntegration.SystemEventsBroadcastReceiver.write(), new Object[]{4}, iWrite6, -1921293486)).booleanValue();
            }
        }
    }

    private final void write() {
        r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.options;
        r8lambda1dlenebwpksdsvf_xikspxtdeu.MediaDescriptionCompat.execute(r8lambda1dlenebwpksdsvf_xikspxtdeu.RemoteActionCompatParcelizer);
        synchronized (((r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.options).r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
            r8lambda1DLeNeBWPKsDsvf_XikspXtDEU r8lambda1dlenebwpksdsvf_xikspxtdeu2 = (r8lambda1DLeNeBWPKsDsvf_XikspXtDEU) this.options;
            r8lambda1dlenebwpksdsvf_xikspxtdeu2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = Integer.MAX_VALUE;
            r8lambda1dlenebwpksdsvf_xikspxtdeu2.MediaMetadataCompat();
        }
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int width;
        boolean zRemoteActionCompatParcelizer;
        onCreateWindowlambda1 oncreatewindowlambda1IconCompatParcelizer;
        long jNanoTime;
        int i = 4;
        switch (this.$r8$classId) {
            case 0:
                SentryOptions sentryOptions = (SentryOptions) this.options;
                String cacheDirPath = sentryOptions.getCacheDirPath();
                if (cacheDirPath == null) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
                    return;
                }
                if (!sentryOptions.isEnableAutoSessionTracking()) {
                    sentryOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Session tracking is disabled, bailing from previous session mover.", new Object[0]);
                    return;
                }
                serializer envelopeDiskCache = sentryOptions.getEnvelopeDiskCache();
                if (envelopeDiskCache instanceof RemoteActionCompatParcelizer) {
                    int i2 = RemoteActionCompatParcelizer.IconCompatParcelizer;
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) envelopeDiskCache;
                    remoteActionCompatParcelizer.serializer(new File(cacheDirPath, "session.json"), new File(cacheDirPath, "previous_session.json"));
                    remoteActionCompatParcelizer.MediaSessionCompatQueueItem.countDown();
                    return;
                }
                return;
            case 1:
                startActivityForResult startactivityforresult = (startActivityForResult) this.options;
                if ((startactivityforresult.ensureViewModelStore & 1) != 0) {
                    startactivityforresult.read(0);
                }
                if ((startactivityforresult.ensureViewModelStore & Fields.TransformOrigin) != 0) {
                    startactivityforresult.read(ActivityIdentificationData.RUNNING);
                }
                startactivityforresult.fullyDrawnReporter_delegatelambda0 = false;
                startactivityforresult.ensureViewModelStore = 0;
                return;
            case 2:
                ((clearChildFocusdefault) this.options).write(0);
                return;
            case 3:
                intersect intersectVar = (intersect) this.options;
                DrawerLayout drawerLayout = intersectVar.serializer;
                int i3 = intersectVar.write.RatingCompat;
                int i4 = intersectVar.IconCompatParcelizer;
                boolean z = i4 == 3;
                if (z) {
                    view = drawerLayout.read(3);
                    width = (view != null ? -view.getWidth() : 0) + i3;
                } else {
                    view = drawerLayout.read(5);
                    width = drawerLayout.getWidth() - i3;
                }
                if (view != null) {
                    if (((!z || view.getLeft() >= width) && (z || view.getLeft() <= width)) || drawerLayout.read(view) != 0) {
                        return;
                    }
                    isEmpty isempty = (isEmpty) view.getLayoutParams();
                    intersectVar.write.read(width, view.getTop(), view);
                    isempty.serializer = true;
                    drawerLayout.invalidate();
                    View view2 = drawerLayout.read(i4 == 3 ? 5 : 3);
                    if (view2 != null) {
                        drawerLayout.serializer(view2);
                    }
                    if (drawerLayout.MediaBrowserCompatMediaItem) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i5 = 0; i5 < childCount; i5++) {
                        drawerLayout.getChildAt(i5).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    drawerLayout.MediaBrowserCompatMediaItem = true;
                    return;
                }
                return;
            case 4:
                RequestManager requestManager = (RequestManager) this.options;
                requestManager.RatingCompat.IconCompatParcelizer(requestManager);
                return;
            case 5:
                ImageLoader$Builder imageLoader$Builder = (ImageLoader$Builder) this.options;
                while (true) {
                    try {
                        imageLoader$Builder.RemoteActionCompatParcelizer((r8lambdaboXpAyKq1hl7y9NGvej_RiDUF1A) ((ReferenceQueue) imageLoader$Builder.read).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 6:
                getContactsEK5gGoQ getcontactsek5ggoq = (getContactsEK5gGoQ) ((MovePreviousSession) this.options).options;
                int i6 = getcontactsek5ggoq.MediaSessionCompatResultReceiverWrapper;
                LinkedList linkedList = getcontactsek5ggoq.PlaybackStateCompat;
                if (i6 == 1 || i6 == 2) {
                    getcontactsek5ggoq.MediaSessionCompatResultReceiverWrapper = 4;
                    getButtonThumbLeftEK5gGoQ.write("Container load timed out after 5000ms.");
                    while (!linkedList.isEmpty()) {
                        getcontactsek5ggoq.MediaBrowserCompatMediaItem.execute((Runnable) linkedList.remove());
                    }
                    return;
                }
                return;
            case 7:
                ((getContactsEK5gGoQ) this.options).MediaBrowserCompatMediaItem.execute(new MovePreviousSession(6, this));
                return;
            case 8:
                serializer();
                return;
            case 9:
                ((OnFirstVisibleNode) this.options).MediaDescriptionCompat = null;
                return;
            case 10:
                AppStartTrace appStartTrace = (AppStartTrace) this.options;
                if (appStartTrace.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY == null) {
                    appStartTrace.MediaSessionCompatResultReceiverWrapper = new Timer();
                    return;
                }
                return;
            case 11:
                ConfigRealtimeHttpClient configRealtimeHttpClient = (ConfigRealtimeHttpClient) this.options;
                synchronized (configRealtimeHttpClient) {
                    zRemoteActionCompatParcelizer = configRealtimeHttpClient.RemoteActionCompatParcelizer();
                    if (zRemoteActionCompatParcelizer) {
                        synchronized (configRealtimeHttpClient) {
                            configRealtimeHttpClient.ParcelableVolumeInfo = true;
                        }
                    }
                }
                if (zRemoteActionCompatParcelizer) {
                    CSSParseException cSSParseExceptionSerializer = configRealtimeHttpClient.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.serializer();
                    configRealtimeHttpClient.write.getClass();
                    if (new Date(System.currentTimeMillis()).before((Date) cSSParseExceptionSerializer.RemoteActionCompatParcelizer)) {
                        configRealtimeHttpClient.write();
                        return;
                    }
                    FirebaseInstallations firebaseInstallations = (FirebaseInstallations) configRealtimeHttpClient.MediaDescriptionCompat;
                    zzw zzwVar = firebaseInstallations.read();
                    zzw zzwVarWrite = firebaseInstallations.write();
                    Task taskContinueWithTask = LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(zzwVar, zzwVarWrite).continueWithTask(configRealtimeHttpClient.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, new SentryClient$$ExternalSyntheticLambda1(configRealtimeHttpClient, zzwVar, zzwVarWrite, i));
                    LazyKt__LazyJVMKt.RemoteActionCompatParcelizer(taskContinueWithTask).continueWith(configRealtimeHttpClient.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, new JankStatsFrameTracker$$ExternalSyntheticLambda3(configRealtimeHttpClient, 12, taskContinueWithTask));
                    return;
                }
                return;
            case 12:
                ((isValidLogPurchaseInputlambda0) this.options).write.read();
                return;
            case 13:
                if (((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.options).ComponentActivity.IconCompatParcelizer == setResourcePackageNamelambda0.IDLE) {
                    ((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.options).RatingCompat.serializer(optEnum.INFO, "CONNECTING as requested");
                    r8lambday78CcsNUxER22a2WVqifR2BmBdo.IconCompatParcelizer((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.options, setResourcePackageNamelambda0.CONNECTING);
                    r8lambday78CcsNUxER22a2WVqifR2BmBdo.serializer((r8lambday78CcsNUxER22a2WVqifR2BmBdo) this.options);
                    return;
                }
                return;
            case 14:
                accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac = (accessgetApparentToRealOffsetnOccac) this.options;
                r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) accessgetapparenttorealoffsetnoccac.write;
                r8lambday78ccsnuxer22a2wvqifr2bmbdo.PlaybackStateCompat = null;
                if (r8lambday78ccsnuxer22a2wvqifr2bmbdo.r8lambda54BeH8ZsBru0CXI2CCSP2syNys != null) {
                    TextStreamsKt.RemoteActionCompatParcelizer("Unexpected non-null activeTransport", r8lambday78ccsnuxer22a2wvqifr2bmbdo.IconCompatParcelizer == null);
                    accessgetApparentToRealOffsetnOccac accessgetapparenttorealoffsetnoccac2 = (accessgetApparentToRealOffsetnOccac) this.options;
                    ((getLocalHtmlUrlFromRemoteUrllambda2) accessgetapparenttorealoffsetnoccac2.serializer).RemoteActionCompatParcelizer(((r8lambday78CcsNUxER22a2WVqifR2BmBdo) accessgetapparenttorealoffsetnoccac2.write).r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
                    return;
                }
                getLocalHtmlUrlFromRemoteUrllambda2 getlocalhtmlurlfromremoteurllambda2 = r8lambday78ccsnuxer22a2wvqifr2bmbdo.ParcelableVolumeInfo;
                getLocalHtmlUrlFromRemoteUrllambda2 getlocalhtmlurlfromremoteurllambda3 = (getLocalHtmlUrlFromRemoteUrllambda2) accessgetapparenttorealoffsetnoccac.serializer;
                if (getlocalhtmlurlfromremoteurllambda2 == getlocalhtmlurlfromremoteurllambda3) {
                    r8lambday78ccsnuxer22a2wvqifr2bmbdo.IconCompatParcelizer = getlocalhtmlurlfromremoteurllambda3;
                    r8lambday78CcsNUxER22a2WVqifR2BmBdo r8lambday78ccsnuxer22a2wvqifr2bmbdo2 = (r8lambday78CcsNUxER22a2WVqifR2BmBdo) ((accessgetApparentToRealOffsetnOccac) this.options).write;
                    r8lambday78ccsnuxer22a2wvqifr2bmbdo2.ParcelableVolumeInfo = null;
                    r8lambday78CcsNUxER22a2WVqifR2BmBdo.IconCompatParcelizer(r8lambday78ccsnuxer22a2wvqifr2bmbdo2, setResourcePackageNamelambda0.READY);
                    return;
                }
                return;
            case 15:
                ((hasTooManyZipEntrieslambda0) ((scale0AR0LA0default) this.options).IconCompatParcelizer).RatingCompat();
                return;
            case 16:
                hasTooManyZipEntrieslambda0 hastoomanyzipentrieslambda0 = (hasTooManyZipEntrieslambda0) this.options;
                if (hastoomanyzipentrieslambda0.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 == null) {
                    return;
                }
                hasTooManyZipEntrieslambda0.IconCompatParcelizer(hastoomanyzipentrieslambda0);
                return;
            case 17:
                ((getMaxUnpackedZipEntrySizeBytesandroid_sdk_base_release) this.options).write.RatingCompat();
                return;
            case 18:
                onRenderProcessGone onrenderprocessgone = (onRenderProcessGone) this.options;
                ((getMethodQuietlylambda1) onrenderprocessgone.serializer).execute(new isAutomaticGeofenceRequestsEnabled(14, onrenderprocessgone));
                return;
            case 19:
                replacePrefetchedUrlsWithLocalAssetslambda1 replaceprefetchedurlswithlocalassetslambda1 = (replacePrefetchedUrlsWithLocalAssetslambda1) ((logPurchaseWithJSONlambda0) this.options).write;
                if (replaceprefetchedurlswithlocalassetslambda1.ParcelableVolumeInfo) {
                    return;
                }
                replaceprefetchedurlswithlocalassetslambda1.ComponentActivity.read();
                return;
            case 20:
                getCacheFileSuffixlambda0 getcachefilesuffixlambda0 = (getCacheFileSuffixlambda0) this.options;
                long j = getcachefilesuffixlambda0.read;
                long jMax = Math.max(2 * j, j);
                getCACHE_SUFFIX_PREFERENCES_FILEannotations getcache_suffix_preferences_fileannotations = (getCACHE_SUFFIX_PREFERENCES_FILEannotations) getcachefilesuffixlambda0.serializer;
                if (getcache_suffix_preferences_fileannotations.read.compareAndSet(j, jMax)) {
                    getCACHE_SUFFIX_PREFERENCES_FILEannotations.serializer.log(Level.WARNING, "Increased {0} to {1}", new Object[]{getcache_suffix_preferences_fileannotations.write, Long.valueOf(jMax)});
                    return;
                }
                return;
            case 21:
                write();
                return;
            default:
                InAppMessageHtmlFullView inAppMessageHtmlFullView = (InAppMessageHtmlFullView) this.options;
                synchronized (inAppMessageHtmlFullView) {
                    inAppMessageHtmlFullView.runCallCount++;
                    oncreatewindowlambda1IconCompatParcelizer = inAppMessageHtmlFullView.IconCompatParcelizer();
                }
                if (oncreatewindowlambda1IconCompatParcelizer == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                do {
                    onCreateWindowlambda1 oncreatewindowlambda1 = oncreatewindowlambda1IconCompatParcelizer;
                    try {
                        threadCurrentThread.setName(oncreatewindowlambda1.name);
                        Logger logger = ((InAppMessageHtmlFullView) this.options).logger$1;
                        onCreateWindowlambda3 oncreatewindowlambda3 = oncreatewindowlambda1.queue;
                        oncreatewindowlambda3.getClass();
                        boolean zIsLoggable = logger.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            onCreateWindowlambda2.RemoteActionCompatParcelizer(logger, oncreatewindowlambda1, oncreatewindowlambda3, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long j2 = oncreatewindowlambda1.read();
                            if (zIsLoggable) {
                                onCreateWindowlambda2.RemoteActionCompatParcelizer(logger, oncreatewindowlambda1, oncreatewindowlambda3, "finished run in " + onCreateWindowlambda2.write(System.nanoTime() - jNanoTime));
                            }
                            InAppMessageHtmlFullView inAppMessageHtmlFullView2 = (InAppMessageHtmlFullView) this.options;
                            synchronized (inAppMessageHtmlFullView2) {
                                InAppMessageHtmlFullView.read(inAppMessageHtmlFullView2, oncreatewindowlambda1, j2, true);
                                oncreatewindowlambda1IconCompatParcelizer = inAppMessageHtmlFullView2.IconCompatParcelizer();
                            }
                        } catch (Throwable th) {
                            if (!zIsLoggable) {
                                throw th;
                            }
                            onCreateWindowlambda2.RemoteActionCompatParcelizer(logger, oncreatewindowlambda1, oncreatewindowlambda3, "failed a run in " + onCreateWindowlambda2.write(System.nanoTime() - jNanoTime));
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            InAppMessageHtmlFullView inAppMessageHtmlFullView3 = (InAppMessageHtmlFullView) this.options;
                            synchronized (inAppMessageHtmlFullView3) {
                                InAppMessageHtmlFullView.read(inAppMessageHtmlFullView3, oncreatewindowlambda1, -1L, false);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            threadCurrentThread.setName(name);
                            throw th3;
                        }
                    }
                } while (oncreatewindowlambda1IconCompatParcelizer != null);
                threadCurrentThread.setName(name);
                return;
        }
    }

    public /* synthetic */ MovePreviousSession(int i, Object obj) {
        this.$r8$classId = i;
        this.options = obj;
    }
}
