package com.sentiance.sdk.services;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Message;
import android.os.SystemClock;
import com.sentiance.sdk.InjectUsing;
import java.util.HashMap;
import o.containsandroid_sdk_base_release;
import o.getHtmlSpannedTextIfEnabled;
import o.getHtmlSpannedTextIfEnabledlambda0;
import o.migrateBannerImpressionMapToJsonlambda0;
import o.migrateBannerImpressionMapToJsonlambda20;
import o.migrateBannerStorageToJsonlambda3;
import o.parseLonglambda0;
import o.parseStringAsIntegerlambda1;
import o.r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg;
import o.r8lambda8wKuPcR_AXiuhWt7hIFuyEzjeWw;
import o.r8lambdaNFajLtzW3BPOO80Rlt2TGeVAl4;
import o.r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI;
import o.r8lambdaVxZSrIVgVkdNY1DpHLobPElLXfE;
import o.r8lambdaXcYWiJFQ022HfKxRmj6WpvsH7TA;
import o.readList;
import o.setNotificationBadgeNumber;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "ServiceManager")
public class ServiceManager {
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI IconCompatParcelizer;
    private final r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg MediaBrowserCompatMediaItem;
    private final parseStringAsIntegerlambda1 MediaDescriptionCompat;
    private final migrateBannerImpressionMapToJsonlambda20 MediaMetadataCompat;
    private final ActivityManager MediaSessionCompatQueueItem;
    private final r8lambdaNFajLtzW3BPOO80Rlt2TGeVAl4 MediaSessionCompatResultReceiverWrapper;
    private final migrateBannerImpressionMapToJsonlambda0 MediaSessionCompatToken;
    private final HashMap ParcelableVolumeInfo = new HashMap();
    private final NotificationManager PlaybackStateCompat;
    private long PlaybackStateCompatCustomAction;
    private final r8lambdaVxZSrIVgVkdNY1DpHLobPElLXfE RatingCompat;
    private final containsandroid_sdk_base_release RemoteActionCompatParcelizer;
    private final parseLonglambda0 read;
    private final migrateBannerStorageToJsonlambda3 serializer;
    private final setNotificationBadgeNumber write;

    public enum StartState {
        STOPPED,
        START_RESTRICTED,
        START_FAILED,
        STARTED;

        public static StartState fromServiceStartResult(ServiceStartResult serviceStartResult) {
            int i = r8lambdaXcYWiJFQ022HfKxRmj6WpvsH7TA.serializer[serviceStartResult.ordinal()];
            if (i != 1) {
                return i != 2 ? START_FAILED : START_RESTRICTED;
            }
            return STARTED;
        }
    }

    private void RemoteActionCompatParcelizer() {
        synchronized (this) {
            this.read.IconCompatParcelizer("Processing stopped foreground service", new Object[0]);
            this.MediaSessionCompatResultReceiverWrapper.read();
            ServiceType serviceType = ServiceType.FOREGROUND;
            getHtmlSpannedTextIfEnabledlambda0 gethtmlspannedtextifenabledlambda0Serializer = serializer(serviceType);
            if (getHtmlSpannedTextIfEnabledlambda0.write(gethtmlspannedtextifenabledlambda0Serializer)) {
                this.RatingCompat.serializer(serviceType);
                gethtmlspannedtextifenabledlambda0Serializer.write(StartState.STOPPED);
                this.MediaDescriptionCompat.serializer(serviceType);
            }
        }
    }

    public final boolean RemoteActionCompatParcelizer(ServiceType serviceType) {
        boolean z;
        synchronized (this) {
            getHtmlSpannedTextIfEnabledlambda0 gethtmlspannedtextifenabledlambda0Serializer = serializer(serviceType);
            z = getHtmlSpannedTextIfEnabledlambda0.IconCompatParcelizer(gethtmlspannedtextifenabledlambda0Serializer) || getHtmlSpannedTextIfEnabledlambda0.read(gethtmlspannedtextifenabledlambda0Serializer);
        }
        return z;
    }

