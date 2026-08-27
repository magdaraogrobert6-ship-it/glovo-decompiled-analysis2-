package o;

import io.grpc.Status;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class createWebViewClient extends requestPushPermissionPromptlambda3 {
    public final /* synthetic */ int IconCompatParcelizer = 1;
    public final Object serializer;

    public createWebViewClient(wouldPushPermissionPromptDisplaylambda0 wouldpushpermissionpromptdisplaylambda0) {
        TextStreamsKt.serializer(wouldpushpermissionpromptdisplaylambda0, "result");
        this.serializer = wouldpushpermissionpromptdisplaylambda0;
    }

    @Override // o.requestPushPermissionPromptlambda3
    public final wouldPushPermissionPromptDisplaylambda0 write(r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU r8lambdagkh6tfshup2g_hd0a6i5ejd8pu) {
        int i = this.IconCompatParcelizer;
        Object obj = this.serializer;
        return i != 0 ? wouldPushPermissionPromptDisplaylambda0.IconCompatParcelizer((Status) obj) : (wouldPushPermissionPromptDisplaylambda0) obj;
    }

    public String toString() {
        if (this.IconCompatParcelizer != 0) {
            return super.toString();
        }
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(createWebViewClient.class.getSimpleName());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer((wouldPushPermissionPromptDisplaylambda0) this.serializer, "result");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    public createWebViewClient(Status status) {
        this.serializer = status;
    }
}
