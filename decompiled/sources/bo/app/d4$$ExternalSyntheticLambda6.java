package bo.app;

import com.braze.Constants;
import com.braze.enums.DelayedInitializationAnalyticsBehavior;
import com.braze.support.PermissionUtils;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d4$$ExternalSyntheticLambda6 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ d4$$ExternalSyntheticLambda6(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                return d4.a(str, Constants.BRAZE_SDK_VERSION);
            case 1:
                return d4.d(str);
            case 2:
                return df.a(str, Constants.BRAZE_SDK_VERSION);
            case 3:
                return g0.d(str);
            case 4:
                return i4.b(str);
            case 5:
                return i5.a(str);
            case 6:
                return ih.a(str);
            case 7:
                return j9.b(str);
            case 8:
                return nb.a(str);
            case 9:
                return o2.a(str);
            case 10:
                return t2.d(str);
            case 11:
                return t2.b(str);
            case 12:
                return v6.a(str);
            case 13:
                return vg.b(str);
            case 14:
                return w6.a(str);
            case 15:
                return w6.b(str);
            case 16:
                return w6.c(str);
            case 17:
                return w6.d(str);
            case 18:
                return xg.a(str);
            case 19:
                return zg.c(str);
            case 20:
                return DelayedInitializationAnalyticsBehavior.Companion.fromString$lambda$1(str);
            case 21:
                return PermissionUtils.hasPermission$lambda$0(str);
            case 22:
                return com.braze.support.c.b(str);
            default:
                return com.braze.support.d.a(str);
        }
    }
}
