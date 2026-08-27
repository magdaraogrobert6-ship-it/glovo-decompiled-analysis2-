package o;

import com.huawei.location.activity.RiemannSoftArService;
import com.huawei.location.lite.common.exception.LocationServiceException;

/* JADX INFO: loaded from: classes4.dex */
public final class getOnViewCreatedCallbackannotations implements Runnable {
    public final /* synthetic */ RiemannSoftArService write;

    public getOnViewCreatedCallbackannotations(RiemannSoftArService riemannSoftArService) {
        this.write = riemannSoftArService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RiemannSoftArService riemannSoftArService = this.write;
        try {
            Thread.currentThread().setName("Location-ACTIVITY-RiemannSoftArService");
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("RiemannSoftArService", "start to get result when data is enough!");
            riemannSoftArService.recognitionMappingManager.send(riemannSoftArService.getDetectedActivities());
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("RiemannSoftArService", "RiemannSoftArService Task run end");
        } catch (LocationServiceException e) {
            throw e;
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.serializer("RiemannSoftArService", "RiemannSoftArService Task run exception");
        }
    }
}
