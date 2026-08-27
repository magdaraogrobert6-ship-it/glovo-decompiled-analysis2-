package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bV$$ExternalSyntheticLambda0 implements g6v {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ yUe f$0;

    public /* synthetic */ bV$$ExternalSyntheticLambda0(yUe yue, int i) {
        this.$r8$classId = i;
        this.f$0 = yue;
    }

    @Override // com.incognia.internal.g6v
    public final void BGx(boolean z) {
        int i = this.$r8$classId;
        yUe yue = this.f$0;
        if (i == 0) {
            bV.BGx((bV) yue, z);
        } else if (i != 1) {
            yDo.BGx((yDo) yue, z);
        } else {
            GS6.BGx((GS6) yue, z);
        }
    }
}
