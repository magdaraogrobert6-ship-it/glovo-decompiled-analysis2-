package o;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class setOnDismissCallback implements RequestPushPermissionStep {
    public final io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 IconCompatParcelizer;
    public HashMap RemoteActionCompatParcelizer;
    public final r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU read;
    public Date serializer;
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = this.write;
        if (r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg != null) {
            okHttpCall$1.write("event_id");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg);
        }
        io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 = this.IconCompatParcelizer;
        if (r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 != null) {
            okHttpCall$1.write("sdk");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, r8lambdaxj9c8vip9dfevatmzt0ejauc4a4);
        }
        r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU r8lambdazwumnezi8cq9pp6w1bgke7nfwtu = this.read;
        if (r8lambdazwumnezi8cq9pp6w1bgke7nfwtu != null) {
            okHttpCall$1.write("trace");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, r8lambdazwumnezi8cq9pp6w1bgke7nfwtu);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("sent_at");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, setNativeShader.serializer(this.serializer));
        }
        HashMap map = this.RemoteActionCompatParcelizer;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public setOnDismissCallback(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, io.sentry.protocol.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4, r8lambdazwUmNEzI8Cq9Pp6w1BGkE7NFWtU r8lambdazwumnezi8cq9pp6w1bgke7nfwtu) {
        this.write = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        this.IconCompatParcelizer = r8lambdaxj9c8vip9dfevatmzt0ejauc4a4;
        this.read = r8lambdazwumnezi8cq9pp6w1bgke7nfwtu;
    }
}
