package io.sentry.protocol.profiling;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class IconCompatParcelizer implements RequestPushPermissionStep {
    public String IconCompatParcelizer;
    public HashMap read;
    public double serializer;
    public int write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("timestamp");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, BigDecimal.valueOf(this.serializer).setScale(6, RoundingMode.DOWN));
        okHttpCall$1.write("stack_id");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, Integer.valueOf(this.write));
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write(CrashHianalyticsData.THREAD_ID);
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.IconCompatParcelizer);
        }
        HashMap map = this.read;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.read, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
