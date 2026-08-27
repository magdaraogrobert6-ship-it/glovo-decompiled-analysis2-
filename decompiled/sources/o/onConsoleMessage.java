package o;

import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import io.grpc.LoadBalancer$Helper;

/* JADX INFO: loaded from: classes4.dex */
public final class onConsoleMessage implements wouldPushPermissionPromptDisplaylambda4 {
    public final /* synthetic */ BrazeWebViewActivitycreateWebChromeClient1 RemoteActionCompatParcelizer;
    public final /* synthetic */ JsonUtilsExternalSyntheticLambda1 serializer;

    @Override // o.wouldPushPermissionPromptDisplaylambda4
    public final void write(PackageUtils packageUtils) {
        requestPushPermissionPromptlambda3 r8lambdatgvqp69thpncilzsqcbcgsuvftw;
        BrazeWebViewActivitycreateWebChromeClient1 brazeWebViewActivitycreateWebChromeClient1 = this.RemoteActionCompatParcelizer;
        LoadBalancer$Helper loadBalancer$Helper = brazeWebViewActivitycreateWebChromeClient1.MediaBrowserCompatMediaItem;
        setResourcePackageNamelambda0 setresourcepackagenamelambda0 = packageUtils.IconCompatParcelizer;
        if (setresourcepackagenamelambda0 == setResourcePackageNamelambda0.SHUTDOWN) {
            return;
        }
        setResourcePackageNamelambda0 setresourcepackagenamelambda1 = setResourcePackageNamelambda0.TRANSIENT_FAILURE;
        if (setresourcepackagenamelambda0 == setresourcepackagenamelambda1 || setresourcepackagenamelambda0 == setResourcePackageNamelambda0.IDLE) {
            loadBalancer$Helper.RemoteActionCompatParcelizer();
        }
        if (brazeWebViewActivitycreateWebChromeClient1.MediaSessionCompatQueueItem == setresourcepackagenamelambda1) {
            if (setresourcepackagenamelambda0 == setResourcePackageNamelambda0.CONNECTING) {
                return;
            }
            if (setresourcepackagenamelambda0 == setResourcePackageNamelambda0.IDLE) {
                brazeWebViewActivitycreateWebChromeClient1.RemoteActionCompatParcelizer();
                return;
            }
        }
        int i = getDefaultVideoPoster.read[setresourcepackagenamelambda0.ordinal()];
        JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 = this.serializer;
        if (i == 1) {
            r8lambdatgvqp69thpncilzsqcbcgsuvftw = new r8lambdaTGvqp69thpNCiLzSqCbcGsuVFtw(brazeWebViewActivitycreateWebChromeClient1, jsonUtilsExternalSyntheticLambda1);
        } else if (i == 2) {
            r8lambdatgvqp69thpncilzsqcbcgsuvftw = new onConsoleMessagelambda0(wouldPushPermissionPromptDisplaylambda0.IconCompatParcelizer);
        } else if (i == 3) {
            r8lambdatgvqp69thpncilzsqcbcgsuvftw = new onConsoleMessagelambda0(wouldPushPermissionPromptDisplaylambda0.write(jsonUtilsExternalSyntheticLambda1, null));
        } else {
            if (i != 4) {
                Gson$$ExternalSyntheticBUOutline0.m(setresourcepackagenamelambda0, "Unsupported state:");
                return;
            }
            r8lambdatgvqp69thpncilzsqcbcgsuvftw = new onConsoleMessagelambda0(wouldPushPermissionPromptDisplaylambda0.IconCompatParcelizer(packageUtils.read));
        }
        brazeWebViewActivitycreateWebChromeClient1.MediaSessionCompatQueueItem = setresourcepackagenamelambda0;
        loadBalancer$Helper.write(setresourcepackagenamelambda0, r8lambdatgvqp69thpncilzsqcbcgsuvftw);
    }

    public onConsoleMessage(BrazeWebViewActivitycreateWebChromeClient1 brazeWebViewActivitycreateWebChromeClient1, JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1) {
        this.RemoteActionCompatParcelizer = brazeWebViewActivitycreateWebChromeClient1;
        this.serializer = jsonUtilsExternalSyntheticLambda1;
    }
}
