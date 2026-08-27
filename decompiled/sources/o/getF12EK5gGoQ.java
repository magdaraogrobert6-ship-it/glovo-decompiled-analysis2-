package o;

import com.google.android.gms.internal.gtm.zzbv;
import io.grpc.LoadBalancer$Helper;

/* JADX INFO: loaded from: classes2.dex */
public final class getF12EK5gGoQ extends getDirectionDownRightEK5gGoQ {
    public final /* synthetic */ int serializer;

    public /* synthetic */ getF12EK5gGoQ(int i) {
        this.serializer = i;
    }

    @Override // o.getDirectionDownRightEK5gGoQ
    public final getFunctionEK5gGoQ IconCompatParcelizer(zzbv zzbvVar, getFunctionEK5gGoQ... getfunctionek5ggoqArr) {
        boolean z = true;
        accessgetSystemNavigationDowncp.RemoteActionCompatParcelizer(getfunctionek5ggoqArr.length == 2);
        try {
            double dRemoteActionCompatParcelizer = LoadBalancer$Helper.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[0]);
            double dRemoteActionCompatParcelizer2 = LoadBalancer$Helper.RemoteActionCompatParcelizer(getfunctionek5ggoqArr[1]);
            if (Double.isNaN(dRemoteActionCompatParcelizer) || Double.isNaN(dRemoteActionCompatParcelizer2)) {
                return new getGuideEK5gGoQ(Boolean.FALSE);
            }
            int i = this.serializer;
            if (i == 0 ? dRemoteActionCompatParcelizer < dRemoteActionCompatParcelizer2 : i == 1 ? dRemoteActionCompatParcelizer <= dRemoteActionCompatParcelizer2 : i == 2 ? dRemoteActionCompatParcelizer > dRemoteActionCompatParcelizer2 : dRemoteActionCompatParcelizer >= dRemoteActionCompatParcelizer2) {
                z = false;
            }
            return new getGuideEK5gGoQ(Boolean.valueOf(z));
        } catch (IllegalArgumentException unused) {
            return new getGuideEK5gGoQ(Boolean.FALSE);
        }
    }
}
