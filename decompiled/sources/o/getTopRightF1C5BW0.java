package o;

import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class getTopRightF1C5BW0 extends androidx.core.view.AccessibilityDelegateCompat {
    public final /* synthetic */ DrawerLayout RemoteActionCompatParcelizer;

    public getTopRightF1C5BW0(DrawerLayout drawerLayout) {
        this.RemoteActionCompatParcelizer = drawerLayout;
        new android.graphics.Rect();
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        int[] iArr = DrawerLayout.RemoteActionCompatParcelizer;
        super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
        focusRestorerKtsaveFocusedChild11.read("androidx.drawerlayout.widget.DrawerLayout");
        AccessibilityNodeInfo accessibilityNodeInfo = focusRestorerKtsaveFocusedChild11.write;
        accessibilityNodeInfo.setFocusable(false);
        accessibilityNodeInfo.setFocused(false);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) FocusRestorerNode.RatingCompat.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) FocusRestorerNode.RemoteActionCompatParcelizer.r8lambda54BeH8ZsBru0CXI2CCSP2syNys);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        int[] iArr = DrawerLayout.RemoteActionCompatParcelizer;
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        DrawerLayout drawerLayout = this.RemoteActionCompatParcelizer;
        View viewWrite = drawerLayout.write();
        if (viewWrite == null) {
            return true;
        }
        int iMediaSessionCompatQueueItem = drawerLayout.MediaSessionCompatQueueItem(viewWrite);
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        Gravity.getAbsoluteGravity(iMediaSessionCompatQueueItem, drawerLayout.getLayoutDirection());
        return true;
    }
}
