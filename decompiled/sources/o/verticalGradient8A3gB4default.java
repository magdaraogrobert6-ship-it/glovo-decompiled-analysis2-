package o;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public class verticalGradient8A3gB4default extends androidx.core.view.AccessibilityDelegateCompat {
    public final androidx.recyclerview.widget.RecyclerView RemoteActionCompatParcelizer;
    public final sweepGradientUv8p0NAdefault read;

    public androidx.core.view.AccessibilityDelegateCompat IconCompatParcelizer() {
        return this.read;
    }

    public verticalGradient8A3gB4default(androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.RemoteActionCompatParcelizer = recyclerView;
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompatIconCompatParcelizer = IconCompatParcelizer();
        if (accessibilityDelegateCompatIconCompatParcelizer == null || !(accessibilityDelegateCompatIconCompatParcelizer instanceof sweepGradientUv8p0NAdefault)) {
            this.read = new sweepGradientUv8p0NAdefault(this);
        } else {
            this.read = (sweepGradientUv8p0NAdefault) accessibilityDelegateCompatIconCompatParcelizer;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof androidx.recyclerview.widget.RecyclerView) || this.RemoteActionCompatParcelizer.hasPendingAdapterUpdates()) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().read(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.RemoteActionCompatParcelizer;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        androidx.recyclerview.widget.RecyclerView recyclerView2 = layoutManager.ensureViewModelStore;
        layoutManager.read(recyclerView2.getLastCustomNonConfigurationInstance, recyclerView2.onCreatePanelMenu, focusRestorerKtsaveFocusedChild11);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.RemoteActionCompatParcelizer;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().RemoteActionCompatParcelizer(i, bundle);
    }
}
