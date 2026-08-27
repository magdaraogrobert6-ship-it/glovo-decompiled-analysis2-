package com.incognia.internal;

import androidx.sqlite.SQLite;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import o.accessgetInstancedelegatecp;
import o.createFromParcel;
import o.getCieXyz;
import o.getQueryParameterslambda2;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onItemDismiss;
import o.onMove;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class D3 extends Lambda implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    public final /* synthetic */ CBQ BGx;
    public final /* synthetic */ Lambda HQ;
    public final /* synthetic */ aF mbG;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D3(CBQ cbq, aF aFVar, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        super(1);
        this.BGx = cbq;
        this.mbG = aFVar;
        this.HQ = (Lambda) r8lambdardpfsr94j4iebcwx_kpqzpm8k0;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final /* synthetic */ Object invoke(Object obj) {
        BGx(((onItemDismiss) obj).IconCompatParcelizer);
        return createFromParcel.INSTANCE;
    }

    public static final void BGx(Object obj, CBQ cbq, aF aFVar, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        Iterable iterable;
        if (onItemDismiss.serializer(obj) == null) {
            List listSerializer = (List) obj;
            OF6 of6 = cbq.q;
            of6.getClass();
            if (!listSerializer.isEmpty()) {
                int i = 0;
                if (!((JSONObject) of6.BGx.BGx.get()).optBoolean(OF6.mbG, false)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listSerializer) {
                        String str = ((qVf) obj2).BGx;
                        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, OF6.N}, getCieXyz.write())).booleanValue()) {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, OF6.x}, getCieXyz.write())).booleanValue()) {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, OF6.hIl}, getCieXyz.write())).booleanValue()) {
                                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, OF6.hs}, getCieXyz.write())).booleanValue()) {
                                    }
                                }
                            }
                        }
                        arrayList.add(obj2);
                    }
                    listSerializer = onContentCardDismissed.serializer(arrayList, new EtK());
                } else {
                    long jOptLong = ((JSONObject) of6.BGx.BGx.get()).optLong(OF6.HQ, 50L);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : listSerializer) {
                        if (!setCarryoverInAppMessage.RemoteActionCompatParcelizer(((qVf) obj3).BGx, OF6.VV3, false)) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : listSerializer) {
                        qVf qvf = (qVf) obj4;
                        if (setCarryoverInAppMessage.RemoteActionCompatParcelizer(qvf.BGx, OF6.VV3, false) && qvf.N != null) {
                            arrayList3.add(obj4);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    int size = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj5 = arrayList3.get(i2);
                        i2++;
                        if (((qVf) obj5).N.longValue() <= jOptLong) {
                            arrayList4.add(obj5);
                        } else {
                            arrayList5.add(obj5);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it = arrayList4.iterator();
                        while (it.hasNext()) {
                            Long l = ((qVf) it.next()).mbG;
                            if (l != null) {
                                arrayList6.add(l);
                            }
                        }
                        Long l2 = (Long) onContentCardDismissed.RatingCompat((Iterable) arrayList6);
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            Long l3 = ((qVf) it2.next()).HQ;
                            if (l3 != null) {
                                arrayList7.add(l3);
                            }
                        }
                        Long l4 = (Long) onContentCardDismissed.MediaSessionCompatQueueItem((Iterable) arrayList7);
                        Iterator it3 = arrayList4.iterator();
                        long jLongValue = 0;
                        while (it3.hasNext()) {
                            Long l5 = ((qVf) it3.next()).N;
                            jLongValue += l5 != null ? l5.longValue() : 0L;
                        }
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            Map map = ((qVf) it4.next()).x;
                            if (map != null) {
                                arrayList8.add(map);
                            }
                        }
                        ArrayList arrayList9 = new ArrayList();
                        int size2 = arrayList8.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj6 = arrayList8.get(i3);
                            i3++;
                            onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) ((Map) obj6).entrySet(), (Collection) arrayList9);
                        }
                        int iRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(accessgetInstancedelegatecp.write(arrayList9, 10));
                        if (iRemoteActionCompatParcelizer < 16) {
                            iRemoteActionCompatParcelizer = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iRemoteActionCompatParcelizer);
                        int size3 = arrayList9.size();
                        while (i < size3) {
                            Object obj7 = arrayList9.get(i);
                            i++;
                            Map.Entry entry = (Map.Entry) obj7;
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                        iterable = (List) SQLite.write(getQueryParameterslambda2.serializer(), getQueryParameterslambda2.serializer(), 516583654, new Object[]{new qVf(OF6.A1, l2, l4, Long.valueOf(jLongValue), linkedHashMap)}, getQueryParameterslambda2.serializer(), -516583649, getQueryParameterslambda2.serializer());
                    } else {
                        iterable = instance_delegatelambda0.write;
                    }
                    listSerializer = onContentCardDismissed.serializer(onContentCardDismissed.IconCompatParcelizer(iterable, onContentCardDismissed.IconCompatParcelizer(arrayList5, arrayList2)), new Y4());
                }
            }
            cbq.BGx(aFVar, listSerializer);
            r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
            return;
        }
        String str2 = CBQ.YO;
        cbq.BGx(aFVar, (List) null);
        r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke();
    }

    public final void BGx(Object obj) {
        CBQ cbq = this.BGx;
        cbq.HQ.BGx(new D3$$ExternalSyntheticLambda0(obj, cbq, this.mbG, this.HQ, 0));
    }
}
