package com.incognia.internal;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class X2C$$ExternalSyntheticLambda1 implements kz0, IrU {
    public final /* synthetic */ X2C f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ ArrayList f$2;
    public final /* synthetic */ lD f$3;

    public /* synthetic */ X2C$$ExternalSyntheticLambda1(X2C x2c, String str, ArrayList arrayList, lD lDVar) {
        this.f$0 = x2c;
        this.f$1 = str;
        this.f$2 = arrayList;
        this.f$3 = lDVar;
    }

    @Override // com.incognia.internal.IrU
    public void BGx(E3 e3) {
        X2C.BGx(this.f$0, this.f$1, (List) this.f$2, this.f$3, e3);
    }

    @Override // com.incognia.internal.kz0
    public void onSuccess(Object obj) {
        X2C.BGx(this.f$0, this.f$1, this.f$2, this.f$3, obj);
    }
}
