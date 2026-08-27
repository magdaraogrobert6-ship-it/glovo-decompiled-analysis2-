package com.incognia.internal;

import android.content.Context;
import android.util.Log;
import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.incognia.IncogniaOptions;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import o.ensureSubscribedToInAppMessageEvents;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class JuE {
    public static final UsU BGx = new UsU(G7.BGx, true);
    public static final AKA mbG = new AKA() { // from class: com.incognia.internal.JuE$$ExternalSyntheticLambda1
        @Override // com.incognia.internal.AKA
        public final void BGx(SjD sjD) {
            JuE.BGx(sjD);
        }
    };

    public static final void mbG() {
        HQ();
    }

    public static void HQ() throws InterruptedException {
        try {
            oV.mbG();
            List listBGx = BGx();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listBGx) {
                Object[] objArr = {((yUe) obj).N(), Yp.BGx};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                ((yUe) obj2).BGx(new vN8(countDownLatch));
            }
            countDownLatch.await();
        } catch (NullPointerException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0323 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0325  */
    /* JADX WARN: Code duplicated, block: B:114:0x032a  */
    /* JADX WARN: Code duplicated, block: B:116:0x032e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0336  */
    /* JADX WARN: Code duplicated, block: B:120:0x0345  */
    /* JADX WARN: Code duplicated, block: B:121:0x034a  */
    /* JADX WARN: Code duplicated, block: B:180:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:205:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c2 A[Catch: all -> 0x00ef, TryCatch #1 {all -> 0x00ef, blocks: (B:21:0x009e, B:23:0x00a6, B:25:0x00b3, B:26:0x00c2, B:28:0x00cc, B:30:0x00d9), top: B:188:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00cc A[Catch: all -> 0x00ef, TryCatch #1 {all -> 0x00ef, blocks: (B:21:0x009e, B:23:0x00a6, B:25:0x00b3, B:26:0x00c2, B:28:0x00cc, B:30:0x00d9), top: B:188:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d9 A[Catch: all -> 0x00ef, TRY_LEAVE, TryCatch #1 {all -> 0x00ef, blocks: (B:21:0x009e, B:23:0x00a6, B:25:0x00b3, B:26:0x00c2, B:28:0x00cc, B:30:0x00d9), top: B:188:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:39:0x014e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0174  */
    /* JADX WARN: Code duplicated, block: B:42:0x0175 A[PHI: r3
  0x0175: PHI (r3v5 com.incognia.internal.a9) = (r3v4 com.incognia.internal.a9), (r3v20 com.incognia.internal.a9) binds: [B:37:0x014b, B:41:0x0174] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0181  */
    /* JADX WARN: Code duplicated, block: B:45:0x0192  */
    /* JADX WARN: Code duplicated, block: B:47:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:82:0x021a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0221  */
    /* JADX WARN: Code duplicated, block: B:87:0x0276  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:99:0x02d9  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x01b8, please report this as an issue */
    public static void BGx(VOk vOk) {
        Long l;
        String strMbG;
        a9 a9Var;
        a9 a9Var2;
        CaO caOBGx;
        String lowerCase;
        Long lValueOf;
        int i;
        int i2;
        Long lValueOf2;
        List list;
        Object obj;
        int i3;
        List list2;
        List list3;
        Long lValueOf3;
        List list4;
        List list5;
        File fileBGx;
        File file;
        Long lValueOf4;
        Context context = uF.BGx;
        if (context == null) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Using SDK context before initialization");
            return;
        }
        VOk vOk2 = (VOk) new lqt(new k(), context, vOk).BGx.get();
        if (vOk2 == null) {
            vOk2 = new VOk((String) null, false, false, false, 0, 62);
        }
        AtomicBoolean atomicBoolean = IU.BGx;
        IU.BGx.set(vOk2.mbG);
        AtomicReference atomicReference = JY.BGx;
        JY.mbG.add(mbG);
        dCe dceMbG = new YZr(context, vOk2, new Hh(new TU(new NvL(null)))).mbG();
        UsU usU = new UsU(ST.BGx, true);
        P p = new P(context);
        tVM tvm = new tVM(context, usU);
        mP mPVar = Ay.BGx;
        String str = tVM.HQ;
        RU ruBGx = (RU) mPVar.BGx(Kje.BGx, str);
        if (ruBGx == null) {
            ruBGx = tvm.BGx();
            if (ruBGx != null) {
                mPVar.BGx(str, ruBGx, lIW.BGx);
            } else {
                ruBGx = null;
            }
        }
        if (dceMbG == null) {
            Dop dop = pNP.BGx;
            pNP.BGx((Throwable) new Cz7(), false);
            i = 0;
            obj = null;
        } else {
            long j = dceMbG.HQ;
            Integer numValueOf = ruBGx != null ? Integer.valueOf(ruBGx.mbG) : null;
            try {
                File fileBGx2 = p.BGx(Sth.mbG);
                if (fileBGx2 != null) {
                    File file2 = new File(fileBGx2, P.mbG);
                    if (file2.exists()) {
                        lValueOf4 = Long.valueOf(Long.parseLong(r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.write(file2, ensureSubscribedToInAppMessageEvents.write)));
                    } else {
                        fileBGx = p.BGx(p.BGx());
                        if (fileBGx != null) {
                            file = new File(fileBGx, P.mbG);
                            if (file.exists()) {
                                long j2 = Long.parseLong(r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.write(file, ensureSubscribedToInAppMessageEvents.write));
                                p.BGx(j2);
                                file.delete();
                                lValueOf4 = Long.valueOf(j2);
                            }
                            sSc ssc = Ay.N;
                            strMbG = ssc.mbG(tVM.N);
                            if (strMbG != null) {
                                lowerCase = strMbG;
                            } else {
                                a9 a9Var3 = new a9(tvm.BGx, tVM.q);
                                a9Var = new a9(tvm.BGx, tVM.fZl);
                                a9Var2 = new a9(tvm.BGx, tVM.S);
                                caOBGx = new GUp(a9Var, a9Var2, a9Var3).BGx();
                                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, H67.mbG}, getCieXyz.write())).booleanValue()) {
                                    String strMbG2 = a9Var.mbG(Eja.BGx, Eja.mbG);
                                    if (strMbG2 != null) {
                                    }
                                } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, k1.mbG}, getCieXyz.write())).booleanValue()) {
                                    a9Var = a9Var2;
                                    String strMbG3 = a9Var.mbG(Eja.BGx, Eja.mbG);
                                    lowerCase = strMbG3 != null ? setCarryoverInAppMessage.write(strMbG3, tVM.iaH, "").toLowerCase(Locale.getDefault()) : null;
                                } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, Sth.mbG}, getCieXyz.write())).booleanValue()) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                    return;
                                }
                                if (lowerCase == null) {
                                    lowerCase = null;
                                }
                            }
                            if (ruBGx != null) {
                                lValueOf = Long.valueOf(ruBGx.BGx);
                            } else {
                                lValueOf = null;
                            }
                            if (lValueOf != null || lValueOf.longValue() <= 0 || lValueOf.longValue() + T1.BGx >= j) {
                                i = 0;
                                if (l != null || j == l.longValue()) {
                                    if (ruBGx != null) {
                                        i2 = ruBGx.mbG;
                                    } else {
                                        i2 = 0;
                                    }
                                    if (ruBGx != null) {
                                        lValueOf2 = Long.valueOf(ruBGx.BGx);
                                    } else {
                                        lValueOf2 = null;
                                    }
                                    yH yHVar = yH.BGx;
                                    String str2 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                                    if (ruBGx != null) {
                                        list = ruBGx.HQ;
                                    } else {
                                        list = null;
                                    }
                                    T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str2, list, 8);
                                    obj = null;
                                    tvm.BGx(System.currentTimeMillis(), null, null);
                                } else {
                                    Long lValueOf5 = ruBGx != null ? Long.valueOf(ruBGx.BGx) : null;
                                    int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                                    DaL daL = DaL.BGx;
                                    T1.mbG = new Zs(Long.valueOf(j), l, lValueOf5, iIntValue, (String) W4i.lNm.MediaSessionCompatResultReceiverWrapper(), ruBGx != null ? ruBGx.HQ : null, 8);
                                    obj = null;
                                    tvm.BGx(System.currentTimeMillis(), null, null);
                                }
                            } else {
                                int iIntValue2 = (numValueOf != null ? numValueOf.intValue() : 0) + 1;
                                instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
                                if (lowerCase == null || lowerCase.length() == 0) {
                                    list5 = instance_delegatelambda0Var;
                                    i3 = 0;
                                    list3 = instance_delegatelambda0Var;
                                    if (ruBGx != null && (list2 = ruBGx.HQ) != null) {
                                    }
                                    if (ruBGx != null) {
                                        lValueOf3 = Long.valueOf(ruBGx.BGx);
                                    } else {
                                        lValueOf3 = null;
                                    }
                                    az azVar = az.BGx;
                                    i = i3;
                                    T1.mbG = new Zs(Long.valueOf(j), l, lValueOf3, lowerCase, iIntValue2, (String) W4i.qE.MediaSessionCompatResultReceiverWrapper(), list3);
                                    ssc.BGx(AUn.BGx);
                                    NDV ndv = NDV.BGx;
                                    a9 a9Var4 = new a9(context, NDV.mbG);
                                    a9 a9Var5 = new a9(context, NDV.HQ);
                                    a9 a9Var6 = new a9(context, NDV.N);
                                    a9Var4.BGx();
                                    a9Var5.BGx();
                                    a9Var6.BGx();
                                    for (String str3 : ndv.BGx()) {
                                        if (context.getDatabasePath(str3).exists()) {
                                            context.deleteDatabase(str3);
                                        }
                                    }
                                    OR4.BGx.getClass();
                                    for (String str4 : (List) OR4.mbG.MediaSessionCompatResultReceiverWrapper()) {
                                        if (context.getDatabasePath(str4).exists()) {
                                            context.deleteDatabase(str4);
                                        }
                                    }
                                    Ay.BGx.HQ();
                                    Ay.mbG.HQ();
                                    Ay.HQ.HQ();
                                    ssc.BGx();
                                    tvm.BGx(System.currentTimeMillis(), Integer.valueOf(iIntValue2), list3);
                                    obj = null;
                                } else {
                                    if (ruBGx != null) {
                                        List list6 = ruBGx.HQ;
                                        list5 = instance_delegatelambda0Var;
                                        if (list6 != null) {
                                            list5 = list6;
                                        }
                                    }
                                    ArrayList arrayList = new ArrayList(list5);
                                    arrayList.add(lowerCase);
                                    int size = arrayList.size();
                                    i3 = 0;
                                    list4 = arrayList;
                                    if (size > 10) {
                                        arrayList.remove(0);
                                        list4 = arrayList;
                                    }
                                }
                                list4 = list2;
                                list3 = instance_delegatelambda0Var;
                                list3 = list4;
                                if (ruBGx != null) {
                                    lValueOf3 = Long.valueOf(ruBGx.BGx);
                                } else {
                                    lValueOf3 = null;
                                }
                                az azVar2 = az.BGx;
                                i = i3;
                                T1.mbG = new Zs(Long.valueOf(j), l, lValueOf3, lowerCase, iIntValue2, (String) W4i.qE.MediaSessionCompatResultReceiverWrapper(), list3);
                                ssc.BGx(AUn.BGx);
                                NDV ndv2 = NDV.BGx;
                                a9 a9Var7 = new a9(context, NDV.mbG);
                                a9 a9Var8 = new a9(context, NDV.HQ);
                                a9 a9Var9 = new a9(context, NDV.N);
                                a9Var7.BGx();
                                a9Var8.BGx();
                                a9Var9.BGx();
                                while (r3.hasNext()) {
                                    if (context.getDatabasePath(str3).exists()) {
                                        context.deleteDatabase(str3);
                                    }
                                }
                                OR4.BGx.getClass();
                                while (r3.hasNext()) {
                                    if (context.getDatabasePath(str4).exists()) {
                                        context.deleteDatabase(str4);
                                    }
                                }
                                Ay.BGx.HQ();
                                Ay.mbG.HQ();
                                Ay.HQ.HQ();
                                ssc.BGx();
                                tvm.BGx(System.currentTimeMillis(), Integer.valueOf(iIntValue2), list3);
                                obj = null;
                            }
                            p.BGx(j);
                        }
                        l = null;
                        sSc ssc2 = Ay.N;
                        strMbG = ssc2.mbG(tVM.N);
                        if (strMbG != null) {
                            lowerCase = strMbG;
                        } else {
                            a9 a9Var10 = new a9(tvm.BGx, tVM.q);
                            a9Var = new a9(tvm.BGx, tVM.fZl);
                            a9Var2 = new a9(tvm.BGx, tVM.S);
                            caOBGx = new GUp(a9Var, a9Var2, a9Var10).BGx();
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, H67.mbG}, getCieXyz.write())).booleanValue()) {
                                String strMbG4 = a9Var.mbG(Eja.BGx, Eja.mbG);
                                if (strMbG4 != null) {
                                }
                            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, k1.mbG}, getCieXyz.write())).booleanValue()) {
                                a9Var = a9Var2;
                                String strMbG5 = a9Var.mbG(Eja.BGx, Eja.mbG);
                                if (strMbG5 != null) {
                                }
                            } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, Sth.mbG}, getCieXyz.write())).booleanValue()) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return;
                            }
                            if (lowerCase == null) {
                                lowerCase = null;
                            }
                        }
                        if (ruBGx != null) {
                            lValueOf = Long.valueOf(ruBGx.BGx);
                        } else {
                            lValueOf = null;
                        }
                        if (lValueOf != null) {
                            i = 0;
                            if (l != null) {
                                if (ruBGx != null) {
                                    i2 = ruBGx.mbG;
                                } else {
                                    i2 = 0;
                                }
                                if (ruBGx != null) {
                                    lValueOf2 = Long.valueOf(ruBGx.BGx);
                                } else {
                                    lValueOf2 = null;
                                }
                                yH yHVar2 = yH.BGx;
                                String str5 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                                if (ruBGx != null) {
                                    list = ruBGx.HQ;
                                } else {
                                    list = null;
                                }
                                T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str5, list, 8);
                                obj = null;
                                tvm.BGx(System.currentTimeMillis(), null, null);
                            } else {
                                if (ruBGx != null) {
                                    i2 = ruBGx.mbG;
                                } else {
                                    i2 = 0;
                                }
                                if (ruBGx != null) {
                                    lValueOf2 = Long.valueOf(ruBGx.BGx);
                                } else {
                                    lValueOf2 = null;
                                }
                                yH yHVar3 = yH.BGx;
                                String str6 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                                if (ruBGx != null) {
                                    list = ruBGx.HQ;
                                } else {
                                    list = null;
                                }
                                T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str6, list, 8);
                                obj = null;
                                tvm.BGx(System.currentTimeMillis(), null, null);
                            }
                        } else {
                            i = 0;
                            if (l != null) {
                                if (ruBGx != null) {
                                    i2 = ruBGx.mbG;
                                } else {
                                    i2 = 0;
                                }
                                if (ruBGx != null) {
                                    lValueOf2 = Long.valueOf(ruBGx.BGx);
                                } else {
                                    lValueOf2 = null;
                                }
                                yH yHVar4 = yH.BGx;
                                String str7 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                                if (ruBGx != null) {
                                    list = ruBGx.HQ;
                                } else {
                                    list = null;
                                }
                                T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str7, list, 8);
                                obj = null;
                                tvm.BGx(System.currentTimeMillis(), null, null);
                            } else {
                                if (ruBGx != null) {
                                    i2 = ruBGx.mbG;
                                } else {
                                    i2 = 0;
                                }
                                if (ruBGx != null) {
                                    lValueOf2 = Long.valueOf(ruBGx.BGx);
                                } else {
                                    lValueOf2 = null;
                                }
                                yH yHVar5 = yH.BGx;
                                String str8 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                                if (ruBGx != null) {
                                    list = ruBGx.HQ;
                                } else {
                                    list = null;
                                }
                                T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str8, list, 8);
                                obj = null;
                                tvm.BGx(System.currentTimeMillis(), null, null);
                            }
                        }
                        p.BGx(j);
                    }
                    l = lValueOf4;
                    sSc ssc3 = Ay.N;
                    strMbG = ssc3.mbG(tVM.N);
                    if (strMbG != null) {
                        lowerCase = strMbG;
                    } else {
                        a9 a9Var11 = new a9(tvm.BGx, tVM.q);
                        a9Var = new a9(tvm.BGx, tVM.fZl);
                        a9Var2 = new a9(tvm.BGx, tVM.S);
                        caOBGx = new GUp(a9Var, a9Var2, a9Var11).BGx();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, H67.mbG}, getCieXyz.write())).booleanValue()) {
                            String strMbG6 = a9Var.mbG(Eja.BGx, Eja.mbG);
                            if (strMbG6 != null) {
                            }
                        } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, k1.mbG}, getCieXyz.write())).booleanValue()) {
                            a9Var = a9Var2;
                            String strMbG7 = a9Var.mbG(Eja.BGx, Eja.mbG);
                            if (strMbG7 != null) {
                            }
                        } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, Sth.mbG}, getCieXyz.write())).booleanValue()) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return;
                        }
                        if (lowerCase == null) {
                            lowerCase = null;
                        }
                    }
                    if (ruBGx != null) {
                        lValueOf = Long.valueOf(ruBGx.BGx);
                    } else {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        i = 0;
                        if (l != null) {
                            if (ruBGx != null) {
                                i2 = ruBGx.mbG;
                            } else {
                                i2 = 0;
                            }
                            if (ruBGx != null) {
                                lValueOf2 = Long.valueOf(ruBGx.BGx);
                            } else {
                                lValueOf2 = null;
                            }
                            yH yHVar6 = yH.BGx;
                            String str9 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                            if (ruBGx != null) {
                                list = ruBGx.HQ;
                            } else {
                                list = null;
                            }
                            T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str9, list, 8);
                            obj = null;
                            tvm.BGx(System.currentTimeMillis(), null, null);
                        } else {
                            if (ruBGx != null) {
                                i2 = ruBGx.mbG;
                            } else {
                                i2 = 0;
                            }
                            if (ruBGx != null) {
                                lValueOf2 = Long.valueOf(ruBGx.BGx);
                            } else {
                                lValueOf2 = null;
                            }
                            yH yHVar7 = yH.BGx;
                            String str10 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                            if (ruBGx != null) {
                                list = ruBGx.HQ;
                            } else {
                                list = null;
                            }
                            T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str10, list, 8);
                            obj = null;
                            tvm.BGx(System.currentTimeMillis(), null, null);
                        }
                    } else {
                        i = 0;
                        if (l != null) {
                            if (ruBGx != null) {
                                i2 = ruBGx.mbG;
                            } else {
                                i2 = 0;
                            }
                            if (ruBGx != null) {
                                lValueOf2 = Long.valueOf(ruBGx.BGx);
                            } else {
                                lValueOf2 = null;
                            }
                            yH yHVar8 = yH.BGx;
                            String str11 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                            if (ruBGx != null) {
                                list = ruBGx.HQ;
                            } else {
                                list = null;
                            }
                            T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str11, list, 8);
                            obj = null;
                            tvm.BGx(System.currentTimeMillis(), null, null);
                        } else {
                            if (ruBGx != null) {
                                i2 = ruBGx.mbG;
                            } else {
                                i2 = 0;
                            }
                            if (ruBGx != null) {
                                lValueOf2 = Long.valueOf(ruBGx.BGx);
                            } else {
                                lValueOf2 = null;
                            }
                            yH yHVar9 = yH.BGx;
                            String str12 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                            if (ruBGx != null) {
                                list = ruBGx.HQ;
                            } else {
                                list = null;
                            }
                            T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str12, list, 8);
                            obj = null;
                            tvm.BGx(System.currentTimeMillis(), null, null);
                        }
                    }
                    p.BGx(j);
                } else {
                    fileBGx = p.BGx(p.BGx());
                    if (fileBGx != null) {
                        file = new File(fileBGx, P.mbG);
                        if (file.exists()) {
                            long j3 = Long.parseLong(r8lambdaOLXJyr9WZueQ0v3etp2M60EbsQ.write(file, ensureSubscribedToInAppMessageEvents.write));
                            p.BGx(j3);
                            file.delete();
                            lValueOf4 = Long.valueOf(j3);
                            l = lValueOf4;
                        }
                        sSc ssc4 = Ay.N;
                        strMbG = ssc4.mbG(tVM.N);
                        if (strMbG != null) {
                            lowerCase = strMbG;
                        } else {
                            a9 a9Var12 = new a9(tvm.BGx, tVM.q);
                            a9Var = new a9(tvm.BGx, tVM.fZl);
                            a9Var2 = new a9(tvm.BGx, tVM.S);
                            caOBGx = new GUp(a9Var, a9Var2, a9Var12).BGx();
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, H67.mbG}, getCieXyz.write())).booleanValue()) {
                                String strMbG8 = a9Var.mbG(Eja.BGx, Eja.mbG);
                                if (strMbG8 != null) {
                                }
                            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, k1.mbG}, getCieXyz.write())).booleanValue()) {
                                a9Var = a9Var2;
                                String strMbG9 = a9Var.mbG(Eja.BGx, Eja.mbG);
                                if (strMbG9 != null) {
                                }
                            } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, Sth.mbG}, getCieXyz.write())).booleanValue()) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                                return;
                            }
                            if (lowerCase == null) {
                                lowerCase = null;
                            }
                        }
                        if (ruBGx != null) {
                            lValueOf = Long.valueOf(ruBGx.BGx);
                        } else {
                            lValueOf = null;
                        }
                        if (lValueOf != null) {
                            i = 0;
                            if (l != null) {
                                if (ruBGx != null) {
                                    i2 = ruBGx.mbG;
                                } else {
                                    i2 = 0;
                                }
                                if (ruBGx != null) {
                                    lValueOf2 = Long.valueOf(ruBGx.BGx);
                                } else {
                                    lValueOf2 = null;
                                }
                                yH yHVar10 = yH.BGx;
                                String str13 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                                if (ruBGx != null) {
                                    list = ruBGx.HQ;
                                } else {
                                    list = null;
                                }
                                T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str13, list, 8);
                                obj = null;
                                tvm.BGx(System.currentTimeMillis(), null, null);
                            } else {
                                if (ruBGx != null) {
                                    i2 = ruBGx.mbG;
                                } else {
                                    i2 = 0;
                                }
                                if (ruBGx != null) {
                                    lValueOf2 = Long.valueOf(ruBGx.BGx);
                                } else {
                                    lValueOf2 = null;
                                }
                                yH yHVar11 = yH.BGx;
                                String str14 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                                if (ruBGx != null) {
                                    list = ruBGx.HQ;
                                } else {
                                    list = null;
                                }
                                T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str14, list, 8);
                                obj = null;
                                tvm.BGx(System.currentTimeMillis(), null, null);
                            }
                        } else {
                            i = 0;
                            if (l != null) {
                                if (ruBGx != null) {
                                    i2 = ruBGx.mbG;
                                } else {
                                    i2 = 0;
                                }
                                if (ruBGx != null) {
                                    lValueOf2 = Long.valueOf(ruBGx.BGx);
                                } else {
                                    lValueOf2 = null;
                                }
                                yH yHVar12 = yH.BGx;
                                String str15 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                                if (ruBGx != null) {
                                    list = ruBGx.HQ;
                                } else {
                                    list = null;
                                }
                                T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str15, list, 8);
                                obj = null;
                                tvm.BGx(System.currentTimeMillis(), null, null);
                            } else {
                                if (ruBGx != null) {
                                    i2 = ruBGx.mbG;
                                } else {
                                    i2 = 0;
                                }
                                if (ruBGx != null) {
                                    lValueOf2 = Long.valueOf(ruBGx.BGx);
                                } else {
                                    lValueOf2 = null;
                                }
                                yH yHVar13 = yH.BGx;
                                String str16 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                                if (ruBGx != null) {
                                    list = ruBGx.HQ;
                                } else {
                                    list = null;
                                }
                                T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str16, list, 8);
                                obj = null;
                                tvm.BGx(System.currentTimeMillis(), null, null);
                            }
                        }
                        p.BGx(j);
                    }
                    l = null;
                    sSc ssc5 = Ay.N;
                    strMbG = ssc5.mbG(tVM.N);
                    if (strMbG != null) {
                        lowerCase = strMbG;
                    } else {
                        a9 a9Var13 = new a9(tvm.BGx, tVM.q);
                        a9Var = new a9(tvm.BGx, tVM.fZl);
                        a9Var2 = new a9(tvm.BGx, tVM.S);
                        caOBGx = new GUp(a9Var, a9Var2, a9Var13).BGx();
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, H67.mbG}, getCieXyz.write())).booleanValue()) {
                            String strMbG10 = a9Var.mbG(Eja.BGx, Eja.mbG);
                            if (strMbG10 != null) {
                            }
                        } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, k1.mbG}, getCieXyz.write())).booleanValue()) {
                            a9Var = a9Var2;
                            String strMbG11 = a9Var.mbG(Eja.BGx, Eja.mbG);
                            if (strMbG11 != null) {
                            }
                        } else if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{caOBGx, Sth.mbG}, getCieXyz.write())).booleanValue()) {
                            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                            return;
                        }
                        if (lowerCase == null) {
                            lowerCase = null;
                        }
                    }
                    if (ruBGx != null) {
                        lValueOf = Long.valueOf(ruBGx.BGx);
                    } else {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        i = 0;
                        if (l != null) {
                            if (ruBGx != null) {
                                i2 = ruBGx.mbG;
                            } else {
                                i2 = 0;
                            }
                            if (ruBGx != null) {
                                lValueOf2 = Long.valueOf(ruBGx.BGx);
                            } else {
                                lValueOf2 = null;
                            }
                            yH yHVar14 = yH.BGx;
                            String str17 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                            if (ruBGx != null) {
                                list = ruBGx.HQ;
                            } else {
                                list = null;
                            }
                            T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str17, list, 8);
                            obj = null;
                            tvm.BGx(System.currentTimeMillis(), null, null);
                        } else {
                            if (ruBGx != null) {
                                i2 = ruBGx.mbG;
                            } else {
                                i2 = 0;
                            }
                            if (ruBGx != null) {
                                lValueOf2 = Long.valueOf(ruBGx.BGx);
                            } else {
                                lValueOf2 = null;
                            }
                            yH yHVar15 = yH.BGx;
                            String str18 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                            if (ruBGx != null) {
                                list = ruBGx.HQ;
                            } else {
                                list = null;
                            }
                            T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str18, list, 8);
                            obj = null;
                            tvm.BGx(System.currentTimeMillis(), null, null);
                        }
                    } else {
                        i = 0;
                        if (l != null) {
                            if (ruBGx != null) {
                                i2 = ruBGx.mbG;
                            } else {
                                i2 = 0;
                            }
                            if (ruBGx != null) {
                                lValueOf2 = Long.valueOf(ruBGx.BGx);
                            } else {
                                lValueOf2 = null;
                            }
                            yH yHVar16 = yH.BGx;
                            String str19 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                            if (ruBGx != null) {
                                list = ruBGx.HQ;
                            } else {
                                list = null;
                            }
                            T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str19, list, 8);
                            obj = null;
                            tvm.BGx(System.currentTimeMillis(), null, null);
                        } else {
                            if (ruBGx != null) {
                                i2 = ruBGx.mbG;
                            } else {
                                i2 = 0;
                            }
                            if (ruBGx != null) {
                                lValueOf2 = Long.valueOf(ruBGx.BGx);
                            } else {
                                lValueOf2 = null;
                            }
                            yH yHVar17 = yH.BGx;
                            String str110 = (String) W4i.IN.MediaSessionCompatResultReceiverWrapper();
                            if (ruBGx != null) {
                                list = ruBGx.HQ;
                            } else {
                                list = null;
                            }
                            T1.mbG = new Zs(Long.valueOf(j), l, lValueOf2, i2, str110, list, 8);
                            obj = null;
                            tvm.BGx(System.currentTimeMillis(), null, null);
                        }
                    }
                    p.BGx(j);
                }
            } catch (Throwable unused) {
            }
        }
        YM.BGx(context);
        AtomicReference atomicReference2 = oV.BGx;
        atomicReference2.set(obj);
        Jz jz = new Jz(context, vOk2);
        while (!atomicReference2.compareAndSet(obj, jz) && atomicReference2.get() == null) {
        }
        Iterator it = BGx().iterator();
        while (it.hasNext()) {
            ((yUe) it.next()).hIl();
        }
        List listBGx = BGx();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listBGx) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((yUe) obj2).N(), pbf.BGx}, getCieXyz.write())).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        int size2 = arrayList2.size();
        int i4 = i;
        while (i4 < size2) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            ((yUe) obj3).HQ();
        }
        bWV.BGx();
        AtomicReference atomicReference3 = JY.BGx;
        JY.BGx(yIq.BGx);
        String str20 = vOk2.BGx;
        try {
            LQ4 lq4 = new LQ4(((Jz) oV.mbG()).Ft, ((Jz) oV.mbG()).kCN);
            if (!lq4.BGx() && IU.BGx.get()) {
                Log.e("Incognia", "Missing required manifest components for the Incognia SDK. Functionality will be limited.");
            }
            List list7 = LQ4.N;
            if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                Iterator it2 = list7.iterator();
                while (it2.hasNext()) {
                    if (!lq4.mbG.BGx((String) it2.next())) {
                        if (!IU.BGx.get()) {
                            break;
                        }
                        Log.e("Incognia", "Missing required manifest permissions for the Incognia SDK. Functionality will be limited.");
                        break;
                    }
                }
            }
            if (str20 != null && str20.length() != 0) {
                String str21 = (String) W4i.c65.MediaSessionCompatResultReceiverWrapper();
                str21.getClass();
                Pattern patternCompile = Pattern.compile(str21);
                patternCompile.getClass();
                if (!patternCompile.matcher(str20).matches() && IU.BGx.get()) {
                    Log.e("Incognia", "Invalid application ID. You must call Incognia.init(...) with a valid application ID on the IncogniaOptions or the incognia.properties file.");
                }
            } else if (IU.BGx.get()) {
                Log.e("Incognia", "Incognia.init() called without an application Id. You must call Incognia.init(...) with a valid application ID on the IncogniaOptions or the incognia.properties file.");
            }
        } catch (Throwable unused2) {
        }
        AtomicBoolean atomicBoolean2 = IU.BGx;
        atomicBoolean2.get();
        try {
            jg jgVar = new jg(AUn.BGx(), String.valueOf(vOk2.BGx));
            if (atomicBoolean2.get()) {
            }
        } catch (Throwable unused3) {
        }
    }

    public static final void BGx(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        try {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke((SjD) JY.BGx.get());
        } catch (Throwable th) {
            H2S h2s = new H2S(th);
            if (IU.BGx.get()) {
                Log.e("Incognia", "Error running the Incognia SDK! " + h2s.getMessage());
            }
            SjD sjD = (SjD) JY.BGx.get();
            sjD.getClass();
            if (sjD instanceof yIq) {
                ((Jz) oV.mbG()).JR.BGx(th, false);
            } else {
                pNP.BGx(th, false);
            }
        }
    }

    public static List BGx() {
        return SQLite.read(((Jz) oV.mbG()).JR, ((Jz) oV.mbG()).N, ((Jz) oV.mbG()).x, ((Jz) oV.mbG()).YG3, ((Jz) oV.mbG()).ss, ((Jz) oV.mbG()).B, ((Jz) oV.mbG()).vM, ((Jz) oV.mbG()).hs, ((Jz) oV.mbG()).hIl, ((Jz) oV.mbG()).ISd, ((Jz) oV.mbG()).Pm, ((Jz) oV.mbG()).S, ((Jz) oV.mbG()).A1, ((Jz) oV.mbG()).j, ((Jz) oV.mbG()).TfN, ((Jz) oV.mbG()).BGx, ((Jz) oV.mbG()).RIs, ((Jz) oV.mbG()).X4, ((Jz) oV.mbG()).v, ((Jz) oV.mbG()).h, ((Jz) oV.mbG()).OhM, ((Jz) oV.mbG()).mbG);
    }

    public static final void BGx(SjD sjD) {
        Object[] objArr = {sjD, l8.BGx};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            BGx.BGx(new Q$$ExternalSyntheticLambda0(1));
        }
    }

    public static void BGx(Context context, final IncogniaOptions incogniaOptions) {
        Q3N.BGx();
        final int iBGx = E79.BGx("internal_init", null);
        uF.BGx = context.getApplicationContext().getApplicationContext();
        AtomicReference atomicReference = JY.BGx;
        Qv qv = Qv.BGx;
        RsL rsL = RsL.BGx;
        AtomicReference atomicReference2 = JY.BGx;
        do {
            if (atomicReference2.compareAndSet(qv, rsL)) {
                Iterator it = JY.mbG.iterator();
                while (it.hasNext()) {
                    ((AKA) it.next()).BGx(rsL);
                }
                break;
            }
        } while (atomicReference2.get() == qv);
        AtomicReference atomicReference3 = Q.mbG;
        Context context2 = uF.BGx;
        if (context2 != null) {
            Q.BGx(context2.getApplicationContext());
            BGx.BGx(new y9X() { // from class: com.incognia.internal.JuE$$ExternalSyntheticLambda3
                @Override // com.incognia.internal.y9X
                public final void run() {
                    JuE.BGx(incogniaOptions, iBGx);
                }
            });
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Using SDK context before initialization");
        }
    }

    public static final void BGx(IncogniaOptions incogniaOptions, int i) {
        VOk vOk;
        if (incogniaOptions != null) {
            try {
                vOk = new VOk(incogniaOptions.getAppId(), incogniaOptions.getLogEnabled(), incogniaOptions.getLocationEnabled(), incogniaOptions.getInstalledAppsCollectionEnabled(), incogniaOptions.getRequestTokenMaxLength(), 16);
            } catch (Throwable th) {
                try {
                    AtomicReference atomicReference = JY.BGx;
                    JY.BGx(JTd.BGx);
                    BGx.BGx(new Q$$ExternalSyntheticLambda1(6, th));
                    return;
                } finally {
                    E79.HQ(i);
                }
            }
        } else {
            vOk = null;
        }
        SjD sjD = (SjD) JY.BGx.get();
        Object[] objArr = {sjD, RsL.BGx};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            BGx(vOk);
        } else {
            Object[] objArr2 = {sjD, yIq.BGx};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                IU.BGx.get();
            } else {
                Object[] objArr3 = {sjD, l8.BGx};
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                    Object[] objArr4 = {sjD, JTd.BGx};
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                        Object[] objArr5 = {sjD, Qv.BGx};
                        ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue();
                    }
                }
                if (IU.BGx.get()) {
                    Log.e("Incognia", "Incognia SDK is in an error state and won't initialize");
                }
            }
        }
        E79.HQ(i);
    }

    public static final void BGx(Throwable th) {
        H2S h2s = new H2S(th);
        if (IU.BGx.get()) {
            Log.e("Incognia", "Error initializing Incognia SDK! " + h2s.getMessage());
        }
        pNP.BGx(th, true);
        HQ();
        AtomicReference atomicReference = JY.BGx;
        JY.BGx(l8.BGx);
    }

    public static void BGx(wx wxVar) {
        BGx.BGx(new E79$$ExternalSyntheticLambda3(wxVar, 1));
    }
}
