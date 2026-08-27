package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ActivityHandler$$ExternalSyntheticLambda11 implements IRunActivityHandler {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ActivityHandler$$ExternalSyntheticLambda11(int i) {
        this.$r8$classId = i;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        if (this.$r8$classId != 0) {
            activityHandler.removeGlobalPartnerParametersI();
        } else {
            activityHandler.removeGlobalCallbackParametersI();
        }
    }
}
