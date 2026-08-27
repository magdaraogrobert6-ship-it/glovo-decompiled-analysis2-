package com.mapbox.navigation.ui.maps.camera.utils;

import android.animation.Animator;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MapboxNavigationCameraUtilsKt {
    public static final AnimatorSet createAnimatorSet(ArrayList arrayList) {
        AnimatorSet animatorSet = new AnimatorSet();
        Object[] array = arrayList.toArray(new Animator[0]);
        array.getClass();
        Animator[] animatorArr = (Animator[]) array;
        animatorSet.playTogether((Animator[]) Arrays.copyOf(animatorArr, animatorArr.length));
        return animatorSet;
    }
}
