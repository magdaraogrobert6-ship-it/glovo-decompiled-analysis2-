package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda54BeH8ZsBru0CXI2CCSP2syNys implements RequestPushPermissionStep {
    public String RemoteActionCompatParcelizer;
    public String read;
    public List serializer;
    public ConcurrentHashMap write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.read != null) {
            okHttpCall$1.write("formatted");
            okHttpCall$1.IconCompatParcelizer(this.read);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("message");
            okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        List list = this.serializer;
        if (list != null && !list.isEmpty()) {
            okHttpCall$1.write("params");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.serializer);
        }
        ConcurrentHashMap concurrentHashMap = this.write;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.write, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
