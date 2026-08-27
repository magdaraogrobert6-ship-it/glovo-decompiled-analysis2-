package o;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcelable;
import com.huawei.hms.location.HwLocationResult;
import com.huawei.location.lite.common.adapter.LocationProxyAdapter;
import com.huawei.location.lite.common.exception.LocationServiceException;
import com.huawei.riemann.location.common.utils.Constant;

/* JADX INFO: loaded from: classes4.dex */
public final class LifecycleAwarelambda0 extends com.huawei.location.callback.d2 {
    @Override // com.huawei.location.callback.d2, android.location.LocationListener
    public final void onLocationChanged(Location location) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HDLocationCallback", "gnss location successful, location proxy status: " + LocationProxyAdapter.isLocationProxyEnable());
        if (location != null && "gps".equals(location.getProvider()) && LocationProxyAdapter.isLocationProxyEnable()) {
            return;
        }
        if (!stringArrayResource.RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem)) {
            try {
                getOnSelectAllRequested.write().serializer(this.MediaSessionCompatQueueItem.getUuid());
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HDLocationCallback", "request expiration and remove");
                return;
            } catch (LocationServiceException unused) {
                WrappedCompositionsetContent1211.read("HDLocationCallback", "HDLocationCallback throw locationServiceException");
                return;
            }
        }
        HwLocationResult hwLocationResult = new HwLocationResult();
        hwLocationResult.setLocation(location);
        write(hwLocationResult);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // com.huawei.location.callback.d2
    public final void serializer(Bundle bundle) {
        Parcelable parcelable;
        String str;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HDLocationCallback", "handlerLocation");
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
        if (location != null) {
            Bundle extras = location.getExtras();
            if (extras == null) {
                str = "modifySourceType extras is Empty, modifySourceType fail.";
            } else {
                try {
                    if (extras.containsKey(Constant.LOCATION_SOURCE_TYPE)) {
                        try {
                            extras.putInt(Constant.LOCATION_SOURCE_TYPE, extras.getInt(Constant.LOCATION_SOURCE_TYPE) & 247);
                        } catch (Throwable th2) {
                            SweepGradientShader9KIMszodefault.write("SafeBundle", new StringBuilder("putInt exception: "), th2);
                        }
                    }
                } catch (Throwable unused) {
                    ComposeScrollCaptureCallbackonScrollCaptureImageRequest2.IconCompatParcelizer("SafeBundle", "containsKey exception. key:");
                }
                location.setExtras(extras);
            }
            if (write(hwLocationResult.getLocation())) {
                read(hwLocationResult);
            }
        }
        str = "modifySourceType location is Empty, modifySourceType fail.";
        WrappedCompositionsetContent1211.read("HDLocationCallback", str);
        if (write(hwLocationResult.getLocation())) {
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
