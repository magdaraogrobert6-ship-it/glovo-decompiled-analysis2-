package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yI3$$ExternalSyntheticLambda0 implements y9X {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ yI3 f$0;
    public final /* synthetic */ QGs f$1;

    public /* synthetic */ yI3$$ExternalSyntheticLambda0(yI3 yi3, QGs qGs, int i) {
        this.$r8$classId = i;
        this.f$0 = yi3;
        this.f$1 = qGs;
    }

    @Override // com.incognia.internal.y9X
    public final void run() {
        int i = this.$r8$classId;
        QGs qGs = this.f$1;
        yI3 yi3 = this.f$0;
        if (i == 0) {
            yI3.mbG(yi3, qGs);
        } else if (i != 1) {
            yI3.HQ(yi3, qGs);
        } else {
            yI3.BGx(yi3, qGs);
        }
    }
}
