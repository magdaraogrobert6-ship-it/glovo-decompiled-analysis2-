package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yDo$$ExternalSyntheticLambda2 implements y9X {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ yDo f$0;

    public /* synthetic */ yDo$$ExternalSyntheticLambda2(yDo ydo, int i) {
        this.$r8$classId = i;
        this.f$0 = ydo;
    }

    @Override // com.incognia.internal.y9X
    public final void run() {
        int i = this.$r8$classId;
        yDo ydo = this.f$0;
        if (i == 0) {
            yDo.BGx(ydo);
        } else if (i != 1) {
            yDo.mbG(ydo);
        } else {
            yDo.HQ(ydo);
        }
    }
}
