package io.sentry.protocol;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw implements RequestPushPermissionStep {
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public HashMap read;

    public final int hashCode() {
        return Objects.hash(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer);
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("name");
        okHttpCall$1.IconCompatParcelizer(this.IconCompatParcelizer);
        okHttpCall$1.write("version");
        okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        HashMap map = this.read;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.read, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw(String str, String str2) {
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw.class != obj.getClass()) {
            return false;
        }
        r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw r8lambdavcwjfxdisgcircy4i008voij_lw = (r8lambdavCwjfXDiSGcirCy4I008VOiJ_lw) obj;
        return Objects.equals(this.IconCompatParcelizer, r8lambdavcwjfxdisgcircy4i008voij_lw.IconCompatParcelizer) && Objects.equals(this.RemoteActionCompatParcelizer, r8lambdavcwjfxdisgcircy4i008voij_lw.RemoteActionCompatParcelizer);
    }
}
