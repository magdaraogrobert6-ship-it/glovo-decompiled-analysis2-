package o;

import android.content.Context;
import com.roadrunner.common.data.api.ExecuteApiRequest;
import com.roadrunner.rider.state.data.RiderStatusSyncWorker;
import com.roadrunner.vendor.review.data.SubmitVendorReviewWorker;

/* JADX INFO: loaded from: classes3.dex */
public final class setPackageHandlerBackoffStrategy implements getViewWidget {
    private static int IconCompatParcelizer = 1;
    private static int write;
    public final Object RemoteActionCompatParcelizer;
    public final Object read;
    public final /* synthetic */ int serializer = 0;

    public setPackageHandlerBackoffStrategy(waitForUserDependencyThreadlambda1 waitforuserdependencythreadlambda1, ExecuteApiRequest executeApiRequest) {
        waitforuserdependencythreadlambda1.getClass();
        executeApiRequest.getClass();
        this.RemoteActionCompatParcelizer = waitforuserdependencythreadlambda1;
        this.read = executeApiRequest;
    }

    public setPackageHandlerBackoffStrategy(requestSingleLocationUpdatelambda1 requestsinglelocationupdatelambda1, r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8 r8lambda4txk7kovp_j84hgvzl3zo6mzli8) {
        this.RemoteActionCompatParcelizer = requestsinglelocationupdatelambda1;
        this.read = r8lambda4txk7kovp_j84hgvzl3zo6mzli8;
    }

    @Override // o.getViewWidget
    public final accesssetSpotShadowColor8_81llAjd read(Context context, androidx.work.WorkerParameters workerParameters) {
        int i = 2 % 2;
        int i2 = write + 117;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        Object obj = this.read;
        Object obj2 = this.RemoteActionCompatParcelizer;
        context.getClass();
        if (i4 != 0) {
            return new SubmitVendorReviewWorker(context, workerParameters, (waitForUserDependencyThreadlambda1) obj2, (ExecuteApiRequest) obj);
        }
        RiderStatusSyncWorker riderStatusSyncWorker = new RiderStatusSyncWorker(context, workerParameters, (requestSingleLocationUpdatelambda1) obj2, (r8lambda4TXK7kOVP_J84hgVZL3zO6MZLi8) obj);
        int i5 = IconCompatParcelizer + 43;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return riderStatusSyncWorker;
    }
}
