package bo.app;

import com.braze.Braze;
import com.braze.BrazeUser;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m1$$ExternalSyntheticLambda16 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ double f$1;
    public final /* synthetic */ double f$2;

    public /* synthetic */ m1$$ExternalSyntheticLambda16(double d, double d2, Braze braze) {
        this.$r8$classId = 2;
        this.f$1 = d;
        this.f$2 = d2;
        this.f$0 = braze;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        double d = this.f$2;
        double d2 = this.f$1;
        if (i != 0) {
            return i != 1 ? Braze.requestGeofences$lambda$1(d2, d, (Braze) obj) : BrazeUser.setLocationCustomAttribute$lambda$3((String) obj, d2, d);
        }
        return m1.b((String) obj, d2, d);
    }

    public /* synthetic */ m1$$ExternalSyntheticLambda16(double d, double d2, int i, String str) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = d;
        this.f$2 = d2;
    }
}
