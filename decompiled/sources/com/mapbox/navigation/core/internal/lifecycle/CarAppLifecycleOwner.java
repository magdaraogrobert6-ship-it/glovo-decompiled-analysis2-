package com.mapbox.navigation.core.internal.lifecycle;

import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import java.util.HashSet;
import o.accessisRenderNodeCompatiblecp;
import o.accessregisterComponentCallback;
import o.supportsColorMatrixQuery;
import o.toColorLong8_81llA;

/* JADX INFO: loaded from: classes2.dex */
public final class CarAppLifecycleOwner implements accessisRenderNodeCompatiblecp {
    public int createdChangingConfiguration;
    public int foregroundedChangingConfiguration;
    public final accessregisterComponentCallback lifecycleRegistry;
    public final CarAppLifecycleOwner$startedReferenceCounter$1 startedReferenceCounter;
    public final HashSet activitiesCreated = new HashSet();
    public final HashSet activitiesForegrounded = new HashSet();
    public final HashSet lifecycleCreated = new HashSet();
    public final HashSet lifecycleForegrounded = new HashSet();

    @Override // o.accessisRenderNodeCompatiblecp
    public final supportsColorMatrixQuery getLifecycle() {
        return this.lifecycleRegistry;
    }

    public static final void access$changeState(CarAppLifecycleOwner carAppLifecycleOwner, toColorLong8_81llA tocolorlong8_81lla) {
        accessregisterComponentCallback accessregistercomponentcallback = carAppLifecycleOwner.lifecycleRegistry;
        if (accessregistercomponentcallback.RatingCompat != tocolorlong8_81lla) {
            accessregistercomponentcallback.RemoteActionCompatParcelizer(tocolorlong8_81lla);
            LoggerProviderKt.logI("changeState " + accessregistercomponentcallback.RatingCompat, "CarAppLifecycleOwner");
        }
    }

    public CarAppLifecycleOwner() {
        accessregisterComponentCallback accessregistercomponentcallback = new accessregisterComponentCallback(this, true);
        accessregistercomponentcallback.RemoteActionCompatParcelizer(toColorLong8_81llA.INITIALIZED);
        this.lifecycleRegistry = accessregistercomponentcallback;
        this.startedReferenceCounter = new CarAppLifecycleOwner$startedReferenceCounter$1(this);
    }
}
