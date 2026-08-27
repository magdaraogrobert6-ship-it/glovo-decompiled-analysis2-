package com.qualtrics.digital;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewManager;
import java.util.Map;
import o.PinnableContainer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Qualtrics$$ExternalSyntheticLambda4 implements IQualtricsProjectEvaluationCallback, IMakeDCFRequestCallback, IQualtricsProjectInitializationCallback, PinnableContainer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Qualtrics$$ExternalSyntheticLambda4(Object obj, int i, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // o.PinnableContainer
    public void onComplete(Task task) {
        ((QualtricsPopOverActivity) this.f$0).lambda$onCreativeButtonPressed$0((ReviewManager) this.f$1, task);
    }

    @Override // com.qualtrics.digital.IQualtricsProjectEvaluationCallback, com.qualtrics.digital.IMakeDCFRequestCallback
    public void run(Map map) {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        if (i == 0) {
            ((Qualtrics) obj2).lambda$initializeProject$2((IQualtricsProjectInitializationCallback) obj, map);
        } else if (i != 1) {
            ((InterceptManager) obj2).lambda$evaluateIntercept$4((LatencyReporter) obj, map);
        } else {
            ((InterceptManager) obj2).lambda$evaluateIntercept$3((String) obj, map);
        }
    }
}
