package androidx.compose.ui.focus;

/* JADX INFO: loaded from: classes.dex */
public final class FocusOwnerImplKt {
    /* JADX INFO: renamed from: is1dFocusSearch-3ESFkO8, reason: not valid java name */
    public static final boolean m377is1dFocusSearch3ESFkO8(int i) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        return FocusDirection.m349equalsimpl0(i, companion.m357getNextdhqQ8s()) || FocusDirection.m349equalsimpl0(i, companion.m358getPreviousdhqQ8s());
    }
}
