package com.adjust.sdk;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ActivityHandler$$ExternalSyntheticLambda17 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityHandler f$0;
    public final /* synthetic */ AdjustPlayStoreSubscription f$1;

    public /* synthetic */ ActivityHandler$$ExternalSyntheticLambda17(ActivityHandler activityHandler, AdjustPlayStoreSubscription adjustPlayStoreSubscription, int i) {
        this.$r8$classId = i;
        this.f$0 = activityHandler;
        this.f$1 = adjustPlayStoreSubscription;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AdjustPlayStoreSubscription adjustPlayStoreSubscription = this.f$1;
        ActivityHandler activityHandler = this.f$0;
        if (i != 0) {
            activityHandler.lambda$trackPlayStoreSubscription$43(adjustPlayStoreSubscription);
        } else {
            activityHandler.lambda$trackPlayStoreSubscription$42(adjustPlayStoreSubscription);
        }
    }
}
