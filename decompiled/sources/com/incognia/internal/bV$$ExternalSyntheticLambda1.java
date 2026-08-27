package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bV$$ExternalSyntheticLambda1 implements y9X {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ bV f$0;

    public /* synthetic */ bV$$ExternalSyntheticLambda1(bV bVVar, int i) {
        this.$r8$classId = i;
        this.f$0 = bVVar;
    }

    @Override // com.incognia.internal.y9X
    public final void run() {
        int i = this.$r8$classId;
        bV bVVar = this.f$0;
        if (i == 0) {
            bV.HQ(bVVar);
        } else if (i != 1) {
            bV.BGx(bVVar);
        } else {
            bV.mbG(bVVar);
        }
    }
}
