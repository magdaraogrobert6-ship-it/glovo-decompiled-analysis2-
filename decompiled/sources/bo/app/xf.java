package bo.app;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes.dex */
public final class xf extends k7 {
    public final f8 k;

    @Override // bo.app.k7
    public final void a(long j) {
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((rd) obj).d == sd.PENDING_RETRY) {
                arrayList2.add(obj);
            }
        }
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            rd rdVar = (rd) arrayList2.get(i3);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new z$$ExternalSyntheticLambda0(rdVar, j, 1), 7, (Object) null);
            rdVar.a(j, sd.COMPLETE);
        }
        ArrayList arrayList3 = this.e;
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList3.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            if (((rd) obj2).d == sd.PENDING_START) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        int size4 = arrayList4.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj3 = arrayList4.get(i5);
            i5++;
            rd rdVar2 = (rd) obj3;
            l9 l9Var = rdVar2.a;
            yf yfVar = l9Var instanceof yf ? (yf) l9Var : null;
            if ((yfVar != null ? ((pg) yfVar.m).b + yfVar.p : -1L) < rdVar2.b) {
                arrayList5.add(obj3);
            }
        }
        int size5 = arrayList5.size();
        while (i < size5) {
            Object obj4 = arrayList5.get(i);
            i++;
            rd rdVar3 = (rd) obj4;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0) new z$$ExternalSyntheticLambda0(rdVar3, j, 2), 7, (Object) null);
            rdVar3.a(j, sd.COMPLETE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xf(w5 w5Var) {
        super(k9.TEMPLATE_REQUEST, w5Var);
        w5Var.getClass();
        this.k = new f8(60000, f8.g, w5Var.a.j.k(), w5Var.a.j.l());
    }

    public static final String b(rd rdVar, long j) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Template request will not be retried. Marking as complete. ", rdVar.a(j));
    }

    public static final String c(rd rdVar, long j) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Template request will expire before send time and is not eligible for a request retry. Not retrying or performing any fallback triggers. ", rdVar.a(j));
    }

    @Override // bo.app.k7
    public final f8 a() {
        return this.k;
    }
}
