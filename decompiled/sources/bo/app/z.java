package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o.accessgetInstancedelegatecp;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class z extends k7 {
    public static final String k = BrazeLogger.getBrazeLogTag((Class<?>) z.class);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(w5 w5Var) {
        super(k9.BANNERS_SYNC, w5Var);
        w5Var.getClass();
    }

    @Override // bo.app.k7
    public final void a(long j) {
        Object obj;
        l9 l9Var;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            rd rdVar = (rd) obj2;
            if (rdVar.d == sd.IN_FLIGHT && (rdVar.a instanceof k0)) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            l9 l9Var2 = ((rd) obj3).a;
            l9Var2.getClass();
            arrayList3.add(((k0) l9Var2).m());
        }
        if (!arrayList3.isEmpty()) {
            ArrayList arrayList4 = this.e;
            ArrayList arrayList5 = new ArrayList();
            int size3 = arrayList4.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj4 = arrayList4.get(i3);
                i3++;
                rd rdVar2 = (rd) obj4;
                if (rdVar2.d.a() && (rdVar2.a instanceof k0) && !arrayList3.isEmpty()) {
                    int size4 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size4) {
                        Object obj5 = arrayList3.get(i4);
                        i4++;
                        if (((Set) obj5).containsAll(((k0) rdVar2.a).m())) {
                            arrayList5.add(obj4);
                            break;
                        }
                    }
                }
            }
            int size5 = arrayList5.size();
            int i5 = 0;
            while (i5 < size5) {
                Object obj6 = arrayList5.get(i5);
                i5++;
                rd rdVar3 = (rd) obj6;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, k, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new z$$ExternalSyntheticLambda0(rdVar3, j, 0), 14, (Object) null);
                rdVar3.a(j, sd.BATCHED);
            }
        }
        ArrayList arrayList6 = this.e;
        ArrayList arrayList7 = new ArrayList();
        int size6 = arrayList6.size();
        int i6 = 0;
        while (i6 < size6) {
            Object obj7 = arrayList6.get(i6);
            i6++;
            rd rdVar4 = (rd) obj7;
            if (rdVar4.d.a() && (rdVar4.a instanceof k0)) {
                arrayList7.add(obj7);
            }
        }
        List<rd> listSerializer = onContentCardDismissed.serializer(arrayList7, new y(new x()));
        ArrayList arrayList8 = new ArrayList();
        for (rd rdVar5 : listSerializer) {
            l9 l9Var3 = rdVar5.a;
            l9Var3.getClass();
            LinkedHashSet linkedHashSetM = ((k0) l9Var3).m();
            int size7 = arrayList8.size();
            int i7 = 0;
            do {
                if (i7 >= size7) {
                    obj = null;
                    break;
                }
                obj = arrayList8.get(i7);
                i7++;
                l9Var = ((rd) obj).a;
                l9Var.getClass();
            } while (!((k0) l9Var).m().containsAll(linkedHashSetM));
            rd rdVar6 = (rd) obj;
            if (rdVar6 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, k, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new z$$ExternalSyntheticLambda1(rdVar5, j, rdVar6, 0), 14, (Object) null);
                rdVar5.a(j, sd.BATCHED);
            } else {
                arrayList8.add(rdVar5);
            }
        }
    }

    public static final String b(rd rdVar, long j) {
        return ff$$ExternalSyntheticOutline0.m("Dropping pending BannersSyncRequest ", rdVar.a(j), "; its placement-id set is already covered by an in-flight request.");
    }

    public static final String a(rd rdVar, long j, rd rdVar2) {
        return af$$ExternalSyntheticOutline0.m("Folding pending BannersSyncRequest ", rdVar.a(j), " into ", rdVar2.a(j));
    }
}
