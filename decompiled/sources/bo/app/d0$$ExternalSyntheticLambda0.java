package bo.app;

import com.braze.location.GooglePlayLocationUtils;
import java.util.List;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.registerInAppMessageManagerlambda50;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0$$ExternalSyntheticLambda0 implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;

    public /* synthetic */ d0$$ExternalSyntheticLambda0(List list, int i) {
        this.$r8$classId = i;
        this.f$0 = list;
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        List list = this.f$0;
        switch (i) {
            case 0:
                return d0.b(list);
            case 1:
                Object obj = list.get(2);
                obj.getClass();
                return (Integer) obj;
            case 2:
                return k2.a(list);
            case 3:
                return qc.c(list);
            case 4:
                return vg.b(list);
            case 5:
                return vg.c(list);
            case 6:
                return GooglePlayLocationUtils.registerGeofencesWithGooglePlayIfNecessary$lambda$2(list);
            case 7:
                return GooglePlayLocationUtils.storeRegisteredGeofencesToLocalStorage$lambda$0(list);
            default:
                return ((registerInAppMessageManagerlambda50) list.get(0)).RemoteActionCompatParcelizer();
        }
    }
}
