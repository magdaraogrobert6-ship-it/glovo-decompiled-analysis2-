package o;

import io.grpc.LoadBalancer$Helper;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class BrazeWebViewActivitycreateWebChromeClient1 extends hasPermissionlambda0 {
    public final LoadBalancer$Helper MediaBrowserCompatMediaItem;
    public JsonUtilsExternalSyntheticLambda1 MediaDescriptionCompat;
    public setResourcePackageNamelambda0 MediaSessionCompatQueueItem = setResourcePackageNamelambda0.IDLE;

    @Override // o.hasPermissionlambda0
    public final Status RemoteActionCompatParcelizer(requestPushPermissionPromptlambda1 requestpushpermissionpromptlambda1) {
        Boolean bool;
        List list = requestpushpermissionpromptlambda1.read;
        if (list.isEmpty()) {
            Status statusIconCompatParcelizer = Status.MediaSessionCompatResultReceiverWrapper.IconCompatParcelizer("NameResolver returned no usable address. addrs=" + list + ", attrs=" + requestpushpermissionpromptlambda1.serializer);
            serializer(statusIconCompatParcelizer);
            return statusIconCompatParcelizer;
        }
        Object obj = requestpushpermissionpromptlambda1.RemoteActionCompatParcelizer;
        if ((obj instanceof r8lambdaDnYlDXUzZcCbTaVMZY1CnIw2AZM) && (bool = ((r8lambdaDnYlDXUzZcCbTaVMZY1CnIw2AZM) obj).serializer) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 = this.MediaDescriptionCompat;
        if (jsonUtilsExternalSyntheticLambda1 == null) {
            requestPushPermissionPromptlambda2 requestpushpermissionpromptlambda2Write = requestPushPermissionPromptlambda2.write();
            requestpushpermissionpromptlambda2Write.RemoteActionCompatParcelizer(list);
            requestPushPermissionPromptlambda2 requestpushpermissionpromptlambda2 = new requestPushPermissionPromptlambda2(requestpushpermissionpromptlambda2Write.write, requestpushpermissionpromptlambda2Write.serializer, requestpushpermissionpromptlambda2Write.RemoteActionCompatParcelizer);
            LoadBalancer$Helper loadBalancer$Helper = this.MediaBrowserCompatMediaItem;
            JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda2 = loadBalancer$Helper.read(requestpushpermissionpromptlambda2);
            jsonUtilsExternalSyntheticLambda2.serializer(new onConsoleMessage(this, jsonUtilsExternalSyntheticLambda2));
            this.MediaDescriptionCompat = jsonUtilsExternalSyntheticLambda2;
            setResourcePackageNamelambda0 setresourcepackagenamelambda0 = setResourcePackageNamelambda0.CONNECTING;
            onConsoleMessagelambda0 onconsolemessagelambda0 = new onConsoleMessagelambda0(wouldPushPermissionPromptDisplaylambda0.write(jsonUtilsExternalSyntheticLambda2, null));
            this.MediaSessionCompatQueueItem = setresourcepackagenamelambda0;
            loadBalancer$Helper.write(setresourcepackagenamelambda0, onconsolemessagelambda0);
            jsonUtilsExternalSyntheticLambda2.MediaDescriptionCompat();
        } else {
            jsonUtilsExternalSyntheticLambda1.IconCompatParcelizer(list);
        }
        return Status.RatingCompat;
    }

    public BrazeWebViewActivitycreateWebChromeClient1(LoadBalancer$Helper loadBalancer$Helper) {
        this.MediaBrowserCompatMediaItem = loadBalancer$Helper;
    }

    @Override // o.hasPermissionlambda0
    public final void RemoteActionCompatParcelizer() {
        JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 = this.MediaDescriptionCompat;
        if (jsonUtilsExternalSyntheticLambda1 != null) {
            jsonUtilsExternalSyntheticLambda1.MediaDescriptionCompat();
        }
    }

    @Override // o.hasPermissionlambda0
    public final void read() {
        JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 = this.MediaDescriptionCompat;
        if (jsonUtilsExternalSyntheticLambda1 != null) {
            jsonUtilsExternalSyntheticLambda1.RatingCompat();
        }
    }

    @Override // o.hasPermissionlambda0
    public final void serializer(Status status) {
        JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 = this.MediaDescriptionCompat;
        if (jsonUtilsExternalSyntheticLambda1 != null) {
            jsonUtilsExternalSyntheticLambda1.RatingCompat();
            this.MediaDescriptionCompat = null;
        }
        setResourcePackageNamelambda0 setresourcepackagenamelambda0 = setResourcePackageNamelambda0.TRANSIENT_FAILURE;
        onConsoleMessagelambda0 onconsolemessagelambda0 = new onConsoleMessagelambda0(wouldPushPermissionPromptDisplaylambda0.IconCompatParcelizer(status));
        this.MediaSessionCompatQueueItem = setresourcepackagenamelambda0;
        this.MediaBrowserCompatMediaItem.write(setresourcepackagenamelambda0, onconsolemessagelambda0);
    }
}
