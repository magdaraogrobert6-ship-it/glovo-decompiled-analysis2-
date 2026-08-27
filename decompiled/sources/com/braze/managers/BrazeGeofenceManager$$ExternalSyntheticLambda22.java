package com.braze.managers;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeGeofenceManager$$ExternalSyntheticLambda22 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BrazeGeofenceManager f$0;

    public /* synthetic */ BrazeGeofenceManager$$ExternalSyntheticLambda22(BrazeGeofenceManager brazeGeofenceManager, int i) {
        this.$r8$classId = i;
        this.f$0 = brazeGeofenceManager;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        BrazeGeofenceManager brazeGeofenceManager = this.f$0;
        if (i == 0) {
            return BrazeGeofenceManager.registerGeofences$lambda$2$1(brazeGeofenceManager);
        }
        if (i != 1) {
            return i != 2 ? BrazeGeofenceManager.configureFromServerConfig$lambda$3(brazeGeofenceManager) : BrazeGeofenceManager.configureFromServerConfig$lambda$1(brazeGeofenceManager);
        }
        return BrazeGeofenceManager.registerGeofences$lambda$2$3(brazeGeofenceManager);
    }
}
