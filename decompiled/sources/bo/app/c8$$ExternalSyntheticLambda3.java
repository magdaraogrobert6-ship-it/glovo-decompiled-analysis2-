package bo.app;

import java.util.List;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.registerInAppMessageManagerlambda50;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c8$$ExternalSyntheticLambda3 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;

    public /* synthetic */ c8$$ExternalSyntheticLambda3(List list, int i) {
        this.$r8$classId = i;
        this.f$0 = list;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        List list = this.f$0;
        if (i != 0) {
            return i != 1 ? list : ((registerInAppMessageManagerlambda50) list.get(0)).RemoteActionCompatParcelizer();
        }
        return c8.a(list);
    }
}
