package o;

import io.grpc.Status;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class wouldPushPermissionPromptDisplay extends requestPushPermissionPromptlambda3 {
    public final /* synthetic */ int RemoteActionCompatParcelizer = 1;
    public final Object read;

    public wouldPushPermissionPromptDisplay(Throwable th) {
        Status statusRemoteActionCompatParcelizer = Status.write.IconCompatParcelizer("Panic! This is a bug!").RemoteActionCompatParcelizer(th);
        wouldPushPermissionPromptDisplaylambda0 wouldpushpermissionpromptdisplaylambda0 = wouldPushPermissionPromptDisplaylambda0.IconCompatParcelizer;
        TextStreamsKt.read("drop status shouldn't be OK", !statusRemoteActionCompatParcelizer.IconCompatParcelizer());
        this.read = new wouldPushPermissionPromptDisplaylambda0(null, null, statusRemoteActionCompatParcelizer, true);
    }

    public String toString() {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        if (i == 0) {
            return "FixedResultPicker(" + ((wouldPushPermissionPromptDisplaylambda0) obj) + ")";
        }
        if (i != 1) {
            return super.toString();
        }
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(wouldPushPermissionPromptDisplay.class.getSimpleName());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((wouldPushPermissionPromptDisplaylambda0) obj, "panicPickResult");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    @Override // o.requestPushPermissionPromptlambda3
    public final wouldPushPermissionPromptDisplaylambda0 write(r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU r8lambdagkh6tfshup2g_hd0a6i5ejd8pu) {
        int i = this.RemoteActionCompatParcelizer;
        Object obj = this.read;
        if (i == 0) {
            return (wouldPushPermissionPromptDisplaylambda0) obj;
        }
        if (i == 1) {
            return (wouldPushPermissionPromptDisplaylambda0) obj;
        }
        wouldPushPermissionPromptDisplaylambda0 wouldpushpermissionpromptdisplaylambda0Write = ((requestPushPermissionPromptlambda3) obj).write(r8lambdagkh6tfshup2g_hd0a6i5ejd8pu);
        JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 = wouldpushpermissionpromptdisplaylambda0Write.write;
        if (jsonUtilsExternalSyntheticLambda1 == null) {
            return wouldpushpermissionpromptdisplaylambda0Write;
        }
        getPrettyPrintedStringlambda0 getprettyprintedstringlambda0Serializer = jsonUtilsExternalSyntheticLambda1.serializer();
        return wouldPushPermissionPromptDisplaylambda0.write(jsonUtilsExternalSyntheticLambda1, new r8lambdaRFRfowALp5JU3r14umh5Sb3V5Jg((UriAction) getprettyprintedstringlambda0Serializer.read.get(IAction.MediaBrowserCompatMediaItem), wouldpushpermissionpromptdisplaylambda0Write.read));
    }

    public wouldPushPermissionPromptDisplay(requestPushPermissionPromptlambda3 requestpushpermissionpromptlambda3) {
        this.read = requestpushpermissionpromptlambda3;
    }

    public wouldPushPermissionPromptDisplay(wouldPushPermissionPromptDisplaylambda0 wouldpushpermissionpromptdisplaylambda0) {
        TextStreamsKt.serializer(wouldpushpermissionpromptdisplaylambda0, "result");
        this.read = wouldpushpermissionpromptdisplaylambda0;
    }
}
