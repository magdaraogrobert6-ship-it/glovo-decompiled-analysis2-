package io.sentry.protocol;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.StepDataCompanion;
import o.UriActionExternalSyntheticLambda4;
import o.isArgString;
import o.r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0;
import o.setNativeShader;
import okio.Options;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public class IconCompatParcelizer implements RequestPushPermissionStep {
    public final ConcurrentHashMap serializer = new ConcurrentHashMap();
    public final io.sentry.util.RemoteActionCompatParcelizer MediaBrowserCompatMediaItem = new io.sentry.util.RemoteActionCompatParcelizer();

    public void IconCompatParcelizer(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
        IconCompatParcelizer(mediaBrowserCompatMediaItem, "flags");
    }

    public Enumeration MediaBrowserCompatMediaItem() {
        return this.serializer.keys();
    }

    public void RemoteActionCompatParcelizer(MediaMetadataCompat mediaMetadataCompat) {
        IconCompatParcelizer(mediaMetadataCompat, "device");
    }

    public void RemoteActionCompatParcelizer(write writeVar) {
        IconCompatParcelizer(writeVar, "browser");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof IconCompatParcelizer)) {
            return false;
        }
        return this.serializer.equals(((IconCompatParcelizer) obj).serializer);
    }

    public final int hashCode() {
        return this.serializer.hashCode();
    }

    public Set read() {
        return this.serializer.entrySet();
    }

    public void read(ResultReceiver resultReceiver) {
        UriActionExternalSyntheticLambda4 uriActionExternalSyntheticLambda4Serializer = this.MediaBrowserCompatMediaItem.serializer();
        try {
            IconCompatParcelizer(resultReceiver, "response");
            uriActionExternalSyntheticLambda4Serializer.close();
        } catch (Throwable th) {
            try {
                uriActionExternalSyntheticLambda4Serializer.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // o.RequestPushPermissionStep
    public void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        ArrayList<String> list = Collections.list(MediaBrowserCompatMediaItem());
        Collections.sort(list);
        for (String str : list) {
            Object obj = read(str);
            if (obj != null) {
                okHttpCall$1.write(str);
                okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, obj);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public void serializer(PlaybackStateCompatCustomAction playbackStateCompatCustomAction) {
        IconCompatParcelizer(playbackStateCompatCustomAction, "gpu");
    }

    public void write(read readVar) {
        IconCompatParcelizer(readVar, "app");
    }

    public void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer == null) {
            return;
        }
        this.serializer.putAll(iconCompatParcelizer.serializer);
    }

    public void RemoteActionCompatParcelizer(r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs r8lambdag6d1iybxwil5aesazxszmvuycqs) {
        IconCompatParcelizer(r8lambdag6d1iybxwil5aesazxszmvuycqs, "runtime");
    }

    public void serializer(_init_lambda1 _init_lambda1Var) {
        IconCompatParcelizer(_init_lambda1Var, "spring");
    }

    public void serializer(r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 r8lambdasv8cpfy2ryceslm1ayxpdavyzp0) {
        setNativeShader.read(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0, "traceContext is required");
        IconCompatParcelizer(r8lambdasv8cpfy2ryceslm1ayxpdavyzp0, "trace");
    }

    public void write(ComponentActivity componentActivity) {
        IconCompatParcelizer(componentActivity, "os");
    }

    public read IconCompatParcelizer() {
        return (read) write(read.class, "app");
    }

    public Object IconCompatParcelizer(Object obj, String str) {
        if (str == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.serializer;
        if (obj == null) {
            return concurrentHashMap.remove(str);
        }
        return concurrentHashMap.put(str, obj);
    }

    public MediaBrowserCompatMediaItem RemoteActionCompatParcelizer() {
        return (MediaBrowserCompatMediaItem) write(MediaBrowserCompatMediaItem.class, "flags");
    }

    public Object read(Object obj) {
        if (obj == null) {
            return null;
        }
        return this.serializer.get(obj);
    }

    public MediaMetadataCompat write() {
        return (MediaMetadataCompat) write(MediaMetadataCompat.class, "device");
    }

    public final Object write(Class cls, String str) {
        Object obj = read(str);
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        return null;
    }

    public boolean write(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.serializer.containsKey(obj);
    }

    public IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        for (Map.Entry entry : iconCompatParcelizer.read()) {
            if (entry != null) {
                Object value = entry.getValue();
                if ("app".equals(entry.getKey()) && (value instanceof read)) {
                    read readVar = (read) value;
                    read readVar2 = new read();
                    readVar2.write = readVar.write;
                    readVar2.RemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer;
                    readVar2.serializer = readVar.serializer;
                    readVar2.IconCompatParcelizer = readVar.IconCompatParcelizer;
                    readVar2.read = readVar.read;
                    readVar2.MediaMetadataCompat = readVar.MediaMetadataCompat;
                    readVar2.RatingCompat = readVar.RatingCompat;
                    readVar2.MediaDescriptionCompat = Options.Companion.RemoteActionCompatParcelizer(readVar.MediaDescriptionCompat);
                    readVar2.MediaSessionCompatQueueItem = readVar.MediaSessionCompatQueueItem;
                    List list = readVar.PlaybackStateCompat;
                    readVar2.PlaybackStateCompat = list != null ? new ArrayList(list) : null;
                    readVar2.ParcelableVolumeInfo = readVar.ParcelableVolumeInfo;
                    readVar2.MediaBrowserCompatMediaItem = readVar.MediaBrowserCompatMediaItem;
                    readVar2.PlaybackStateCompatCustomAction = readVar.PlaybackStateCompatCustomAction;
                    readVar2.MediaSessionCompatToken = Options.Companion.RemoteActionCompatParcelizer(readVar.MediaSessionCompatToken);
                    write(readVar2);
                } else if ("browser".equals(entry.getKey()) && (value instanceof write)) {
                    write writeVar = (write) value;
                    write writeVar2 = new write();
                    writeVar2.read = writeVar.read;
                    writeVar2.serializer = writeVar.serializer;
                    writeVar2.IconCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer(writeVar.IconCompatParcelizer);
                    RemoteActionCompatParcelizer(writeVar2);
                } else if ("device".equals(entry.getKey()) && (value instanceof MediaMetadataCompat)) {
                    MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) value;
                    MediaMetadataCompat mediaMetadataCompat2 = new MediaMetadataCompat();
                    mediaMetadataCompat2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg = mediaMetadataCompat.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
                    mediaMetadataCompat2.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = mediaMetadataCompat.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    mediaMetadataCompat2.RemoteActionCompatParcelizer = mediaMetadataCompat.RemoteActionCompatParcelizer;
                    mediaMetadataCompat2.PlaybackStateCompatCustomAction = mediaMetadataCompat.PlaybackStateCompatCustomAction;
                    mediaMetadataCompat2.ResultReceiver = mediaMetadataCompat.ResultReceiver;
                    mediaMetadataCompat2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = mediaMetadataCompat.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                    mediaMetadataCompat2.MediaSessionCompatQueueItem = mediaMetadataCompat.MediaSessionCompatQueueItem;
                    mediaMetadataCompat2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = mediaMetadataCompat.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    mediaMetadataCompat2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = mediaMetadataCompat.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    mediaMetadataCompat2._init_lambda3 = mediaMetadataCompat._init_lambda3;
                    mediaMetadataCompat2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = mediaMetadataCompat.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                    mediaMetadataCompat2.MediaSessionCompatResultReceiverWrapper = mediaMetadataCompat.MediaSessionCompatResultReceiverWrapper;
                    mediaMetadataCompat2._init_lambda1 = mediaMetadataCompat._init_lambda1;
                    mediaMetadataCompat2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = mediaMetadataCompat.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                    mediaMetadataCompat2.accessensureViewModelStore = mediaMetadataCompat.accessensureViewModelStore;
                    mediaMetadataCompat2.MediaSessionCompatToken = mediaMetadataCompat.MediaSessionCompatToken;
                    mediaMetadataCompat2.PlaybackStateCompat = mediaMetadataCompat.PlaybackStateCompat;
                    mediaMetadataCompat2.MediaBrowserCompatMediaItem = mediaMetadataCompat.MediaBrowserCompatMediaItem;
                    mediaMetadataCompat2.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw = mediaMetadataCompat.r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw;
                    mediaMetadataCompat2.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ = mediaMetadataCompat.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
                    mediaMetadataCompat2.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs = mediaMetadataCompat.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs;
                    mediaMetadataCompat2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = mediaMetadataCompat.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
                    mediaMetadataCompat2.write = mediaMetadataCompat.write;
                    mediaMetadataCompat2.ParcelableVolumeInfo = mediaMetadataCompat.ParcelableVolumeInfo;
                    mediaMetadataCompat2.MediaDescriptionCompat = mediaMetadataCompat.MediaDescriptionCompat;
                    mediaMetadataCompat2.IconCompatParcelizer = mediaMetadataCompat.IconCompatParcelizer;
                    mediaMetadataCompat2.serializer = mediaMetadataCompat.serializer;
                    String[] strArr = mediaMetadataCompat.read;
                    mediaMetadataCompat2.read = strArr != null ? (String[]) strArr.clone() : null;
                    mediaMetadataCompat2.ComponentActivity = mediaMetadataCompat.ComponentActivity;
                    TimeZone timeZone = mediaMetadataCompat._init_lambda4;
                    mediaMetadataCompat2._init_lambda4 = timeZone != null ? (TimeZone) timeZone.clone() : null;
                    mediaMetadataCompat2.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = mediaMetadataCompat.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                    mediaMetadataCompat2.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 = mediaMetadataCompat.r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0;
                    mediaMetadataCompat2.MediaMetadataCompat = mediaMetadataCompat.MediaMetadataCompat;
                    mediaMetadataCompat2.RatingCompat = mediaMetadataCompat.RatingCompat;
                    mediaMetadataCompat2._init_lambda2 = Options.Companion.RemoteActionCompatParcelizer(mediaMetadataCompat._init_lambda2);
                    RemoteActionCompatParcelizer(mediaMetadataCompat2);
                } else if ("os".equals(entry.getKey()) && (value instanceof ComponentActivity)) {
                    ComponentActivity componentActivity = (ComponentActivity) value;
                    ComponentActivity componentActivity2 = new ComponentActivity();
                    componentActivity2.write = componentActivity.write;
                    componentActivity2.MediaBrowserCompatMediaItem = componentActivity.MediaBrowserCompatMediaItem;
                    componentActivity2.serializer = componentActivity.serializer;
                    componentActivity2.IconCompatParcelizer = componentActivity.IconCompatParcelizer;
                    componentActivity2.RemoteActionCompatParcelizer = componentActivity.RemoteActionCompatParcelizer;
                    componentActivity2.read = componentActivity.read;
                    componentActivity2.RatingCompat = Options.Companion.RemoteActionCompatParcelizer(componentActivity.RatingCompat);
                    write(componentActivity2);
                } else if ("runtime".equals(entry.getKey()) && (value instanceof r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs)) {
                    r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs r8lambdag6d1iybxwil5aesazxszmvuycqs = (r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) value;
                    r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs r8lambdag6d1iybxwil5aesazxszmvuycqs2 = new r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs();
                    r8lambdag6d1iybxwil5aesazxszmvuycqs2.RemoteActionCompatParcelizer = r8lambdag6d1iybxwil5aesazxszmvuycqs.RemoteActionCompatParcelizer;
                    r8lambdag6d1iybxwil5aesazxszmvuycqs2.serializer = r8lambdag6d1iybxwil5aesazxszmvuycqs.serializer;
                    r8lambdag6d1iybxwil5aesazxszmvuycqs2.read = r8lambdag6d1iybxwil5aesazxszmvuycqs.read;
                    r8lambdag6d1iybxwil5aesazxszmvuycqs2.write = Options.Companion.RemoteActionCompatParcelizer(r8lambdag6d1iybxwil5aesazxszmvuycqs.write);
                    RemoteActionCompatParcelizer(r8lambdag6d1iybxwil5aesazxszmvuycqs2);
                } else if ("feedback".equals(entry.getKey()) && (value instanceof MediaSessionCompatResultReceiverWrapper)) {
                    MediaSessionCompatResultReceiverWrapper mediaSessionCompatResultReceiverWrapper = (MediaSessionCompatResultReceiverWrapper) value;
                    MediaSessionCompatResultReceiverWrapper mediaSessionCompatResultReceiverWrapper2 = new MediaSessionCompatResultReceiverWrapper();
                    mediaSessionCompatResultReceiverWrapper2.read = mediaSessionCompatResultReceiverWrapper.read;
                    mediaSessionCompatResultReceiverWrapper2.serializer = mediaSessionCompatResultReceiverWrapper.serializer;
                    mediaSessionCompatResultReceiverWrapper2.RemoteActionCompatParcelizer = mediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer;
                    mediaSessionCompatResultReceiverWrapper2.IconCompatParcelizer = mediaSessionCompatResultReceiverWrapper.IconCompatParcelizer;
                    mediaSessionCompatResultReceiverWrapper2.write = mediaSessionCompatResultReceiverWrapper.write;
                    mediaSessionCompatResultReceiverWrapper2.MediaDescriptionCompat = mediaSessionCompatResultReceiverWrapper.MediaDescriptionCompat;
                    mediaSessionCompatResultReceiverWrapper2.MediaMetadataCompat = Options.Companion.RemoteActionCompatParcelizer(mediaSessionCompatResultReceiverWrapper.MediaMetadataCompat);
                    IconCompatParcelizer(mediaSessionCompatResultReceiverWrapper2, "feedback");
                } else if ("gpu".equals(entry.getKey()) && (value instanceof PlaybackStateCompatCustomAction)) {
                    PlaybackStateCompatCustomAction playbackStateCompatCustomAction = (PlaybackStateCompatCustomAction) value;
                    PlaybackStateCompatCustomAction playbackStateCompatCustomAction2 = new PlaybackStateCompatCustomAction();
                    playbackStateCompatCustomAction2.read = playbackStateCompatCustomAction.read;
                    playbackStateCompatCustomAction2.RemoteActionCompatParcelizer = playbackStateCompatCustomAction.RemoteActionCompatParcelizer;
                    playbackStateCompatCustomAction2.RatingCompat = playbackStateCompatCustomAction.RatingCompat;
                    playbackStateCompatCustomAction2.MediaBrowserCompatMediaItem = playbackStateCompatCustomAction.MediaBrowserCompatMediaItem;
                    playbackStateCompatCustomAction2.IconCompatParcelizer = playbackStateCompatCustomAction.IconCompatParcelizer;
                    playbackStateCompatCustomAction2.serializer = playbackStateCompatCustomAction.serializer;
                    playbackStateCompatCustomAction2.write = playbackStateCompatCustomAction.write;
                    playbackStateCompatCustomAction2.MediaSessionCompatQueueItem = playbackStateCompatCustomAction.MediaSessionCompatQueueItem;
                    playbackStateCompatCustomAction2.MediaMetadataCompat = playbackStateCompatCustomAction.MediaMetadataCompat;
                    playbackStateCompatCustomAction2.MediaDescriptionCompat = Options.Companion.RemoteActionCompatParcelizer(playbackStateCompatCustomAction.MediaDescriptionCompat);
                    serializer(playbackStateCompatCustomAction2);
                } else if ("trace".equals(entry.getKey()) && (value instanceof r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0)) {
                    serializer(new r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0((r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0) value));
                } else if ("profile".equals(entry.getKey()) && (value instanceof StepDataCompanion)) {
                    StepDataCompanion stepDataCompanion = (StepDataCompanion) value;
                    StepDataCompanion stepDataCompanion2 = new StepDataCompanion();
                    stepDataCompanion2.write = stepDataCompanion.write;
                    ConcurrentHashMap concurrentHashMapRemoteActionCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer(stepDataCompanion.RemoteActionCompatParcelizer);
                    if (concurrentHashMapRemoteActionCompatParcelizer != null) {
                        stepDataCompanion2.RemoteActionCompatParcelizer = concurrentHashMapRemoteActionCompatParcelizer;
                    }
                    IconCompatParcelizer(stepDataCompanion2, "profile");
                } else if ("response".equals(entry.getKey()) && (value instanceof ResultReceiver)) {
                    ResultReceiver resultReceiver = (ResultReceiver) value;
                    ResultReceiver resultReceiver2 = new ResultReceiver();
                    resultReceiver2.write = resultReceiver.write;
                    resultReceiver2.read = Options.Companion.RemoteActionCompatParcelizer(resultReceiver.read);
                    resultReceiver2.MediaDescriptionCompat = Options.Companion.RemoteActionCompatParcelizer(resultReceiver.MediaDescriptionCompat);
                    resultReceiver2.serializer = resultReceiver.serializer;
                    resultReceiver2.IconCompatParcelizer = resultReceiver.IconCompatParcelizer;
                    resultReceiver2.RemoteActionCompatParcelizer = resultReceiver.RemoteActionCompatParcelizer;
                    read(resultReceiver2);
                } else if ("spring".equals(entry.getKey()) && (value instanceof _init_lambda1)) {
                    serializer(new _init_lambda1((_init_lambda1) value));
                } else {
                    IconCompatParcelizer(value, (String) entry.getKey());
                }
            }
        }
    }

    public ComponentActivity MediaMetadataCompat() {
        return (ComponentActivity) write(ComponentActivity.class, "os");
    }

    public r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0 MediaSessionCompatQueueItem() {
        return (r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0) write(r8lambdaSv8Cpfy2RycESlM1aYxpdAvYzP0.class, "trace");
    }

    public r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs RatingCompat() {
        return (r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs) write(r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.class, "runtime");
    }

    public IconCompatParcelizer() {
    }
}
