package androidx.camera.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.lifecycle.BlockRunner;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.navigation.ui.maps.camera.transition.MapboxAnimatorSetEndListener;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.setInflatedId;

/* JADX INFO: loaded from: classes.dex */
public final class ScreenFlashView$2 implements Animator.AnimatorListener {
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ Object write;

    public /* synthetic */ ScreenFlashView$2(int i, Object obj) {
        this.IconCompatParcelizer = i;
        this.write = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.IconCompatParcelizer;
        Object obj = this.write;
        if (i == 0) {
            setInflatedId.IconCompatParcelizer(3, "ScreenFlashView");
            ((Preview$$ExternalSyntheticLambda0) obj).run();
            return;
        }
        animator.getClass();
        BlockRunner blockRunner = (BlockRunner) obj;
        CameraAnimationsPlugin cameraAnimationsPlugin = (CameraAnimationsPlugin) blockRunner.read;
        ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) blockRunner.RemoteActionCompatParcelizer;
        ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).unregisterAnimators((ValueAnimator[]) Arrays.copyOf(valueAnimatorArr, valueAnimatorArr.length), false);
        Iterator it = ((CopyOnWriteArrayList) blockRunner.IconCompatParcelizer).iterator();
        while (it.hasNext()) {
            ((MapboxAnimatorSetEndListener) it.next()).onAnimationEnd(blockRunner);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.IconCompatParcelizer != 0) {
            animator.getClass();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        if (this.IconCompatParcelizer != 0) {
            animator.getClass();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.IconCompatParcelizer != 0) {
            animator.getClass();
        }
    }
}
