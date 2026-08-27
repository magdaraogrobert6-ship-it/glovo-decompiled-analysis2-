package o;

import io.grpc.LoadBalancer$Helper;

/* JADX INFO: loaded from: classes4.dex */
public final class r8lambda7fNFoEPKuxoy0sqvCQdnDlsPgJo extends subscriptionTypeFromJavascriptString {
    public final /* synthetic */ int IconCompatParcelizer;
    public final Object RemoteActionCompatParcelizer;

    public /* synthetic */ r8lambda7fNFoEPKuxoy0sqvCQdnDlsPgJo(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = obj;
    }

    @Override // o.subscriptionTypeFromJavascriptString
    public final LoadBalancer$Helper MediaBrowserCompatMediaItem() {
        int i = this.IconCompatParcelizer;
        Object obj = this.RemoteActionCompatParcelizer;
        return i != 0 ? ((runOnUser) obj).MediaDescriptionCompat.MediaMetadataCompat : (LoadBalancer$Helper) obj;
    }

    @Override // o.subscriptionTypeFromJavascriptString, io.grpc.LoadBalancer$Helper
    public JsonUtilsExternalSyntheticLambda1 read(requestPushPermissionPromptlambda2 requestpushpermissionpromptlambda2) {
        if (this.IconCompatParcelizer != 0) {
            return super.read(requestpushpermissionpromptlambda2);
        }
        wouldPushPermissionPromptDisplaylambda4 wouldpushpermissionpromptdisplaylambda4 = (wouldPushPermissionPromptDisplaylambda4) requestpushpermissionpromptlambda2.IconCompatParcelizer();
        JsonUtilsExternalSyntheticLambda1 jsonUtilsExternalSyntheticLambda1 = super.read(requestpushpermissionpromptlambda2);
        if (wouldpushpermissionpromptdisplaylambda4 != null) {
            return jsonUtilsExternalSyntheticLambda1.serializer().read.get(hasPermissionlambda0.serializer) == null ? new UserJavascriptInterfaceBaseCompanion(jsonUtilsExternalSyntheticLambda1, wouldpushpermissionpromptdisplaylambda4) : jsonUtilsExternalSyntheticLambda1;
        }
        return jsonUtilsExternalSyntheticLambda1;
    }

    @Override // o.subscriptionTypeFromJavascriptString, io.grpc.LoadBalancer$Helper
    public void write(setResourcePackageNamelambda0 setresourcepackagenamelambda0, requestPushPermissionPromptlambda3 requestpushpermissionpromptlambda3) {
        if (this.IconCompatParcelizer != 1) {
            super.write(setresourcepackagenamelambda0, requestpushpermissionpromptlambda3);
            return;
        }
        runOnUser runonuser = (runOnUser) this.RemoteActionCompatParcelizer;
        r8lambdawhi89LFIaMpCd_VDuYlA8ZBB70U r8lambdawhi89lfiampcd_vduyla8zbb70u = runonuser.MediaDescriptionCompat;
        if (r8lambdawhi89lfiampcd_vduyla8zbb70u.MediaBrowserCompatMediaItem.containsKey(runonuser.RemoteActionCompatParcelizer)) {
            runonuser.read = setresourcepackagenamelambda0;
            runonuser.write = requestpushpermissionpromptlambda3;
            if (runonuser.serializer || r8lambdawhi89lfiampcd_vduyla8zbb70u.PlaybackStateCompat) {
                return;
            }
            if (setresourcepackagenamelambda0 == setResourcePackageNamelambda0.IDLE) {
                runonuser.IconCompatParcelizer.RemoteActionCompatParcelizer();
            }
            r8lambdawhi89lfiampcd_vduyla8zbb70u.write();
        }
    }
}
