package io.sentry.clientreport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.setNativeShader;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteActionCompatParcelizer implements RequestPushPermissionStep {
    public final Date IconCompatParcelizer;
    public final ArrayList read;
    public HashMap write;

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("timestamp");
        okHttpCall$1.IconCompatParcelizer(setNativeShader.serializer(this.IconCompatParcelizer));
        okHttpCall$1.write("discarded_events");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.read);
        HashMap map = this.write;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.write, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public RemoteActionCompatParcelizer(Date date, ArrayList arrayList) {
        this.IconCompatParcelizer = date;
        this.read = arrayList;
    }
}
