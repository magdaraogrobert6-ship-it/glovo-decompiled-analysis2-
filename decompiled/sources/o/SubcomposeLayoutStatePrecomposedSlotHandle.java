package o;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import io.sentry.android.core.SentryLogcatAdapter;

/* JADX INFO: loaded from: classes2.dex */
public final class SubcomposeLayoutStatePrecomposedSlotHandle implements Runnable {
    public final /* synthetic */ getSetRootui RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ SubcomposeLayoutStatePrecomposedSlotHandle(getSetRootui getsetrootui, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = getsetrootui;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect;
        int i = this.read;
        getSetRootui getsetrootui = this.RemoteActionCompatParcelizer;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            SubcomposeSlotReusePolicySlotIdsSet subcomposeSlotReusePolicySlotIdsSet = getsetrootui.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
            if (subcomposeSlotReusePolicySlotIdsSet != null) {
                WindowManager windowManager = (WindowManager) getsetrootui.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.getSystemService("window");
                if (Build.VERSION.SDK_INT >= 30) {
                    rect = getDefault.read(windowManager);
                } else {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    rect = new android.graphics.Rect();
                    rect.right = point.x;
                    rect.bottom = point.y;
                }
                int iHeight = rect.height();
                int[] iArr = new int[2];
                subcomposeSlotReusePolicySlotIdsSet.getLocationOnScreen(iArr);
                int height = (iHeight - (subcomposeSlotReusePolicySlotIdsSet.getHeight() + iArr[1])) + ((int) subcomposeSlotReusePolicySlotIdsSet.getTranslationY());
                int i4 = getsetrootui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                if (height >= i4) {
                    getsetrootui.MediaSessionCompatResultReceiverWrapper = i4;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = subcomposeSlotReusePolicySlotIdsSet.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    SentryLogcatAdapter.IconCompatParcelizer(getSetRootui.RemoteActionCompatParcelizer, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                int i5 = getsetrootui.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                getsetrootui.MediaSessionCompatResultReceiverWrapper = i5;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (i5 - height) + marginLayoutParams.bottomMargin;
                subcomposeSlotReusePolicySlotIdsSet.requestLayout();
                return;
            }
            return;
        }
        if (i == 1) {
            getsetrootui.write();
            return;
        }
        SubcomposeSlotReusePolicySlotIdsSet subcomposeSlotReusePolicySlotIdsSet2 = getsetrootui.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ;
        if (subcomposeSlotReusePolicySlotIdsSet2 == null) {
            return;
        }
        byte b = 0;
        if (subcomposeSlotReusePolicySlotIdsSet2.getParent() != null) {
            subcomposeSlotReusePolicySlotIdsSet2.setVisibility(0);
        }
        if (subcomposeSlotReusePolicySlotIdsSet2.getAnimationMode() == 1) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(getsetrootui.MediaMetadataCompat);
            valueAnimatorOfFloat.addUpdateListener(new SubcomposeLayoutStatesetCompositionContext1(getsetrootui, b, b));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
            valueAnimatorOfFloat2.setInterpolator(getsetrootui.MediaSessionCompatToken);
            valueAnimatorOfFloat2.addUpdateListener(new SubcomposeLayoutStatesetCompositionContext1(getsetrootui, i3, b));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            animatorSet.setDuration(getsetrootui.MediaBrowserCompatMediaItem);
            animatorSet.addListener(new getSetannotations(getsetrootui, b));
            animatorSet.start();
            return;
        }
        int height2 = subcomposeSlotReusePolicySlotIdsSet2.getHeight();
        ViewGroup.LayoutParams layoutParams2 = subcomposeSlotReusePolicySlotIdsSet2.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            height2 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        }
        subcomposeSlotReusePolicySlotIdsSet2.setTranslationY(height2);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(height2, 0);
        valueAnimator.setInterpolator(getsetrootui.PlaybackStateCompat);
        valueAnimator.setDuration(getsetrootui.PlaybackStateCompatCustomAction);
        valueAnimator.addListener(new getSetannotations(getsetrootui, i2));
        valueAnimator.addUpdateListener(new SubcomposeLayoutStatesetCompositionContext1(getsetrootui, height2));
        valueAnimator.start();
    }
}
