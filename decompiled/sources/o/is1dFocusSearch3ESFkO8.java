package o;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class is1dFocusSearch3ESFkO8 extends View.AccessibilityDelegate {
    public final androidx.core.view.AccessibilityDelegateCompat RemoteActionCompatParcelizer;

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.RemoteActionCompatParcelizer.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        androidx.core.view.accessibility.AccessibilityNodeProviderCompat accessibilityNodeProvider = this.RemoteActionCompatParcelizer.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return (AccessibilityNodeProvider) accessibilityNodeProvider.getProvider();
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.RemoteActionCompatParcelizer.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11 = new FocusRestorerKtsaveFocusedChild11(accessibilityNodeInfo);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        accessibilityNodeInfo.setScreenReaderFocusable(Boolean.valueOf(captureFocus.RemoteActionCompatParcelizer(view)).booleanValue());
        accessibilityNodeInfo.setHeading(Boolean.valueOf(captureFocus.serializer(view)).booleanValue());
        accessibilityNodeInfo.setPaneTitle(captureFocus.IconCompatParcelizer(view));
        if (Build.VERSION.SDK_INT >= 30) {
            tag = getFocusRequesterNodesui.read(view);
        } else {
            tag = view.getTag(com.logistics.rider.glovo.R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (Build.VERSION.SDK_INT >= 30) {
            getFocusRect.read(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.RemoteActionCompatParcelizer.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
        accessibilityNodeInfo.getText();
        List<FocusRestorerNode> actionList = androidx.core.view.AccessibilityDelegateCompat.getActionList(view);
        for (int i = 0; i < actionList.size(); i++) {
            focusRestorerKtsaveFocusedChild11.write(actionList.get(i));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.RemoteActionCompatParcelizer.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.RemoteActionCompatParcelizer.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.RemoteActionCompatParcelizer.performAccessibilityAction(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.RemoteActionCompatParcelizer.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.RemoteActionCompatParcelizer.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public is1dFocusSearch3ESFkO8(androidx.core.view.AccessibilityDelegateCompat accessibilityDelegateCompat) {
        this.RemoteActionCompatParcelizer = accessibilityDelegateCompat;
    }
}
