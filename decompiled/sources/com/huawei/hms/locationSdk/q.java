package com.huawei.hms.locationSdk;

import bo.app.d$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class q {
    private final int a;
    private final long b;
    private final List<s> c;

    public String toString() {
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("svCnt:");
        sbM.append(this.a);
        sbM.append(",receiverTime:");
        sbM.append(this.b);
        sbM.append(",gnssStatus:[");
        List<s> list = this.c;
        if (list != null && list.size() != 0) {
            Iterator<s> it = this.c.iterator();
            while (it.hasNext()) {
                sbM.append(it.next().toString());
                sbM.append(",");
            }
            sbM.deleteCharAt(sbM.length() - 1);
        }
        sbM.append("]");
        return sbM.toString();
    }

    public q(int i, long j, List<s> list) {
        this.a = i;
        this.b = j;
        this.c = list;
    }
}
