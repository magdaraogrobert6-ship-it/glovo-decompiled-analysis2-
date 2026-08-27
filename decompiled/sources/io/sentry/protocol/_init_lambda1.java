package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import okio.Options;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class _init_lambda1 implements RequestPushPermissionStep {
    public ConcurrentHashMap IconCompatParcelizer;
    public String[] serializer;

    public final int hashCode() {
        return Arrays.hashCode(this.serializer);
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.serializer != null) {
            okHttpCall$1.write("active_profiles");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.serializer);
        }
        ConcurrentHashMap concurrentHashMap = this.IconCompatParcelizer;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public _init_lambda1(_init_lambda1 _init_lambda1Var) {
        this.serializer = _init_lambda1Var.serializer;
        this.IconCompatParcelizer = Options.Companion.RemoteActionCompatParcelizer(_init_lambda1Var.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || _init_lambda1.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.serializer, ((_init_lambda1) obj).serializer);
    }

    public _init_lambda1() {
    }
}
