package bo.app;

import com.braze.Braze;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.models.inappmessage.InAppMessageHtmlBase;
import com.braze.push.BrazeFirebaseMessagingService;
import com.braze.push.BrazeNotificationUtils;
import com.braze.push.BrazePushReceiver;
import com.braze.support.WebContentUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ig$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ ig$$ExternalSyntheticLambda1(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$1;
        String str2 = this.f$0;
        switch (i) {
            case 0:
                return ig.b(str2, str);
            case 1:
                return g0.b(str2, str);
            case 2:
                return hg.a(str2, str);
            case 3:
                return ig.a(str2, str);
            case 4:
                return ig.d(str2, str);
            case 5:
                return ig.c(str2, str);
            case 6:
                return m1.b(str2, str);
            case 7:
                return m1.f(str2, str);
            case 8:
                return m1.p(str2, str);
            case 9:
                return m1.r(str2, str);
            case 10:
                return m1.h(str2, str);
            case 11:
                return m1.t(str2, str);
            case 12:
                return m1.l(str2, str);
            case 13:
                return m1.d(str2, str);
            case 14:
                return m1.j(str2, str);
            case 15:
                return m1.n(str2, str);
            case 16:
                return n0.b(str2, str);
            case 17:
                return n0.c(str2, str);
            case 18:
                return n0.a(str2, str);
            case 19:
                return n0.d(str2, str);
            case 20:
                return Braze.addSerializedCardJsonToStorage$lambda$0(str2, str);
            case 21:
                return Braze.addSerializedCardJsonToStorage$lambda$1$0(str2, str);
            case 22:
                return Braze.logPushStoryPageClicked$lambda$0(str2, str);
            case 23:
                return RuntimeAppConfigurationProvider.writeString$lambda$1(str2, str);
            case 24:
                return InAppMessageHtmlBase.logButtonClick$lambda$5(str2, str);
            case 25:
                return BrazeFirebaseMessagingService.Companion.handleBrazeRemoteMessage$lambda$5(str2, str);
            case 26:
                return BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent$lambda$0(str2, str);
            case 27:
                return BrazePushReceiver.Companion.handleAdmRegistrationIntent$lambda$0(str2, str);
            case 28:
                return WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$1(str2, str);
            default:
                return WebContentUtils.getLocalHtmlUrlFromRemoteUrl$lambda$3(str2, str);
        }
    }
}
