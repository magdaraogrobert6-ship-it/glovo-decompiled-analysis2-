package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class ObserverModifierNodeKt {
    public static final <T extends Modifier.Node & ObserverModifierNode> void observeReads(T t, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        ObserverNodeOwnerScope ownerScope$ui = t.getOwnerScope$ui();
        if (ownerScope$ui == null) {
            ObserverNodeOwnerScope observerNodeOwnerScope = new ObserverNodeOwnerScope(t);
            t.setOwnerScope$ui(observerNodeOwnerScope);
            ownerScope$ui = observerNodeOwnerScope;
        }
        OwnerSnapshotObserver snapshotObserver = DelegatableNodeKt.requireOwner(t).getSnapshotObserver();
        snapshotObserver.observer.serializer(ownerScope$ui, ObserverNodeOwnerScope.Companion.getOnObserveReadsChanged$ui(), r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
    }
}
