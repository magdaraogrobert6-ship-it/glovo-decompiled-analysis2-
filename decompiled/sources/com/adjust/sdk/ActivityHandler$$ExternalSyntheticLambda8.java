package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ActivityHandler$$ExternalSyntheticLambda8 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityHandler f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ ActivityHandler$$ExternalSyntheticLambda8(ActivityHandler activityHandler, boolean z, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = activityHandler;
        this.f$1 = z;
        this.f$2 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        String str = this.f$2;
        boolean z = this.f$1;
        ActivityHandler activityHandler = this.f$0;
        if (i != 0) {
            activityHandler.lambda$setPushToken$33(z, str);
        } else {
            activityHandler.lambda$setPushToken$32(z, str);
        }
    }
}
