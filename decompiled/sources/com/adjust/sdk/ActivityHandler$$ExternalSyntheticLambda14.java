package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ActivityHandler$$ExternalSyntheticLambda14 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityHandler f$0;
    public final /* synthetic */ AdjustEvent f$1;

    public /* synthetic */ ActivityHandler$$ExternalSyntheticLambda14(ActivityHandler activityHandler, AdjustEvent adjustEvent, int i) {
        this.$r8$classId = i;
        this.f$0 = activityHandler;
        this.f$1 = adjustEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AdjustEvent adjustEvent = this.f$1;
        ActivityHandler activityHandler = this.f$0;
        if (i != 0) {
            activityHandler.lambda$trackEvent$4(adjustEvent);
        } else {
            activityHandler.lambda$trackEvent$3(adjustEvent);
        }
    }
}
