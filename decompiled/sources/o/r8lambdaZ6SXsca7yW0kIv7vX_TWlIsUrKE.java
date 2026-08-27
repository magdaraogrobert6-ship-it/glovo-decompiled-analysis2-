package o;

import java.io.IOException;
import java.util.HashMap;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE implements RequestPushPermissionStep {
    public HashMap IconCompatParcelizer;
    public final Object serializer;
    public final String write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("type");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.write);
        okHttpCall$1.write("value");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.serializer);
        HashMap map = this.IconCompatParcelizer;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.IconCompatParcelizer, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(String str, Object obj) {
        this.write = str;
        if (obj == null || !str.equals("string")) {
            this.serializer = obj;
        } else {
            this.serializer = obj.toString();
        }
    }

    public r8lambdaZ6SXsca7yW0kIv7vX_TWlIsUrKE(performDismissTeardownlambda1 performdismissteardownlambda1, Object obj) {
        this(performdismissteardownlambda1.apiName(), obj);
    }
}
