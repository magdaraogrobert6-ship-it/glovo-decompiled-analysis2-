package bo.app;

import android.net.Uri;
import com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ig$$ExternalSyntheticLambda7 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Uri f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ ig$$ExternalSyntheticLambda7(int i, Uri uri, String str) {
        this.$r8$classId = i;
        this.f$0 = uri;
        this.f$1 = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$1;
        Uri uri = this.f$0;
        if (i != 0) {
            return i != 1 ? DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$4(uri, str) : DefaultBannerWebViewClientListener.onOtherUrlAction$lambda$1(uri, str);
        }
        return ig.a(uri, str);
    }
}
