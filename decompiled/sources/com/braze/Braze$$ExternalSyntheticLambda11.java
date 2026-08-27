package com.braze;

import com.braze.events.IEventSubscriber;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda11 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Braze f$0;
    public final /* synthetic */ IEventSubscriber f$1;

    public /* synthetic */ Braze$$ExternalSyntheticLambda11(Braze braze, IEventSubscriber iEventSubscriber, int i) {
        this.$r8$classId = i;
        this.f$0 = braze;
        this.f$1 = iEventSubscriber;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        IEventSubscriber iEventSubscriber = this.f$1;
        Braze braze = this.f$0;
        return i != 0 ? Braze.subscribeToChangeUserEvents$lambda$1(braze, iEventSubscriber) : Braze.subscribeToNewInAppMessages$lambda$1(braze, iEventSubscriber);
    }
}
