package o;

import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.hms.location.HwLocationResult;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.location.lite.common.report.ReportBuilder;
import com.huawei.location.utils.FB$yn;

/* JADX INFO: loaded from: classes4.dex */
public final class setFactory extends com.huawei.location.callback.d2 {
    @Override // com.huawei.location.callback.d2
    public final void serializer(Bundle bundle) {
        Parcelable parcelable;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwCommonCallback", "handlerLocation");
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            parcelable = bundle.getParcelable("hwLocationResult");
        } catch (Throwable th) {
            SweepGradientShader9KIMszodefault.write("SafeBundle", new StringBuilder("getParcelable exception: "), th);
            parcelable = null;
        }
        HwLocationResult hwLocationResult = (HwLocationResult) parcelable;
        if (!RemoteActionCompatParcelizer(hwLocationResult) && write(hwLocationResult.getLocation())) {
            read(hwLocationResult);
        }
    }

    public setFactory(RequestLocationUpdatesRequest requestLocationUpdatesRequest, createAndInstallWindowRecomposerui createandinstallwindowrecomposerui) {
        FB$yn fB$yn = new FB$yn();
        ReportBuilder reportBuilder = fB$yn.IconCompatParcelizer;
        reportBuilder.setApiName("Location_locationCallback");
        reportBuilder.setTransactionID(requestLocationUpdatesRequest.getTid());
        this.RatingCompat = fB$yn;
        this.MediaDescriptionCompat = createandinstallwindowrecomposerui;
        this.MediaSessionCompatQueueItem = requestLocationUpdatesRequest;
    }

    @Override // com.huawei.location.callback.d2
    public final void serializer(boolean z, boolean z2) {
        if (z && z2) {
            return;
        }
        read(false);
    }
}
