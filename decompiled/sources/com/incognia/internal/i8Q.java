package com.incognia.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import o.getCieXyz;
import o.getInAppMessageEventMap;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class i8Q {
    public final int BGx;
    public final boolean mbG;
    public static final String A1 = (String) W4i.Vb.MediaSessionCompatResultReceiverWrapper();
    public static final String q = (String) W4i.nem.MediaSessionCompatResultReceiverWrapper();
    public static final String fZl = (String) W4i.SG1.MediaSessionCompatResultReceiverWrapper();
    public static final String S = (String) W4i.Noa.MediaSessionCompatResultReceiverWrapper();
    public static final String iaH = (String) W4i.sw.MediaSessionCompatResultReceiverWrapper();
    public static final String e = (String) W4i.sm1.MediaSessionCompatResultReceiverWrapper();
    public static final String VLD = (String) W4i.bB.MediaSessionCompatResultReceiverWrapper();
    public static final String TfN = (String) W4i.tv.MediaSessionCompatResultReceiverWrapper();
    public static final String OV7 = (String) W4i.h2.MediaSessionCompatResultReceiverWrapper();
    public static final String JR = (String) W4i.Jz.MediaSessionCompatResultReceiverWrapper();
    public static final String j = (String) W4i.VLU.MediaSessionCompatResultReceiverWrapper();
    public static final String n = (String) W4i.g1.MediaSessionCompatResultReceiverWrapper();
    public static final String vM = (String) W4i.Emc.MediaSessionCompatResultReceiverWrapper();
    public static final String l5 = (String) W4i.bu.MediaSessionCompatResultReceiverWrapper();
    public static final String ss = (String) W4i.q3.MediaSessionCompatResultReceiverWrapper();
    public static final String B = (String) W4i.uSp.MediaSessionCompatResultReceiverWrapper();
    public final getInAppMessageEventMap HQ = new getInAppMessageEventMap(A1);
    public final getInAppMessageEventMap N = new getInAppMessageEventMap(q);
    public final getInAppMessageEventMap x = new getInAppMessageEventMap(fZl);
    public final getInAppMessageEventMap hIl = new getInAppMessageEventMap(S);
    public final getInAppMessageEventMap hs = new getInAppMessageEventMap(iaH);
    public final getInAppMessageEventMap VV3 = new getInAppMessageEventMap(e);

    public i8Q(int i, boolean z) {
        this.BGx = i;
        this.mbG = z;
    }

    public final List BGx(ArrayList arrayList) {
        Object obj;
        u8u u8uVar;
        u8u u8uVar2;
        u8u u8uVar3;
        u8u u8uVar4;
        List list;
        List list2;
        if (this.BGx <= 0) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        do {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
        } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((E6f) obj).A1, dTC.HQ}, getCieXyz.write())).booleanValue());
        E6f e6f = (E6f) obj;
        if (e6f != null) {
            arrayList2.add(e6f);
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            E6f e6f2 = (E6f) obj2;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{e6f2.A1, kKI.HQ}, getCieXyz.write())).booleanValue() && (list2 = e6f2.VV3) != null && (!list2.isEmpty())) {
                arrayList3.add(obj2);
            }
        }
        onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList3, (Collection) arrayList2);
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList.get(i4);
            i4++;
            E6f e6f3 = (E6f) obj3;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{e6f3.A1, kKI.HQ}, getCieXyz.write())).booleanValue() && (list = e6f3.VV3) != null && (!list.isEmpty())) {
                arrayList4.add(obj3);
            }
        }
        onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList4, (Collection) arrayList2);
        ArrayList arrayList5 = new ArrayList();
        int size4 = arrayList.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj4 = arrayList.get(i5);
            i5++;
            E6f e6f4 = (E6f) obj4;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{e6f4.A1, kKI.HQ}, getCieXyz.write())).booleanValue() && (((u8uVar3 = e6f4.hs) != null && u8uVar3.BGx()) || ((u8uVar4 = e6f4.hs) != null && u8uVar4.equals(z7X.HQ)))) {
                arrayList5.add(obj4);
            }
        }
        onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList5, (Collection) arrayList2);
        ArrayList arrayList6 = new ArrayList();
        int size5 = arrayList.size();
        int i6 = 0;
        while (i6 < size5) {
            Object obj5 = arrayList.get(i6);
            i6++;
            E6f e6f5 = (E6f) obj5;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{e6f5.A1, kKI.HQ}, getCieXyz.write())).booleanValue() && (((u8uVar = e6f5.hs) != null && u8uVar.BGx()) || ((u8uVar2 = e6f5.hs) != null && u8uVar2.equals(z7X.HQ)))) {
                arrayList6.add(obj5);
            }
        }
        onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList6, (Collection) arrayList2);
        HashSet hashSet = new HashSet();
        ArrayList arrayList7 = new ArrayList();
        int size6 = arrayList2.size();
        while (i < size6) {
            Object obj6 = arrayList2.get(i);
            i++;
            if (hashSet.add(((E6f) obj6).N)) {
                arrayList7.add(obj6);
            }
        }
        return onContentCardDismissed.read(arrayList7, this.BGx);
    }
}