    public final void read() {
        synchronized (this) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(7);
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(8);
            this.MediaSessionCompatResultReceiverWrapper.read();
            for (ServiceType serviceType : ServiceType.values()) {
                getHtmlSpannedTextIfEnabledlambda0 gethtmlspannedtextifenabledlambda0Serializer = serializer(serviceType);
                if (getHtmlSpannedTextIfEnabledlambda0.write(gethtmlspannedtextifenabledlambda0Serializer)) {
                    this.RatingCompat.read(serviceType);
                    gethtmlspannedtextifenabledlambda0Serializer.write(StartState.STOPPED);
                    this.MediaDescriptionCompat.serializer(serviceType);
                }
            }
            this.MediaMetadataCompat.read();
        }
    }

    public final void read(String str) {
        synchronized (this) {
            ServiceType serviceType = ServiceType.FOREGROUND;
            migrateBannerImpressionMapToJsonlambda20 migratebannerimpressionmaptojsonlambda20 = this.MediaMetadataCompat;
            if (this.write.MediaDescriptionCompat()) {
                if (migratebannerimpressionmaptojsonlambda20.serializer(serviceType, str)) {
                    this.read.IconCompatParcelizer("duplicate service request for tag: %s", str);
                } else {
                    migratebannerimpressionmaptojsonlambda20.RemoteActionCompatParcelizer(serviceType, str);
                    getHtmlSpannedTextIfEnabledlambda0 gethtmlspannedtextifenabledlambda0Serializer = serializer(serviceType);
                    if (!getHtmlSpannedTextIfEnabledlambda0.write(gethtmlspannedtextifenabledlambda0Serializer) && (getHtmlSpannedTextIfEnabledlambda0.RemoteActionCompatParcelizer(gethtmlspannedtextifenabledlambda0Serializer) || getHtmlSpannedTextIfEnabledlambda0.serializer(gethtmlspannedtextifenabledlambda0Serializer))) {
                        write(serviceType);
                    }
                }
            }
        }
    }

    public final void serializer() {
        synchronized (this) {
            RemoteActionCompatParcelizer();
            IconCompatParcelizer();
        }
    }

    public final void write(String str) {
        synchronized (this) {
            ServiceType serviceType = ServiceType.FOREGROUND;
            migrateBannerImpressionMapToJsonlambda20 migratebannerimpressionmaptojsonlambda20 = this.MediaMetadataCompat;
            if (migratebannerimpressionmaptojsonlambda20.write(serviceType, str) && !migratebannerimpressionmaptojsonlambda20.serializer(serviceType)) {
                this.RatingCompat.read(serviceType);
                serializer(serviceType).write(StartState.STOPPED);
                this.MediaDescriptionCompat.serializer(serviceType);
            }
        }
    }

    private void IconCompatParcelizer() {
        if (this.MediaMetadataCompat.serializer(ServiceType.FOREGROUND)) {
            containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar = this.RemoteActionCompatParcelizer;
            if (containsandroid_sdk_base_releaseVar.write(8)) {
                return;
            }
            this.read.IconCompatParcelizer("Scheduling restart of the foreground service", new Object[0]);
            containsandroid_sdk_base_releaseVar.read(8, 500L);
        }
    }

    private void write(ServiceType serviceType) {
        ServiceStartResult serviceStartResultIconCompatParcelizer = this.RatingCompat.IconCompatParcelizer(serviceType);
        serializer(serviceType).write(StartState.fromServiceStartResult(serviceStartResultIconCompatParcelizer));
        ServiceStartResult serviceStartResult = ServiceStartResult.SUCCESS;
        parseLonglambda0 parselonglambda0 = this.read;
        if (serviceStartResultIconCompatParcelizer == serviceStartResult) {
            this.MediaDescriptionCompat.IconCompatParcelizer(serviceType);
            parselonglambda0.IconCompatParcelizer("Service of type " + serviceType.name() + " was successfully started", new Object[0]);
            return;
        }
        if (serviceStartResultIconCompatParcelizer == ServiceStartResult.NOT_PERMITTED_BY_OS) {
            this.PlaybackStateCompatCustomAction = 0L;
            this.MediaSessionCompatResultReceiverWrapper.write();
            containsandroid_sdk_base_release containsandroid_sdk_base_releaseVar = this.RemoteActionCompatParcelizer;
            if (!containsandroid_sdk_base_releaseVar.write(7)) {
                containsandroid_sdk_base_releaseVar.read(7, 1000L);
            }
            parselonglambda0.IconCompatParcelizer("Service of type " + serviceType.name() + " was not allowed to be started", new Object[0]);
        }
    }

    public ServiceManager(Context context, parseLonglambda0 parselonglambda0, parseStringAsIntegerlambda1 parsestringasintegerlambda1, migrateBannerImpressionMapToJsonlambda20 migratebannerimpressionmaptojsonlambda20, r8lambdaVxZSrIVgVkdNY1DpHLobPElLXfE r8lambdavxzsrivgvkdny1dphlobpellxfe, NotificationManager notificationManager, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdaNFajLtzW3BPOO80Rlt2TGeVAl4 r8lambdanfajltzw3bpoo80rlt2tgeval4, readList readlist, migrateBannerImpressionMapToJsonlambda0 migratebannerimpressionmaptojsonlambda0, r8lambda7zCvOdb3YpLJDzJMGkbnvobYklg r8lambda7zcvodb3ypljdzjmgkbnvobyklg, setNotificationBadgeNumber setnotificationbadgenumber, migrateBannerStorageToJsonlambda3 migratebannerstoragetojsonlambda3, ActivityManager activityManager) {
        this.read = parselonglambda0;
        this.serializer = migratebannerstoragetojsonlambda3;
        this.IconCompatParcelizer = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.write = setnotificationbadgenumber;
        this.MediaDescriptionCompat = parsestringasintegerlambda1;
        this.MediaBrowserCompatMediaItem = r8lambda7zcvodb3ypljdzjmgkbnvobyklg;
        this.MediaMetadataCompat = migratebannerimpressionmaptojsonlambda20;
        this.MediaSessionCompatQueueItem = activityManager;
        this.RatingCompat = r8lambdavxzsrivgvkdny1dphlobpellxfe;
        this.RemoteActionCompatParcelizer = readlist.write();
        this.PlaybackStateCompat = notificationManager;
        this.MediaSessionCompatToken = migratebannerimpressionmaptojsonlambda0;
        this.MediaSessionCompatResultReceiverWrapper = r8lambdanfajltzw3bpoo80rlt2tgeval4;
        for (ServiceType serviceType : ServiceType.values()) {
            this.ParcelableVolumeInfo.put(serviceType, new getHtmlSpannedTextIfEnabledlambda0(this, r8lambdaqv3gcjxzuxdig5g76qjuzxgjni));
        }
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new r8lambda8wKuPcR_AXiuhWt7hIFuyEzjeWw(1, this));
    }

    public static void RemoteActionCompatParcelizer(ServiceManager serviceManager, Message message) {
        int i = message.what;
        if (i == 7) {
            synchronized (serviceManager) {
                ServiceType serviceType = ServiceType.FOREGROUND;
                getHtmlSpannedTextIfEnabledlambda0 gethtmlspannedtextifenabledlambda0Serializer = serviceManager.serializer(serviceType);
                if (serviceManager.MediaMetadataCompat.serializer(serviceType) && (getHtmlSpannedTextIfEnabledlambda0.IconCompatParcelizer(gethtmlspannedtextifenabledlambda0Serializer) || getHtmlSpannedTextIfEnabledlambda0.read(gethtmlspannedtextifenabledlambda0Serializer))) {
                    serviceManager.read.IconCompatParcelizer("Reattempting foreground service start", new Object[0]);
                    serviceManager.write(serviceType);
                }
            }
            return;
        }
        if (i == 8) {
            migrateBannerStorageToJsonlambda3 migratebannerstoragetojsonlambda3 = serviceManager.serializer;
            ActivityManager activityManager = serviceManager.MediaSessionCompatQueueItem;
            migratebannerstoragetojsonlambda3.getClass();
            if (migrateBannerStorageToJsonlambda3.serializer(activityManager, getHtmlSpannedTextIfEnabled.class) != ServiceForegroundState.NOT_STARTED) {
                serviceManager.IconCompatParcelizer();
                return;
            }
            synchronized (serviceManager) {
                migrateBannerImpressionMapToJsonlambda20 migratebannerimpressionmaptojsonlambda20 = serviceManager.MediaMetadataCompat;
                ServiceType serviceType2 = ServiceType.FOREGROUND;
                if (migratebannerimpressionmaptojsonlambda20.serializer(serviceType2)) {
                    serviceManager.write(serviceType2);
                }
            }
        }
    }

    public final void write() {
        synchronized (this) {
            this.IconCompatParcelizer.getClass();
            this.PlaybackStateCompatCustomAction = SystemClock.elapsedRealtime();
            ServiceType serviceType = ServiceType.FOREGROUND;
            if (getHtmlSpannedTextIfEnabledlambda0.serializer(serializer(serviceType))) {
                write(serviceType);
            }
        }
    }

    private getHtmlSpannedTextIfEnabledlambda0 serializer(ServiceType serviceType) {
        HashMap map = this.ParcelableVolumeInfo;
        getHtmlSpannedTextIfEnabledlambda0 gethtmlspannedtextifenabledlambda0 = (getHtmlSpannedTextIfEnabledlambda0) map.get(serviceType);
        if (gethtmlspannedtextifenabledlambda0 != null) {
            return gethtmlspannedtextifenabledlambda0;
        }
        getHtmlSpannedTextIfEnabledlambda0 gethtmlspannedtextifenabledlambda1 = new getHtmlSpannedTextIfEnabledlambda0(this, this.IconCompatParcelizer);
        map.put(serviceType, gethtmlspannedtextifenabledlambda1);
        return gethtmlspannedtextifenabledlambda1;
    }

    public final void read(ServiceType serviceType) {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(serviceType, ":ServiceAbort");
        serializer(serviceType).write(StartState.STARTED);
        this.read.IconCompatParcelizer("Pretending service of type " + serviceType.name() + " was started", new Object[0]);
    }

    public final void IconCompatParcelizer(int i, Notification notification) {
        this.MediaSessionCompatToken.write(notification);
        this.MediaSessionCompatToken.write(i);
        synchronized (this) {
            if (getHtmlSpannedTextIfEnabledlambda0.write(serializer(ServiceType.FOREGROUND))) {
                Notification notificationIconCompatParcelizer = this.MediaSessionCompatToken.IconCompatParcelizer();
                this.MediaSessionCompatToken.RemoteActionCompatParcelizer();
                this.PlaybackStateCompat.notify(this.MediaBrowserCompatMediaItem.serializer(), notificationIconCompatParcelizer);
            }
        }
    }
}
