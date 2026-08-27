package o;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class getCutoutRects extends androidx.core.view.AccessibilityDelegateCompat {
    public final /* synthetic */ getCutoutRulers RemoteActionCompatParcelizer;

    public getCutoutRects(getCutoutRulers getcutoutrulers) {
        this.RemoteActionCompatParcelizer = getcutoutrulers;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        getCutoutRulers getcutoutrulers = this.RemoteActionCompatParcelizer;
        WindowInsetsAnimation windowInsetsAnimation = getcutoutrulers.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        android.graphics.Rect rect = getcutoutrulers.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
        if (i != 16) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        view.getHitRect(rect);
        float fCenterX = rect.centerX();
        float fCenterY = rect.centerY();
        windowInsetsAnimation.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        windowInsetsAnimation.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, FocusRestorerKtsaveFocusedChild11 focusRestorerKtsaveFocusedChild11) {
        super.onInitializeAccessibilityNodeInfo(view, focusRestorerKtsaveFocusedChild11);
        int iIntValue = ((Integer) view.getTag(com.logistics.rider.glovo.R.id.material_value_index)).intValue();
        if (iIntValue > 0) {
            focusRestorerKtsaveFocusedChild11.write.setTraversalAfter((View) this.RemoteActionCompatParcelizer.r8lambdag6d1IyBXWIL5aeSAzXsZMVuYCQs.get(iIntValue - 1));
        }
        focusRestorerKtsaveFocusedChild11.IconCompatParcelizer(FocusRestorerNodeonExit1.serializer(0, 1, iIntValue, 1, view.isSelected()));
        focusRestorerKtsaveFocusedChild11.write.setClickable(true);
        focusRestorerKtsaveFocusedChild11.write(FocusRestorerNode.serializer);
    }
}
