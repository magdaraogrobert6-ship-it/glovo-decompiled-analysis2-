package com.incognia.internal;

import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class PO8 {
    public final YZr BGx;
    public final FW HQ;
    public final Hh N;
    public final d0 mbG;
    public static final fme x = fme.BGx;
    public static final lR hIl = lR.BGx;

    /* JADX WARN: Code duplicated, block: B:123:0x022e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0103  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Eq BGx() {
        bBG bbg;
        dCe dceBGx;
        Object obj;
        Rn rnHQ;
        Integer num;
        List list;
        String str;
        String string;
        vzp vzpVarBGx = this.mbG.BGx(x);
        dCe dce = null;
        if (vzpVarBGx == null) {
            return null;
        }
        List list2 = vzpVarBGx.BGx;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            dCe dce2 = (dCe) obj2;
            String str2 = dce2.q;
            if (str2 != null && dce2.fZl != null && dce2.iaH != null && str2.length() <= 20) {
                FW fw = this.HQ;
                String str3 = dce2.iaH;
                fw.getClass();
                Long lBGx = FW.BGx(str3);
                if (lBGx == null || lBGx.longValue() <= 100000) {
                    ZipFile zipFile = new ZipFile(dce2.iaH);
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        while (true) {
                            if (!enumerationEntries.hasMoreElements()) {
                                zipFile.close();
                                arrayList.add(obj2);
                                break;
                            }
                            long time = enumerationEntries.nextElement().getTime();
                            if (time + ((long) TimeZone.getDefault().getOffset(time)) != 1230768000000L) {
                                zipFile.close();
                                break;
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(871780641, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), -871780639, sourceInformationContextOfdefault.read(), new Object[]{zipFile, th}, sourceInformationContextOfdefault.read());
                            throw th2;
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            String str4 = ((dCe) obj3).q;
            if (str4 == null) {
                bbg = null;
            } else {
                YZr yZr = this.BGx;
                lR lRVar = hIl;
                lRVar.getClass();
                boolean zBGx = this.N.BGx(lRVar);
                yZr.getClass();
                try {
                    if (str4.equals(yZr.A1) || yZr.HQ) {
                        PackageInfo packageInfoBGx = J3.BGx(yZr.mbG, str4, 1);
                        if (!zBGx || packageInfoBGx == null) {
                            str = dce;
                        } else {
                            try {
                                ApplicationInfo applicationInfo = packageInfoBGx.applicationInfo;
                                if (applicationInfo != null) {
                                    string = yZr.mbG.getApplicationLabel(applicationInfo).toString();
                                } else {
                                    str = dce;
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        if (packageInfoBGx != null) {
                            yZr.N.getClass();
                            dceBGx = QP.BGx(packageInfoBGx, str);
                        }
                        if (dceBGx != null) {
                            str = string;
                            obj = dceBGx.q;
                        } else {
                            str = string;
                            obj = dce;
                        }
                        if (obj != null || dceBGx.e == null || dceBGx.fZl == null || dceBGx.iaH == null || dceBGx.N) {
                            bbg = null;
                        } else {
                            YZr yZr2 = this.BGx;
                            String str5 = dceBGx.q;
                            yZr2.getClass();
                            try {
                                rnHQ = yZr2.HQ(str5);
                            } catch (Throwable unused2) {
                                rnHQ = dce;
                            }
                            String str6 = rnHQ != 0 ? rnHQ.BGx : dce;
                            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str6, (String) W4i.CF.MediaSessionCompatResultReceiverWrapper()}, getCieXyz.write())).booleanValue() || (num = dceBGx.e) == null || num.intValue() != 0 || dceBGx.BGx != 1) {
                                bbg = null;
                            } else if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{dceBGx.fZl, "1.0"}, getCieXyz.write())).booleanValue()) {
                                FW fw2 = this.HQ;
                                String str7 = dceBGx.iaH;
                                fw2.getClass();
                                Long lBGx2 = FW.BGx(str7);
                                if (lBGx2 == null || lBGx2.longValue() <= 100000) {
                                    List list3 = dceBGx.TfN;
                                    String strSubstring = dceBGx.q;
                                    ArrayList arrayList3 = new ArrayList();
                                    if (strSubstring == null || list3 == null) {
                                        list = arrayList3;
                                    } else {
                                        int iWrite = hideCurrentlyDisplayingInAppMessage.write(6, strSubstring, ".");
                                        if (iWrite != -1) {
                                            strSubstring = strSubstring.substring(0, iWrite);
                                        }
                                        Iterator it = list3.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                ActivityInfo activityInfo = (ActivityInfo) it.next();
                                                String str8 = activityInfo.name;
                                                if (str8 == null || setCarryoverInAppMessage.RemoteActionCompatParcelizer(str8, strSubstring, false)) {
                                                    list = instance_delegatelambda0.write;
                                                } else {
                                                    arrayList3.add(activityInfo.name);
                                                }
                                            } else {
                                                list = arrayList3;
                                            }
                                        }
                                    }
                                    if (list.isEmpty()) {
                                        bbg = null;
                                    } else {
                                        bbg = new bBG(dceBGx.q, str6, dceBGx.VLD, dceBGx.e, Long.valueOf(dceBGx.BGx), dceBGx.fZl, list, lBGx2);
                                    }
                                } else {
                                    bbg = null;
                                }
                            } else {
                                bbg = null;
                            }
                        }
                    }
                } catch (Throwable unused3) {
                }
                str = string;
                dceBGx = dce;
                if (dceBGx != null) {
                    str = string;
                    obj = dceBGx.q;
                } else {
                    str = string;
                    obj = dce;
                }
                if (obj != null) {
                    bbg = null;
                } else {
                    bbg = null;
                }
            }
            if (bbg != null) {
                arrayList2.add(bbg);
            }
            dce = null;
        }
        return new Eq(arrayList2, Boolean.valueOf(vzpVarBGx.BGx(x)));
    }

    public PO8(YZr yZr, d0 d0Var, KWh kWh, FW fw, Hh hh) {
        this.BGx = yZr;
        this.mbG = d0Var;
        this.HQ = fw;
        this.N = hh;
    }
}
