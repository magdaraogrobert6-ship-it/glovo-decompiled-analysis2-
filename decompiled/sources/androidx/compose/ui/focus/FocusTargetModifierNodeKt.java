package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.createFromParcel;
import o.onItemDismisslambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class FocusTargetModifierNodeKt {

    /* JADX INFO: renamed from: androidx.compose.ui.focus.FocusTargetModifierNodeKt$FocusTargetModifierNode$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FocusTargetNode) obj);
            return createFromParcel.INSTANCE;
        }

        public final void invoke(FocusTargetNode focusTargetNode) {
            ((InvalidateSemantics) this.MediaMetadataCompat).onDispatchEventsCompleted(focusTargetNode);
        }

        public AnonymousClass1(Object obj) {
            super(1, 0, InvalidateSemantics.class, obj, "onDispatchEventsCompleted", "onDispatchEventsCompleted(Landroidx/compose/ui/focus/FocusTargetNode;)V");
        }
    }

    @onItemDismisslambda0
    public static final /* synthetic */ FocusTargetModifierNode FocusTargetModifierNode() {
        return new FocusTargetNode(0, false, null, new AnonymousClass1(InvalidateSemantics.INSTANCE), 7, null);
    }

    /* JADX INFO: renamed from: FocusTargetModifierNode-PYyLHbc$default, reason: not valid java name */
    public static /* synthetic */ FocusTargetModifierNode m387FocusTargetModifierNodePYyLHbc$default(int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = Focusability.Companion.m411getAlwaysLCbbffg();
        }
        if ((i2 & 2) != 0) {
            r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = null;
        }
        return m386FocusTargetModifierNodePYyLHbc(i, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
    }

    public static final Rect getFocusedRect(FocusTargetModifierNode focusTargetModifierNode) {
        if (!focusTargetModifierNode.getNode().isAttached()) {
            return null;
        }
        FocusState focusState = focusTargetModifierNode.getFocusState();
        if (!focusState.getHasFocus()) {
            return null;
        }
        if (focusState.isFocused()) {
            return FocusTargetNode.fetchFocusRect$ui$default((FocusTargetNode) focusTargetModifierNode, null, 1, null);
        }
        FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(focusTargetModifierNode).getFocusOwner().getActiveFocusTargetNode();
        if (activeFocusTargetNode != null) {
            return activeFocusTargetNode.fetchFocusRect$ui(DelegatableNodeKt.requireLayoutCoordinates(focusTargetModifierNode));
        }
        return null;
    }

    /* JADX INFO: renamed from: FocusTargetModifierNode-PYyLHbc, reason: not valid java name */
    public static final FocusTargetModifierNode m386FocusTargetModifierNodePYyLHbc(int i, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        return new FocusTargetNode(i, false, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, null, 10, null);
    }
}
