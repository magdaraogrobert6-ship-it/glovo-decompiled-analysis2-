package bo.app;

import java.util.ArrayList;
import java.util.List;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o2$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ o2 f$0;
    public final /* synthetic */ List f$1;

    public /* synthetic */ o2$$ExternalSyntheticLambda2(o2 o2Var, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = o2Var;
        this.f$1 = arrayList;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        List list = this.f$1;
        o2 o2Var = this.f$0;
        return i != 0 ? o2.b(o2Var, list) : o2.a(o2Var, list);
    }
}
