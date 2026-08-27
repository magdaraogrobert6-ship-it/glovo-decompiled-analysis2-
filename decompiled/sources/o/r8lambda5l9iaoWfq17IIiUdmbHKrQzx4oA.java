package o;

import android.content.Context;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.task.TaskManager;
import com.sentiance.sdk.util.Optional;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(componentName = "StepCountTask")
public class r8lambda5l9iaoWfq17IIiUdmbHKrQzx4oA extends createOrGetDataStorelambda00 implements removeGeofencesRegisteredWithGeofencingClientlambda2 {
    private final parseLonglambda0 IconCompatParcelizer;
    private final populateNotificationBuilderlambda1 MediaDescriptionCompat;
    private final r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs MediaMetadataCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaSessionCompatQueueItem;
    private final readandroid_sdk_base_release RemoteActionCompatParcelizer;
    private final getCooldownEnterSeconds read;
    private final TaskManager serializer;
    private final getAnalyticsEnabledEnterannotations write;

    @Override // o.createOrGetDataStorelambda00
    public final boolean read(Context context) {
        return false;
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean z_() {
        return false;
    }

    public static boolean serializer(r8lambda5l9iaoWfq17IIiUdmbHKrQzx4oA r8lambda5l9iaowfq17iiiudmbhkrqzx4oa, String str) {
        r8lambda5l9iaowfq17iiiudmbhkrqzx4oa.MediaSessionCompatQueueItem.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs r8lambda7d1kk4szdotwipf3xpnkewsbnbs = r8lambda5l9iaowfq17iiiudmbhkrqzx4oa.MediaMetadataCompat;
        r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI r8lambdanpc69wzeqaei66oxsnhlebhusqi = r8lambda7d1kk4szdotwipf3xpnkewsbnbs.read();
        if (jCurrentTimeMillis - (r8lambdanpc69wzeqaei66oxsnhlebhusqi != null ? r8lambdanpc69wzeqaei66oxsnhlebhusqi.RemoteActionCompatParcelizer.longValue() : 0L) < 3600000) {
            return false;
        }
        r8lambda5l9iaowfq17iiiudmbhkrqzx4oa.IconCompatParcelizer.IconCompatParcelizer("Requesting step count with reason: ".concat(str), new Object[0]);
        r8lambda7d1kk4szdotwipf3xpnkewsbnbs.RemoteActionCompatParcelizer((Runnable) null);
        return true;
    }

    public static void write(r8lambda5l9iaoWfq17IIiUdmbHKrQzx4oA r8lambda5l9iaowfq17iiiudmbhkrqzx4oa) {
        r8lambda5l9iaowfq17iiiudmbhkrqzx4oa.serializer.write(r8lambda5l9iaowfq17iiiudmbhkrqzx4oa.RemoteActionCompatParcelizer().MediaMetadataCompat());
    }

    @Override // o.createOrGetDataStorelambda00
    public final accesssetEventPublishercp RemoteActionCompatParcelizer() {
        publishExceptionlambda0 publishexceptionlambda0 = new publishExceptionlambda0();
        this.MediaSessionCompatQueueItem.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI r8lambdanpc69wzeqaei66oxsnhlebhusqi = this.MediaMetadataCompat.read();
        long jMax = Math.max(0L, jCurrentTimeMillis - (r8lambdanpc69wzeqaei66oxsnhlebhusqi != null ? r8lambdanpc69wzeqaei66oxsnhlebhusqi.RemoteActionCompatParcelizer.longValue() : 0L));
        publishexceptionlambda0.IconCompatParcelizer(jMax <= 3600000 ? 3600000 - jMax : 3600000L);
        publishexceptionlambda0.write(false);
        publishexceptionlambda0.write("StepCount");
        return publishexceptionlambda0.RemoteActionCompatParcelizer();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        HashMap map = new HashMap();
        Optional<getCooldownEnterSeconds.read> optionalIconCompatParcelizer = this.read.IconCompatParcelizer(r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI.class, (Long) null);
        if (optionalIconCompatParcelizer.IconCompatParcelizer()) {
            r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.serializer(optionalIconCompatParcelizer.write(), map, r8lambdaNpc69WZEQAEI66OXsnhLEbhuSqI.class);
        }
        return map;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        readandroid_sdk_base_release readandroid_sdk_base_releaseVar = this.RemoteActionCompatParcelizer;
        migrateContentCardsStorageToJsonlambda3 migratecontentcardsstoragetojsonlambda3 = new migrateContentCardsStorageToJsonlambda3(this, readandroid_sdk_base_releaseVar);
        getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations = this.write;
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(addBannerViewMonitor.class, migratecontentcardsstoragetojsonlambda3);
        getanalyticsenabledenterannotations.RemoteActionCompatParcelizer(invokeSuspendlambda0.class, new r8lambdaHnX214h7_lyGveMU9FZNlxYYzGs(this, readandroid_sdk_base_releaseVar, this.MediaDescriptionCompat));
    }

    public r8lambda5l9iaoWfq17IIiUdmbHKrQzx4oA(getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, getCooldownEnterSeconds getcooldownenterseconds, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, TaskManager taskManager, r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs r8lambda7d1kk4szdotwipf3xpnkewsbnbs, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, parseLonglambda0 parselonglambda0, populateNotificationBuilderlambda1 populatenotificationbuilderlambda1) {
        this.write = getanalyticsenabledenterannotations;
        this.read = getcooldownenterseconds;
        this.RemoteActionCompatParcelizer = readandroid_sdk_base_releaseVar;
        this.serializer = taskManager;
        this.MediaMetadataCompat = r8lambda7d1kk4szdotwipf3xpnkewsbnbs;
        this.MediaSessionCompatQueueItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.IconCompatParcelizer = parselonglambda0;
        this.MediaDescriptionCompat = populatenotificationbuilderlambda1;
    }

    public static void serializer(r8lambda5l9iaoWfq17IIiUdmbHKrQzx4oA r8lambda5l9iaowfq17iiiudmbhkrqzx4oa) {
        r8lambda5l9iaowfq17iiiudmbhkrqzx4oa.serializer.read((createOrGetDataStorelambda00) r8lambda5l9iaowfq17iiiudmbhkrqzx4oa, false);
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.serializer.write(RemoteActionCompatParcelizer().MediaMetadataCompat());
    }

    @Override // o.createOrGetDataStorelambda00
    public final boolean RemoteActionCompatParcelizer(Context context, createOrGetDataStorelambda010 createorgetdatastorelambda010) {
        r8lambda7d1kk4SZdOTwipf3xPnkEWSbNBs r8lambda7d1kk4szdotwipf3xpnkewsbnbs = this.MediaMetadataCompat;
        if (r8lambda7d1kk4szdotwipf3xpnkewsbnbs.write()) {
            this.IconCompatParcelizer.IconCompatParcelizer("Requesting step count with reason: task invoked", new Object[0]);
            r8lambda7d1kk4szdotwipf3xpnkewsbnbs.RemoteActionCompatParcelizer(new DataStoreProvider(this));
            return false;
        }
        serializer(false);
        return false;
    }
}
