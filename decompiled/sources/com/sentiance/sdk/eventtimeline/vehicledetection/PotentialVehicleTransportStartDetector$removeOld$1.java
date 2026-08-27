package com.sentiance.sdk.eventtimeline.vehicledetection;

import android.location.Location;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes4.dex */
public final class PotentialVehicleTransportStartDetector$removeOld$1 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    final /* synthetic */ long $maxAge;
    final /* synthetic */ long $now;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PotentialVehicleTransportStartDetector$removeOld$1(long j, long j2) {
        super(1);
        this.$now = j;
        this.$maxAge = j2;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) {
        Location location = (Location) obj;
        location.getClass();
        return Boolean.valueOf(location.getTime() < this.$now - this.$maxAge);
    }
}
