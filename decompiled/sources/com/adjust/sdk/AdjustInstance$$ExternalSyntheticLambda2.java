package com.adjust.sdk;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class AdjustInstance$$ExternalSyntheticLambda2 implements IRunActivityHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;

    public /* synthetic */ AdjustInstance$$ExternalSyntheticLambda2(boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
    }

    @Override // com.adjust.sdk.IRunActivityHandler
    public final void run(ActivityHandler activityHandler) {
        int i = this.$r8$classId;
        boolean z = this.f$0;
        if (i != 0) {
            activityHandler.tryTrackMeasurementConsentI(z);
        } else {
            activityHandler.tryTrackMeasurementConsentI(z);
        }
    }
}
