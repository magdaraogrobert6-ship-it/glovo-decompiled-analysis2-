package io.sentry.protocol;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.IOException;
import java.util.HashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 implements RequestPushPermissionStep {
    public String IconCompatParcelizer;
    public String MediaBrowserCompatMediaItem;
    public HashMap MediaDescriptionCompat;
    public String RemoteActionCompatParcelizer;
    public Long read;
    public r8lambdayPQlaAoRiYRJ3IY_TqzUUTrVH0 serializer;
    public ParcelableVolumeInfo write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("type");
            okHttpCall$1.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        if (this.MediaBrowserCompatMediaItem != null) {
            okHttpCall$1.write("value");
            okHttpCall$1.IconCompatParcelizer(this.MediaBrowserCompatMediaItem);
        }
        if (this.IconCompatParcelizer != null) {
            okHttpCall$1.write("module");
            okHttpCall$1.IconCompatParcelizer(this.IconCompatParcelizer);
        }
        if (this.read != null) {
            okHttpCall$1.write(CrashHianalyticsData.THREAD_ID);
            okHttpCall$1.RemoteActionCompatParcelizer(this.read);
        }
        if (this.serializer != null) {
            okHttpCall$1.write("stacktrace");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.serializer);
        }
        if (this.write != null) {
            okHttpCall$1.write("mechanism");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.write);
        }
        HashMap map = this.MediaDescriptionCompat;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }
}
