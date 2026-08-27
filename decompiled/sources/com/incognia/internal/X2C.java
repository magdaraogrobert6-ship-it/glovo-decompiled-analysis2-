package com.incognia.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import o.accessgetInstancedelegatecp;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class X2C {
    public final UsU BGx;
    public final pcn HQ;
    public final ByN N;
    public final nSA mbG;
    public final LinkedHashMap x = new LinkedHashMap();

    public static final void mbG(X2C x2c, String str, List list, lD lDVar) {
        x2c.BGx(str, list, lDVar, false);
    }

    public X2C(UsU usU, nSA nsa, pcn pcnVar, ByN byN) {
        this.BGx = usU;
        this.mbG = nsa;
        this.HQ = pcnVar;
        this.N = byN;
    }

    public final void BGx(String str, lD lDVar) throws JSONException {
        ArrayList arrayList;
        Oo1 oo1 = (Oo1) this.x.get(str);
        if (oo1 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(onContentCardDismissed.serializer(oo1.BGx, new OH()));
            arrayList = new ArrayList();
            int iBGx = 0;
            while (!arrayList2.isEmpty()) {
                X1 x1 = (X1) arrayList2.remove(0);
                arrayList.add(x1);
                iBGx += x1.BGx();
                if (iBGx >= 1048576) {
                    break;
                }
            }
        }
        if (arrayList == null) {
            return;
        }
        dCe dceMbG = this.HQ.BGx.mbG();
        Long lValueOf = dceMbG != null ? Long.valueOf(dceMbG.BGx) : null;
        String str2 = dceMbG != null ? dceMbG.fZl : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            JSONObject jSONObjectMbG = ((X1) obj).mbG();
            JSONObject jSONObject = new JSONObject();
            Iterator<String> itKeys = jSONObjectMbG.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectMbG.get(next));
            }
            String str3 = BTS.BGx;
            JSONObject jSONObject2 = new JSONObject();
            if (lValueOf != null) {
                jSONObject2.put(BTS.BGx, lValueOf.longValue());
            }
            if (str2 != null) {
                jSONObject2.put(BTS.mbG, str2);
            }
            jSONObject2.put(BTS.HQ, 71002);
            jSONObject2.put(BTS.N, jCurrentTimeMillis);
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                jSONObject.put(next2, jSONObject2.get(next2));
            }
            arrayList3.add(jSONObject);
        }
        this.mbG.BGx(new uKg(arrayList3), true, onMove.IconCompatParcelizer(new onViewAttachedToWindowlambda0((String) W4i.msF.MediaSessionCompatResultReceiverWrapper(), (String) W4i.IUc.MediaSessionCompatResultReceiverWrapper()), new onViewAttachedToWindowlambda0((String) W4i.BWi.MediaSessionCompatResultReceiverWrapper(), this.N.BGx().BGx().toUpperCase(Locale.US)), new onViewAttachedToWindowlambda0((String) W4i.oOZ.MediaSessionCompatResultReceiverWrapper(), lDVar.BGx())), new X2C$$ExternalSyntheticLambda1(this, str, arrayList, lDVar), new X2C$$ExternalSyntheticLambda1(this, str, arrayList, lDVar));
    }

    public static final void BGx(List list, uEN uen, X2C x2c, lD lDVar) {
        boolean zIsEmpty = list.isEmpty();
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (zIsEmpty) {
            if (uen != null) {
                uen.BGx(true, instance_delegatelambda0Var);
                return;
            }
            return;
        }
        try {
            String string = UUID.randomUUID().toString();
            x2c.x.put(string, new Oo1(onContentCardDismissed.ParcelableVolumeInfo(list), new LinkedHashSet(), new LinkedHashSet(), new VlQ(uen)));
            x2c.BGx(string, lDVar);
        } catch (Throwable unused) {
            if (uen != null) {
                uen.BGx(false, instance_delegatelambda0Var);
            }
        }
    }

    public static final void BGx(X2C x2c, String str, List list, lD lDVar, Object obj) {
        x2c.BGx.BGx(new D3$$ExternalSyntheticLambda0(x2c, str, list, lDVar, 1));
    }

    public static final void BGx(X2C x2c, String str, List list, lD lDVar) {
        x2c.BGx(str, list, lDVar, true);
    }

    public static final void BGx(X2C x2c, String str, List list, lD lDVar, E3 e3) {
        x2c.BGx.BGx(new OHI$$ExternalSyntheticLambda0(x2c, str, list, lDVar, 1));
    }

    public final void BGx(List list, lD lDVar, uEN uen) {
        this.BGx.BGx(new D3$$ExternalSyntheticLambda0(list, uen, this, lDVar, 2));
    }

    public final void BGx(String str, List list, lD lDVar, boolean z) throws JSONException {
        Oo1 oo1 = (Oo1) this.x.get(str);
        if (oo1 == null) {
            return;
        }
        if (z) {
            LinkedHashSet linkedHashSet = oo1.mbG;
            ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((X1) it.next()).x);
            }
            linkedHashSet.addAll(arrayList);
        } else {
            LinkedHashSet linkedHashSet2 = oo1.HQ;
            ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((X1) it2.next()).x);
            }
            linkedHashSet2.addAll(arrayList2);
        }
        oo1.BGx.removeAll(onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(list));
        if (oo1.BGx.isEmpty()) {
            oo1.N.invoke(Boolean.valueOf(!oo1.mbG.isEmpty()), onContentCardDismissed.PlaybackStateCompat(oo1.mbG));
            this.x.remove(str);
            return;
        }
        BGx(str, lDVar);
    }
}
