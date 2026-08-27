package com.adjust.sdk;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ActivityHandler$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityHandler f$0;
    public final /* synthetic */ AdjustEvent f$1;
    public final /* synthetic */ OnPurchaseVerificationFinishedListener f$2;

    public /* synthetic */ ActivityHandler$$ExternalSyntheticLambda3(ActivityHandler activityHandler, AdjustEvent adjustEvent, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i) {
        this.$r8$classId = i;
        this.f$0 = activityHandler;
        this.f$1 = adjustEvent;
        this.f$2 = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener = this.f$2;
        AdjustEvent adjustEvent = this.f$1;
        ActivityHandler activityHandler = this.f$0;
        if (i != 0) {
            activityHandler.lambda$verifyAndTrackPlayStorePurchase$47(adjustEvent, onPurchaseVerificationFinishedListener);
        } else {
            activityHandler.lambda$verifyAndTrackPlayStorePurchase$46(adjustEvent, onPurchaseVerificationFinishedListener);
        }
    }
}
