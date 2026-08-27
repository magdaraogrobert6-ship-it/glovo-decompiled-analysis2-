package bo.app;

import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eh$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ JSONObject f$0;

    public /* synthetic */ eh$$ExternalSyntheticLambda0(JSONObject jSONObject, int i) {
        this.$r8$classId = i;
        this.f$0 = jSONObject;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        JSONObject jSONObject = this.f$0;
        if (i == 0) {
            return eh.b(jSONObject);
        }
        if (i == 1) {
            return q9.b(jSONObject);
        }
        if (i == 2) {
            return r3.b(jSONObject);
        }
        if (i == 3) {
            return vb.a(jSONObject);
        }
        if (i != 4) {
            return i != 5 ? xg.c(jSONObject) : w6.a(jSONObject);
        }
        return vb.b(jSONObject);
    }
}
