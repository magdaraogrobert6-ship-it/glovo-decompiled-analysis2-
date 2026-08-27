package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ActivityHandler$$ExternalSyntheticLambda7 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityHandler f$0;
    public final /* synthetic */ AdjustDeeplink f$1;
    public final /* synthetic */ long f$2;

    public /* synthetic */ ActivityHandler$$ExternalSyntheticLambda7(ActivityHandler activityHandler, AdjustDeeplink adjustDeeplink, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = activityHandler;
        this.f$1 = adjustDeeplink;
        this.f$2 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        long j = this.f$2;
        AdjustDeeplink adjustDeeplink = this.f$1;
        ActivityHandler activityHandler = this.f$0;
        if (i == 0) {
            activityHandler.lambda$processAndResolveDeeplink$15(adjustDeeplink, j);
            return;
        }
        if (i == 1) {
            activityHandler.lambda$processDeeplink$13(adjustDeeplink, j);
        } else if (i != 2) {
            activityHandler.lambda$processAndResolveDeeplink$14(adjustDeeplink, j);
        } else {
            activityHandler.lambda$processDeeplink$12(adjustDeeplink, j);
        }
    }
}
