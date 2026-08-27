package com.incognia.internal;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.BrazeContentCardsManagerCompanion;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class Q9 {
    public final YZr BGx;
    public final N HQ;
    public final FW N;
    public final mAX hIl;
    public final d0 mbG;
    public Long x;
    public static final String hs = (String) W4i.sg5.MediaSessionCompatResultReceiverWrapper();
    public static final int VV3 = 27;
    public static final int A1 = 10;
    public static final long q = 600000;
    public static final ygQ fZl = ygQ.BGx;

    /* JADX WARN: Code duplicated, block: B:110:0x0226 A[Catch: all -> 0x023f, TryCatch #4 {all -> 0x023f, blocks: (B:108:0x0222, B:110:0x0226, B:112:0x022e, B:114:0x0236, B:115:0x0238), top: B:192:0x0222 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x022d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0269  */
    /* JADX WARN: Code duplicated, block: B:124:0x0274  */
    /* JADX WARN: Code duplicated, block: B:127:0x027a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0285  */
    /* JADX WARN: Code duplicated, block: B:131:0x028b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0296  */
    /* JADX WARN: Code duplicated, block: B:135:0x029e  */
    /* JADX WARN: Code duplicated, block: B:136:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:192:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Multi-variable type inference failed */
    public final tQZ BGx() {
        int i;
        Set setR8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        String str;
        boolean z;
        boolean z2;
        Iterator it;
        List list;
        Set set;
        Object obj;
        List list2;
        Integer numValueOf;
        List list3;
        Integer numValueOf2;
        List list4;
        Integer numValueOf3;
        String str2;
        Long lBGx;
        dCe dceBGx;
        List list5;
        Signature signature;
        PackageInfo packageInfoBGx;
        Rn rnHQ;
        vzp vzpVarBGx = this.mbG.BGx(fZl);
        Set set2 = null;
        if (vzpVarBGx == null) {
            return null;
        }
        List list6 = vzpVarBGx.BGx;
        List listMbG = this.HQ.mbG();
        if (listMbG == null) {
            listMbG = instance_delegatelambda0.write;
        }
        List listBGx = this.HQ.BGx();
        if (listBGx == null) {
            listBGx = instance_delegatelambda0.write;
        }
        Long lBGx2 = BGx(list6);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list6.iterator();
        while (true) {
            i = 0;
            z = false;
            z = false;
            boolean z3 = false;
            if (!it2.hasNext()) {
                break;
            }
            dCe dce = (dCe) it2.next();
            String str3 = dce.q;
            List list7 = dce.VV3;
            if (list7 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list7) {
                    String str4 = (String) obj2;
                    if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(str4, hs, false)) {
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.BGx.mbG(str4), Boolean.TRUE}, getCieXyz.write())).booleanValue()) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(arrayList2);
            } else {
                setR8lambda54BeH8ZsBru0CXI2CCSP2syNys = set2;
            }
            Integer num = dce.A1;
            String str5 = dce.q;
            if (str5 != null) {
                YZr yZr = this.BGx;
                yZr.getClass();
                try {
                    rnHQ = yZr.HQ(str5);
                } catch (Throwable unused) {
                    rnHQ = set2;
                }
                if (rnHQ != 0) {
                    str = rnHQ.BGx;
                } else {
                    str = set2;
                }
            } else {
                str = set2;
            }
            List list8 = dce.x;
            if (list8 != null && !list8.isEmpty()) {
                Iterator it3 = list8.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((ServiceInfo) it3.next()).permission, "android.permission.BIND_ACCESSIBILITY_SERVICE"}, getCieXyz.write())).booleanValue()) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            String str6 = dce.q;
            boolean z4 = str6 != null && listMbG.contains(str6);
            String str7 = dce.q;
            boolean z5 = str7 != null && listBGx.contains(str7);
            boolean zBGx = dce.BGx();
            List list9 = dce.x;
            if (list9 != null && !list9.isEmpty()) {
                Iterator it4 = list9.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((ServiceInfo) it4.next()).permission, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE"}, getCieXyz.write())).booleanValue()) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            boolean zEquals = Long.valueOf(dce.HQ).equals(lBGx2);
            List list10 = dce.hIl;
            if (list10 != null && !list10.isEmpty()) {
                Iterator it5 = list10.iterator();
                while (it5.hasNext()) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((ActivityInfo) it5.next()).permission, "android.permission.BIND_DEVICE_ADMIN"}, getCieXyz.write())).booleanValue()) {
                        z3 = true;
                        break;
                    }
                }
            }
            boolean z6 = dce.N;
            List list11 = dce.hs;
            Object obj3 = list11 != null ? (Signature) onContentCardDismissed.MediaMetadataCompat(list11) : set2;
            YZr yZr2 = this.BGx;
            synchronized (yZr2) {
                try {
                    if (yZr2.VV3 == null) {
                        String str8 = YZr.q;
                        it = it2;
                        try {
                            int iBGx = fYB.BGx.BGx();
                            list = listMbG;
                            try {
                                if ((((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str8, yZr2.A1}, getCieXyz.write())).booleanValue() || yZr2.HQ) && (packageInfoBGx = J3.BGx(yZr2.mbG, str8, iBGx)) != null) {
                                    yZr2.N.getClass();
                                    set = null;
                                    try {
                                        dceBGx = QP.BGx(packageInfoBGx, null);
                                    } catch (Throwable unused2) {
                                        dceBGx = set;
                                    }
                                    if (dceBGx != 0) {
                                        try {
                                            list5 = dceBGx.hs;
                                            if (list5 != null) {
                                                signature = (Signature) onContentCardDismissed.MediaMetadataCompat(list5);
                                            } else {
                                                signature = set;
                                            }
                                        } catch (Throwable unused3) {
                                            obj = set;
                                        }
                                    } else {
                                        signature = set;
                                    }
                                    yZr2.VV3 = signature;
                                } else {
                                    set = null;
                                }
                            } catch (Throwable unused4) {
                            }
                            dceBGx = set;
                            if (dceBGx != 0) {
                                list5 = dceBGx.hs;
                                if (list5 != null) {
                                    signature = (Signature) onContentCardDismissed.MediaMetadataCompat(list5);
                                } else {
                                    signature = set;
                                }
                            } else {
                                signature = set;
                            }
                            yZr2.VV3 = signature;
                        } catch (Throwable unused5) {
                            list = listMbG;
                            set = null;
                            obj = set;
                            boolean zBooleanValue = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, obj}, getCieXyz.write())).booleanValue();
                            list2 = dce.TfN;
                            if (list2 != null) {
                                numValueOf = Integer.valueOf(list2.size());
                            } else {
                                numValueOf = set;
                            }
                            list3 = dce.x;
                            if (list3 != null) {
                                numValueOf2 = Integer.valueOf(list3.size());
                            } else {
                                numValueOf2 = set;
                            }
                            list4 = dce.hIl;
                            if (list4 != null) {
                                numValueOf3 = Integer.valueOf(list4.size());
                            } else {
                                numValueOf3 = set;
                            }
                            String str9 = dce.VLD;
                            str2 = dce.iaH;
                            if (str2 != null) {
                                this.N.getClass();
                                lBGx = FW.BGx(str2);
                            } else {
                                lBGx = set;
                            }
                            arrayList.add(new mM(null, str3, Boolean.valueOf(zEquals), Boolean.valueOf(zBooleanValue), Boolean.valueOf(z6), Boolean.valueOf(z), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(zBGx), Boolean.valueOf(z2), Boolean.valueOf(z3), setR8lambda54BeH8ZsBru0CXI2CCSP2syNys, num, str, dce.JR, numValueOf, numValueOf2, numValueOf3, lBGx, str9));
                            set2 = set;
                            it2 = it;
                            listMbG = list;
                        }
                    } else {
                        it = it2;
                        list = listMbG;
                        set = null;
                    }
                    obj = yZr2.VV3;
                } catch (Throwable unused6) {
                    it = it2;
                }
            }
            boolean zBooleanValue2 = ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{obj3, obj}, getCieXyz.write())).booleanValue();
            list2 = dce.TfN;
            if (list2 != null) {
                numValueOf = Integer.valueOf(list2.size());
            } else {
                numValueOf = set;
            }
            list3 = dce.x;
            if (list3 != null) {
                numValueOf2 = Integer.valueOf(list3.size());
            } else {
                numValueOf2 = set;
            }
            list4 = dce.hIl;
            if (list4 != null) {
                numValueOf3 = Integer.valueOf(list4.size());
            } else {
                numValueOf3 = set;
            }
            String str10 = dce.VLD;
            str2 = dce.iaH;
            if (str2 != null) {
                this.N.getClass();
                lBGx = FW.BGx(str2);
            } else {
                lBGx = set;
            }
            arrayList.add(new mM(null, str3, Boolean.valueOf(zEquals), Boolean.valueOf(zBooleanValue2), Boolean.valueOf(z6), Boolean.valueOf(z), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(zBGx), Boolean.valueOf(z2), Boolean.valueOf(z3), setR8lambda54BeH8ZsBru0CXI2CCSP2syNys, num, str, dce.JR, numValueOf, numValueOf2, numValueOf3, lBGx, str10));
            set2 = set;
            it2 = it;
            listMbG = list;
        }
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        int size = arrayList.size();
        while (i < size) {
            Object obj4 = arrayList.get(i);
            i++;
            mM mMVar = (mM) obj4;
            int i2 = !((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) W4i.CF.MediaSessionCompatResultReceiverWrapper(), mMVar.e}, getCieXyz.write())).booleanValue() ? 1 : 0;
            Boolean bool = mMVar.hIl;
            Boolean bool2 = Boolean.TRUE;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool, bool2}, getCieXyz.write())).booleanValue()) {
                i2 += 5;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mMVar.hs, bool2}, getCieXyz.write())).booleanValue()) {
                i2 += 7;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mMVar.VV3, bool2}, getCieXyz.write())).booleanValue()) {
                i2 += 10;
            }
            Set set3 = mMVar.S;
            if (set3 != null && set3.size() >= A1) {
                i2++;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mMVar.A1, bool2}, getCieXyz.write())).booleanValue()) {
                i2++;
            }
            Boolean bool3 = mMVar.x;
            Boolean bool4 = Boolean.FALSE;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{bool3, bool4}, getCieXyz.write())).booleanValue()) {
                i2++;
            }
            Integer num2 = mMVar.iaH;
            if (num2 != null && num2.intValue() <= VV3) {
                i2++;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mMVar.N, bool4}, getCieXyz.write())).booleanValue()) {
                i2++;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mMVar.fZl, bool2}, getCieXyz.write())).booleanValue()) {
                i2++;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mMVar.q, bool2}, getCieXyz.write())).booleanValue()) {
                i2++;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{mMVar.HQ, bool4}, getCieXyz.write())).booleanValue()) {
                i2++;
            }
            arrayList3.add(new mM(Integer.valueOf(i2), mMVar.mbG, mMVar.HQ, mMVar.N, mMVar.x, mMVar.hIl, mMVar.hs, mMVar.VV3, mMVar.A1, mMVar.q, mMVar.fZl, mMVar.S, mMVar.iaH, mMVar.e, mMVar.VLD, mMVar.TfN, mMVar.OV7, mMVar.JR, mMVar.j, mMVar.n));
        }
        return new tQZ(arrayList3, Boolean.valueOf(vzpVarBGx.BGx(fZl)));
    }

    public Q9(YZr yZr, d0 d0Var, N n, FW fw, KWh kWh) {
        this.BGx = yZr;
        this.mbG = d0Var;
        this.HQ = n;
        this.N = fw;
        this.hIl = new mAX(kWh, q);
    }

    public final Long BGx(List list) {
        Long l = this.x;
        if (l != null) {
            return l;
        }
        ArrayList arrayList = new ArrayList(list);
        int i = 0;
        BrazeContentCardsManagerCompanion.write(arrayList, new Q9$$ExternalSyntheticLambda0(0, Njs.BGx));
        int size = arrayList.size();
        int i2 = 0;
        long j = -1;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dCe dce = (dCe) obj;
            if (j == -1) {
                j = dce.HQ;
            } else if (j != dce.HQ || i2 >= 2) {
                break;
            }
            i2++;
        }
        long jValueOf = i2 > 1 ? Long.valueOf(j) : -1L;
        this.x = jValueOf;
        return jValueOf;
    }

    public static final int BGx(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0, Object obj, Object obj2) {
        return ((Number) r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(obj, obj2)).intValue();
    }
}
