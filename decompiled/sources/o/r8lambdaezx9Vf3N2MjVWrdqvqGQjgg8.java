package o;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8 implements RequestPushPermissionStep {
    public HashMap IconCompatParcelizer;
    public final List serializer;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("items");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.serializer);
        HashMap map = this.IconCompatParcelizer;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.IconCompatParcelizer, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public r8lambdaezx9Vf3N2MjVWrdqvqGQjgg8(List list) {
        this.serializer = list;
    }
}
