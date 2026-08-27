package io.sentry.android.core;

import androidx.work.impl.WorkerWrapper;
import com.google.android.gms.location.DeviceOrientationRequest;
import io.sentry.android.core.performance.AppStartMetrics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.BannerViewExternalSyntheticLambda2;
import o.SetPushNotificationSubscriptionStep;
import o.UriActionExternalSyntheticLambda4;
import o.defaultCardHandlinglambda0;
import o.executelambda4;
import o.r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0;
import o.r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k;
import o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI;
import o.setNativeShader;

/* JADX INFO: loaded from: classes4.dex */
public final class PerformanceAndroidEventProcessor implements r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI {
    public final SentryAndroidOptions IconCompatParcelizer;
    public final WorkerWrapper.Builder read;
    public final io.sentry.util.RemoteActionCompatParcelizer write = new io.sentry.util.RemoteActionCompatParcelizer();

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final BannerViewExternalSyntheticLambda2 read(BannerViewExternalSyntheticLambda2 bannerViewExternalSyntheticLambda2, executelambda4 executelambda4Var) {
        return bannerViewExternalSyntheticLambda2;
    }

    public static boolean RemoteActionCompatParcelizer(io.sentry.protocol.accessensureViewModelStore accessensureviewmodelstore) {
        for (io.sentry.protocol.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq : accessensureviewmodelstore.ComponentActivity) {
            if (r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.serializer.contentEquals("app.start.cold") || r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.serializer.contentEquals("app.start.warm")) {
                return true;
            }
        }
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem = accessensureviewmodelstore.read.MediaSessionCompatQueueItem();
        if (r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem != null) {
            return r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem.MediaBrowserCompatMediaItem.equals("app.start.cold") || r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem.MediaBrowserCompatMediaItem.equals("app.start.warm");
        }
        return false;
    }

