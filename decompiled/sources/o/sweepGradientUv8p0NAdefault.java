package o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sweepGradientUv8p0NAdefault extends androidx.core.view.AccessibilityDelegateCompat {
    public final WeakHashMap IconCompatParcelizer = new WeakHashMap();
    public final verticalGradient8A3gB4default serializer;

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat = (androidx.core.view.AccessibilityDelegateCompat) this.IconCompatParcelizer.get(view);
        return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat = (androidx.core.view.AccessibilityDelegateCompat) this.IconCompatParcelizer.get(view);
        return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat = (androidx.core.view.AccessibilityDelegateCompat) this.IconCompatParcelizer.get(view);
        if (accessibilityDelegateCompat != null) {
            accessibilityDelegateCompat.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        verticalGradient8A3gB4default verticalgradient8a3gb4default = this.serializer;
        androidx.recyclerview.widget.RecyclerView recyclerView = verticalgradient8a3gb4default.RemoteActionCompatParcelizer;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = verticalgradient8a3gb4default.RemoteActionCompatParcelizer;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView2.getLayoutManager() == null) {
            super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
            return;
        }
        recyclerView2.getLayoutManager().IconCompatParcelizer(view, focusRestorerKtsaveFocusedChild11);
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat = (androidx.core.view.AccessibilityDelegateCompat) this.IconCompatParcelizer.get(view);
        if (accessibilityDelegateCompat != null) {
            accessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat = (androidx.core.view.AccessibilityDelegateCompat) this.IconCompatParcelizer.get(view);
        if (accessibilityDelegateCompat != null) {
            accessibilityDelegateCompat.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat = (androidx.core.view.AccessibilityDelegateCompat) this.IconCompatParcelizer.get(viewGroup);
        return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        verticalGradient8A3gB4default verticalgradient8a3gb4default = this.serializer;
        androidx.recyclerview.widget.RecyclerView recyclerView = verticalgradient8a3gb4default.RemoteActionCompatParcelizer;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = verticalgradient8a3gb4default.RemoteActionCompatParcelizer;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView2.getLayoutManager() == null) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat = (androidx.core.view.AccessibilityDelegateCompat) this.IconCompatParcelizer.get(view);
        if (accessibilityDelegateCompat != null) {
            if (accessibilityDelegateCompat.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
        } else if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        androidx.recyclerview.widget.RecyclerView.Recycler recycler = recyclerView2.getLayoutManager().ensureViewModelStore.getLastCustomNonConfigurationInstance;
        return false;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void sendAccessibilityEvent(View view, int i) {
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat = (androidx.core.view.AccessibilityDelegateCompat) this.IconCompatParcelizer.get(view);
        if (accessibilityDelegateCompat != null) {
            accessibilityDelegateCompat.sendAccessibilityEvent(view, i);
        } else {
            super.sendAccessibilityEvent(view, i);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat = (androidx.core.view.AccessibilityDelegateCompat) this.IconCompatParcelizer.get(view);
        if (accessibilityDelegateCompat != null) {
            accessibilityDelegateCompat.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public sweepGradientUv8p0NAdefault(verticalGradient8A3gB4default verticalgradient8a3gb4default) {
        this.serializer = verticalgradient8a3gb4default;
    }
}
