package com.adjust.sdk;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class AdjustInstance$$ExternalSyntheticLambda0 implements IRunActivityHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AdjustThirdPartySharing f$0;

    public /* synthetic */ AdjustInstance$$ExternalSyntheticLambda0(AdjustThirdPartySharing adjustThirdPartySharing, int i) {
        this.$r8$classId = i;
        this.f$0 = adjustThirdPartySharing;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        int i = this.$r8$classId;
        AdjustThirdPartySharing adjustThirdPartySharing = this.f$0;
        if (i != 0) {
            activityHandler.tryTrackThirdPartySharingI(adjustThirdPartySharing);
        } else {
            activityHandler.tryTrackThirdPartySharingI(adjustThirdPartySharing);
        }
    }
}
