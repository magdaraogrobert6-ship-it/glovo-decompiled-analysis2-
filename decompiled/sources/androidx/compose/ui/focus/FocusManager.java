package androidx.compose.ui.focus;

import com.braze.IBraze$$ExternalSyntheticBUOutline0;

/* JADX INFO: loaded from: classes.dex */
public interface FocusManager {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    void clearFocus(boolean z);

    /* JADX INFO: renamed from: moveFocus-3ESFkO8, reason: not valid java name */
    boolean mo364moveFocus3ESFkO8(int i);

    static /* synthetic */ void clearFocus$default(FocusManager focusManager, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            focusManager.clearFocus(z);
            return;
        }
        IBraze$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: clearFocus");
    }
}
