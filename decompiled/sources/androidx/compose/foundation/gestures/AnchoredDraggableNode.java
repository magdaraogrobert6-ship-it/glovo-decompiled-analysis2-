package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatorMutex$mutate$2;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.BlockRunner$maybeRun$1;
import androidx.lifecycle.CoroutineLiveData$$ExternalSyntheticLambda0;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.roadrunner.auth.data.AuthRepository$logoutUser$2;
import com.roadrunner.common.data.api.MapApiError$$ExternalSyntheticLambda1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import o.CoreTextFieldKt;
import o.FloatingTextActionModeCallback;
import o.HeightInLinesNode;
import o.LayoutWithLinksAndInlineContent11Od_4g;
import o.SelectionHandleIcon;
import o.ShortNewsContentCardView;
import o.TextFieldCursor_androidKt;
import o.TriStateCheckbox;
import o.accessanimateWithTarget;
import o.accessmeasureWithTextRangeMeasureConstraints;
import o.applyMeasureResultfoundation;
import o.awaitScrollDependencies;
import o.cancelPendingWebViewPauselambda0;
import o.constructorimpl;
import o.createFromParcel;
import o.getCieXyz;
import o.getViewportSizeYbymL2g;
import o.onShowTranslationui;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.requiredWidthInVpY3zN4default;
import o.waitForFirstLayout;

