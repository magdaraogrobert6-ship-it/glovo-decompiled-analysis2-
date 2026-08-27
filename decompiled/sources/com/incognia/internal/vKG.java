package com.incognia.internal;

import android.util.Log;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class vKG implements yUe {
    public static final ArrayList A1;
    public static final String VV3 = (String) W4i.Aqa.MediaSessionCompatResultReceiverWrapper();
    public static final String q;
    public final UsU BGx;
    public final Jvi HQ;
    public R1 hIl;
    public final SVJ hs;
    public final utV mbG;
    public JyL N = VPw.BGx;
    public List x = instance_delegatelambda0.write;

    @Override // com.incognia.internal.yUe
    public final JyL N() {
        return this.N;
    }

    static {
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            arrayList.add(30000L);
        }
        A1 = arrayList;
        q = (String) W4i.BL.MediaSessionCompatResultReceiverWrapper();
    }

    @Override // com.incognia.internal.yUe
    public final void HQ() {
        this.N = Yp.BGx;
        O6.BGx(this, new Q$$ExternalSyntheticLambda1(19, this));
    }

    @Override // com.incognia.internal.yUe
    public final void hIl() {
        this.N = pbf.BGx;
        this.mbG.BGx(A2B.class, this.hs);
    }

    public final void hs() {
        int iIntValue;
        et5 et5Var;
        try {
            Jvi jvi = this.HQ;
            int i = et5.mbG;
            Integer numHQ = Ay.BGx.HQ(q);
            if (numHQ != null) {
                iIntValue = numHQ.intValue();
            } else {
                X9 x9 = X9.HQ;
                iIntValue = 0;
            }
            if (iIntValue != 0) {
                et5Var = iIntValue != 1 ? yWN.HQ : L5i.HQ;
            } else {
                et5Var = X9.HQ;
            }
            List listBGx = jvi.BGx(et5Var);
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.x, listBGx}, getCieXyz.write())).booleanValue()) {
                this.x = listBGx;
                x();
            }
            if (mbG()) {
                R1 r1 = this.hIl;
                if (r1 != null) {
                    r1.hIl.compareAndSet(false, true);
                }
                IU.BGx.get();
            }
        } catch (Throwable unused) {
            if (IU.BGx.get()) {
                Log.w("Incognia", "Failed to verify requirements");
            }
        }
    }

    public final void x() {
        String str;
        String str2;
        List list = this.x;
        String str3 = (String) W4i.JG.MediaSessionCompatResultReceiverWrapper();
        int size = list.size() + 1;
        String[][] strArr = new String[size][];
        for (int i = 0; i < size; i++) {
            String[] strArr2 = new String[3];
            for (int i2 = 0; i2 < 3; i2++) {
                strArr2[i2] = "";
            }
            strArr[i] = strArr2;
        }
        strArr[0][0] = (String) W4i.H2.MediaSessionCompatResultReceiverWrapper();
        strArr[0][1] = (String) W4i.NW.MediaSessionCompatResultReceiverWrapper();
        strArr[0][2] = (String) W4i.ccj.MediaSessionCompatResultReceiverWrapper();
        int size2 = list.size();
        if (1 <= size2) {
            int i3 = 1;
            while (true) {
                c1 c1Var = (c1) list.get(i3 - 1);
                String[] strArr3 = strArr[i3];
                w4a w4aVar = c1Var.BGx;
                rx9 rx9Var = rx9.BGx;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{w4aVar, rx9Var}, getCieXyz.write())).booleanValue()) {
                    str = (String) W4i.JB.MediaSessionCompatResultReceiverWrapper();
                } else {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{w4aVar, Ed.BGx}, getCieXyz.write())).booleanValue()) {
                        str = (String) W4i.jz.MediaSessionCompatResultReceiverWrapper();
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{w4aVar, LqY.BGx}, getCieXyz.write())).booleanValue()) {
                            str = (String) W4i.m2m.MediaSessionCompatResultReceiverWrapper();
                        } else {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{w4aVar, xmL.BGx}, getCieXyz.write())).booleanValue()) {
                                str = (String) W4i.Xo.MediaSessionCompatResultReceiverWrapper();
                            } else {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{w4aVar, D9x.BGx}, getCieXyz.write())).booleanValue()) {
                                    str = (String) W4i.xcr.MediaSessionCompatResultReceiverWrapper();
                                } else {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{w4aVar, w53.BGx}, getCieXyz.write())).booleanValue()) {
                                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                        return;
                                    }
                                    str = (String) W4i.B3.MediaSessionCompatResultReceiverWrapper();
                                }
                            }
                        }
                    }
                }
                strArr3[0] = str;
                strArr[i3][1] = c1Var.mbG ? (String) W4i.NY.MediaSessionCompatResultReceiverWrapper() : (String) W4i.Ol.MediaSessionCompatResultReceiverWrapper();
                String[] strArr4 = strArr[i3];
                if (c1Var.mbG) {
                    str2 = "";
                } else {
                    w4a w4aVar2 = c1Var.BGx;
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{w4aVar2, rx9Var}, getCieXyz.write())).booleanValue()) {
                        str2 = (String) W4i.mx.MediaSessionCompatResultReceiverWrapper();
                    } else {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{w4aVar2, Ed.BGx}, getCieXyz.write())).booleanValue()) {
                            str2 = (String) W4i.y0.MediaSessionCompatResultReceiverWrapper();
                        } else {
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{w4aVar2, LqY.BGx}, getCieXyz.write())).booleanValue()) {
                                str2 = (String) W4i.E8.MediaSessionCompatResultReceiverWrapper();
                            } else {
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{w4aVar2, xmL.BGx}, getCieXyz.write())).booleanValue()) {
                                    str2 = (String) W4i.nLm.MediaSessionCompatResultReceiverWrapper();
                                } else {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{w4aVar2, D9x.BGx}, getCieXyz.write())).booleanValue()) {
                                        str2 = (String) W4i.WSt.MediaSessionCompatResultReceiverWrapper();
                                    } else {
                                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{w4aVar2, w53.BGx}, getCieXyz.write())).booleanValue()) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                            return;
                                        }
                                        str2 = (String) W4i.cjQ.MediaSessionCompatResultReceiverWrapper();
                                    }
                                }
                            }
                        }
                    }
                }
                strArr4[2] = str2;
                if (i3 == size2) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (x33.BGx(str3, strArr) != null) {
            IU.BGx.get();
        }
    }

    public vKG(UsU usU, utV utv, Jvi jvi, gmg gmgVar) {
        this.BGx = usU;
        this.mbG = utv;
        this.HQ = jvi;
        this.hs = new SVJ(VV3, usU, new K3c(this));
    }

    public static final void BGx(vKG vkg) {
        y9X y9x;
        R1 r1 = vkg.hIl;
        if (r1 != null) {
            r1.hIl.compareAndSet(false, true);
        }
        UsU usU = vkg.BGx;
        ArrayList arrayList = A1;
        R1 r2 = new R1(usU, arrayList, new BLi(vkg));
        vkg.hIl = r2;
        if (!r2.hIl.get() && !r2.hs.get() && (y9x = r2.x) != null) {
            usU.BGx(((Number) onContentCardDismissed.read((List) arrayList)).longValue(), y9x);
        }
        vkg.hs();
    }

    public final boolean mbG() {
        List list = this.x;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((c1) obj).BGx, D9x.BGx}, getCieXyz.write())).booleanValue()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!((c1) obj2).mbG) {
                return false;
            }
        }
        return true;
    }

    @Override // com.incognia.internal.yUe
    public final UsU BGx() {
        return this.BGx;
    }

    @Override // com.incognia.internal.yUe
    public final void BGx(vN8 vn8) {
        O6.BGx(this, new N6$$ExternalSyntheticLambda0(this, 28, vn8));
    }

    public static final void BGx(vKG vkg, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        vkg.mbG.mbG(A2B.class, vkg.hs);
        R1 r1 = vkg.hIl;
        if (r1 != null) {
            r1.hIl.compareAndSet(false, true);
        }
        vkg.N = c39.BGx;
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }
}
