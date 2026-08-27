package o;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class BannerDismissSnapshot implements RequestPushPermissionStep {
    public Integer IconCompatParcelizer;
    public HashMap read;
    public List write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.IconCompatParcelizer, this.write});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        io.sentry.vendor.gson.stream.write writeVar = (io.sentry.vendor.gson.stream.write) okHttpCall$1.write;
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("segment_id");
            okHttpCall$1.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        }
        HashMap map = this.read;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.read, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
        writeVar.RemoteActionCompatParcelizer = true;
        if (this.IconCompatParcelizer != null) {
            writeVar.IconCompatParcelizer();
            writeVar.serializer();
            writeVar.serializer.append((CharSequence) "\n");
        }
        List list = this.write;
        if (list != null) {
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, list);
        }
        writeVar.RemoteActionCompatParcelizer = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BannerDismissSnapshot.class != obj.getClass()) {
            return false;
        }
        BannerDismissSnapshot bannerDismissSnapshot = (BannerDismissSnapshot) obj;
        return setNativeShader.write((Object) this.IconCompatParcelizer, (Object) bannerDismissSnapshot.IconCompatParcelizer) && setNativeShader.write(this.write, bannerDismissSnapshot.write);
    }
}
