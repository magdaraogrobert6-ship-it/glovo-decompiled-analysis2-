package com.mapbox.navigation.core.internal.lifecycle;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import java.util.HashSet;
import o.accessisRenderNodeCompatiblecp;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes2.dex */
public final class CarAppLifecycleOwner$startedReferenceCounter$1 implements DefaultLifecycleObserver {
    public final /* synthetic */ CarAppLifecycleOwner this$0;

    public CarAppLifecycleOwner$startedReferenceCounter$1(CarAppLifecycleOwner carAppLifecycleOwner) {
        this.this$0 = carAppLifecycleOwner;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        accessisrendernodecompatiblecp.getClass();
        CarAppLifecycleOwner carAppLifecycleOwner = this.this$0;
        HashSet hashSet = carAppLifecycleOwner.lifecycleCreated;
        if (hashSet.add(accessisrendernodecompatiblecp)) {
            int i = carAppLifecycleOwner.createdChangingConfiguration;
            if (i > 0) {
                carAppLifecycleOwner.createdChangingConfiguration = i - 1;
                return;
            }
            LoggerProviderKt.logI("LifecycleOwner (" + accessisrendernodecompatiblecp + ") onCreate", "CarAppLifecycleOwner");
            if (carAppLifecycleOwner.activitiesCreated.size() == 0 && hashSet.size() == 1) {
                CarAppLifecycleOwner.access$changeState(carAppLifecycleOwner, toColorLong8_81llA.STARTED);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        accessisrendernodecompatiblecp.getClass();
        CarAppLifecycleOwner carAppLifecycleOwner = this.this$0;
        HashSet hashSet = carAppLifecycleOwner.lifecycleCreated;
        if (hashSet.remove(accessisrendernodecompatiblecp)) {
            if (isChangingConfigurations(accessisrendernodecompatiblecp)) {
                carAppLifecycleOwner.createdChangingConfiguration++;
                return;
            }
            LoggerProviderKt.logI("LifecycleOwner (" + accessisrendernodecompatiblecp + ") onDestroy", "CarAppLifecycleOwner");
            if (carAppLifecycleOwner.activitiesCreated.size() == 0 && hashSet.size() == 0 && carAppLifecycleOwner.createdChangingConfiguration == 0) {
                CarAppLifecycleOwner.access$changeState(carAppLifecycleOwner, toColorLong8_81llA.CREATED);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        accessisrendernodecompatiblecp.getClass();
        CarAppLifecycleOwner carAppLifecycleOwner = this.this$0;
        HashSet hashSet = carAppLifecycleOwner.lifecycleForegrounded;
        if (hashSet.add(accessisrendernodecompatiblecp)) {
            int i = carAppLifecycleOwner.foregroundedChangingConfiguration;
            if (i > 0) {
                carAppLifecycleOwner.foregroundedChangingConfiguration = i - 1;
                return;
            }
            LoggerProviderKt.logI("LifecycleOwner (" + accessisrendernodecompatiblecp + ") onStart", "CarAppLifecycleOwner");
            if (carAppLifecycleOwner.activitiesForegrounded.size() == 0 && hashSet.size() == 1) {
                CarAppLifecycleOwner.access$changeState(carAppLifecycleOwner, toColorLong8_81llA.RESUMED);
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        accessisrendernodecompatiblecp.getClass();
        CarAppLifecycleOwner carAppLifecycleOwner = this.this$0;
        HashSet hashSet = carAppLifecycleOwner.lifecycleForegrounded;
        if (hashSet.remove(accessisrendernodecompatiblecp)) {
            if (isChangingConfigurations(accessisrendernodecompatiblecp)) {
                carAppLifecycleOwner.foregroundedChangingConfiguration++;
                return;
            }
            LoggerProviderKt.logI("LifecycleOwner (" + accessisrendernodecompatiblecp + ") onStop", "CarAppLifecycleOwner");
            if (carAppLifecycleOwner.activitiesForegrounded.size() == 0 && hashSet.size() == 0 && carAppLifecycleOwner.foregroundedChangingConfiguration == 0) {
                CarAppLifecycleOwner.access$changeState(carAppLifecycleOwner, toColorLong8_81llA.STARTED);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean isChangingConfigurations(accessisRenderNodeCompatiblecp accessisrendernodecompatiblecp) {
        FragmentActivity activity;
        return ((accessisrendernodecompatiblecp instanceof Activity) && ((Activity) accessisrendernodecompatiblecp).isChangingConfigurations()) || ((accessisrendernodecompatiblecp instanceof Fragment) && (activity = ((Fragment) accessisrendernodecompatiblecp).getActivity()) != null && activity.isChangingConfigurations());
    }
}
