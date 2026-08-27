package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class addObserverForBackInvokerlambda0 implements RequestPushPermissionStep {
    public ConcurrentHashMap RemoteActionCompatParcelizer;
    public final String read;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        String str = this.read;
        if (str != null) {
            okHttpCall$1.write("source");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, str);
        }
        ConcurrentHashMap concurrentHashMap = this.RemoteActionCompatParcelizer;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, str2, okHttpCall$1, str2, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public addObserverForBackInvokerlambda0(String str) {
        this.read = str;
    }
}
