package o;

import android.annotation.SuppressLint;
import android.util.Log;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.wg$$ExternalSyntheticLambda0;
import com.sentiance.sdk.InjectUsing;
import com.sentiance.sdk.SdkException;
import com.sentiance.sdk.events.ControlMessage;
import com.sentiance.sdk.ondevicecommon.TFLiteException;
import com.sentiance.sdk.ondevicecommon.TfliteModelWrapper$ModelCrashCallback$ModelCrashResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.CRC32;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
@InjectUsing(cacheName = "model-manager", componentName = "ModelManager")
public class r8lambdapgvIkXjjYQob29qCPGjcmb0xlX8 extends populatePushStoryPagelambda0 implements removeGeofencesRegisteredWithGeofencingClientlambda2, r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q {
    private final com.sentiance.sdk.util.c IconCompatParcelizer;
    private final r8lambdaLnKUwFcTXyyCsnNZGD04zGjVSqI MediaDescriptionCompat;
    private final getCooldownEnterSeconds MediaMetadataCompat;
    private final r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI MediaSessionCompatQueueItem;
    private final handlePushNotificationPayloadlambda1 MediaSessionCompatResultReceiverWrapper;
    private final GooglePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList2 MediaSessionCompatToken;
    private final r8lambdabN9HswhPMLemG79xDUvP7RXTVBE ParcelableVolumeInfo;
    private final getVerticalAccuracy RatingCompat;
    private final r8lambdavChuWV1WD0ZC8VIhOWyylSzXnA RemoteActionCompatParcelizer;
    private final readandroid_sdk_base_release read;
    private final getAnalyticsEnabledEnterannotations serializer;
    private final parseLonglambda0 write;
    private boolean PlaybackStateCompatCustomAction = false;
    private final migrateTriggersReeligibilityToJsonlambda1<Set<String>> MediaBrowserCompatMediaItem = new r8lambdanb9KzOjEMuBjWi3FJjdDG0zoy1M(this);
    private final migrateTriggersReeligibilityToJsonlambda1<String> PlaybackStateCompat = new r8lambdapaAiO_4wjQAwQBJ6zVuUXWM1cE(this);

