package com.mapbox.maps.plugin.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraAnimationHint;
import com.mapbox.maps.CameraAnimationHintStage;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.plugin.MapPlugin;
import com.mapbox.maps.plugin.animation.animator.CameraAnchorAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraBearingAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraCenterAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraPaddingAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraPitchAnimator;
import com.mapbox.maps.plugin.animation.animator.CameraZoomAnimator;
import com.mapbox.maps.plugin.delegates.MapPluginProviderDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.RangesKt;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CameraAnimationsUtils {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.mapbox.geojson.Point, com.mapbox.maps.EdgeInsets, com.mapbox.maps.ScreenCoordinate, java.lang.Double] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public static final CameraAnimationHint calculateCameraAnimationHint(AnimatorSet animatorSet, List list, CameraState cameraState) {
        long totalDuration;
        long j;
        list.getClass();
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        childAnimations.getClass();
        ArrayList<CameraAnimator> arrayList = new ArrayList();
        for (Object obj : childAnimations) {
            if (obj instanceof CameraAnimator) {
                arrayList.add(obj);
            }
        }
        ?? r4 = 0;
        if (arrayList.size() != animatorSet.getChildAnimations().size()) {
            MapboxLogger.logW("Mbgl-CameraManager", "Incompatible animators: all should be instances of CameraAnimator");
            return null;
        }
        long j2 = 0;
        if (animatorSet.getStartDelay() != 0) {
            MapboxLogger.logW("Mbgl-CameraManager", "AnimatorSets with non-zero startDelay are not supported.");
            return null;
        }
        if (animatorSet.getChildAnimations().isEmpty()) {
            MapboxLogger.logW("Mbgl-CameraManager", "AnimatorSet has no child animations.");
            return null;
        }
        if (animatorSet.getDuration() >= 0) {
            totalDuration = animatorSet.getDuration();
        } else {
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                ScreenStartObserver$$ExternalSyntheticLambda0.read();
                return null;
            }
            totalDuration = ((CameraAnimator) it.next()).getTotalDuration();
            while (it.hasNext()) {
                long totalDuration2 = ((CameraAnimator) it.next()).getTotalDuration();
                if (totalDuration < totalDuration2) {
                    totalDuration = totalDuration2;
                }
            }
        }
        if (arrayList.isEmpty() || totalDuration == 0) {
            return null;
        }
        if (totalDuration != -1) {
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((CameraAnimator) it2.next()).getDuration() == -1) {
                    }
                }
            }
            CameraOptions.Builder builder = new CameraOptions.Builder();
            List list2 = list;
            int i = 10;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                float fFloatValue = ((Number) it3.next()).floatValue();
                builder.center(r4);
                builder.padding(r4);
                builder.anchor(r4);
                builder.zoom(r4);
                builder.bearing(r4);
                builder.pitch(r4);
                ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, i));
                for (CameraAnimator cameraAnimator : arrayList) {
                    Iterator it4 = it3;
                    try {
                        long duration = cameraAnimator.getDuration();
                        float fWrite = 1.0f;
                        if (duration <= j2) {
                            j = totalDuration;
                        } else {
                            j = totalDuration;
                            try {
                                fWrite = RangesKt.write(((totalDuration * fFloatValue) - cameraAnimator.getStartDelay()) / duration, 0.0f, 1.0f);
                            } catch (UnsupportedOperationException e) {
                                e = e;
                                MapboxLogger.logW("Mbgl-CameraManager", "Unable to calculate animated value ahead of time for " + cameraAnimator.getType().name() + ": " + e.getMessage());
                                arrayList3.add(createFromParcel.INSTANCE);
                                it3 = it4;
                                totalDuration = j;
                                j2 = 0;
                            }
                        }
                        try {
                            updateCameraValue(cameraAnimator, cameraAnimator.getAnimatedValueAt$plugin_animation_release(fWrite, cameraState), builder);
                        } catch (UnsupportedOperationException e2) {
                            e = e2;
                            MapboxLogger.logW("Mbgl-CameraManager", "Unable to calculate animated value ahead of time for " + cameraAnimator.getType().name() + ": " + e.getMessage());
                        }
                    } catch (UnsupportedOperationException e3) {
                        e = e3;
                        j = totalDuration;
                    }
                    arrayList3.add(createFromParcel.INSTANCE);
                    it3 = it4;
                    totalDuration = j;
                    j2 = 0;
                }
                arrayList2.add(new CameraAnimationHintStage.Builder().camera(builder.build()).progress((long) (totalDuration * fFloatValue)).build());
                it3 = it3;
                r4 = 0;
                j2 = 0;
                i = 10;
            }
            return new CameraAnimationHint.Builder().stages(arrayList2).build();
        }
        MapboxLogger.logW("Mbgl-CameraManager", "Animators with infinite duration are not supported. Please use finite duration for all animators.");
        return null;
    }

    public static final void updateCameraValue(CameraAnimator cameraAnimator, Object obj, CameraOptions.Builder builder) {
        cameraAnimator.getClass();
        builder.getClass();
        if (cameraAnimator instanceof CameraCenterAnimator) {
            builder.center(obj instanceof Point ? (Point) obj : null);
            return;
        }
        if (cameraAnimator instanceof CameraZoomAnimator) {
            builder.zoom(obj instanceof Double ? (Double) obj : null);
            return;
        }
        if (cameraAnimator instanceof CameraAnchorAnimator) {
            builder.anchor(obj instanceof ScreenCoordinate ? (ScreenCoordinate) obj : null);
            return;
        }
        if (cameraAnimator instanceof CameraPaddingAnimator) {
            builder.padding(obj instanceof EdgeInsets ? (EdgeInsets) obj : null);
        } else if (cameraAnimator instanceof CameraBearingAnimator) {
            builder.bearing(obj instanceof Double ? (Double) obj : null);
        } else if (cameraAnimator instanceof CameraPitchAnimator) {
            builder.pitch(obj instanceof Double ? (Double) obj : null);
        }
    }

    public static final CameraAnimationsPlugin getCamera(MapPluginProviderDelegate mapPluginProviderDelegate) {
        mapPluginProviderDelegate.getClass();
        MapPlugin plugin = mapPluginProviderDelegate.getPlugin("MAPBOX_CAMERA_PLUGIN_ID");
        plugin.getClass();
        return (CameraAnimationsPlugin) plugin;
    }
}
