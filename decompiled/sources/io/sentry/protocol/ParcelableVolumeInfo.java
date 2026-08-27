package io.sentry.protocol;

import com.adjust.sdk.Constants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class ParcelableVolumeInfo implements RequestPushPermissionStep {
    public Integer IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public String MediaDescriptionCompat;
    public Boolean MediaMetadataCompat;
    public AbstractMap MediaSessionCompatQueueItem;
    public HashMap PlaybackStateCompat;
    public Integer RatingCompat;
    public String RemoteActionCompatParcelizer;
    public Boolean read;
    public Boolean serializer;
    public ConcurrentHashMap write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.MediaDescriptionCompat != null) {
            okHttpCall$1.write("type");
            okHttpCall$1.IconCompatParcelizer(this.MediaDescriptionCompat);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("description");
            okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            okHttpCall$1.write("help_link");
            okHttpCall$1.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("handled");
            okHttpCall$1.serializer(this.serializer);
        }
        if (this.MediaSessionCompatQueueItem != null) {
            okHttpCall$1.write(Constants.REFERRER_API_META);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.MediaSessionCompatQueueItem);
        }
        if (this.write != null) {
            okHttpCall$1.write(RemoteMessageConst.DATA);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.write);
        }
        if (this.MediaMetadataCompat != null) {
            okHttpCall$1.write("synthetic");
            okHttpCall$1.serializer(this.MediaMetadataCompat);
        }
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("exception_id");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.IconCompatParcelizer);
        }
        if (this.RatingCompat != null) {
            okHttpCall$1.write("parent_id");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RatingCompat);
        }
        if (this.read != null) {
            okHttpCall$1.write("is_exception_group");
            okHttpCall$1.serializer(this.read);
        }
        HashMap map = this.PlaybackStateCompat;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.PlaybackStateCompat, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
