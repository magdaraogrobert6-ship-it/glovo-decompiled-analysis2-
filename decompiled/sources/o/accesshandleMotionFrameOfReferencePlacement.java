package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class accesshandleMotionFrameOfReferencePlacement {
    public final processDragGesture RemoteActionCompatParcelizer = new processDragGesture(0);
    public final processDragGesture IconCompatParcelizer = new processDragGesture(0);

    public static accesshandleMotionFrameOfReferencePlacement IconCompatParcelizer(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return serializer(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return serializer(arrayList);
        } catch (Exception e) {
            SentryLogcatAdapter.write("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public static accesshandleMotionFrameOfReferencePlacement serializer(ArrayList arrayList) {
        accesshandleMotionFrameOfReferencePlacement accesshandlemotionframeofreferenceplacement = new accesshandleMotionFrameOfReferencePlacement();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                Gson$$ExternalSyntheticBUOutline0.m(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            accesshandlemotionframeofreferenceplacement.IconCompatParcelizer.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = handleMotionFrameOfReferencePlacement.RemoteActionCompatParcelizer;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = handleMotionFrameOfReferencePlacement.serializer;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = handleMotionFrameOfReferencePlacement.IconCompatParcelizer;
            }
            place70tqf50default place70tqf50defaultVar = new place70tqf50default();
            place70tqf50defaultVar.write = 0;
            place70tqf50defaultVar.IconCompatParcelizer = 1;
            place70tqf50defaultVar.serializer = startDelay;
            place70tqf50defaultVar.read = duration;
            place70tqf50defaultVar.RemoteActionCompatParcelizer = interpolator;
            place70tqf50defaultVar.write = objectAnimator.getRepeatCount();
            place70tqf50defaultVar.IconCompatParcelizer = objectAnimator.getRepeatMode();
            accesshandlemotionframeofreferenceplacement.RemoteActionCompatParcelizer.put(propertyName, place70tqf50defaultVar);
        }
        return accesshandlemotionframeofreferenceplacement;
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof accesshandleMotionFrameOfReferencePlacement) {
            return this.RemoteActionCompatParcelizer.equals(((accesshandleMotionFrameOfReferencePlacement) obj).RemoteActionCompatParcelizer);
        }
        return false;
    }

    public final String toString() {
        return "\n" + accesshandleMotionFrameOfReferencePlacement.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.RemoteActionCompatParcelizer + "}\n";
    }
}