/* JADX INFO: loaded from: classes.dex */
public final class AnchoredDraggableNode extends DragGestureNode {
    public Density IconCompatParcelizer;
    public AnchoredDraggableState RemoteActionCompatParcelizer;
    public SelectionHandleIcon read;
    public constructorimpl write;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
        public /* synthetic */ HeightInLinesNode RemoteActionCompatParcelizer;
        public final /* synthetic */ AnchoredDraggableNode read;
        public final /* synthetic */ DragGestureNode$startListeningForEvents$1 serializer;
        public int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1, AnchoredDraggableNode anchoredDraggableNode, ShortNewsContentCardView shortNewsContentCardView) {
            super(3, shortNewsContentCardView);
            this.serializer = dragGestureNode$startListeningForEvents$1;
            this.read = anchoredDraggableNode;
        }

        @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.serializer, this.read, (ShortNewsContentCardView) obj3);
            anonymousClass2.RemoteActionCompatParcelizer = (HeightInLinesNode) obj;
            return anonymousClass2.invokeSuspend(createFromParcel.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.write;
            if (i == 0) {
                ExtrasKt.RemoteActionCompatParcelizer(obj);
                waitForFirstLayout waitforfirstlayout = new waitForFirstLayout(this.read, 10, this.RemoteActionCompatParcelizer);
                this.write = 1;
                if (this.serializer.invoke(waitforfirstlayout, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ExtrasKt.RemoteActionCompatParcelizer(obj);
            }
            return createFromParcel.INSTANCE;
        }
    }

    public AnchoredDraggableNode(AnchoredDraggableState anchoredDraggableState, SelectionHandleIcon selectionHandleIcon, boolean z) {
        super(AnchoredDraggableKt.serializer, z, null, selectionHandleIcon);
        this.RemoteActionCompatParcelizer = anchoredDraggableState;
        this.read = selectionHandleIcon;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void IconCompatParcelizer(long j) {
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        write();
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final boolean RemoteActionCompatParcelizer() {
        return ((onShowTranslationui) this.RemoteActionCompatParcelizer.MediaMetadataCompat).getValue() != null;
    }

    public final void write() {
        requiredWidthInVpY3zN4default requiredwidthinvpy3zn4default = LayoutWithLinksAndInlineContent11Od_4g.write;
        getViewportSizeYbymL2g getviewportsizeybyml2g = LayoutWithLinksAndInlineContent11Od_4g.serializer;
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        this.IconCompatParcelizer = densityRequireDensity;
        AnchoredDraggableState anchoredDraggableState = this.RemoteActionCompatParcelizer;
        accessanimateWithTarget accessanimatewithtarget = AnchoredDraggableKt.read;
        CoreTextFieldKt coreTextFieldKt = new CoreTextFieldKt(anchoredDraggableState, getviewportsizeybyml2g, new CoroutineLiveData$$ExternalSyntheticLambda0(7, densityRequireDensity));
        float f = SnapFlingBehaviorKt.read;
        this.write = new SnapFlingBehavior(coreTextFieldKt, accessanimatewithtarget, requiredwidthinvpy3zn4default);
    }

    public final void write(AnchoredDraggableState anchoredDraggableState, SelectionHandleIcon selectionHandleIcon, boolean z) {
        boolean z2;
        boolean z3;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, anchoredDraggableState}, getCieXyz.write())).booleanValue()) {
            z2 = false;
        } else {
            this.RemoteActionCompatParcelizer = anchoredDraggableState;
            write();
            z2 = true;
        }
        if (this.read != selectionHandleIcon) {
            this.read = selectionHandleIcon;
            z3 = true;
        } else {
            z3 = z2;
        }
        serializer(this.MediaMetadataCompat, z, null, selectionHandleIcon, z3);
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public final void onDensityChange() {
        onCancelPointerInput();
        if (isAttached()) {
            Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
            Density density = this.IconCompatParcelizer;
            if (density == null || !density.equals(densityRequireDensity)) {
                this.IconCompatParcelizer = densityRequireDensity;
                write();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object access$fling(AnchoredDraggableNode anchoredDraggableNode, float f, ContinuationImpl continuationImpl) {
        accessmeasureWithTextRangeMeasureConstraints accessmeasurewithtextrangemeasureconstraints;
        cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda0;
        if (continuationImpl instanceof accessmeasureWithTextRangeMeasureConstraints) {
            accessmeasurewithtextrangemeasureconstraints = (accessmeasureWithTextRangeMeasureConstraints) continuationImpl;
            int i = accessmeasurewithtextrangemeasureconstraints.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                accessmeasurewithtextrangemeasureconstraints.serializer = i - Integer.MIN_VALUE;
            } else {
                accessmeasurewithtextrangemeasureconstraints = new accessmeasureWithTextRangeMeasureConstraints(anchoredDraggableNode, continuationImpl);
            }
        } else {
            accessmeasurewithtextrangemeasureconstraints = new accessmeasureWithTextRangeMeasureConstraints(anchoredDraggableNode, continuationImpl);
        }
        Object obj = accessmeasurewithtextrangemeasureconstraints.IconCompatParcelizer;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accessmeasurewithtextrangemeasureconstraints.serializer;
        int i3 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (anchoredDraggableNode.RemoteActionCompatParcelizer.serializer()) {
                AnchoredDraggableState anchoredDraggableState = anchoredDraggableNode.RemoteActionCompatParcelizer;
                accessmeasurewithtextrangemeasureconstraints.serializer = 1;
                if (!anchoredDraggableState.serializer()) {
                    TriStateCheckbox.read("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
                }
                Object value = ((onShowTranslationui) anchoredDraggableState.IconCompatParcelizer).getValue();
                TextFieldCursor_androidKt textFieldCursor_androidKtIconCompatParcelizer = anchoredDraggableState.IconCompatParcelizer();
                float fWrite = anchoredDraggableState.write();
                MapApiError$$ExternalSyntheticLambda1 mapApiError$$ExternalSyntheticLambda1 = anchoredDraggableState.MediaDescriptionCompat;
                if (mapApiError$$ExternalSyntheticLambda1 == null) {
                    removeNodeAtDepth.serializer("positionalThreshold");
                    throw null;
                }
                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = anchoredDraggableState.PlaybackStateCompatCustomAction;
                if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 == null) {
                    removeNodeAtDepth.serializer("velocityThreshold");
                    throw null;
                }
                Object obj3 = AnchoredDraggableKt.read(textFieldCursor_androidKtIconCompatParcelizer, fWrite, f, mapApiError$$ExternalSyntheticLambda1, r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
                Object obj4 = ((Boolean) anchoredDraggableState.serializer.invoke(obj3)).booleanValue() ? AnchoredDraggableKt.read(anchoredDraggableState, obj3, f, accessmeasurewithtextrangemeasureconstraints) : AnchoredDraggableKt.read(anchoredDraggableState, value, f, accessmeasurewithtextrangemeasureconstraints);
                if (obj4 != obj2) {
                    return obj4;
                }
            } else {
                cancelPendingWebViewPauselambda0 cancelpendingwebviewpauselambda1 = new cancelPendingWebViewPauselambda0(0);
                cancelpendingwebviewpauselambda1.write = f;
                AnchoredDraggableState anchoredDraggableState2 = anchoredDraggableNode.RemoteActionCompatParcelizer;
                AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(anchoredDraggableNode, cancelpendingwebviewpauselambda1, f, null);
                accessmeasurewithtextrangemeasureconstraints.RemoteActionCompatParcelizer = cancelpendingwebviewpauselambda1;
                accessmeasurewithtextrangemeasureconstraints.serializer = 2;
                applyMeasureResultfoundation applymeasureresultfoundation = applyMeasureResultfoundation.Default;
                awaitScrollDependencies awaitscrolldependencies = anchoredDraggableState2.MediaSessionCompatQueueItem;
                AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(anchoredDraggableState2, anchoredDraggableNode$fling$2, shortNewsContentCardView, i3);
                awaitscrolldependencies.getClass();
                Object objCoroutineScope = YieldKt.coroutineScope(new MutatorMutex$mutate$2(applymeasureresultfoundation, (Object) awaitscrolldependencies, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) authRepository$logoutUser$2, (ShortNewsContentCardView) null, 0), accessmeasurewithtextrangemeasureconstraints);
                if (objCoroutineScope != obj2) {
                    objCoroutineScope = createFromParcel.INSTANCE;
                }
                if (objCoroutineScope != obj2) {
                    cancelpendingwebviewpauselambda0 = cancelpendingwebviewpauselambda1;
                }
            }
            return obj2;
        }
        if (i2 == 1) {
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return obj;
        }
        if (i2 != 2) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cancelpendingwebviewpauselambda0 = accessmeasurewithtextrangemeasureconstraints.RemoteActionCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        return new Float(cancelpendingwebviewpauselambda0.write);
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final Object drag(DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1, DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$2) {
        AnchoredDraggableState anchoredDraggableState = this.RemoteActionCompatParcelizer;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(dragGestureNode$startListeningForEvents$1, this, null);
        applyMeasureResultfoundation applymeasureresultfoundation = applyMeasureResultfoundation.Default;
        awaitScrollDependencies awaitscrolldependencies = anchoredDraggableState.MediaSessionCompatQueueItem;
        AuthRepository$logoutUser$2 authRepository$logoutUser$2 = new AuthRepository$logoutUser$2(anchoredDraggableState, anonymousClass2, null, 1);
        awaitscrolldependencies.getClass();
        Object objCoroutineScope = YieldKt.coroutineScope(new MutatorMutex$mutate$2(applymeasureresultfoundation, (Object) awaitscrolldependencies, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) authRepository$logoutUser$2, (ShortNewsContentCardView) null, 0), dragGestureNode$startListeningForEvents$2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (objCoroutineScope != coroutineSingletons) {
            objCoroutineScope = createfromparcel;
        }
        return objCoroutineScope == coroutineSingletons ? objCoroutineScope : createfromparcel;
    }

    @Override // androidx.compose.foundation.gestures.DragGestureNode
    public final void serializer(FloatingTextActionModeCallback floatingTextActionModeCallback) {
        if (isAttached()) {
            BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new BlockRunner$maybeRun$1(this, floatingTextActionModeCallback, null, 4), 3);
        }
    }
}
