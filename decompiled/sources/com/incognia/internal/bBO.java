package com.incognia.internal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import o.accessgetInstancedelegatecp;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isItemDismissable;
import o.onViewDetachedFromWindowlambda1;
import o.setCarryoverInAppMessage;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class bBO {
    public final NvL BGx;
    public final YZr HQ;
    public final TD N;
    public final ICj mbG;
    public static final String x = (String) W4i.TZv.MediaSessionCompatResultReceiverWrapper();
    public static final String hIl = (String) W4i.sb.MediaSessionCompatResultReceiverWrapper();
    public static final String hs = (String) W4i.II.MediaSessionCompatResultReceiverWrapper();
    public static final String VV3 = (String) W4i.Sp.MediaSessionCompatResultReceiverWrapper();

    /* JADX WARN: Code duplicated, block: B:101:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:114:0x020d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0210  */
    /* JADX WARN: Code duplicated, block: B:118:0x0220  */
    /* JADX WARN: Code duplicated, block: B:119:0x0225  */
    /* JADX WARN: Code duplicated, block: B:121:0x0229  */
    /* JADX WARN: Code duplicated, block: B:122:0x0234  */
    /* JADX WARN: Code duplicated, block: B:124:0x023a  */
    /* JADX WARN: Code duplicated, block: B:125:0x023f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0248  */
    /* JADX WARN: Code duplicated, block: B:130:0x0256  */
    /* JADX WARN: Code duplicated, block: B:132:0x025b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0267  */
    /* JADX WARN: Code duplicated, block: B:135:0x026c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0277  */
    /* JADX WARN: Code duplicated, block: B:138:0x027a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0285  */
    /* JADX WARN: Code duplicated, block: B:143:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:147:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:154:0x02e4 A[Catch: all -> 0x02ed, TRY_LEAVE, TryCatch #5 {all -> 0x02ed, blocks: (B:152:0x02d9, B:154:0x02e4), top: B:184:0x02d9 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:170:0x0313  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cd A[PHI: r8 r12
  0x01cd: PHI (r8v16 boolean) = (r8v7 boolean), (r8v17 boolean) binds: [B:93:0x01c6, B:95:0x01c9] A[DONT_GENERATE, DONT_INLINE]
  0x01cd: PHI (r12v16 boolean) = (r12v6 boolean), (r12v17 boolean) binds: [B:93:0x01c6, B:95:0x01c9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d4  */
    public final ArrayList BGx() {
        ArrayList arrayList;
        boolean z;
        boolean z2;
        Object isitemdismissable;
        String id;
        RT rt;
        String str;
        int i;
        boolean z3;
        String str2;
        Long lValueOf;
        String str3;
        int i2;
        String str4;
        String str5;
        String str6;
        String str7;
        Boolean bool;
        RVY rvy;
        RT rt2;
        RVY rvy2;
        Boolean bool2;
        Object isitemdismissable2;
        q2 q2Var;
        String str8;
        Date date;
        RVY rvy3;
        N4A n4aBGx = this.mbG.BGx();
        dCe dceMbG = this.HQ.mbG();
        TD td = this.N;
        ArrayList arrayList2 = new ArrayList();
        if (((JSONObject) this.BGx.BGx.get()).optBoolean(x, true)) {
            eN eNVar = eN.HQ;
            arrayList2.add(6);
        }
        if (((JSONObject) this.BGx.BGx.get()).optBoolean(hIl, true)) {
            IW5 iw5 = IW5.HQ;
            arrayList2.add(5);
        }
        if (((JSONObject) this.BGx.BGx.get()).optBoolean(hs, true)) {
            q6i q6iVar = q6i.HQ;
            arrayList2.add(4);
        }
        if (((JSONObject) this.BGx.BGx.get()).optBoolean(VV3, true)) {
            TQy tQy = TQy.HQ;
            arrayList2.add(7);
        }
        ArrayList arrayListBGx = td.BGx.BGx();
        mP mPVar = Ay.BGx;
        Long lN = mPVar.N(td.mbG);
        long jLongValue = lN != null ? lN.longValue() : 0L;
        Long lN2 = mPVar.N(td.mbG);
        long jLongValue2 = lN2 != null ? lN2.longValue() : 0L;
        int i3 = 10;
        if (arrayListBGx != null) {
            arrayList = new ArrayList();
            int size = arrayListBGx.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListBGx.get(i4);
                i4++;
                GgU ggU = (GgU) obj;
                int i5 = size;
                long j = ggU.x;
                if (j > jLongValue2) {
                    jLongValue2 = j;
                }
                if (j > jLongValue) {
                    onViewDetachedFromWindowlambda1 onviewdetachedfromwindowlambda1 = ZG7.mbG;
                    int i6 = ggU.HQ;
                    List list = (List) ZG7.mbG.MediaSessionCompatResultReceiverWrapper();
                    ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list, i3));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(Integer.valueOf(((ZG7) it.next()).BGx));
                    }
                    if (arrayList3.contains(Integer.valueOf(i6)) && arrayList2.contains(Integer.valueOf(ggU.HQ))) {
                        arrayList.add(obj);
                    }
                }
                size = i5;
                i3 = 10;
            }
        } else {
            arrayList = null;
        }
        Ay.BGx.BGx(td.mbG, Long.valueOf(jLongValue2));
        Iterable iterable = arrayList;
        if (arrayList == null) {
            iterable = instance_delegatelambda0.write;
        }
        ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            GgU ggU2 = (GgU) it2.next();
            long j2 = ggU2.x;
            RT rt3 = ggU2.q;
            if (rt3 != null) {
                try {
                    String str9 = rt3.N;
                    String strIconCompatParcelizer = str9 != null ? hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(5, str9) : null;
                    if (strIconCompatParcelizer == null) {
                        strIconCompatParcelizer = "";
                    }
                    if (strIconCompatParcelizer.length() < 3) {
                        z = true;
                    } else {
                        z = true;
                        try {
                            try {
                                Integer numMediaSessionCompatQueueItem = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, strIconCompatParcelizer.substring(1, 3));
                                if (numMediaSessionCompatQueueItem != null && numMediaSessionCompatQueueItem.intValue() <= 14) {
                                    StringBuilder sb = new StringBuilder("Etc/GMT");
                                    z2 = false;
                                    try {
                                        sb.append(strIconCompatParcelizer.charAt(0) == '-' ? "+" : "-");
                                        sb.append(numMediaSessionCompatQueueItem);
                                        isitemdismissable = sb.toString();
                                    } catch (Throwable th) {
                                        th = th;
                                        isitemdismissable = new isItemDismissable(th);
                                    }
                                    if (isitemdismissable instanceof isItemDismissable) {
                                        isitemdismissable = null;
                                    }
                                    id = (String) isitemdismissable;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z2 = false;
                                isitemdismissable = new isItemDismissable(th);
                                if (isitemdismissable instanceof isItemDismissable) {
                                    isitemdismissable = null;
                                }
                                id = (String) isitemdismissable;
                                if (id == null) {
                                    rvy3 = ggU2.fZl;
                                    if (rvy3 != null) {
                                        id = rvy3.HQ;
                                    } else {
                                        id = null;
                                    }
                                    if (id == null) {
                                        id = TimeZone.getDefault().getID();
                                    }
                                }
                                String str10 = id;
                                rt = ggU2.q;
                                String str11 = rt != null ? (String) W4i.rvm.MediaSessionCompatResultReceiverWrapper() : (String) W4i.rvm.MediaSessionCompatResultReceiverWrapper();
                                String str12 = str11;
                                str = ggU2.A1;
                                if (str == null) {
                                    str = (String) W4i.Fvj.MediaSessionCompatResultReceiverWrapper();
                                }
                                String str13 = str;
                                i = ggU2.HQ;
                                TQy tQy2 = TQy.HQ;
                                if (i != 7) {
                                    z3 = z;
                                } else {
                                    z3 = z2;
                                }
                                String str14 = n4aBGx.BGx;
                                String str15 = n4aBGx.HQ;
                                String str16 = n4aBGx.N;
                                String str17 = n4aBGx.x;
                                String str18 = n4aBGx.hIl;
                                int i7 = n4aBGx.hs;
                                if (dceMbG != null) {
                                    str2 = dceMbG.q;
                                } else {
                                    str2 = null;
                                }
                                if (dceMbG != null) {
                                    lValueOf = Long.valueOf(dceMbG.BGx);
                                } else {
                                    lValueOf = null;
                                }
                                if (dceMbG != null) {
                                    str3 = dceMbG.fZl;
                                } else {
                                    str3 = null;
                                }
                                i2 = ggU2.HQ;
                                q6i q6iVar2 = q6i.HQ;
                                if (i2 == 4) {
                                    hPq hpq = hPq.BGx;
                                    str6 = (String) W4i.YP.MediaSessionCompatResultReceiverWrapper();
                                } else {
                                    IW5 iw6 = IW5.HQ;
                                    if (i2 == 5) {
                                        crf crfVar = crf.BGx;
                                        str6 = (String) W4i.PGh.MediaSessionCompatResultReceiverWrapper();
                                    } else {
                                        eN eNVar2 = eN.HQ;
                                        if (i2 == 6) {
                                            IrE irE = IrE.BGx;
                                            str6 = (String) W4i.KN.MediaSessionCompatResultReceiverWrapper();
                                        } else {
                                            if (i2 == 7) {
                                                EaI eaI = EaI.BGx;
                                                str4 = (String) W4i.SN.MediaSessionCompatResultReceiverWrapper();
                                            } else {
                                                FOc fOc = FOc.BGx;
                                                str4 = (String) W4i.rO.MediaSessionCompatResultReceiverWrapper();
                                            }
                                            str5 = str4;
                                        }
                                        long j3 = ggU2.BGx;
                                        long j4 = ggU2.mbG;
                                        N4A n4a = n4aBGx;
                                        int i8 = ggU2.HQ;
                                        dCe dce = dceMbG;
                                        int i9 = ggU2.N;
                                        long j5 = ggU2.x;
                                        Iterator it3 = it2;
                                        String str19 = ggU2.hIl;
                                        ArrayList arrayList5 = arrayList4;
                                        str7 = ggU2.hs;
                                        bool = ggU2.VV3;
                                        rvy = ggU2.fZl;
                                        rt2 = ggU2.q;
                                        if (rt2 == null) {
                                            str7 = str7;
                                            rvy2 = rvy;
                                            bool2 = bool;
                                            q2Var = null;
                                        } else {
                                            Long l = rt2.BGx;
                                            String str20 = rt2.mbG;
                                            try {
                                                str8 = rt2.N;
                                                if (str8 != null) {
                                                    rvy2 = rvy;
                                                    try {
                                                        bool2 = bool;
                                                        try {
                                                            str7 = str7;
                                                            try {
                                                                date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSSZ", Locale.US).parse(str8);
                                                                if (date != null) {
                                                                    isitemdismissable2 = Long.valueOf(date.getTime());
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                isitemdismissable2 = new isItemDismissable(th);
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            str7 = str7;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        bool2 = bool;
                                                        isitemdismissable2 = new isItemDismissable(th);
                                                        if (isitemdismissable2 instanceof isItemDismissable) {
                                                            isitemdismissable2 = null;
                                                        }
                                                        q2Var = new q2(l, str20, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                                                        arrayList4 = arrayList5;
                                                        arrayList4.add(new ZBu(j2, str10, 71002, str12, str13, true, z3, str14, str15, str16, str17, str18, String.valueOf(i7), str2, lValueOf, str3, 1782495653481L, str5, new AOX(j3, j4, i8, i9, j5, str19, str7, bool2, rvy2, q2Var)));
                                                        n4aBGx = n4a;
                                                        dceMbG = dce;
                                                        it2 = it3;
                                                    }
                                                    if (isitemdismissable2 instanceof isItemDismissable) {
                                                        isitemdismissable2 = null;
                                                    }
                                                    q2Var = new q2(l, str20, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                                                } else {
                                                    str7 = str7;
                                                    rvy2 = rvy;
                                                    bool2 = bool;
                                                }
                                                isitemdismissable2 = null;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                rvy2 = rvy;
                                            }
                                            if (isitemdismissable2 instanceof isItemDismissable) {
                                                isitemdismissable2 = null;
                                            }
                                            q2Var = new q2(l, str20, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                                        }
                                        arrayList4 = arrayList5;
                                        arrayList4.add(new ZBu(j2, str10, 71002, str12, str13, true, z3, str14, str15, str16, str17, str18, String.valueOf(i7), str2, lValueOf, str3, 1782495653481L, str5, new AOX(j3, j4, i8, i9, j5, str19, str7, bool2, rvy2, q2Var)));
                                        n4aBGx = n4a;
                                        dceMbG = dce;
                                        it2 = it3;
                                    }
                                }
                                str5 = str6;
                                long j6 = ggU2.BGx;
                                long j7 = ggU2.mbG;
                                N4A n4a2 = n4aBGx;
                                int i10 = ggU2.HQ;
                                dCe dce2 = dceMbG;
                                int i11 = ggU2.N;
                                long j8 = ggU2.x;
                                Iterator it4 = it2;
                                String str110 = ggU2.hIl;
                                ArrayList arrayList6 = arrayList4;
                                str7 = ggU2.hs;
                                bool = ggU2.VV3;
                                rvy = ggU2.fZl;
                                rt2 = ggU2.q;
                                if (rt2 == null) {
                                    str7 = str7;
                                    rvy2 = rvy;
                                    bool2 = bool;
                                    q2Var = null;
                                } else {
                                    Long l2 = rt2.BGx;
                                    String str21 = rt2.mbG;
                                    str8 = rt2.N;
                                    if (str8 != null) {
                                        rvy2 = rvy;
                                        bool2 = bool;
                                        str7 = str7;
                                        date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSSZ", Locale.US).parse(str8);
                                        if (date != null) {
                                            isitemdismissable2 = Long.valueOf(date.getTime());
                                        }
                                        if (isitemdismissable2 instanceof isItemDismissable) {
                                            isitemdismissable2 = null;
                                        }
                                        q2Var = new q2(l2, str21, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                                    } else {
                                        str7 = str7;
                                        rvy2 = rvy;
                                        bool2 = bool;
                                    }
                                    isitemdismissable2 = null;
                                    if (isitemdismissable2 instanceof isItemDismissable) {
                                        isitemdismissable2 = null;
                                    }
                                    q2Var = new q2(l2, str21, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                                }
                                arrayList4 = arrayList6;
                                arrayList4.add(new ZBu(j2, str10, 71002, str12, str13, true, z3, str14, str15, str16, str17, str18, String.valueOf(i7), str2, lValueOf, str3, 1782495653481L, str5, new AOX(j6, j7, i10, i11, j8, str110, str7, bool2, rvy2, q2Var)));
                                n4aBGx = n4a2;
                                dceMbG = dce2;
                                it2 = it4;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            z2 = false;
                            isitemdismissable = new isItemDismissable(th);
                            if (isitemdismissable instanceof isItemDismissable) {
                                isitemdismissable = null;
                            }
                            id = (String) isitemdismissable;
                            if (id == null) {
                                rvy3 = ggU2.fZl;
                                if (rvy3 != null) {
                                    id = rvy3.HQ;
                                } else {
                                    id = null;
                                }
                                if (id == null) {
                                    id = TimeZone.getDefault().getID();
                                }
                            }
                            String str111 = id;
                            rt = ggU2.q;
                            if (rt != null) {
                            }
                            String str112 = str11;
                            str = ggU2.A1;
                            if (str == null) {
                                str = (String) W4i.Fvj.MediaSessionCompatResultReceiverWrapper();
                            }
                            String str113 = str;
                            i = ggU2.HQ;
                            TQy tQy3 = TQy.HQ;
                            if (i != 7) {
                                z3 = z;
                            } else {
                                z3 = z2;
                            }
                            String str114 = n4aBGx.BGx;
                            String str115 = n4aBGx.HQ;
                            String str116 = n4aBGx.N;
                            String str117 = n4aBGx.x;
                            String str118 = n4aBGx.hIl;
                            int i12 = n4aBGx.hs;
                            if (dceMbG != null) {
                                str2 = dceMbG.q;
                            } else {
                                str2 = null;
                            }
                            if (dceMbG != null) {
                                lValueOf = Long.valueOf(dceMbG.BGx);
                            } else {
                                lValueOf = null;
                            }
                            if (dceMbG != null) {
                                str3 = dceMbG.fZl;
                            } else {
                                str3 = null;
                            }
                            i2 = ggU2.HQ;
                            q6i q6iVar3 = q6i.HQ;
                            if (i2 == 4) {
                                hPq hpq2 = hPq.BGx;
                                str6 = (String) W4i.YP.MediaSessionCompatResultReceiverWrapper();
                            } else {
                                IW5 iw7 = IW5.HQ;
                                if (i2 == 5) {
                                    crf crfVar2 = crf.BGx;
                                    str6 = (String) W4i.PGh.MediaSessionCompatResultReceiverWrapper();
                                } else {
                                    eN eNVar3 = eN.HQ;
                                    if (i2 == 6) {
                                        IrE irE2 = IrE.BGx;
                                        str6 = (String) W4i.KN.MediaSessionCompatResultReceiverWrapper();
                                    } else {
                                        if (i2 == 7) {
                                            EaI eaI2 = EaI.BGx;
                                            str4 = (String) W4i.SN.MediaSessionCompatResultReceiverWrapper();
                                        } else {
                                            FOc fOc2 = FOc.BGx;
                                            str4 = (String) W4i.rO.MediaSessionCompatResultReceiverWrapper();
                                        }
                                        str5 = str4;
                                    }
                                    long j9 = ggU2.BGx;
                                    long j10 = ggU2.mbG;
                                    N4A n4a3 = n4aBGx;
                                    int i13 = ggU2.HQ;
                                    dCe dce3 = dceMbG;
                                    int i14 = ggU2.N;
                                    long j11 = ggU2.x;
                                    Iterator it5 = it2;
                                    String str119 = ggU2.hIl;
                                    ArrayList arrayList7 = arrayList4;
                                    str7 = ggU2.hs;
                                    bool = ggU2.VV3;
                                    rvy = ggU2.fZl;
                                    rt2 = ggU2.q;
                                    if (rt2 == null) {
                                        str7 = str7;
                                        rvy2 = rvy;
                                        bool2 = bool;
                                        q2Var = null;
                                    } else {
                                        Long l3 = rt2.BGx;
                                        String str22 = rt2.mbG;
                                        str8 = rt2.N;
                                        if (str8 != null) {
                                            rvy2 = rvy;
                                            bool2 = bool;
                                            str7 = str7;
                                            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSSZ", Locale.US).parse(str8);
                                            if (date != null) {
                                                isitemdismissable2 = Long.valueOf(date.getTime());
                                            }
                                            if (isitemdismissable2 instanceof isItemDismissable) {
                                                isitemdismissable2 = null;
                                            }
                                            q2Var = new q2(l3, str22, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                                        } else {
                                            str7 = str7;
                                            rvy2 = rvy;
                                            bool2 = bool;
                                        }
                                        isitemdismissable2 = null;
                                        if (isitemdismissable2 instanceof isItemDismissable) {
                                            isitemdismissable2 = null;
                                        }
                                        q2Var = new q2(l3, str22, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                                    }
                                    arrayList4 = arrayList7;
                                    arrayList4.add(new ZBu(j2, str111, 71002, str112, str113, true, z3, str114, str115, str116, str117, str118, String.valueOf(i12), str2, lValueOf, str3, 1782495653481L, str5, new AOX(j9, j10, i13, i14, j11, str119, str7, bool2, rvy2, q2Var)));
                                    n4aBGx = n4a3;
                                    dceMbG = dce3;
                                    it2 = it5;
                                }
                            }
                            str5 = str6;
                            long j12 = ggU2.BGx;
                            long j13 = ggU2.mbG;
                            N4A n4a4 = n4aBGx;
                            int i15 = ggU2.HQ;
                            dCe dce4 = dceMbG;
                            int i16 = ggU2.N;
                            long j14 = ggU2.x;
                            Iterator it6 = it2;
                            String str1110 = ggU2.hIl;
                            ArrayList arrayList8 = arrayList4;
                            str7 = ggU2.hs;
                            bool = ggU2.VV3;
                            rvy = ggU2.fZl;
                            rt2 = ggU2.q;
                            if (rt2 == null) {
                                str7 = str7;
                                rvy2 = rvy;
                                bool2 = bool;
                                q2Var = null;
                            } else {
                                Long l4 = rt2.BGx;
                                String str23 = rt2.mbG;
                                str8 = rt2.N;
                                if (str8 != null) {
                                    rvy2 = rvy;
                                    bool2 = bool;
                                    str7 = str7;
                                    date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSSZ", Locale.US).parse(str8);
                                    if (date != null) {
                                        isitemdismissable2 = Long.valueOf(date.getTime());
                                    }
                                    if (isitemdismissable2 instanceof isItemDismissable) {
                                        isitemdismissable2 = null;
                                    }
                                    q2Var = new q2(l4, str23, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                                } else {
                                    str7 = str7;
                                    rvy2 = rvy;
                                    bool2 = bool;
                                }
                                isitemdismissable2 = null;
                                if (isitemdismissable2 instanceof isItemDismissable) {
                                    isitemdismissable2 = null;
                                }
                                q2Var = new q2(l4, str23, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                            }
                            arrayList4 = arrayList8;
                            arrayList4.add(new ZBu(j2, str111, 71002, str112, str113, true, z3, str114, str115, str116, str117, str118, String.valueOf(i12), str2, lValueOf, str3, 1782495653481L, str5, new AOX(j12, j13, i15, i16, j14, str1110, str7, bool2, rvy2, q2Var)));
                            n4aBGx = n4a4;
                            dceMbG = dce4;
                            it2 = it6;
                        }
                        if (id == null) {
                        }
                        String str1111 = id;
                        rt = ggU2.q;
                        if ((rt != null || (str11 = rt.S) == null) && (str11 = ggU2.hIl) == null) {
                        }
                        String str1112 = str11;
                        str = ggU2.A1;
                        if (str == null) {
                            str = (String) W4i.Fvj.MediaSessionCompatResultReceiverWrapper();
                        }
                        String str1113 = str;
                        i = ggU2.HQ;
                        TQy tQy4 = TQy.HQ;
                        if (i != 7) {
                            z3 = z;
                        } else {
                            z3 = z2;
                        }
                        String str1114 = n4aBGx.BGx;
                        String str1115 = n4aBGx.HQ;
                        String str1116 = n4aBGx.N;
                        String str1117 = n4aBGx.x;
                        String str1118 = n4aBGx.hIl;
                        int i17 = n4aBGx.hs;
                        if (dceMbG != null) {
                            str2 = dceMbG.q;
                        } else {
                            str2 = null;
                        }
                        if (dceMbG != null) {
                            lValueOf = Long.valueOf(dceMbG.BGx);
                        } else {
                            lValueOf = null;
                        }
                        if (dceMbG != null) {
                            str3 = dceMbG.fZl;
                        } else {
                            str3 = null;
                        }
                        i2 = ggU2.HQ;
                        q6i q6iVar4 = q6i.HQ;
                        if (i2 == 4) {
                            hPq hpq3 = hPq.BGx;
                            str6 = (String) W4i.YP.MediaSessionCompatResultReceiverWrapper();
                        } else {
                            IW5 iw8 = IW5.HQ;
                            if (i2 == 5) {
                                crf crfVar3 = crf.BGx;
                                str6 = (String) W4i.PGh.MediaSessionCompatResultReceiverWrapper();
                            } else {
                                eN eNVar4 = eN.HQ;
                                if (i2 == 6) {
                                    IrE irE3 = IrE.BGx;
                                    str6 = (String) W4i.KN.MediaSessionCompatResultReceiverWrapper();
                                } else {
                                    if (i2 == 7) {
                                        EaI eaI3 = EaI.BGx;
                                        str4 = (String) W4i.SN.MediaSessionCompatResultReceiverWrapper();
                                    } else {
                                        FOc fOc3 = FOc.BGx;
                                        str4 = (String) W4i.rO.MediaSessionCompatResultReceiverWrapper();
                                    }
                                    str5 = str4;
                                }
                                long j15 = ggU2.BGx;
                                long j16 = ggU2.mbG;
                                N4A n4a5 = n4aBGx;
                                int i18 = ggU2.HQ;
                                dCe dce5 = dceMbG;
                                int i19 = ggU2.N;
                                long j17 = ggU2.x;
                                Iterator it7 = it2;
                                String str1119 = ggU2.hIl;
                                ArrayList arrayList9 = arrayList4;
                                str7 = ggU2.hs;
                                bool = ggU2.VV3;
                                rvy = ggU2.fZl;
                                rt2 = ggU2.q;
                                if (rt2 == null) {
                                    str7 = str7;
                                    rvy2 = rvy;
                                    bool2 = bool;
                                    q2Var = null;
                                } else {
                                    Long l5 = rt2.BGx;
                                    String str24 = rt2.mbG;
                                    str8 = rt2.N;
                                    if (str8 != null) {
                                        rvy2 = rvy;
                                        bool2 = bool;
                                        str7 = str7;
                                        date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSSZ", Locale.US).parse(str8);
                                        if (date != null) {
                                            isitemdismissable2 = Long.valueOf(date.getTime());
                                        }
                                        if (isitemdismissable2 instanceof isItemDismissable) {
                                            isitemdismissable2 = null;
                                        }
                                        q2Var = new q2(l5, str24, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                                    } else {
                                        str7 = str7;
                                        rvy2 = rvy;
                                        bool2 = bool;
                                    }
                                    isitemdismissable2 = null;
                                    if (isitemdismissable2 instanceof isItemDismissable) {
                                        isitemdismissable2 = null;
                                    }
                                    q2Var = new q2(l5, str24, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                                }
                                arrayList4 = arrayList9;
                                arrayList4.add(new ZBu(j2, str1111, 71002, str1112, str1113, true, z3, str1114, str1115, str1116, str1117, str1118, String.valueOf(i17), str2, lValueOf, str3, 1782495653481L, str5, new AOX(j15, j16, i18, i19, j17, str1119, str7, bool2, rvy2, q2Var)));
                                n4aBGx = n4a5;
                                dceMbG = dce5;
                                it2 = it7;
                            }
                        }
                        str5 = str6;
                        long j18 = ggU2.BGx;
                        long j19 = ggU2.mbG;
                        N4A n4a6 = n4aBGx;
                        int i110 = ggU2.HQ;
                        dCe dce6 = dceMbG;
                        int i111 = ggU2.N;
                        long j110 = ggU2.x;
                        Iterator it8 = it2;
                        String str11110 = ggU2.hIl;
                        ArrayList arrayList10 = arrayList4;
                        str7 = ggU2.hs;
                        bool = ggU2.VV3;
                        rvy = ggU2.fZl;
                        rt2 = ggU2.q;
                        if (rt2 == null) {
                            str7 = str7;
                            rvy2 = rvy;
                            bool2 = bool;
                            q2Var = null;
                        } else {
                            Long l6 = rt2.BGx;
                            String str25 = rt2.mbG;
                            str8 = rt2.N;
                            if (str8 != null) {
                                rvy2 = rvy;
                                bool2 = bool;
                                str7 = str7;
                                date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSSZ", Locale.US).parse(str8);
                                if (date != null) {
                                    isitemdismissable2 = Long.valueOf(date.getTime());
                                }
                                if (isitemdismissable2 instanceof isItemDismissable) {
                                    isitemdismissable2 = null;
                                }
                                q2Var = new q2(l6, str25, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                            } else {
                                str7 = str7;
                                rvy2 = rvy;
                                bool2 = bool;
                            }
                            isitemdismissable2 = null;
                            if (isitemdismissable2 instanceof isItemDismissable) {
                                isitemdismissable2 = null;
                            }
                            q2Var = new q2(l6, str25, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                        }
                        arrayList4 = arrayList10;
                        arrayList4.add(new ZBu(j2, str1111, 71002, str1112, str1113, true, z3, str1114, str1115, str1116, str1117, str1118, String.valueOf(i17), str2, lValueOf, str3, 1782495653481L, str5, new AOX(j18, j19, i110, i111, j110, str11110, str7, bool2, rvy2, q2Var)));
                        n4aBGx = n4a6;
                        dceMbG = dce6;
                        it2 = it8;
                    }
                    z2 = false;
                    id = null;
                } catch (Throwable th8) {
                    th = th8;
                    z = true;
                }
                if (id == null) {
                }
                String str11111 = id;
                rt = ggU2.q;
                if (rt != null) {
                }
                String str11112 = str11;
                str = ggU2.A1;
                if (str == null) {
                    str = (String) W4i.Fvj.MediaSessionCompatResultReceiverWrapper();
                }
                String str11113 = str;
                i = ggU2.HQ;
                TQy tQy5 = TQy.HQ;
                if (i != 7) {
                    z3 = z;
                } else {
                    z3 = z2;
                }
                String str11114 = n4aBGx.BGx;
                String str11115 = n4aBGx.HQ;
                String str11116 = n4aBGx.N;
                String str11117 = n4aBGx.x;
                String str11118 = n4aBGx.hIl;
                int i112 = n4aBGx.hs;
                if (dceMbG != null) {
                    str2 = dceMbG.q;
                } else {
                    str2 = null;
                }
                if (dceMbG != null) {
                    lValueOf = Long.valueOf(dceMbG.BGx);
                } else {
                    lValueOf = null;
                }
                if (dceMbG != null) {
                    str3 = dceMbG.fZl;
                } else {
                    str3 = null;
                }
                i2 = ggU2.HQ;
                q6i q6iVar5 = q6i.HQ;
                if (i2 == 4) {
                    hPq hpq4 = hPq.BGx;
                    str6 = (String) W4i.YP.MediaSessionCompatResultReceiverWrapper();
                } else {
                    IW5 iw9 = IW5.HQ;
                    if (i2 == 5) {
                        crf crfVar4 = crf.BGx;
                        str6 = (String) W4i.PGh.MediaSessionCompatResultReceiverWrapper();
                    } else {
                        eN eNVar5 = eN.HQ;
                        if (i2 == 6) {
                            IrE irE4 = IrE.BGx;
                            str6 = (String) W4i.KN.MediaSessionCompatResultReceiverWrapper();
                        } else {
                            if (i2 == 7) {
                                EaI eaI4 = EaI.BGx;
                                str4 = (String) W4i.SN.MediaSessionCompatResultReceiverWrapper();
                            } else {
                                FOc fOc4 = FOc.BGx;
                                str4 = (String) W4i.rO.MediaSessionCompatResultReceiverWrapper();
                            }
                            str5 = str4;
                        }
                        long j111 = ggU2.BGx;
                        long j112 = ggU2.mbG;
                        N4A n4a7 = n4aBGx;
                        int i113 = ggU2.HQ;
                        dCe dce7 = dceMbG;
                        int i114 = ggU2.N;
                        long j113 = ggU2.x;
                        Iterator it9 = it2;
                        String str11119 = ggU2.hIl;
                        ArrayList arrayList11 = arrayList4;
                        str7 = ggU2.hs;
                        bool = ggU2.VV3;
                        rvy = ggU2.fZl;
                        rt2 = ggU2.q;
                        if (rt2 == null) {
                            str7 = str7;
                            rvy2 = rvy;
                            bool2 = bool;
                            q2Var = null;
                        } else {
                            Long l7 = rt2.BGx;
                            String str26 = rt2.mbG;
                            str8 = rt2.N;
                            if (str8 != null) {
                                rvy2 = rvy;
                                bool2 = bool;
                                str7 = str7;
                                date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSSZ", Locale.US).parse(str8);
                                if (date != null) {
                                    isitemdismissable2 = Long.valueOf(date.getTime());
                                }
                                if (isitemdismissable2 instanceof isItemDismissable) {
                                    isitemdismissable2 = null;
                                }
                                q2Var = new q2(l7, str26, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                            } else {
                                str7 = str7;
                                rvy2 = rvy;
                                bool2 = bool;
                            }
                            isitemdismissable2 = null;
                            if (isitemdismissable2 instanceof isItemDismissable) {
                                isitemdismissable2 = null;
                            }
                            q2Var = new q2(l7, str26, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                        }
                        arrayList4 = arrayList11;
                        arrayList4.add(new ZBu(j2, str11111, 71002, str11112, str11113, true, z3, str11114, str11115, str11116, str11117, str11118, String.valueOf(i112), str2, lValueOf, str3, 1782495653481L, str5, new AOX(j111, j112, i113, i114, j113, str11119, str7, bool2, rvy2, q2Var)));
                        n4aBGx = n4a7;
                        dceMbG = dce7;
                        it2 = it9;
                    }
                }
                str5 = str6;
                long j114 = ggU2.BGx;
                long j115 = ggU2.mbG;
                N4A n4a8 = n4aBGx;
                int i115 = ggU2.HQ;
                dCe dce8 = dceMbG;
                int i116 = ggU2.N;
                long j116 = ggU2.x;
                Iterator it10 = it2;
                String str111110 = ggU2.hIl;
                ArrayList arrayList12 = arrayList4;
                str7 = ggU2.hs;
                bool = ggU2.VV3;
                rvy = ggU2.fZl;
                rt2 = ggU2.q;
                if (rt2 == null) {
                    str7 = str7;
                    rvy2 = rvy;
                    bool2 = bool;
                    q2Var = null;
                } else {
                    Long l8 = rt2.BGx;
                    String str27 = rt2.mbG;
                    str8 = rt2.N;
                    if (str8 != null) {
                        rvy2 = rvy;
                        bool2 = bool;
                        str7 = str7;
                        date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSSZ", Locale.US).parse(str8);
                        if (date != null) {
                            isitemdismissable2 = Long.valueOf(date.getTime());
                        }
                        if (isitemdismissable2 instanceof isItemDismissable) {
                            isitemdismissable2 = null;
                        }
                        q2Var = new q2(l8, str27, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                    } else {
                        str7 = str7;
                        rvy2 = rvy;
                        bool2 = bool;
                    }
                    isitemdismissable2 = null;
                    if (isitemdismissable2 instanceof isItemDismissable) {
                        isitemdismissable2 = null;
                    }
                    q2Var = new q2(l8, str27, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                }
                arrayList4 = arrayList12;
                arrayList4.add(new ZBu(j2, str11111, 71002, str11112, str11113, true, z3, str11114, str11115, str11116, str11117, str11118, String.valueOf(i112), str2, lValueOf, str3, 1782495653481L, str5, new AOX(j114, j115, i115, i116, j116, str111110, str7, bool2, rvy2, q2Var)));
                n4aBGx = n4a8;
                dceMbG = dce8;
                it2 = it10;
            } else {
                z = true;
                z2 = false;
            }
            rvy3 = ggU2.fZl;
            if (rvy3 != null) {
                id = rvy3.HQ;
            } else {
                id = null;
            }
            if (id == null) {
                id = TimeZone.getDefault().getID();
            }
            String str111111 = id;
            rt = ggU2.q;
            if (rt != null) {
            }
            String str111112 = str11;
            str = ggU2.A1;
            if (str == null) {
                str = (String) W4i.Fvj.MediaSessionCompatResultReceiverWrapper();
            }
            String str111113 = str;
            i = ggU2.HQ;
            TQy tQy6 = TQy.HQ;
            if (i != 7) {
                z3 = z;
            } else {
                z3 = z2;
            }
            String str111114 = n4aBGx.BGx;
            String str111115 = n4aBGx.HQ;
            String str111116 = n4aBGx.N;
            String str111117 = n4aBGx.x;
            String str111118 = n4aBGx.hIl;
            int i117 = n4aBGx.hs;
            if (dceMbG != null) {
                str2 = dceMbG.q;
            } else {
                str2 = null;
            }
            if (dceMbG != null) {
                lValueOf = Long.valueOf(dceMbG.BGx);
            } else {
                lValueOf = null;
            }
            if (dceMbG != null) {
                str3 = dceMbG.fZl;
            } else {
                str3 = null;
            }
            i2 = ggU2.HQ;
            q6i q6iVar6 = q6i.HQ;
            if (i2 == 4) {
                hPq hpq5 = hPq.BGx;
                str6 = (String) W4i.YP.MediaSessionCompatResultReceiverWrapper();
            } else {
                IW5 iw10 = IW5.HQ;
                if (i2 == 5) {
                    crf crfVar5 = crf.BGx;
                    str6 = (String) W4i.PGh.MediaSessionCompatResultReceiverWrapper();
                } else {
                    eN eNVar6 = eN.HQ;
                    if (i2 == 6) {
                        IrE irE5 = IrE.BGx;
                        str6 = (String) W4i.KN.MediaSessionCompatResultReceiverWrapper();
                    } else {
                        if (i2 == 7) {
                            EaI eaI5 = EaI.BGx;
                            str4 = (String) W4i.SN.MediaSessionCompatResultReceiverWrapper();
                        } else {
                            FOc fOc5 = FOc.BGx;
                            str4 = (String) W4i.rO.MediaSessionCompatResultReceiverWrapper();
                        }
                        str5 = str4;
                    }
                    long j117 = ggU2.BGx;
                    long j118 = ggU2.mbG;
                    N4A n4a9 = n4aBGx;
                    int i118 = ggU2.HQ;
                    dCe dce9 = dceMbG;
                    int i119 = ggU2.N;
                    long j119 = ggU2.x;
                    Iterator it11 = it2;
                    String str111119 = ggU2.hIl;
                    ArrayList arrayList13 = arrayList4;
                    str7 = ggU2.hs;
                    bool = ggU2.VV3;
                    rvy = ggU2.fZl;
                    rt2 = ggU2.q;
                    if (rt2 == null) {
                        str7 = str7;
                        rvy2 = rvy;
                        bool2 = bool;
                        q2Var = null;
                    } else {
                        Long l9 = rt2.BGx;
                        String str28 = rt2.mbG;
                        str8 = rt2.N;
                        if (str8 != null) {
                            rvy2 = rvy;
                            bool2 = bool;
                            str7 = str7;
                            date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSSZ", Locale.US).parse(str8);
                            if (date != null) {
                                isitemdismissable2 = Long.valueOf(date.getTime());
                            }
                            if (isitemdismissable2 instanceof isItemDismissable) {
                                isitemdismissable2 = null;
                            }
                            q2Var = new q2(l9, str28, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                        } else {
                            str7 = str7;
                            rvy2 = rvy;
                            bool2 = bool;
                        }
                        isitemdismissable2 = null;
                        if (isitemdismissable2 instanceof isItemDismissable) {
                            isitemdismissable2 = null;
                        }
                        q2Var = new q2(l9, str28, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                    }
                    arrayList4 = arrayList13;
                    arrayList4.add(new ZBu(j2, str111111, 71002, str111112, str111113, true, z3, str111114, str111115, str111116, str111117, str111118, String.valueOf(i117), str2, lValueOf, str3, 1782495653481L, str5, new AOX(j117, j118, i118, i119, j119, str111119, str7, bool2, rvy2, q2Var)));
                    n4aBGx = n4a9;
                    dceMbG = dce9;
                    it2 = it11;
                }
            }
            str5 = str6;
            long j1110 = ggU2.BGx;
            long j1111 = ggU2.mbG;
            N4A n4a10 = n4aBGx;
            int i1110 = ggU2.HQ;
            dCe dce10 = dceMbG;
            int i1111 = ggU2.N;
            long j1112 = ggU2.x;
            Iterator it12 = it2;
            String str1111110 = ggU2.hIl;
            ArrayList arrayList14 = arrayList4;
            str7 = ggU2.hs;
            bool = ggU2.VV3;
            rvy = ggU2.fZl;
            rt2 = ggU2.q;
            if (rt2 == null) {
                str7 = str7;
                rvy2 = rvy;
                bool2 = bool;
                q2Var = null;
            } else {
                Long l10 = rt2.BGx;
                String str29 = rt2.mbG;
                str8 = rt2.N;
                if (str8 != null) {
                    rvy2 = rvy;
                    bool2 = bool;
                    str7 = str7;
                    date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSSSSSZ", Locale.US).parse(str8);
                    if (date != null) {
                        isitemdismissable2 = Long.valueOf(date.getTime());
                    }
                    if (isitemdismissable2 instanceof isItemDismissable) {
                        isitemdismissable2 = null;
                    }
                    q2Var = new q2(l10, str29, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
                } else {
                    str7 = str7;
                    rvy2 = rvy;
                    bool2 = bool;
                }
                isitemdismissable2 = null;
                if (isitemdismissable2 instanceof isItemDismissable) {
                    isitemdismissable2 = null;
                }
                q2Var = new q2(l10, str29, (Long) isitemdismissable2, rt2.A1, rt2.q, rt2.fZl);
            }
            arrayList4 = arrayList14;
            arrayList4.add(new ZBu(j2, str111111, 71002, str111112, str111113, true, z3, str111114, str111115, str111116, str111117, str111118, String.valueOf(i117), str2, lValueOf, str3, 1782495653481L, str5, new AOX(j1110, j1111, i1110, i1111, j1112, str1111110, str7, bool2, rvy2, q2Var)));
            n4aBGx = n4a10;
            dceMbG = dce10;
            it2 = it12;
        }
        return arrayList4;
    }

    public bBO(NvL nvL, ICj iCj, YZr yZr, KWh kWh, TD td, huY huy) {
        this.BGx = nvL;
        this.mbG = iCj;
        this.HQ = yZr;
        this.N = td;
    }
}
