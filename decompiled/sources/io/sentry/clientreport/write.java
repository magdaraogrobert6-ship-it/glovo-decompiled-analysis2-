package io.sentry.clientreport;

import java.io.IOException;
import java.util.HashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class write implements RequestPushPermissionStep {
    public final Long IconCompatParcelizer;
    public final String read;
    public final String serializer;
    public HashMap write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("reason");
        okHttpCall$1.IconCompatParcelizer(this.read);
        okHttpCall$1.write("category");
        okHttpCall$1.IconCompatParcelizer(this.serializer);
        okHttpCall$1.write("quantity");
        okHttpCall$1.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        HashMap map = this.write;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.write, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public write(String str, String str2, Long l) {
        this.read = str;
        this.serializer = str2;
        this.IconCompatParcelizer = l;
    }

    public final String toString() {
        return "DiscardedEvent{reason='" + this.read + "', category='" + this.serializer + "', quantity=" + this.IconCompatParcelizer + '}';
    }
}
