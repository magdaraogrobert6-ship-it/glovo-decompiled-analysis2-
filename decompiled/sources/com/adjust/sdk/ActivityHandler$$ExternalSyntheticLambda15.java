package com.adjust.sdk;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ActivityHandler$$ExternalSyntheticLambda15 implements IRunActivityHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ ActivityHandler$$ExternalSyntheticLambda15(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        int i = this.$r8$classId;
        String str = this.f$0;
        if (i != 0) {
            activityHandler.removeGlobalCallbackParameterI(str);
        } else {
            activityHandler.removeGlobalPartnerParameterI(str);
        }
    }
}
