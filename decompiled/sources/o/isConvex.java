package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class isConvex implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Bundle serializer;

    public /* synthetic */ isConvex(Bundle bundle, int i) {
        this.IconCompatParcelizer = i;
        this.serializer = bundle;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.IconCompatParcelizer;
        Bundle bundle = this.serializer;
        String str = (String) obj;
        if (i != 0 && i != 1) {
            return com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener.Companion.formatQueryBundleForLog$lambda$0(bundle, str);
        }
        str.getClass();
        boolean zContainsKey = bundle.containsKey(str);
        return Boolean.valueOf(!zContainsKey);
    }
}
