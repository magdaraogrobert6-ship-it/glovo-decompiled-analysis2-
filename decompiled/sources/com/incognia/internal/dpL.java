package com.incognia.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class dpL implements Xeg {
    @Override // com.incognia.internal.Xeg
    public final int BGx() {
        return 1;
    }

    @Override // com.incognia.internal.Xeg
    public final boolean mbG() {
        return false;
    }

    static {
    }

    @Override // com.incognia.internal.Xeg
    public final void BGx(Context context) {
        NDV ndv = NDV.BGx;
        a9 a9Var = new a9(context, NDV.mbG);
        a9 a9Var2 = new a9(context, NDV.HQ);
        a9 a9Var3 = new a9(context, NDV.N);
        a9Var.BGx();
        a9Var2.BGx();
        a9Var3.BGx();
        for (String str : ndv.BGx()) {
            if (context.getDatabasePath(str).exists()) {
                context.deleteDatabase(str);
            }
        }
    }
}