    private void read() {
        synchronized (this) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = this.MediaBrowserCompatMediaItem.read().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            this.IconCompatParcelizer.RemoteActionCompatParcelizer("key_blocked_models", jSONArray.toString());
        }
    }

    private boolean read(populatePushStoryPage populatepushstorypage) {
        boolean zContains;
        synchronized (this) {
            zContains = this.MediaBrowserCompatMediaItem.read().contains(populatepushstorypage.serializer());
        }
        return zContains;
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final Map<Class<? extends r8lambdaNClnUmOHj3W_epRKCJ4qJg7b2k>, Long> getRequiredEvents() {
        return null;
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final List<File> getStoredFiles() {
        return Collections.EMPTY_LIST;
    }

    public final void serializer() {
        synchronized (this) {
            if (!this.PlaybackStateCompat.read().equals(this.IconCompatParcelizer.write("consolidation_hash", "")) && !this.PlaybackStateCompatCustomAction && this.MediaSessionCompatResultReceiverWrapper.serializer()) {
                this.PlaybackStateCompatCustomAction = true;
                HashSet hashSet = new HashSet(this.RemoteActionCompatParcelizer.write());
                IconCompatParcelizer();
                RemoteActionCompatParcelizer();
                HashSet hashSet2 = new HashSet(this.RemoteActionCompatParcelizer.write());
                if (hashSet.size() != hashSet2.size() || !hashSet.containsAll(hashSet2)) {
                    this.serializer.IconCompatParcelizer(ControlMessage.ONDEVICE_MODEL_UPDATED, (Object) null);
                }
                this.IconCompatParcelizer.RemoteActionCompatParcelizer("consolidation_hash", this.PlaybackStateCompat.read());
                this.PlaybackStateCompatCustomAction = false;
            }
        }
    }

    public static String RemoteActionCompatParcelizer(r8lambdapgvIkXjjYQob29qCPGjcmb0xlX8 r8lambdapgvikxjjyqob29qcpgjcmb0xlx8) throws Throwable {
        ArrayList arrayListSerializer = r8lambdapgvikxjjyqob29qcpgjcmb0xlx8.RemoteActionCompatParcelizer.serializer();
        Collections.sort(arrayListSerializer, new wg$$ExternalSyntheticLambda0(27));
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayListSerializer.iterator();
        while (it.hasNext()) {
            sb.append(((populatePushStoryPage) it.next()).serializer());
        }
        Iterator<r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA> it2 = r8lambdapgvikxjjyqob29qcpgjcmb0xlx8.MediaDescriptionCompat.write().read().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().MediaMetadataCompat());
        }
        r8lambdapgvikxjjyqob29qcpgjcmb0xlx8.MediaSessionCompatToken.getClass();
        sb.append("6.27.1");
        CRC32 crc32 = new CRC32();
        crc32.update(sb.toString().getBytes());
        return Long.toHexString(crc32.getValue());
    }

    @SuppressLint
    public final void IconCompatParcelizer() {
        for (r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA r8lambdazar1jdaanwnnkjpt4lyd9nkrga : this.MediaDescriptionCompat.write().read()) {
            populatePushStoryPage populatepushstorypageWrite = this.RemoteActionCompatParcelizer.write(r8lambdazar1jdaanwnnkjpt4lyd9nkrga.MediaMetadataCompat());
            populatePushStoryPage populatepushstorypageIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(r8lambdazar1jdaanwnnkjpt4lyd9nkrga.MediaMetadataCompat());
            if (populatepushstorypageIconCompatParcelizer != null) {
                synchronized (this) {
                    if (read(populatepushstorypageIconCompatParcelizer)) {
                        this.write.IconCompatParcelizer("Unblocking model: ".concat(populatepushstorypageIconCompatParcelizer.serializer()), new Object[0]);
                        String strSerializer = populatepushstorypageIconCompatParcelizer.serializer();
                        synchronized (this) {
                            boolean zRemove = this.MediaBrowserCompatMediaItem.read().remove(strSerializer);
                            if (zRemove) {
                                read();
                            }
                        }
                    }
                }
                if (!r8lambdazar1jdaanwnnkjpt4lyd9nkrga.RemoteActionCompatParcelizer(populatepushstorypageIconCompatParcelizer)) {
                    String strM = ff$$ExternalSyntheticOutline0.m("Bundled model for ", r8lambdazar1jdaanwnnkjpt4lyd9nkrga.MediaMetadataCompat(), " is incompatible.");
                    this.write.RemoteActionCompatParcelizer(strM, new Object[0]);
                    this.MediaMetadataCompat.IconCompatParcelizer(this.RatingCompat.serializer(new SdkException(strM)));
                } else if (populatepushstorypageWrite == null) {
                    this.write.IconCompatParcelizer("Copying model %s to active dir", populatepushstorypageIconCompatParcelizer.serializer());
                    this.RemoteActionCompatParcelizer.IconCompatParcelizer(populatepushstorypageIconCompatParcelizer.RemoteActionCompatParcelizer());
                } else if (!r8lambdazar1jdaanwnnkjpt4lyd9nkrga.RemoteActionCompatParcelizer(populatepushstorypageWrite) || populatepushstorypageIconCompatParcelizer.IconCompatParcelizer() > populatepushstorypageWrite.IconCompatParcelizer() || (populatepushstorypageIconCompatParcelizer.IconCompatParcelizer() == populatepushstorypageWrite.IconCompatParcelizer() && populatepushstorypageIconCompatParcelizer.write() > populatepushstorypageWrite.write())) {
                    boolean zRemoteActionCompatParcelizer = r8lambdazar1jdaanwnnkjpt4lyd9nkrga.RemoteActionCompatParcelizer(populatepushstorypageWrite);
                    r8lambdavChuWV1WD0ZC8VIhOWyylSzXnA r8lambdavchuwv1wd0zc8vihowyylszxna = this.RemoteActionCompatParcelizer;
                    this.write.IconCompatParcelizer("Replacing active model %s with bundled model %s", populatepushstorypageWrite.serializer(), populatepushstorypageIconCompatParcelizer.serializer());
                    if (populatepushstorypageWrite.MediaSessionCompatQueueItem().equals(populatepushstorypageIconCompatParcelizer.MediaSessionCompatQueueItem()) && r8lambdavchuwv1wd0zc8vihowyylszxna.IconCompatParcelizer(populatepushstorypageIconCompatParcelizer.RemoteActionCompatParcelizer())) {
                        r8lambdavchuwv1wd0zc8vihowyylszxna.write(populatepushstorypageWrite);
                        if (!zRemoteActionCompatParcelizer) {
                            r8lambdazar1jdaanwnnkjpt4lyd9nkrga.ComponentActivity();
                        }
                    }
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        Iterator<r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA> it = this.MediaDescriptionCompat.write().read().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().MediaMetadataCompat());
        }
        for (populatePushStoryPage populatepushstorypage : (ArrayList) write()) {
            if (!arrayList.contains(populatepushstorypage.MediaSessionCompatQueueItem())) {
                this.RemoteActionCompatParcelizer.write(populatepushstorypage);
            }
        }
    }

    @Override // o.r8lambda9t5RqBXIYZsWjwkuj3tyQ12MQ_Q
    public final void clearData() {
        this.IconCompatParcelizer.read();
        this.MediaBrowserCompatMediaItem.write();
        this.PlaybackStateCompat.write();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void onKillswitchActivated() {
        this.MediaBrowserCompatMediaItem.write();
        this.PlaybackStateCompat.write();
    }

    @Override // o.removeGeofencesRegisteredWithGeofencingClientlambda2
    public final void subscribe() {
        this.serializer.RemoteActionCompatParcelizer(addBannerViewMonitor.class, new r8lambdakdmLpxinO9XoiQ5ydQdq2b7EcLc(this, this.read));
    }

    @Override // o.populatePushStoryPagelambda0
    public final List<populatePushStoryPage> write() {
        if (!this.MediaSessionCompatResultReceiverWrapper.serializer()) {
            return new ArrayList();
        }
        serializer();
        return this.RemoteActionCompatParcelizer.write();
    }

    public r8lambdapgvIkXjjYQob29qCPGjcmb0xlX8(com.sentiance.sdk.util.c cVar, parseLonglambda0 parselonglambda0, readandroid_sdk_base_release readandroid_sdk_base_releaseVar, getAnalyticsEnabledEnterannotations getanalyticsenabledenterannotations, r8lambdavChuWV1WD0ZC8VIhOWyylSzXnA r8lambdavchuwv1wd0zc8vihowyylszxna, getVerticalAccuracy getverticalaccuracy, getCooldownEnterSeconds getcooldownenterseconds, r8lambdaQv3gcJxzUxdig5g76qjUZxGjNI r8lambdaqv3gcjxzuxdig5g76qjuzxgjni, r8lambdabN9HswhPMLemG79xDUvP7RXTVBE r8lambdabn9hswhpmlemg79xduvp7rxtvbe, r8lambdaLnKUwFcTXyyCsnNZGD04zGjVSqI r8lambdalnkuwfctxyycsnnzgd04zgjvsqi, handlePushNotificationPayloadlambda1 handlepushnotificationpayloadlambda1, GooglePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList2 googlePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList2) {
        this.IconCompatParcelizer = cVar;
        this.write = parselonglambda0;
        this.read = readandroid_sdk_base_releaseVar;
        this.serializer = getanalyticsenabledenterannotations;
        this.RemoteActionCompatParcelizer = r8lambdavchuwv1wd0zc8vihowyylszxna;
        this.RatingCompat = getverticalaccuracy;
        this.MediaMetadataCompat = getcooldownenterseconds;
        this.MediaSessionCompatQueueItem = r8lambdaqv3gcjxzuxdig5g76qjuzxgjni;
        this.ParcelableVolumeInfo = r8lambdabn9hswhpmlemg79xduvp7rxtvbe;
        this.MediaDescriptionCompat = r8lambdalnkuwfctxyycsnnzgd04zgjvsqi;
        this.MediaSessionCompatResultReceiverWrapper = handlepushnotificationpayloadlambda1;
        this.MediaSessionCompatToken = googlePlayLocationUtilsremoveGeofencesFromLocalStorageinlinedwriteList2;
    }

    public final TfliteModelWrapper$ModelCrashCallback$ModelCrashResult RemoteActionCompatParcelizer(r8lambdaZAr1jdaanWnNKJpT4LYd9nkRgA<?, ?> r8lambdazar1jdaanwnnkjpt4lyd9nkrga, populatePushStoryPage populatepushstorypage, TFLiteException tFLiteException, boolean z) {
        boolean zAdd;
        populatePushStoryPage populatepushstorypageIconCompatParcelizer;
        String stackTraceString = Log.getStackTraceString(tFLiteException);
        getVerticalAccuracy getverticalaccuracy = this.RatingCompat;
        this.MediaSessionCompatQueueItem.getClass();
        this.MediaMetadataCompat.IconCompatParcelizer(getverticalaccuracy.serializer(System.currentTimeMillis(), stackTraceString));
        r8lambdabN9HswhPMLemG79xDUvP7RXTVBE r8lambdabn9hswhpmlemg79xduvp7rxtvbe = this.ParcelableVolumeInfo;
        this.MediaSessionCompatQueueItem.getClass();
        if (!r8lambdabn9hswhpmlemg79xduvp7rxtvbe.serializer(populatepushstorypage, System.currentTimeMillis()) && !z) {
            return TfliteModelWrapper$ModelCrashCallback$ModelCrashResult.MODEL_NOT_REPLACED;
        }
        this.RemoteActionCompatParcelizer.write(populatepushstorypage);
        this.ParcelableVolumeInfo.RemoteActionCompatParcelizer(populatepushstorypage);
        this.write.IconCompatParcelizer("Blocking model: ".concat(populatepushstorypage.serializer()), new Object[0]);
        String strSerializer = populatepushstorypage.serializer();
        synchronized (this) {
            zAdd = this.MediaBrowserCompatMediaItem.read().add(strSerializer);
        }
        if (zAdd) {
            read();
        }
        String strMediaMetadataCompat = r8lambdazar1jdaanwnnkjpt4lyd9nkrga.MediaMetadataCompat();
        if (this.MediaSessionCompatResultReceiverWrapper.serializer()) {
            serializer();
            populatepushstorypageIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer(strMediaMetadataCompat);
        } else {
            populatepushstorypageIconCompatParcelizer = null;
        }
        if (populatepushstorypageIconCompatParcelizer == null || read(populatepushstorypageIconCompatParcelizer)) {
            return TfliteModelWrapper$ModelCrashCallback$ModelCrashResult.UNLOAD_MODEL;
        }
        this.write.IconCompatParcelizer("Copying model %s to active dir", populatepushstorypageIconCompatParcelizer.serializer());
        if (!this.RemoteActionCompatParcelizer.IconCompatParcelizer(populatepushstorypageIconCompatParcelizer.RemoteActionCompatParcelizer())) {
            return TfliteModelWrapper$ModelCrashCallback$ModelCrashResult.UNLOAD_MODEL;
        }
        this.serializer.IconCompatParcelizer(ControlMessage.ONDEVICE_MODEL_UPDATED, (Object) null);
        return TfliteModelWrapper$ModelCrashCallback$ModelCrashResult.MODEL_REPLACED;
    }

    public final populatePushStoryPage IconCompatParcelizer(String str) {
        if (!this.MediaSessionCompatResultReceiverWrapper.serializer()) {
            return null;
        }
        serializer();
        return this.RemoteActionCompatParcelizer.write(str);
    }

    public static HashSet write(r8lambdapgvIkXjjYQob29qCPGjcmb0xlX8 r8lambdapgvikxjjyqob29qcpgjcmb0xlx8) {
        HashSet hashSet = new HashSet();
        String strWrite = r8lambdapgvikxjjyqob29qcpgjcmb0xlx8.IconCompatParcelizer.write("key_blocked_models", (String) null);
        if (strWrite == null) {
            return hashSet;
        }
        try {
            JSONArray jSONArray = new JSONArray(strWrite);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String str = (String) jSONArray.get(i);
                if (str != null) {
                    arrayList.add(str);
                }
            }
            return new HashSet(arrayList);
        } catch (JSONException e) {
            r8lambdapgvikxjjyqob29qcpgjcmb0xlx8.write.IconCompatParcelizer(false, e, "Failed to load blocked models from cache", new Object[0]);
            return hashSet;
        }
    }
}
