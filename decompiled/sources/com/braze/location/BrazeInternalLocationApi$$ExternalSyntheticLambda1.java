package com.braze.location;

import android.location.Location;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeInternalLocationApi$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Location f$0;

    public /* synthetic */ BrazeInternalLocationApi$$ExternalSyntheticLambda1(Location location, int i) {
        this.$r8$classId = i;
        this.f$0 = location;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Location location = this.f$0;
        if (i != 0) {
            return i != 1 ? BrazeInternalLocationApi.requestSingleLocationUpdate$lambda$4$0(location) : BrazeInternalLocationApi.getLastKnownGpsLocationIfValid$lambda$1(location);
        }
        return BrazeInternalLocationApi.requestSingleLocationUpdate$lambda$1(location);
    }
}
