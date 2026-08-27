package androidx.compose.ui.focus;

import androidx.compose.ui.ExperimentalComposeUiApi;
import o.onItemDismisslambda0;

/* JADX INFO: loaded from: classes.dex */
public interface FocusEnterExitScope {
    @ExperimentalComposeUiApi
    @onItemDismisslambda0
    default void cancelFocus() {
        cancelFocusChange();
    }

    void cancelFocusChange();

    /* JADX INFO: renamed from: getRequestedFocusDirection-dhqQ-8s */
    int mo345getRequestedFocusDirectiondhqQ8s();
}
