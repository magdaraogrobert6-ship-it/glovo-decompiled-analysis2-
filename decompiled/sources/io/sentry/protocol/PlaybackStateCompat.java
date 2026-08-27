package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackStateCompat implements RequestPushPermissionStep {
    public final String RemoteActionCompatParcelizer;
    public final Number read;
    public ConcurrentHashMap write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("value");
        okHttpCall$1.RemoteActionCompatParcelizer(this.read);
        String str = this.RemoteActionCompatParcelizer;
        if (str != null) {
            okHttpCall$1.write("unit");
            okHttpCall$1.IconCompatParcelizer(str);
        }
        ConcurrentHashMap concurrentHashMap = this.write;
        if (concurrentHashMap != null) {
            for (String str2 : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.write, str2, okHttpCall$1, str2, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public PlaybackStateCompat(String str, Number number) {
        this.read = number;
        this.RemoteActionCompatParcelizer = str;
    }
}
