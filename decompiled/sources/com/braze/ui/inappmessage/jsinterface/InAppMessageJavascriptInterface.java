package com.braze.ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import coil3.ExtrasKt;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import com.braze.ui.JavascriptInterfaceBase;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class InAppMessageJavascriptInterface extends JavascriptInterfaceBase {
    public static final Companion Companion = new Companion(null);
    private static final long PUSH_PROMPT_INITIAL_DELAY_MS = 75;
    private static final long PUSH_PROMPT_WAIT_DELAY_TIMEOUT_MS = 25;
    private static final long PUSH_PROMPT_WAIT_FOR_DISPLAY_TIMEOUT_MS = 2500;
    private final IInAppMessageHtml inAppMessage;
    private final InAppMessageUserJavascriptInterface user;
    private boolean wasCloseMessageCalled;

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes4.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        int label;

        /* JADX INFO: renamed from: com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface$requestPushPermission$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00131 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
            private /* synthetic */ Object L$0;
            int label;

            public C00131(ShortNewsContentCardView<? super C00131> shortNewsContentCardView) {
                super(2, shortNewsContentCardView);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final String invokeSuspend$lambda$0() {
                return "Waiting for IAM to be fully closed before requesting push prompt";
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
                C00131 c00131 = new C00131(shortNewsContentCardView);
                c00131.L$0 = obj;
                return c00131;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                getContentViewGroupParentLayout getcontentviewgroupparentlayout = (getContentViewGroupParentLayout) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                int i2 = 1;
                if (i == 0) {
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) getcontentviewgroupparentlayout, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageJavascriptInterface$requestPushPermission$1$$ExternalSyntheticLambda0(i2), 6, (Object) null);
                } else {
                    if (i != 1) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ExtrasKt.RemoteActionCompatParcelizer(obj);
                }
                while (BrazeInAppMessageManager.Companion.getInstance().isCurrentlyDisplayingInAppMessage()) {
                    this.L$0 = null;
                    this.label = 1;
                    if (DelayKt.delay(InAppMessageJavascriptInterface.PUSH_PROMPT_WAIT_DELAY_TIMEOUT_MS, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return createFromParcel.INSTANCE;
            }

            @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
            public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
                return ((C00131) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String invokeSuspend$lambda$0() {
            return "Requesting push prompt from Braze bridge html interface";
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(ShortNewsContentCardView<?> shortNewsContentCardView) {
            return InAppMessageJavascriptInterface.this.new AnonymousClass1(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                if (InAppMessageJavascriptInterface.this.getWasCloseMessageCalled()) {
                    C00131 c00131 = new C00131(null);
                    this.label = 1;
                    if (TimeoutKt.withTimeout(InAppMessageJavascriptInterface.PUSH_PROMPT_WAIT_FOR_DISPLAY_TIMEOUT_MS, c00131, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) InAppMessageJavascriptInterface.this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageJavascriptInterface$requestPushPermission$1$$ExternalSyntheticLambda0(0), 6, (Object) null);
            PermissionUtils.requestPushPermissionPrompt(BrazeInAppMessageManager.Companion.getInstance().getActivity());
            return createFromParcel.INSTANCE;
        }

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(1, shortNewsContentCardView);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Object invoke(ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    @JavascriptInterface
    public final void beforeMessageClosed() {
        this.wasCloseMessageCalled = true;
    }

    @JavascriptInterface
    public final InAppMessageUserJavascriptInterface getUser() {
        return this.user;
    }

    public final boolean getWasCloseMessageCalled() {
        return this.wasCloseMessageCalled;
    }

    public final void setWasCloseMessageCalled(boolean z) {
        this.wasCloseMessageCalled = z;
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logButtonClick(String str) {
        if (str != null) {
            this.inAppMessage.logButtonClick(str);
        }
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logClick() {
        this.inAppMessage.logClick();
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        BrazeInAppMessageManager.Companion.getInstance().setShouldNextUnregisterBeSkipped(true);
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(PUSH_PROMPT_INITIAL_DELAY_MS), null, new AnonymousClass1(null), 2, null);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessageJavascriptInterface(Context context, IInAppMessageHtml iInAppMessageHtml) {
        super(context);
        context.getClass();
        iInAppMessageHtml.getClass();
        this.inAppMessage = iInAppMessageHtml;
        this.user = new InAppMessageUserJavascriptInterface(context);
    }
}
