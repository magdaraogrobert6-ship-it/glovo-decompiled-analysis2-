package com.incognia.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.onMove;

/* JADX INFO: loaded from: classes2.dex */
public final class qee {
    public final LinkedHashMap BGx(List list) {
        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(list, 10));
        if (iRemoteActionCompatParcelizer < 16) {
            iRemoteActionCompatParcelizer = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LCt lCt = (LCt) it.next();
            bj7 bj7Var = new bj7(lCt.hs, lCt.hIl);
            double dPow = Math.pow(2.0d, ((double) lCt.BGx) / 10.0d);
            if (lCt.N) {
                dPow *= 3.0d;
            }
            linkedHashMap.put(bj7Var, Double.valueOf(dPow));
        }
        return linkedHashMap;
    }
}
