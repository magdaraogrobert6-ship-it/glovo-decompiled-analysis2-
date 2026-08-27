package com.mapbox.maps.plugin.gestures;

import android.animation.Animator;
import bo.app.m1$$ExternalSyntheticOutline0;
import com.mapbox.android.gestures.AndroidGesturesManager;
import com.mapbox.maps.plugin.animation.CameraAnimationsPlugin;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl;
import java.util.Iterator;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class GesturesPluginImpl$createScaleAnimators$$inlined$doOnEnd$1 implements Animator.AnimatorListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GesturesPluginImpl this$0;

    public /* synthetic */ GesturesPluginImpl$createScaleAnimators$$inlined$doOnEnd$1(GesturesPluginImpl gesturesPluginImpl, int i) {
        this.$r8$classId = i;
        this.this$0 = gesturesPluginImpl;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.$r8$classId;
        animator.getClass();
        if (i == 0 || i == 1) {
            return;
        }
        GesturesPluginImpl gesturesPluginImpl = this.this$0;
        AndroidGesturesManager androidGesturesManager = gesturesPluginImpl.gesturesManager;
        if (androidGesturesManager == null) {
            removeNodeAtDepth.serializer("gesturesManager");
            throw null;
        }
        androidGesturesManager.standardScaleGestureDetector.getClass();
        Iterator it = gesturesPluginImpl.onScaleListeners.iterator();
        if (it.hasNext()) {
            m1$$ExternalSyntheticOutline0.m(it.next());
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.$r8$classId;
        GesturesPluginImpl gesturesPluginImpl = this.this$0;
        animator.getClass();
        if (i != 0) {
            if (i != 1) {
                return;
            }
            CameraAnimationsPlugin cameraAnimationsPlugin = gesturesPluginImpl.cameraAnimationsPlugin;
            if (cameraAnimationsPlugin == null) {
                removeNodeAtDepth.serializer("cameraAnimationsPlugin");
                throw null;
            }
            ((CameraAnimationsPluginImpl) cameraAnimationsPlugin).setAnchor(gesturesPluginImpl.rotateCachedAnchor);
            return;
        }
        AndroidGesturesManager androidGesturesManager = gesturesPluginImpl.gesturesManager;
        if (androidGesturesManager == null) {
            removeNodeAtDepth.serializer("gesturesManager");
            throw null;
        }
        androidGesturesManager.standardScaleGestureDetector.getClass();
        Iterator it = gesturesPluginImpl.onScaleListeners.iterator();
        if (it.hasNext()) {
            m1$$ExternalSyntheticOutline0.m(it.next());
            throw null;
        }
        CameraAnimationsPlugin cameraAnimationsPlugin2 = gesturesPluginImpl.cameraAnimationsPlugin;
        if (cameraAnimationsPlugin2 == null) {
            removeNodeAtDepth.serializer("cameraAnimationsPlugin");
            throw null;
        }
        ((CameraAnimationsPluginImpl) cameraAnimationsPlugin2).setAnchor(gesturesPluginImpl.scaleCachedAnchor);
    }
}
