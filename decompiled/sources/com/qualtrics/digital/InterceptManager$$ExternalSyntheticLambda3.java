package com.qualtrics.digital;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class InterceptManager$$ExternalSyntheticLambda3 implements IQualtricsProjectEvaluationCallback, IMakeDCFRequestCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InterceptManager f$0;

    public /* synthetic */ InterceptManager$$ExternalSyntheticLambda3(InterceptManager interceptManager, int i) {
        this.$r8$classId = i;
        this.f$0 = interceptManager;
    }

    @Override // com.qualtrics.digital.IQualtricsProjectEvaluationCallback, com.qualtrics.digital.IMakeDCFRequestCallback
    public final void run(Map map) {
        int i = this.$r8$classId;
        InterceptManager interceptManager = this.f$0;
        if (i != 0) {
            interceptManager.lambda$evaluateProject$2(map);
        } else {
            interceptManager.lambda$evaluateProject$1(map);
        }
    }
}
