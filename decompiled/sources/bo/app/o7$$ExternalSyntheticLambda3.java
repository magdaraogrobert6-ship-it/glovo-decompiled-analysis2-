package bo.app;

import java.util.LinkedHashMap;
import java.util.Map;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o7$$ExternalSyntheticLambda3 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LinkedHashMap f$0;

    public /* synthetic */ o7$$ExternalSyntheticLambda3(LinkedHashMap linkedHashMap, int i) {
        this.$r8$classId = i;
        this.f$0 = linkedHashMap;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        LinkedHashMap linkedHashMap = this.f$0;
        if (i != 0) {
            return i != 1 ? zg.a(linkedHashMap) : sc.a(linkedHashMap);
        }
        return o7.a((Map) linkedHashMap);
    }
}
