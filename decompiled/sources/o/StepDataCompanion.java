package o;

import bo.app.m1$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class StepDataCompanion implements RequestPushPermissionStep {
    public ConcurrentHashMap RemoteActionCompatParcelizer;
    public io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg write;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.write});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("profiler_id");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.write);
        ConcurrentHashMap concurrentHashMap = this.RemoteActionCompatParcelizer;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                m1$$ExternalSyntheticOutline0.m(this.RemoteActionCompatParcelizer, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public StepDataCompanion(io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg) {
        this.write = r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StepDataCompanion) {
            return this.write.equals(((StepDataCompanion) obj).write);
        }
        return false;
    }

    public StepDataCompanion() {
    }
}
