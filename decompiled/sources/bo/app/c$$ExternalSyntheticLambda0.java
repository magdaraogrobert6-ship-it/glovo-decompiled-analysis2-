package bo.app;

import com.braze.support.JsonUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;
    public final /* synthetic */ JSONArray f$1;

    public /* synthetic */ c$$ExternalSyntheticLambda0(int i, JSONArray jSONArray, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = jSONArray;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        JSONArray jSONArray = this.f$1;
        int i2 = this.f$0;
        return i != 0 ? JsonUtils.convertStringJsonArrayToList$lambda$0(i2, jSONArray) : c.a(i2, jSONArray);
    }
}
