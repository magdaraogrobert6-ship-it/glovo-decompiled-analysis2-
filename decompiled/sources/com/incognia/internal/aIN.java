package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import o.accessgetInstancedelegatecp;
import o.onContentCardDismissed;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aIN {
    public static final Set BGx(Set set) {
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).toLowerCase(Locale.ROOT));
        }
        return onContentCardDismissed.ParcelableVolumeInfo(arrayList);
    }
}
