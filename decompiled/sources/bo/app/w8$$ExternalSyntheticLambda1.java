package bo.app;

import com.braze.Braze;
import com.braze.BrazeUser;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w8$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ w8$$ExternalSyntheticLambda1(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                return w8.f(str);
            case 1:
                return w8.a(str);
            case 2:
                return w8.b(str);
            case 3:
                return w8.c(str);
            case 4:
                return w8.d(str);
            case 5:
                return w8.e(str);
            case 6:
                return x4.a(str);
            case 7:
                return xg.c(str);
            case 8:
                return xg.b(str);
            case 9:
                return zc.b(str);
            case 10:
                return zd.a(str);
            case 11:
                return zg.a(str);
            case 12:
                return zg.b(str);
            case 13:
                return Braze.logPushNotificationOpened$lambda$3$1(str);
            case 14:
                return Braze.logPushDelivery$lambda$0(str);
            case 15:
                return Braze.setSdkAuthenticationSignature$lambda$1$0(str);
            case 16:
                return Braze.getFeatureFlag$lambda$0(str);
            case 17:
                return Braze.logBannerClick$lambda$0(str);
            case 18:
                return Braze.dismissBanner$lambda$1$0(str);
            case 19:
                return Braze.logBannerImpression$lambda$0(str);
            case 20:
                return Braze.logPurchase$lambda$0(str);
            case 21:
                return Braze.getBanner$lambda$0(str);
            case 22:
                return Braze.deserializeInAppMessageString$lambda$0(str);
            case 23:
                return Braze.logPushNotificationOpened$lambda$0(str);
            case 24:
                return Braze.dismissBanner$lambda$0(str);
            case 25:
                return Braze.deserializeContentCard$lambda$1(str);
            case 26:
                return Braze.logCustomEvent$lambda$0(str);
            case 27:
                return Braze.setSdkAuthenticationSignature$lambda$0(str);
            case 28:
                return BrazeUser.removeFromCustomAttributeArray$lambda$1(str);
            default:
                return BrazeUser.unsetCustomUserAttribute$lambda$1(str);
        }
    }
}
