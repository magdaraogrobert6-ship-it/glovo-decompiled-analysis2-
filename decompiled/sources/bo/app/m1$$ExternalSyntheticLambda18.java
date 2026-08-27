package bo.app;

import com.braze.BrazeUser;
import com.braze.support.BrazeFileUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m1$$ExternalSyntheticLambda18 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ int f$1;

    public /* synthetic */ m1$$ExternalSyntheticLambda18(int i, String str) {
        this.$r8$classId = 2;
        this.f$1 = i;
        this.f$0 = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$0;
        int i2 = this.f$1;
        if (i != 0) {
            return i != 1 ? BrazeFileUtils.downloadFileToPath$lambda$4(i2, str) : BrazeUser.incrementCustomUserAttribute$lambda$0(str, i2);
        }
        return m1.b(str, i2);
    }

    public /* synthetic */ m1$$ExternalSyntheticLambda18(String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = i;
    }
}
