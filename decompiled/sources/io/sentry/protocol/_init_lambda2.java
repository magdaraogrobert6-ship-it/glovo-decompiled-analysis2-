package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class _init_lambda2 implements RequestPushPermissionStep {
    public Long IconCompatParcelizer;
    public r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public Boolean MediaMetadataCompat;
    public String MediaSessionCompatQueueItem;
    public ConcurrentHashMap PlaybackStateCompat;
    public Integer RatingCompat;
    public Map RemoteActionCompatParcelizer;
    public Boolean read;
    public Boolean serializer;
    public Boolean write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("id");
            okHttpCall$1.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        }
        if (this.RatingCompat != null) {
            okHttpCall$1.write(RemoteMessageConst.Notification.PRIORITY);
            okHttpCall$1.RemoteActionCompatParcelizer(this.RatingCompat);
        }
        if (this.MediaSessionCompatQueueItem != null) {
            okHttpCall$1.write("name");
            okHttpCall$1.IconCompatParcelizer(this.MediaSessionCompatQueueItem);
        }
        if (this.MediaDescriptionCompat != null) {
            okHttpCall$1.write("state");
            okHttpCall$1.IconCompatParcelizer(this.MediaDescriptionCompat);
        }
        if (this.write != null) {
            okHttpCall$1.write("crashed");
            okHttpCall$1.serializer(this.write);
        }
        if (this.read != null) {
            okHttpCall$1.write("current");
            okHttpCall$1.serializer(this.read);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("daemon");
            okHttpCall$1.serializer(this.serializer);
        }
        if (this.MediaMetadataCompat != null) {
            okHttpCall$1.write("main");
            okHttpCall$1.serializer(this.MediaMetadataCompat);
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            okHttpCall$1.write("stacktrace");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaBrowserCompatMediaItem);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("held_locks");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RemoteActionCompatParcelizer);
        }
        ConcurrentHashMap concurrentHashMap = this.PlaybackStateCompat;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.PlaybackStateCompat, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
