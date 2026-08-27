package com.incognia.internal;

import java.util.List;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class D3$$ExternalSyntheticLambda0 implements y9X {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ D3$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    @Override // com.incognia.internal.y9X
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        if (i == 0) {
            D3.BGx(obj4, (CBQ) obj3, (aF) obj2, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj);
        } else if (i != 1) {
            X2C.BGx((List) obj4, (uEN) obj3, (X2C) obj2, (lD) obj);
        } else {
            X2C.BGx((X2C) obj4, (String) obj3, (List) obj2, (lD) obj);
        }
    }
}
