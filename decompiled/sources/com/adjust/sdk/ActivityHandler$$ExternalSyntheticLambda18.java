package com.adjust.sdk;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ActivityHandler$$ExternalSyntheticLambda18 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityHandler f$0;
    public final /* synthetic */ OnIsEnabledListener f$1;

    public /* synthetic */ ActivityHandler$$ExternalSyntheticLambda18(ActivityHandler activityHandler, OnIsEnabledListener onIsEnabledListener, int i) {
        this.$r8$classId = i;
        this.f$0 = activityHandler;
        this.f$1 = onIsEnabledListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        OnIsEnabledListener onIsEnabledListener = this.f$1;
        ActivityHandler activityHandler = this.f$0;
        if (i == 0) {
            activityHandler.lambda$isEnabled$9(onIsEnabledListener);
        } else if (i != 1) {
            activityHandler.lambda$isEnabled$10(onIsEnabledListener);
        } else {
            activityHandler.lambda$isEnabled$11(onIsEnabledListener);
        }
    }
}
