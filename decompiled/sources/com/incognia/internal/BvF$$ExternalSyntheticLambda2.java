package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class BvF$$ExternalSyntheticLambda2 implements y9X {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BvF f$0;
    public final /* synthetic */ THn f$1;

    public /* synthetic */ BvF$$ExternalSyntheticLambda2(BvF bvF, EGf eGf, int i) {
        this.$r8$classId = i;
        this.f$0 = bvF;
        this.f$1 = eGf;
    }

    @Override // com.incognia.internal.y9X
    public final void run() {
        int i = this.$r8$classId;
        THn tHn = this.f$1;
        BvF bvF = this.f$0;
        if (i != 0) {
            BvF.mbG(bvF, tHn);
        } else {
            BvF.BGx(bvF, tHn);
        }
    }
}
