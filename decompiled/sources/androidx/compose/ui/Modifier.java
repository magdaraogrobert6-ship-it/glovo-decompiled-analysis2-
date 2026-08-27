package androidx.compose.ui;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import o.getContentViewGroupParentLayout;
import o.onAnimationEndlambda0;
import o.onAnimationEndlambda1;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.setAllViewGroupChildrenAsNonAccessibilityImportantlambda0;

/* JADX INFO: loaded from: classes.dex */
public interface Modifier {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.ui.Modifier
        public boolean all(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean any(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return false;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return r;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldOut(R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return r;
        }

        @Override // androidx.compose.ui.Modifier
        public Modifier then(Modifier modifier) {
            return modifier;
        }

        public String toString() {
            return "Modifier";
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Modifier then(Modifier modifier, Modifier modifier2) {
            return Modifier.super.then(modifier2);
        }
    }

    boolean all(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);

    boolean any(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm);

    <R> R foldIn(R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);

    <R> R foldOut(R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);

    public interface Element extends Modifier {

        /* JADX INFO: loaded from: classes4.dex */
        public static final class DefaultImpls {
            @Deprecated
            public static boolean all(Element element, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
                return Element.super.all(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }

            @Deprecated
            public static boolean any(Element element, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
                return Element.super.any(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
            }

            @Deprecated
            public static <R> R foldIn(Element element, R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
                return (R) Element.super.foldIn(r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
            }

            @Deprecated
            public static <R> R foldOut(Element element, R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
                return (R) Element.super.foldOut(r, r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
            }

            @Deprecated
            public static Modifier then(Element element, Modifier modifier) {
                return Element.super.then(modifier);
            }
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldIn(R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return (R) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(r, this);
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldOut(R r, r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
            return (R) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(this, r);
        }

        @Override // androidx.compose.ui.Modifier
        default boolean all(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default boolean any(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            return ((Boolean) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this)).booleanValue();
        }
    }

    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;
        private Node child;
        private NodeCoordinator coordinator;
        private r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 detachedListener;
        private boolean insertedNodeAwaitingAttachForInvalidation;
        private boolean isAttached;
        private int kindSet;
        private boolean onAttachRunExpected;
        private boolean onDetachRunExpected;
        private ObserverNodeOwnerScope ownerScope;
        private Node parent;
        private getContentViewGroupParentLayout scope;
        private boolean updatedNodeAwaitingAttachForInvalidation;
        private Node node = this;
        private int aggregateChildKindSet = -1;

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public final int getAggregateChildKindSet$ui() {
            return this.aggregateChildKindSet;
        }

        public final Node getChild$ui() {
            return this.child;
        }

        public final NodeCoordinator getCoordinator$ui() {
            return this.coordinator;
        }

        public final r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 getDetachedListener$ui() {
            return this.detachedListener;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        public final int getKindSet$ui() {
            return this.kindSet;
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        public final Node getNode() {
            return this.node;
        }

        public final ObserverNodeOwnerScope getOwnerScope$ui() {
            return this.ownerScope;
        }

        public final Node getParent$ui() {
            return this.parent;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        public final boolean isAttached() {
            return this.isAttached;
        }

        /* JADX INFO: renamed from: isKind-H91voCI$ui, reason: not valid java name */
        public final boolean m151isKindH91voCI$ui(int i) {
            return (i & getKindSet$ui()) != 0;
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        public final void setAggregateChildKindSet$ui(int i) {
            this.aggregateChildKindSet = i;
        }

        public void setAsDelegateTo$ui(Node node) {
            this.node = node;
        }

        public final void setChild$ui(Node node) {
            this.child = node;
        }

        public final void setDetachedListener$ui(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
            this.detachedListener = r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui(boolean z) {
            this.insertedNodeAwaitingAttachForInvalidation = z;
        }

        public final void setKindSet$ui(int i) {
            this.kindSet = i;
        }

        public final void setOwnerScope$ui(ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.ownerScope = observerNodeOwnerScope;
        }

        public final void setParent$ui(Node node) {
            this.parent = node;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui(boolean z) {
            this.updatedNodeAwaitingAttachForInvalidation = z;
        }

        public void updateCoordinator$ui(NodeCoordinator nodeCoordinator) {
            this.coordinator = nodeCoordinator;
        }

        public final getContentViewGroupParentLayout getCoroutineScope() {
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.scope;
            if (getcontentviewgroupparentlayout != null) {
                return getcontentviewgroupparentlayout;
            }
            ContextScope contextScopeRemoteActionCompatParcelizer = YieldKt.RemoteActionCompatParcelizer(DelegatableNodeKt.requireOwner(this).getCoroutineContext().plus(new onAnimationEndlambda0((setAllViewGroupChildrenAsNonAccessibilityImportantlambda0) DelegatableNodeKt.requireOwner(this).getCoroutineContext().get(onAnimationEndlambda1.RemoteActionCompatParcelizer))));
            this.scope = contextScopeRemoteActionCompatParcelizer;
            return contextScopeRemoteActionCompatParcelizer;
        }

        public final void sideEffect(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }

        public void markAsAttached$ui() {
            if (this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node attached multiple times");
            }
            if (this.coordinator == null) {
                InlineClassHelperKt.throwIllegalStateException("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void markAsDetached$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            getContentViewGroupParentLayout getcontentviewgroupparentlayout = this.scope;
            if (getcontentviewgroupparentlayout != null) {
                YieldKt.write(getcontentviewgroupparentlayout, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void runAttachLifecycle$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            onAttach();
            this.onDetachRunExpected = true;
        }

        public void runDetachLifecycle$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("node detached multiple times");
            }
            if (this.coordinator == null) {
                InlineClassHelperKt.throwIllegalStateException("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                InlineClassHelperKt.throwIllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0 = this.detachedListener;
            if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
                r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            }
            onDetach();
        }

        public void reset$ui() {
            if (!this.isAttached) {
                InlineClassHelperKt.throwIllegalStateException("reset() called on an unattached node");
            }
            onReset();
        }
    }

    default Modifier then(Modifier modifier) {
        return modifier == Companion ? this : new CombinedModifier(this, modifier);
    }
}
