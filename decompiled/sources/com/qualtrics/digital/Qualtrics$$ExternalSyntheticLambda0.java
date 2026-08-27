package com.qualtrics.digital;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Qualtrics$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Qualtrics f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Qualtrics$$ExternalSyntheticLambda0(Qualtrics qualtrics, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = qualtrics;
        this.f$1 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Qualtrics qualtrics = this.f$0;
        if (i == 0) {
            qualtrics.lambda$initialize$0((IQualtricsInitializationCallback) obj);
        } else if (i != 1) {
            qualtrics.lambda$initializeProject$3((Qualtrics$$ExternalSyntheticLambda4) obj);
        } else {
            qualtrics.lambda$evaluateProject$4((IQualtricsProjectEvaluationCallback) obj);
        }
    }
}
