package com.mapbox.maps.plugin.compass;

import android.animation.ValueAnimator;
import com.mapbox.maps.plugin.animation.CameraAnimationsPluginImpl$registerInternalListener$1;
import com.mapbox.maps.plugin.locationcomponent.animators.PuckAnimator;
import com.mapbox.maps.threading.AnimationThreadController;
import o.removeNodeAtDepth;
import org.koin.core.instance.SingleInstanceFactory$get$1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CompassViewPlugin$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ CompassViewPlugin$$ExternalSyntheticLambda0(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        if (i != 0) {
            if (i != 1) {
                valueAnimator.getClass();
                AnimationThreadController.INSTANCE.postOnMainThread(new SingleInstanceFactory$get$1(valueAnimator, 5, (PuckAnimator) obj));
                return;
            } else {
                valueAnimator.getClass();
                AnimationThreadController.INSTANCE.postOnMainThread((CameraAnimationsPluginImpl$registerInternalListener$1) obj);
                return;
            }
        }
        CompassViewPlugin compassViewPlugin = (CompassViewPlugin) obj;
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        float fFloatValue = ((Float) animatedValue).floatValue();
        if (fFloatValue < compassViewPlugin.internalSettings.opacity) {
            CompassViewImpl compassViewImpl = compassViewPlugin.compassView;
            if (compassViewImpl != null) {
                compassViewImpl.setCompassAlpha(fFloatValue);
            } else {
                removeNodeAtDepth.serializer("compassView");
                throw null;
            }
        }
    }
}
