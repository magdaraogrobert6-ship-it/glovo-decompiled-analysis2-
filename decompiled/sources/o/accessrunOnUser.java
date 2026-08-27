package o;

/* JADX INFO: loaded from: classes4.dex */
public final class accessrunOnUser implements wouldPushPermissionPromptDisplaylambda4 {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ UserJavascriptInterfaceBaseExternalSyntheticLambda1 RemoteActionCompatParcelizer;
    public final wouldPushPermissionPromptDisplaylambda4 serializer;

    public /* synthetic */ accessrunOnUser(UserJavascriptInterfaceBaseExternalSyntheticLambda1 userJavascriptInterfaceBaseExternalSyntheticLambda1, wouldPushPermissionPromptDisplaylambda4 wouldpushpermissionpromptdisplaylambda4, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = userJavascriptInterfaceBaseExternalSyntheticLambda1;
        this.serializer = wouldpushpermissionpromptdisplaylambda4;
    }

    @Override // o.wouldPushPermissionPromptDisplaylambda4
    public final void write(PackageUtils packageUtils) {
        int i = this.IconCompatParcelizer;
        wouldPushPermissionPromptDisplaylambda4 wouldpushpermissionpromptdisplaylambda4 = this.serializer;
        UserJavascriptInterfaceBaseExternalSyntheticLambda1 userJavascriptInterfaceBaseExternalSyntheticLambda1 = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            wouldpushpermissionpromptdisplaylambda4.write(packageUtils);
            ((UserJavascriptInterfaceBaseCompanion) userJavascriptInterfaceBaseExternalSyntheticLambda1).serializer.write(packageUtils);
            return;
        }
        r8lambdatUS6XQ_eCqvrQ4AX_ZhZEa3usI r8lambdatus6xq_ecqvrq4ax_zhzea3usi = (r8lambdatUS6XQ_eCqvrQ4AX_ZhZEa3usI) userJavascriptInterfaceBaseExternalSyntheticLambda1;
        r8lambdatus6xq_ecqvrq4ax_zhzea3usi.RemoteActionCompatParcelizer = packageUtils;
        if (r8lambdatus6xq_ecqvrq4ax_zhzea3usi.write) {
            return;
        }
        wouldpushpermissionpromptdisplaylambda4.write(packageUtils);
    }
}
