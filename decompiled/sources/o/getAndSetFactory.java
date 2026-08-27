package o;

import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.location.HwLocationResult;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.location.lite.common.adapter.LocationProxyAdapter;
import com.huawei.location.lite.common.exception.LocationServiceException;

/* JADX INFO: loaded from: classes4.dex */
public final class getAndSetFactory extends getLifecycleAware {
    public Location MediaSessionCompatToken;
    public Location ParcelableVolumeInfo;

    @Override // o.getLifecycleAware, com.huawei.location.callback.d2, android.location.LocationListener
    public final void onLocationChanged(Location location) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("FusedForGCallback", "fusedForG gnss location successful, location proxy status: " + LocationProxyAdapter.isLocationProxyEnable());
        if (location != null && "gps".equals(location.getProvider()) && LocationProxyAdapter.isLocationProxyEnable()) {
            return;
        }
        if (!stringArrayResource.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem)) {
            try {
                getOnSelectAllRequested.write().serializer(this.MediaSessionCompatQueueItem.getUuid());
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("FusedForGCallback", "request expiration and remove");
                return;
            } catch (LocationServiceException unused) {
                WrappedCompositionsetContent1211.read("FusedForGCallback", "throw locationServiceException");
                return;
            }
        }
        if (TextUtils.equals("gps", location.getProvider())) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("FusedForGCallback", "receive native gnss loc");
            HwLocationResult hwLocationResult = new HwLocationResult();
            hwLocationResult.setLocation(location);
            hwLocationResult.setCode(0);
            Handler handler = this.serializer;
            Message messageObtainMessage = handler.obtainMessage(1001);
            Bundle bundle = new Bundle();
            bundle.putParcelable("hwLocationResult", hwLocationResult);
            messageObtainMessage.setData(bundle);
            handler.sendMessage(messageObtainMessage);
            return;
        }
        super.onLocationChanged(location);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // o.getLifecycleAware, com.huawei.location.callback.d2
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
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("FusedForGCallback", "handlerFuesdLocation, location provider is " + location.getProvider());
        if ("gps".equals(location.getProvider())) {
            this.MediaSessionCompatToken = new Location(location);
        } else {
            this.ParcelableVolumeInfo = new Location(location);
        }
        Location location2 = this.MediaSessionCompatToken;
        Location location3 = this.ParcelableVolumeInfo;
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
                this.RemoteActionCompatParcelizer.set(false);
                read(hwLocationResult);
            }
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwBaseCallback", str);
        location2 = location3;
        if (write(location2)) {
            hwLocationResult.setLocation(location2);
            this.RemoteActionCompatParcelizer.set(false);
            read(hwLocationResult);
        }
    }

    public getAndSetFactory(RequestLocationUpdatesRequest requestLocationUpdatesRequest, createAndInstallWindowRecomposerui createandinstallwindowrecomposerui) {
        super(requestLocationUpdatesRequest, createandinstallwindowrecomposerui);
    }
}
