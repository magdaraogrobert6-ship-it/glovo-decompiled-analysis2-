package com.incognia.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Q$$ExternalSyntheticLambda4 implements y9X {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Context f$0;

    public /* synthetic */ Q$$ExternalSyntheticLambda4(Context context, int i) {
        this.$r8$classId = i;
        this.f$0 = context;
    }

    @Override // com.incognia.internal.y9X
    public final void run() {
        int i = this.$r8$classId;
        Context context = this.f$0;
        if (i != 0) {
            YM.mbG(context);
        } else {
            Q.mbG(context);
        }
    }
}
