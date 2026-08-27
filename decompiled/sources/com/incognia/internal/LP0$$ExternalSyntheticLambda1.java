package com.incognia.internal;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class LP0$$ExternalSyntheticLambda1 implements y9X {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BvF f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ LP0$$ExternalSyntheticLambda1(BvF bvF, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = bvF;
        this.f$1 = str;
    }

    @Override // com.incognia.internal.y9X
    public final void run() {
        if (this.$r8$classId != 0) {
            LP0.mbG(this.f$0, this.f$1);
        } else {
            LP0.BGx(this.f$0, this.f$1);
        }
    }
}
