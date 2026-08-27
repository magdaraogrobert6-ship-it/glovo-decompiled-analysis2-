package bo.app;

import com.braze.Braze;
import com.braze.support.StringUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t1$$ExternalSyntheticLambda1 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ t1$$ExternalSyntheticLambda1(String str, String str2, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = str2;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$1;
        String str2 = this.f$0;
        if (i == 0) {
            return t1.a(str2, str);
        }
        if (i == 1) {
            return w6.a(str2, str);
        }
        if (i != 2) {
            return i != 3 ? StringUtils.getCacheFileSuffix$lambda$1(str2, str) : Braze.changeUser$lambda$1$4(str2, str);
        }
        return w6.b(str2, str);
    }
}
