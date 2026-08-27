package com.braze.push;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class BrazeNotificationUtils$$ExternalSyntheticLambda14 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Integer f$0;

    public /* synthetic */ BrazeNotificationUtils$$ExternalSyntheticLambda14(Integer num, int i) {
        this.$r8$classId = i;
        this.f$0 = num;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Integer num = this.f$0;
        if (i != 0) {
            return i != 1 ? BrazeNotificationUtils.setVisibilityIfPresentAndSupported$lambda$1(num) : BrazeNotificationUtils.getNotificationPriority$lambda$0$0(num);
        }
        return BrazeNotificationUtils.getNotificationId$lambda$0(num);
    }
}
