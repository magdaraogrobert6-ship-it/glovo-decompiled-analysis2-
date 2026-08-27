package o;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I implements RequestPushPermissionStep {
    public final List IconCompatParcelizer;
    public HashMap serializer;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("items");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.IconCompatParcelizer);
        HashMap map = this.serializer;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.serializer, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public r8lambdaPr0ZOhNGrdffbcGPp9OwzbUm0I(List list) {
        this.IconCompatParcelizer = list;
    }
}
