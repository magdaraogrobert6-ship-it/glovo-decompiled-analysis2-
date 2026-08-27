package com.adjust.sdk;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ActivityHandler$$ExternalSyntheticLambda6 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityHandler f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;

    public /* synthetic */ ActivityHandler$$ExternalSyntheticLambda6(ActivityHandler activityHandler, String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = activityHandler;
        this.f$1 = str;
        this.f$2 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        String str = this.f$2;
        String str2 = this.f$1;
        ActivityHandler activityHandler = this.f$0;
        if (i != 0) {
            activityHandler.lambda$addGlobalPartnerParameter$23(str2, str);
        } else {
            activityHandler.lambda$addGlobalCallbackParameter$21(str2, str);
        }
    }
}
