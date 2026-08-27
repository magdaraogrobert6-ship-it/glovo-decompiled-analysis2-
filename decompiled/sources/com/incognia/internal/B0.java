package com.incognia.internal;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class B0 implements Pu0 {
    public static final B0 BGx = new B0();
    public static final String mbG = (String) W4i.kX0.MediaSessionCompatResultReceiverWrapper();
    public static final String HQ = (String) W4i.Gfg.MediaSessionCompatResultReceiverWrapper();
    public static final String N = (String) W4i.Bkc.MediaSessionCompatResultReceiverWrapper();
    public static final String x = (String) W4i.f37o.MediaSessionCompatResultReceiverWrapper();

    @Override // com.incognia.internal.Pu0
    public final String N() {
        return x;
    }

    @Override // com.incognia.internal.Pu0
    public final String mbG() {
        return N;
    }

    @Override // com.incognia.internal.Pu0
    public final String x() {
        return mbG;
    }

    @Override // com.incognia.internal.Pu0
    public final String BGx() {
        return "DROP TABLE IF EXISTS " + mbG;
    }

    @Override // com.incognia.internal.Pu0
    public final String HQ() {
        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb.append(mbG);
        sb.append(" (_id INTEGER PRIMARY KEY,");
        sb.append(x);
        sb.append(" TEXT,");
        sb.append(HQ);
        sb.append(" TEXT,");
        return ff$$ExternalSyntheticOutline0.m(sb, N, " INTEGER)");
    }
}
