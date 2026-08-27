package bo.app;

import com.braze.Braze;
import com.braze.enums.CardKey;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ JSONObject f$0;

    public /* synthetic */ l$$ExternalSyntheticLambda2(JSONObject jSONObject, int i) {
        this.$r8$classId = i;
        this.f$0 = jSONObject;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        JSONObject jSONObject = this.f$0;
        switch (i) {
            case 0:
                return l.b(jSONObject);
            case 1:
                return af.k(jSONObject);
            case 2:
                return be.a(jSONObject);
            case 3:
                return bg.a(jSONObject);
            case 4:
                return d4.b(jSONObject);
            case 5:
                return d4.c(jSONObject);
            case 6:
                return d4.d(jSONObject);
            case 7:
                return d4.e(jSONObject);
            case 8:
                return ih.a("ab_install_attribution", jSONObject);
            case 9:
                return wa.a(jSONObject);
            case 10:
                return xg.d(jSONObject);
            case 11:
                return xg.b(jSONObject);
            case 12:
                return Braze.deserializeContentCard$lambda$2(jSONObject);
            case 13:
                return CardKey.Companion.getCardTypeFromJson$lambda$0(jSONObject);
            case 14:
                return com.braze.support.e.b(jSONObject);
            case 15:
                return com.braze.support.f.b(jSONObject);
            case 16:
                return com.braze.support.f.a(jSONObject);
            case 17:
                return com.braze.support.i.a(jSONObject);
            case 18:
                return com.braze.support.i.b(jSONObject);
            default:
                return com.braze.support.i.c(jSONObject);
        }
    }
}
