package o;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class FocusTargetNodeWhenMappings extends androidx.core.view.accessibility.AccessibilityNodeProviderCompat {
    public final /* synthetic */ FocusTargetNodeinvalidateFocus1 RemoteActionCompatParcelizer;

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final FocusRestorerKtsaveFocusedChild11 findFocus(int i) {
        FocusTargetNodeinvalidateFocus1 focusTargetNodeinvalidateFocus1 = this.RemoteActionCompatParcelizer;
        int i2 = i == 2 ? focusTargetNodeinvalidateFocus1.IconCompatParcelizer : focusTargetNodeinvalidateFocus1.MediaBrowserCompatMediaItem;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return createAccessibilityNodeInfo(i2);
    }

    public FocusTargetNodeWhenMappings(FocusTargetNodeinvalidateFocus1 focusTargetNodeinvalidateFocus1) {
        this.RemoteActionCompatParcelizer = focusTargetNodeinvalidateFocus1;
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final FocusRestorerKtsaveFocusedChild11 createAccessibilityNodeInfo(int i) {
        return new FocusRestorerKtsaveFocusedChild11(AccessibilityNodeInfo.obtain(this.RemoteActionCompatParcelizer.write(i).write));
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final boolean performAction(int i, int i2, Bundle bundle) {
        int i3;
        FocusTargetNodeinvalidateFocus1 focusTargetNodeinvalidateFocus1 = this.RemoteActionCompatParcelizer;
        RootMeasurePolicy rootMeasurePolicy = focusTargetNodeinvalidateFocus1.serializer;
        if (i == -1) {
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            return rootMeasurePolicy.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return focusTargetNodeinvalidateFocus1.read(i);
        }
        if (i2 == 2) {
            return focusTargetNodeinvalidateFocus1.serializer(i);
        }
        boolean z = false;
        if (i2 == 64) {
            android.view.accessibility.AccessibilityManager accessibilityManager = focusTargetNodeinvalidateFocus1.RatingCompat;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = focusTargetNodeinvalidateFocus1.IconCompatParcelizer) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                focusTargetNodeinvalidateFocus1.IconCompatParcelizer = Integer.MIN_VALUE;
                rootMeasurePolicy.invalidate();
                focusTargetNodeinvalidateFocus1.read(i3, 65536);
            }
            focusTargetNodeinvalidateFocus1.IconCompatParcelizer = i;
            rootMeasurePolicy.invalidate();
            focusTargetNodeinvalidateFocus1.read(i, androidx.compose.ui.graphics.Fields.CompositingStrategy);
            return true;
        }
        if (i2 == 128) {
            if (focusTargetNodeinvalidateFocus1.IconCompatParcelizer != i) {
                return false;
            }
            focusTargetNodeinvalidateFocus1.IconCompatParcelizer = Integer.MIN_VALUE;
            rootMeasurePolicy.invalidate();
            focusTargetNodeinvalidateFocus1.read(i, 65536);
            return true;
        }
        RootMeasurePolicy rootMeasurePolicy2 = ((RootMeasurePolicymeasure1) focusTargetNodeinvalidateFocus1).PlaybackStateCompat;
        if (i2 == 16) {
            if (i == 0) {
                return rootMeasurePolicy2.performClick();
            }
            if (i == 1) {
                rootMeasurePolicy2.playSoundEffect(0);
                View.OnClickListener onClickListener = rootMeasurePolicy2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
                if (onClickListener != null) {
                    onClickListener.onClick(rootMeasurePolicy2);
                    z = true;
                }
                if (rootMeasurePolicy2.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4) {
                    rootMeasurePolicy2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.read(1, 1);
                }
            }
        }
        return z;
    }
}
