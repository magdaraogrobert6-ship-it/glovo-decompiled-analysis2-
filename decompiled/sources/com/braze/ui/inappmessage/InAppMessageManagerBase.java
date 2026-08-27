package com.braze.ui.inappmessage;

import android.app.Activity;
import android.content.Context;
import bo.app.a5$$ExternalSyntheticLambda4;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageAnimationFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlFullViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageHtmlViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageSlideupViewFactory;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageViewWrapperFactory;
import com.braze.ui.inappmessage.listeners.DefaultHtmlInAppMessageActionListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IHtmlInAppMessageActionListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageManagerListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import java.lang.ref.WeakReference;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public class InAppMessageManagerBase {
    private IInAppMessageManagerListener customControlInAppMessageManagerListener;
    private IHtmlInAppMessageActionListener customHtmlInAppMessageActionListener;
    private IInAppMessageAnimationFactory customInAppMessageAnimationFactory;
    private IInAppMessageManagerListener customInAppMessageManagerListener;
    private IInAppMessageViewFactory customInAppMessageViewFactory;
    private IInAppMessageViewWrapperFactory customInAppMessageViewWrapperFactory;
    private final IHtmlInAppMessageActionListener defaultHtmlInAppMessageActionListener;
    private final IInAppMessageManagerListener defaultInAppMessageManagerListener;
    private final IInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory;
    private boolean doesBackButtonDismissInAppMessageViewField = true;
    private boolean doesClickOutsideModalViewDismissInAppMessageViewField;
    private final IInAppMessageAnimationFactory inAppMessageAnimationFactoryField;
    private final IInAppMessageViewFactory inAppMessageFullViewFactory;
    private final IInAppMessageViewFactory inAppMessageHtmlFullViewFactory;
    private final IInAppMessageViewFactory inAppMessageHtmlViewFactory;
    private final IInAppMessageViewFactory inAppMessageModalViewFactory;
    private final IInAppMessageViewFactory inAppMessageSlideupViewFactory;
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;
    protected WeakReference<Activity> mActivity;
    protected Context mApplicationContext;
    private boolean shouldNextUnregisterBeSkipped;

    public static /* synthetic */ void getDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release$annotations() {
    }

    public static /* synthetic */ void getMActivity$annotations() {
    }

    public static /* synthetic */ void getMApplicationContext$annotations() {
    }

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public boolean getDoesBackButtonDismissInAppMessageView() {
        return this.doesBackButtonDismissInAppMessageViewField;
    }

    public final boolean getDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release() {
        return this.doesBackButtonDismissInAppMessageViewField;
    }

    public boolean getDoesClickOutsideModalViewDismissInAppMessageView() {
        return this.doesClickOutsideModalViewDismissInAppMessageViewField;
    }

    public boolean getShouldNextUnregisterBeSkipped() {
        return this.shouldNextUnregisterBeSkipped;
    }

    public boolean isActivitySet() {
        return getActivity() != null;
    }

    public final void setDoesBackButtonDismissInAppMessageViewField$android_sdk_ui_release(boolean z) {
        this.doesBackButtonDismissInAppMessageViewField = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _set_shouldNextUnregisterBeSkipped_$lambda$0(boolean z) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Setting setShouldNextUnregisterBeSkipped to ", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setBackButtonDismissesInAppMessageView$lambda$0(boolean z) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("In-App Message back button dismissal set to ", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setClickOutsideModalViewDismissInAppMessageView$lambda$0(boolean z) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Modal In-App Message outside tap dismissal set to ", z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomControlInAppMessageManagerListener$lambda$0() {
        return "Custom ControlInAppMessageManagerListener set. This listener will only be used for control in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomHtmlInAppMessageActionListener$lambda$0() {
        return "Custom htmlInAppMessageActionListener set";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomInAppMessageAnimationFactory$lambda$0() {
        return "Custom InAppMessageAnimationFactory set";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomInAppMessageManagerListener$lambda$0() {
        return "Custom InAppMessageManagerListener set";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomInAppMessageViewFactory$lambda$0() {
        return "Custom InAppMessageViewFactory set";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomInAppMessageViewWrapperFactory$lambda$0() {
        return "Custom IInAppMessageViewWrapperFactory set";
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.SLIDEUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public IInAppMessageViewFactory getDefaultInAppMessageViewFactory(IInAppMessage iInAppMessage) {
        iInAppMessage.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[iInAppMessage.getMessageType().ordinal()];
        if (i == 1) {
            return this.inAppMessageSlideupViewFactory;
        }
        if (i == 2) {
            return this.inAppMessageModalViewFactory;
        }
        if (i == 3) {
            return this.inAppMessageFullViewFactory;
        }
        if (i == 4) {
            return this.inAppMessageHtmlFullViewFactory;
        }
        if (i == 5) {
            return this.inAppMessageHtmlViewFactory;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda2(iInAppMessage, 0), 6, (Object) null);
        return null;
    }

    public IInAppMessageViewFactory getInAppMessageViewFactory(IInAppMessage iInAppMessage) {
        iInAppMessage.getClass();
        IInAppMessageViewFactory iInAppMessageViewFactory = this.customInAppMessageViewFactory;
        return iInAppMessageViewFactory == null ? getDefaultInAppMessageViewFactory(iInAppMessage) : iInAppMessageViewFactory;
    }

    public InAppMessageManagerBase() {
        DefaultInAppMessageWebViewClientListener defaultInAppMessageWebViewClientListener = new DefaultInAppMessageWebViewClientListener();
        this.inAppMessageWebViewClientListener = defaultInAppMessageWebViewClientListener;
        this.defaultHtmlInAppMessageActionListener = new DefaultHtmlInAppMessageActionListener();
        this.inAppMessageSlideupViewFactory = new DefaultInAppMessageSlideupViewFactory();
        this.inAppMessageModalViewFactory = new DefaultInAppMessageModalViewFactory();
        this.inAppMessageFullViewFactory = new DefaultInAppMessageFullViewFactory();
        this.inAppMessageHtmlFullViewFactory = new DefaultInAppMessageHtmlFullViewFactory(defaultInAppMessageWebViewClientListener);
        this.inAppMessageHtmlViewFactory = new DefaultInAppMessageHtmlViewFactory(defaultInAppMessageWebViewClientListener);
        this.inAppMessageAnimationFactoryField = new DefaultInAppMessageAnimationFactory();
        this.defaultInAppMessageManagerListener = new DefaultInAppMessageManagerListener();
        this.defaultInAppMessageViewWrapperFactory = new DefaultInAppMessageViewWrapperFactory();
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public IInAppMessageManagerListener getControlInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.customControlInAppMessageManagerListener;
        return iInAppMessageManagerListener == null ? this.defaultInAppMessageManagerListener : iInAppMessageManagerListener;
    }

    public IHtmlInAppMessageActionListener getHtmlInAppMessageActionListener() {
        IHtmlInAppMessageActionListener iHtmlInAppMessageActionListener = this.customHtmlInAppMessageActionListener;
        return iHtmlInAppMessageActionListener == null ? this.defaultHtmlInAppMessageActionListener : iHtmlInAppMessageActionListener;
    }

    public IInAppMessageAnimationFactory getInAppMessageAnimationFactory() {
        IInAppMessageAnimationFactory iInAppMessageAnimationFactory = this.customInAppMessageAnimationFactory;
        return iInAppMessageAnimationFactory == null ? this.inAppMessageAnimationFactoryField : iInAppMessageAnimationFactory;
    }

    public IInAppMessageManagerListener getInAppMessageManagerListener() {
        IInAppMessageManagerListener iInAppMessageManagerListener = this.customInAppMessageManagerListener;
        return iInAppMessageManagerListener == null ? this.defaultInAppMessageManagerListener : iInAppMessageManagerListener;
    }

    public IInAppMessageViewWrapperFactory getInAppMessageViewWrapperFactory() {
        IInAppMessageViewWrapperFactory iInAppMessageViewWrapperFactory = this.customInAppMessageViewWrapperFactory;
        return iInAppMessageViewWrapperFactory == null ? this.defaultInAppMessageViewWrapperFactory : iInAppMessageViewWrapperFactory;
    }

    public void setCustomControlInAppMessageManagerListener(IInAppMessageManagerListener iInAppMessageManagerListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(2), 7, (Object) null);
        this.customControlInAppMessageManagerListener = iInAppMessageManagerListener;
    }

    public void setCustomHtmlInAppMessageActionListener(IHtmlInAppMessageActionListener iHtmlInAppMessageActionListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(3), 7, (Object) null);
        this.customHtmlInAppMessageActionListener = iHtmlInAppMessageActionListener;
    }

    public void setCustomInAppMessageAnimationFactory(IInAppMessageAnimationFactory iInAppMessageAnimationFactory) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(4), 7, (Object) null);
        this.customInAppMessageAnimationFactory = iInAppMessageAnimationFactory;
    }

    public void setCustomInAppMessageManagerListener(IInAppMessageManagerListener iInAppMessageManagerListener) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(0), 7, (Object) null);
        this.customInAppMessageManagerListener = iInAppMessageManagerListener;
    }

    public void setCustomInAppMessageViewFactory(IInAppMessageViewFactory iInAppMessageViewFactory) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(5), 7, (Object) null);
        this.customInAppMessageViewFactory = iInAppMessageViewFactory;
    }

    public void setCustomInAppMessageViewWrapperFactory(IInAppMessageViewWrapperFactory iInAppMessageViewWrapperFactory) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda1(1), 7, (Object) null);
        this.customInAppMessageViewWrapperFactory = iInAppMessageViewWrapperFactory;
    }

    public void setBackButtonDismissesInAppMessageView(boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda4(z, 11), 7, (Object) null);
        this.doesBackButtonDismissInAppMessageViewField = z;
    }

    public void setClickOutsideModalViewDismissInAppMessageView(boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda4(z, 10), 7, (Object) null);
        this.doesClickOutsideModalViewDismissInAppMessageViewField = z;
    }

    public void setShouldNextUnregisterBeSkipped(boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new a5$$ExternalSyntheticLambda4(z, 9), 7, (Object) null);
        this.shouldNextUnregisterBeSkipped = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDefaultInAppMessageViewFactory$lambda$0(IInAppMessage iInAppMessage) {
        return "Failed to find view factory for in-app message with type: " + iInAppMessage.getMessageType();
    }
}
