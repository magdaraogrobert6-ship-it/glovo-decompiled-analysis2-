package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ActivityHandler$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityHandler f$0;

    public /* synthetic */ ActivityHandler$$ExternalSyntheticLambda0(ActivityHandler activityHandler, int i) {
        this.$r8$classId = i;
        this.f$0 = activityHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        ActivityHandler activityHandler = this.f$0;
        switch (i) {
            case 0:
                activityHandler.lambda$sendPreinstallReferrer$19();
                break;
            case 1:
                activityHandler.lambda$removeGlobalPartnerParameters$31();
                break;
            case 2:
                activityHandler.lambda$endFirstSessionDelay$48();
                break;
            case 3:
                activityHandler.lambda$sendPreinstallReferrer$18();
                break;
            case 4:
                activityHandler.lambda$sendReftagReferrer$17();
                break;
            case 5:
                activityHandler.lambda$removeGlobalCallbackParameters$29();
                break;
            case 6:
                activityHandler.lambda$gdprForgetMe$34();
                break;
            case 7:
                activityHandler.lambda$gdprForgetMe$35();
                break;
            default:
                activityHandler.lambda$sendReftagReferrer$16();
                break;
        }
    }
}
