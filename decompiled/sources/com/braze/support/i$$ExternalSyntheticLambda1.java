package com.braze.support;

import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.JavascriptInterfaceBase;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ i$$ExternalSyntheticLambda1(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                return i.a(str);
            case 1:
                return BrazeWebViewActivity.C00791.handleUrlOverride$lambda$0(str);
            case 2:
                return BrazeWebViewClient.handleUrlOverride$lambda$0$0(str);
            case 3:
                return JavascriptInterfaceBase.parseProperties$lambda$0(str);
            case 4:
                return JavascriptInterfaceBase.logPurchaseWithJSON$lambda$0(str);
            case 5:
                return JavascriptInterfaceBase.logPurchaseWithJSON$lambda$1(str);
            case 6:
                return UserJavascriptInterfaceBase.setEmailNotificationSubscriptionType$lambda$0(str);
            case 7:
                return UserJavascriptInterfaceBase.setDateOfBirth$lambda$1(str);
            case 8:
                return UserJavascriptInterfaceBase.setDateOfBirth$lambda$2(str);
            case 9:
                return UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$0(str);
            case 10:
                return UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$1(str);
            case 11:
                return UserJavascriptInterfaceBase.incrementCustomUserAttribute$lambda$0(str);
            case 12:
                return UserJavascriptInterfaceBase.setGender$lambda$0(str);
            case 13:
                return UserJavascriptInterfaceBase.setCustomUserAttributeArray$lambda$0(str);
            case 14:
                return UserJavascriptInterfaceBase.setPushNotificationSubscriptionType$lambda$0(str);
            case 15:
                return UserJavascriptInterfaceBase.setDateOfBirth$lambda$0(str);
            case 16:
                return UriAction.getWebViewActivityIntent$lambda$0(str);
            case 17:
                return UriAction.getIntentArrayWithConfiguredBackStack$lambda$1(str);
            case 18:
                return UriAction.getIntentArrayWithConfiguredBackStack$lambda$3(str);
            case 19:
                return BrazeActionParser.getBrazeActionVersionAndJson$lambda$1(str);
            case 20:
                return BrazeActionParser.execute$lambda$2(str);
            case 21:
                return DefaultBannerWebViewClientListener.onOtherUrlAction$lambda$0(str);
            case 22:
                return DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$1(str);
            case 23:
                return DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$2(str);
            case 24:
                return DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$3(str);
            case 25:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithBitmapDownload$lambda$3(str);
            case 26:
                return BackgroundInAppMessagePreparer.handleLocalImage$lambda$0(str);
            case 27:
                return BackgroundInAppMessagePreparer.handleLocalImage$lambda$1(str);
            case 28:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml$lambda$0(str);
            default:
                return BackgroundInAppMessagePreparer.prepareInAppMessageWithZippedAssetHtml$lambda$3(str);
        }
    }
}
