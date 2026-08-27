package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatToken implements RequestPushPermissionStep {
    public ConcurrentHashMap IconCompatParcelizer;
    public String RemoteActionCompatParcelizer;
    public String read;
    public String serializer;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.serializer != null) {
            okHttpCall$1.write("city");
            okHttpCall$1.IconCompatParcelizer(this.serializer);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("country_code");
            okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        if (this.read != null) {
            okHttpCall$1.write("region");
            okHttpCall$1.IconCompatParcelizer(this.read);
        }
        ConcurrentHashMap concurrentHashMap = this.IconCompatParcelizer;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.IconCompatParcelizer, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
