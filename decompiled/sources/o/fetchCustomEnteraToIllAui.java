package o;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fetchCustomEnteraToIllAui extends androidx.core.view.AccessibilityDelegateCompat {
    public final /* synthetic */ int IconCompatParcelizer;

    public /* synthetic */ fetchCustomEnteraToIllAui(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (this.IconCompatParcelizer != 0) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            return;
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        BrazeInAppMessageManagerunregisterInAppMessageManager3.RemoteActionCompatParcelizer(accessibilityEvent, nestedScrollView.getScrollX());
        BrazeInAppMessageManagerunregisterInAppMessageManager3.read(accessibilityEvent, nestedScrollView.getScrollRange());
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        int scrollRange;
        if (this.IconCompatParcelizer != 0) {
            super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
            int[] iArr = DrawerLayout.RemoteActionCompatParcelizer;
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            if (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) {
                focusRestorerKtsaveFocusedChild11.RemoteActionCompatParcelizer = -1;
                focusRestorerKtsaveFocusedChild11.write.setParent(null);
                return;
            }
            return;
        }
        super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        focusRestorerKtsaveFocusedChild11.read(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(true);
        if (nestedScrollView.getScrollY() > 0) {
            focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.MediaSessionCompatQueueItem);
            focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.ParcelableVolumeInfo);
            focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.MediaDescriptionCompat);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        int iMin;
        if (this.IconCompatParcelizer != 0) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (nestedScrollView.isEnabled()) {
            int height = nestedScrollView.getHeight();
            android.graphics.Rect rect = new android.graphics.Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i == 4096) {
                int paddingBottom = nestedScrollView.getPaddingBottom();
                int paddingTop = nestedScrollView.getPaddingTop();
                iMin = Math.min(nestedScrollView.getScrollY() + ((height - paddingBottom) - paddingTop), nestedScrollView.getScrollRange());
                if (iMin != nestedScrollView.getScrollY()) {
                    nestedScrollView.serializer(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                    return true;
                }
            } else if (i == 8192 || i == 16908344) {
                int paddingBottom2 = nestedScrollView.getPaddingBottom();
                int iMax = Math.max(nestedScrollView.getScrollY() - ((height - paddingBottom2) - nestedScrollView.getPaddingTop()), 0);
                if (iMax != nestedScrollView.getScrollY()) {
                    nestedScrollView.serializer(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                    return true;
                }
            } else if (i == 16908346) {
                int paddingBottom3 = nestedScrollView.getPaddingBottom();
                int paddingTop2 = nestedScrollView.getPaddingTop();
                iMin = Math.min(nestedScrollView.getScrollY() + ((height - paddingBottom3) - paddingTop2), nestedScrollView.getScrollRange());
                if (iMin != nestedScrollView.getScrollY()) {
                    nestedScrollView.serializer(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
                    return true;
                }
            }
        }
        return false;
    }
}
