package io.sentry.protocol;

import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import java.io.IOException;
import java.util.HashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss implements RequestPushPermissionStep {
    public String IconCompatParcelizer;
    public Integer RemoteActionCompatParcelizer;
    public Integer read;
    public Integer serializer;
    public HashMap write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write(HianalyticsBaseData.SDK_NAME);
            okHttpCall$1.IconCompatParcelizer(this.IconCompatParcelizer);
        }
        if (this.read != null) {
            okHttpCall$1.write("version_major");
            okHttpCall$1.RemoteActionCompatParcelizer(this.read);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("version_minor");
            okHttpCall$1.RemoteActionCompatParcelizer(this.serializer);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("version_patchlevel");
            okHttpCall$1.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        HashMap map = this.write;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.write, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
