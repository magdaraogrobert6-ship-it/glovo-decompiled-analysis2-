package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.HashMap;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class handleCardClicklambda2 implements RequestPushPermissionStep {
    public final io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public HashMap write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("event_id");
        this.IconCompatParcelizer.serialize(okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        String str = this.serializer;
        if (str != null) {
            okHttpCall$1.write("name");
            okHttpCall$1.IconCompatParcelizer(str);
        }
        String str2 = this.read;
        if (str2 != null) {
            okHttpCall$1.write("email");
            okHttpCall$1.IconCompatParcelizer(str2);
        }
        String str3 = this.RemoteActionCompatParcelizer;
        if (str3 != null) {
            okHttpCall$1.write("comments");
            okHttpCall$1.IconCompatParcelizer(str3);
        }
        HashMap map = this.write;
        if (map != null) {
            for (String str4 : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.write, str4, okHttpCall$1, str4, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public handleCardClicklambda2(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, String str, String str2, String str3) {
        this.IconCompatParcelizer = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
        this.serializer = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserFeedback{eventId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", name='");
        sb.append(this.serializer);
        sb.append("', email='");
        sb.append(this.read);
        sb.append("', comments='");
        return ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, "'}");
    }
}
