package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetModifierNodeKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.room.RoomDatabase$closeBarrier$1;
import androidx.room.RoomDatabase$createConnectionManager$3;
import bo.app.ah$$ExternalSyntheticLambda0;
import coil3.RealImageLoader;
import com.roadrunner.home.HomeFragment;
import kotlinx.coroutines.BuildersKt;
import o.BottomSheetScaffoldKtStandardBottomSheet3;
import o.ButtonColors;
import o.ButtonDefaults;
import o.LazyLayoutScrollDeltaBetweenPassesKt;
import o.createInAppMessageEventSubscriber;
import o.executeRequest;
import o.getCieXyz;
import o.onAnimationEndlambda1;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;
import o.speculativeHit;
import o.waitForFirstLayout;

/* JADX INFO: loaded from: classes.dex */
public final class FocusableNode extends DelegatingNode implements SemanticsModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode, ObserverModifierNode, TraversableNode {
    public static final speculativeHit read = new speculativeHit(2);
    public final FocusTargetModifierNode IconCompatParcelizer;
    public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM MediaDescriptionCompat;
    public PinnableContainer.PinnedHandle MediaSessionCompatQueueItem;
    public MutableInteractionSourceImpl RemoteActionCompatParcelizer;
    public BottomSheetScaffoldKtStandardBottomSheet3 serializer;
    public LayoutCoordinates write;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object getTraverseKey() {
        return read;
    }

    public final void RemoteActionCompatParcelizer(MutableInteractionSourceImpl mutableInteractionSourceImpl) {
        BottomSheetScaffoldKtStandardBottomSheet3 bottomSheetScaffoldKtStandardBottomSheet3;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, mutableInteractionSourceImpl}, getCieXyz.write())).booleanValue()) {
            return;
        }
        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = this.RemoteActionCompatParcelizer;
        if (mutableInteractionSourceImpl2 != null && (bottomSheetScaffoldKtStandardBottomSheet3 = this.serializer) != null) {
            mutableInteractionSourceImpl2.write(new ButtonColors(bottomSheetScaffoldKtStandardBottomSheet3));
        }
        this.serializer = null;
        this.RemoteActionCompatParcelizer = mutableInteractionSourceImpl;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setFocused(semanticsPropertyReceiver, this.IconCompatParcelizer.getFocusState().isFocused());
        SemanticsPropertiesKt.requestFocus$default(semanticsPropertyReceiver, null, new RoomDatabase$closeBarrier$1(0, this, FocusableNode.class, "requestFocus", "requestFocus()Z", 0, 1), 1, null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.write = layoutCoordinates;
        if (this.IconCompatParcelizer.getFocusState().isFocused()) {
            boolean zIsAttached = layoutCoordinates.isAttached();
            executeRequest executerequest = LazyLayoutScrollDeltaBetweenPassesKt.RemoteActionCompatParcelizer;
            if (!zIsAttached) {
                if (isAttached()) {
                    TraversableNodeKt.findNearestAncestor(this, executerequest);
                }
            } else {
                LayoutCoordinates layoutCoordinates2 = this.write;
                if (layoutCoordinates2 != null && layoutCoordinates2.isAttached() && isAttached()) {
                    TraversableNodeKt.findNearestAncestor(this, executerequest);
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        ObserverModifierNodeKt.observeReads(this, new ah$$ExternalSyntheticLambda0(createinappmessageeventsubscriber, 3, this));
        PinnableContainer pinnableContainer = (PinnableContainer) createinappmessageeventsubscriber.IconCompatParcelizer;
        if (this.IconCompatParcelizer.getFocusState().isFocused()) {
            PinnableContainer.PinnedHandle pinnedHandle = this.MediaSessionCompatQueueItem;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.MediaSessionCompatQueueItem = pinnableContainer != null ? pinnableContainer.pin() : null;
        }
    }

    public FocusableNode(MutableInteractionSourceImpl mutableInteractionSourceImpl, int i, HomeFragment.AnonymousClass1 anonymousClass1) {
        this.RemoteActionCompatParcelizer = mutableInteractionSourceImpl;
        this.MediaDescriptionCompat = anonymousClass1;
        this.IconCompatParcelizer = (FocusTargetModifierNode) delegate(FocusTargetModifierNodeKt.m386FocusTargetModifierNodePYyLHbc(i, new RoomDatabase$createConnectionManager$3(2, this, FocusableNode.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 1)));
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onReset() {
        PinnableContainer.PinnedHandle pinnedHandle = this.MediaSessionCompatQueueItem;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.MediaSessionCompatQueueItem = null;
    }

    public final void RemoteActionCompatParcelizer(MutableInteractionSourceImpl mutableInteractionSourceImpl, ButtonDefaults buttonDefaults) {
        if (!isAttached()) {
            mutableInteractionSourceImpl.write(buttonDefaults);
        } else {
            setAllViewGroupChildrenAsNonAccessibilityImportantlambda0 setallviewgroupchildrenasnonaccessibilityimportantlambda0 = (setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) getCoroutineScope().getCoroutineContext().get(onAnimationEndlambda1.RemoteActionCompatParcelizer);
            BuildersKt.RemoteActionCompatParcelizer(getCoroutineScope(), null, null, new RealImageLoader.AnonymousClass2(mutableInteractionSourceImpl, buttonDefaults, setallviewgroupchildrenasnonaccessibilityimportantlambda0 != null ? setallviewgroupchildrenasnonaccessibilityimportantlambda0.IconCompatParcelizer(new waitForFirstLayout(mutableInteractionSourceImpl, 9, buttonDefaults)) : null, null, 3), 3);
        }
    }
}
