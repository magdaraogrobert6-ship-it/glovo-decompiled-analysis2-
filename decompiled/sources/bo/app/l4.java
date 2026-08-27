package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.onContentCardDismissed;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final class l4 extends k7 {
    public static final String k = BrazeLogger.getBrazeLogTag((Class<?>) l4.class);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(w5 w5Var) {
        super(k9.V3_DATA, w5Var);
        w5Var.getClass();
    }

    public final void a(long j, rd rdVar, List list) {
        o1 o1Var;
        o1 o1Var2;
        l9 l9Var = rdVar != null ? rdVar.a : null;
        r4 r4Var = l9Var instanceof r4 ? (r4) l9Var : null;
        if (r4Var == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rd rdVar2 = (rd) it.next();
            l9 l9Var2 = rdVar2.a;
            r4 r4Var2 = l9Var2 instanceof r4 ? (r4) l9Var2 : null;
            if (r4Var2 == null || ((r4Var.n != null && r4Var2.n != null) || (((o1Var = r4Var.f22o) != null && !o1Var.b) || ((o1Var2 = r4Var2.f22o) != null && !o1Var2.b)))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new n$$ExternalSyntheticLambda2(r4Var2, 6, rdVar), 7, (Object) null);
            } else {
                tb tbVar = r4Var2.l;
                Boolean bool = (r4Var.l.b() || tbVar.b()) ? Boolean.TRUE : null;
                tb tbVar2 = r4Var.l;
                rb rbVar = tbVar2.c;
                if (rbVar == null) {
                    rbVar = null;
                }
                rb rbVar2 = tbVar.c;
                if (rbVar2 != null) {
                    rbVar = rbVar2;
                }
                String str = tbVar2.a;
                if (str == null) {
                    str = null;
                }
                String str2 = tbVar.a;
                if (str2 != null) {
                    str = str2;
                }
                r4Var.l = new tb(str, bool, rbVar);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, k, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new z$$ExternalSyntheticLambda1(rdVar2, j, rdVar, 1), 14, (Object) null);
                rdVar2.a(j, sd.BATCHED);
            }
        }
    }

    @Override // bo.app.k7
    public final void a(long j) {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((rd) obj).d.a()) {
                arrayList2.add(obj);
            }
        }
        List listSerializer = onContentCardDismissed.serializer(arrayList2, new k4());
        int size2 = listSerializer.size();
        if (size2 < 2) {
            return;
        }
        a(j, (rd) onContentCardDismissed.read(listSerializer), listSerializer.subList(1, size2));
    }

    public static final String a(rd rdVar, long j, rd rdVar2) {
        return af$$ExternalSyntheticOutline0.m("Batched request ", rdVar.a(j), " and combined into ", rdVar2.a(j));
    }

    public static final String a(r4 r4Var, rd rdVar) {
        return "Could not merge other request: " + r4Var + " into parent: " + rdVar;
    }
}
