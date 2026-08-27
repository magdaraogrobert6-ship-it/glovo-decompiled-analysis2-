package io.sentry.rrweb;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.util.HashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackStateCompat extends IconCompatParcelizer implements RequestPushPermissionStep {
    public String serializer;
    public HashMap write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("type");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.PlaybackStateCompat);
        okHttpCall$1.write("timestamp");
        okHttpCall$1.IconCompatParcelizer(this.PlaybackStateCompatCustomAction);
        okHttpCall$1.write(RemoteMessageConst.DATA);
        okHttpCall$1.write();
        okHttpCall$1.write(RemoteMessageConst.Notification.TAG);
        okHttpCall$1.IconCompatParcelizer(this.serializer);
        okHttpCall$1.write("payload");
        okHttpCall$1.write();
        HashMap map = this.write;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                okHttpCall$1.write(str);
                okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, obj);
            }
        }
        okHttpCall$1.RatingCompat();
        okHttpCall$1.RatingCompat();
        okHttpCall$1.RatingCompat();
    }

    public PlaybackStateCompat(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        super(remoteActionCompatParcelizer);
    }
}
