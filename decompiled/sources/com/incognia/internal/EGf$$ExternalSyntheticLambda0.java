package com.incognia.internal;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class EGf$$ExternalSyntheticLambda0 implements y9X {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;

    public /* synthetic */ EGf$$ExternalSyntheticLambda0(boolean z, ZBu zBu, X6a x6a) {
        this.$r8$classId = 2;
        this.f$2 = z;
        this.f$0 = zBu;
        this.f$1 = x6a;
    }

    @Override // com.incognia.internal.y9X
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        boolean z = this.f$2;
        if (i == 0) {
            EGf.BGx((bV) obj2, (String) obj, z);
        } else if (i != 1) {
            X6a.BGx(z, (ZBu) obj2, (X6a) obj);
        } else {
            X6a.BGx((X6a) obj2, (Throwable) obj, z);
        }
    }

    public /* synthetic */ EGf$$ExternalSyntheticLambda0(yUe yue, Serializable serializable, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = yue;
        this.f$1 = serializable;
        this.f$2 = z;
    }
}
