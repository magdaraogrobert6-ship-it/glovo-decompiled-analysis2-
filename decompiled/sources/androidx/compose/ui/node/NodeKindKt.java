package androidx.compose.ui.node;

import androidx.compose.ui.Actual_jvmAndAndroidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNodeKt;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnPlacedNode;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import androidx.compose.ui.semantics.SemanticsModifier;
import o.AnchoredDraggableState;
import o.ContentInViewNodeKt;

/* JADX INFO: loaded from: classes.dex */
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;
    private static final AnchoredDraggableState classToKindSetMap;

    /* JADX INFO: renamed from: contains-64DMado, reason: not valid java name */
    public static final boolean m2559contains64DMado(int i, int i2) {
        return (i & i2) != 0;
    }

    private static /* synthetic */ void getInserted$annotations() {
    }

    private static /* synthetic */ void getRemoved$annotations() {
    }

    private static /* synthetic */ void getUpdated$annotations() {
    }

    /* JADX INFO: renamed from: or-64DMado, reason: not valid java name */
    public static final int m2561or64DMado(int i, int i2) {
        return i | i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNodeSelf(Modifier.Node node, int i, int i2) {
        if (i2 != 0 || node.getShouldAutoInvalidate()) {
            if ((NodeKind.m2551constructorimpl(2) & i) != 0 && (node instanceof LayoutModifierNode)) {
                LayoutModifierNodeKt.invalidateMeasurement((LayoutModifierNode) node);
                if (i2 == 2) {
                    DelegatableNodeKt.m2391requireCoordinator64DMado(node, NodeKind.m2551constructorimpl(2)).onRelease();
                }
            }
            if ((NodeKind.m2551constructorimpl(Fields.SpotShadowColor) & i) != 0 && i2 != 2) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui();
            }
            if ((NodeKind.m2551constructorimpl(4194304) & i) != 0 && i2 != 2) {
                LayoutNode.requestRelayout$ui$default(DelegatableNodeKt.requireLayoutNode(node), false, 1, null);
            }
            if ((NodeKind.m2551constructorimpl(Fields.RotationX) & i) != 0 && (node instanceof GlobalPositionAwareModifierNode)) {
                if (i2 == 1) {
                    LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(node);
                    layoutNodeRequireLayoutNode.setGloballyPositionedObservers(layoutNodeRequireLayoutNode.getGloballyPositionedObservers() + 1);
                } else if (i2 == 2) {
                    LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(node);
                    layoutNodeRequireLayoutNode2.setGloballyPositionedObservers(layoutNodeRequireLayoutNode2.getGloballyPositionedObservers() - 1);
                }
                if (i2 != 2) {
                    DelegatableNodeKt.requireLayoutNode(node).invalidateOnPositioned$ui();
                }
            }
            if ((NodeKind.m2551constructorimpl(4) & i) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
            }
            if ((NodeKind.m2551constructorimpl(8) & i) != 0 && (node instanceof SemanticsModifierNode)) {
                DelegatableNodeKt.requireLayoutNode(node).setSemanticsInvalidated$ui(true);
            }
            if ((NodeKind.m2551constructorimpl(64) & i) != 0 && (node instanceof ParentDataModifierNode)) {
                ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
            }
            if ((NodeKind.m2551constructorimpl(Fields.CameraDistance) & i) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                    FocusPropertiesModifierNodeKt.invalidateFocusProperties(focusPropertiesModifierNode);
                }
            }
            if ((NodeKind.m2551constructorimpl(Fields.TransformOrigin) & i) != 0 && (node instanceof FocusEventModifierNode)) {
                FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
            }
            if ((i & NodeKind.m2551constructorimpl(2097152)) != 0 && (node instanceof IndirectPointerInputModifierNode) && i2 == 2) {
                ((IndirectPointerInputModifierNode) node).onCancelIndirectPointerInput();
            }
        }
    }

    /* JADX INFO: renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m2560getIncludeSelfInTraversalH91voCI(int i) {
        return ((NodeKind.m2551constructorimpl(Fields.SpotShadowColor) & i) != 0) | ((i & NodeKind.m2551constructorimpl(4194304)) != 0);
    }

    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker canFocusChecker = CanFocusChecker.INSTANCE;
        canFocusChecker.reset();
        focusPropertiesModifierNode.applyFocusProperties(canFocusChecker);
        return canFocusChecker.isCanFocusSet();
    }

    static {
        AnchoredDraggableState anchoredDraggableState = ContentInViewNodeKt.read;
        classToKindSetMap = new AnchoredDraggableState();
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(Modifier.Node node) {
        if (!(node instanceof DelegatingNode)) {
            return calculateNodeKindSetFrom(node);
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        int selfKindSet$ui = delegatingNode.getSelfKindSet$ui();
        for (Modifier.Node delegate$ui = delegatingNode.getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            selfKindSet$ui |= calculateNodeKindSetFromIncludingDelegates(delegate$ui);
        }
        return selfKindSet$ui;
    }

    public static final void autoInvalidateNodeIncludingDelegates(Modifier.Node node, int i, int i2) {
        if (!(node instanceof DelegatingNode)) {
            autoInvalidateNodeSelf(node, i & node.getKindSet$ui(), i2);
            return;
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        autoInvalidateNodeSelf(node, delegatingNode.getSelfKindSet$ui() & i, i2);
        int selfKindSet$ui = delegatingNode.getSelfKindSet$ui();
        for (Modifier.Node delegate$ui = delegatingNode.getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            autoInvalidateNodeIncludingDelegates(delegate$ui, (~selfKindSet$ui) & i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:73:0x0103  */
    /* JADX WARN: Code duplicated, block: B:76:0x010e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0119  */
    public static final int calculateNodeKindSetFrom(Modifier.Node node) {
        int iM2551constructorimpl;
        if (node.getKindSet$ui() != 0) {
            return node.getKindSet$ui();
        }
        AnchoredDraggableState anchoredDraggableState = classToKindSetMap;
        Object objClassKeyForObject = Actual_jvmAndAndroidKt.classKeyForObject(node);
        int iSerializer = anchoredDraggableState.serializer(objClassKeyForObject);
        if (iSerializer >= 0) {
            return anchoredDraggableState.MediaMetadataCompat[iSerializer];
        }
        int iM2551constructorimpl2 = NodeKind.m2551constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(16);
        }
        if (node instanceof ModifierLocalModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(64);
        }
        if (node instanceof OnPlacedNode) {
            iM2551constructorimpl = NodeKind.m2551constructorimpl(4194304);
        } else {
            if (!(node instanceof LayoutAwareModifierNode)) {
                if (node instanceof MeasuredSizeAwareModifierNode) {
                    iM2551constructorimpl = NodeKind.m2551constructorimpl(Fields.SpotShadowColor);
                }
                if (node instanceof GlobalPositionAwareModifierNode) {
                    iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.RotationX);
                }
                if (node instanceof ApproachLayoutModifierNode) {
                    iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.RotationY);
                }
                if (node instanceof FocusTargetNode) {
                    iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.RotationZ);
                }
                if (node instanceof FocusPropertiesModifierNode) {
                    iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.CameraDistance);
                }
                if (node instanceof FocusEventModifierNode) {
                    iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.TransformOrigin);
                }
                if (node instanceof KeyInputModifierNode) {
                    iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(8192);
                }
                if (node instanceof RotaryInputModifierNode) {
                    iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.Clip);
                }
                if (node instanceof CompositionLocalConsumerModifierNode) {
                    iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.CompositingStrategy);
                }
                if (node instanceof SoftKeyboardInterceptionModifierNode) {
                    iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.RenderEffect);
                }
                if (node instanceof TraversableNode) {
                    iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.ColorFilter);
                }
                if (node instanceof BringIntoViewModifierNode) {
                    iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.BlendMode);
                }
                if (node instanceof UnplacedAwareModifierNode) {
                    iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(1048576);
                }
                if (node instanceof IndirectPointerInputModifierNode) {
                    iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(2097152);
                }
                if (node instanceof BeyondBoundsLayoutProviderModifierNode) {
                    iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(8388608);
                }
                anchoredDraggableState.write(iM2551constructorimpl2, objClassKeyForObject);
                return iM2551constructorimpl2;
            }
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.SpotShadowColor);
            iM2551constructorimpl = NodeKind.m2551constructorimpl(4194304);
        }
        iM2551constructorimpl2 |= iM2551constructorimpl;
        if (node instanceof GlobalPositionAwareModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.RotationX);
        }
        if (node instanceof ApproachLayoutModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.RotationY);
        }
        if (node instanceof FocusTargetNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.RotationZ);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.CameraDistance);
        }
        if (node instanceof FocusEventModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.TransformOrigin);
        }
        if (node instanceof KeyInputModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(8192);
        }
        if (node instanceof RotaryInputModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.Clip);
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.CompositingStrategy);
        }
        if (node instanceof SoftKeyboardInterceptionModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.RenderEffect);
        }
        if (node instanceof TraversableNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.ColorFilter);
        }
        if (node instanceof BringIntoViewModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(Fields.BlendMode);
        }
        if (node instanceof UnplacedAwareModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(1048576);
        }
        if (node instanceof IndirectPointerInputModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(2097152);
        }
        if (node instanceof BeyondBoundsLayoutProviderModifierNode) {
            iM2551constructorimpl2 |= NodeKind.m2551constructorimpl(8388608);
        }
        anchoredDraggableState.write(iM2551constructorimpl2, objClassKeyForObject);
        return iM2551constructorimpl2;
    }

    public static final void autoInvalidateInsertedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateInsertedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 1);
    }

    public static final void autoInvalidateRemovedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateRemovedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 2);
    }

    public static final void autoInvalidateUpdatedNode(Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateUpdatedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 0);
    }

    public static final int calculateNodeKindSetFrom(Modifier.Element element) {
        int iM2551constructorimpl = NodeKind.m2551constructorimpl(1);
        if (element instanceof LayoutModifier) {
            iM2551constructorimpl |= NodeKind.m2551constructorimpl(2);
        }
        if (element instanceof DrawModifier) {
            iM2551constructorimpl |= NodeKind.m2551constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            iM2551constructorimpl |= NodeKind.m2551constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            iM2551constructorimpl |= NodeKind.m2551constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            iM2551constructorimpl |= NodeKind.m2551constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            iM2551constructorimpl |= NodeKind.m2551constructorimpl(Fields.TransformOrigin);
        }
        if (element instanceof FocusOrderModifier) {
            iM2551constructorimpl |= NodeKind.m2551constructorimpl(Fields.CameraDistance);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            iM2551constructorimpl |= NodeKind.m2551constructorimpl(Fields.RotationX);
        }
        if (element instanceof ParentDataModifier) {
            iM2551constructorimpl |= NodeKind.m2551constructorimpl(64);
        }
        if (element instanceof OnPlacedModifier) {
            iM2551constructorimpl |= NodeKind.m2551constructorimpl(4194304);
        }
        if (element instanceof OnRemeasuredModifier) {
            iM2551constructorimpl |= NodeKind.m2551constructorimpl(Fields.SpotShadowColor);
        }
        return element instanceof BringIntoViewModifierNode ? NodeKind.m2551constructorimpl(Fields.BlendMode) | iM2551constructorimpl : iM2551constructorimpl;
    }
}
