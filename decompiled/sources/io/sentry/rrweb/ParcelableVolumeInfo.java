package io.sentry.rrweb;

import java.io.IOException;
import java.util.HashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class ParcelableVolumeInfo implements RequestPushPermissionStep {
    public HashMap IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public float read;
    public float serializer;
    public long write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("id");
        okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        okHttpCall$1.write("x");
        okHttpCall$1.write(this.serializer);
        okHttpCall$1.write("y");
        okHttpCall$1.write(this.read);
        okHttpCall$1.write("timeOffset");
        okHttpCall$1.IconCompatParcelizer(this.write);
        HashMap map = this.IconCompatParcelizer;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.IconCompatParcelizer, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
