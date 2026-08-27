package com.adjust.sdk;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ActivityHandler$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ActivityHandler f$0;
    public final /* synthetic */ AdjustPlayStorePurchase f$1;
    public final /* synthetic */ OnPurchaseVerificationFinishedListener f$2;

    public /* synthetic */ ActivityHandler$$ExternalSyntheticLambda4(ActivityHandler activityHandler, AdjustPlayStorePurchase adjustPlayStorePurchase, OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener, int i) {
        this.$r8$classId = i;
        this.f$0 = activityHandler;
        this.f$1 = adjustPlayStorePurchase;
        this.f$2 = onPurchaseVerificationFinishedListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        OnPurchaseVerificationFinishedListener onPurchaseVerificationFinishedListener = this.f$2;
        AdjustPlayStorePurchase adjustPlayStorePurchase = this.f$1;
        ActivityHandler activityHandler = this.f$0;
        if (i != 0) {
            activityHandler.lambda$verifyPlayStorePurchase$44(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
        } else {
            activityHandler.lambda$verifyPlayStorePurchase$45(adjustPlayStorePurchase, onPurchaseVerificationFinishedListener);
        }
    }
}
