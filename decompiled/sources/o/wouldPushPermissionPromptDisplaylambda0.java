package o;

import com.roadrunner.customerchat.selfservice.domain.SelfServiceCustomerChatRepositoryImpl$sendMessage$2;
import io.grpc.Status;
import java.util.Arrays;
import kotlin.TuplesKt;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class wouldPushPermissionPromptDisplaylambda0 {
    public static final wouldPushPermissionPromptDisplaylambda0 IconCompatParcelizer = new wouldPushPermissionPromptDisplaylambda0(null, null, Status.RatingCompat, false);
    public final Status RemoteActionCompatParcelizer;
    public final JsonUtilsd read;
    public final boolean serializer;
    public final JsonUtilsExternalSyntheticLambda1 write;

    public wouldPushPermissionPromptDisplaylambda0(JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1, JsonUtilsd jsonUtilsd, Status status, boolean z) {
        this.write = jsonUtilsExternalSyntheticLambda1;
        this.read = jsonUtilsd;
        TextStreamsKt.serializer(status, "status");
        this.RemoteActionCompatParcelizer = status;
        this.serializer = z;
    }

    public static wouldPushPermissionPromptDisplaylambda0 write(JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1, r8lambdaRFRfowALp5JU3r14umh5Sb3V5Jg r8lambdarfrfowalp5ju3r14umh5sb3v5jg) {
        TextStreamsKt.serializer(jsonUtilsExternalSyntheticLambda1, "subchannel");
        return new wouldPushPermissionPromptDisplaylambda0(jsonUtilsExternalSyntheticLambda1, r8lambdarfrfowalp5ju3r14umh5sb3v5jg, Status.RatingCompat, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wouldPushPermissionPromptDisplaylambda0)) {
            return false;
        }
        wouldPushPermissionPromptDisplaylambda0 wouldpushpermissionpromptdisplaylambda0 = (wouldPushPermissionPromptDisplaylambda0) obj;
        return TuplesKt.RemoteActionCompatParcelizer(this.write, wouldpushpermissionpromptdisplaylambda0.write) && TuplesKt.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, wouldpushpermissionpromptdisplaylambda0.RemoteActionCompatParcelizer) && TuplesKt.RemoteActionCompatParcelizer(this.read, wouldpushpermissionpromptdisplaylambda0.read) && this.serializer == wouldpushpermissionpromptdisplaylambda0.serializer;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.write, this.RemoteActionCompatParcelizer, this.read, Boolean.valueOf(this.serializer)});
    }

    public final String toString() {
        int i = SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read();
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = (r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI) coil3.util.UtilsKt.RemoteActionCompatParcelizer(-165262326, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), new Object[]{this}, 165262328, i, SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read(), SelfServiceCustomerChatRepositoryImpl$sendMessage$2.read());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.write, "subchannel");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.read, "streamTracerFactory");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.RemoteActionCompatParcelizer, "status");
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer("drop", this.serializer);
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    public static wouldPushPermissionPromptDisplaylambda0 IconCompatParcelizer(Status status) {
        TextStreamsKt.read("error status shouldn't be OK", !status.IconCompatParcelizer());
        return new wouldPushPermissionPromptDisplaylambda0(null, null, status, false);
    }
}
