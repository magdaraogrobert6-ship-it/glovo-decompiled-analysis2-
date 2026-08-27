package o;

import android.os.HandlerThread;
import android.text.TextUtils;
import com.deliveryhero.fwf_customer_profile.util.ConstantsKt;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.location.HwLocationResult;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.location.lite.common.util.NetworkUtil;
import com.huawei.location.logic.E5;
import com.huawei.location.nlp.network.OnlineLocationService;
import com.huawei.location.nlp.network.request.OnlineLocationRequest;
import com.huawei.location.nlp.network.request.cell.CellSourceInfo;
import com.huawei.location.nlp.network.request.wifi.WifiInfo;
import com.huawei.location.nlp.scan.FB;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class setOnCopyRequested {
    public static volatile setOnCopyRequested read;
    public static final byte[] write = new byte[0];
    public final PriorityBlockingQueue IconCompatParcelizer;
    public final long MediaBrowserCompatMediaItem;
    public setOnAutofillRequested MediaDescriptionCompat;
    public final int ParcelableVolumeInfo;
    public final long PlaybackStateCompatCustomAction;
    public final i$d.a RatingCompat;
    public final toAutofillIdCompat RemoteActionCompatParcelizer;
    public boolean MediaSessionCompatToken = true;
    public boolean MediaSessionCompatQueueItem = false;
    public long MediaMetadataCompat = -1;
    public final OnlineLocationService serializer = new OnlineLocationService();

    public static void IconCompatParcelizer(setOnCopyRequested setoncopyrequested, boolean z) {
        String str;
        List<CellSourceInfo> list;
        boolean zSerializer;
        List<CellSourceInfo> list2;
        if (NetworkUtil.RemoteActionCompatParcelizer(placeAtf8xVGno.read()) && onPrepareActionMode.RemoteActionCompatParcelizer(placeAtf8xVGno.read())) {
            if (z) {
                setoncopyrequested.RemoteActionCompatParcelizer.removeMessages(0);
                setoncopyrequested.RemoteActionCompatParcelizer.sendEmptyMessageDelayed(0, setoncopyrequested.MediaMetadataCompat);
            }
            OnlineLocationRequest onlineLocationRequest = new OnlineLocationRequest();
            int i = setoncopyrequested.ParcelableVolumeInfo;
            if (i == 1) {
                onlineLocationRequest.setWifiScanResult(updateMenuItemsui.read().RemoteActionCompatParcelizer);
                zSerializer = updateMenuItemsui.read().RemoteActionCompatParcelizer();
            } else if (i == 2) {
                updateMenuItemsui updatemenuitemsui = updateMenuItemsui.read();
                synchronized (updatemenuitemsui) {
                    list2 = updatemenuitemsui.write;
                }
                onlineLocationRequest.setCellInfos(list2);
                zSerializer = updateMenuItemsui.read().serializer();
            } else {
                List<WifiInfo> list3 = updateMenuItemsui.read().RemoteActionCompatParcelizer;
                boolean zRemoteActionCompatParcelizer = updateMenuItemsui.read().RemoteActionCompatParcelizer();
                if (zRemoteActionCompatParcelizer) {
                    onlineLocationRequest.setWifiScanResult(list3);
                }
                updateMenuItemsui updatemenuitemsui2 = updateMenuItemsui.read();
                synchronized (updatemenuitemsui2) {
                    list = updatemenuitemsui2.write;
                }
                boolean zSerializer2 = updateMenuItemsui.read().serializer();
                if (zSerializer2) {
                    onlineLocationRequest.setCellInfos(list);
                }
                if (setoncopyrequested.MediaSessionCompatToken) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPClient", "The first online location request verifies only Wi-Fi availability.");
                    setoncopyrequested.MediaSessionCompatToken = false;
                    zSerializer = zRemoteActionCompatParcelizer;
                } else {
                    zSerializer = zRemoteActionCompatParcelizer || zSerializer2;
                }
            }
            setOnAutofillRequested setonautofillrequested = setoncopyrequested.MediaDescriptionCompat;
            if (setonautofillrequested == null) {
                str = "mLocationProviderCallback is null, return here";
            } else {
                try {
                    if (zSerializer) {
                        setoncopyrequested.MediaSessionCompatQueueItem = true;
                        setonautofillrequested.onLocationChanged(setoncopyrequested.serializer.getLocationFromCloud(onlineLocationRequest));
                        return;
                    } else {
                        setoncopyrequested.MediaSessionCompatQueueItem = false;
                        WrappedCompositionsetContent1211.read("NLPClient", "doRequest, cache is invalid");
                        setoncopyrequested.MediaDescriptionCompat.onLocationChanged(new HwLocationResult(LocationStatusCode.ARGUMENTS_EMPTY, ContentCaptureSessionCompat.IconCompatParcelizer(LocationStatusCode.ARGUMENTS_EMPTY)));
                        return;
                    }
                } catch (Exception e) {
                    str = "mLocationProviderCallback onLocationChanged error: " + e.getMessage();
                }
            }
        } else {
            str = "doRequest fail, Network or LocationEnabled is not available";
        }
        WrappedCompositionsetContent1211.read("NLPClient", str);
    }

    public final void RemoteActionCompatParcelizer() {
        LocationRequest locationRequest;
        RequestLocationUpdatesRequest requestLocationUpdatesRequest = (RequestLocationUpdatesRequest) this.IconCompatParcelizer.peek();
        if (requestLocationUpdatesRequest == null || (locationRequest = requestLocationUpdatesRequest.getLocationRequest()) == null) {
            return;
        }
        long interval = locationRequest.getInterval();
        if (interval == this.MediaMetadataCompat) {
            return;
        }
        this.MediaMetadataCompat = Math.min(Math.max(interval, this.PlaybackStateCompatCustomAction * 1000), this.MediaBrowserCompatMediaItem * 1000);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPClient", "currentInterval is " + this.MediaMetadataCompat);
        ((ViewCompatShims) this.RatingCompat.read).RemoteActionCompatParcelizer(this.MediaMetadataCompat);
    }

    public final void write() {
        if (this.IconCompatParcelizer.isEmpty()) {
            return;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPClient", "startRequest");
        if (this.RemoteActionCompatParcelizer.hasMessages(0)) {
            this.RemoteActionCompatParcelizer.removeMessages(0);
        }
        this.RemoteActionCompatParcelizer.sendEmptyMessage(0);
        ((ViewCompatShims) this.RatingCompat.read).p_();
    }

    public final void serializer() {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPClient", "stopRequest");
        if (this.RemoteActionCompatParcelizer.hasMessages(0)) {
            this.RemoteActionCompatParcelizer.removeMessages(0);
        }
        ((ViewCompatShims) this.RatingCompat.read).read();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0136 A[Catch: NumberFormatException -> 0x0149, TryCatch #0 {NumberFormatException -> 0x0149, blocks: (B:13:0x0130, B:15:0x0136, B:16:0x013c, B:18:0x0142), top: B:22:0x0130 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0142 A[Catch: NumberFormatException -> 0x0149, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0149, blocks: (B:13:0x0130, B:15:0x0136, B:16:0x013c, B:18:0x0142), top: B:22:0x0130 }] */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    public setOnCopyRequested() {
        Object obj;
        String strWrite;
        String strWrite2;
        this.PlaybackStateCompatCustomAction = 2L;
        this.MediaBrowserCompatMediaItem = ConstantsKt.DEFAULT_PROFILE_TTL;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        i$d.a aVar = new i$d.a(18, this);
        i$d.a aVar2 = new i$d.a(20, false);
        int iIconCompatParcelizer = i$d.a.IconCompatParcelizer();
        int i2 = 5;
        try {
            if (iIconCompatParcelizer == 0) {
                toAutofillId toautofillid = new toAutofillId(aVar);
                toautofillid.read = true;
                toautofillid.MediaSessionCompatQueueItem = true;
                toautofillid.MediaMetadataCompat = true;
                toautofillid.MediaDescriptionCompat = new AutofillIdCompat(toautofillid, i);
                toautofillid.RemoteActionCompatParcelizer = new AutofillIdCompat(toautofillid, z ? 1 : 0);
                toautofillid.IconCompatParcelizer = new E5(5);
                toautofillid.serializer = new toContentCaptureSessionCompat();
                HandlerThread handlerThread = new HandlerThread("FullSDK-onlineLocation-scan");
                handlerThread.start();
                toautofillid.write = new toAutofillIdCompat(toautofillid, handlerThread.getLooper(), i2);
                obj = toautofillid;
            } else {
                if (iIconCompatParcelizer != 1) {
                    if (iIconCompatParcelizer != 2) {
                        aVar2.read = new toContentCaptureSession((int) (z4 ? 1 : 0));
                    } else {
                        ContentCaptureSessionCompatApi23Impl contentCaptureSessionCompatApi23Impl = new ContentCaptureSessionCompatApi23Impl(aVar, z2 ? 1 : 0);
                        contentCaptureSessionCompatApi23Impl.IconCompatParcelizer = false;
                        contentCaptureSessionCompatApi23Impl.read = true;
                        contentCaptureSessionCompatApi23Impl.MediaMetadataCompat = new i$d.a(19, contentCaptureSessionCompatApi23Impl);
                        contentCaptureSessionCompatApi23Impl.write = new toContentCaptureSessionCompat();
                        HandlerThread handlerThread2 = new HandlerThread("FullSDK-onlineLocation-scan");
                        handlerThread2.start();
                        contentCaptureSessionCompatApi23Impl.RemoteActionCompatParcelizer = new toAutofillIdCompat(contentCaptureSessionCompatApi23Impl, handlerThread2.getLooper(), 6);
                        obj = contentCaptureSessionCompatApi23Impl;
                    }
                    this.RatingCompat = aVar2;
                    this.ParcelableVolumeInfo = i$d.a.IconCompatParcelizer();
                    HandlerThread handlerThread3 = new HandlerThread("FullSDK-onlineLocation-request");
                    handlerThread3.start();
                    this.RemoteActionCompatParcelizer = new toAutofillIdCompat(this, handlerThread3.getLooper(), z3 ? 1 : 0);
                    this.IconCompatParcelizer = new PriorityBlockingQueue(11, new FB(16));
                    LayoutNodeSubcompositionsStateScope layoutNodeSubcompositionsStateScope = WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2onStateChanged1.serializer;
                    strWrite = layoutNodeSubcompositionsStateScope.write("position_min_interval");
                    strWrite2 = layoutNodeSubcompositionsStateScope.write("position_max_interval");
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPClient", "minInterval is " + strWrite + ", maxInterval is " + strWrite2);
                    if (!TextUtils.isEmpty(strWrite)) {
                        this.PlaybackStateCompatCustomAction = Long.parseLong(strWrite);
                    }
                    if (TextUtils.isEmpty(strWrite2)) {
                        return;
                    }
                    this.MediaBrowserCompatMediaItem = Long.parseLong(strWrite2);
                    return;
                }
                ContentCaptureSessionCompatApi23Impl contentCaptureSessionCompatApi23Impl2 = new ContentCaptureSessionCompatApi23Impl(aVar, i);
                contentCaptureSessionCompatApi23Impl2.IconCompatParcelizer = false;
                contentCaptureSessionCompatApi23Impl2.read = true;
                contentCaptureSessionCompatApi23Impl2.MediaMetadataCompat = new i$d.a(21, contentCaptureSessionCompatApi23Impl2);
                contentCaptureSessionCompatApi23Impl2.write = new E5(5);
                HandlerThread handlerThread4 = new HandlerThread("FullSDK-onlineLocation-scan");
                handlerThread4.start();
                contentCaptureSessionCompatApi23Impl2.RemoteActionCompatParcelizer = new toAutofillIdCompat(contentCaptureSessionCompatApi23Impl2, handlerThread4.getLooper(), 7);
                obj = contentCaptureSessionCompatApi23Impl2;
            }
            if (!TextUtils.isEmpty(strWrite)) {
                this.PlaybackStateCompatCustomAction = Long.parseLong(strWrite);
            }
            if (TextUtils.isEmpty(strWrite2)) {
                this.MediaBrowserCompatMediaItem = Long.parseLong(strWrite2);
                return;
            }
            return;
        } catch (NumberFormatException unused) {
            WrappedCompositionsetContent1211.read("NLPClient", "parse interval fail ");
            return;
        }
        aVar2.read = obj;
        this.RatingCompat = aVar2;
        this.ParcelableVolumeInfo = i$d.a.IconCompatParcelizer();
        HandlerThread handlerThread5 = new HandlerThread("FullSDK-onlineLocation-request");
        handlerThread5.start();
        this.RemoteActionCompatParcelizer = new toAutofillIdCompat(this, handlerThread5.getLooper(), z3 ? 1 : 0);
        this.IconCompatParcelizer = new PriorityBlockingQueue(11, new FB(16));
        LayoutNodeSubcompositionsStateScope layoutNodeSubcompositionsStateScope2 = WindowRecomposer_androidKtcreateLifecycleAwareWindowRecomposer2onStateChanged1.serializer;
        strWrite = layoutNodeSubcompositionsStateScope2.write("position_min_interval");
        strWrite2 = layoutNodeSubcompositionsStateScope2.write("position_max_interval");
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPClient", "minInterval is " + strWrite + ", maxInterval is " + strWrite2);
    }

    public final void IconCompatParcelizer(RequestLocationUpdatesRequest requestLocationUpdatesRequest) {
        if (requestLocationUpdatesRequest.getLocationRequest() == null) {
            return;
        }
        PriorityBlockingQueue priorityBlockingQueue = this.IconCompatParcelizer;
        priorityBlockingQueue.add(requestLocationUpdatesRequest);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPClient", "requestLocationUpdates, nlpCache size is " + priorityBlockingQueue.size());
        long j = this.MediaMetadataCompat;
        if (j <= DeviceOrientationRequest.OUTPUT_PERIOD_FAST && j > 0) {
            RemoteActionCompatParcelizer();
        } else {
            RemoteActionCompatParcelizer();
            write();
        }
    }

    public static setOnCopyRequested IconCompatParcelizer() {
        if (read == null) {
            synchronized (write) {
                if (read == null) {
                    read = new setOnCopyRequested();
                }
            }
        }
        return read;
    }

    public final void read(RequestLocationUpdatesRequest requestLocationUpdatesRequest) {
        PriorityBlockingQueue priorityBlockingQueue = this.IconCompatParcelizer;
        priorityBlockingQueue.remove(requestLocationUpdatesRequest);
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("NLPClient", "removeLocationUpdates, nlpCache size is " + priorityBlockingQueue.size());
        if (!priorityBlockingQueue.isEmpty()) {
            RemoteActionCompatParcelizer();
            return;
        }
        serializer();
        this.MediaMetadataCompat = -1L;
        this.MediaSessionCompatToken = true;
    }
}
