package com.adjust.sdk;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ActivityHandler$$ExternalSyntheticLambda13 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityHandler f$0;
    public final /* synthetic */ AdjustAdRevenue f$1;

    public /* synthetic */ ActivityHandler$$ExternalSyntheticLambda13(ActivityHandler activityHandler, AdjustAdRevenue adjustAdRevenue, int i) {
        this.$r8$classId = i;
        this.f$0 = activityHandler;
        this.f$1 = adjustAdRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AdjustAdRevenue adjustAdRevenue = this.f$1;
        ActivityHandler activityHandler = this.f$0;
        if (i != 0) {
            activityHandler.lambda$trackAdRevenue$40(adjustAdRevenue);
        } else {
            activityHandler.lambda$trackAdRevenue$41(adjustAdRevenue);
        }
    }
}
