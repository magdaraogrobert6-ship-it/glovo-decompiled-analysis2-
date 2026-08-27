package com.braze;

import com.braze.events.IEventSubscriber;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Braze$$ExternalSyntheticLambda102 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ IEventSubscriber f$0;
    public final /* synthetic */ Braze f$1;
    public final /* synthetic */ Class f$2;

    public /* synthetic */ Braze$$ExternalSyntheticLambda102(Braze braze, Class cls, IEventSubscriber iEventSubscriber) {
        this.f$1 = braze;
        this.f$2 = cls;
        this.f$0 = iEventSubscriber;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        IEventSubscriber iEventSubscriber = this.f$0;
        Class cls = this.f$2;
        Braze braze = this.f$1;
        return i != 0 ? Braze.addSingleSynchronousSubscription$lambda$1(braze, cls, iEventSubscriber) : Braze.removeSingleSubscription$lambda$1(iEventSubscriber, braze, cls);
    }

    public /* synthetic */ Braze$$ExternalSyntheticLambda102(IEventSubscriber iEventSubscriber, Braze braze, Class cls) {
        this.f$0 = iEventSubscriber;
        this.f$1 = braze;
        this.f$2 = cls;
    }
}
