package com.mapbox.maps.plugin.locationcomponent;

import android.animation.ValueAnimator;
import com.mapbox.geojson.Point;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class LocationPuckManager$onBearingUpdated$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocationPuckManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocationPuckManager$onBearingUpdated$1(LocationPuckManager locationPuckManager, int i) {
        super(1);
        this.$r8$classId = i;
        this.this$0 = locationPuckManager;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        LocationPuckManager locationPuckManager = this.this$0;
        if (i == 0) {
            locationPuckManager.lastBearing = ((Number) obj).doubleValue();
            return createfromparcel;
        }
        if (i == 1) {
            locationPuckManager.lastAccuracyRadius = ((Number) obj).doubleValue();
            return createfromparcel;
        }
        if (i == 2) {
            Point point = (Point) obj;
            point.getClass();
            locationPuckManager.lastLocation = point;
            return createfromparcel;
        }
        ValueAnimator valueAnimator = (ValueAnimator) obj;
        valueAnimator.getClass();
        valueAnimator.setDuration(0L);
        valueAnimator.addListener(locationPuckManager.disablePuckAnimationOnEnd);
        return createfromparcel;
    }
}
