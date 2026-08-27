package bo.app;

import java.util.ArrayList;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.registerInAppMessageManagerlambda50;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0$$ExternalSyntheticLambda8 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;

    public /* synthetic */ g0$$ExternalSyntheticLambda8(int i, ArrayList arrayList) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        ArrayList arrayList = this.f$0;
        if (i == 0) {
            return g0.a(arrayList);
        }
        if (i == 1) {
            return o8.a(arrayList);
        }
        if (i == 2) {
            return vg.g(arrayList);
        }
        if (i != 3) {
            return i != 4 ? ((registerInAppMessageManagerlambda50) arrayList.get(0)).RemoteActionCompatParcelizer() : arrayList.iterator();
        }
        return wf.a(arrayList);
    }
}
