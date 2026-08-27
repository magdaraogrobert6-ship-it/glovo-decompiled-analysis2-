package o;

import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class onConsoleMessagelambda0 extends requestPushPermissionPromptlambda3 {
    public final wouldPushPermissionPromptDisplaylambda0 write;

    @Override // o.requestPushPermissionPromptlambda3
    public final wouldPushPermissionPromptDisplaylambda0 write(r8lambdagKH6tFShUp2G_hD0a6i5EJD8PU r8lambdagkh6tfshup2g_hd0a6i5ejd8pu) {
        return this.write;
    }

    public final String toString() {
        r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI r8lambdalmkbrrgswwtv97obrsj7trj7ai = new r8lambdaLMKBRrgsWWtv97ObrSj7trJ7AI(onConsoleMessagelambda0.class.getSimpleName());
        r8lambdalmkbrrgswwtv97obrsj7trj7ai.IconCompatParcelizer(this.write, "result");
        return r8lambdalmkbrrgswwtv97obrsj7trj7ai.toString();
    }

    public onConsoleMessagelambda0(wouldPushPermissionPromptDisplaylambda0 wouldpushpermissionpromptdisplaylambda0) {
        TextStreamsKt.serializer(wouldpushpermissionpromptdisplaylambda0, "result");
        this.write = wouldpushpermissionpromptdisplaylambda0;
    }
}
