package bo.app;

import com.braze.BrazeUser;
import com.braze.configuration.CachedConfigurationProvider;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ih$$ExternalSyntheticLambda2 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ ih$$ExternalSyntheticLambda2(int i, String str, Object obj) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = obj;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        String str = this.f$0;
        if (i == 0) {
            return ih.d(str, obj);
        }
        if (i == 1) {
            return BrazeUser.setCustomAttribute$lambda$1$0(str, obj);
        }
        if (i != 2) {
            return i != 3 ? CachedConfigurationProvider.getResourceConfigurationValue$lambda$0(str, obj) : CachedConfigurationProvider.readResourceValue$lambda$0(str, obj);
        }
        return BrazeUser.setCustomAttribute$lambda$1$1(str, obj);
    }
}
