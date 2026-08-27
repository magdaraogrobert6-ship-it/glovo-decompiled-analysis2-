package com.mapbox.navigation.core.trip.session;

import com.mapbox.common.location.Location;
import com.mapbox.navigation.core.replay.MapboxReplayer;
import com.mapbox.navigation.core.replay.ReplayLocationProvider;
import kotlin.jvm.internal.Lambda;
import o.createFromParcel;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class TripSessionLocationEngine$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public static final TripSessionLocationEngine$1 INSTANCE;
    public static final TripSessionLocationEngine$1 INSTANCE$1;
    public static final TripSessionLocationEngine$1 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TripSessionLocationEngine$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        if (i == 0) {
            MapboxReplayer mapboxReplayer = (MapboxReplayer) obj;
            mapboxReplayer.getClass();
            return new ReplayLocationProvider(mapboxReplayer);
        }
        if (i != 1) {
            ((Location) obj).getClass();
            return createfromparcel;
        }
        ((Location) obj).getClass();
        return createfromparcel;
    }

    static {
        int i = 1;
        INSTANCE = new TripSessionLocationEngine$1(i, 0);
        INSTANCE$1 = new TripSessionLocationEngine$1(i, i);
        INSTANCE$2 = new TripSessionLocationEngine$1(i, 2);
    }
}
