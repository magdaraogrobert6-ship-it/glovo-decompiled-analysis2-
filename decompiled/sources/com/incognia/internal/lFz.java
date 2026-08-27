package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class lFz implements xaE {
    @Override // com.incognia.internal.xaE
    public final void BGx(Throwable th) {
        try {
            try {
                oV.mbG();
                SjD sjD = (SjD) JY.BGx.get();
                sjD.getClass();
                if (sjD instanceof yIq) {
                    ((Jz) oV.mbG()).JR.BGx(th, true);
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        } catch (NullPointerException unused2) {
        }
        pNP.BGx(th, true);
    }
}
