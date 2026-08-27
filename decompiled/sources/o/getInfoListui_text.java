package o;

import android.app.Application;
import androidx.room.RoomDatabase$createConnectionManager$2;
import com.roadrunner.logger.info.AppEventInfoChangeHandler;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.concurrent.ConcurrentHashMap;
import org.koin.dsl.ModuleDSLKt;

/* JADX INFO: loaded from: classes3.dex */
public final class getInfoListui_text implements maxIntrinsicWidth_delegatelambda0 {
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final Application IconCompatParcelizer;
    public final SuspendingTransactionWrapper MediaBrowserCompatMediaItem;
    public final ConcurrentHashMap MediaMetadataCompat;
    public final registerOnChangedCallback RemoteActionCompatParcelizer;
    public final SemanticsOwner read;
    public final AppEventInfoChangeHandler serializer;
    public getTransaction write;

    public getInfoListui_text(SemanticsOwner semanticsOwner, SuspendingTransactionWrapper suspendingTransactionWrapper, AppEventInfoChangeHandler appEventInfoChangeHandler, Application application, registerOnChangedCallback registeronchangedcallback) {
        semanticsOwner.getClass();
        suspendingTransactionWrapper.getClass();
        appEventInfoChangeHandler.getClass();
        application.getClass();
        registeronchangedcallback.getClass();
        this.read = semanticsOwner;
        this.MediaBrowserCompatMediaItem = suspendingTransactionWrapper;
        this.serializer = appEventInfoChangeHandler;
        this.IconCompatParcelizer = application;
        this.RemoteActionCompatParcelizer = registeronchangedcallback;
        this.MediaMetadataCompat = new ConcurrentHashMap();
    }

    public final boolean serializer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 13;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i2 % 2 != 0) {
            ((FirebaseRemoteConfigImpl) ((accessanalyzeComponents58bKbWc) this.RemoteActionCompatParcelizer).serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_SENTRY_CUSTOM_TRACES_ENABLED.getFirebaseFlagName());
            obj.hashCode();
            throw null;
        }
        boolean zIconCompatParcelizer = ((FirebaseRemoteConfigImpl) ((accessanalyzeComponents58bKbWc) this.RemoteActionCompatParcelizer).serializer).IconCompatParcelizer.IconCompatParcelizer(updateAdidI.IS_SENTRY_CUSTOM_TRACES_ENABLED.getFirebaseFlagName());
        int i3 = MediaSessionCompatQueueItem + 15;
        RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return zIconCompatParcelizer;
        }
        throw null;
    }

    public final void read() {
        int i = 2 % 2;
        if (!serializer()) {
            int i2 = RatingCompat + 15;
            MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return;
        }
        getTransaction gettransaction = this.write;
        if (gettransaction != null) {
            gettransaction.write();
            int i4 = RatingCompat + 33;
            MediaSessionCompatQueueItem = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
        }
        this.MediaMetadataCompat.clear();
        this.write = null;
        int i6 = MediaSessionCompatQueueItem + 111;
        RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 5 / 0;
        }
    }

    public final void IconCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 23;
        RatingCompat = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            ((getRootInfoui) this.read).RemoteActionCompatParcelizer(str);
            serializer();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ((getRootInfoui) this.read).RemoteActionCompatParcelizer(str);
        if (!serializer()) {
            int i3 = MediaSessionCompatQueueItem + 51;
            RatingCompat = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            return;
        }
        afterCommit aftercommit = (afterCommit) this.MediaMetadataCompat.remove(str);
        if (aftercommit != null) {
            int i5 = MediaSessionCompatQueueItem + 89;
            RatingCompat = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i5 % 2 != 0) {
                aftercommit.serializer();
            } else {
                aftercommit.serializer();
                int i6 = 52 / 0;
            }
        }
    }

    public final void write(String str) {
        int i = 2 % 2;
        int i2 = RatingCompat + 89;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((getRootInfoui) this.read).write(str);
        if (!serializer()) {
            int i4 = MediaSessionCompatQueueItem + 9;
            RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        afterCommit aftercommit = (afterCommit) this.MediaMetadataCompat.remove(str);
        if (aftercommit != null) {
            int i6 = MediaSessionCompatQueueItem + 67;
            RatingCompat = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                aftercommit.RemoteActionCompatParcelizer();
            } else {
                aftercommit.RemoteActionCompatParcelizer();
                throw null;
            }
        }
    }

    public final void serializer(String str) {
        getTransaction gettransaction;
        int i = 2 % 2;
        int i2 = RatingCompat + 17;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        ((getRootInfoui) this.read).serializer(str);
        if (serializer() && (gettransaction = this.write) != null) {
            afterCommit aftercommitRemoteActionCompatParcelizer = gettransaction.RemoteActionCompatParcelizer(str);
            this.MediaMetadataCompat.put(str, aftercommitRemoteActionCompatParcelizer);
            IconCompatParcelizer(new RoomDatabase$createConnectionManager$2(aftercommitRemoteActionCompatParcelizer, 8));
        }
        int i4 = MediaSessionCompatQueueItem + 21;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void IconCompatParcelizer(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        executeAsOneOrNull executeasoneornull;
        int i = 2 % 2;
        int i2 = RatingCompat + 3;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            executeasoneornull = (executeAsOneOrNull) this.serializer.MediaDescriptionCompat.get();
            int i3 = 88 / 0;
            if (executeasoneornull == null) {
                return;
            }
        } else {
            executeasoneornull = (executeAsOneOrNull) this.serializer.MediaDescriptionCompat.get();
            if (executeasoneornull == null) {
                return;
            }
        }
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke("brand", executeasoneornull.IconCompatParcelizer);
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(com.deliveryhero.chatsdk.util.PushNotificationParserObj.COUNTRY_KEY, executeasoneornull.MediaMetadataCompat.serializer);
        r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke("device_class", ModuleDSLKt.read(this.IconCompatParcelizer).toString());
        int i4 = MediaSessionCompatQueueItem + 11;
        RatingCompat = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
    }
}
