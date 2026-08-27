package com.adjust.sdk;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ActivityHandler$$ExternalSyntheticLambda16 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityHandler f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ ActivityHandler$$ExternalSyntheticLambda16(ActivityHandler activityHandler, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = activityHandler;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        String str = this.f$1;
        ActivityHandler activityHandler = this.f$0;
        if (i == 0) {
            activityHandler.lambda$setExternalDeviceIdInDelay$51(str);
        } else if (i != 1) {
            activityHandler.lambda$removeGlobalCallbackParameter$25(str);
        } else {
            activityHandler.lambda$removeGlobalPartnerParameter$27(str);
        }
    }
}
