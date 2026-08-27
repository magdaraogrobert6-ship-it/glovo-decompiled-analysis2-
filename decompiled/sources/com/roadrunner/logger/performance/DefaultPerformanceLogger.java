package com.roadrunner.logger.performance;

import android.app.Application;
import androidx.compose.ui.graphics.Fields;
import androidx.room.RoomDatabase$createConnectionManager$2;
import com.deliveryhero.chatsdk.util.PushNotificationParserObj;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.networking.core.NetworkingCoreModule$$ExternalSyntheticLambda2;
import java.util.concurrent.ConcurrentHashMap;
import o.SemanticsOwner;
import o.SuspendingTransactionWrapper;
import o.afterCommit;
import o.executeAsOneOrNull;
import o.getMapper;
import o.getRootInfoui;
import o.getTransaction;
import o.isAdapterPositionOnScreen;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.transferSessionPackageI;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultPerformanceLogger {
    private static int MediaSessionCompatQueueItem = 0;
    private static int PlaybackStateCompat = 1;
    public final Application IconCompatParcelizer;
    public volatile getTransaction MediaBrowserCompatMediaItem;
    public final getMapper MediaMetadataCompat;
    public final String RatingCompat;
    public final SemanticsOwner RemoteActionCompatParcelizer;
    public final AppEventInfoChangeHandler read;
    public final transferSessionPackageI write;
    public final isAdapterPositionOnScreen serializer = new isAdapterPositionOnScreen(new NetworkingCoreModule$$ExternalSyntheticLambda2(4, this));
    public final ConcurrentHashMap MediaDescriptionCompat = new ConcurrentHashMap();

    public DefaultPerformanceLogger(SemanticsOwner semanticsOwner, SuspendingTransactionWrapper suspendingTransactionWrapper, AppEventInfoChangeHandler appEventInfoChangeHandler, Application application, transferSessionPackageI transfersessionpackagei, String str, getMapper getmapper) {
        this.RemoteActionCompatParcelizer = semanticsOwner;
        this.read = appEventInfoChangeHandler;
        this.IconCompatParcelizer = application;
        this.write = transfersessionpackagei;
        this.RatingCompat = str;
        this.MediaMetadataCompat = getmapper;
    }

    public final boolean read() {
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 19;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return ((Boolean) this.serializer.MediaSessionCompatResultReceiverWrapper()).booleanValue();
        }
        ((Boolean) this.serializer.MediaSessionCompatResultReceiverWrapper()).booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IconCompatParcelizer() {
        int i = 2 % 2;
        if (!read()) {
            int i2 = MediaSessionCompatQueueItem + 63;
            PlaybackStateCompat = i2 % Fields.SpotShadowColor;
            if (i2 % 2 == 0) {
                throw null;
            }
            return;
        }
        getTransaction gettransaction = this.MediaBrowserCompatMediaItem;
        if (gettransaction != null) {
            int i3 = PlaybackStateCompat + 89;
            MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                gettransaction.write();
                throw null;
            }
            gettransaction.write();
        }
        this.MediaDescriptionCompat.clear();
        this.MediaBrowserCompatMediaItem = null;
    }

    public final void write() {
        int i = 2 % 2;
        if (read()) {
            getTransaction gettransaction = this.MediaBrowserCompatMediaItem;
            if (gettransaction != null) {
                int i2 = PlaybackStateCompat + 93;
                MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
                if (i2 % 2 != 0) {
                    gettransaction.RemoteActionCompatParcelizer();
                    int i3 = 75 / 0;
                } else {
                    gettransaction.RemoteActionCompatParcelizer();
                }
            }
            this.MediaDescriptionCompat.clear();
            this.MediaBrowserCompatMediaItem = null;
            int i4 = PlaybackStateCompat + 7;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
    }

    public final void IconCompatParcelizer(String str) {
        afterCommit aftercommit;
        int i = 2 % 2;
        ((getRootInfoui) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(str);
        if (read() && (aftercommit = (afterCommit) this.MediaDescriptionCompat.remove(str)) != null) {
            int i2 = PlaybackStateCompat + 31;
            MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                aftercommit.serializer();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            aftercommit.serializer();
        }
        int i3 = MediaSessionCompatQueueItem + 65;
        PlaybackStateCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }

    public final void write(String str) {
        afterCommit aftercommit;
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 31;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((getRootInfoui) this.RemoteActionCompatParcelizer).write(str);
        if (read() && (aftercommit = (afterCommit) this.MediaDescriptionCompat.remove(str)) != null) {
            int i4 = MediaSessionCompatQueueItem + 89;
            PlaybackStateCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            aftercommit.RemoteActionCompatParcelizer();
            int i6 = PlaybackStateCompat + 65;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
        }
    }

    public final void start() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 3;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 == 0) {
            read();
            throw null;
        }
        if (read()) {
            IconCompatParcelizer();
            getTransaction gettransaction = SuspendingTransactionWrapper.read(this.RatingCompat, this.MediaMetadataCompat.getValue());
            write(new RoomDatabase$createConnectionManager$2(2, gettransaction, getTransaction.class, "setData", "setData(Ljava/lang/String;Ljava/lang/Object;)V", 0, 19));
            this.MediaBrowserCompatMediaItem = gettransaction;
            return;
        }
        int i3 = MediaSessionCompatQueueItem + 109;
        PlaybackStateCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void write(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 23;
        PlaybackStateCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        executeAsOneOrNull executeasoneornull = (executeAsOneOrNull) this.read.MediaDescriptionCompat.get();
        if (executeasoneornull != null) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke("brand", executeasoneornull.IconCompatParcelizer);
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(PushNotificationParserObj.COUNTRY_KEY, executeasoneornull.MediaMetadataCompat.serializer);
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke("device_class", ModuleDSLKt.read(this.IconCompatParcelizer).toString());
            int i4 = PlaybackStateCompat + 61;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        int i6 = PlaybackStateCompat + 69;
        MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
    }

    public final void startTrace(String str) {
        getTransaction gettransaction;
        int i = 2 % 2;
        int i2 = PlaybackStateCompat + 61;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            ((getRootInfoui) this.RemoteActionCompatParcelizer).serializer(str);
            read();
            throw null;
        }
        ((getRootInfoui) this.RemoteActionCompatParcelizer).serializer(str);
        if (read() && (gettransaction = this.MediaBrowserCompatMediaItem) != null) {
            afterCommit aftercommitRemoteActionCompatParcelizer = gettransaction.RemoteActionCompatParcelizer(str);
            this.MediaDescriptionCompat.put(str, aftercommitRemoteActionCompatParcelizer);
            write(new RoomDatabase$createConnectionManager$2(2, aftercommitRemoteActionCompatParcelizer, afterCommit.class, "setData", "setData(Ljava/lang/String;Ljava/lang/Object;)V", 0, 20));
        }
        int i3 = MediaSessionCompatQueueItem + 101;
        PlaybackStateCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
    }
}
