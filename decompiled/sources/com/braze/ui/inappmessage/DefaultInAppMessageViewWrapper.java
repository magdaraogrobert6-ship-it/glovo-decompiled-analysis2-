package com.braze.ui.inappmessage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$$ExternalSyntheticLambda0;
import androidx.compose.ui.graphics.Fields;
import androidx.sqlite.SQLite;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.n$$ExternalSyntheticLambda1;
import bo.app.w4$$ExternalSyntheticLambda0;
import com.braze.BrazeUser$$ExternalSyntheticLambda28;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.inappmessage.DismissType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeLogger;
import com.braze.ui.contentcards.adapters.ContentCardAdapter$$ExternalSyntheticLambda0;
import com.braze.ui.contentcards.view.BaseContentCardView$$ExternalSyntheticLambda0;
import com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener;
import com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener;
import com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener;
import com.braze.ui.inappmessage.views.IInAppMessageView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.support.ViewUtils;
import com.incognia.internal.pNP$$ExternalSyntheticLambda0;
import com.ui.common.widget.ThrottledButton$$ExternalSyntheticLambda0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C0165focusRequester;
import o.FocusPropertiesNode;
import o.FocusRequesterKt;
import o.FocusRequesterModifier;
import o.FocusRequesterModifierKt;
import o.FocusRequesterModifierNode;
import o.FocusRequesterModifierNodeKt;
import o.FocusRequesterNode;
import o.accessgetCancelcp;
import o.checkForSystemLogLevelPropertydefault;
import o.getFocusRequester;
import o.onContentCardDismissed;
import o.pinFocusedChild;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.setRight;

/* JADX INFO: loaded from: classes.dex */
public class DefaultInAppMessageViewWrapper implements IInAppMessageViewWrapper {
    public static final Companion Companion = new Companion(null);
    private List<? extends View> buttonViews;
    private View clickableInAppMessageView;
    private View closeButton;
    private final Animation closingAnimation;
    private final BrazeConfigurationProvider configurationProvider;
    private ViewGroup contentViewGroupParentLayout;
    private Runnable dismissRunnable;
    private final IInAppMessage inAppMessage;
    private final View inAppMessageView;
    private final IInAppMessageViewLifecycleListener inAppMessageViewLifecycleListener;
    private boolean isAnimatingClose;
    private OnBackInvokedCallback onBackInvokedCallback;
    private OnBackPressedCallback onBackPressedDispatcherFallbackCallback;
    private final Animation openingAnimation;
    private View previouslyFocusedView;
    private boolean shouldIgnoreOpenAndCloseLifecycleCallbacks;
    private HashMap<Integer, Integer> viewAccessibilityFlagMap;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto$lambda$0() {
            return "In-app message ViewGroup was null. Not resetting in-app message accessibility for exclusive mode.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String setAllViewGroupChildrenAsNonAccessibilityImportant$lambda$0() {
            return "In-app message ViewGroup was null. Not preparing in-app message accessibility for exclusive mode.";
        }

        private Companion() {
        }

