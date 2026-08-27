package com.incognia.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class ByN {
    public ByN(Ur9 ur9) {
    }

    public final t1p BGx() {
        Integer numMbG = Ur9.mbG();
        if (numMbG != null) {
            return numMbG.intValue() <= 100 ? tr.BGx : (t1p) Q.mbG.get();
        }
        return (t1p) Q.mbG.get();
    }
}
