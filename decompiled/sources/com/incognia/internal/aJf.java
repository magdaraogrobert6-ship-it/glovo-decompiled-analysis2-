package com.incognia.internal;

import bo.app.ff$$ExternalSyntheticOutline0;

/* JADX INFO: loaded from: classes2.dex */
public final class aJf implements Pu0 {
    public static final aJf BGx = new aJf();
    public static final String mbG = (String) W4i.I.MediaSessionCompatResultReceiverWrapper();
    public static final String HQ = (String) W4i.A.MediaSessionCompatResultReceiverWrapper();
    public static final String N = (String) W4i.dIe.MediaSessionCompatResultReceiverWrapper();
    public static final String x = (String) W4i.kh7.MediaSessionCompatResultReceiverWrapper();

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
