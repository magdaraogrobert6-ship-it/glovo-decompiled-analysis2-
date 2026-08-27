package o;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class getRequestedFocusDirectiondhqQ8s implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout RemoteActionCompatParcelizer;

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.RemoteActionCompatParcelizer;
        coordinatorLayout.RemoteActionCompatParcelizer(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.RemoteActionCompatParcelizer.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public getRequestedFocusDirectiondhqQ8s(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        this.RemoteActionCompatParcelizer = coordinatorLayout;
    }
}
