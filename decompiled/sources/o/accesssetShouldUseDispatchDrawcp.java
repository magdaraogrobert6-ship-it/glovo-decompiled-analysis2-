package o;

/* JADX INFO: loaded from: classes2.dex */
public final class accesssetShouldUseDispatchDrawcp {
    public final /* synthetic */ int IconCompatParcelizer;

    public final String read(accessgetHandwritingSlopjd accessgethandwritingslopjd) {
        String str;
        String str2;
        int i = this.IconCompatParcelizer;
        ViewCompositionStrategy_androidKtinstallForLifecycle2 viewCompositionStrategy_androidKtinstallForLifecycle2 = ViewCompositionStrategy_androidKtinstallForLifecycle2.read;
        ViewCompositionStrategy_androidKtinstallForLifecycle2 viewCompositionStrategy_androidKtinstallForLifecycle3 = ViewCompositionStrategy_androidKtinstallForLifecycle2.serializer;
        ViewCompositionStrategy_androidKtinstallForLifecycle2 viewCompositionStrategy_androidKtinstallForLifecycle4 = ViewCompositionStrategy_androidKtinstallForLifecycle2.IconCompatParcelizer;
        ViewCompositionStrategy_androidKtinstallForLifecycle2 viewCompositionStrategy_androidKtinstallForLifecycle5 = ViewCompositionStrategy_androidKtinstallForLifecycle2.write;
        if (i != 0) {
            if (accessgethandwritingslopjd.read().equals(viewCompositionStrategy_androidKtinstallForLifecycle5)) {
                str2 = "/agcgw_all/CN_back";
            } else if (accessgethandwritingslopjd.read().equals(viewCompositionStrategy_androidKtinstallForLifecycle4)) {
                str2 = "/agcgw_all/RU_back";
            } else if (accessgethandwritingslopjd.read().equals(viewCompositionStrategy_androidKtinstallForLifecycle3)) {
                str2 = "/agcgw_all/DE_back";
            } else {
                if (!accessgethandwritingslopjd.read().equals(viewCompositionStrategy_androidKtinstallForLifecycle2)) {
                    return null;
                }
                str2 = "/agcgw_all/SG_back";
            }
            return accessgethandwritingslopjd.serializer(str2);
        }
        if (accessgethandwritingslopjd.read().equals(viewCompositionStrategy_androidKtinstallForLifecycle5)) {
            str = "/agcgw_all/CN";
        } else if (accessgethandwritingslopjd.read().equals(viewCompositionStrategy_androidKtinstallForLifecycle4)) {
            str = "/agcgw_all/RU";
        } else if (accessgethandwritingslopjd.read().equals(viewCompositionStrategy_androidKtinstallForLifecycle3)) {
            str = "/agcgw_all/DE";
        } else {
            if (!accessgethandwritingslopjd.read().equals(viewCompositionStrategy_androidKtinstallForLifecycle2)) {
                return null;
            }
            str = "/agcgw_all/SG";
        }
        return accessgethandwritingslopjd.serializer(str);
    }
}