    public static void read(AppStartMetrics appStartMetrics, io.sentry.protocol.accessensureViewModelStore accessensureviewmodelstore) {
        r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k;
        if (appStartMetrics.MediaDescriptionCompat != io.sentry.android.core.performance.read.COLD) {
            return;
        }
        io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer = accessensureviewmodelstore.read;
        ArrayList arrayList = accessensureviewmodelstore.ComponentActivity;
        r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem = iconCompatParcelizer.MediaSessionCompatQueueItem();
        if (r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem == null) {
            return;
        }
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem.PlaybackStateCompat;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                r8lambdayq9qbmke5in5qopvpj_kuggks_k = null;
                break;
            }
            io.sentry.protocol.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = (io.sentry.protocol.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ) it.next();
            if (r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.serializer.contentEquals("app.start.cold")) {
                r8lambdayq9qbmke5in5qopvpj_kuggks_k = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.RatingCompat;
                break;
            }
        }
        io.sentry.android.core.performance.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new io.sentry.android.core.performance.RemoteActionCompatParcelizer();
        io.sentry.android.core.performance.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = appStartMetrics.MediaSessionCompatQueueItem;
        long j = remoteActionCompatParcelizer2.IconCompatParcelizer;
        long j2 = remoteActionCompatParcelizer2.read;
        long j3 = AppStartMetrics.read;
        remoteActionCompatParcelizer.serializer = "Process Initialization";
        remoteActionCompatParcelizer.IconCompatParcelizer = j;
        remoteActionCompatParcelizer.read = j2;
        remoteActionCompatParcelizer.write = j3;
        if (remoteActionCompatParcelizer.serializer() && Math.abs(remoteActionCompatParcelizer.RemoteActionCompatParcelizer()) <= DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM) {
            arrayList.add(read(remoteActionCompatParcelizer, r8lambdayq9qbmke5in5qopvpj_kuggks_k, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, "process.load"));
        }
        ArrayList arrayList2 = new ArrayList(appStartMetrics.MediaMetadataCompat.values());
        Collections.sort(arrayList2);
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(read((io.sentry.android.core.performance.RemoteActionCompatParcelizer) it2.next(), r8lambdayq9qbmke5in5qopvpj_kuggks_k, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, "contentprovider.load"));
            }
        }
        io.sentry.android.core.performance.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = appStartMetrics.RatingCompat;
        if (remoteActionCompatParcelizer3.write != 0) {
            arrayList.add(read(remoteActionCompatParcelizer3, r8lambdayq9qbmke5in5qopvpj_kuggks_k, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, "application.load"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4  */
    public static void write(io.sentry.protocol.accessensureViewModelStore accessensureviewmodelstore) {
        boolean z;
        Double d;
        Double d2;
        Object obj;
        ArrayList<io.sentry.protocol.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ> arrayList = accessensureviewmodelstore.ComponentActivity;
        io.sentry.protocol.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = null;
        io.sentry.protocol.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2 = null;
        for (io.sentry.protocol.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq3 : arrayList) {
            if ("ui.load.initial_display".equals(r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq3.serializer)) {
                r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq3;
            } else if ("ui.load.full_display".equals(r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq3.serializer)) {
                r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2 = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq3;
            }
            if (r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq != null && r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2 != null) {
                break;
            }
        }
        if (r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq == null && r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2 == null) {
            return;
        }
        for (io.sentry.protocol.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq4 : arrayList) {
            if (r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq4 != r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq && r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq4 != r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2) {
                Map map = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq4.read;
                Double d3 = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq4.MediaSessionCompatQueueItem;
                boolean z2 = true;
                boolean z3 = map == null || (obj = map.get("thread.name")) == null || "main".equals(obj);
                if (r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq != null) {
                    double dDoubleValue = d3.doubleValue();
                    if (dDoubleValue < r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.MediaSessionCompatQueueItem.doubleValue() || (((d2 = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq.MediaSessionCompatResultReceiverWrapper) != null && dDoubleValue > d2.doubleValue()) || !z3)) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2 != null) {
                    double dDoubleValue2 = d3.doubleValue();
                    if (dDoubleValue2 < r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2.MediaSessionCompatQueueItem.doubleValue() || ((d = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq2.MediaSessionCompatResultReceiverWrapper) != null && dDoubleValue2 > d.doubleValue())) {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (z || z2) {
                    Map concurrentHashMap = r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq4.read;
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                        r8lambdawj5mhcsjed_cjc7r4owd0uxyjsq4.read = concurrentHashMap;
                    }
                    if (z) {
                        concurrentHashMap.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z2) {
                        concurrentHashMap.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    @Override // o.r8lambdaxJfG46aOs8fDMxLv0xl_0gwVuI
    public final io.sentry.protocol.accessensureViewModelStore RemoteActionCompatParcelizer(io.sentry.protocol.accessensureViewModelStore accessensureviewmodelstore, executelambda4 executelambda4Var) {
        Map map;
        SentryAndroidOptions sentryAndroidOptions = this.IconCompatParcelizer;
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.write.serializer();
        try {
            if (!sentryAndroidOptions.isTracingEnabled()) {
                uriActionExternalSyntheticLambda4Serializer.close();
                return accessensureviewmodelstore;
            }
            AppStartMetrics appStartMetrics = AppStartMetrics.read();
            boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(accessensureviewmodelstore);
            HashMap map2 = accessensureviewmodelstore.ResultReceiver;
            io.sentry.protocol.IconCompatParcelizer iconCompatParcelizer = accessensureviewmodelstore.read;
            if (zRemoteActionCompatParcelizer) {
                if (appStartMetrics.MediaSessionCompatResultReceiverWrapper && ((Boolean) appStartMetrics.MediaBrowserCompatMediaItem.IconCompatParcelizer()).booleanValue()) {
                    long jRemoteActionCompatParcelizer = appStartMetrics.serializer(sentryAndroidOptions).RemoteActionCompatParcelizer();
                    if (jRemoteActionCompatParcelizer != 0) {
                        map2.put(appStartMetrics.MediaDescriptionCompat == io.sentry.android.core.performance.read.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.PlaybackStateCompat(SetPushNotificationSubscriptionStep.MILLISECOND.apiName(), Float.valueOf(jRemoteActionCompatParcelizer)));
                        read(appStartMetrics, accessensureviewmodelstore);
                        appStartMetrics.MediaSessionCompatResultReceiverWrapper = false;
                        appStartMetrics.MediaMetadataCompat.clear();
                        appStartMetrics.write.clear();
                    }
                }
                io.sentry.protocol.read readVarIconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer();
                if (readVarIconCompatParcelizer == null) {
                    readVarIconCompatParcelizer = new io.sentry.protocol.read();
                    iconCompatParcelizer.write(readVarIconCompatParcelizer);
                }
                readVarIconCompatParcelizer.ParcelableVolumeInfo = appStartMetrics.MediaDescriptionCompat == io.sentry.android.core.performance.read.COLD ? "cold" : "warm";
            }
            write(accessensureviewmodelstore);
            io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = accessensureviewmodelstore.MediaMetadataCompat;
            r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem = iconCompatParcelizer.MediaSessionCompatQueueItem();
            if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg != null && r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem != null && r8lambdasv8cpfy2ryceslm1ayxpdavyzp0MediaSessionCompatQueueItem.MediaBrowserCompatMediaItem.contentEquals("ui.load")) {
                WorkerWrapper.Builder builder = this.read;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) builder.read;
                UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer2 = ((io.sentry.util.RemoteActionCompatParcelizer) builder.IconCompatParcelizer).serializer();
                try {
                    if (builder.read()) {
                        Map map3 = (Map) concurrentHashMap.get(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
                        concurrentHashMap.remove(r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
                        uriActionExternalSyntheticLambda4Serializer2.close();
                        map = map3;
                    } else {
                        uriActionExternalSyntheticLambda4Serializer2.close();
                        map = null;
                    }
                    if (map != null) {
                        map2.putAll(map);
                    }
                } catch (Throwable th) {
                    try {
                        uriActionExternalSyntheticLambda4Serializer2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            uriActionExternalSyntheticLambda4Serializer.close();
            return accessensureviewmodelstore;
        } catch (Throwable th3) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static io.sentry.protocol.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ read(io.sentry.android.core.performance.RemoteActionCompatParcelizer remoteActionCompatParcelizer, r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k r8lambdayq9qbmke5in5qopvpj_kuggks_k, io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, String str) {
        long jRemoteActionCompatParcelizer;
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.MediaMetadataCompat.IconCompatParcelizer));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        double d = remoteActionCompatParcelizer.IconCompatParcelizer / 1000.0d;
        if (remoteActionCompatParcelizer.serializer()) {
            jRemoteActionCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer() + remoteActionCompatParcelizer.IconCompatParcelizer;
        } else {
            jRemoteActionCompatParcelizer = 0;
        }
        return new io.sentry.protocol.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ(Double.valueOf(d), Double.valueOf(jRemoteActionCompatParcelizer / 1000.0d), r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, new r8lambdaYQ9qbmkE5in5qOPVpj_KUGGKs_k(), r8lambdayq9qbmke5in5qopvpj_kuggks_k, str, remoteActionCompatParcelizer.serializer, defaultCardHandlinglambda0.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    public PerformanceAndroidEventProcessor(SentryAndroidOptions sentryAndroidOptions, WorkerWrapper.Builder builder) {
        setNativeShader.read(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.IconCompatParcelizer = sentryAndroidOptions;
        this.read = builder;
    }
}
