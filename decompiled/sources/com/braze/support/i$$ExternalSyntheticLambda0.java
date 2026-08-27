package com.braze.support;

import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewActivity;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.braze.ui.actions.UriAction;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.actions.brazeactions.steps.BaseBrazeActionStep$Companion$runOnUser$1;
import com.braze.ui.banners.jsinterface.BannerJavascriptInterface;
import com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener;
import com.braze.ui.contentcards.BrazeContentCardUtils;
import com.braze.ui.contentcards.ContentCardsFragment;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ i$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return i.b();
            case 1:
                return i.a();
            case 2:
                return BrazeDeeplinkHandler.createUriActionFromUrlString$lambda$0();
            case 3:
                return BrazeDeeplinkHandler.createUriActionFromUrlString$lambda$1();
            case 4:
                return BrazeWebViewActivity.onCreate$lambda$1();
            case 5:
                return BrazeWebViewActivity.C00791.onRenderProcessGone$lambda$1();
            case 6:
                return BrazeWebViewClient.markPageFinished$lambda$0$0();
            case 7:
                return BrazeWebViewClient.onRenderProcessGone$lambda$0();
            case 8:
                return BrazeWebViewClient.onPageFinished$lambda$0$0();
            case 9:
                return UserJavascriptInterfaceBase.parseStringArrayFromJsonString$lambda$1();
            case 10:
                return UriAction.openUriWithWebViewActivity$lambda$0();
            case 11:
                return UriAction.getIntentArrayWithConfiguredBackStack$lambda$4();
            case 12:
                return UriAction.openUriWithWebViewActivityFromPush$lambda$0();
            case 13:
                return UriAction.getIntentArrayWithConfiguredBackStack$lambda$0();
            case 14:
                return BrazeActionParser.execute$lambda$1();
            case 15:
                return BaseBrazeActionStep$Companion$runOnUser$1.onError$lambda$0();
            case 16:
                return BannerJavascriptInterface.logButtonClick$lambda$0();
            case 17:
                return BannerJavascriptInterface.logClick$lambda$0();
            case 18:
                return BannerJavascriptInterface.requestPushPermission$lambda$0();
            case 19:
                return DefaultBannerWebViewClientListener.onCustomEventAction$lambda$0();
            case 20:
                return BrazeContentCardUtils.handleCardClick$lambda$1();
            case 21:
                return BrazeContentCardUtils.getUriActionForCard$lambda$0();
            case 22:
                return ContentCardsFragment.networkUnavailable$lambda$0();
            case 23:
                return ContentCardsFragment.contentCardsUpdate$lambda$1();
            case 24:
                return ContentCardsFragment.contentCardsUpdate$lambda$2();
            case 25:
                return ContentCardsFragment.onPause$lambda$0();
            case 26:
                return ContentCardAdapter.markOnScreenCardsAsRead$lambda$0();
            case 27:
                return BrazeContentCardsManager.instance_delegate$lambda$0();
            case 28:
                return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$7();
            default:
                return BrazeInAppMessageManager.requestDisplayInAppMessage$lambda$8();
        }
    }
}
