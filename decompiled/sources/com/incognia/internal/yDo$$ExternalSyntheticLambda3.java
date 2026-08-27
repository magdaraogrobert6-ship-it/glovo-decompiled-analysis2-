package com.incognia.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yDo$$ExternalSyntheticLambda3 implements y9X {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ yDo f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ yDo$$ExternalSyntheticLambda3(yDo ydo, List list, int i) {
        this.$r8$classId = i;
        this.f$0 = ydo;
        this.f$1 = list;
    }

    @Override // com.incognia.internal.y9X
    public final void run() {
        if (this.$r8$classId != 0) {
            yDo.mbG(this.f$0, this.f$1);
        } else {
            yDo.N(this.f$0, this.f$1);
        }
    }
}
