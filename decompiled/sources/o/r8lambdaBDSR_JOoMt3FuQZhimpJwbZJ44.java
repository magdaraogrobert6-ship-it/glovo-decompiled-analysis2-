package o;

import io.grpc.LoadBalancer$Helper;
import java.util.List;
import kotlin.io.TextStreamsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambdaBDSR_JOoMt3FuQZhimpJwbZJ44 extends subscriptionTypeFromJavascriptString {
    public final /* synthetic */ hasPermissionlambda0 IconCompatParcelizer;
    public Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int serializer = 0;

    public r8lambdaBDSR_JOoMt3FuQZhimpJwbZJ44(IAction iAction, LoadBalancer$Helper loadBalancer$Helper) {
        this.IconCompatParcelizer = iAction;
        this.RemoteActionCompatParcelizer = new r8lambda7fNFoEPKuxoy0sqvCQdnDlsPgJo(0, loadBalancer$Helper);
    }

    @Override // o.subscriptionTypeFromJavascriptString
    public final LoadBalancer$Helper MediaBrowserCompatMediaItem() {
        return this.serializer != 0 ? ((UserJavascriptInterfaceBaseExternalSyntheticLambda12) this.IconCompatParcelizer).PlaybackStateCompat : (r8lambda7fNFoEPKuxoy0sqvCQdnDlsPgJo) this.RemoteActionCompatParcelizer;
    }

    @Override // o.subscriptionTypeFromJavascriptString, io.grpc.LoadBalancer$Helper
    public JsonUtilsExternalSyntheticLambda1 read(requestPushPermissionPromptlambda2 requestpushpermissionpromptlambda2) {
        if (this.serializer != 0) {
            return super.read(requestpushpermissionpromptlambda2);
        }
        IAction iAction = (IAction) this.IconCompatParcelizer;
        getChannel getchannel = iAction.PlaybackStateCompatCustomAction;
        r8lambdatUS6XQ_eCqvrQ4AX_ZhZEa3usI r8lambdatus6xq_ecqvrq4ax_zhzea3usi = new r8lambdatUS6XQ_eCqvrQ4AX_ZhZEa3usI(iAction, requestpushpermissionpromptlambda2, (r8lambda7fNFoEPKuxoy0sqvCQdnDlsPgJo) this.RemoteActionCompatParcelizer);
        List list = requestpushpermissionpromptlambda2.write;
        if (IAction.RemoteActionCompatParcelizer(list)) {
            if (getchannel.IconCompatParcelizer.containsKey(((r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) list.get(0)).read.get(0))) {
                UriAction uriAction = (UriAction) getchannel.IconCompatParcelizer.get(((r8lambda_glYxfCG6xjU1Wmp26W6t1ITdUE) list.get(0)).read.get(0));
                uriAction.IconCompatParcelizer(r8lambdatus6xq_ecqvrq4ax_zhzea3usi);
                if (uriAction.read != null) {
                    r8lambdatus6xq_ecqvrq4ax_zhzea3usi.PlaybackStateCompat();
                }
            }
        }
        return r8lambdatus6xq_ecqvrq4ax_zhzea3usi;
    }

    @Override // o.subscriptionTypeFromJavascriptString, io.grpc.LoadBalancer$Helper
    public final void write(setResourcePackageNamelambda0 setresourcepackagenamelambda0, requestPushPermissionPromptlambda3 requestpushpermissionpromptlambda3) {
        if (this.serializer == 0) {
            ((r8lambda7fNFoEPKuxoy0sqvCQdnDlsPgJo) this.RemoteActionCompatParcelizer).write(setresourcepackagenamelambda0, new wouldPushPermissionPromptDisplay(requestpushpermissionpromptlambda3));
            return;
        }
        hasPermissionlambda0 haspermissionlambda0 = (hasPermissionlambda0) this.RemoteActionCompatParcelizer;
        UserJavascriptInterfaceBaseExternalSyntheticLambda12 userJavascriptInterfaceBaseExternalSyntheticLambda12 = (UserJavascriptInterfaceBaseExternalSyntheticLambda12) this.IconCompatParcelizer;
        hasPermissionlambda0 haspermissionlambda1 = userJavascriptInterfaceBaseExternalSyntheticLambda12.MediaSessionCompatResultReceiverWrapper;
        if (haspermissionlambda0 == haspermissionlambda1) {
            TextStreamsKt.RemoteActionCompatParcelizer("there's pending lb while current lb has been out of READY", userJavascriptInterfaceBaseExternalSyntheticLambda12.MediaBrowserCompatMediaItem);
            userJavascriptInterfaceBaseExternalSyntheticLambda12.PlaybackStateCompatCustomAction = setresourcepackagenamelambda0;
            userJavascriptInterfaceBaseExternalSyntheticLambda12.MediaSessionCompatToken = requestpushpermissionpromptlambda3;
            if (setresourcepackagenamelambda0 == setResourcePackageNamelambda0.READY) {
                userJavascriptInterfaceBaseExternalSyntheticLambda12.write();
                return;
            }
            return;
        }
        if (haspermissionlambda0 == userJavascriptInterfaceBaseExternalSyntheticLambda12.RatingCompat) {
            boolean z = setresourcepackagenamelambda0 == setResourcePackageNamelambda0.READY;
            userJavascriptInterfaceBaseExternalSyntheticLambda12.MediaBrowserCompatMediaItem = z;
            if (z || haspermissionlambda1 == userJavascriptInterfaceBaseExternalSyntheticLambda12.MediaDescriptionCompat) {
                userJavascriptInterfaceBaseExternalSyntheticLambda12.PlaybackStateCompat.write(setresourcepackagenamelambda0, requestpushpermissionpromptlambda3);
            } else {
                userJavascriptInterfaceBaseExternalSyntheticLambda12.write();
            }
        }
    }

    public r8lambdaBDSR_JOoMt3FuQZhimpJwbZJ44(UserJavascriptInterfaceBaseExternalSyntheticLambda12 userJavascriptInterfaceBaseExternalSyntheticLambda12) {
        this.IconCompatParcelizer = userJavascriptInterfaceBaseExternalSyntheticLambda12;
    }
}
