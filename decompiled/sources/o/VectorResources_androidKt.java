package o;

import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.huawei.location.vdr.VdrManager;
import com.huawei.riemann.gnsslocation.core.bean.obs.GnssRawObservation;
import com.huawei.riemann.gnsslocation.core.bean.sensor.MotionSensors;

/* JADX INFO: loaded from: classes2.dex */
public final class VectorResources_androidKt {
    public GnssRawObservation[] IconCompatParcelizer;
    public long MediaBrowserCompatMediaItem;
    public Handler MediaDescriptionCompat;
    public long RatingCompat = -1;
    public VdrManager RemoteActionCompatParcelizer;
    public final ComposeScrollCaptureCallback read;
    public final onScrollCaptureEnd serializer;
    public Location write;

    public final void serializer(GnssRawObservation[] gnssRawObservationArr, long j) {
        VdrManager vdrManager;
        synchronized (this) {
            Handler handler = this.MediaDescriptionCompat;
            if (handler == null) {
                WrappedCompositionsetContent1211.read("VdrDataManager", "handler is null,can not handler data");
                return;
            }
            handler.removeCallbacksAndMessages(null);
            Handler handler2 = this.MediaDescriptionCompat;
            if (gnssRawObservationArr == null) {
                handler2.sendMessageDelayed(handler2.obtainMessage(10), 1000L);
            } else {
                handler2.sendMessageDelayed(handler2.obtainMessage(10), 1300L);
            }
            MotionSensors motionSensorsSerializer = this.read.serializer(this.RatingCompat, j);
            this.RatingCompat = j;
            if (motionSensorsSerializer != null && (vdrManager = this.RemoteActionCompatParcelizer) != null) {
                Location location = this.write;
                loadVectorResourceInnerdefault loadvectorresourceinnerdefault = new loadVectorResourceInnerdefault();
                loadvectorresourceinnerdefault.RemoteActionCompatParcelizer = gnssRawObservationArr;
                loadvectorresourceinnerdefault.read = motionSensorsSerializer;
                loadvectorresourceinnerdefault.write = location;
                vdrManager.onVdrDataReceived(loadvectorresourceinnerdefault);
                this.write = null;
            }
        }
    }

    public VectorResources_androidKt() {
        boolean zRegisterGnssMeasurementsCallback;
        onScrollCaptureEnd onscrollcaptureend = new onScrollCaptureEnd();
        this.serializer = onscrollcaptureend;
        onscrollcaptureend.RemoteActionCompatParcelizer = this;
        HandlerThread handlerThread = new HandlerThread("Loc-Vdr-gnssMeasure");
        onscrollcaptureend.MediaSessionCompatQueueItem = handlerThread;
        handlerThread.start();
        onscrollcaptureend.write = new Handler(onscrollcaptureend.MediaSessionCompatQueueItem.getLooper());
        try {
            Object systemService = placeAtf8xVGno.read().getSystemService("location");
            if (systemService instanceof LocationManager) {
                onscrollcaptureend.IconCompatParcelizer = (LocationManager) systemService;
                if (getTitleResource.read(placeAtf8xVGno.read(), "android.permission.ACCESS_FINE_LOCATION")) {
                    zRegisterGnssMeasurementsCallback = onscrollcaptureend.IconCompatParcelizer.registerGnssMeasurementsCallback(onscrollcaptureend.serializer, onscrollcaptureend.write);
                } else {
                    WrappedCompositionsetContent1211.read("GnssMeasurementsProvider", "init fail because of checkSelfPermission fail");
                }
                this.read = new ComposeScrollCaptureCallback();
                HandlerThread handlerThread2 = new HandlerThread("Loc-vdr-data");
                handlerThread2.start();
                this.MediaDescriptionCompat = new Handler(handlerThread2.getLooper(), new Handler.Callback() { // from class: o.stringResource
                    @Override // android.os.Handler.Callback
                    public final boolean handleMessage(Message message) {
                        int i = message.what;
                        VectorResources_androidKt vectorResources_androidKt = this.RemoteActionCompatParcelizer;
                        if (i == 10) {
                            vectorResources_androidKt.serializer(null, SystemClock.elapsedRealtimeNanos());
                            return false;
                        }
                        if (i != 11) {
                            return false;
                        }
                        vectorResources_androidKt.serializer(vectorResources_androidKt.IconCompatParcelizer, vectorResources_androidKt.MediaBrowserCompatMediaItem);
                        return false;
                    }
                });
            }
            zRegisterGnssMeasurementsCallback = false;
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("GnssMeasurementsProvider", "RegisterMeasurements:" + zRegisterGnssMeasurementsCallback);
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("GnssMeasurementsProvider", "registerGnssMeasurements error.");
        }
        this.read = new ComposeScrollCaptureCallback();
        HandlerThread handlerThread3 = new HandlerThread("Loc-vdr-data");
        handlerThread3.start();
        this.MediaDescriptionCompat = new Handler(handlerThread3.getLooper(), new Handler.Callback() { // from class: o.stringResource
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                int i = message.what;
                VectorResources_androidKt vectorResources_androidKt = this.RemoteActionCompatParcelizer;
                if (i == 10) {
                    vectorResources_androidKt.serializer(null, SystemClock.elapsedRealtimeNanos());
                    return false;
                }
                if (i != 11) {
                    return false;
                }
                vectorResources_androidKt.serializer(vectorResources_androidKt.IconCompatParcelizer, vectorResources_androidKt.MediaBrowserCompatMediaItem);
                return false;
            }
        });
    }
}
