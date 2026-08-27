package com.adjust.sdk;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ActivityHandler$$ExternalSyntheticLambda26 implements IRunActivityHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ ActivityHandler$$ExternalSyntheticLambda26(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        if (this.$r8$classId != 0) {
            activityHandler.addGlobalCallbackParameterI(this.f$0, this.f$1);
        } else {
            activityHandler.addGlobalPartnerParameterI(this.f$0, this.f$1);
        }
    }
}
