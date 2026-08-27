package androidx.compose.ui.focus;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class CancelIndicatingFocusBoundaryScope implements FocusEnterExitScope {
    public static final int $stable = 8;
    private boolean isCanceled;
    private final int requestedFocusDirection;

    @Override // androidx.compose.ui.focus.FocusEnterExitScope
    public void cancelFocusChange() {
        this.isCanceled = true;
    }

    @Override // androidx.compose.ui.focus.FocusEnterExitScope
    /* JADX INFO: renamed from: getRequestedFocusDirection-dhqQ-8s, reason: not valid java name */
    public int mo345getRequestedFocusDirectiondhqQ8s() {
        return this.requestedFocusDirection;
    }

    public final boolean isCanceled() {
        return this.isCanceled;
    }

    private CancelIndicatingFocusBoundaryScope(int i) {
        this.requestedFocusDirection = i;
    }

    public /* synthetic */ CancelIndicatingFocusBoundaryScope(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }
}
