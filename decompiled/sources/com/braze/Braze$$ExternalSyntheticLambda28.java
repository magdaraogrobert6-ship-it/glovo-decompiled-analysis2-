package com.braze;

import com.braze.models.IBrazeLocation;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda28 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Braze f$0;
    public final /* synthetic */ IBrazeLocation f$1;

    public /* synthetic */ Braze$$ExternalSyntheticLambda28(Braze braze, IBrazeLocation iBrazeLocation) {
        this.f$0 = braze;
        this.f$1 = iBrazeLocation;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Braze braze = this.f$0;
        IBrazeLocation iBrazeLocation = this.f$1;
        return i != 0 ? Braze.requestGeofenceRefresh$lambda$1(iBrazeLocation, braze) : Braze.logLocationRecordedEventFromLocationUpdate$lambda$1(braze, iBrazeLocation);
    }

    public /* synthetic */ Braze$$ExternalSyntheticLambda28(IBrazeLocation iBrazeLocation, Braze braze) {
        this.f$1 = iBrazeLocation;
        this.f$0 = braze;
    }
}
