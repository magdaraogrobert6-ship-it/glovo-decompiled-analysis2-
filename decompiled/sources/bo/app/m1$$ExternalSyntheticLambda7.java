package bo.app;

import com.braze.BrazeUser;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m1$$ExternalSyntheticLambda7 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ JSONObject f$1;

    public /* synthetic */ m1$$ExternalSyntheticLambda7(JSONObject jSONObject, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = jSONObject;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        JSONObject jSONObject = this.f$1;
        String str = this.f$0;
        return i != 0 ? BrazeUser.setCustomUserAttribute$lambda$6(str, jSONObject) : m1.b(str, jSONObject);
    }
}
