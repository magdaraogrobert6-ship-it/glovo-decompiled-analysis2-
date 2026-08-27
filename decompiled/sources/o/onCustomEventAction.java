package o;

import io.sentry.SentryBaseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import retrofit2.OkHttpCall$1;

/* JADX INFO: loaded from: classes4.dex */
public final class onCustomEventAction extends SentryBaseEvent implements RequestPushPermissionStep {
    public Date ComponentActivity;
    public int ResultReceiver;
    public HashMap r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
    public File r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
    public io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = new io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
    public String r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = "replay_event";
    public onOtherUrlActionlambda1 r8lambda54BeH8ZsBru0CXI2CCSP2syNys = onOtherUrlActionlambda1.SESSION;
    public List r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = new ArrayList();
    public List r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = new ArrayList();
    public List r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new ArrayList();
    public Date r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = setNativeShader.serializer();

    public final int hashCode() {
        String str = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        onOtherUrlActionlambda1 onotherurlactionlambda1 = this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        io.sentry.protocol.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg = this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int i = this.ResultReceiver;
        return Arrays.hashCode(new Object[]{str, onotherurlactionlambda1, r8lambdaquuwrpysdd6n6dd7wraaa0s4oxg, Integer.valueOf(i), this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss});
    }

    @Override // o.RequestPushPermissionStep
    public final void serialize(isArgString isargstring, BrazeActionParserExternalSyntheticLambda0 brazeActionParserExternalSyntheticLambda0) throws IOException {
        OkHttpCall$1 okHttpCall$1 = (OkHttpCall$1) isargstring;
        okHttpCall$1.write();
        okHttpCall$1.write("type");
        okHttpCall$1.IconCompatParcelizer(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM);
        okHttpCall$1.write("replay_type");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        okHttpCall$1.write("segment_id");
        okHttpCall$1.IconCompatParcelizer(this.ResultReceiver);
        okHttpCall$1.write("timestamp");
        okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4);
        if (this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != null) {
            okHttpCall$1.write("replay_id");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus);
        }
        if (this.ComponentActivity != null) {
            okHttpCall$1.write("replay_start_timestamp");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.ComponentActivity);
        }
        if (this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 != null) {
            okHttpCall$1.write("urls");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8);
        }
        if (this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY != null) {
            okHttpCall$1.write("error_ids");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        }
        if (this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != null) {
            okHttpCall$1.write("trace_ids");
            okHttpCall$1.serializer(brazeActionParserExternalSyntheticLambda0, this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
        }
        coil3.util.UtilsKt.IconCompatParcelizer(this, okHttpCall$1, brazeActionParserExternalSyntheticLambda0);
        HashMap map = this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg;
        if (map != null) {
            for (String str : map.keySet()) {
                r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.RemoteActionCompatParcelizer(this.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg, str, okHttpCall$1, str, brazeActionParserExternalSyntheticLambda0);
            }
        }
        okHttpCall$1.RatingCompat();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || onCustomEventAction.class != obj.getClass()) {
            return false;
        }
        onCustomEventAction oncustomeventaction = (onCustomEventAction) obj;
        return this.ResultReceiver == oncustomeventaction.ResultReceiver && setNativeShader.write(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, oncustomeventaction.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) && this.r8lambda54BeH8ZsBru0CXI2CCSP2syNys == oncustomeventaction.r8lambda54BeH8ZsBru0CXI2CCSP2syNys && setNativeShader.write(this.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, oncustomeventaction.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) && setNativeShader.write(this.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8, oncustomeventaction.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8) && setNativeShader.write(this.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY, oncustomeventaction.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) && setNativeShader.write(this.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, oncustomeventaction.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
    }
}
