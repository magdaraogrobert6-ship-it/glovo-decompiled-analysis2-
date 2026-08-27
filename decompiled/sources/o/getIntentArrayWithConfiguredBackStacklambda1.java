package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import okio.Options;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class getIntentArrayWithConfiguredBackStacklambda1 implements RequestPushPermissionStep, Comparable {
    public ConcurrentHashMap IconCompatParcelizer;
    public Date MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public final Long MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public ConcurrentHashMap RatingCompat;
    public final Long RemoteActionCompatParcelizer;
    public r8lambdaL32xCEzW71g2Xzeh1NM3NImxco read;
    public String serializer;
    public String write;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.RemoteActionCompatParcelizer.compareTo(((getIntentArrayWithConfiguredBackStacklambda1) obj).RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        if (!"http".equals(this.MediaSessionCompatQueueItem)) {
            long time = write().getTime();
            return Arrays.hashCode(new Object[]{Long.valueOf(time), this.serializer, this.MediaSessionCompatQueueItem, this.write, this.MediaDescriptionCompat, this.read});
        }
        long time2 = write().getTime();
        return Arrays.hashCode(new Object[]{Long.valueOf(time2), this.serializer, this.MediaSessionCompatQueueItem, this.write, this.MediaDescriptionCompat, this.read, this.IconCompatParcelizer.get("status_code"), this.IconCompatParcelizer.get("url"), this.IconCompatParcelizer.get("method"), this.IconCompatParcelizer.get("http.fragment"), this.IconCompatParcelizer.get("http.query")});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("timestamp");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, write());
        if (this.serializer != null) {
            okHttpCall$1.write("message");
            okHttpCall$1.IconCompatParcelizer(this.serializer);
        }
        if (this.MediaSessionCompatQueueItem != null) {
            okHttpCall$1.write("type");
            okHttpCall$1.IconCompatParcelizer(this.MediaSessionCompatQueueItem);
        }
        okHttpCall$1.write(RemoteMessageConst.DATA);
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.IconCompatParcelizer);
        if (this.write != null) {
            okHttpCall$1.write("category");
            okHttpCall$1.IconCompatParcelizer(this.write);
        }
        if (this.MediaDescriptionCompat != null) {
            okHttpCall$1.write("origin");
            okHttpCall$1.IconCompatParcelizer(this.MediaDescriptionCompat);
        }
        if (this.read != null) {
            okHttpCall$1.write("level");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.read);
        }
        ConcurrentHashMap concurrentHashMap = this.RatingCompat;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.RatingCompat, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final void read(Object obj, String str) {
        if (str == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = this.IconCompatParcelizer;
        if (obj == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, obj);
        }
    }

    public static boolean IconCompatParcelizer(getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1, getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda2) {
        return getintentarraywithconfiguredbackstacklambda1.write().getTime() == getintentarraywithconfiguredbackstacklambda2.write().getTime() && setNativeShader.write(getintentarraywithconfiguredbackstacklambda1.serializer, getintentarraywithconfiguredbackstacklambda2.serializer) && setNativeShader.write(getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem, getintentarraywithconfiguredbackstacklambda2.MediaSessionCompatQueueItem) && setNativeShader.write(getintentarraywithconfiguredbackstacklambda1.write, getintentarraywithconfiguredbackstacklambda2.write) && setNativeShader.write(getintentarraywithconfiguredbackstacklambda1.MediaDescriptionCompat, getintentarraywithconfiguredbackstacklambda2.MediaDescriptionCompat) && getintentarraywithconfiguredbackstacklambda1.read == getintentarraywithconfiguredbackstacklambda2.read;
    }

    public final Date write() {
        Date date = this.MediaBrowserCompatMediaItem;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l = this.MediaMetadataCompat;
        if (l == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("No timestamp set for breadcrumb");
            return null;
        }
        Date dateIconCompatParcelizer = setNativeShader.IconCompatParcelizer(l.longValue());
        this.MediaBrowserCompatMediaItem = dateIconCompatParcelizer;
        return dateIconCompatParcelizer;
    }

    public getIntentArrayWithConfiguredBackStacklambda1(getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1) {
        this.IconCompatParcelizer = new ConcurrentHashMap();
        this.RemoteActionCompatParcelizer = Long.valueOf(System.nanoTime());
        this.MediaBrowserCompatMediaItem = getintentarraywithconfiguredbackstacklambda1.MediaBrowserCompatMediaItem;
        this.MediaMetadataCompat = getintentarraywithconfiguredbackstacklambda1.MediaMetadataCompat;
        this.serializer = getintentarraywithconfiguredbackstacklambda1.serializer;
        this.MediaSessionCompatQueueItem = getintentarraywithconfiguredbackstacklambda1.MediaSessionCompatQueueItem;
        this.write = getintentarraywithconfiguredbackstacklambda1.write;
        this.MediaDescriptionCompat = getintentarraywithconfiguredbackstacklambda1.MediaDescriptionCompat;
        ConcurrentHashMap concurrentHashMapRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer(getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer);
        if (concurrentHashMapRemoteActionCompatParcelizer != null) {
            this.IconCompatParcelizer = concurrentHashMapRemoteActionCompatParcelizer;
        }
        this.RatingCompat = Options.Companion.RemoteActionCompatParcelizer(getintentarraywithconfiguredbackstacklambda1.RatingCompat);
        this.read = getintentarraywithconfiguredbackstacklambda1.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getIntentArrayWithConfiguredBackStacklambda1.class != obj.getClass()) {
            return false;
        }
        getIntentArrayWithConfiguredBackStacklambda1 getintentarraywithconfiguredbackstacklambda1 = (getIntentArrayWithConfiguredBackStacklambda1) obj;
        if ("http".equals(this.MediaSessionCompatQueueItem)) {
            return IconCompatParcelizer(this, getintentarraywithconfiguredbackstacklambda1) && setNativeShader.write(this.IconCompatParcelizer.get("status_code"), getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("status_code")) && setNativeShader.write(this.IconCompatParcelizer.get("url"), getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("url")) && setNativeShader.write(this.IconCompatParcelizer.get("method"), getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("method")) && setNativeShader.write(this.IconCompatParcelizer.get("http.fragment"), getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("http.fragment")) && setNativeShader.write(this.IconCompatParcelizer.get("http.query"), getintentarraywithconfiguredbackstacklambda1.IconCompatParcelizer.get("http.query"));
        }
        return IconCompatParcelizer(this, getintentarraywithconfiguredbackstacklambda1);
    }

    public getIntentArrayWithConfiguredBackStacklambda1(long j) {
        this.IconCompatParcelizer = new ConcurrentHashMap();
        this.RemoteActionCompatParcelizer = Long.valueOf(System.nanoTime());
        this.MediaMetadataCompat = Long.valueOf(j);
        this.MediaBrowserCompatMediaItem = null;
    }

    public getIntentArrayWithConfiguredBackStacklambda1(Date date) {
        this.IconCompatParcelizer = new ConcurrentHashMap();
        this.RemoteActionCompatParcelizer = Long.valueOf(System.nanoTime());
        this.MediaBrowserCompatMediaItem = date;
        this.MediaMetadataCompat = null;
    }

    public getIntentArrayWithConfiguredBackStacklambda1() {
        this(System.currentTimeMillis());
    }
}
