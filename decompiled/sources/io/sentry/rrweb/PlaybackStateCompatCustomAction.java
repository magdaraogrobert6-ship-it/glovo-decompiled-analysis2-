package io.sentry.rrweb;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackStateCompatCustomAction extends IconCompatParcelizer implements RequestPushPermissionStep {
    public double IconCompatParcelizer;
    public String MediaDescriptionCompat;
    public double MediaMetadataCompat;
    public HashMap MediaSessionCompatQueueItem;
    public ConcurrentHashMap RatingCompat;
    public String RemoteActionCompatParcelizer;
    public String read;
    public ConcurrentHashMap serializer;
    public ConcurrentHashMap write;

    public PlaybackStateCompatCustomAction() {
        super(RemoteActionCompatParcelizer.Custom);
        this.MediaDescriptionCompat = "performanceSpan";
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        read.RemoteActionCompatParcelizer(this, okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        okHttpCall$1.write(RemoteMessageConst.DATA);
        okHttpCall$1.write();
        okHttpCall$1.write(RemoteMessageConst.Notification.TAG);
        okHttpCall$1.IconCompatParcelizer(this.MediaDescriptionCompat);
        okHttpCall$1.write("payload");
        okHttpCall$1.write();
        if (this.read != null) {
            okHttpCall$1.write("op");
            okHttpCall$1.IconCompatParcelizer(this.read);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("description");
            okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        okHttpCall$1.write("startTimestamp");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, BigDecimal.valueOf(this.MediaMetadataCompat));
        okHttpCall$1.write("endTimestamp");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, BigDecimal.valueOf(this.IconCompatParcelizer));
        if (this.serializer != null) {
            okHttpCall$1.write(RemoteMessageConst.DATA);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.serializer);
        }
        ConcurrentHashMap concurrentHashMap = this.RatingCompat;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.RatingCompat, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
        ConcurrentHashMap concurrentHashMap2 = this.write;
        if (concurrentHashMap2 != null) {
            for (String str2 : concurrentHashMap2.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.write, str2, okHttpCall$1, str2, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
        HashMap map = this.MediaSessionCompatQueueItem;
        if (map != null) {
            for (String str3 : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem, str3, okHttpCall$1, str3, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
