package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 implements RequestPushPermissionStep {
    public _init_lambda3 IconCompatParcelizer;
    public AbstractMap RemoteActionCompatParcelizer;
    public List read;
    public Boolean serializer;
    public ConcurrentHashMap write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.read != null) {
            okHttpCall$1.write("frames");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.read);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("registers");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RemoteActionCompatParcelizer);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("snapshot");
            okHttpCall$1.serializer(this.serializer);
        }
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("instruction_addr_adjustment");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.IconCompatParcelizer);
        }
        ConcurrentHashMap concurrentHashMap = this.write;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.write, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0(List list) {
        this.read = list;
    }

    public r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0() {
    }
}
