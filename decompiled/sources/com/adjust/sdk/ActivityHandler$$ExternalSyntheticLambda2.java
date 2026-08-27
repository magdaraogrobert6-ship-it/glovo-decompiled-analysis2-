package com.adjust.sdk;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ActivityHandler$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityHandler f$0;
    public final /* synthetic */ boolean f$1;

    public /* synthetic */ ActivityHandler$$ExternalSyntheticLambda2(ActivityHandler activityHandler, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = activityHandler;
        this.f$1 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        boolean z = this.f$1;
        ActivityHandler activityHandler = this.f$0;
        switch (i) {
            case 0:
                activityHandler.lambda$setEnabled$6(z);
                break;
            case 1:
                activityHandler.lambda$onActivityLifecycle$0(z);
                break;
            case 2:
                activityHandler.lambda$trackMeasurementConsent$39(z);
                break;
            case 3:
                activityHandler.lambda$setCoppaComplianceInDelay$49(z);
                break;
            case 4:
                activityHandler.lambda$setOfflineMode$7(z);
                break;
            case 5:
                activityHandler.lambda$setOfflineMode$8(z);
                break;
            case 6:
                activityHandler.lambda$setPlayStoreKidsComplianceInDelay$50(z);
                break;
            case 7:
                activityHandler.lambda$setEnabled$5(z);
                break;
            default:
                activityHandler.lambda$onActivityLifecycle$1(z);
                break;
        }
    }
}
