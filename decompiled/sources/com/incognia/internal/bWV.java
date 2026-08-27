package com.incognia.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o.DrawableTransformation;
import o.getCieXyz;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bWV {
    public static final UsU BGx = new UsU(U2.BGx, true);
    public static final KWh mbG = new KWh();
    public static final hHB HQ = new hHB();
    public static final ArrayList N = new ArrayList();
    public static final ArrayList x = new ArrayList();

    public static final void BGx(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        Object next;
        if (r8lambdardpfsr94j4iebcwx_kpqzpm8k0 != null) {
            x.add(r8lambdardpfsr94j4iebcwx_kpqzpm8k0);
        }
        mbG.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        List listBGx = HQ.BGx();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listBGx) {
            FsT fsT = (FsT) obj;
            Long l = fsT.HQ;
            if (l != null) {
                long jLongValue = l.longValue();
                if (jCurrentTimeMillis > jLongValue) {
                    if (jCurrentTimeMillis - jLongValue > fsT.mbG) {
                    }
                }
            }
            arrayList.add(obj);
        }
        if (!arrayList.isEmpty()) {
            ((Jz) oV.mbG()).n.BGx(new xUW(arrayList, mO.BGx));
        }
        List listBGx2 = HQ.BGx();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            FsT fsT2 = (FsT) obj2;
            Iterator it = listBGx2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((FsT) next).BGx, fsT2.BGx}, getCieXyz.write())).booleanValue());
            FsT fsT3 = (FsT) next;
            if (fsT3 != null) {
                fsT3.HQ = Long.valueOf(jCurrentTimeMillis);
            }
        }
        hHB hhb = HQ;
        hhb.getClass();
        Ay.BGx.BGx(hHB.mbG, onContentCardDismissed.PlaybackStateCompat(listBGx2), new CMc(hhb));
        ArrayList arrayList2 = N;
        arrayList2.addAll(arrayList);
        if (arrayList2.isEmpty()) {
            ArrayList arrayList3 = x;
            int size2 = arrayList3.size();
            while (i < size2) {
                Object obj3 = arrayList3.get(i);
                i++;
                try {
                    ((r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) obj3).invoke();
                } catch (Exception unused) {
                }
            }
            x.clear();
        }
    }

    public static final void mbG(FsT fsT) {
        ArrayList<FsT> arrayListIconCompatParcelizer = onContentCardDismissed.IconCompatParcelizer((Collection) HQ.BGx());
        if (!arrayListIconCompatParcelizer.isEmpty()) {
            for (FsT fsT2 : arrayListIconCompatParcelizer) {
                Object[] objArr = {fsT2.BGx, fsT.BGx};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue() && fsT2.mbG == fsT.mbG) {
                    return;
                }
            }
        }
        if (arrayListIconCompatParcelizer.isEmpty()) {
            arrayListIconCompatParcelizer.add(fsT);
        } else {
            Iterator it = arrayListIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                Object[] objArr2 = {((FsT) it.next()).BGx, fsT.BGx};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    for (FsT fsT3 : arrayListIconCompatParcelizer) {
                        Object[] objArr3 = {fsT3.BGx, fsT.BGx};
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                            onContentCardDismissed.write((List) arrayListIconCompatParcelizer, (r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new F55(fsT));
                            arrayListIconCompatParcelizer.add(new FsT(fsT.BGx, fsT.mbG, fsT3.HQ));
                        }
                    }
                    DrawableTransformation.write("Collection contains no element matching the predicate.");
                    return;
                }
            }
            arrayListIconCompatParcelizer.add(fsT);
        }
        hHB hhb = HQ;
        hhb.getClass();
        Ay.BGx.BGx(hHB.mbG, onContentCardDismissed.PlaybackStateCompat(arrayListIconCompatParcelizer), new CMc(hhb));
    }

    public static void BGx() {
        BGx.BGx(new Q$$ExternalSyntheticLambda0(3));
    }

    public static void BGx(FsT fsT) {
        BGx.BGx(new Q$$ExternalSyntheticLambda1(13, fsT));
    }
}
