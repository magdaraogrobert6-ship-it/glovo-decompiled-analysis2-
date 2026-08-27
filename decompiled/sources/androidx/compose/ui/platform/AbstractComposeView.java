package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.R;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.Owner;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.common.location.AndroidDeviceLocationProvider;
import io.sentry.util.UrlUtils;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import o.DragAndDropTargetModifierNode;
import o.accessisRenderNodeCompatiblecp;
import o.asFrameworkPaint;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getBirthDateYear;
import o.getCieXyz;
import o.getCreditCardExpirationDate;
import o.getPostalCode;
import o.getTransparent0d7_KjU;
import o.notifySubtreeStateChangeIfNeeded;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.sendContentCaptureAppearEvents;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<getBirthDateYear> cachedViewTreeCompositionContext;
    private ComposeViewContext composeViewContext;
    private getCreditCardExpirationDate composition;
    private boolean creatingComposition;
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private getBirthDateYear parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    @ExperimentalComposeViewContextApi
    public static /* synthetic */ void getComposeViewContext$ui$annotations() {
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @UiComposable
    public abstract void Content(getBirthDateFull getbirthdatefull, int i);

    public final void disposeComposition() {
        View childAt = getChildAt(0);
        AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
        if (androidComposeView != null) {
            androidComposeView.removeConnectionToComposeViewContext();
        }
        getCreditCardExpirationDate getcreditcardexpirationdate = this.composition;
        if (getcreditcardexpirationdate != null) {
            getcreditcardexpirationdate.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final ComposeViewContext getComposeViewContext$ui() {
        return this.composeViewContext;
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        int measuredWidth = childAt.getMeasuredWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int measuredHeight = childAt.getMeasuredHeight();
        setMeasuredDimension(paddingRight + paddingLeft + measuredWidth, getPaddingBottom() + getPaddingTop() + measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        internalOnLayout$ui(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(getBirthDateYear getbirthdateyear) {
        setParentContext(getbirthdateyear);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m2655getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        AutoClearFocusBehavior autoClearFocusBehavior = tag instanceof AutoClearFocusBehavior ? (AutoClearFocusBehavior) tag : null;
        return autoClearFocusBehavior != null ? autoClearFocusBehavior.m2701unboximpl() : AutoClearFocusBehavior.Companion.m2703getDefault4UtRPd4();
    }

    /* JADX INFO: renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m2656setAutoClearFocusBehavior17tfJxM(int i) {
        setTag(R.id.auto_clear_focus_behavior_tag, AutoClearFocusBehavior.m2695boximpl(i));
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        checkAddView();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        return super.addViewInLayout(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (WindowRecomposer_androidKt.getContentChild(this).getParent() == null) {
            getHandler().postAtFrontOfQueue(new AbstractComposeView$$ExternalSyntheticLambda0(0, this));
        } else {
            attachedToWindow();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ensureCompositionCreated();
        internalOnMeasure$ui(i, i2);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z);
        }
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        this.disposeViewCompositionStrategy = ViewCompositionStrategy.Companion.getDefault().installFor(this);
    }

    private final boolean isAlive(getBirthDateYear getbirthdateyear) {
        return !(getbirthdateyear instanceof sendContentCaptureAppearEvents) || ((notifySubtreeStateChangeIfNeeded) ((sendContentCaptureAppearEvents) getbirthdateyear).write.read()).compareTo(notifySubtreeStateChangeIfNeeded.ShuttingDown) > 0;
    }

    private final getBirthDateYear resolveParentCompositionContext() {
        getBirthDateYear getbirthdateyear;
        getBirthDateYear getbirthdateyearCacheIfAlive = this.parentContext;
        if (getbirthdateyearCacheIfAlive == null) {
            getBirthDateYear getbirthdateyearFindViewTreeCompositionContext = WindowRecomposer_androidKt.findViewTreeCompositionContext(this);
            getBirthDateYear getbirthdateyear2 = null;
            getbirthdateyearCacheIfAlive = getbirthdateyearFindViewTreeCompositionContext != null ? cacheIfAlive(getbirthdateyearFindViewTreeCompositionContext) : null;
            if (getbirthdateyearCacheIfAlive == null) {
                WeakReference<getBirthDateYear> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference != null && (getbirthdateyear = weakReference.get()) != null && isAlive(getbirthdateyear)) {
                    getbirthdateyear2 = getbirthdateyear;
                }
                return getbirthdateyear2 == null ? cacheIfAlive(WindowRecomposer_androidKt.getWindowRecomposer(this)) : getbirthdateyear2;
            }
        }
        return getbirthdateyearCacheIfAlive;
    }

    private final void setParentContext(getBirthDateYear getbirthdateyear) {
        if (this.parentContext != getbirthdateyear) {
            this.parentContext = getbirthdateyear;
            if (getbirthdateyear != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            getCreditCardExpirationDate getcreditcardexpirationdate = this.composition;
            if (getcreditcardexpirationdate != null) {
                getcreditcardexpirationdate.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    private final ComposeViewContext updateAutoCreatedComposeViewContext(View view, ComposeViewContext composeViewContext) {
        getBirthDateYear getbirthdateyearResolveParentCompositionContext = resolveParentCompositionContext();
        accessisRenderNodeCompatiblecp lifecycleOwner$ui = (accessisRenderNodeCompatiblecp) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1819368283, -1819368281, getCieXyz.write(), getCieXyz.write(), new Object[]{view}, getCieXyz.write());
        int iRemoteActionCompatParcelizer = AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer();
        asFrameworkPaint asframeworkpaint = (asFrameworkPaint) BuildersKt.IconCompatParcelizer(-1340292176, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1340292178, new Object[]{view}, iRemoteActionCompatParcelizer);
        getTransparent0d7_KjU gettransparent0d7_kjuRemoteActionCompatParcelizer = UrlUtils.RemoteActionCompatParcelizer(view);
        if (getbirthdateyearResolveParentCompositionContext == composeViewContext.getCompositionContext$ui() && lifecycleOwner$ui == composeViewContext.getLifecycleOwner$ui() && asframeworkpaint == composeViewContext.getViewModelStoreOwner$ui() && gettransparent0d7_kjuRemoteActionCompatParcelizer == composeViewContext.getSavedStateRegistryOwner$ui()) {
            return composeViewContext;
        }
        if (getbirthdateyearResolveParentCompositionContext.MediaDescriptionCompat() != composeViewContext.getCompositionContext$ui().MediaDescriptionCompat()) {
            disposeComposition();
        }
        if (lifecycleOwner$ui == null) {
            lifecycleOwner$ui = composeViewContext.getLifecycleOwner$ui();
        }
        ComposeViewContext composeViewContextCopy = composeViewContext.copy(view, getbirthdateyearResolveParentCompositionContext, lifecycleOwner$ui, gettransparent0d7_kjuRemoteActionCompatParcelizer == null ? composeViewContext.getSavedStateRegistryOwner$ui() : gettransparent0d7_kjuRemoteActionCompatParcelizer, asframeworkpaint);
        ComposeView_androidKt.setComposeViewContext(view, composeViewContextCopy);
        return composeViewContextCopy;
    }

    public final void createComposition() {
        ComposeViewContext composeViewContext;
        View view$ui;
        if (this.parentContext == null && !isAttachedToWindow() && ((composeViewContext = this.composeViewContext) == null || composeViewContext == null || (view$ui = composeViewContext.getView$ui()) == null || !view$ui.isAttachedToWindow())) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        } else {
            ensureCompositionCreated();
        }
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.isTransitionGroupSet || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy viewCompositionStrategy) {
        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.disposeViewCompositionStrategy;
        if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
        }
        this.disposeViewCompositionStrategy = viewCompositionStrategy.installFor(this);
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                Trace.beginSection("Compose:initializeView");
                try {
                    ComposeViewContext composeViewContextResolveComposeViewContext = this.composeViewContext;
                    if (composeViewContextResolveComposeViewContext == null) {
                        composeViewContextResolveComposeViewContext = resolveComposeViewContext();
                    }
                    this.composition = Wrapper_androidKt.setContent(this, composeViewContextResolveComposeViewContext, new DragAndDropTargetModifierNode(new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.platform.AbstractComposeView$ensureCompositionCreated$1$1
                        {
                            super(2);
                        }

                        public final void invoke(getBirthDateFull getbirthdatefull, int i) {
                            getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
                            if (getpostalcode.write(i & 1, (i & 3) != 2)) {
                                this.this$0.Content(getpostalcode, 0);
                            } else {
                                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                            }
                        }

                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public /* synthetic */ Object invoke(Object obj, Object obj2) {
                            invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                            return createFromParcel.INSTANCE;
                        }
                    }, true, 1003123809));
                    Trace.endSection();
                    this.creatingComposition = false;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                this.creatingComposition = false;
                throw th2;
            }
        }
    }

    public final void setComposeViewContext$ui(ComposeViewContext composeViewContext) {
        if (this.composeViewContext != composeViewContext) {
            if (composeViewContext == null) {
                disposeComposition();
            } else if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
                if (androidComposeView != null) {
                    if (androidComposeView.getCoroutineContext() != composeViewContext.getCompositionContext$ui().MediaDescriptionCompat()) {
                        disposeComposition();
                    }
                    androidComposeView.setComposeViewContext(composeViewContext);
                }
            }
            this.composeViewContext = composeViewContext;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    public final void attachedToWindow() {
        AndroidComposeView androidComposeView;
        if (isAttachedToWindow()) {
            setPreviousAttachedWindowToken(getWindowToken());
            if (this.composeViewContext == null) {
                if (getChildCount() == 0) {
                    androidComposeView = null;
                } else {
                    View childAt = getChildAt(0);
                    if (childAt instanceof AndroidComposeView) {
                        androidComposeView = (AndroidComposeView) childAt;
                    } else {
                        androidComposeView = null;
                    }
                }
                if (androidComposeView != null) {
                    androidComposeView.setComposeViewContext(updateAutoCreatedComposeViewContext(ComposeView_androidKt.findViewTreeComposeViewRoot(this), androidComposeView.getComposeViewContext()));
                }
            }
            if (getShouldCreateCompositionOnAttachedToWindow()) {
                ensureCompositionCreated();
            }
        }
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        checkAddView();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        checkAddView();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        checkAddView();
        super.addView(view, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    private final ComposeViewContext resolveComposeViewContext() {
        ComposeViewContext composeViewContext;
        asFrameworkPaint viewModelStoreOwner$ui;
        if (getChildCount() == 0) {
            composeViewContext = null;
        } else {
            View childAt = getChildAt(0);
            AndroidComposeView androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                composeViewContext = androidComposeView.getComposeViewContext();
            } else {
                composeViewContext = null;
            }
        }
        View viewFindViewTreeComposeViewRoot = ComposeView_androidKt.findViewTreeComposeViewRoot(this);
        ComposeViewContext composeViewContext2 = ComposeView_androidKt.getComposeViewContext(viewFindViewTreeComposeViewRoot);
        if (composeViewContext2 != null) {
            return updateAutoCreatedComposeViewContext(viewFindViewTreeComposeViewRoot, composeViewContext2);
        }
        getBirthDateYear getbirthdateyearResolveParentCompositionContext = resolveParentCompositionContext();
        accessisRenderNodeCompatiblecp lifecycleOwner$ui = (accessisRenderNodeCompatiblecp) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1819368283, -1819368281, getCieXyz.write(), getCieXyz.write(), new Object[]{viewFindViewTreeComposeViewRoot}, getCieXyz.write());
        if (lifecycleOwner$ui == null) {
            lifecycleOwner$ui = composeViewContext != null ? composeViewContext.getLifecycleOwner$ui() : null;
            if (lifecycleOwner$ui == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return null;
            }
        }
        accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp = lifecycleOwner$ui;
        getTransparent0d7_KjU gettransparent0d7_kjuRemoteActionCompatParcelizer = UrlUtils.RemoteActionCompatParcelizer(viewFindViewTreeComposeViewRoot);
        if (gettransparent0d7_kjuRemoteActionCompatParcelizer == null) {
            gettransparent0d7_kjuRemoteActionCompatParcelizer = composeViewContext != null ? composeViewContext.getSavedStateRegistryOwner$ui() : null;
            if (gettransparent0d7_kjuRemoteActionCompatParcelizer == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                return null;
            }
        }
        getTransparent0d7_KjU gettransparent0d7_kju = gettransparent0d7_kjuRemoteActionCompatParcelizer;
        asFrameworkPaint asframeworkpaint = (asFrameworkPaint) BuildersKt.IconCompatParcelizer(-1340292176, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer(), 1340292178, new Object[]{viewFindViewTreeComposeViewRoot}, AndroidDeviceLocationProvider.Companion.RemoteActionCompatParcelizer());
        if (asframeworkpaint == null) {
            viewModelStoreOwner$ui = composeViewContext != null ? composeViewContext.getViewModelStoreOwner$ui() : null;
        } else {
            viewModelStoreOwner$ui = asframeworkpaint;
        }
        ComposeViewContext composeViewContext3 = new ComposeViewContext(viewFindViewTreeComposeViewRoot, getbirthdateyearResolveParentCompositionContext, accessisrendernodecompatiblecp, gettransparent0d7_kju, viewModelStoreOwner$ui);
        ComposeView_androidKt.setComposeViewContext(viewFindViewTreeComposeViewRoot, composeViewContext3);
        return composeViewContext3;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, layoutParams);
    }

    private final getBirthDateYear cacheIfAlive(getBirthDateYear getbirthdateyear) {
        getBirthDateYear getbirthdateyear2 = isAlive(getbirthdateyear) ? getbirthdateyear : null;
        if (getbirthdateyear2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(getbirthdateyear2);
        }
        return getbirthdateyear;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, i, layoutParams);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AbstractComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @ExperimentalComposeViewContextApi
    public final void createComposition(ComposeViewContext composeViewContext) {
        if (composeViewContext.getView$ui().isAttachedToWindow()) {
            setComposeViewContext$ui(composeViewContext);
            ensureCompositionCreated();
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("createComposition requires the ComposeViewContext's view to be attached to a window.");
        }
    }
}
