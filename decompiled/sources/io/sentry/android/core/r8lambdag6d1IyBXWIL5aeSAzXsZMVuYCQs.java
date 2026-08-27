package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import o.accessgetDismissSubscriberp;
import o.r8lambdaL32xCEzW71g2Xzeh1NM3NImxco;
import o.r8lambdadeOzq815xUUwmlLYYvm_QV79QY;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs implements Runnable {
    public final SentryAndroidOptions IconCompatParcelizer;
    public final accessgetDismissSubscriberp RemoteActionCompatParcelizer;
    public final long read;
    public final r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 serializer;
    public final Context write;

    public final void cm_(ApplicationExitInfo applicationExitInfo, boolean z) {
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = this.serializer;
        r8lambdadeOzq815xUUwmlLYYvm_QV79QY r8lambdadeozq815xuuwmllyyvm_qv79qyCo_ = r8lambdah6vvr6zuwa2u1fe0kskpogpr28.co_(applicationExitInfo, z);
        if (r8lambdadeozq815xuuwmllyyvm_qv79qyCo_ == null) {
            return;
        }
        if (this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(r8lambdadeozq815xuuwmllyyvm_qv79qyCo_.MediaBrowserCompatMediaItem(), r8lambdadeozq815xuuwmllyyvm_qv79qyCo_.PlaybackStateCompat()).equals(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.serializer) || r8lambdadeozq815xuuwmllyyvm_qv79qyCo_.MediaSessionCompatQueueItem().C_()) {
            return;
        }
        this.IconCompatParcelizer.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", r8lambdah6vvr6zuwa2u1fe0kskpogpr28.IconCompatParcelizer(), r8lambdadeozq815xuuwmllyyvm_qv79qyCo_.MediaBrowserCompatMediaItem().MediaMetadataCompat);
    }

    public r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs(Context context, SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.IconCompatParcelizer iconCompatParcelizer, r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 r8lambdah6vvr6zuwa2u1fe0kskpogpr28) {
        Context applicationContext = context.getApplicationContext();
        this.write = applicationContext != null ? applicationContext : context;
        this.RemoteActionCompatParcelizer = accessgetDismissSubscriberp.IconCompatParcelizer;
        this.IconCompatParcelizer = sentryAndroidOptions;
        this.serializer = r8lambdah6vvr6zuwa2u1fe0kskpogpr28;
        iconCompatParcelizer.getClass();
        this.read = System.currentTimeMillis() - 7862400000L;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityManager activityManager = (ActivityManager) this.write.getSystemService("activity");
        SentryAndroidOptions sentryAndroidOptions = this.IconCompatParcelizer;
        if (activityManager == null) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        ApplicationExitInfo applicationExitInfo = null;
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        io.sentry.cache.serializer envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.RemoteActionCompatParcelizer) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
            io.sentry.cache.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (io.sentry.cache.RemoteActionCompatParcelizer) envelopeDiskCache;
            if (!remoteActionCompatParcelizer.serializer()) {
                sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                remoteActionCompatParcelizer.MediaSessionCompatQueueItem.countDown();
            }
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 r8lambdah6vvr6zuwa2u1fe0kskpogpr28 = this.serializer;
        Long lRemoteActionCompatParcelizer = r8lambdah6vvr6zuwa2u1fe0kskpogpr28.RemoteActionCompatParcelizer();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoCd_ = ScreenStartObserver$$ExternalSyntheticLambda0.cd_(it.next());
            if (applicationExitInfoCd_.getReason() == r8lambdah6vvr6zuwa2u1fe0kskpogpr28.serializer()) {
                it.remove();
                applicationExitInfo = applicationExitInfoCd_;
                break;
            }
        }
        if (applicationExitInfo == null) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "No %ss have been found in the historical exit reasons list.", r8lambdah6vvr6zuwa2u1fe0kskpogpr28.IconCompatParcelizer());
            return;
        }
        long timestamp = applicationExitInfo.getTimestamp();
        long j = this.read;
        if (timestamp < j) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Latest %s happened too long ago, returning early.", r8lambdah6vvr6zuwa2u1fe0kskpogpr28.IconCompatParcelizer());
            return;
        }
        if (lRemoteActionCompatParcelizer != null && applicationExitInfo.getTimestamp() <= lRemoteActionCompatParcelizer.longValue()) {
            sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "Latest %s has already been reported, returning early.", r8lambdah6vvr6zuwa2u1fe0kskpogpr28.IconCompatParcelizer());
            return;
        }
        if (r8lambdah6vvr6zuwa2u1fe0kskpogpr28.read()) {
            Collections.reverse(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ApplicationExitInfo applicationExitInfoCd_2 = ScreenStartObserver$$ExternalSyntheticLambda0.cd_(it2.next());
                if (applicationExitInfoCd_2.getReason() == r8lambdah6vvr6zuwa2u1fe0kskpogpr28.serializer()) {
                    if (applicationExitInfoCd_2.getTimestamp() < j) {
                        sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "%s happened too long ago %s.", r8lambdah6vvr6zuwa2u1fe0kskpogpr28.IconCompatParcelizer(), applicationExitInfoCd_2);
                    } else if (lRemoteActionCompatParcelizer == null || applicationExitInfoCd_2.getTimestamp() > lRemoteActionCompatParcelizer.longValue()) {
                        cm_(applicationExitInfoCd_2, false);
                    } else {
                        sentryAndroidOptions.getLogger().IconCompatParcelizer(r8lambdaL32xCEzW71g2Xzeh1NM3NImxco.DEBUG, "%s has already been reported %s.", r8lambdah6vvr6zuwa2u1fe0kskpogpr28.IconCompatParcelizer(), applicationExitInfoCd_2);
                    }
                }
            }
        }
        cm_(applicationExitInfo, true);
    }
}
