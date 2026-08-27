package com.braze.ui.inappmessage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.webkit.WebView;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import bo.app.d4$$ExternalSyntheticLambda2;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.g0$$ExternalSyntheticLambda1;
import bo.app.o6$$ExternalSyntheticLambda9;
import coil3.ExtrasKt;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.inappmessage.Orientation;
import com.braze.events.BrazeUserChangeEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.InAppMessageEvent;
import com.braze.events.SdkDataWipeEvent;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.InAppMessageImmersiveBase;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.c$$ExternalSyntheticLambda7;
import com.braze.support.i$$ExternalSyntheticLambda0;
import com.braze.ui.actions.brazeactions.BrazeActionUtils;
import com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer;
import com.braze.ui.inappmessage.views.IInAppMessageBackEventListener;
import com.braze.ui.inappmessage.views.IInAppMessageImmersiveView;
import com.braze.ui.inappmessage.views.IInAppMessageView;
import com.braze.ui.inappmessage.views.InAppMessageFullView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.internal.ND$$ExternalSyntheticLambda0;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.onAddedToParentLayer;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint
public class BrazeInAppMessageManager extends InAppMessageManagerBase {
    private static volatile BrazeInAppMessageManager instance;
    private IEventSubscriber<BrazeUserChangeEvent> brazeUserChangeEventSubscriber;
    private IInAppMessage carryoverInAppMessage;
    private BrazeConfigurationProvider configurationProvider;
    private InAppMessageBackEventHandler currentBackEventHandler;
    private String currentUserId;
    private IEventSubscriber<InAppMessageEvent> inAppMessageEventSubscriber;
    private IInAppMessageViewWrapper inAppMessageViewWrapper;
    private Integer originalOrientation;
    private Runnable pendingWebViewPauseRunnable;
    private WebView pendingWebViewPauseTarget;
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;
    private IInAppMessage unregisteredInAppMessage;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock instanceLock = new ReentrantLock();
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener = new DefaultInAppMessageViewLifecycleListener();
    private final InAppMessageActivityTransitionCoordinator activityTransitionCoordinator = new InAppMessageActivityTransitionCoordinator();
    public final AtomicBoolean displayingInAppMessage = new AtomicBoolean(false);
    private final Stack<IInAppMessage> inAppMessageStack = new Stack<>();
    private final Map<IInAppMessage, InAppMessageEvent> inAppMessageEventMap = new LinkedHashMap();

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$hideCurrentlyDisplayingInAppMessage$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ IInAppMessageViewWrapper $inAppMessageWrapperView;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new AnonymousClass1(this.$inAppMessageWrapperView, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            this.$inAppMessageWrapperView.close();
            return createFromParcel.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IInAppMessageViewWrapper iInAppMessageViewWrapper, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$inAppMessageWrapperView = iInAppMessageViewWrapper;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$unregisterInAppMessageManager$2, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public final Boolean invoke(IInAppMessageViewWrapper iInAppMessageViewWrapper) {
            return Boolean.valueOf(((BrazeInAppMessageManager) this.MediaMetadataCompat).resetAfterInAppMessageClose(iInAppMessageViewWrapper));
        }

        public AnonymousClass2(Object obj) {
            super(1, 0, BrazeInAppMessageManager.class, obj, "resetAfterInAppMessageClose", "resetAfterInAppMessageClose(Lcom/braze/ui/inappmessage/IInAppMessageViewWrapper;)Z");
        }
    }

    public static /* synthetic */ void getCarryoverInAppMessage$annotations() {
    }

    public static /* synthetic */ void getDisplayingInAppMessage$annotations() {
    }

    public static /* synthetic */ void getInAppMessageStack$annotations() {
    }

    public static /* synthetic */ void getPendingWebViewPauseRunnable$android_sdk_ui_release$annotations() {
    }

    public static /* synthetic */ void getUnregisteredInAppMessage$annotations() {
    }

    public Object displayInAppMessage(IInAppMessage iInAppMessage, boolean z, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        return displayInAppMessage$suspendImpl(this, iInAppMessage, z, shortNewsContentCardView);
    }

    public final IInAppMessage getCarryoverInAppMessage() {
        return this.carryoverInAppMessage;
    }

    public final Map<IInAppMessage, InAppMessageEvent> getInAppMessageEventMap() {
        return this.inAppMessageEventMap;
    }

    public final Stack<IInAppMessage> getInAppMessageStack() {
        return this.inAppMessageStack;
    }

    public final Runnable getPendingWebViewPauseRunnable$android_sdk_ui_release() {
        return this.pendingWebViewPauseRunnable;
    }

    public final IInAppMessage getUnregisteredInAppMessage() {
        return this.unregisteredInAppMessage;
    }

