package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.cancelPendingWebViewPause;
import o.createInAppMessageEventSubscriber;
import o.instance_delegatelambda0;
import o.loadHtmlData;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;

/* JADX INFO: loaded from: classes2.dex */
public final class eQD implements yUe {
    public final UsU BGx;
    public final GH HQ;
    public JyL N = VPw.BGx;
    public final X2C mbG;
    public int x;

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.N;
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.N = Yp.BGx;
        O6.BGx(this, new Q$$ExternalSyntheticLambda1(15, this));
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.N = pbf.BGx;
    }

    public eQD(UsU usU, X2C x2c, GH gh) {
        this.BGx = usU;
        this.mbG = x2c;
        this.HQ = gh;
    }

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z, eQD eqd, List list, List list2, List list3) {
        if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.valueOf(z));
        }
        eqd.x--;
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (list2.contains(((Mj) obj).mbG)) {
                    arrayList.add(obj);
                }
            }
            GH gh = eqd.HQ;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                arrayList2.add(((Mj) obj2).mbG);
            }
            if (!arrayList2.isEmpty()) {
                gh.BGx.BGx(new BPj(gh, arrayList2));
            }
            if (list2.size() == list3.size() && eqd.x == 0) {
                GH gh2 = eqd.HQ;
                cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
                gh2.HQ.BGx(new tNX(cancelpendingwebviewpause));
                if (cancelpendingwebviewpause.IconCompatParcelizer) {
                    return;
                }
                GH gh3 = eqd.HQ;
                createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                createinappmessageeventsubscriber.IconCompatParcelizer = instance_delegatelambda0.write;
                gh3.HQ.mbG(new aEQ(gh3, createinappmessageeventsubscriber));
                List list4 = (List) createinappmessageeventsubscriber.IconCompatParcelizer;
                ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((Mj) it.next()).N);
                }
                eqd.BGx(arrayList3, u5l.BGx, null, false);
            }
        }
    }

    public static final void BGx(eQD eqd) {
        eqd.x = 0;
        GH gh = eqd.HQ;
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        createinappmessageeventsubscriber.IconCompatParcelizer = instance_delegatelambda0.write;
        gh.HQ.mbG(new aEQ(gh, createinappmessageeventsubscriber));
        List list = (List) createinappmessageeventsubscriber.IconCompatParcelizer;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Mj) it.next()).N);
        }
        eqd.BGx(arrayList, u5l.BGx, null, false);
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        this.N = c39.BGx;
        vn8.invoke();
    }

    public final void BGx(List list, lD lDVar, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z) {
        if (O6.BGx(this, new MGq$$ExternalSyntheticLambda0(list, r8lambdaunavo3sxub_pc9xroryotnrlvsm, z, this, lDVar)) || r8lambdaunavo3sxub_pc9xroryotnrlvsm == null) {
            return;
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.FALSE);
    }

    public static final void BGx(List list, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, boolean z, eQD eqd, lD lDVar) {
        try {
            if (list.isEmpty()) {
                if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                    r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.TRUE);
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                X1 x1 = (X1) it.next();
                arrayList.add(new Mj(null, x1.x, x1.HQ, x1));
            }
            if (z) {
                GH gh = eqd.HQ;
                cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
                gh.BGx.BGx(new jS(cancelpendingwebviewpause, gh));
                if (cancelpendingwebviewpause.IconCompatParcelizer) {
                    cancelPendingWebViewPause cancelpendingwebviewpause2 = new cancelPendingWebViewPause();
                    gh.BGx.BGx(new jS(cancelpendingwebviewpause2, gh));
                    if (cancelpendingwebviewpause2.IconCompatParcelizer) {
                        gh.BGx.mbG(new lx(gh));
                        gh.BGx.BGx(QTL.BGx);
                    }
                }
                gh.HQ.mbG(new eF(arrayList, gh));
            }
            eqd.mbG.BGx(list, lDVar, new loadHtmlData(eqd, r8lambdaunavo3sxub_pc9xroryotnrlvsm, arrayList, list));
            eqd.x++;
        } catch (Throwable unused) {
            if (r8lambdaunavo3sxub_pc9xroryotnrlvsm != null) {
                r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(Boolean.FALSE);
            }
        }
    }

    public static final void BGx(eQD eqd, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, List list, List list2, boolean z, List list3) {
        O6.BGx(eqd, new eQD$$ExternalSyntheticLambda3(r8lambdaunavo3sxub_pc9xroryotnrlvsm, z, eqd, list, list3, list2));
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.BGx;
    }
}
