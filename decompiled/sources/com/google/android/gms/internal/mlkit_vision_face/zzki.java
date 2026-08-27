package com.google.android.gms.internal.mlkit_vision_face;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.navigation.base.internal.extensions.WaypointExKt$WhenMappings;
import com.mapbox.navigation.base.internal.route.Waypoint;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzki {
    public static final boolean isLegWaypoint(Waypoint waypoint) {
        waypoint.getClass();
        int i = WaypointExKt$WhenMappings.$EnumSwitchMapping$0[waypoint.internalType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3 && i != 4) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                return false;
            }
        }
        return true;
    }
}
