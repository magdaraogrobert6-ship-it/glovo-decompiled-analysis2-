package io.sentry.rrweb;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.accessgetTvInputcp;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatToken extends MediaDescriptionCompat implements RequestPushPermissionStep {
    public List IconCompatParcelizer;
    public HashMap read;
    public int serializer;
    public HashMap write;

    public MediaSessionCompatToken() {
        super(MediaMetadataCompat.TouchMove);
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        read.RemoteActionCompatParcelizer(this, okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        okHttpCall$1.write(RemoteMessageConst.DATA);
        okHttpCall$1.write();
        accessgetTvInputcp.write(this, okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        List list = this.IconCompatParcelizer;
        if (list != null && !list.isEmpty()) {
            okHttpCall$1.write("positions");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.IconCompatParcelizer);
        }
        okHttpCall$1.write("pointerId");
        okHttpCall$1.IconCompatParcelizer(this.serializer);
        HashMap map = this.read;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.read, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
        HashMap map2 = this.write;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.write, str2, okHttpCall$1, str2, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
