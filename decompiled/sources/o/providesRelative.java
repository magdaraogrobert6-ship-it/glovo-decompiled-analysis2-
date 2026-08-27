package o;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class providesRelative extends androidx.core.view.AccessibilityDelegateCompat {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ providesRelative(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        int i = this.IconCompatParcelizer;
        if (i == 0) {
            super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
            focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer((getHasFocus) null);
        } else if (i != 1) {
            super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
            focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer((getHasFocus) null);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
            focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(false);
        }
    }
}
