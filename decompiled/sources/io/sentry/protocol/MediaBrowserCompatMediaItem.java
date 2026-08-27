package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaBrowserCompatMediaItem implements RequestPushPermissionStep {
    public final List serializer;
    public ConcurrentHashMap write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.serializer});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("values");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.serializer);
        ConcurrentHashMap concurrentHashMap = this.write;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.write, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public MediaBrowserCompatMediaItem(List list) {
        this.serializer = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaBrowserCompatMediaItem.class != obj.getClass()) {
            return false;
        }
        return setNativeShader.write(this.serializer, ((MediaBrowserCompatMediaItem) obj).serializer);
    }
}
