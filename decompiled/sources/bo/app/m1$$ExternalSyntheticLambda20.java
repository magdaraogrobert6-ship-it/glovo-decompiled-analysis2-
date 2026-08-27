package bo.app;

import com.braze.Braze;
import com.braze.models.outgoing.BrazeProperties;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m1$$ExternalSyntheticLambda20 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ BrazeProperties f$1;

    public /* synthetic */ m1$$ExternalSyntheticLambda20(String str, BrazeProperties brazeProperties, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = brazeProperties;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        BrazeProperties brazeProperties = this.f$1;
        String str = this.f$0;
        if (i != 0) {
            return i != 1 ? Braze.logCustomEvent$lambda$1$3(str, brazeProperties) : Braze.logCustomEvent$lambda$1$0(str, brazeProperties);
        }
        return m1.b(str, brazeProperties);
    }
}
