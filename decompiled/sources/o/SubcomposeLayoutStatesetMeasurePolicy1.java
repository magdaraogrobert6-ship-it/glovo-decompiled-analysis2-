package o;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class SubcomposeLayoutStatesetMeasurePolicy1 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        if (i == 0) {
            getSetRootui getsetrootui = (getSetRootui) message.obj;
            SubcomposeSlotReusePolicySlotIdsSet subcomposeSlotReusePolicySlotIdsSet = getsetrootui.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            if (subcomposeSlotReusePolicySlotIdsSet.getParent() == null) {
                ViewGroup.LayoutParams layoutParams = subcomposeSlotReusePolicySlotIdsSet.getLayoutParams();
                if (layoutParams instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) {
                    androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams layoutParams2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) layoutParams;
                    BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                    PinnableContainerKtLocalPinnableContainer1 pinnableContainerKtLocalPinnableContainer1 = baseTransientBottomBar$Behavior.MediaBrowserCompatMediaItem;
                    pinnableContainerKtLocalPinnableContainer1.getClass();
                    pinnableContainerKtLocalPinnableContainer1.serializer = getsetrootui.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                    baseTransientBottomBar$Behavior.RemoteActionCompatParcelizer = new SubcomposeLayoutStatePausedPrecomposition(getsetrootui);
                    layoutParams2.read(baseTransientBottomBar$Behavior);
                    layoutParams2.RemoteActionCompatParcelizer = 80;
                }
                ViewGroup viewGroup = getsetrootui.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8;
                subcomposeSlotReusePolicySlotIdsSet.read = true;
                viewGroup.addView(subcomposeSlotReusePolicySlotIdsSet);
                subcomposeSlotReusePolicySlotIdsSet.read = false;
                getsetrootui.MediaBrowserCompatMediaItem();
                subcomposeSlotReusePolicySlotIdsSet.setVisibility(4);
            }
            WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
            if (subcomposeSlotReusePolicySlotIdsSet.isLaidOut()) {
                getsetrootui.MediaMetadataCompat();
                return true;
            }
            getsetrootui.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = true;
            return true;
        }
        if (i != 1) {
            return false;
        }
        getSetRootui getsetrootui2 = (getSetRootui) message.obj;
        int i2 = message.arg1;
        SubcomposeSlotReusePolicySlotIdsSet subcomposeSlotReusePolicySlotIdsSet2 = getsetrootui2.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        android.view.accessibility.AccessibilityManager accessibilityManager = getsetrootui2.MediaSessionCompatQueueItem;
        if ((accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) || subcomposeSlotReusePolicySlotIdsSet2.getVisibility() != 0) {
            getsetrootui2.write();
            return true;
        }
        if (subcomposeSlotReusePolicySlotIdsSet2.getAnimationMode() == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setInterpolator(getsetrootui2.MediaMetadataCompat);
            valueAnimatorOfFloat.addUpdateListener(new SubcomposeLayoutStatesetCompositionContext1(getsetrootui2, 0, (byte) 0));
            valueAnimatorOfFloat.setDuration(getsetrootui2.RatingCompat);
            valueAnimatorOfFloat.addListener(new getSetannotations(getsetrootui2, i2, 1));
            valueAnimatorOfFloat.start();
            return true;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        SubcomposeSlotReusePolicySlotIdsSet subcomposeSlotReusePolicySlotIdsSet3 = getsetrootui2.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        int height = subcomposeSlotReusePolicySlotIdsSet3.getHeight();
        ViewGroup.LayoutParams layoutParams3 = subcomposeSlotReusePolicySlotIdsSet3.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            height += ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
        }
        valueAnimator.setIntValues(0, height);
        valueAnimator.setInterpolator(getsetrootui2.PlaybackStateCompat);
        valueAnimator.setDuration(getsetrootui2.PlaybackStateCompatCustomAction);
        valueAnimator.addListener(new getSetannotations(getsetrootui2, i2, 3));
        valueAnimator.addUpdateListener(new SubcomposeLayoutStatesetCompositionContext1(getsetrootui2, 3, (byte) 0));
        valueAnimator.start();
        return true;
    }
}
