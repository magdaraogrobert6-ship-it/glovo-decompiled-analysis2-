package bo.app;

import com.braze.BrazeUser;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zc$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ zc$$ExternalSyntheticLambda0(String str, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = j;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        long j = this.f$1;
        String str = this.f$0;
        return i != 0 ? BrazeUser.setCustomUserAttributeToSecondsFromEpoch$lambda$0(str, j) : zc.b(str, j);
    }
}
