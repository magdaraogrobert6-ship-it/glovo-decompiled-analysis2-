package io.sentry.protocol;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import o.BannerViewcreateBannerWebViewClientListener1;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 implements RequestPushPermissionStep {
    public String IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public HashMap read;
    public CopyOnWriteArraySet serializer;
    public CopyOnWriteArraySet write;

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String serializer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.RemoteActionCompatParcelizer, this.IconCompatParcelizer});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("name");
        okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        okHttpCall$1.write("version");
        okHttpCall$1.IconCompatParcelizer(this.IconCompatParcelizer);
        CopyOnWriteArraySet copyOnWriteArraySet = this.write;
        if (copyOnWriteArraySet == null) {
            copyOnWriteArraySet = BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().MediaDescriptionCompat;
        }
        CopyOnWriteArraySet copyOnWriteArraySet2 = this.serializer;
        if (copyOnWriteArraySet2 == null) {
            copyOnWriteArraySet2 = BannerViewcreateBannerWebViewClientListener1.RemoteActionCompatParcelizer().write;
        }
        if (!copyOnWriteArraySet.isEmpty()) {
            okHttpCall$1.write("packages");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, copyOnWriteArraySet);
        }
        if (!copyOnWriteArraySet2.isEmpty()) {
            okHttpCall$1.write("integrations");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, copyOnWriteArraySet2);
        }
        HashMap map = this.read;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.read, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4(String str, String str2) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.class != obj.getClass()) {
            return false;
        }
        r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 r8lambdaxj9c8vip9dfevatmzt0ejauc4a4 = (r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) obj;
        return this.RemoteActionCompatParcelizer.equals(r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.RemoteActionCompatParcelizer) && this.IconCompatParcelizer.equals(r8lambdaxj9c8vip9dfevatmzt0ejauc4a4.IconCompatParcelizer);
    }
}
