package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
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
final class OnFirstVisibleNode extends Modifier.Node implements ObserverModifierNode {
    private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 callback;
    private DelegatableNode.RegistrationHandle handle;
    private setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 job;
    private RelativeLayoutBounds lastBounds;
    private boolean lastResult;
    private RelativeLayoutBounds lastViewport;
    private long minDurationMs;
    private float minFractionVisible;
    private final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM rectChanged = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.layout.OnFirstVisibleNode$rectChanged$1
        public final void invoke(RelativeLayoutBounds relativeLayoutBounds) {
            OnFirstVisibleNode onFirstVisibleNode = this.this$0;
            onFirstVisibleNode.checkVisibility(onFirstVisibleNode.getMinFractionVisible(), relativeLayoutBounds, this.this$0.getLastViewport());
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

    /* JADX INFO: renamed from: androidx.compose.ui.layout.OnFirstVisibleNode$startTimer$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 {
        final /* synthetic */ long $minDurationMs;
        int label;
        final /* synthetic */ OnFirstVisibleNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, OnFirstVisibleNode onFirstVisibleNode, ShortNewsContentCardView<? super AnonymousClass1> shortNewsContentCardView) {
            super(2, shortNewsContentCardView);
            this.$minDurationMs = j;
            this.this$0 = onFirstVisibleNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final ShortNewsContentCardView<createFromParcel> create(Object obj, ShortNewsContentCardView<?> shortNewsContentCardView) {
            return new AnonymousClass1(this.$minDurationMs, this.this$0, shortNewsContentCardView);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                long j = this.$minDurationMs;
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            this.this$0.triggerCallback();
            return createFromParcel.INSTANCE;
        }

        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
        public final Object invoke(getContentViewGroupParentLayout getcontentviewgroupparentlayout, ShortNewsContentCardView<? super createFromParcel> shortNewsContentCardView) {
            return ((AnonymousClass1) create(getcontentviewgroupparentlayout, shortNewsContentCardView)).invokeSuspend(createFromParcel.INSTANCE);
        }
    }

    public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getCallback() {
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

    public final void setCallback(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.callback = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
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

    public final void setLastResult(boolean z) {
        this.lastResult = z;
    }

    public final void setMinDurationMs(long j) {
        this.minDurationMs = j;
    }

    public final void setMinFractionVisible(float f) {
        this.minFractionVisible = f;
    }

    public final void setLastViewport(RelativeLayoutBounds relativeLayoutBounds) {
        Object[] objArr = {this.lastViewport, relativeLayoutBounds};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return;
        }
        this.lastViewport = relativeLayoutBounds;
        forceUpdate();
    }

    public final void setViewportBounds(LayoutBoundsHolder layoutBoundsHolder) {
        this.viewportBounds = layoutBoundsHolder;
        updateViewport();
    }

    public OnFirstVisibleNode(long j, float f, LayoutBoundsHolder layoutBoundsHolder, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        this.minDurationMs = j;
        this.minFractionVisible = f;
        this.callback = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        this.viewportBounds = layoutBoundsHolder;
    }

    public final void checkVisibility(float f, RelativeLayoutBounds relativeLayoutBounds, RelativeLayoutBounds relativeLayoutBounds2) {
        this.lastBounds = relativeLayoutBounds;
        if (relativeLayoutBounds2 != null || this.viewportBounds == null) {
            float fFractionVisibleIn = relativeLayoutBounds2 != null ? relativeLayoutBounds.fractionVisibleIn(relativeLayoutBounds2) : relativeLayoutBounds.fractionVisibleInWindow();
            boolean z = fFractionVisibleIn > f || fFractionVisibleIn == 1.0f;
            if (z && !this.lastResult) {
                startTimer();
            } else if (!z && this.lastResult) {
                cancelTimer();
            }
            this.lastResult = z;
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
        updateViewport();
        this.handle = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, 0L, 0L, this.rectChanged);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
    }

    public final void triggerCallback() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.job;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        this.callback.invoke();
    }

    public final void cancelTimer() {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.job;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.job;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        this.job = null;
        this.lastResult = false;
        this.lastBounds = null;
        setLastViewport(null);
    }

    public final void updateViewport() {
        if (this.viewportBounds == null) {
            setLastViewport(null);
        } else {
            ObserverModifierNodeKt.observeReads(this, new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0() { // from class: androidx.compose.ui.layout.OnFirstVisibleNode.updateViewport.1
                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m2268invoke() {
                    OnFirstVisibleNode onFirstVisibleNode = OnFirstVisibleNode.this;
                    LayoutBoundsHolder viewportBounds = onFirstVisibleNode.getViewportBounds();
                    onFirstVisibleNode.setLastViewport(viewportBounds != null ? viewportBounds.getBounds() : null);
                }

                {
                    super(0);
                }

                @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m2268invoke();
                    return createFromParcel.INSTANCE;
                }
            });
        }
    }

    public final void startTimer() {
        long j = this.minDurationMs;
        if (j == 0) {
            triggerCallback();
            return;
        }
        setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = this.job;
        if (setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null) {
            setallviewgroupchildrenasnonaccessibilityimportantlambda0.write(null);
        }
        this.job = BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new AnonymousClass1(j, this, null), 3);
    }
}
