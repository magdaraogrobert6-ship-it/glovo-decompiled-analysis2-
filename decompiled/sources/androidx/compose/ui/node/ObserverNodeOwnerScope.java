package androidx.compose.ui.node;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes.dex */
public final class ObserverNodeOwnerScope implements OwnerScope {
    private final ObserverModifierNode observerNode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM OnObserveReadsChanged = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1
        public final void invoke(ObserverNodeOwnerScope observerNodeOwnerScope) {
            if (observerNodeOwnerScope.isValidOwnerScope()) {
                observerNodeOwnerScope.getObserverNode$ui().onObservedReadsChanged();
            }
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ObserverNodeOwnerScope) obj);
            return createFromParcel.INSTANCE;
        }
    };

    public final ObserverModifierNode getObserverNode$ui() {
        return this.observerNode;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.observerNode.getNode().isAttached();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM getOnObserveReadsChanged$ui() {
            return ObserverNodeOwnerScope.OnObserveReadsChanged;
        }

        private Companion() {
        }
    }

    public ObserverNodeOwnerScope(ObserverModifierNode observerModifierNode) {
        this.observerNode = observerModifierNode;
    }
}
