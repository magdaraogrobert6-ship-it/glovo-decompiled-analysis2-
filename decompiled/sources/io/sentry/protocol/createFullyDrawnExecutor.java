package io.sentry.protocol;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class createFullyDrawnExecutor implements RequestPushPermissionStep {
    public final String IconCompatParcelizer;
    public HashMap read;
    public final List serializer;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        String str = this.IconCompatParcelizer;
        if (str != null) {
            okHttpCall$1.write("rendering_system");
            okHttpCall$1.IconCompatParcelizer(str);
        }
        List list = this.serializer;
        if (list != null) {
            okHttpCall$1.write("windows");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, list);
        }
        HashMap map = this.read;
        if (map != null) {
            for (String str2 : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.read, str2, okHttpCall$1, str2, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public createFullyDrawnExecutor(String str, List list) {
        this.IconCompatParcelizer = str;
        this.serializer = list;
    }
}
