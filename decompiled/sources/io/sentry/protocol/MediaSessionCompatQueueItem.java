package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class MediaSessionCompatQueueItem implements RequestPushPermissionStep {
    public boolean RemoteActionCompatParcelizer;
    public ConcurrentHashMap read;
    public String write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.write, Boolean.valueOf(this.RemoteActionCompatParcelizer)});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("flag");
        okHttpCall$1.IconCompatParcelizer(this.write);
        okHttpCall$1.write("result");
        okHttpCall$1.write(this.RemoteActionCompatParcelizer);
        ConcurrentHashMap concurrentHashMap = this.read;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.read, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaSessionCompatQueueItem.class != obj.getClass()) {
            return false;
        }
        MediaSessionCompatQueueItem mediaSessionCompatQueueItem = (MediaSessionCompatQueueItem) obj;
        if (setNativeShader.write(this.write, mediaSessionCompatQueueItem.write)) {
            return setNativeShader.write(Boolean.valueOf(this.RemoteActionCompatParcelizer), Boolean.valueOf(mediaSessionCompatQueueItem.RemoteActionCompatParcelizer));
        }
        return false;
    }
}
