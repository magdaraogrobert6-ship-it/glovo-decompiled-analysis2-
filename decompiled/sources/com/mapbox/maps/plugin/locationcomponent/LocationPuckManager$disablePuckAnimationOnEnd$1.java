package com.mapbox.maps.plugin.locationcomponent;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import com.mapbox.maps.plugin.animation.HighLevelAnimatorSet;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckBearingAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationPuckManager$disablePuckAnimationOnEnd$1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ LocationPuckManager$disablePuckAnimationOnEnd$1(int i, Object obj) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        animator.getClass();
        if (i == 0) {
            ((PuckBearingAnimator) ((LocationPuckManager) obj).animationManager.RemoteActionCompatParcelizer).enabled = false;
            animator.removeListener(this);
            return;
        }
        CameraAnimationsPluginImpl cameraAnimationsPluginImpl = (CameraAnimationsPluginImpl) obj;
        HighLevelAnimatorSet highLevelAnimatorSet = cameraAnimationsPluginImpl.highLevelAnimatorSet;
        if ((highLevelAnimatorSet != null ? highLevelAnimatorSet.animatorSet : null) == animator) {
            cameraAnimationsPluginImpl.highLevelAnimatorSet = null;
        }
    }
}
