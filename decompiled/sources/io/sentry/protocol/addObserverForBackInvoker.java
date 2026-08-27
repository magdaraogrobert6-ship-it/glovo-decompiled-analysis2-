package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class addObserverForBackInvoker implements RequestPushPermissionStep {
    public String IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public String MediaSessionCompatQueueItem;
    public ConcurrentHashMap RatingCompat;
    public String RemoteActionCompatParcelizer;
    public String read;
    public MediaSessionCompatToken serializer;
    public ConcurrentHashMap write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.RemoteActionCompatParcelizer, this.read, this.MediaSessionCompatQueueItem, this.IconCompatParcelizer});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("email");
            okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        if (this.read != null) {
            okHttpCall$1.write("id");
            okHttpCall$1.IconCompatParcelizer(this.read);
        }
        if (this.MediaSessionCompatQueueItem != null) {
            okHttpCall$1.write("username");
            okHttpCall$1.IconCompatParcelizer(this.MediaSessionCompatQueueItem);
        }
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("ip_address");
            okHttpCall$1.IconCompatParcelizer(this.IconCompatParcelizer);
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            okHttpCall$1.write("name");
            okHttpCall$1.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("geo");
            this.serializer.serialize(okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        }
        if (this.write != null) {
            okHttpCall$1.write(RemoteMessageConst.DATA);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.write);
        }
        ConcurrentHashMap concurrentHashMap = this.RatingCompat;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.RatingCompat, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || addObserverForBackInvoker.class != obj.getClass()) {
            return false;
        }
        addObserverForBackInvoker addobserverforbackinvoker = (addObserverForBackInvoker) obj;
        return setNativeShader.write(this.RemoteActionCompatParcelizer, addobserverforbackinvoker.RemoteActionCompatParcelizer) && setNativeShader.write(this.read, addobserverforbackinvoker.read) && setNativeShader.write(this.MediaSessionCompatQueueItem, addobserverforbackinvoker.MediaSessionCompatQueueItem) && setNativeShader.write(this.IconCompatParcelizer, addobserverforbackinvoker.IconCompatParcelizer);
    }
}
