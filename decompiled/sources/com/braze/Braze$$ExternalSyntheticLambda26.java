package com.braze;

import com.braze.events.IEventSubscriber;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda26 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Braze f$0;
    public final /* synthetic */ IEventSubscriber f$1;

    public /* synthetic */ Braze$$ExternalSyntheticLambda26(Braze braze, IEventSubscriber iEventSubscriber, int i) {
        this.$r8$classId = i;
        this.f$0 = braze;
        this.f$1 = iEventSubscriber;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        IEventSubscriber iEventSubscriber = this.f$1;
        Braze braze = this.f$0;
        switch (i) {
            case 0:
                return Braze.subscribeToNetworkFailures$lambda$1(braze, iEventSubscriber);
            case 1:
                return Braze.subscribeToSessionUpdates$lambda$1(braze, iEventSubscriber);
            case 2:
                return Braze.subscribeToBannersUpdates$lambda$1(braze, iEventSubscriber);
            case 3:
                return Braze.subscribeToPushNotificationEvents$lambda$1(braze, iEventSubscriber);
            case 4:
                return Braze.subscribeToFeatureFlagsUpdates$lambda$1(braze, iEventSubscriber);
            case 5:
                return Braze.subscribeToBannersErrors$lambda$1(braze, iEventSubscriber);
            case 6:
                return Braze.subscribeToSdkAuthenticationFailures$lambda$1(braze, iEventSubscriber);
            case 7:
                return Braze.subscribeToContentCardsUpdates$lambda$1(braze, iEventSubscriber);
            default:
                return Braze.subscribeToNoMatchingTriggerForEvent$lambda$1(braze, iEventSubscriber);
        }
    }
}
