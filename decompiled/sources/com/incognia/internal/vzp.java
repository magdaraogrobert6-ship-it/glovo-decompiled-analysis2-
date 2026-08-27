package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class vzp {
    public final List BGx;
    public final Map mbG;

    public final int hashCode() {
        return this.mbG.hashCode() + (this.BGx.hashCode() * 31);
    }

    public vzp(List list, Map map) {
        this.BGx = list;
        this.mbG = map;
    }

    public final boolean BGx(Jtm jtm) {
        int iBGx = jtm.BGx();
        if ((BGx() & iBGx) != iBGx) {
            return false;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(Boolean) this.mbG.get(jtm), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
            return true;
        }
        Map map = this.mbG;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((Jtm) ((Map.Entry) it.next()).getKey());
        }
        ArrayList arrayList2 = new ArrayList();
        toO.BGx(arrayList2, arrayList, new ArrayList(), 0);
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            List list = (List) obj;
            if (list != null) {
                Iterator it2 = list.iterator();
                int iBGx2 = 0;
                while (it2.hasNext()) {
                    iBGx2 |= ((Jtm) it2.next()).BGx();
                }
                if ((iBGx2 & iBGx) == iBGx) {
                    Iterator it3 = list.iterator();
                    boolean zBooleanValue = true;
                    while (it3.hasNext()) {
                        zBooleanValue &= ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG.get((Jtm) it3.next()), Boolean.TRUE}, getCieXyz.write())).booleanValue();
                    }
                    if (zBooleanValue) {
                        arrayList3.add(obj);
                    }
                }
            }
        }
        return !arrayList3.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzp)) {
            return false;
        }
        vzp vzpVar = (vzp) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx, vzpVar.BGx}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.mbG, vzpVar.mbG}, getCieXyz.write())).booleanValue();
    }

    public final int BGx() {
        Map map = this.mbG;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Jtm) ((Map.Entry) it.next()).getKey()).BGx()));
        }
        int size = arrayList.size();
        int i = 0;
        int iIntValue = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            iIntValue |= ((Number) obj).intValue();
        }
        return iIntValue;
    }
}
