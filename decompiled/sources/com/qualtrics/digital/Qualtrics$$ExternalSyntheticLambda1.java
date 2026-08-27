package com.qualtrics.digital;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Qualtrics$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Qualtrics$$ExternalSyntheticLambda1(int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        if (i != 0) {
            ((InterceptManager) obj).lambda$handleContactFrequencyResponse$0();
        } else {
            ((Qualtrics) obj).lambda$initialize$1();
        }
    }
}
