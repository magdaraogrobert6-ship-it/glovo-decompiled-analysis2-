package o;

import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.huawei.hms.location.HwLocationResult;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.location.lite.common.report.ReportBuilder;
import com.huawei.location.utils.FB$yn;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class getLifecycleAware extends com.huawei.location.callback.d2 {
    public final AtomicBoolean RemoteActionCompatParcelizer = new AtomicBoolean(true);
    public Location read;
    public Location write;

    public static Location write(Location location, Location location2) {
        String str;
        if (location == null && location2 == null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPCallback", "posEngineLoc & nativeNetworkLoc is null");
            return null;
        }
        if (location == null) {
            str = "posEngineLoc is null";
        } else {
            if (location2 == null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPCallback", "nativeNetworkLoc is null");
                return location;
            }
            if (!location.hasAccuracy()) {
                str = "posEngineLoc not hasAccuracy";
            } else {
                if (!location2.hasAccuracy()) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPCallback", "nativeLoc not hasAccuracy");
                    return location;
                }
                if (location.getAccuracy() < location2.getAccuracy()) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPCallback", "posEngineLoc acc is better");
                    return location;
                }
                str = "nativeLoc acc is better";
            }
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPCallback", str);
        return location2;
    }

    @Override // com.huawei.location.callback.d2, android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (location == null) {
            WrappedCompositionsetContent1211.read("NLPCallback", "receive native network loc is null");
            return;
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        try {
            extras.putInt("vendorType", 32);
        } catch (Throwable th) {
            SweepGradientShader9KIMszodefault.write("SafeBundle", new StringBuilder("putInt exception: "), th);
        }
        location.setExtras(extras);
        location.setProvider("network");
        this.write = location;
        StringBuilder sb = new StringBuilder("receive native network loc, isFirst is ");
        AtomicBoolean atomicBoolean = this.RemoteActionCompatParcelizer;
        sb.append(atomicBoolean);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPCallback", sb.toString());
        boolean z = atomicBoolean.get();
        Handler handler = this.serializer;
        if (z && (!handler.hasMessages(1002) || this.read != null)) {
            handler.removeMessages(1002);
            handler.sendEmptyMessage(1002);
        }
        if (this.MediaSessionCompatQueueItem.isResendFromHMS()) {
            HwLocationResult hwLocationResult = new HwLocationResult();
            hwLocationResult.setLocation(this.write);
            Message messageObtainMessage = handler.obtainMessage(1001);
            Bundle bundle = new Bundle();
            bundle.putParcelable("hwLocationResult", hwLocationResult);
            messageObtainMessage.setData(bundle);
            handler.sendMessage(messageObtainMessage);
        }
    }

    @Override // com.huawei.location.callback.d2
    public final void write(HwLocationResult hwLocationResult) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("receive posEngine loc, isFirst is ");
        AtomicBoolean atomicBoolean = this.RemoteActionCompatParcelizer;
        sb.append(atomicBoolean);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPCallback", sb.toString());
        boolean z = atomicBoolean.get();
        Handler handler = this.serializer;
        if (!z) {
            Location location = hwLocationResult.getLocation();
            Location location2 = this.write;
            if (location == null && location2 == null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPCallback", "compareElapsedRealtimeNanos both is null");
                location = null;
            } else {
                if (location == null) {
                    str = "posEngineLoc is null";
                } else {
                    if (location2 == null) {
                        str2 = "nativeLoc is null";
                    } else if (location.getElapsedRealtimeNanos() > location2.getElapsedRealtimeNanos() + 20000000000L) {
                        str2 = "nativeNetworkLoc elapsedRealtimeNanos is invalid";
                    } else if (location2.getElapsedRealtimeNanos() > location.getElapsedRealtimeNanos() + 20000000000L) {
                        str = "posEngineLoc elapsedRealtimeNanos is invalid";
                    } else {
                        location = write(location, location2);
                    }
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPCallback", str2);
                }
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPCallback", str);
                location = location2;
            }
            if (location == null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPCallback", "onLocationChanged bestLoc is null ");
                return;
            }
            hwLocationResult.setLocation(location);
            hwLocationResult.setCode(0);
            Message messageObtainMessage = handler.obtainMessage(1001);
            Bundle bundle = new Bundle();
            bundle.putParcelable("hwLocationResult", hwLocationResult);
            messageObtainMessage.setData(bundle);
            handler.sendMessage(messageObtainMessage);
            return;
        }
        this.read = hwLocationResult.getLocation();
        if (handler.hasMessages(1002) && this.write == null) {
            return;
        }
        handler.removeMessages(1002);
        handler.sendEmptyMessage(1002);
    }

    public getLifecycleAware(RequestLocationUpdatesRequest requestLocationUpdatesRequest, createAndInstallWindowRecomposerui createandinstallwindowrecomposerui) {
        FB$yn fB$yn = new FB$yn();
        ReportBuilder reportBuilder = fB$yn.IconCompatParcelizer;
        reportBuilder.setApiName("Location_locationCallback");
        reportBuilder.setTransactionID(requestLocationUpdatesRequest.getTid());
        this.RatingCompat = fB$yn;
        this.MediaDescriptionCompat = createandinstallwindowrecomposerui;
        this.MediaSessionCompatQueueItem = requestLocationUpdatesRequest;
        this.serializer.sendEmptyMessageDelayed(1002, ConstantsKt.DEFAULT_REQUEST_TIMEOUT);
    }

    @Override // com.huawei.location.callback.d2
    public final void serializer(boolean z, boolean z2) {
        if (z) {
            return;
        }
        read(false);
    }

    @Override // com.huawei.location.callback.d2
    public final void read() {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPCallback", "handleFirstDelayMsg");
        Location locationWrite = write(this.read, this.write);
        if (locationWrite == null) {
            WrappedCompositionsetContent1211.read("NLPCallback", "handleFirstDelayMsg, accLocation is null");
            return;
        }
        HwLocationResult hwLocationResult = new HwLocationResult();
        hwLocationResult.setCode(0);
        hwLocationResult.setLocation(locationWrite);
        Bundle bundle = new Bundle();
        bundle.putParcelable("hwLocationResult", hwLocationResult);
        serializer(bundle);
    }

    @Override // com.huawei.location.callback.d2
    public void serializer(Bundle bundle) {
        Parcelable parcelable;
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
            this.RemoteActionCompatParcelizer.set(false);
            read(hwLocationResult);
        }
    }
}
