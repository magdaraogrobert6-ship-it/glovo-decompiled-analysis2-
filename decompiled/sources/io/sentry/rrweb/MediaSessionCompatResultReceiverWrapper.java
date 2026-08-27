package io.sentry.rrweb;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatResultReceiverWrapper extends IconCompatParcelizer implements RequestPushPermissionStep {
    public HashMap IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public int read;
    public int serializer;

    public MediaSessionCompatResultReceiverWrapper() {
        super(RemoteActionCompatParcelizer.Meta);
        this.RemoteActionCompatParcelizer = "";
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        read.RemoteActionCompatParcelizer(this, okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        okHttpCall$1.write(RemoteMessageConst.DATA);
        okHttpCall$1.write();
        okHttpCall$1.write("href");
        okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        okHttpCall$1.write("height");
        okHttpCall$1.IconCompatParcelizer(this.serializer);
        okHttpCall$1.write("width");
        okHttpCall$1.IconCompatParcelizer(this.read);
        HashMap map = this.IconCompatParcelizer;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.IconCompatParcelizer, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
        okHttpCall$1.RatingCompat();
    }

    @Override // io.sentry.rrweb.IconCompatParcelizer
    public final int hashCode() {
        int iHashCode = super.hashCode();
        return Arrays.hashCode(new Object[]{Integer.valueOf(iHashCode), this.RemoteActionCompatParcelizer, Integer.valueOf(this.serializer), Integer.valueOf(this.read)});
    }

    @Override // io.sentry.rrweb.IconCompatParcelizer
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaSessionCompatResultReceiverWrapper.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        MediaSessionCompatResultReceiverWrapper mediaSessionCompatResultReceiverWrapper = (MediaSessionCompatResultReceiverWrapper) obj;
        return this.serializer == mediaSessionCompatResultReceiverWrapper.serializer && this.read == mediaSessionCompatResultReceiverWrapper.read && setNativeShader.write(this.RemoteActionCompatParcelizer, mediaSessionCompatResultReceiverWrapper.RemoteActionCompatParcelizer);
    }
}
