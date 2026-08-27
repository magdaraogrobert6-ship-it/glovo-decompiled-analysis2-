package com.braze.ui.inappmessage;

import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageSlideupViewFactory;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.views.IInAppMessageBackEventListener;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class InAppMessageManagerBase$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ InAppMessageManagerBase$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return InAppMessageManagerBase.setCustomInAppMessageManagerListener$lambda$0();
            case 1:
                return InAppMessageManagerBase.setCustomInAppMessageViewWrapperFactory$lambda$0();
            case 2:
                return InAppMessageManagerBase.setCustomControlInAppMessageManagerListener$lambda$0();
            case 3:
                return InAppMessageManagerBase.setCustomHtmlInAppMessageActionListener$lambda$0();
            case 4:
                return InAppMessageManagerBase.setCustomInAppMessageAnimationFactory$lambda$0();
            case 5:
                return InAppMessageManagerBase.setCustomInAppMessageViewFactory$lambda$0();
            case 6:
                return DefaultInAppMessageHtmlFullViewFactory.createInAppMessageView$lambda$0();
            case 7:
                return DefaultInAppMessageHtmlViewFactory.createInAppMessageView$lambda$0();
            case 8:
                return DefaultInAppMessageModalViewFactory.createInAppMessageView$lambda$1$0();
            case 9:
                return DefaultInAppMessageSlideupViewFactory.createInAppMessageView$lambda$0();
            case 10:
                return DefaultInAppMessageViewLifecycleListener.performClickAction$lambda$0();
            case 11:
                return DefaultInAppMessageViewLifecycleListener.performClickAction$lambda$1();
            case 12:
                return DefaultInAppMessageViewLifecycleListener.performClickAction$lambda$2();
            case 13:
                return DefaultInAppMessageViewLifecycleListener.afterOpened$lambda$0();
            case 14:
                return DefaultInAppMessageViewLifecycleListener.onButtonClicked$lambda$0();
            case 15:
                return DefaultInAppMessageViewLifecycleListener.onDismissed$lambda$0();
            case 16:
                return DefaultInAppMessageViewLifecycleListener.beforeClosed$lambda$0();
            case 17:
                return DefaultInAppMessageViewLifecycleListener.onClicked$lambda$0();
            case 18:
                return DefaultInAppMessageViewLifecycleListener.afterClosed$lambda$0();
            case 19:
                return DefaultInAppMessageViewLifecycleListener.beforeOpened$lambda$0();
            case 20:
                return DefaultInAppMessageWebViewClientListener.onCloseAction$lambda$0();
            case 21:
                return DefaultInAppMessageWebViewClientListener.onCloseAction$lambda$1();
            case 22:
                return DefaultInAppMessageWebViewClientListener.onCustomEventAction$lambda$0();
            case 23:
                return DefaultInAppMessageWebViewClientListener.onCustomEventAction$lambda$1();
            case 24:
                return DefaultInAppMessageWebViewClientListener.onOtherUrlAction$lambda$0();
            case 25:
                return IInAppMessageBackEventListener.onBackStarted$lambda$0();
            case 26:
                return IInAppMessageBackEventListener.onBackInvoked$lambda$0();
            case 27:
                return IInAppMessageBackEventListener.onBackCancelled$lambda$0();
            case 28:
                return InAppMessageFullView.applyDisplayCutoutMarginsToCloseButton$lambda$0();
            default:
                return InAppMessageFullView.resetMessageMargins$lambda$0$0$0();
        }
    }
}
