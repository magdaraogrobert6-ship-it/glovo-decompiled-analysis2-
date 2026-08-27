package com.incognia.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 {
    public static final long N = 300000;
    public final YZr BGx;
    public final mAX HQ;
    public final Hh mbG;

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x0011, B:9:0x0021, B:11:0x0024, B:15:0x002f, B:14:0x002c), top: B:21:0x0001 }] */
    public final vzp BGx(Jtm jtm) {
        vzp vzpVar;
        vzp vzpVar2;
        synchronized (this) {
            try {
                if (this.HQ.BGx() || (vzpVar2 = (vzp) this.HQ.N) == null) {
                    mbG(jtm);
                } else {
                    int iBGx = jtm.BGx();
                    int iBGx2 = vzpVar2.BGx();
                    if (vzpVar2.mbG.isEmpty() || iBGx != (iBGx2 & iBGx) || !vzpVar2.BGx(jtm)) {
                        mbG(jtm);
                    }
                }
                vzpVar = (vzp) this.HQ.N;
            } catch (Throwable unused) {
                return null;
            }
        }
        return vzpVar;
    }

    public d0(YZr yZr, Hh hh, KWh kWh) {
        this.BGx = yZr;
        this.mbG = hh;
        this.HQ = new mAX(kWh, N);
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02be  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57, types: [java.util.ArrayList] */
    public final void mbG(Jtm jtm) {
        ?? arrayList;
        LinkedHashMap linkedHashMap;
        boolean z;
        List list;
        Map map;
        Object next;
        Object next2;
        List list2;
        String string;
        ?? arrayList2;
        Object obj = this.HQ.N;
        List listRemoteActionCompatParcelizer = instance_delegatelambda0.write;
        Object obj2 = null;
        if (obj == null) {
            YZr yZr = this.BGx;
            if (yZr.HQ) {
                List<PackageInfo> listBGx = J3.BGx(yZr.mbG, 0);
                arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(listBGx, 10));
                for (PackageInfo packageInfo : listBGx) {
                    yZr.N.getClass();
                    arrayList2.add(QP.BGx(packageInfo, null));
                }
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = listRemoteActionCompatParcelizer;
            }
            mAX max = this.HQ;
            fme fmeVar = fme.BGx;
            Map mapSingletonMap = Collections.singletonMap(fmeVar, Boolean.TRUE);
            mapSingletonMap.getClass();
            max.BGx(new vzp(arrayList2, mapSingletonMap));
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{jtm, fmeVar}, getCieXyz.write())).booleanValue()) {
                return;
            }
        }
        int iBGx = jtm.BGx();
        boolean zBGx = this.mbG.BGx(jtm);
        vzp vzpVar = (vzp) this.HQ.N;
        int iBGx2 = vzpVar != null ? vzpVar.BGx() : 0;
        YZr yZr2 = this.BGx;
        if (yZr2.HQ) {
            List<PackageInfo> listBGx2 = J3.BGx(yZr2.mbG, iBGx & (iBGx2 ^ iBGx));
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(listBGx2, 10));
            for (PackageInfo packageInfo2 : listBGx2) {
                if (!zBGx || packageInfo2 == null) {
                    string = null;
                } else {
                    try {
                        ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo != null) {
                            string = yZr2.mbG.getApplicationLabel(applicationInfo).toString();
                        } else {
                            string = null;
                        }
                    } catch (Throwable unused) {
                    }
                }
                yZr2.N.getClass();
                arrayList.add(QP.BGx(packageInfo2, string));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = listRemoteActionCompatParcelizer;
        }
        vzp vzpVar2 = (vzp) this.HQ.N;
        List<dCe> arrayList3 = (vzpVar2 == null || (list2 = vzpVar2.BGx) == null) ? listRemoteActionCompatParcelizer : new ArrayList(list2);
        for (dCe dce : arrayList3) {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = obj2;
                    break;
                }
                next2 = it.next();
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((dCe) next2).q, dce.q}, getCieXyz.write())).booleanValue());
            dCe dce2 = (dCe) next2;
            if (dce2 == null) {
                listRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) listRemoteActionCompatParcelizer, (Object) dce);
            } else {
                long j = dce2.BGx;
                long j2 = dce2.mbG;
                long j3 = dce2.HQ;
                boolean z2 = dce2.N;
                List list3 = dce2.x;
                if (list3 == null) {
                    list3 = dce.x;
                }
                List list4 = list3;
                List list5 = dce2.hIl;
                if (list5 == null) {
                    list5 = dce.hIl;
                }
                List list6 = list5;
                List list7 = dce2.hs;
                if (list7 == null) {
                    list7 = dce.hs;
                }
                List list8 = list7;
                List list9 = dce2.VV3;
                if (list9 == null) {
                    list9 = dce.VV3;
                }
                List list10 = list9;
                Integer num = dce2.A1;
                if (num == null) {
                    num = dce.A1;
                }
                Integer num2 = num;
                String str = dce2.q;
                if (str == null) {
                    str = dce.q;
                }
                String str2 = str;
                String str3 = dce2.fZl;
                if (str3 == null) {
                    str3 = dce.fZl;
                }
                String str4 = str3;
                Bundle bundle = dce2.S;
                if (bundle == null) {
                    bundle = dce.S;
                }
                Bundle bundle2 = bundle;
                String str5 = dce2.iaH;
                if (str5 == null) {
                    str5 = dce.iaH;
                }
                String str6 = str5;
                Integer num3 = dce2.e;
                if (num3 == null) {
                    num3 = dce.e;
                }
                Integer num4 = num3;
                String str7 = dce2.VLD;
                if (str7 == null) {
                    str7 = dce.VLD;
                }
                String str8 = str7;
                List list11 = dce2.TfN;
                if (list11 == null) {
                    list11 = dce.TfN;
                }
                List list12 = list11;
                String str9 = dce2.OV7;
                if (str9 == null) {
                    str9 = dce.OV7;
                }
                String str10 = str9;
                String str11 = dce2.JR;
                if (str11 == null) {
                    str11 = dce.JR;
                }
                String str12 = str11;
                Integer num5 = dce2.j;
                listRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) listRemoteActionCompatParcelizer, (Object) new dCe(j, j2, j3, z2, list4, list6, list8, list10, num2, str2, str4, bundle2, str6, num4, str8, list12, str10, str12, num5 == null ? dce.j : num5));
                obj2 = null;
            }
        }
        for (dCe dce3 : arrayList) {
            Iterator it2 = arrayList3.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((dCe) next).q, dce3.q}, getCieXyz.write())).booleanValue());
            if (next == null) {
                listRemoteActionCompatParcelizer = onContentCardDismissed.RemoteActionCompatParcelizer((Collection) listRemoteActionCompatParcelizer, (Object) dce3);
            }
        }
        vzp vzpVar3 = (vzp) this.HQ.N;
        if (vzpVar3 != null && (map = vzpVar3.mbG) != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (!jtm.equals(fme.BGx) && !arrayList.isEmpty()) {
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((dCe) it3.next()).q, this.BGx.A1}, getCieXyz.write())).booleanValue()) {
                            vzp vzpVar4 = (vzp) this.HQ.N;
                            z = 20 > ((vzpVar4 == null || (list = vzpVar4.BGx) == null) ? 0 : list.size()) - arrayList.size();
                        }
                    }
                }
            }
        }
        linkedHashMap.put(jtm, Boolean.valueOf(z));
        this.HQ.BGx(new vzp(listRemoteActionCompatParcelizer, linkedHashMap));
    }
}
