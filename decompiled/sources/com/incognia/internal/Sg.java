package com.incognia.internal;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.sqlite.SQLite;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.io.TextStreamsKt;
import o.accessgetInstancedelegatecp;
import o.cancelPendingWebViewPause;
import o.createInAppMessageEventSubscriber;
import o.ensureSubscribedToInAppMessageEvents;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.hideCurrentlyDisplayingInAppMessage;
import o.onViewAttachedToWindowlambda0;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import o.sourceInformationContextOfdefault;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class Sg {
    public final Context BGx;
    public final ActivityManager HQ;
    public final r55 N = new r55();
    public final NvL mbG;
    public static final String x = (String) W4i.Xxa.MediaSessionCompatResultReceiverWrapper();
    public static final String hIl = (String) W4i.gJC.MediaSessionCompatResultReceiverWrapper();

    public Sg(Context context, NvL nvL) {
        this.BGx = context;
        this.mbG = nvL;
        this.HQ = (ActivityManager) context.getSystemService("activity");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:89:0x0296  */
    public final ArrayList BGx() {
        Long l;
        Iterator it;
        i8Q i8q;
        ArrayList arrayList;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0;
        String str;
        String str2;
        Long l2;
        String str3;
        String str4;
        String str5;
        String str6;
        RT rt;
        Boolean bool;
        RVY rvy;
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1;
        BufferedReader bufferedReader;
        int i;
        int i2;
        u8u u8uVar;
        Boolean boolValueOf;
        List list;
        boolean z;
        Long l3 = 0L;
        Integer num = 0;
        Throwable th = null;
        if (!XUh.BGx(XUh.BGx, 30, 0, 2)) {
            return null;
        }
        i8Q i8q2 = new i8Q(((JSONObject) this.mbG.BGx.get()).optInt(hIl, 10), ((JSONObject) this.mbG.BGx.get()).optBoolean(x, false));
        List<ApplicationExitInfo> historicalProcessExitReasons = this.HQ.getHistoricalProcessExitReasons(this.BGx.getPackageName(), 0, 0);
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(historicalProcessExitReasons, 10));
        Iterator it2 = historicalProcessExitReasons.iterator();
        while (it2.hasNext()) {
            ApplicationExitInfo applicationExitInfoCd_ = ScreenStartObserver$$ExternalSyntheticLambda0.cd_(it2.next());
            if (applicationExitInfoCd_.getReason() != 5) {
                InputStream traceInputStream = applicationExitInfoCd_.getTraceInputStream();
                if (traceInputStream == null) {
                    onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0(th, th);
                } else {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(traceInputStream, ensureSubscribedToInAppMessageEvents.write), 8192);
                        try {
                            iTU itu = new iTU();
                            createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
                            createinappmessageeventsubscriber.IconCompatParcelizer = new oxz();
                            ArrayList arrayList3 = new ArrayList();
                            StringBuilder sb = new StringBuilder();
                            cancelPendingWebViewPause cancelpendingwebviewpause = new cancelPendingWebViewPause();
                            StringBuilder sb2 = new StringBuilder();
                            bufferedReader = bufferedReader2;
                            try {
                                TextStreamsKt.RemoteActionCompatParcelizer(bufferedReader, new F2(i8q2, sb2, itu, cancelpendingwebviewpause, createinappmessageeventsubscriber, sb, arrayList3));
                                if (arrayList3.isEmpty()) {
                                    i = 0;
                                } else {
                                    int size = arrayList3.size();
                                    int i3 = 0;
                                    i = 0;
                                    while (i3 < size) {
                                        Object obj = arrayList3.get(i3);
                                        i3++;
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((E6f) obj).A1, kKI.HQ}, getCieXyz.write())).booleanValue() && (i = i + 1) < 0) {
                                            SQLite.RemoteActionCompatParcelizer();
                                            throw th;
                                        }
                                    }
                                }
                                if (arrayList3.isEmpty()) {
                                    i2 = 0;
                                } else {
                                    int size2 = arrayList3.size();
                                    i2 = 0;
                                    int i4 = 0;
                                    while (i4 < size2) {
                                        Object obj2 = arrayList3.get(i4);
                                        i4++;
                                        E6f e6f = (E6f) obj2;
                                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{e6f.A1, kKI.HQ}, getCieXyz.write())).booleanValue() && (u8uVar = e6f.hs) != null && ((u8uVar.equals(pqk.HQ) || u8uVar.equals(ZtG.HQ)) && (i2 = i2 + 1) < 0)) {
                                            SQLite.RemoteActionCompatParcelizer();
                                            throw null;
                                        }
                                    }
                                }
                                List listBGx = i8q2.BGx(arrayList3);
                                String string = i8q2.mbG ? hideCurrentlyDisplayingInAppMessage.read(sb2.toString()).toString() : null;
                                itu.iaH = Long.valueOf(i);
                                itu.e = Long.valueOf(i2);
                                itu.fZl = listBGx;
                                onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0(itu.BGx(), string);
                                bufferedReader.close();
                                onviewattachedtowindowlambda1 = onviewattachedtowindowlambda2;
                            } catch (Throwable th2) {
                                th = th2;
                                Throwable th3 = th;
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{bufferedReader, th3}, sourceInformationContextOfdefault.read());
                                    throw th4;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedReader = bufferedReader2;
                        }
                    } catch (Throwable unused) {
                        onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0(null, null);
                    }
                }
                RVY rvy2 = (RVY) onviewattachedtowindowlambda1.serializer;
                String str7 = (String) onviewattachedtowindowlambda1.write;
                if (rvy2 == null || (list = rvy2.fZl) == null) {
                    boolValueOf = null;
                } else {
                    if (list.isEmpty()) {
                        z = false;
                    } else {
                        Iterator it3 = list.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z = false;
                            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((E6f) it3.next()).A1, kKI.HQ}, getCieXyz.write())).booleanValue()) {
                                z = true;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
                str6 = str7;
                rvy = rvy2;
                bool = boolValueOf;
                l = l3;
                num = num;
                it = it2;
                i8q = i8q2;
                arrayList = arrayList2;
                rt = null;
            } else {
                InputStream traceInputStream2 = applicationExitInfoCd_.getTraceInputStream();
                if (traceInputStream2 == null) {
                    onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(null, null);
                    l = l3;
                    num = num;
                    it = it2;
                    i8q = i8q2;
                    arrayList = arrayList2;
                } else {
                    Tl tl = new Tl(traceInputStream2);
                    Boolean bool2 = Boolean.FALSE;
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Boolean boolValueOf2 = bool2;
                    Long lValueOf = l3;
                    Long lValueOf2 = lValueOf;
                    Long l4 = lValueOf2;
                    Long lValueOf3 = l4;
                    Long lValueOf4 = lValueOf3;
                    Long lValueOf5 = lValueOf4;
                    fb9 fb9Var = null;
                    String strMbG = null;
                    String strMbG2 = null;
                    String strMbG3 = null;
                    String strMbG4 = null;
                    Long lValueOf6 = null;
                    oA7 oa7 = null;
                    String strMbG5 = null;
                    while (true) {
                        if (tl.BGx()) {
                            Yc ycMbG = tl.mbG();
                            Tl tl2 = tl;
                            switch (ycMbG.BGx) {
                                case 1:
                                    l = l3;
                                    num = num;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    lValueOf = Long.valueOf(ycMbG.BGx());
                                    break;
                                case 2:
                                    l = l3;
                                    num = num;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    strMbG = ycMbG.mbG();
                                    break;
                                case 3:
                                    l = l3;
                                    num = num;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    strMbG2 = ycMbG.mbG();
                                    break;
                                case 4:
                                    l = l3;
                                    num = num;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    strMbG3 = ycMbG.mbG();
                                    break;
                                case 5:
                                    l = l3;
                                    num = num;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    lValueOf2 = Long.valueOf(ycMbG.BGx());
                                    break;
                                case 6:
                                    l = l3;
                                    num = num;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    lValueOf6 = Long.valueOf(ycMbG.BGx());
                                    l4 = lValueOf6;
                                    break;
                                case 7:
                                    l = l3;
                                    num = num;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    lValueOf5 = Long.valueOf(ycMbG.BGx());
                                    break;
                                case 8:
                                    l = l3;
                                    num = num;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    strMbG4 = ycMbG.mbG();
                                    break;
                                case 9:
                                    l = l3;
                                    num = num;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    str = strMbG3;
                                    str2 = strMbG4;
                                    l2 = lValueOf6;
                                    arrayList4.add(ycMbG.mbG());
                                    lValueOf6 = l2;
                                    strMbG4 = str2;
                                    strMbG3 = str;
                                    break;
                                case 10:
                                    l = l3;
                                    num = num;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    str = strMbG3;
                                    str2 = strMbG4;
                                    l2 = lValueOf6;
                                    Tl tl3 = new Tl(new ByteArrayInputStream(ycMbG.mbG));
                                    Boolean boolValueOf3 = Boolean.FALSE;
                                    Boolean boolValueOf4 = boolValueOf3;
                                    Long lValueOf7 = l;
                                    Integer numValueOf = num;
                                    Integer numValueOf2 = numValueOf;
                                    Integer numValueOf3 = numValueOf2;
                                    Integer numValueOf4 = numValueOf3;
                                    String strMbG6 = null;
                                    String strMbG7 = null;
                                    while (tl3.BGx()) {
                                        Yc ycMbG2 = tl3.mbG();
                                        switch (ycMbG2.BGx) {
                                            case 1:
                                                numValueOf = Integer.valueOf(nQ.mbG(ycMbG2.mbG).intValue());
                                                break;
                                            case 2:
                                                strMbG6 = ycMbG2.mbG();
                                                break;
                                            case 3:
                                                numValueOf2 = Integer.valueOf(nQ.mbG(ycMbG2.mbG).intValue());
                                                break;
                                            case 4:
                                                strMbG7 = ycMbG2.mbG();
                                                break;
                                            case 5:
                                                boolValueOf3 = Boolean.valueOf(nQ.mbG(ycMbG2.mbG).intValue() != 0);
                                                break;
                                            case 6:
                                                numValueOf3 = Integer.valueOf(nQ.mbG(ycMbG2.mbG).intValue());
                                                break;
                                            case 7:
                                                numValueOf4 = Integer.valueOf(nQ.mbG(ycMbG2.mbG).intValue());
                                                break;
                                            case 8:
                                                boolValueOf4 = Boolean.valueOf(nQ.mbG(ycMbG2.mbG).intValue() != 0);
                                                break;
                                            case 9:
                                                lValueOf7 = Long.valueOf(ycMbG2.BGx());
                                                break;
                                        }
                                    }
                                    oa7 = new oA7(numValueOf, strMbG6, numValueOf2, strMbG7, boolValueOf3, numValueOf3, numValueOf4, boolValueOf4, lValueOf7);
                                    lValueOf6 = l2;
                                    strMbG4 = str2;
                                    strMbG3 = str;
                                    break;
                                case 11:
                                case 12:
                                case 13:
                                case 17:
                                case 18:
                                case 19:
                                case 21:
                                default:
                                    l = l3;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    str = strMbG3;
                                    str2 = strMbG4;
                                    l2 = lValueOf6;
                                    lValueOf6 = l2;
                                    strMbG4 = str2;
                                    strMbG3 = str;
                                    break;
                                case 14:
                                    l = l3;
                                    num = num;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    strMbG5 = ycMbG.mbG();
                                    break;
                                case 15:
                                    l = l3;
                                    num = num;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    str = strMbG3;
                                    str2 = strMbG4;
                                    l2 = lValueOf6;
                                    Tl tl4 = new Tl(new ByteArrayInputStream(ycMbG.mbG));
                                    String strMbG8 = null;
                                    Gs gs = null;
                                    while (tl4.BGx()) {
                                        Yc ycMbG3 = tl4.mbG();
                                        int i5 = ycMbG3.BGx;
                                        if (i5 == 1) {
                                            strMbG8 = ycMbG3.mbG();
                                        } else if (i5 == 2) {
                                            Tl tl5 = new Tl(new ByteArrayInputStream(ycMbG3.mbG));
                                            long jBGx = 0;
                                            long jBGx2 = 0;
                                            TLJ tlj = null;
                                            while (tl5.BGx()) {
                                                Yc ycMbG4 = tl5.mbG();
                                                int i6 = ycMbG4.BGx;
                                                if (i6 == 1) {
                                                    jBGx = ycMbG4.BGx();
                                                } else if (i6 == 2) {
                                                    jBGx2 = ycMbG4.BGx();
                                                } else if (i6 == 3) {
                                                    Tl tl6 = new Tl(new ByteArrayInputStream(ycMbG4.mbG));
                                                    ArrayList arrayList6 = new ArrayList();
                                                    ArrayList arrayList7 = new ArrayList();
                                                    Long lValueOf8 = l;
                                                    Long lValueOf9 = lValueOf8;
                                                    Long lValueOf10 = lValueOf9;
                                                    Long lValueOf11 = lValueOf10;
                                                    while (tl6.BGx()) {
                                                        Yc ycMbG5 = tl6.mbG();
                                                        switch (ycMbG5.BGx) {
                                                            case 1:
                                                                lValueOf8 = Long.valueOf(ycMbG5.BGx());
                                                                break;
                                                            case 2:
                                                                lValueOf9 = Long.valueOf(ycMbG5.BGx());
                                                                break;
                                                            case 3:
                                                                lValueOf10 = Long.valueOf(ycMbG5.BGx());
                                                                break;
                                                            case 4:
                                                                arrayList6.add(mnC.BGx(ycMbG5.mbG));
                                                                break;
                                                            case 5:
                                                                lValueOf11 = Long.valueOf(ycMbG5.BGx());
                                                                break;
                                                            case 6:
                                                                arrayList7.add(mnC.BGx(ycMbG5.mbG));
                                                                break;
                                                        }
                                                    }
                                                    tlj = new TLJ(lValueOf8, lValueOf9, lValueOf10, arrayList6, lValueOf11, arrayList7);
                                                }
                                            }
                                            gs = new Gs(jBGx, jBGx2, tlj);
                                        }
                                    }
                                    arrayList5.add(new px(strMbG8, gs));
                                    lValueOf6 = l2;
                                    strMbG4 = str2;
                                    strMbG3 = str;
                                    break;
                                case 16:
                                    if (fb9Var == null) {
                                        Tl tl7 = new Tl(new ByteArrayInputStream(ycMbG.mbG));
                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                        l = l3;
                                        fb9 fb9Var2 = null;
                                        Long lValueOf12 = null;
                                        while (tl7.BGx()) {
                                            it2 = it2;
                                            Yc ycMbG6 = tl7.mbG();
                                            tl7 = tl7;
                                            int i7 = ycMbG6.BGx;
                                            i8q2 = i8q2;
                                            if (i7 == 1) {
                                                lValueOf12 = Long.valueOf(ycMbG6.BGx());
                                            } else if (i7 == 2) {
                                                Tl tl8 = new Tl(new ByteArrayInputStream(ycMbG6.mbG));
                                                ArrayList arrayList8 = new ArrayList();
                                                ArrayList arrayList9 = new ArrayList();
                                                ArrayList arrayList10 = new ArrayList();
                                                Long lValueOf13 = l;
                                                Long lValueOf14 = lValueOf13;
                                                Long lValueOf15 = lValueOf14;
                                                String strMbG9 = null;
                                                while (tl8.BGx()) {
                                                    Long l5 = lValueOf6;
                                                    Yc ycMbG7 = tl8.mbG();
                                                    Tl tl9 = tl8;
                                                    switch (ycMbG7.BGx) {
                                                        case 1:
                                                            str3 = strMbG3;
                                                            str4 = strMbG4;
                                                            lValueOf13 = Long.valueOf(ycMbG7.BGx());
                                                            break;
                                                        case 2:
                                                            str3 = strMbG3;
                                                            str4 = strMbG4;
                                                            strMbG9 = ycMbG7.mbG();
                                                            break;
                                                        case 3:
                                                            Tl tl10 = new Tl(new ByteArrayInputStream(ycMbG7.mbG));
                                                            Long lValueOf16 = l;
                                                            String strMbG10 = null;
                                                            while (tl10.BGx()) {
                                                                String str8 = strMbG4;
                                                                Yc ycMbG8 = tl10.mbG();
                                                                Tl tl11 = tl10;
                                                                int i8 = ycMbG8.BGx;
                                                                String str9 = strMbG3;
                                                                if (i8 == 1) {
                                                                    strMbG10 = ycMbG8.mbG();
                                                                } else if (i8 == 2) {
                                                                    lValueOf16 = Long.valueOf(ycMbG8.BGx());
                                                                }
                                                                tl10 = tl11;
                                                                strMbG4 = str8;
                                                                strMbG3 = str9;
                                                            }
                                                            str3 = strMbG3;
                                                            str4 = strMbG4;
                                                            arrayList8.add(new RZ(strMbG10, lValueOf16));
                                                            break;
                                                        case 4:
                                                            arrayList10.add(mnC.BGx(ycMbG7.mbG));
                                                            str3 = strMbG3;
                                                            str4 = strMbG4;
                                                            break;
                                                        case 5:
                                                        default:
                                                            str3 = strMbG3;
                                                            str4 = strMbG4;
                                                            break;
                                                        case 6:
                                                            lValueOf14 = Long.valueOf(ycMbG7.BGx());
                                                            str3 = strMbG3;
                                                            str4 = strMbG4;
                                                            break;
                                                        case 7:
                                                            arrayList9.add(ycMbG7.mbG());
                                                            str3 = strMbG3;
                                                            str4 = strMbG4;
                                                            break;
                                                        case 8:
                                                            lValueOf15 = Long.valueOf(ycMbG7.BGx());
                                                            str3 = strMbG3;
                                                            str4 = strMbG4;
                                                            break;
                                                    }
                                                    tl8 = tl9;
                                                    lValueOf6 = l5;
                                                    arrayList2 = arrayList2;
                                                    strMbG4 = str4;
                                                    strMbG3 = str3;
                                                }
                                                fb9Var2 = new fb9(lValueOf13, strMbG9, arrayList8, arrayList9, arrayList10, lValueOf14, lValueOf15);
                                            }
                                            lValueOf6 = lValueOf6;
                                            arrayList2 = arrayList2;
                                            strMbG4 = strMbG4;
                                            strMbG3 = strMbG3;
                                        }
                                        it = it2;
                                        i8q = i8q2;
                                        arrayList = arrayList2;
                                        str = strMbG3;
                                        str2 = strMbG4;
                                        l2 = lValueOf6;
                                        if (fb9Var2 != null && lValueOf12 != null) {
                                            linkedHashMap2.put(lValueOf12, fb9Var2);
                                        }
                                        linkedHashMap.putAll(linkedHashMap2);
                                    } else {
                                        l = l3;
                                        it = it2;
                                        i8q = i8q2;
                                        arrayList = arrayList2;
                                        str = strMbG3;
                                        str2 = strMbG4;
                                        l2 = lValueOf6;
                                    }
                                    lValueOf6 = l2;
                                    strMbG4 = str2;
                                    strMbG3 = str;
                                    break;
                                case 20:
                                    lValueOf3 = Long.valueOf(ycMbG.BGx());
                                    l = l3;
                                    num = num;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    break;
                                case 22:
                                    lValueOf4 = Long.valueOf(ycMbG.BGx());
                                    l = l3;
                                    num = num;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    break;
                                case 23:
                                    boolValueOf2 = Boolean.valueOf(nQ.mbG(ycMbG.mbG).intValue() != 0);
                                    l = l3;
                                    num = num;
                                    it = it2;
                                    i8q = i8q2;
                                    arrayList = arrayList2;
                                    break;
                            }
                            if (lValueOf6 != null && fb9Var == null && (fb9Var = (fb9) linkedHashMap.get(lValueOf6)) != null && (str5 = fb9Var.mbG) != null) {
                                if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(str5, "ibgnd-", false)) {
                                    onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(null, null);
                                }
                            }
                            tl = tl2;
                            l3 = l;
                            num = num;
                            it2 = it;
                            i8q2 = i8q;
                            arrayList2 = arrayList;
                        } else {
                            l = l3;
                            num = num;
                            it = it2;
                            i8q = i8q2;
                            arrayList = arrayList2;
                            String str10 = strMbG3;
                            String str11 = strMbG4;
                            RT rt2 = new RT(lValueOf, strMbG, strMbG2, str10, lValueOf2, l4, lValueOf5, str11, arrayList4, lValueOf3, oa7, strMbG5, arrayList5, fb9Var != null ? (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{fb9Var}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer()) : null, lValueOf4, boolValueOf2);
                            String str12 = cRO.BGx;
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(cRO.BGx, lValueOf.longValue());
                            if (strMbG != null) {
                                jSONObject.put(cRO.mbG, strMbG);
                            }
                            if (strMbG2 != null) {
                                jSONObject.put(cRO.HQ, strMbG2);
                            }
                            if (str10 != null) {
                                jSONObject.put(cRO.N, str10);
                            }
                            jSONObject.put(cRO.x, lValueOf2.longValue());
                            jSONObject.put(cRO.hIl, l4.longValue());
                            jSONObject.put(cRO.hs, lValueOf5.longValue());
                            if (str11 != null) {
                                jSONObject.put(cRO.VV3, str11);
                            }
                            JSONArray jSONArray = new JSONArray();
                            int size3 = arrayList4.size();
                            int i9 = 0;
                            while (i9 < size3) {
                                Object obj3 = arrayList4.get(i9);
                                i9++;
                                jSONArray.put((String) obj3);
                            }
                            jSONObject.put(cRO.A1, jSONArray);
                            jSONObject.put(cRO.q, rt2.q.longValue());
                            oA7 oa8 = rt2.fZl;
                            if (oa8 != null) {
                                jSONObject.put(cRO.fZl, Zae.BGx(oa8));
                            }
                            Object obj4 = rt2.S;
                            if (obj4 != null) {
                                jSONObject.put(cRO.S, obj4);
                            }
                            JSONArray jSONArray2 = new JSONArray();
                            ArrayList arrayList11 = rt2.iaH;
                            int size4 = arrayList11.size();
                            int i10 = 0;
                            while (i10 < size4) {
                                Object obj5 = arrayList11.get(i10);
                                i10++;
                                px pxVar = (px) obj5;
                                String str13 = iYk.BGx;
                                JSONObject jSONObject2 = new JSONObject();
                                Object obj6 = pxVar.BGx;
                                if (obj6 != null) {
                                    jSONObject2.put(iYk.BGx, obj6);
                                }
                                Gs gs2 = pxVar.mbG;
                                if (gs2 != null) {
                                    String str14 = iYk.mbG;
                                    String str15 = iXr.BGx;
                                    JSONObject jSONObject3 = new JSONObject();
                                    jSONObject3.put(iXr.BGx, gs2.BGx);
                                    jSONObject3.put(iXr.mbG, gs2.mbG);
                                    TLJ tlj2 = gs2.HQ;
                                    if (tlj2 != null) {
                                        String str16 = iXr.HQ;
                                        String str17 = M8M.BGx;
                                        JSONObject jSONObject4 = new JSONObject();
                                        jSONObject4.put(M8M.BGx, tlj2.BGx.longValue());
                                        jSONObject4.put(M8M.mbG, tlj2.mbG.longValue());
                                        jSONObject4.put(M8M.HQ, tlj2.HQ.longValue());
                                        JSONArray jSONArray3 = new JSONArray();
                                        ArrayList arrayList12 = tlj2.N;
                                        int size5 = arrayList12.size();
                                        int i11 = 0;
                                        while (i11 < size5) {
                                            Object obj7 = arrayList12.get(i11);
                                            i11++;
                                            jSONArray3.put(Z.BGx((DU6) obj7));
                                        }
                                        jSONObject4.put(M8M.N, jSONArray3);
                                        jSONObject4.put(M8M.x, tlj2.x.longValue());
                                        JSONArray jSONArray4 = new JSONArray();
                                        ArrayList arrayList13 = tlj2.hIl;
                                        int size6 = arrayList13.size();
                                        int i12 = 0;
                                        while (i12 < size6) {
                                            Object obj8 = arrayList13.get(i12);
                                            i12++;
                                            jSONArray4.put(Z.BGx((DU6) obj8));
                                        }
                                        jSONObject4.put(M8M.hIl, jSONArray4);
                                        jSONObject3.put(str16, jSONObject4);
                                    }
                                    jSONObject2.put(str14, jSONObject3);
                                } else {
                                    size4 = size4;
                                }
                                jSONArray2.put(jSONObject2);
                                size4 = size4;
                            }
                            jSONObject.put(cRO.iaH, jSONArray2);
                            if (rt2.e != null) {
                                JSONArray jSONArray5 = new JSONArray();
                                for (fb9 fb9Var3 : rt2.e) {
                                    String str18 = uaf.BGx;
                                    JSONObject jSONObject5 = new JSONObject();
                                    jSONObject5.put(uaf.BGx, fb9Var3.BGx.longValue());
                                    Object obj9 = fb9Var3.mbG;
                                    if (obj9 != null) {
                                        jSONObject5.put(uaf.mbG, obj9);
                                    }
                                    JSONArray jSONArray6 = new JSONArray();
                                    ArrayList arrayList14 = fb9Var3.HQ;
                                    int size7 = arrayList14.size();
                                    for (int i13 = 0; i13 < size7; i13++) {
                                        RZ rz = (RZ) arrayList14.get(i13);
                                        String str19 = fL4.BGx;
                                        JSONObject jSONObject6 = new JSONObject();
                                        String str20 = rz.BGx;
                                        if (str20 != null) {
                                            jSONObject6.put(fL4.BGx, str20);
                                        }
                                        jSONObject6.put(fL4.mbG, rz.mbG.longValue());
                                        jSONArray6.put(jSONObject6);
                                    }
                                    jSONObject5.put(uaf.HQ, jSONArray6);
                                    JSONArray jSONArray7 = new JSONArray();
                                    ArrayList arrayList15 = fb9Var3.N;
                                    int size8 = arrayList15.size();
                                    int i14 = 0;
                                    while (i14 < size8) {
                                        Object obj10 = arrayList15.get(i14);
                                        i14++;
                                        jSONArray7.put((String) obj10);
                                    }
                                    jSONObject5.put(uaf.N, jSONArray7);
                                    JSONArray jSONArray8 = new JSONArray();
                                    ArrayList arrayList16 = fb9Var3.x;
                                    int size9 = arrayList16.size();
                                    int i15 = 0;
                                    while (i15 < size9) {
                                        Object obj11 = arrayList16.get(i15);
                                        i15++;
                                        jSONArray8.put(Z.BGx((DU6) obj11));
                                    }
                                    jSONObject5.put(uaf.x, jSONArray8);
                                    jSONObject5.put(uaf.hIl, fb9Var3.hIl.longValue());
                                    jSONObject5.put(uaf.hs, fb9Var3.hs.longValue());
                                    jSONArray5.put(jSONObject5);
                                }
                                jSONObject.put(cRO.e, jSONArray5);
                            }
                            jSONObject.put(cRO.VLD, rt2.VLD.longValue());
                            jSONObject.put(cRO.TfN, rt2.TfN.booleanValue());
                            onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0(rt2, jSONObject.toString());
                        }
                    }
                }
                RT rt3 = (RT) onviewattachedtowindowlambda0.serializer;
                str6 = (String) onviewattachedtowindowlambda0.write;
                rt = rt3;
                bool = null;
                rvy = null;
            }
            ArrayList arrayList17 = arrayList;
            arrayList17.add(new GgU(applicationExitInfoCd_.getPss(), applicationExitInfoCd_.getRss(), applicationExitInfoCd_.getReason(), applicationExitInfoCd_.getStatus(), applicationExitInfoCd_.getTimestamp(), applicationExitInfoCd_.getDescription(), applicationExitInfoCd_.getProcessName(), bool, str6, rt, rvy));
            arrayList2 = arrayList17;
            l3 = l;
            num = num;
            it2 = it;
            i8q2 = i8q;
            th = null;
        }
        return arrayList2;
    }
}
