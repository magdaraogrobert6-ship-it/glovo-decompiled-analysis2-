package io.sentry.protocol.profiling;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class write implements RequestPushPermissionStep {
    public ConcurrentHashMap read;
    public List RemoteActionCompatParcelizer = new ArrayList();
    public List write = new ArrayList();
    public List serializer = new ArrayList();
    public Map IconCompatParcelizer = new HashMap();

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("samples");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RemoteActionCompatParcelizer);
        okHttpCall$1.write("stacks");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.write);
        okHttpCall$1.write("frames");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.serializer);
        okHttpCall$1.write("thread_metadata");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.IconCompatParcelizer);
        ConcurrentHashMap concurrentHashMap = this.read;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.read, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
