package com.incognia.internal;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.sidemenu.frequentlyuseditems.FrequentlyUsedItemKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ranges.RangesKt;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.isItemDismissable;
import o.onContentCardDismissed;
import o.onViewDetachedFromWindowlambda1;
import o.removeNodeAtDepth;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class GFK implements PG {
    public Set A1;
    public final YZr BGx;
    public final N HQ;
    public final Se N;
    public Set S;
    public Set VV3;
    public Set fZl;
    public final VOk hIl;
    public final onViewDetachedFromWindowlambda1 hs;
    public Set iaH;
    public final d0 mbG;
    public Set q;
    public final wg x;
    public static final String e = (String) W4i.v1.MediaSessionCompatResultReceiverWrapper();
    public static final String VLD = (String) W4i.e8y.MediaSessionCompatResultReceiverWrapper();
    public static final GXo TfN = GXo.BGx;

    @Override // com.incognia.internal.PG
    public final boolean BGx() {
        return true;
    }

    @Override // com.incognia.internal.PG
    public final void BGx(y0S y0s, Ltx ltx) {
        Object isitemdismissable;
        Boolean boolValueOf;
        List listBGx;
        List listMbG;
        List listMbG2;
        try {
            wg wgVar = this.x;
            NvL nvL = wgVar.BGx;
            String str = wg.mbG;
            ArrayList arrayList = wg.e;
            Set setParcelableVolumeInfo = onContentCardDismissed.ParcelableVolumeInfo(nvL.BGx(str, arrayList));
            boolean z = true;
            if (((JSONObject) wgVar.BGx.BGx.get()).optBoolean(wg.HQ, true)) {
                setParcelableVolumeInfo.addAll(arrayList);
            }
            this.VV3 = setParcelableVolumeInfo;
            wg wgVar2 = this.x;
            NvL nvL2 = wgVar2.BGx;
            String str2 = wg.N;
            ArrayList arrayList2 = wg.VLD;
            Set setParcelableVolumeInfo2 = onContentCardDismissed.ParcelableVolumeInfo(nvL2.BGx(str2, arrayList2));
            if (((JSONObject) wgVar2.BGx.BGx.get()).optBoolean(wg.x, false)) {
                setParcelableVolumeInfo2.addAll(arrayList2);
            }
            this.A1 = setParcelableVolumeInfo2;
            wg wgVar3 = this.x;
            NvL nvL3 = wgVar3.BGx;
            String str3 = wg.hIl;
            ArrayList arrayList3 = wg.TfN;
            Set setParcelableVolumeInfo3 = onContentCardDismissed.ParcelableVolumeInfo(nvL3.BGx(str3, arrayList3));
            if (((JSONObject) wgVar3.BGx.BGx.get()).optBoolean(wg.hs, false)) {
                setParcelableVolumeInfo3.addAll(arrayList3);
            }
            this.q = setParcelableVolumeInfo3;
            wg wgVar4 = this.x;
            NvL nvL4 = wgVar4.BGx;
            String str4 = wg.VV3;
            ArrayList arrayList4 = wg.OV7;
            Set setParcelableVolumeInfo4 = onContentCardDismissed.ParcelableVolumeInfo(nvL4.BGx(str4, arrayList4));
            if (((JSONObject) wgVar4.BGx.BGx.get()).optBoolean(wg.A1, true)) {
                setParcelableVolumeInfo4.addAll(arrayList4);
            }
            this.fZl = setParcelableVolumeInfo4;
            wg wgVar5 = this.x;
            NvL nvL5 = wgVar5.BGx;
            String str5 = wg.q;
            ArrayList arrayList5 = wg.JR;
            Set setParcelableVolumeInfo5 = onContentCardDismissed.ParcelableVolumeInfo(nvL5.BGx(str5, arrayList5));
            if (((JSONObject) wgVar5.BGx.BGx.get()).optBoolean(wg.fZl, false)) {
                setParcelableVolumeInfo5.addAll(arrayList5);
            }
            this.S = setParcelableVolumeInfo5;
            wg wgVar6 = this.x;
            NvL nvL6 = wgVar6.BGx;
            String str6 = wg.S;
            ArrayList arrayList6 = wg.j;
            Set setParcelableVolumeInfo6 = onContentCardDismissed.ParcelableVolumeInfo(nvL6.BGx(str6, arrayList6));
            if (((JSONObject) wgVar6.BGx.BGx.get()).optBoolean(wg.iaH, false)) {
                setParcelableVolumeInfo6.addAll(arrayList6);
            }
            this.iaH = setParcelableVolumeInfo6;
            int iOptInt = ((JSONObject) this.x.BGx.BGx.get()).optInt(wg.n, 10);
            vzp vzpVarBGx = this.mbG.BGx(TfN);
            List list = vzpVarBGx != null ? vzpVarBGx.BGx : null;
            List list2 = (!this.hIl.N || (listMbG2 = mbG(list, this.HQ.mbG())) == null) ? null : onContentCardDismissed.read(listMbG2, iOptInt);
            List list3 = (!this.hIl.N || (listMbG = mbG(list, this.HQ.BGx())) == null) ? null : onContentCardDismissed.read(listMbG, iOptInt);
            List list4 = (!((JSONObject) this.x.BGx.BGx.get()).optBoolean(wg.l5, true) || (listBGx = BGx(list, this.HQ.BGx())) == null) ? null : onContentCardDismissed.read(onContentCardDismissed.serializer(listBGx, new tzh()), ((JSONObject) this.x.BGx.BGx.get()).optInt(wg.vM, 10));
            List listHQ = ((JSONObject) this.x.BGx.BGx.get()).optBoolean(wg.v, false) ? HQ(list) : null;
            String str7 = (String) this.hs.MediaSessionCompatResultReceiverWrapper();
            ArrayList arrayListMbG = mbG(list);
            ArrayList arrayListBGx = BGx(list);
            ArrayList arrayListN = N(list);
            if (list == null || list.isEmpty()) {
                boolValueOf = null;
            } else {
                String str8 = this.BGx.A1;
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    String str9 = ((dCe) it.next()).q;
                    if (str9 != null && (hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str8, (CharSequence) str9, false) || hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer((CharSequence) str9, (CharSequence) str8, false))) {
                        i++;
                    }
                }
                if (i <= 1) {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            }
            Set set = this.iaH;
            if (set == null) {
                set = null;
            }
            ArrayList arrayList7 = new ArrayList();
            for (Object obj : set) {
                Boolean boolBGx = this.BGx.BGx((String) obj);
                if (boolBGx != null && boolBGx.booleanValue()) {
                    arrayList7.add(obj);
                }
            }
            isitemdismissable = new aL0(str7, new FSN(arrayListMbG, arrayListBGx, arrayListN, boolValueOf, arrayList7, list2, list3, list4, vzpVarBGx != null ? Boolean.valueOf(vzpVarBGx.BGx(TfN)) : null, listHQ));
        } catch (Throwable th) {
            isitemdismissable = new isItemDismissable(th);
        }
        Bq.BGx(isitemdismissable, ltx);
    }

    public GFK(YZr yZr, d0 d0Var, N n, Se se, wg wgVar, VOk vOk) {
        this.BGx = yZr;
        this.mbG = d0Var;
        this.HQ = n;
        this.N = se;
        this.x = wgVar;
        this.hIl = vOk;
        Object[] objArr = {E8t.BGx};
        this.hs = (isAdapterPositionOnScreen) LazyKt__LazyJVMKt.IconCompatParcelizer(FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), -853852215, 853852217, FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), FrequentlyUsedItemKt.RemoteActionCompatParcelizer(), objArr);
    }

    public final List HQ(List list) {
        Object isitemdismissable;
        List listBGx;
        Rn rnHQ;
        if (list != null) {
            try {
                if (this.hIl.N) {
                    Intent intent = new Intent((String) W4i.Ji.MediaSessionCompatResultReceiverWrapper());
                    YZr yZr = this.BGx;
                    String str = YZr.q;
                    yZr.getClass();
                    try {
                        listBGx = J3.BGx(yZr.mbG, intent);
                    } catch (Throwable unused) {
                        listBGx = null;
                    }
                    if (listBGx != null) {
                        if (listBGx.isEmpty()) {
                            isitemdismissable = instance_delegatelambda0.write;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : list) {
                                if (((dCe) obj).N) {
                                    arrayList.add(obj);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                i++;
                                String str2 = ((dCe) obj2).q;
                                if (str2 != null) {
                                    arrayList2.add(str2);
                                }
                            }
                            HashSet hashSetWrite = onContentCardDismissed.write(arrayList2);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Iterator it = listBGx.iterator();
                            while (it.hasNext()) {
                                ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
                                String str3 = activityInfo != null ? activityInfo.packageName : null;
                                if (activityInfo != null && activityInfo.exported && str3 != null && !linkedHashMap.containsKey(str3) && !hashSetWrite.contains(str3)) {
                                    YZr yZr2 = this.BGx;
                                    yZr2.getClass();
                                    try {
                                        rnHQ = yZr2.HQ(str3);
                                    } catch (Throwable unused2) {
                                        rnHQ = null;
                                    }
                                    linkedHashMap.put(str3, new o26(str3, rnHQ != null ? rnHQ.BGx : null, Boolean.FALSE, null));
                                }
                            }
                            isitemdismissable = onContentCardDismissed.PlaybackStateCompat(linkedHashMap.values());
                        }
                    }
                }
                isitemdismissable = null;
            } catch (Throwable th) {
                isitemdismissable = new isItemDismissable(th);
            }
        } else {
            isitemdismissable = null;
        }
        return (List) (isitemdismissable instanceof isItemDismissable ? null : isitemdismissable);
    }

    public static ArrayList N(List list) {
        Bundle bundle;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            dCe dce = (dCe) obj;
            if (dce.q != null && (bundle = dce.S) != null && bundle.containsKey(VLD)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((dCe) obj2).q);
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    public final List mbG(List list, List list2) {
        Rn rnHQ;
        boolean z;
        Object next;
        if (list == null || list2 == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!linkedHashSet.contains(str)) {
                YZr yZr = this.BGx;
                yZr.getClass();
                try {
                    rnHQ = yZr.HQ(str);
                } catch (Throwable unused) {
                    rnHQ = null;
                }
                String str2 = rnHQ != null ? rnHQ.BGx : null;
                if (str2 != null) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{(String) W4i.CF.MediaSessionCompatResultReceiverWrapper(), str2}, getCieXyz.write())).booleanValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((dCe) next).q, str}, getCieXyz.write())).booleanValue());
                dCe dce = (dCe) next;
                boolean z2 = dce != null ? dce.N : false;
                if (!z && !z2) {
                    linkedHashSet.add(str);
                }
            }
        }
        return onContentCardDismissed.PlaybackStateCompat(linkedHashSet);
    }

    public final ArrayList mbG(List list) {
        if (list == null) {
            return null;
        }
        Set set = this.VV3;
        if (set == null) {
            set = null;
        }
        Set set2 = this.A1;
        if (set2 == null) {
            set2 = null;
        }
        LinkedHashSet linkedHashSet = RangesKt.read(set, set2);
        Set set3 = this.q;
        if (set3 == null) {
            set3 = null;
        }
        LinkedHashSet linkedHashSet2 = RangesKt.read(linkedHashSet, set3);
        Set set4 = this.fZl;
        if (set4 == null) {
            set4 = null;
        }
        LinkedHashSet linkedHashSet3 = RangesKt.read(linkedHashSet2, set4);
        Set set5 = this.S;
        LinkedHashSet linkedHashSet4 = RangesKt.read(linkedHashSet3, set5 != null ? set5 : null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            String str = ((dCe) obj).q;
            if (str != null && linkedHashSet4.contains(str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((dCe) obj2).q);
        }
        return arrayList2;
    }

    @Override // com.incognia.internal.PG
    public final String mbG() {
        return (String) this.hs.MediaSessionCompatResultReceiverWrapper();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0128  */
    public final List BGx(List list, List list2) {
        String str;
        Object next;
        ArrayList arrayList;
        Rn rnHQ;
        if (list == null || list2 == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!linkedHashSet2.contains(str2)) {
                if (this.hIl.N) {
                    YZr yZr = this.BGx;
                    yZr.getClass();
                    try {
                        rnHQ = yZr.HQ(str2);
                    } catch (Throwable unused) {
                        rnHQ = null;
                    }
                    if (rnHQ != null) {
                        str = rnHQ.BGx;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{((dCe) next).q, str2}, getCieXyz.write())).booleanValue());
                dCe dce = (dCe) next;
                Boolean boolValueOf = dce != null ? Boolean.valueOf(dce.N) : null;
                if (((JSONObject) this.x.BGx.BGx.get()).optBoolean(wg.ss, false)) {
                    arrayList = new ArrayList();
                    ArrayList arrayListBGx = this.HQ.BGx(str2);
                    if (arrayListBGx != null) {
                        for (AccessibilityServiceInfo accessibilityServiceInfo : onContentCardDismissed.read(arrayListBGx, ((JSONObject) this.x.BGx.BGx.get()).optInt(wg.B, 3))) {
                            arrayList.add(new gb(Se.mbG(accessibilityServiceInfo), ((JSONObject) this.x.BGx.BGx.get()).optBoolean(wg.N6D, false) ? this.N.BGx(accessibilityServiceInfo, ((JSONObject) this.x.BGx.BGx.get()).optInt(wg.YO, Fields.SpotShadowColor)) : null, Se.N(accessibilityServiceInfo), Se.BGx(accessibilityServiceInfo), accessibilityServiceInfo != null ? Integer.valueOf(accessibilityServiceInfo.flags) : null, Se.HQ(accessibilityServiceInfo)));
                        }
                    } else {
                        arrayList = null;
                    }
                } else {
                    arrayList = null;
                }
                o26 o26Var = new o26(str2, str, boolValueOf, arrayList);
                linkedHashSet2.add(str2);
                linkedHashSet.add(o26Var);
            }
        }
        return onContentCardDismissed.PlaybackStateCompat(linkedHashSet);
    }

    public static ArrayList BGx(List list) {
        List list2;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            dCe dce = (dCe) obj;
            if (dce.q != null && (list2 = dce.VV3) != null && list2.contains(e)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((dCe) obj2).q);
        }
        return arrayList2;
    }
}
