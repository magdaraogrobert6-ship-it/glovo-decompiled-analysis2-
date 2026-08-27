package o;

/* JADX INFO: loaded from: classes4.dex */
public final class runOnUser {
    public final UserJavascriptInterfaceBaseExternalSyntheticLambda12 IconCompatParcelizer;
    public final wouldPushPermissionPromptDisplaylambda3 MediaBrowserCompatMediaItem;
    public final /* synthetic */ r8lambdawhi89LFIaMpCd_VDuYlA8ZBB70U MediaDescriptionCompat;
    public final r8lambdadoClphLDH84V28u6usJH1THq0 RemoteActionCompatParcelizer;
    public setResourcePackageNamelambda0 read;
    public boolean serializer = false;
    public requestPushPermissionPromptlambda3 write;

    public runOnUser(r8lambdawhi89LFIaMpCd_VDuYlA8ZBB70U r8lambdawhi89lfiampcd_vduyla8zbb70u, r8lambdadoClphLDH84V28u6usJH1THq0 r8lambdadoclphldh84v28u6usjh1thq0, BrazeWebViewActivitycreateWebViewClient1 brazeWebViewActivitycreateWebViewClient1, wouldPushPermissionPromptDisplay wouldpushpermissionpromptdisplay) {
        this.MediaDescriptionCompat = r8lambdawhi89lfiampcd_vduyla8zbb70u;
        this.RemoteActionCompatParcelizer = r8lambdadoclphldh84v28u6usjh1thq0;
        this.MediaBrowserCompatMediaItem = brazeWebViewActivitycreateWebViewClient1;
        this.write = wouldpushpermissionpromptdisplay;
        UserJavascriptInterfaceBaseExternalSyntheticLambda12 userJavascriptInterfaceBaseExternalSyntheticLambda12 = new UserJavascriptInterfaceBaseExternalSyntheticLambda12(new r8lambda7fNFoEPKuxoy0sqvCQdnDlsPgJo(1, this));
        this.IconCompatParcelizer = userJavascriptInterfaceBaseExternalSyntheticLambda12;
        this.read = setResourcePackageNamelambda0.CONNECTING;
        userJavascriptInterfaceBaseExternalSyntheticLambda12.IconCompatParcelizer(brazeWebViewActivitycreateWebViewClient1);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address = ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", state = ");
        sb.append(this.read);
        sb.append(", picker type: ");
        sb.append(this.write.getClass());
        sb.append(", lb: ");
        sb.append(this.IconCompatParcelizer.serializer().getClass());
        if (this.serializer) {
            str = ", deactivated";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
