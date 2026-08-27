package bo.app;

import java.util.ArrayList;
import java.util.List;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o2$$ExternalSyntheticLambda3 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ o2$$ExternalSyntheticLambda3(o2 o2Var, List list, fh fhVar, List list2) {
        this.f$0 = o2Var;
        this.f$1 = list;
        this.f$2 = fhVar;
        this.f$3 = list2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$2;
        Object obj2 = this.f$3;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        if (i != 0) {
            return i != 1 ? o6.a((String) obj4, (String) obj3, (String) obj2, (o6) obj) : o2.a((o2) obj4, (JSONObject) obj2, (Long) obj, (List) obj3);
        }
        return o2.a((o2) obj4, (List) obj3, (fh) obj, (List) obj2);
    }

    public /* synthetic */ o2$$ExternalSyntheticLambda3(o2 o2Var, JSONObject jSONObject, Long l, ArrayList arrayList) {
        this.f$0 = o2Var;
        this.f$3 = jSONObject;
        this.f$2 = l;
        this.f$1 = arrayList;
    }

    public /* synthetic */ o2$$ExternalSyntheticLambda3(String str, String str2, String str3, o6 o6Var) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$3 = str3;
        this.f$2 = o6Var;
    }
}
