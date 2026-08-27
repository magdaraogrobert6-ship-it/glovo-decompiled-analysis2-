package io.sentry.rrweb;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.util.HashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.accessgetTvInputcp;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaBrowserCompatMediaItem extends MediaDescriptionCompat implements RequestPushPermissionStep {
    public int IconCompatParcelizer;
    public float MediaBrowserCompatMediaItem;
    public float MediaDescriptionCompat;
    public HashMap MediaSessionCompatQueueItem;
    public int RatingCompat;
    public HashMap read;
    public MediaSessionCompatQueueItem serializer;
    public int write;

    public MediaBrowserCompatMediaItem() {
        super(MediaMetadataCompat.MouseInteraction);
        this.RatingCompat = 2;
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        read.RemoteActionCompatParcelizer(this, okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        okHttpCall$1.write(RemoteMessageConst.DATA);
        okHttpCall$1.write();
        accessgetTvInputcp.write(this, okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        okHttpCall$1.write("type");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.serializer);
        okHttpCall$1.write("id");
        okHttpCall$1.IconCompatParcelizer(this.IconCompatParcelizer);
        okHttpCall$1.write("x");
        okHttpCall$1.write(this.MediaDescriptionCompat);
        okHttpCall$1.write("y");
        okHttpCall$1.write(this.MediaBrowserCompatMediaItem);
        okHttpCall$1.write("pointerType");
        okHttpCall$1.IconCompatParcelizer(this.RatingCompat);
        okHttpCall$1.write("pointerId");
        okHttpCall$1.IconCompatParcelizer(this.write);
        HashMap map = this.read;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.read, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
        HashMap map2 = this.MediaSessionCompatQueueItem;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, str2, okHttpCall$1, str2, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
