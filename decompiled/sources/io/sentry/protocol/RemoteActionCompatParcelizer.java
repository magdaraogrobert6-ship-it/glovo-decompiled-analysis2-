package io.sentry.protocol;

import io.sentry.SentryOptions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.BrazeActionParserExternalSyntheticLambda0;
import o.RequestPushPermissionStep;
import o.isArgString;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class RemoteActionCompatParcelizer implements RequestPushPermissionStep {
    public List RemoteActionCompatParcelizer;
    public r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss read;
    public HashMap write;

    public static RemoteActionCompatParcelizer read(RemoteActionCompatParcelizer remoteActionCompatParcelizer, SentryOptions sentryOptions) {
        ArrayList arrayList = new ArrayList();
        if (sentryOptions.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(sentryOptions.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : sentryOptions.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (remoteActionCompatParcelizer == null) {
            remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
        }
        List list = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        if (list == null) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer = new ArrayList(arrayList);
            return remoteActionCompatParcelizer;
        }
        list.addAll(arrayList);
        return remoteActionCompatParcelizer;
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        if (this.read != null) {
            okHttpCall$1.write("sdk_info");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.read);
        }
        if (this.RemoteActionCompatParcelizer != null) {
            okHttpCall$1.write("images");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.RemoteActionCompatParcelizer);
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
