package com.braze;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda54 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Braze f$0;

    public /* synthetic */ Braze$$ExternalSyntheticLambda54(Braze braze, int i) {
        this.$r8$classId = i;
        this.f$0 = braze;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Braze braze = this.f$0;
        switch (i) {
            case 0:
                return Braze.subscribeToContentCardsUpdates$lambda$3(braze);
            case 1:
                return Braze.safeCallFlushDelayedInitPushAnalyticsQueue$lambda$1(braze);
            case 2:
                return Braze.subscribeToBannersUpdates$lambda$3(braze);
            case 3:
                return Braze.requestContentCardsRefresh$lambda$1(braze);
            case 4:
                return Braze.requestContentCardsRefreshFromCache$lambda$1(braze);
            case 5:
                return Braze.handleInternalBannerRefresh$lambda$1(braze);
            case 6:
                return Braze.requestImmediateDataFlush$lambda$1(braze);
            case 7:
                return Braze.deleteRegisteredGeofenceCache$lambda$1(braze);
            case 8:
                return Braze.requestSingleLocationUpdate$lambda$1(braze);
            case 9:
                return Braze.performPushDeliveryFlush$lambda$1(braze);
            case 10:
                return Braze.refreshFeatureFlags$lambda$1(braze);
            case 11:
                return Braze.subscribeToFeatureFlagsUpdates$lambda$3(braze);
            default:
                return Braze.requestGeofencesInitialization$lambda$1(braze);
        }
    }
}