        public final void resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(ViewGroup viewGroup, Map<Integer, Integer> map) {
            map.getClass();
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(21), 6, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    int id = childAt.getId();
                    if (map.containsKey(Integer.valueOf(id))) {
                        Integer num = map.get(Integer.valueOf(id));
                        if (num != null) {
                            childAt.setImportantForAccessibility(num.intValue());
                        }
                    } else {
                        childAt.setImportantForAccessibility(0);
                    }
                }
            }
        }

        public final void setAllViewGroupChildrenAsNonAccessibilityImportant(ViewGroup viewGroup, Map<Integer, Integer> map) {
            map.getClass();
            if (viewGroup == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(20), 6, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    map.put(Integer.valueOf(childAt.getId()), Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$createAnimationListener$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onAnimationEnd$lambda$0() {
            return "Ignoring opening animation end for in-app message wrapper prepared for activity transition carryover.";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onAnimationEnd$lambda$1() {
            return "In-app message animated into view.";
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (DefaultInAppMessageViewWrapper.this.shouldIgnoreOpenAndCloseLifecycleCallbacks) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(22), 7, (Object) null);
                return;
            }
            if (DefaultInAppMessageViewWrapper.this.getInAppMessage().getDismissType() == DismissType.AUTO_DISMISS) {
                DefaultInAppMessageViewWrapper.this.addDismissRunnable();
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(23), 7, (Object) null);
            DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper = DefaultInAppMessageViewWrapper.this;
            defaultInAppMessageViewWrapper.finalizeViewBeforeDisplay(defaultInAppMessageViewWrapper.getInAppMessage(), DefaultInAppMessageViewWrapper.this.getInAppMessageView(), DefaultInAppMessageViewWrapper.this.getInAppMessageViewLifecycleListener());
        }
    }

    /* JADX INFO: renamed from: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper$open$2, reason: invalid class name and case insensitive filesystem */
    public static final class ViewOnLayoutChangeListenerC00842 implements View.OnLayoutChangeListener {
        final /* synthetic */ ViewGroup $parentViewGroup;
        final /* synthetic */ DefaultInAppMessageViewWrapper this$0;

        public ViewOnLayoutChangeListenerC00842(ViewGroup viewGroup, DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper) {
            this.$parentViewGroup = viewGroup;
            this.this$0 = defaultInAppMessageViewWrapper;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.getClass();
            this.$parentViewGroup.removeOnLayoutChangeListener(this);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda1(i4, i2, 5), 7, (Object) null);
            this.$parentViewGroup.removeView(this.this$0.getInAppMessageView());
            ViewGroup viewGroup = this.$parentViewGroup;
            viewGroup.post(new w4$$ExternalSyntheticLambda0(this.this$0, 12, viewGroup));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onLayoutChange$lambda$1(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, ViewGroup viewGroup) {
            defaultInAppMessageViewWrapper.addInAppMessageViewToViewGroup(viewGroup, defaultInAppMessageViewWrapper.getInAppMessage(), defaultInAppMessageViewWrapper.getInAppMessageView(), defaultInAppMessageViewWrapper.getInAppMessageViewLifecycleListener());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String onLayoutChange$lambda$0(int i, int i2) {
            return d$$ExternalSyntheticOutline0.m(i - i2, "Detected (bottom - top) of ", " in OnLayoutChangeListener");
        }
    }

    public List<View> getButtonViews() {
        return this.buttonViews;
    }

    public View getClickableInAppMessageView() {
        return this.clickableInAppMessageView;
    }

    public View getCloseButton() {
        return this.closeButton;
    }

    public Animation getClosingAnimation() {
        return this.closingAnimation;
    }

    public BrazeConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    public ViewGroup getContentViewGroupParentLayout() {
        return this.contentViewGroupParentLayout;
    }

    public Runnable getDismissRunnable() {
        return this.dismissRunnable;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public IInAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public View getInAppMessageView() {
        return this.inAppMessageView;
    }

    public IInAppMessageViewLifecycleListener getInAppMessageViewLifecycleListener() {
        return this.inAppMessageViewLifecycleListener;
    }

    public OnBackInvokedCallback getOnBackInvokedCallback() {
        return this.onBackInvokedCallback;
    }

    public Animation getOpeningAnimation() {
        return this.openingAnimation;
    }

    public View getPreviouslyFocusedView() {
        return this.previouslyFocusedView;
    }

    public HashMap<Integer, Integer> getViewAccessibilityFlagMap() {
        return this.viewAccessibilityFlagMap;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public boolean isAnimatingClose() {
        return this.isAnimatingClose;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void prepareForActivityTransitionCarryover() {
        this.shouldIgnoreOpenAndCloseLifecycleCallbacks = true;
        getInAppMessageView().clearAnimation();
        Runnable dismissRunnable = getDismissRunnable();
        if (dismissRunnable != null) {
            getInAppMessageView().removeCallbacks(dismissRunnable);
        }
    }

    public void setAnimatingClose(boolean z) {
        this.isAnimatingClose = z;
    }

    public void setButtonViews(List<? extends View> list) {
        this.buttonViews = list;
    }

    public void setClickableInAppMessageView(View view) {
        this.clickableInAppMessageView = view;
    }

    public void setCloseButton(View view) {
        this.closeButton = view;
    }

    public void setContentViewGroupParentLayout(ViewGroup viewGroup) {
        this.contentViewGroupParentLayout = viewGroup;
    }

    public void setDismissRunnable(Runnable runnable) {
        this.dismissRunnable = runnable;
    }

    public void setOnBackInvokedCallback(OnBackInvokedCallback onBackInvokedCallback) {
        this.onBackInvokedCallback = onBackInvokedCallback;
    }

    public void setPreviouslyFocusedView(View view) {
        this.previouslyFocusedView = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addDismissRunnable$lambda$0() {
        BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$0() {
        return "Adding In-app message view to parent view group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$2$0() {
        return "In-app message view received window insets.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$2$1() {
        return "Window insets were null, so not applying window insets to in-app message view.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$2$2() {
        return "Calling applyWindowInsets on in-app message view.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$2$3() {
        return "Not reapplying window insets to in-app message view.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$3() {
        return "Requesting to apply insets.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$4() {
        return "In-app message view will animate into the visible area.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$5() {
        return "In-app message view will be placed instantly into the visible area.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String close$lambda$0() {
        return "Ignoring close on in-app message wrapper prepared for activity transition carryover.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String close$lambda$1() {
        return "Closing in-app message view wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String close$lambda$2$0() {
        return "Unregistering iam back invoked callback";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageView$lambda$0() {
        return "Ignoring closeInAppMessageView on in-app message wrapper prepared for activity transition carryover.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageView$lambda$1() {
        return "Closing in-app message view";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageView$lambda$3() {
        return "Failed to request focus on previous view";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String createButtonClickListeners$lambda$0$0() {
        return "Cannot create button click listener since this in-app message does not have message buttons.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCloseInAppMessageClickListener$lambda$0(View view) {
        BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String open$lambda$0() {
        return "Opening in-app message view wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String open$lambda$1(int i) {
        return c8$$ExternalSyntheticOutline0.m(i, "Detected root view height of ");
    }

    public SwipeDismissTouchListener.DismissCallbacks createDismissCallbacks() {
        return new SwipeDismissTouchListener.DismissCallbacks() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.createDismissCallbacks.1
            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public boolean canDismiss(Object obj) {
                return true;
            }

            @Override // com.braze.ui.inappmessage.listeners.SwipeDismissTouchListener.DismissCallbacks
            public void onDismiss(View view, Object obj) {
                view.getClass();
                DefaultInAppMessageViewWrapper.this.getInAppMessage().setAnimateOut(false);
                BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(true);
            }
        };
    }

    public TouchAwareSwipeDismissTouchListener.ITouchListener createTouchAwareListener() {
        return new TouchAwareSwipeDismissTouchListener.ITouchListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.createTouchAwareListener.1
            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchEnded() {
            }

            @Override // com.braze.ui.inappmessage.listeners.TouchAwareSwipeDismissTouchListener.ITouchListener
            public void onTouchStartedOrContinued() {
            }
        };
    }

    public void setAndStartAnimation(boolean z) {
        Animation openingAnimation = z ? getOpeningAnimation() : getClosingAnimation();
        if (openingAnimation != null) {
            openingAnimation.setAnimationListener(createAnimationListener(z));
        }
        getInAppMessageView().clearAnimation();
        getInAppMessageView().setAnimation(openingAnimation);
        if (openingAnimation != null) {
            openingAnimation.startNow();
        }
        getInAppMessageView().invalidate();
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.FULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.HTML_FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.HTML.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List<? extends View> list, View view3) {
        view.getClass();
        iInAppMessage.getClass();
        iInAppMessageViewLifecycleListener.getClass();
        brazeConfigurationProvider.getClass();
        this.inAppMessageView = view;
        this.inAppMessage = iInAppMessage;
        this.inAppMessageViewLifecycleListener = iInAppMessageViewLifecycleListener;
        this.configurationProvider = brazeConfigurationProvider;
        this.openingAnimation = animation;
        this.closingAnimation = animation2;
        this.clickableInAppMessageView = view2;
        this.buttonViews = list;
        this.closeButton = view3;
        this.viewAccessibilityFlagMap = new HashMap<>();
        View clickableInAppMessageView = getClickableInAppMessageView();
        setClickableInAppMessageView(clickableInAppMessageView == null ? getInAppMessageView() : clickableInAppMessageView);
        IInAppMessage inAppMessage = getInAppMessage();
        InAppMessageSlideup inAppMessageSlideup = inAppMessage instanceof InAppMessageSlideup ? (InAppMessageSlideup) inAppMessage : null;
        if (inAppMessageSlideup != null) {
            TouchAwareSwipeDismissTouchListener touchAwareSwipeDismissTouchListener = new TouchAwareSwipeDismissTouchListener(getInAppMessageView(), createDismissCallbacks(), inAppMessageSlideup.getSlideFrom() == SlideFrom.TOP ? SwipeDismissTouchListener.VerticalDismissDirection.UP : SwipeDismissTouchListener.VerticalDismissDirection.DOWN);
            touchAwareSwipeDismissTouchListener.setTouchListener(createTouchAwareListener());
            View clickableInAppMessageView2 = getClickableInAppMessageView();
            if (clickableInAppMessageView2 != null) {
                clickableInAppMessageView2.setOnTouchListener(touchAwareSwipeDismissTouchListener);
            }
        }
        View clickableInAppMessageView3 = getClickableInAppMessageView();
        if (clickableInAppMessageView3 != null) {
            clickableInAppMessageView3.setOnClickListener(createClickListener());
        }
        View closeButton = getCloseButton();
        if (closeButton != null) {
            closeButton.setOnClickListener(createCloseInAppMessageClickListener());
        }
        createButtonClickListeners();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addInAppMessageViewToViewGroup(ViewGroup viewGroup, IInAppMessage iInAppMessage, View view, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener) {
        FocusRequesterModifier focusRequesterKt;
        viewGroup.getClass();
        iInAppMessage.getClass();
        view.getClass();
        iInAppMessageViewLifecycleListener.getClass();
        iInAppMessageViewLifecycleListener.beforeOpened(view, iInAppMessage);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(4), 7, (Object) null);
        viewGroup.addView(view, getLayoutParams(iInAppMessage));
        if (view instanceof IInAppMessageView) {
            if (getConfigurationProvider().getShouldAddStatusBarPaddingToInAppMessages()) {
                Context context = view.getContext();
                context.getClass();
                int statusBarHeight = ViewUtils.getStatusBarHeight(context);
                int i = Build.VERSION.SDK_INT;
                if (i >= 36) {
                    focusRequesterKt = new pinFocusedChild();
                } else if (i >= 35) {
                    focusRequesterKt = new FocusRequesterNode();
                } else if (i >= 34) {
                    focusRequesterKt = new FocusRequesterModifierNode();
                } else if (i >= 31) {
                    focusRequesterKt = new C0165focusRequester();
                } else if (i >= 30) {
                    focusRequesterKt = new FocusRequesterModifierNodeKt();
                } else {
                    focusRequesterKt = i >= 29 ? new FocusRequesterKt() : new getFocusRequester();
                }
                focusRequesterKt.IconCompatParcelizer(519, setRight.IconCompatParcelizer(0, statusBarHeight, 0, 0));
                FocusRequesterModifierKt focusRequesterModifierKtRemoteActionCompatParcelizer = focusRequesterKt.RemoteActionCompatParcelizer();
                focusRequesterModifierKtRemoteActionCompatParcelizer.getClass();
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ContentCardAdapter$$ExternalSyntheticLambda0(statusBarHeight, 2), 7, (Object) null);
                ((IInAppMessageView) view).applyWindowInsets(focusRequesterModifierKtRemoteActionCompatParcelizer);
            } else {
                CaptureRequestOptions$Builder$$ExternalSyntheticLambda0 captureRequestOptions$Builder$$ExternalSyntheticLambda0 = new CaptureRequestOptions$Builder$$ExternalSyntheticLambda0(this, 15, view);
                WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
                accessgetCancelcp.write(viewGroup, captureRequestOptions$Builder$$ExternalSyntheticLambda0);
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(5), 7, (Object) null);
                viewGroup.requestApplyInsets();
            }
        }
        if (iInAppMessage.getAnimateIn()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(6), 7, (Object) null);
            setAndStartAnimation(true);
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(7), 7, (Object) null);
            if (iInAppMessage.getDismissType() == DismissType.AUTO_DISMISS) {
                addDismissRunnable();
            }
            finalizeViewBeforeDisplay(iInAppMessage, view, iInAppMessageViewLifecycleListener);
        }
    }

    public View.OnClickListener createClickListener() {
        return new ThrottledButton$$ExternalSyntheticLambda0(1, this);
    }

    public View.OnClickListener createCloseInAppMessageClickListener() {
        return new checkForSystemLogLevelPropertydefault(1);
    }

    public void finalizeViewBeforeDisplay(IInAppMessage iInAppMessage, View view, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener) {
        iInAppMessage.getClass();
        view.getClass();
        iInAppMessageViewLifecycleListener.getClass();
        if (ViewUtils.isDeviceNotInTouchMode(view)) {
            int i = WhenMappings.$EnumSwitchMapping$0[iInAppMessage.getMessageType().ordinal()];
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                ViewUtils.setFocusableInTouchModeAndRequestFocus(view);
            }
        } else {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(view);
        }
        iInAppMessageViewLifecycleListener.afterOpened(view, iInAppMessage);
    }

    public ViewGroup getParentViewGroup(Activity activity) {
        activity.getClass();
        View viewFindViewById = activity.getWindow().getDecorView().findViewById(R.id.content);
        viewFindViewById.getClass();
        return (ViewGroup) viewFindViewById;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void open(Activity activity) {
        activity.getClass();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(12), 6, (Object) null);
        ViewGroup parentViewGroup = getParentViewGroup(activity);
        int height = parentViewGroup.getHeight();
        if (getConfigurationProvider().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            setContentViewGroupParentLayout(parentViewGroup);
            getViewAccessibilityFlagMap().clear();
            Companion.setAllViewGroupChildrenAsNonAccessibilityImportant(getContentViewGroupParentLayout(), getViewAccessibilityFlagMap());
        }
        setPreviouslyFocusedView(activity.getCurrentFocus());
        if (height == 0) {
            parentViewGroup.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC00842(parentViewGroup, this));
        } else {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new ContentCardAdapter$$ExternalSyntheticLambda0(height, 3), 7, (Object) null);
            addInAppMessageViewToViewGroup(parentViewGroup, getInAppMessage(), getInAppMessageView(), getInAppMessageViewLifecycleListener());
        }
        BrazeInAppMessageManager.Companion companion = BrazeInAppMessageManager.Companion;
        if (companion.getInstance().getDoesBackButtonDismissInAppMessageView() && Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedCallback onBackInvokedCallback = getOnBackInvokedCallback();
            if (onBackInvokedCallback != null) {
                activity.getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(onBackInvokedCallback);
                setOnBackInvokedCallback(null);
            }
            DefaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1 defaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1 = new DefaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1();
            activity.getOnBackInvokedDispatcher().registerOnBackInvokedCallback(1000000, defaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1);
            setOnBackInvokedCallback(defaultInAppMessageViewWrapper$open$4$dismissInAppMessageCallback$1);
        }
        ComponentActivity componentActivity = activity instanceof ComponentActivity ? (ComponentActivity) activity : null;
        if (componentActivity == null || !companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            return;
        }
        OnBackPressedCallback onBackPressedCallback = this.onBackPressedDispatcherFallbackCallback;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.remove();
        }
        this.onBackPressedDispatcherFallbackCallback = null;
        DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1 defaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1 = new DefaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1();
        componentActivity.getOnBackPressedDispatcher().RemoteActionCompatParcelizer(defaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1);
        this.onBackPressedDispatcherFallbackCallback = defaultInAppMessageViewWrapper$open$dismissInAppMessageCallbackFallback$1;
    }

    public void setViewAccessibilityFlagMap(HashMap<Integer, Integer> map) {
        map.getClass();
        this.viewAccessibilityFlagMap = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addInAppMessageViewToViewGroup$lambda$1(int i) {
        return d$$ExternalSyntheticOutline0.m(i, "Adding status bar height of ", " padding to in-app message view.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createButtonClickListeners$lambda$0$1$0$0(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, MessageButton messageButton, IInAppMessageImmersive iInAppMessageImmersive, View view) {
        defaultInAppMessageViewWrapper.getInAppMessageViewLifecycleListener().onButtonClicked(messageButton, iInAppMessageImmersive);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createClickListener$lambda$0(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, View view) {
        List<MessageButton> messageButtons;
        IInAppMessage inAppMessage = defaultInAppMessageViewWrapper.getInAppMessage();
        IInAppMessageImmersive iInAppMessageImmersive = inAppMessage instanceof IInAppMessageImmersive ? (IInAppMessageImmersive) inAppMessage : null;
        if ((iInAppMessageImmersive == null || (messageButtons = iInAppMessageImmersive.getMessageButtons()) == null || !messageButtons.isEmpty()) && (defaultInAppMessageViewWrapper.getInAppMessage() instanceof IInAppMessageImmersive)) {
            return;
        }
        defaultInAppMessageViewWrapper.getInAppMessageViewLifecycleListener().onClicked(defaultInAppMessageViewWrapper.getInAppMessageView(), defaultInAppMessageViewWrapper.getInAppMessage());
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewWrapper
    public void close() {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (this.shouldIgnoreOpenAndCloseLifecycleCallbacks) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(8), 7, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(9), 7, (Object) null);
        if (getConfigurationProvider().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            Companion.resetAllViewGroupChildrenToPreviousAccessibilityFlagOrAuto(getContentViewGroupParentLayout(), getViewAccessibilityFlagMap());
        }
        if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedCallback = getOnBackInvokedCallback()) != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(10), 7, (Object) null);
            Activity activity = BrazeInAppMessageManager.Companion.getInstance().getActivity();
            if (activity != null && (onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher()) != null) {
                onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            }
            setOnBackInvokedCallback(null);
        }
        OnBackPressedCallback onBackPressedCallback = this.onBackPressedDispatcherFallbackCallback;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.remove();
        }
        this.onBackPressedDispatcherFallbackCallback = null;
        getInAppMessageView().removeCallbacks(getDismissRunnable());
        getInAppMessageViewLifecycleListener().beforeClosed(getInAppMessageView(), getInAppMessage());
        if (!getInAppMessage().getAnimateOut()) {
            closeInAppMessageView();
        } else {
            setAnimatingClose(true);
            setAndStartAnimation(false);
        }
    }

    public void closeInAppMessageView() {
        if (this.shouldIgnoreOpenAndCloseLifecycleCallbacks) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(13), 7, (Object) null);
            return;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(14), 7, (Object) null);
        ViewUtils.removeViewFromParent(getInAppMessageView());
        View inAppMessageView = getInAppMessageView();
        InAppMessageHtmlBaseView inAppMessageHtmlBaseView = inAppMessageView instanceof InAppMessageHtmlBaseView ? (InAppMessageHtmlBaseView) inAppMessageView : null;
        if (inAppMessageHtmlBaseView != null) {
            inAppMessageHtmlBaseView.finishWebViewDisplay();
        }
        if (getPreviouslyFocusedView() != null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeUser$$ExternalSyntheticLambda28(9, this), 7, (Object) null);
            try {
                View previouslyFocusedView = getPreviouslyFocusedView();
                if (previouslyFocusedView != null) {
                    previouslyFocusedView.requestFocus();
                }
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(15), 4, (Object) null);
            }
        }
        if (BrazeInAppMessageManager.Companion.getInstance().resetAfterInAppMessageClose(this)) {
            getInAppMessageViewLifecycleListener().afterClosed(getInAppMessage());
        }
    }

    public Animation.AnimationListener createAnimationListener(boolean z) {
        if (z) {
            return new AnonymousClass1();
        }
        return new Animation.AnimationListener() { // from class: com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper.createAnimationListener.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().clearAnimation();
                DefaultInAppMessageViewWrapper.this.getInAppMessageView().setVisibility(8);
                DefaultInAppMessageViewWrapper.this.closeInAppMessageView();
            }
        };
    }

    public void createButtonClickListeners() {
        IInAppMessage inAppMessage = getInAppMessage();
        IInAppMessageImmersive iInAppMessageImmersive = inAppMessage instanceof IInAppMessageImmersive ? (IInAppMessageImmersive) inAppMessage : null;
        if (iInAppMessageImmersive != null) {
            if (iInAppMessageImmersive.getMessageButtons().isEmpty()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(11), 7, (Object) null);
                return;
            }
            List<View> buttonViews = getButtonViews();
            if (buttonViews != null) {
                int i = 0;
                for (Object obj : buttonViews) {
                    if (i < 0) {
                        SQLite.serializer();
                        throw null;
                    }
                    View view = (View) obj;
                    MessageButton messageButton = (MessageButton) onContentCardDismissed.read(i, iInAppMessageImmersive.getMessageButtons());
                    if (messageButton != null) {
                        view.setOnClickListener(new BaseContentCardView$$ExternalSyntheticLambda0(this, messageButton, iInAppMessageImmersive, 1));
                    }
                    i++;
                }
            }
        }
    }

    public ViewGroup.LayoutParams getLayoutParams(IInAppMessage iInAppMessage) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (iInAppMessage instanceof InAppMessageSlideup) {
            layoutParams.gravity = ((InAppMessageSlideup) iInAppMessage).getSlideFrom() == SlideFrom.TOP ? 48 : 80;
        }
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final FocusRequesterModifierKt addInAppMessageViewToViewGroup$lambda$2(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper, View view, View view2, FocusRequesterModifierKt focusRequesterModifierKt) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(16), 7, (Object) null);
        if (focusRequesterModifierKt == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(17), 7, (Object) null);
            return new FocusRequesterModifierKt(focusRequesterModifierKt);
        }
        view.getClass();
        IInAppMessageView iInAppMessageView = (IInAppMessageView) view;
        if (iInAppMessageView.getHasAppliedWindowInsets()) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(19), 7, (Object) null);
            return focusRequesterModifierKt;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) defaultInAppMessageViewWrapper, BrazeLogger.Priority.V, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new BrazeInAppMessageManager$$ExternalSyntheticLambda6(18), 6, (Object) null);
        iInAppMessageView.applyWindowInsets(focusRequesterModifierKt);
        return focusRequesterModifierKt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String closeInAppMessageView$lambda$2(DefaultInAppMessageViewWrapper defaultInAppMessageViewWrapper) {
        return "Returning focus to view after closing message. View: " + defaultInAppMessageViewWrapper.getPreviouslyFocusedView();
    }

    public void addDismissRunnable() {
        if (getDismissRunnable() == null) {
            setDismissRunnable(new pNP$$ExternalSyntheticLambda0(4));
            getInAppMessageView().postDelayed(getDismissRunnable(), getInAppMessage().getDurationInMilliseconds());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List<? extends View> list) {
        this(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, list, null, Fields.RotationX, null);
        view.getClass();
        iInAppMessage.getClass();
        iInAppMessageViewLifecycleListener.getClass();
        brazeConfigurationProvider.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2) {
        this(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, null, null, 384, null);
        view.getClass();
        iInAppMessage.getClass();
        iInAppMessageViewLifecycleListener.getClass();
        brazeConfigurationProvider.getClass();
    }

    public /* synthetic */ DefaultInAppMessageViewWrapper(View view, IInAppMessage iInAppMessage, IInAppMessageViewLifecycleListener iInAppMessageViewLifecycleListener, BrazeConfigurationProvider brazeConfigurationProvider, Animation animation, Animation animation2, View view2, List list, View view3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, iInAppMessage, iInAppMessageViewLifecycleListener, brazeConfigurationProvider, animation, animation2, view2, (i & Fields.SpotShadowColor) != 0 ? null : list, (i & Fields.RotationX) != 0 ? null : view3);
    }
}
