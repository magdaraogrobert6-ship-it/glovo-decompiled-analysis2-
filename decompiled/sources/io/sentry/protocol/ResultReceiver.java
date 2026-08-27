package io.sentry.protocol;

import bo.app.m1$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class ResultReceiver implements RequestPushPermissionStep {
    public Long IconCompatParcelizer;
    public ConcurrentHashMap MediaDescriptionCompat;
    public Object RemoteActionCompatParcelizer;
    public ConcurrentHashMap read;
    public Integer serializer;
    public String write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.write != null) {
            okHttpCall$1.write("cookies");
            okHttpCall$1.IconCompatParcelizer(this.write);
        }
        if (this.read != null) {
            okHttpCall$1.write("headers");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.read);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("status_code");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.serializer);
        }
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("body_size");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.IconCompatParcelizer);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write(RemoteMessageConst.DATA);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RemoteActionCompatParcelizer);
        }
        ConcurrentHashMap concurrentHashMap = this.MediaDescriptionCompat;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.MediaDescriptionCompat, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
