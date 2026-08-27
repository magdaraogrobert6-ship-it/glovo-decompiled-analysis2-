package o;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.huawei.hms.location.HwLocationResult;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.location.lite.common.adapter.LocationProxyAdapter;
import com.huawei.location.lite.common.exception.LocationServiceException;
import com.huawei.location.lite.common.report.ReportBuilder;
import com.huawei.location.utils.FB$yn;

/* JADX INFO: loaded from: classes4.dex */
public final class WindowRecomposerPolicy extends com.huawei.location.callback.d2 {
    public Location RemoteActionCompatParcelizer;
    public Location read;

    @Override // com.huawei.location.callback.d2, android.location.LocationListener
    public final void onLocationChanged(Location location) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwFusedCallback", "fused gnss location successful, location proxy status: " + LocationProxyAdapter.isLocationProxyEnable());
        if (location != null && "gps".equals(location.getProvider()) && LocationProxyAdapter.isLocationProxyEnable()) {
            return;
        }
        if (!stringArrayResource.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem)) {
            try {
                getOnSelectAllRequested.write().serializer(this.MediaSessionCompatQueueItem.getUuid());
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwFusedCallback", "request expiration and remove");
                return;
            } catch (LocationServiceException unused) {
                WrappedCompositionsetContent1211.read("HwFusedCallback", "throw locationServiceException");
                return;
            }
        }
        HwLocationResult hwLocationResult = new HwLocationResult();
        hwLocationResult.setLocation(location);
        write(hwLocationResult);
    }

    public WindowRecomposerPolicy(RequestLocationUpdatesRequest requestLocationUpdatesRequest, createAndInstallWindowRecomposerui createandinstallwindowrecomposerui) {
        FB$yn fB$yn = new FB$yn();
        ReportBuilder reportBuilder = fB$yn.IconCompatParcelizer;
        reportBuilder.setApiName("Location_locationCallback");
        reportBuilder.setTransactionID(requestLocationUpdatesRequest.getTid());
        this.RatingCompat = fB$yn;
        this.MediaDescriptionCompat = createandinstallwindowrecomposerui;
        this.MediaSessionCompatQueueItem = requestLocationUpdatesRequest;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // com.huawei.location.callback.d2
    public final void serializer(Bundle bundle) {
        Parcelable parcelable;
        String str;
        String str2;
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
        if (RemoteActionCompatParcelizer(hwLocationResult)) {
            return;
        }
        Location location = hwLocationResult.getLocation();
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwFusedCallback", "handlerFuesdLocation, location provider is " + location.getProvider());
        if ("gps".equals(location.getProvider())) {
            this.read = new Location(location);
        } else {
            this.RemoteActionCompatParcelizer = new Location(location);
        }
        Location location2 = this.read;
        Location location3 = this.RemoteActionCompatParcelizer;
        if (location2 == null) {
            str = "gnssTempLocation is null";
        } else {
            if (location3 == null) {
                str2 = "nlpTempLocation is null";
            } else if (location2.getElapsedRealtimeNanos() >= SystemClock.elapsedRealtimeNanos() - 20000000000L) {
                str2 = "gnssLocation is better";
            } else {
                str = "network location is better";
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwBaseCallback", str2);
            if (write(location2)) {
                hwLocationResult.setLocation(location2);
                read(hwLocationResult);
            }
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwBaseCallback", str);
        location2 = location3;
        if (write(location2)) {
            hwLocationResult.setLocation(location2);
            read(hwLocationResult);
        }
    }

    @Override // com.huawei.location.callback.d2
    public final void serializer(boolean z, boolean z2) {
        if (z) {
            return;
        }
        read(false);
    }
}
