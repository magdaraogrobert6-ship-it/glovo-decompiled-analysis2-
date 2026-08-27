package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class UsU$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ y9X f$0;
    public final /* synthetic */ UsU f$1;

    public /* synthetic */ UsU$$ExternalSyntheticLambda0(y9X y9x, UsU usU, int i) {
        this.$r8$classId = i;
        this.f$0 = y9x;
        this.f$1 = usU;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        UsU usU = this.f$1;
        y9X y9x = this.f$0;
        if (i != 0) {
            UsU.BGx(y9x, usU);
        } else {
            UsU.mbG(y9x, usU);
        }
    }
}
