package com.incognia.internal;

import android.hardware.Sensor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;

/* JADX INFO: loaded from: classes2.dex */
public final class D2i {
    public static ArrayList BGx(List list) {
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Sensor sensor = (Sensor) it.next();
            arrayList.add(new z96(sensor.getName(), sensor.getVendor()));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            z96 z96Var = (z96) obj;
            if (z96Var.BGx != null || z96Var.mbG != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }
}