    public void hideCurrentlyDisplayingInAppMessage(boolean z) {
        setShouldNextUnregisterBeSkipped(false);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper != null) {
            if (z) {
                this.inAppMessageViewLifecycleListener.onDismissed(iInAppMessageViewWrapper.getInAppMessageView(), iInAppMessageViewWrapper.getInAppMessage());
            }
            Object[] objArr = {Looper.myLooper(), Looper.getMainLooper()};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                iInAppMessageViewWrapper.close();
                return;
            }
            BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            BuildersKt.RemoteActionCompatParcelizer(brazeCoroutineScope, MainDispatcherLoader.read, null, new AnonymousClass1(iInAppMessageViewWrapper, null), 2);
        }
    }

    public boolean requestDisplayInAppMessage() {
        InAppMessageOperation inAppMessageOperationBeforeInAppMessageDisplayed;
        int i = 0;
        try {
            WeakReference<Activity> weakReference = this.mActivity;
            Activity activity = weakReference != null ? weakReference.get() : null;
            if (activity == null) {
                if (this.inAppMessageStack.empty()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(27), 7, (Object) null);
                    return false;
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(i), 6, (Object) null);
                this.unregisteredInAppMessage = this.inAppMessageStack.pop();
                return false;
            }
            int i2 = 29;
            if (this.displayingInAppMessage.get()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(i2), 7, (Object) null);
                return false;
            }
            if (this.inAppMessageStack.isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(i), 7, (Object) null);
                return false;
            }
            IInAppMessage iInAppMessagePop = this.inAppMessageStack.pop();
            int i3 = 1;
            if (iInAppMessagePop.isControl()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(i3), 7, (Object) null);
                inAppMessageOperationBeforeInAppMessageDisplayed = getControlInAppMessageManagerListener().beforeInAppMessageDisplayed(iInAppMessagePop);
            } else {
                inAppMessageOperationBeforeInAppMessageDisplayed = getInAppMessageManagerListener().beforeInAppMessageDisplayed(iInAppMessagePop);
            }
            int i4 = WhenMappings.$EnumSwitchMapping$0[inAppMessageOperationBeforeInAppMessageDisplayed.ordinal()];
            int i5 = 2;
            if (i4 == 1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(i5), 7, (Object) null);
                BackgroundInAppMessagePreparer.prepareInAppMessageForDisplay(iInAppMessagePop);
                return true;
            }
            int i6 = 3;
            if (i4 == 2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(i6), 7, (Object) null);
                this.inAppMessageStack.push(iInAppMessagePop);
                return false;
            }
            if (i4 == 3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(28), 7, (Object) null);
                return false;
            }
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(iInAppMessagePop);
            if (inAppMessageEvent == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda2(iInAppMessagePop, i3), 7, (Object) null);
                return false;
            }
            BrazeInternal brazeInternal = BrazeInternal.INSTANCE;
            Context applicationContext = activity.getApplicationContext();
            applicationContext.getClass();
            brazeInternal.reenqueueInAppMessage(applicationContext, inAppMessageEvent);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new i$$ExternalSyntheticLambda0(i2), 7, (Object) null);
            return false;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(19), 4, (Object) null);
            return false;
        }
    }

    public final void setCarryoverInAppMessage(IInAppMessage iInAppMessage) {
        this.carryoverInAppMessage = iInAppMessage;
    }

    public final void setPendingWebViewPauseRunnable$android_sdk_ui_release(Runnable runnable) {
        this.pendingWebViewPauseRunnable = runnable;
    }

    public final void setUnregisteredInAppMessage(IInAppMessage iInAppMessage) {
        this.unregisteredInAppMessage = iInAppMessage;
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.BrazeInAppMessageManager$unregisterInAppMessageManager$3, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        public final void invoke(IInAppMessage iInAppMessage) {
            iInAppMessage.getClass();
            ((IInAppMessageViewLifecycleListener) this.MediaMetadataCompat).afterClosed(iInAppMessage);
        }

        public AnonymousClass3(Object obj) {
            super(1, 0, IInAppMessageViewLifecycleListener.class, obj, "afterClosed", "afterClosed(Lcom/braze/models/inappmessage/IInAppMessage;)V");
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((IInAppMessage) obj);
            return createFromParcel.INSTANCE;
        }
    }

    private final void cancelPendingWebViewPause() {
        Runnable runnable = this.pendingWebViewPauseRunnable;
        WebView webView = this.pendingWebViewPauseTarget;
        if (runnable != null && webView != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(28), 6, (Object) null);
            webView.removeCallbacks(runnable);
        }
        this.pendingWebViewPauseRunnable = null;
        this.pendingWebViewPauseTarget = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cancelPendingWebViewPause$lambda$0() {
        return "Cancelling pendingWebViewPauseRunnable before it runs WebView.onPause";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$1() {
        return "A in-app message is currently being displayed. Adding in-app message back on the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$10() {
        return "Creating view wrapper for in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$11() {
        return "In-app message view includes HTML. Delaying display until the content has finished loading.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void displayInAppMessage$lambda$12(IInAppMessageViewWrapper iInAppMessageViewWrapper, BrazeInAppMessageManager brazeInAppMessageManager, Activity activity) {
        if (iInAppMessageViewWrapper != null) {
            try {
                if (brazeInAppMessageManager.inAppMessageViewWrapper == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(24), 6, (Object) null);
                    brazeInAppMessageManager.inAppMessageViewWrapper = iInAppMessageViewWrapper;
                }
                if (!brazeInAppMessageManager.displayingInAppMessage.get()) {
                    brazeInAppMessageManager.displayingInAppMessage.set(true);
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(25), 7, (Object) null);
                iInAppMessageViewWrapper.open(activity);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(26), 4, (Object) null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$12$0() {
        return "Re-attaching in-app message wrapper after HTML page load.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$12$1() {
        return "Page has finished loading. Opening in-app message view wrapper.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$12$2() {
        return "Failed to open view wrapper in page finished listener";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$2() {
        return "Expiration timestamp not defined. Continuing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$3() {
        return "Not displaying control in-app message. Logging impression and ending display execution.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$4() {
        return "Cannot show message containing an invalid Braze Action.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$5() {
        return "Attempting to perform any fallback actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$6() {
        return "Cannot show message containing a Push Prompt due to existing push prompt status, Android API version, or Target SDK level.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$7() {
        return "Attempting to perform any fallback actions.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$8() {
        return "Creating view wrapper for immersive in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$9() {
        return "Creating view wrapper for base in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$0() {
        return "Removing existing in-app message event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$1() {
        return "Subscribing in-app message event subscriber";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$3() {
        return "Removing existing sdk data wipe event subscriber before subscribing a new one.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$4() {
        return "Subscribing sdk data wipe subscriber";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureSubscribedToInAppMessageEvents$lambda$7() {
        return "Removing existing user change event subscriber before subscribing a new one.";
    }

    public static final BrazeInAppMessageManager getInstance() {
        return Companion.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pauseWebviewIfNecessary$lambda$0() {
        return "Scheduling deferred InAppMessage WebView pause via pendingWebViewPauseRunnable";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pauseWebviewIfNecessary$lambda$1(BrazeInAppMessageManager brazeInAppMessageManager, WebView webView) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(12), 6, (Object) null);
        brazeInAppMessageManager.pendingWebViewPauseRunnable = null;
        brazeInAppMessageManager.pendingWebViewPauseTarget = null;
        IInAppMessageViewWrapper iInAppMessageViewWrapper = brazeInAppMessageManager.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(13), 6, (Object) null);
            return;
        }
        View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
        if (!(inAppMessageView instanceof InAppMessageHtmlBaseView) || ((InAppMessageHtmlBaseView) inAppMessageView).getMessageWebView() != webView) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(15), 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(14), 6, (Object) null);
            webView.onPause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pauseWebviewIfNecessary$lambda$1$0() {
        return "pendingWebViewPauseRunnable running";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pauseWebviewIfNecessary$lambda$1$1() {
        return "pendingWebViewPauseRunnable finished without calling WebView.onPause: in-app message no longer displayed";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pauseWebviewIfNecessary$lambda$1$2() {
        return "pendingWebViewPauseRunnable calling WebView.onPause";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String pauseWebviewIfNecessary$lambda$1$3() {
        return "pendingWebViewPauseRunnable finished without calling WebView.onPause: HTML WebView no longer matches";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$0() {
        return "Null Activity passed to registerInAppMessageManager. Doing nothing";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$2() {
        return "Activity had null applicationContext in registerInAppMessageManager. Doing Nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$4$0() {
        return "Requesting display of carryover in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$5$0() {
        return "Adding previously unregistered in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$7() {
        return "Error while calling attempting to register the InAppMessageManager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$0() {
        return "No activity is currently registered to receive in-app messages. Saving in-app message as unregistered in-app message. It will automatically be displayed when the next activity registers to receive in-app messages.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$1() {
        return "No activity is currently registered to receive in-app messages and the in-app message stack is empty. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$10() {
        return "Error running requestDisplayInAppMessage";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$2() {
        return "A in-app message is currently being displayed. Ignoring request to display in-app message.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$3() {
        return "The in-app message stack is empty. No in-app message will be displayed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$4() {
        return "Using the control in-app message manager listener.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$5() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_NOW. The in-app message will be displayed.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$6() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISPLAY_LATER. The in-app message will be pushed back onto the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$7() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned DISCARD. The in-app message will not be displayed and will not be put back on the stack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$8() {
        return "The IInAppMessageManagerListener method beforeInAppMessageDisplayed returned REENQUEUE. The in-app message will not be displayed and will be marked as eligible for next time.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetAfterInAppMessageClose$lambda$0() {
        return "Skipping manager reset for stale in-app message wrapper close.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetAfterInAppMessageClose$lambda$1() {
        return "Resetting after in-app message close.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resumeWebviewIfNecessary$lambda$0() {
        return "Resuming InAppMessage WebView";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$0(Activity activity) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Skipping unregistration due to setShouldNextUnregisterBeSkipped being true. Activity: ", activity != null ? activity.getLocalClassName() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unregisterInAppMessageManager$lambda$1() {
        return "Error while calling attempting to unregister the InAppMessageManager";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$0() {
        return "Cannot verify orientation status with null Activity.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$1() {
        return "Running on tablet. In-app message can be displayed in any orientation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$2() {
        return "Any orientation specified. In-app message can be displayed in any orientation.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String verifyOrientationStatus$lambda$3() {
        return "Requesting orientation lock.";
    }

    public void addInAppMessage(IInAppMessage iInAppMessage) {
        if (iInAppMessage != null) {
            this.inAppMessageStack.push(iInAppMessage);
            requestDisplayInAppMessage();
        }
    }

    public boolean getIsCurrentlyDisplayingInAppMessage() {
        return this.displayingInAppMessage.get();
    }

    public final boolean isCurrentlyDisplayingInAppMessage() {
        return this.displayingInAppMessage.get();
    }

    public final void pauseWebviewIfNecessary$android_sdk_ui_release() {
        WebView messageWebView;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new onAddedToParentLayer(7), 6, (Object) null);
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper == null) {
            return;
        }
        View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
        if ((inAppMessageView instanceof InAppMessageHtmlBaseView) && (messageWebView = ((InAppMessageHtmlBaseView) inAppMessageView).getMessageWebView()) != null) {
            cancelPendingWebViewPause();
            ND$$ExternalSyntheticLambda0 nD$$ExternalSyntheticLambda0 = new ND$$ExternalSyntheticLambda0(this, 6, messageWebView);
            this.pendingWebViewPauseRunnable = nD$$ExternalSyntheticLambda0;
            this.pendingWebViewPauseTarget = messageWebView;
            messageWebView.post(nD$$ExternalSyntheticLambda0);
        }
    }

    public void registerInAppMessageManager(Activity activity) {
        try {
            if (activity == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(25), 6, (Object) null);
                return;
            }
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda0(activity, 1), 6, (Object) null);
            this.mActivity = new WeakReference<>(activity);
            if (this.mApplicationContext == null) {
                Context applicationContext = activity.getApplicationContext();
                this.mApplicationContext = applicationContext;
                if (applicationContext == null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(26), 6, (Object) null);
                    return;
                }
            }
            if (this.configurationProvider == null) {
                Context context = this.mApplicationContext;
                this.configurationProvider = context != null ? new BrazeConfigurationProvider(context) : null;
            }
            IInAppMessage iInAppMessage = this.carryoverInAppMessage;
            if (iInAppMessage != null) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(27), 7, (Object) null);
                iInAppMessage.setAnimateIn(false);
                BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                BuildersKt.RemoteActionCompatParcelizer(brazeCoroutineScope, MainDispatcherLoader.read, null, new BrazeInAppMessageManager$registerInAppMessageManager$5$2(this, iInAppMessage, null), 2);
                this.carryoverInAppMessage = null;
            } else {
                IInAppMessage iInAppMessage2 = this.unregisteredInAppMessage;
                if (iInAppMessage2 != null) {
                    BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(28), 7, (Object) null);
                    addInAppMessage(iInAppMessage2);
                    this.unregisteredInAppMessage = null;
                }
            }
            Context context2 = this.mApplicationContext;
            if (context2 != null) {
                ensureSubscribedToInAppMessageEvents(context2);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new c$$ExternalSyntheticLambda7(29), 4, (Object) null);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void setTestingInstance$android_sdk_ui_release(BrazeInAppMessageManager brazeInAppMessageManager) {
            BrazeInAppMessageManager.instance = brazeInAppMessageManager;
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean containsPushPermissionPrompt(IInAppMessage iInAppMessage) {
            return iInAppMessage instanceof InAppMessageHtml ? ((InAppMessageHtml) iInAppMessage).isPushPrimer() : BrazeActionUtils.containsAnyPushPermissionBrazeActions(iInAppMessage);
        }

        public final BrazeInAppMessageManager getInstance() {
            if (BrazeInAppMessageManager.instance != null) {
                BrazeInAppMessageManager brazeInAppMessageManager = BrazeInAppMessageManager.instance;
                brazeInAppMessageManager.getClass();
                return brazeInAppMessageManager;
            }
            ReentrantLock reentrantLock = BrazeInAppMessageManager.instanceLock;
            reentrantLock.lock();
            try {
                if (BrazeInAppMessageManager.instance == null) {
                    BrazeInAppMessageManager.instance = new BrazeInAppMessageManager();
                }
                reentrantLock.unlock();
                BrazeInAppMessageManager brazeInAppMessageManager2 = BrazeInAppMessageManager.instance;
                brazeInAppMessageManager2.getClass();
                return brazeInAppMessageManager2;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InAppMessageOperation.values().length];
            try {
                iArr[InAppMessageOperation.DISPLAY_NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppMessageOperation.DISPLAY_LATER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppMessageOperation.DISCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppMessageOperation.REENQUEUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createBrazeUserChangeEventSubscriber$lambda$0(BrazeInAppMessageManager brazeInAppMessageManager, BrazeUserChangeEvent brazeUserChangeEvent) {
        brazeUserChangeEvent.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new g0$$ExternalSyntheticLambda1(brazeUserChangeEvent, 2), 6, (Object) null);
        String str = brazeInAppMessageManager.currentUserId;
        brazeInAppMessageManager.currentUserId = brazeUserChangeEvent.getCurrentUserId();
        if (str == null || str.equals(brazeUserChangeEvent.getCurrentUserId())) {
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new d4$$ExternalSyntheticLambda2(str, 18, brazeUserChangeEvent), 7, (Object) null);
        if (brazeInAppMessageManager.displayingInAppMessage.get()) {
            brazeInAppMessageManager.hideCurrentlyDisplayingInAppMessage(false);
        }
        brazeInAppMessageManager.inAppMessageStack.clear();
        brazeInAppMessageManager.inAppMessageEventMap.clear();
        brazeInAppMessageManager.carryoverInAppMessage = null;
        brazeInAppMessageManager.unregisteredInAppMessage = null;
    }

    private final IEventSubscriber<InAppMessageEvent> createInAppMessageEventSubscriber() {
        return new BrazeInAppMessageManager$$ExternalSyntheticLambda45(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createInAppMessageEventSubscriber$lambda$0(BrazeInAppMessageManager brazeInAppMessageManager, InAppMessageEvent inAppMessageEvent) {
        inAppMessageEvent.getClass();
        IInAppMessage inAppMessage = inAppMessageEvent.getInAppMessage();
        brazeInAppMessageManager.inAppMessageEventMap.put(inAppMessage, inAppMessageEvent);
        brazeInAppMessageManager.addInAppMessage(inAppMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ensureSubscribedToInAppMessageEvents$lambda$5(BrazeInAppMessageManager brazeInAppMessageManager, SdkDataWipeEvent sdkDataWipeEvent) {
        sdkDataWipeEvent.getClass();
        if (brazeInAppMessageManager.displayingInAppMessage.get()) {
            brazeInAppMessageManager.hideCurrentlyDisplayingInAppMessage(false);
        }
        brazeInAppMessageManager.inAppMessageStack.clear();
        brazeInAppMessageManager.carryoverInAppMessage = null;
        brazeInAppMessageManager.unregisteredInAppMessage = null;
    }

    public final IEventSubscriber<BrazeUserChangeEvent> createBrazeUserChangeEventSubscriber$android_sdk_ui_release() {
        return new BrazeInAppMessageManager$$ExternalSyntheticLambda45(this, 0);
    }

    public void ensureSubscribedToInAppMessageEvents(Context context) {
        context.getClass();
        int i = 2;
        if (this.inAppMessageEventSubscriber != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new onAddedToParentLayer(i), 7, (Object) null);
            Braze.Companion.getInstance(context).removeSingleSubscription(this.inAppMessageEventSubscriber, InAppMessageEvent.class);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new onAddedToParentLayer(3), 7, (Object) null);
        IEventSubscriber<InAppMessageEvent> iEventSubscriberCreateInAppMessageEventSubscriber = createInAppMessageEventSubscriber();
        Braze.Companion companion = Braze.Companion;
        companion.getInstance(context).subscribeToNewInAppMessages(iEventSubscriberCreateInAppMessageEventSubscriber);
        this.inAppMessageEventSubscriber = iEventSubscriberCreateInAppMessageEventSubscriber;
        if (this.sdkDataWipeEventSubscriber != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new onAddedToParentLayer(4), 6, (Object) null);
            companion.getInstance(context).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        }
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new onAddedToParentLayer(5), 6, (Object) null);
        BrazeInAppMessageManager$$ExternalSyntheticLambda45 brazeInAppMessageManager$$ExternalSyntheticLambda45 = new BrazeInAppMessageManager$$ExternalSyntheticLambda45(this, i);
        companion.getInstance(context).addSingleSynchronousSubscription(brazeInAppMessageManager$$ExternalSyntheticLambda45, SdkDataWipeEvent.class);
        this.sdkDataWipeEventSubscriber = brazeInAppMessageManager$$ExternalSyntheticLambda45;
        if (this.brazeUserChangeEventSubscriber != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new onAddedToParentLayer(6), 6, (Object) null);
            companion.getInstance(context).removeSingleSubscription(this.brazeUserChangeEventSubscriber, BrazeUserChangeEvent.class);
        }
        IEventSubscriber<BrazeUserChangeEvent> iEventSubscriberCreateBrazeUserChangeEventSubscriber$android_sdk_ui_release = createBrazeUserChangeEventSubscriber$android_sdk_ui_release();
        companion.getInstance(context).subscribeToChangeUserEvents(iEventSubscriberCreateBrazeUserChangeEventSubscriber$android_sdk_ui_release);
        this.brazeUserChangeEventSubscriber = iEventSubscriberCreateBrazeUserChangeEventSubscriber$android_sdk_ui_release;
    }

    public boolean resetAfterInAppMessageClose(IInAppMessageViewWrapper iInAppMessageViewWrapper) {
        if (iInAppMessageViewWrapper != null && this.inAppMessageViewWrapper != iInAppMessageViewWrapper) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(17), 7, (Object) null);
            return false;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(18), 6, (Object) null);
        InAppMessageBackEventHandler inAppMessageBackEventHandler = this.currentBackEventHandler;
        if (inAppMessageBackEventHandler != null) {
            inAppMessageBackEventHandler.unregister();
        }
        this.currentBackEventHandler = null;
        cancelPendingWebViewPause();
        this.inAppMessageViewWrapper = null;
        WeakReference<Activity> weakReference = this.mActivity;
        Activity activity = weakReference != null ? weakReference.get() : null;
        Integer num = this.originalOrientation;
        this.displayingInAppMessage.set(false);
        if (activity == null || num == null) {
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new o6$$ExternalSyntheticLambda9(num, 2), 7, (Object) null);
        ViewUtils.setActivityRequestedOrientation(activity, num.intValue());
        this.originalOrientation = null;
        return true;
    }

    @SuppressLint
    public boolean verifyOrientationStatus(IInAppMessage iInAppMessage) {
        iInAppMessage.getClass();
        WeakReference<Activity> weakReference = this.mActivity;
        Activity activity = weakReference != null ? weakReference.get() : null;
        Orientation orientation = iInAppMessage.getOrientation();
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(20), 6, (Object) null);
            return true;
        }
        if (ViewUtils.isRunningOnTablet(activity)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(21), 7, (Object) null);
            return true;
        }
        if (orientation == Orientation.ANY) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(22), 7, (Object) null);
            return true;
        }
        if (!ViewUtils.isCurrentOrientationValid(activity.getResources().getConfiguration().orientation, orientation)) {
            return false;
        }
        if (this.originalOrientation == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(23), 7, (Object) null);
            this.originalOrientation = Integer.valueOf(activity.getRequestedOrientation());
            ViewUtils.setActivityRequestedOrientation(activity, 14);
        }
        return true;
    }

    private final void applyUnregisterDisplayedMessageResult(InAppMessageActivityTransitionCoordinator.UnregisterDisplayedMessageResult unregisterDisplayedMessageResult) {
        this.carryoverInAppMessage = unregisterDisplayedMessageResult.getCarryoverInAppMessage();
        if (unregisterDisplayedMessageResult.getShouldClearActiveWrapper()) {
            InAppMessageBackEventHandler inAppMessageBackEventHandler = this.currentBackEventHandler;
            if (inAppMessageBackEventHandler != null) {
                inAppMessageBackEventHandler.unregister();
            }
            this.currentBackEventHandler = null;
            cancelPendingWebViewPause();
            this.inAppMessageViewWrapper = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$0(IInAppMessage iInAppMessage) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Attempting to display in-app message with payload: ", JsonUtils.getPrettyPrintedString(iInAppMessage.forJsonPut()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String displayInAppMessage$lambda$13(IInAppMessage iInAppMessage) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Could not display in-app message with payload: ", JsonUtils.getPrettyPrintedString(iInAppMessage.forJsonPut()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestDisplayInAppMessage$lambda$9(IInAppMessage iInAppMessage) {
        return "An in-app message was requested to be re-enqueued, but it was not found. Discarding instead. In-app message = " + iInAppMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetAfterInAppMessageClose$lambda$2(Integer num) {
        return "Setting requested orientation to original orientation " + num;
    }

    /* JADX WARN: Code duplicated, block: B:96:0x02a2 A[Catch: all -> 0x0317, TryCatch #7 {all -> 0x0317, blocks: (B:94:0x029c, B:96:0x02a2, B:100:0x02c6, B:102:0x02ca, B:104:0x02d0, B:99:0x02c3, B:92:0x027b, B:111:0x02e4, B:112:0x02ec, B:113:0x02ed, B:114:0x02f5, B:115:0x02f6, B:116:0x02fe, B:121:0x0305, B:122:0x030d, B:123:0x030e, B:124:0x0316), top: B:152:0x0093 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c3 A[Catch: all -> 0x0317, TryCatch #7 {all -> 0x0317, blocks: (B:94:0x029c, B:96:0x02a2, B:100:0x02c6, B:102:0x02ca, B:104:0x02d0, B:99:0x02c3, B:92:0x027b, B:111:0x02e4, B:112:0x02ec, B:113:0x02ed, B:114:0x02f5, B:115:0x02f6, B:116:0x02fe, B:121:0x0305, B:122:0x030d, B:123:0x030e, B:124:0x0316), top: B:152:0x0093 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.braze.models.inappmessage.IInAppMessage, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.braze.ui.inappmessage.IInAppMessageViewWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.braze.ui.inappmessage.IInAppMessageViewWrapperFactory] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v24, types: [com.braze.ui.inappmessage.IInAppMessageViewFactory] */
    /* JADX WARN: Type inference failed for: r1v29, types: [com.braze.ui.inappmessage.IInAppMessageAnimationFactory] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v30, types: [com.braze.ui.inappmessage.IInAppMessageAnimationFactory] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.braze.models.inappmessage.IInAppMessage] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v74, types: [com.braze.models.inappmessage.IInAppMessage] */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.braze.ui.inappmessage.BrazeInAppMessageManager, com.braze.ui.inappmessage.InAppMessageManagerBase, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v8 */
    public static /* synthetic */ Object displayInAppMessage$suspendImpl(BrazeInAppMessageManager brazeInAppMessageManager, IInAppMessage iInAppMessage, boolean z, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
        ?? r1;
        ?? r15;
        Throwable th;
        ?? r2;
        Object obj;
        Activity activity;
        int i;
        ?? r5;
        IInAppMessageViewWrapper iInAppMessageViewWrapperCreateInAppMessageViewWrapper;
        int i2;
        int i3;
        Activity activity2;
        ?? r12;
        IInAppMessageViewWrapper iInAppMessageViewWrapperCreateInAppMessageViewWrapper2;
        ?? r13;
        IInAppMessageViewWrapper iInAppMessageViewWrapper;
        ?? r16 = iInAppMessage;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda2(r16, 2), 6, (Object) null);
        int i4 = 1;
        boolean zCompareAndSet = brazeInAppMessageManager.displayingInAppMessage.compareAndSet(false, true);
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        int i5 = 3;
        if (!zCompareAndSet) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(i5), 7, (Object) null);
            ((BrazeInAppMessageManager) brazeInAppMessageManager).inAppMessageStack.push((IInAppMessage) r16);
            return createfromparcel;
        }
        try {
            WeakReference<Activity> weakReference = brazeInAppMessageManager.mActivity;
            if (weakReference != null) {
                try {
                    activity = weakReference.get();
                } catch (Throwable th2) {
                    th = th2;
                    obj = null;
                    th = th;
                    r2 = r16;
                    r15 = obj;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda2(r2, 3), 4, (Object) null);
                    resetAfterInAppMessageClose$default(brazeInAppMessageManager, r15, i4, r15);
                    return createfromparcel;
                }
            } else {
                activity = null;
            }
            if (activity != null) {
                try {
                    long expirationTimestamp = iInAppMessage.getExpirationTimestamp();
                    if (expirationTimestamp > 0) {
                        long jNowInMilliseconds = DateTimeUtils.nowInMilliseconds();
                        int i6 = (jNowInMilliseconds > expirationTimestamp ? 1 : (jNowInMilliseconds == expirationTimestamp ? 0 : -1));
                        if (i6 > 0) {
                            throw new Exception("In-app message is expired. Doing nothing. Expiration: " + expirationTimestamp + ". Current time: " + jNowInMilliseconds);
                        }
                        i = i6;
                    } else {
                        i = 0;
                        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(4), 7, (Object) null);
                    }
                    try {
                        if (brazeInAppMessageManager.verifyOrientationStatus(iInAppMessage)) {
                            BrazeConfigurationProvider brazeConfigurationProvider = ((BrazeInAppMessageManager) brazeInAppMessageManager).configurationProvider;
                            if (brazeConfigurationProvider != null) {
                                if (!brazeInAppMessageManager.isInAppMessageForTheSameUser(r16, ((BrazeInAppMessageManager) brazeInAppMessageManager).currentUserId)) {
                                    String str = ((BrazeInAppMessageManager) brazeInAppMessageManager).currentUserId;
                                    InAppMessageEvent inAppMessageEvent = ((BrazeInAppMessageManager) brazeInAppMessageManager).inAppMessageEventMap.get(r16);
                                    throw new Exception("The last identified user '" + str + "' does not match the incoming in-app message's user '" + (inAppMessageEvent != null ? inAppMessageEvent.getUserId() : null) + "'. The in-app message will not be displayed and will not be put back on the stack.");
                                }
                                if (iInAppMessage.isControl()) {
                                    BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(5), 7, (Object) null);
                                    iInAppMessage.logImpression();
                                    resetAfterInAppMessageClose$default(brazeInAppMessageManager, null, 1, null);
                                    return createfromparcel;
                                }
                                int i7 = 7;
                                try {
                                    if (BrazeActionUtils.containsInvalidBrazeAction(iInAppMessage)) {
                                        InAppMessageEvent inAppMessageEvent2 = ((BrazeInAppMessageManager) brazeInAppMessageManager).inAppMessageEventMap.get(r16);
                                        BrazeLogger.Priority priority = BrazeLogger.Priority.I;
                                        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(6), 6, (Object) null);
                                        if (inAppMessageEvent2 != null) {
                                            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, priority, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(i7), 6, (Object) null);
                                            Context applicationContext = activity.getApplicationContext();
                                            applicationContext.getClass();
                                            BrazeInternal.retryInAppMessage(applicationContext, inAppMessageEvent2);
                                        }
                                        resetAfterInAppMessageClose$default(brazeInAppMessageManager, null, 1, null);
                                        return createfromparcel;
                                    }
                                    try {
                                        if (Companion.containsPushPermissionPrompt(r16) && !PermissionUtils.wouldPushPermissionPromptDisplay(activity)) {
                                            InAppMessageEvent inAppMessageEvent3 = ((BrazeInAppMessageManager) brazeInAppMessageManager).inAppMessageEventMap.get(r16);
                                            BrazeLogger.Priority priority2 = BrazeLogger.Priority.I;
                                            BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, priority2, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(8), 6, (Object) null);
                                            if (inAppMessageEvent3 != null) {
                                                BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, priority2, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(9), 6, (Object) null);
                                                Context applicationContext2 = activity.getApplicationContext();
                                                applicationContext2.getClass();
                                                BrazeInternal.retryInAppMessage(applicationContext2, inAppMessageEvent3);
                                            }
                                            obj = null;
                                            try {
                                                resetAfterInAppMessageClose$default(brazeInAppMessageManager, null, 1, null);
                                                return createfromparcel;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                th = th;
                                                r2 = r16;
                                                r15 = obj;
                                                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda2(r2, 3), 4, (Object) null);
                                                resetAfterInAppMessageClose$default(brazeInAppMessageManager, r15, i4, r15);
                                                return createfromparcel;
                                            }
                                        }
                                        try {
                                            ?? inAppMessageViewFactory = brazeInAppMessageManager.getInAppMessageViewFactory(iInAppMessage);
                                            if (inAppMessageViewFactory != 0) {
                                                ?? CreateInAppMessageView = inAppMessageViewFactory.createInAppMessageView(activity, r16);
                                                if (CreateInAppMessageView != 0) {
                                                    if (CreateInAppMessageView.getParent() == null) {
                                                        Animation openingAnimation = brazeInAppMessageManager.getInAppMessageAnimationFactory().getOpeningAnimation(r16);
                                                        Animation closingAnimation = brazeInAppMessageManager.getInAppMessageAnimationFactory().getClosingAnimation(r16);
                                                        ?? inAppMessageViewWrapperFactory = brazeInAppMessageManager.getInAppMessageViewWrapperFactory();
                                                        try {
                                                            if (CreateInAppMessageView instanceof IInAppMessageImmersiveView) {
                                                                try {
                                                                    try {
                                                                        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(10), 7, (Object) null);
                                                                        IInAppMessageImmersiveView iInAppMessageImmersiveView = (IInAppMessageImmersiveView) CreateInAppMessageView;
                                                                        Activity activity3 = activity;
                                                                        iInAppMessageViewWrapperCreateInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(CreateInAppMessageView, iInAppMessage, ((BrazeInAppMessageManager) brazeInAppMessageManager).inAppMessageViewLifecycleListener, brazeConfigurationProvider, openingAnimation, closingAnimation, iInAppMessageImmersiveView.getMessageClickableView(), iInAppMessageImmersiveView.getMessageButtonViews(((InAppMessageImmersiveBase) r16).getMessageButtons().size()), iInAppMessageImmersiveView.getMessageCloseButtonView());
                                                                        i2 = 2;
                                                                        i3 = 7;
                                                                        activity2 = activity3;
                                                                        r12 = CreateInAppMessageView;
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        r5 = 0;
                                                                        r16 = r5;
                                                                        i4 = 1;
                                                                        r1 = iInAppMessage;
                                                                        th = th;
                                                                        r2 = r1;
                                                                        r15 = r16;
                                                                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda2(r2, 3), 4, (Object) null);
                                                                        resetAfterInAppMessageClose$default(brazeInAppMessageManager, r15, i4, r15);
                                                                        return createfromparcel;
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    r5 = 0;
                                                                }
                                                            } else {
                                                                Activity activity4 = activity;
                                                                try {
                                                                    if (CreateInAppMessageView instanceof IInAppMessageView) {
                                                                        i2 = 2;
                                                                        i3 = 7;
                                                                        activity2 = activity4;
                                                                        ?? r14 = CreateInAppMessageView;
                                                                        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(11), 7, (Object) null);
                                                                        iInAppMessageViewWrapperCreateInAppMessageViewWrapper2 = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(r14, iInAppMessage, ((BrazeInAppMessageManager) brazeInAppMessageManager).inAppMessageViewLifecycleListener, brazeConfigurationProvider, openingAnimation, closingAnimation, ((IInAppMessageView) r14).getMessageClickableView());
                                                                        r13 = r14;
                                                                    } else {
                                                                        i2 = 2;
                                                                        i3 = 7;
                                                                        activity2 = activity4;
                                                                        ?? r17 = CreateInAppMessageView;
                                                                        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(1), 7, (Object) null);
                                                                        iInAppMessageViewWrapperCreateInAppMessageViewWrapper = inAppMessageViewWrapperFactory.createInAppMessageViewWrapper(r17, iInAppMessage, ((BrazeInAppMessageManager) brazeInAppMessageManager).inAppMessageViewLifecycleListener, brazeConfigurationProvider, openingAnimation, closingAnimation, r17);
                                                                        r12 = r17;
                                                                    }
                                                                    ((BrazeInAppMessageManager) brazeInAppMessageManager).inAppMessageViewWrapper = iInAppMessageViewWrapperCreateInAppMessageViewWrapper2;
                                                                    if (r13 instanceof InAppMessageHtmlBaseView) {
                                                                        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(i2), 7, (Object) null);
                                                                        ((InAppMessageHtmlBaseView) r13).setHtmlPageFinishedListener(new PreviewView$1$$ExternalSyntheticLambda2(iInAppMessageViewWrapperCreateInAppMessageViewWrapper2, brazeInAppMessageManager, activity2, i3));
                                                                    } else {
                                                                        iInAppMessageViewWrapper = iInAppMessageViewWrapperCreateInAppMessageViewWrapper2;
                                                                        if (iInAppMessageViewWrapper != null) {
                                                                            iInAppMessageViewWrapper.open(activity2);
                                                                        }
                                                                    }
                                                                    if ((r13 instanceof InAppMessageFullView) && Build.VERSION.SDK_INT >= 34) {
                                                                        ((BrazeInAppMessageManager) brazeInAppMessageManager).currentBackEventHandler = new InAppMessageBackEventHandler(activity2, (IInAppMessageBackEventListener) r13);
                                                                    }
                                                                    return createfromparcel;
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    r16 = r16;
                                                                    i4 = 1;
                                                                    r1 = iInAppMessage;
                                                                    th = th;
                                                                    r2 = r1;
                                                                    r15 = r16;
                                                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda2(r2, 3), 4, (Object) null);
                                                                    resetAfterInAppMessageClose$default(brazeInAppMessageManager, r15, i4, r15);
                                                                    return createfromparcel;
                                                                }
                                                            }
                                                            iInAppMessageViewWrapperCreateInAppMessageViewWrapper2 = iInAppMessageViewWrapperCreateInAppMessageViewWrapper;
                                                            r13 = r12;
                                                            ((BrazeInAppMessageManager) brazeInAppMessageManager).inAppMessageViewWrapper = iInAppMessageViewWrapperCreateInAppMessageViewWrapper2;
                                                            if (r13 instanceof InAppMessageHtmlBaseView) {
                                                                BrazeLogger.brazelog$default(brazeLogger, (Object) brazeInAppMessageManager, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(i2), 7, (Object) null);
                                                                ((InAppMessageHtmlBaseView) r13).setHtmlPageFinishedListener(new PreviewView$1$$ExternalSyntheticLambda2(iInAppMessageViewWrapperCreateInAppMessageViewWrapper2, brazeInAppMessageManager, activity2, i3));
                                                            } else {
                                                                iInAppMessageViewWrapper = iInAppMessageViewWrapperCreateInAppMessageViewWrapper2;
                                                                if (iInAppMessageViewWrapper != null) {
                                                                    iInAppMessageViewWrapper.open(activity2);
                                                                }
                                                            }
                                                            if (r13 instanceof InAppMessageFullView) {
                                                                ((BrazeInAppMessageManager) brazeInAppMessageManager).currentBackEventHandler = new InAppMessageBackEventHandler(activity2, (IInAppMessageBackEventListener) r13);
                                                            }
                                                            return createfromparcel;
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            r5 = i;
                                                        }
                                                    } else {
                                                        throw new Exception("The in-app message view returned from the IInAppMessageViewFactory already has a parent. This is a sign that the view is being reused. The IInAppMessageViewFactory method createInAppMessageViewmust return a new view without a parent. The in-app message will not be displayed and will not be put back on the stack.");
                                                    }
                                                } else {
                                                    throw new Exception("The in-app message view returned from the IInAppMessageViewFactory was null. The in-app message will not be displayed and will not be put back on the stack.");
                                                }
                                            } else {
                                                throw new Exception("ViewFactory from getInAppMessageViewFactory was null.");
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            r16 = 0;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        r16 = 0;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    obj = null;
                                }
                            } else {
                                throw new Exception("configurationProvider is null. The in-app message will not be displayed and will not beput back on the stack.");
                            }
                        } else {
                            throw new Exception("Current orientation did not match specified orientation for in-app message. Doing nothing.");
                        }
                    } catch (Throwable th11) {
                        th = th11;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    r16 = 0;
                }
                r1 = iInAppMessage;
            } else {
                r1 = r16;
                r16 = 0;
                try {
                    ((BrazeInAppMessageManager) brazeInAppMessageManager).carryoverInAppMessage = r1;
                    throw new Exception("No Activity is currently registered to receive in-app messages. Registering in-app message as carry-over in-app message. It will automatically be displayed when the next Activity registers to receive in-app messages.");
                } catch (Throwable th13) {
                    th = th13;
                }
            }
        } catch (Throwable th14) {
            th = th14;
            r1 = r16;
            r16 = 0;
        }
        th = th;
        r2 = r1;
        r15 = r16;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeInAppMessageManager, BrazeLogger.Priority.E, th, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new InAppMessageManagerBase$$ExternalSyntheticLambda2(r2, 3), 4, (Object) null);
        resetAfterInAppMessageClose$default(brazeInAppMessageManager, r15, i4, r15);
        return createfromparcel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String registerInAppMessageManager$lambda$1(Activity activity) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Registering InAppMessageManager with activity: ", activity.getLocalClassName());
    }

    public boolean isInAppMessageForTheSameUser(IInAppMessage iInAppMessage, String str) {
        if (iInAppMessage == null || str == null) {
            return true;
        }
        InAppMessageEvent inAppMessageEvent = this.inAppMessageEventMap.get(iInAppMessage);
        String userId = inAppMessageEvent != null ? inAppMessageEvent.getUserId() : null;
        return userId == null || userId.equals(str);
    }

    public final void resumeWebviewIfNecessary$android_sdk_ui_release() {
        WebView messageWebView;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda2(16), 7, (Object) null);
        cancelPendingWebViewPause();
        IInAppMessageViewWrapper iInAppMessageViewWrapper = this.inAppMessageViewWrapper;
        if (iInAppMessageViewWrapper == null) {
            return;
        }
        View inAppMessageView = iInAppMessageViewWrapper.getInAppMessageView();
        if (!(inAppMessageView instanceof InAppMessageHtmlBaseView) || (messageWebView = ((InAppMessageHtmlBaseView) inAppMessageView).getMessageWebView()) == null) {
            return;
        }
        messageWebView.onResume();
    }

    public static /* synthetic */ boolean resetAfterInAppMessageClose$default(BrazeInAppMessageManager brazeInAppMessageManager, IInAppMessageViewWrapper iInAppMessageViewWrapper, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                iInAppMessageViewWrapper = null;
            }
            return brazeInAppMessageManager.resetAfterInAppMessageClose(iInAppMessageViewWrapper);
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: resetAfterInAppMessageClose");
        return false;
    }

    public void unregisterInAppMessageManager(Activity activity) {
        try {
            int i = 0;
            if (getShouldNextUnregisterBeSkipped()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda0(activity, i), 7, (Object) null);
                setShouldNextUnregisterBeSkipped(false);
            } else {
                this.activityTransitionCoordinator.logUnregisterActivity(activity);
                applyUnregisterDisplayedMessageResult(this.activityTransitionCoordinator.resolveUnregisterDisplayedMessage(this.inAppMessageViewWrapper, new AnonymousClass2(this), new AnonymousClass3(this.inAppMessageViewLifecycleListener)));
                this.mActivity = null;
                this.displayingInAppMessage.set(false);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new onAddedToParentLayer(1), 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrazeUserChangeEventSubscriber$lambda$0$0(BrazeUserChangeEvent brazeUserChangeEvent) {
        return ff$$ExternalSyntheticOutline0.m("InAppMessage manager handling user change event. New user id: '", brazeUserChangeEvent.getCurrentUserId(), "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createBrazeUserChangeEventSubscriber$lambda$0$1(String str, BrazeUserChangeEvent brazeUserChangeEvent) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("User changed from '", str, "' to '", brazeUserChangeEvent.getCurrentUserId(), "'. Clearing in-app message state.");
    }

    public final boolean resetAfterInAppMessageClose() {
        return resetAfterInAppMessageClose$default(this, null, 1, null);
    }
}
