package com.incognia.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class toO {
    public static final void BGx(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        if (i == arrayList2.size()) {
            arrayList.add(arrayList3);
            return;
        }
        int i2 = i + 1;
        BGx(arrayList, arrayList2, new ArrayList(arrayList3), i2);
        arrayList3.add(arrayList2.get(i));
        BGx(arrayList, arrayList2, new ArrayList(arrayList3), i2);
    }
}
