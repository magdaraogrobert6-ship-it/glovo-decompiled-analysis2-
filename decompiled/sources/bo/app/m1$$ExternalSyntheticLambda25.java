package bo.app;

import com.braze.models.FeatureFlag;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m1$$ExternalSyntheticLambda25 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FeatureFlag f$0;

    public /* synthetic */ m1$$ExternalSyntheticLambda25(FeatureFlag featureFlag, int i) {
        this.$r8$classId = i;
        this.f$0 = featureFlag;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        FeatureFlag featureFlag = this.f$0;
        if (i == 0) {
            return m1.b(featureFlag);
        }
        if (i == 1) {
            return o8.a(featureFlag);
        }
        if (i == 2) {
            return FeatureFlag.properties_delegate$lambda$0(featureFlag);
        }
        if (i != 3) {
            return i != 4 ? FeatureFlag.properties_delegate$lambda$0$0(featureFlag) : FeatureFlag._init_$lambda$0$0(featureFlag);
        }
        return FeatureFlag._init_$lambda$0(featureFlag);
    }
}
