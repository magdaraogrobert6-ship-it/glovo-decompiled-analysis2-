package io.sentry.protocol.profiling;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.util.HashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class read implements RequestPushPermissionStep {
    public int read;
    public HashMap serializer;
    public String write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.write != null) {
            okHttpCall$1.write("name");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.write);
        }
        okHttpCall$1.write(RemoteMessageConst.Notification.PRIORITY);
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, Integer.valueOf(this.read));
        HashMap map = this.serializer;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.serializer, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
