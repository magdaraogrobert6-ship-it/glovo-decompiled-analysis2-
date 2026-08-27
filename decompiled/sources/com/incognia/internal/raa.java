package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import o.getInAppMessageEventMap;
import o.isItemDismissable;

/* JADX INFO: loaded from: classes2.dex */
public final class raa {
    public final ArrayList BGx;

    public raa(Set set) {
        Object isitemdismissable;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            try {
                isitemdismissable = new getInAppMessageEventMap((String) it.next());
            } catch (Throwable th) {
                isitemdismissable = new isItemDismissable(th);
            }
            getInAppMessageEventMap getinappmessageeventmap = (getInAppMessageEventMap) (isitemdismissable instanceof isItemDismissable ? null : isitemdismissable);
            if (getinappmessageeventmap != null) {
                arrayList.add(getinappmessageeventmap);
            }
        }
        this.BGx = arrayList;
    }
}
