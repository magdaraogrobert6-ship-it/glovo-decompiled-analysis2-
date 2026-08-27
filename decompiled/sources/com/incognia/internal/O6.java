package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O6 {
    public static final boolean BGx(yUe yue, y9X y9x) {
        JyL jyLN = yue.N();
        jyLN.getClass();
        if (jyLN instanceof c39) {
            return false;
        }
        yue.BGx().BGx(y9x);
        return true;
    }

    public static final void HQ(yUe yue, y9X y9x) {
        JyL jyLN = yue.N();
        jyLN.getClass();
        if (jyLN instanceof c39) {
            return;
        }
        y9x.run();
    }

    public static final void mbG(yUe yue, y9X y9x) {
        JyL jyLN = yue.N();
        jyLN.getClass();
        if (jyLN instanceof c39) {
            return;
        }
        yue.BGx().BGx(500L, new Dd$$ExternalSyntheticLambda0(yue, 7, y9x));
    }
}
