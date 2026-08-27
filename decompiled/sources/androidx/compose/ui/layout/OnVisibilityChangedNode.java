package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.UnplacedAwareModifierNode;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import o.ShortNewsContentCardView;
import o.createFromParcel;
import o.getCieXyz;
import o.getContentViewGroupParentLayout;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes4.dex */
public final class OnVisibilityChangedNode extends Modifier.Node implements ObserverModifierNode, UnplacedAwareModifierNode {
    public static final int $stable = 8;
    private r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM callback;
    private DelegatableNode.RegistrationHandle handle;
    private setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 job;
    private RelativeLayoutBounds lastBounds;
    private boolean lastReportedResult;
    private boolean lastResult;
    private RelativeLayoutBounds lastViewport;
    private long minDurationMs;
    private float minFractionVisible;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM rectChanged = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.layout.OnVisibilityChangedNode$rectChanged$1
        public final void invoke(RelativeLayoutBounds relativeLayoutBounds) {
            OnVisibilityChangedNode onVisibilityChangedNode = this.this$0;
            LayoutBoundsHolder viewportBounds = onVisibilityChangedNode.getViewportBounds();
            onVisibilityChangedNode.setLastViewport(viewportBounds != null ? viewportBounds.getBounds() : null);
            OnVisibilityChangedNode onVisibilityChangedNode2 = this.this$0;
            onVisibilityChangedNode2.checkVisibility(onVisibilityChangedNode2.getMinFractionVisible(), relativeLayoutBounds, this.this$0.getLastViewport());
        }

        {
            super(1);
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RelativeLayoutBounds) obj);
            return createFromParcel.INSTANCE;
        }
    };
    private LayoutBoundsHolder viewportBounds;

    /* JADX INFO: renamed from: androidx.compose.ui.layout.OnVisibilityChangedNode$checkVisibility$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return OnVisibilityChangedNode.this.new AnonymousClass1(shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                long minDurationMs = OnVisibilityChangedNode.this.getMinDurationMs();
                this.label = 1;
                if (DelayKt.delay(minDurationMs, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            OnVisibilityChangedNode.this.triggerCallback();
            return createFromParcel.INSTANCE;
        }

        public AnonymousClass1(ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getCallback() {
        return this.callback;
    }

    public final DelegatableNode.RegistrationHandle getHandle() {
        return this.handle;
    }

    public final setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 getJob() {
        return this.job;
    }

    public final RelativeLayoutBounds getLastBounds() {
        return this.lastBounds;
    }

    public final boolean getLastReportedResult() {
        return this.lastReportedResult;
    }

    public final boolean getLastResult() {
        return this.lastResult;
    }

    public final RelativeLayoutBounds getLastViewport() {
        return this.lastViewport;
    }

    public final long getMinDurationMs() {
        return this.minDurationMs;
    }

    public final float getMinFractionVisible() {
        return this.minFractionVisible;
    }

    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getRectChanged() {
        return this.rectChanged;
    }

    public final LayoutBoundsHolder getViewportBounds() {
        return this.viewportBounds;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateViewport();
    }

    @Override // androidx.compose.ui.node.UnplacedAwareModifierNode
    public void onUnplaced() {
        fireExitIfNeeded();
    }

    public final void setCallback(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.callback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
    }

    public final void setHandle(DelegatableNode.RegistrationHandle registrationHandle) {
        this.handle = registrationHandle;
    }

    public final void setJob(setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0) {
        this.job = setallviewgroupchildrenasnonaccessibilityimportantlambda0;
    }

    public final void setLastBounds(RelativeLayoutBounds relativeLayoutBounds) {
        this.lastBounds = relativeLayoutBounds;
    }

    public final void setLastReportedResult(boolean z) {
        this.lastReportedResult = z;
    }

    public final void setLastResult(boolean z) {
        this.lastResult = z;
    }

    public final void setLastViewport(RelativeLayoutBounds relativeLayoutBounds) {
        this.lastViewport = relativeLayoutBounds;
    }

    public final void setMinDurationMs(long j) {
        this.minDurationMs = j;
    }

    public final void setMinFractionVisible(float f) {
        this.minFractionVisible = f;
    }

    public final void setViewportBounds(LayoutBoundsHolder layoutBoundsHolder) {
        this.viewportBounds = layoutBoundsHolder;
        updateViewport();
    }

    public OnVisibilityChangedNode(long j, float f, LayoutBoundsHolder layoutBoundsHolder, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        this.minDurationMs = j;
        this.minFractionVisible = f;
        this.callback = r8lambdaunavo3sxub_pc9xroryotnrlvsm;
        this.viewportBounds = layoutBoundsHolder;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        fireExitIfNeeded();
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.job;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        this.job = null;
        this.lastResult = false;
        this.lastBounds = null;
        this.lastViewport = null;
    }

    public final void checkVisibility(float f, RelativeLayoutBounds relativeLayoutBounds, RelativeLayoutBounds relativeLayoutBounds2) {
        this.lastBounds = relativeLayoutBounds;
        if (relativeLayoutBounds2 != null || this.viewportBounds == null) {
            float fFractionVisibleIn = relativeLayoutBounds2 != null ? relativeLayoutBounds.fractionVisibleIn(relativeLayoutBounds2) : relativeLayoutBounds.fractionVisibleInWindow();
            boolean z = fFractionVisibleIn > f || fFractionVisibleIn == 1.0f;
            if (z != this.lastResult) {
                this.lastResult = z;
                setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.job;
                if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
                    setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
                }
                this.job = null;
                if (z != this.lastReportedResult) {
                    if (!z || this.minDurationMs <= 0) {
                        triggerCallback();
                    } else {
                        this.job = BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new AnonymousClass1(null), 3);
                    }
                }
            }
        }
    }

    public final void forceUpdate() {
        RelativeLayoutBounds relativeLayoutBounds = this.lastBounds;
        if (relativeLayoutBounds != null) {
            checkVisibility(this.minFractionVisible, relativeLayoutBounds, this.lastViewport);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.handle = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, 0L, 0L, this.rectChanged);
        updateViewport();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        fireExitIfNeeded();
    }

    public final void updateViewport() {
        if (this.viewportBounds != null) {
            ObserverModifierNodeKt.observeReads(this, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.layout.OnVisibilityChangedNode.updateViewport.1
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m2270invoke() {
                    LayoutBoundsHolder viewportBounds = OnVisibilityChangedNode.this.getViewportBounds();
                    RelativeLayoutBounds bounds = viewportBounds != null ? viewportBounds.getBounds() : null;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{OnVisibilityChangedNode.this.getLastViewport(), bounds}, getCieXyz.write())).booleanValue()) {
                        return;
                    }
                    OnVisibilityChangedNode.this.setLastViewport(bounds);
                    OnVisibilityChangedNode.this.forceUpdate();
                }

                {
                    super(0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m2270invoke();
                    return createFromParcel.INSTANCE;
                }
            });
        } else if (this.lastViewport != null) {
            this.lastViewport = null;
            forceUpdate();
        }
    }

    public final void fireExitIfNeeded() {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.job;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        this.job = null;
        this.lastResult = false;
        if (this.lastReportedResult) {
            triggerCallback();
        }
    }

    public final void triggerCallback() {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.job;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        this.job = null;
        this.callback.invoke(Boolean.valueOf(this.lastResult));
        this.lastReportedResult = this.lastResult;
    }
}
