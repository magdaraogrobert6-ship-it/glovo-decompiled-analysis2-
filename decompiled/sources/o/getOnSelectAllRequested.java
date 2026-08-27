package o;

import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.location.lite.common.exception.LocationServiceException;
import com.huawei.location.logic.E5;
import com.huawei.location.logic.zp;
import com.huawei.location.utils.FB$yn;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class getOnSelectAllRequested {
    public static final boolean RemoteActionCompatParcelizer = PrimaryTextActionModeCallback.RemoteActionCompatParcelizer();
    public static final byte[] read = new byte[0];
    public static volatile getOnSelectAllRequested serializer;
    public final i$d.a IconCompatParcelizer;
    public E5 RatingCompat;
    public Handler write;

    /* JADX WARN: Code duplicated, block: B:36:0x0148 A[Catch: all -> 0x0195, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x0022, B:9:0x002c, B:49:0x018c, B:11:0x0031, B:14:0x003b, B:34:0x0141, B:36:0x0148, B:37:0x015d, B:39:0x0172, B:46:0x0185, B:15:0x0041, B:18:0x004b, B:20:0x0053, B:21:0x0080, B:23:0x0084, B:25:0x00de, B:24:0x00b4, B:26:0x00e4, B:29:0x00ee, B:30:0x0115, B:33:0x011e, B:7:0x001b), top: B:55:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0172 A[Catch: all -> 0x0195, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x0022, B:9:0x002c, B:49:0x018c, B:11:0x0031, B:14:0x003b, B:34:0x0141, B:36:0x0148, B:37:0x015d, B:39:0x0172, B:46:0x0185, B:15:0x0041, B:18:0x004b, B:20:0x0053, B:21:0x0080, B:23:0x0084, B:25:0x00de, B:24:0x00b4, B:26:0x00e4, B:29:0x00ee, B:30:0x0115, B:33:0x011e, B:7:0x001b), top: B:55:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x017d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0185 A[Catch: all -> 0x0195, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x0022, B:9:0x002c, B:49:0x018c, B:11:0x0031, B:14:0x003b, B:34:0x0141, B:36:0x0148, B:37:0x015d, B:39:0x0172, B:46:0x0185, B:15:0x0041, B:18:0x004b, B:20:0x0053, B:21:0x0080, B:23:0x0084, B:25:0x00de, B:24:0x00b4, B:26:0x00e4, B:29:0x00ee, B:30:0x0115, B:33:0x011e, B:7:0x001b), top: B:55:0x0001, inners: #1 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void RemoteActionCompatParcelizer(getGlobalKeyboardModifiersui getglobalkeyboardmodifiersui, createAndInstallWindowRecomposerui createandinstallwindowrecomposerui) {
        com.huawei.location.callback.d2 windowRecomposerPolicy;
        setOnCopyRequested setoncopyrequestedIconCompatParcelizer;
        int i;
        synchronized (this) {
            if (WindowRecomposerFactory.read().read(getglobalkeyboardmodifiersui.write.getUuid())) {
                try {
                    serializer(getglobalkeyboardmodifiersui.write.getUuid());
                } catch (LocationServiceException unused) {
                    WrappedCompositionsetContent1211.read("HwLocationManager", "requestLocationUpdates throw locationServiceException");
                }
            }
            RequestLocationUpdatesRequest requestLocationUpdatesRequest = getglobalkeyboardmodifiersui.write;
            String strSerializer = getglobalkeyboardmodifiersui.serializer();
            switch (strSerializer.hashCode()) {
                case -792039641:
                    if (!strSerializer.equals("passive")) {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "end");
                        return;
                    }
                    setFactory setfactory = new setFactory(requestLocationUpdatesRequest, createandinstallwindowrecomposerui);
                    setfactory.MediaMetadataCompat = write(getglobalkeyboardmodifiersui, setfactory);
                    getglobalkeyboardmodifiersui.IconCompatParcelizer = setfactory;
                    WindowRecomposerFactory.read().write(getglobalkeyboardmodifiersui);
                    createLifecycleAwareWindowRecomposerdefault.read().read(requestLocationUpdatesRequest, setfactory);
                    setImportantForContentCapture.IconCompatParcelizer().write(setfactory);
                    windowRecomposerPolicy = setfactory;
                    createandinstallwindowrecomposerui.MediaBrowserCompatMediaItem();
                    if (this.write == null) {
                        HandlerThread handlerThread = new HandlerThread("FullSDK-hwLocationManager-HwLocationManager");
                        handlerThread.start();
                        this.write = new Handler(handlerThread.getLooper());
                    }
                    this.write.postDelayed(new setOnPasteRequested(0, windowRecomposerPolicy), 100L);
                    i = getglobalkeyboardmodifiersui.read();
                    if (this.RatingCompat == null) {
                        this.RatingCompat = new E5(0);
                    }
                    if (i != 300 || i == 102 || i == 104) {
                        this.RatingCompat.PlaybackStateCompatCustomAction();
                    }
                    return;
                case 102570:
                    if (!strSerializer.equals("gps")) {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "end");
                        return;
                    }
                    windowRecomposerPolicy = new WindowRecomposerPolicy(getglobalkeyboardmodifiersui.write, createandinstallwindowrecomposerui);
                    windowRecomposerPolicy.MediaMetadataCompat = write(getglobalkeyboardmodifiersui, windowRecomposerPolicy);
                    getglobalkeyboardmodifiersui.IconCompatParcelizer = windowRecomposerPolicy;
                    WindowRecomposerFactory.read().write(getglobalkeyboardmodifiersui);
                    createLifecycleAwareWindowRecomposerdefault.read().read(getglobalkeyboardmodifiersui.write, windowRecomposerPolicy);
                    setImportantForContentCapture.IconCompatParcelizer().write(windowRecomposerPolicy);
                    createandinstallwindowrecomposerui.MediaBrowserCompatMediaItem();
                    if (this.write == null) {
                        HandlerThread handlerThread2 = new HandlerThread("FullSDK-hwLocationManager-HwLocationManager");
                        handlerThread2.start();
                        this.write = new Handler(handlerThread2.getLooper());
                    }
                    this.write.postDelayed(new setOnPasteRequested(0, windowRecomposerPolicy), 100L);
                    i = getglobalkeyboardmodifiersui.read();
                    if (this.RatingCompat == null) {
                        this.RatingCompat = new E5(0);
                    }
                    if (i != 300) {
                        this.RatingCompat.PlaybackStateCompatCustomAction();
                    } else {
                        this.RatingCompat.PlaybackStateCompatCustomAction();
                    }
                    return;
                case 97798435:
                    if (!strSerializer.equals("fused")) {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "end");
                        return;
                    }
                    if (getglobalkeyboardmodifiersui.write.isResendFromHMS()) {
                        windowRecomposerPolicy = new getAndSetFactory(getglobalkeyboardmodifiersui.write, createandinstallwindowrecomposerui);
                        windowRecomposerPolicy.MediaMetadataCompat = write(getglobalkeyboardmodifiersui, windowRecomposerPolicy);
                        getglobalkeyboardmodifiersui.IconCompatParcelizer = windowRecomposerPolicy;
                        createLifecycleAwareWindowRecomposerdefault.read().read(getglobalkeyboardmodifiersui.write, windowRecomposerPolicy);
                        setImportantForContentCapture.IconCompatParcelizer().write(windowRecomposerPolicy);
                        WindowRecomposerFactory.read().write(getglobalkeyboardmodifiersui);
                        this.IconCompatParcelizer.IconCompatParcelizer(getglobalkeyboardmodifiersui);
                    } else {
                        if (RemoteActionCompatParcelizer) {
                            windowRecomposerPolicy = new getAndSetFactory(getglobalkeyboardmodifiersui.write, createandinstallwindowrecomposerui);
                            windowRecomposerPolicy.MediaMetadataCompat = write(getglobalkeyboardmodifiersui, windowRecomposerPolicy);
                            getglobalkeyboardmodifiersui.IconCompatParcelizer = windowRecomposerPolicy;
                            createLifecycleAwareWindowRecomposerdefault.read().read(getglobalkeyboardmodifiersui.write, windowRecomposerPolicy);
                            setImportantForContentCapture.IconCompatParcelizer().write(windowRecomposerPolicy);
                            WindowRecomposerFactory.read().write(getglobalkeyboardmodifiersui);
                            this.IconCompatParcelizer.IconCompatParcelizer(getglobalkeyboardmodifiersui);
                            setoncopyrequestedIconCompatParcelizer = setOnCopyRequested.IconCompatParcelizer();
                        } else {
                            windowRecomposerPolicy = new WindowRecomposerPolicy(getglobalkeyboardmodifiersui.write, createandinstallwindowrecomposerui);
                            windowRecomposerPolicy.MediaMetadataCompat = write(getglobalkeyboardmodifiersui, windowRecomposerPolicy);
                            getglobalkeyboardmodifiersui.IconCompatParcelizer = windowRecomposerPolicy;
                            createLifecycleAwareWindowRecomposerdefault.read().read(getglobalkeyboardmodifiersui.write, windowRecomposerPolicy);
                            setImportantForContentCapture.IconCompatParcelizer().write(windowRecomposerPolicy);
                            WindowRecomposerFactory.read().write(getglobalkeyboardmodifiersui);
                            setoncopyrequestedIconCompatParcelizer = setOnCopyRequested.IconCompatParcelizer();
                        }
                        setoncopyrequestedIconCompatParcelizer.IconCompatParcelizer(getglobalkeyboardmodifiersui.write);
                    }
                    createandinstallwindowrecomposerui.MediaBrowserCompatMediaItem();
                    if (this.write == null) {
                        HandlerThread handlerThread3 = new HandlerThread("FullSDK-hwLocationManager-HwLocationManager");
                        handlerThread3.start();
                        this.write = new Handler(handlerThread3.getLooper());
                    }
                    this.write.postDelayed(new setOnPasteRequested(0, windowRecomposerPolicy), 100L);
                    i = getglobalkeyboardmodifiersui.read();
                    if (this.RatingCompat == null) {
                        this.RatingCompat = new E5(0);
                    }
                    if (i != 300) {
                        this.RatingCompat.PlaybackStateCompatCustomAction();
                    } else {
                        this.RatingCompat.PlaybackStateCompatCustomAction();
                    }
                    return;
                case 1843485230:
                    if (!strSerializer.equals("network")) {
                        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "end");
                        return;
                    }
                    windowRecomposerPolicy = IconCompatParcelizer(getglobalkeyboardmodifiersui, createandinstallwindowrecomposerui);
                    createandinstallwindowrecomposerui.MediaBrowserCompatMediaItem();
                    if (this.write == null) {
                        HandlerThread handlerThread4 = new HandlerThread("FullSDK-hwLocationManager-HwLocationManager");
                        handlerThread4.start();
                        this.write = new Handler(handlerThread4.getLooper());
                    }
                    this.write.postDelayed(new setOnPasteRequested(0, windowRecomposerPolicy), 100L);
                    i = getglobalkeyboardmodifiersui.read();
                    if (this.RatingCompat == null) {
                        this.RatingCompat = new E5(0);
                    }
                    if (i != 300) {
                        this.RatingCompat.PlaybackStateCompatCustomAction();
                    } else {
                        this.RatingCompat.PlaybackStateCompatCustomAction();
                    }
                    return;
                default:
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "end");
                    return;
            }
        }
    }

    public final void serializer(getGlobalKeyboardModifiersui getglobalkeyboardmodifiersui, createAndInstallWindowRecomposerui createandinstallwindowrecomposerui) {
        com.huawei.location.callback.d2 d2VarIconCompatParcelizer;
        synchronized (this) {
            if (WindowRecomposerFactory.read().read(getglobalkeyboardmodifiersui.write.getUuid())) {
                try {
                    serializer(getglobalkeyboardmodifiersui.write.getUuid());
                } catch (LocationServiceException unused) {
                    WrappedCompositionsetContent1211.read("HwLocationManager", "requestLocationUpdatesEx throw locationServiceException");
                }
            }
            int i = getglobalkeyboardmodifiersui.read();
            RequestLocationUpdatesRequest requestLocationUpdatesRequest = getglobalkeyboardmodifiersui.write;
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "requestLocationUpdatesEx priority = " + i);
            if (i == 300) {
                d2VarIconCompatParcelizer = IconCompatParcelizer(getglobalkeyboardmodifiersui, createandinstallwindowrecomposerui);
            } else {
                if (i != 200) {
                    RemoteActionCompatParcelizer(getglobalkeyboardmodifiersui, createandinstallwindowrecomposerui);
                    return;
                }
                LifecycleAwarelambda0 lifecycleAwarelambda0 = new LifecycleAwarelambda0();
                FB$yn fB$yn = new FB$yn();
                fB$yn.IconCompatParcelizer.setApiName("Location_locationCallbackEx");
                fB$yn.IconCompatParcelizer.setTransactionID(requestLocationUpdatesRequest.getTid());
                lifecycleAwarelambda0.RatingCompat = fB$yn;
                lifecycleAwarelambda0.MediaDescriptionCompat = createandinstallwindowrecomposerui;
                lifecycleAwarelambda0.MediaSessionCompatQueueItem = requestLocationUpdatesRequest;
                lifecycleAwarelambda0.MediaMetadataCompat = write(getglobalkeyboardmodifiersui, lifecycleAwarelambda0);
                getglobalkeyboardmodifiersui.IconCompatParcelizer = lifecycleAwarelambda0;
                WindowRecomposerFactory.read().write(getglobalkeyboardmodifiersui);
                createLifecycleAwareWindowRecomposerdefault.read().read(requestLocationUpdatesRequest, lifecycleAwarelambda0);
                setImportantForContentCapture.IconCompatParcelizer().write(lifecycleAwarelambda0);
                d2VarIconCompatParcelizer = lifecycleAwarelambda0;
            }
            d2VarIconCompatParcelizer.MediaDescriptionCompat.MediaBrowserCompatMediaItem();
            if (this.write == null) {
                HandlerThread handlerThread = new HandlerThread("FullSDK-hwLocationManager-HwLocationManager");
                handlerThread.start();
                this.write = new Handler(handlerThread.getLooper());
            }
            this.write.postDelayed(new setOnPasteRequested(0, d2VarIconCompatParcelizer), 100L);
            int i2 = getglobalkeyboardmodifiersui.read();
            if (this.RatingCompat == null) {
                this.RatingCompat = new E5(0);
            }
            if (i2 == 300 || i2 == 102 || i2 == 104) {
                this.RatingCompat.PlaybackStateCompatCustomAction();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
    public final void RemoteActionCompatParcelizer(getGlobalKeyboardModifiersui getglobalkeyboardmodifiersui) {
        E5 e5;
        RequestLocationUpdatesRequest requestLocationUpdatesRequest = getglobalkeyboardmodifiersui.write;
        zp zpVar = setOnSelectAllRequested.serializer;
        String tid = requestLocationUpdatesRequest.getTid();
        Handler handler = (Handler) zpVar.IconCompatParcelizer;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("MaxWaitTimeManager", "removeMaxWaitTimeQueue transactionID:" + tid);
        com.huawei.location.callback.d2 d2Var = getglobalkeyboardmodifiersui.IconCompatParcelizer;
        if (d2Var != null && ((ConcurrentHashMap) zpVar.serializer).containsKey(d2Var)) {
            Message messageObtainMessage = handler.obtainMessage(2147483637);
            messageObtainMessage.obj = d2Var;
            handler.sendMessage(messageObtainMessage);
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("MaxWaitTimeManager", "removeMaxWaitTimeQueue send msg");
        }
        String strSerializer = getglobalkeyboardmodifiersui.serializer();
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "handlerRemoveRequest, uuid is " + requestLocationUpdatesRequest.getUuid() + ", provider is " + strSerializer);
        if (TextUtils.equals(strSerializer, "network")) {
            RequestLocationUpdatesRequest requestLocationUpdatesRequest2 = getglobalkeyboardmodifiersui.write;
            if (requestLocationUpdatesRequest2 != null) {
                if (requestLocationUpdatesRequest2.isResendFromHMS()) {
                    this.IconCompatParcelizer.read(getglobalkeyboardmodifiersui);
                } else {
                    if (RemoteActionCompatParcelizer) {
                        this.IconCompatParcelizer.read(getglobalkeyboardmodifiersui);
                    }
                    setOnCopyRequested.IconCompatParcelizer().read(getglobalkeyboardmodifiersui.write);
                }
            }
        } else if (TextUtils.equals(strSerializer, "fused")) {
            createLifecycleAwareWindowRecomposerdefault.read().IconCompatParcelizer(getglobalkeyboardmodifiersui.IconCompatParcelizer);
            setImportantForContentCapture setimportantforcontentcaptureIconCompatParcelizer = setImportantForContentCapture.IconCompatParcelizer();
            com.huawei.location.callback.d2 d2Var2 = getglobalkeyboardmodifiersui.IconCompatParcelizer;
            synchronized (setimportantforcontentcaptureIconCompatParcelizer) {
                ViewCompatShimsApi30Impl.read().read(d2Var2);
            }
            RequestLocationUpdatesRequest requestLocationUpdatesRequest3 = getglobalkeyboardmodifiersui.write;
            if (requestLocationUpdatesRequest3 != null) {
                if (requestLocationUpdatesRequest3.isResendFromHMS()) {
                    this.IconCompatParcelizer.read(getglobalkeyboardmodifiersui);
                } else {
                    if (RemoteActionCompatParcelizer) {
                        this.IconCompatParcelizer.read(getglobalkeyboardmodifiersui);
                    }
                    setOnCopyRequested.IconCompatParcelizer().read(getglobalkeyboardmodifiersui.write);
                }
            }
        } else {
            if (!TextUtils.equals(strSerializer, "passive") && !TextUtils.equals(strSerializer, "gps")) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "handlerRemoveRequest fail");
                return;
            }
            createLifecycleAwareWindowRecomposerdefault.read().IconCompatParcelizer(getglobalkeyboardmodifiersui.IconCompatParcelizer);
            setImportantForContentCapture setimportantforcontentcaptureIconCompatParcelizer2 = setImportantForContentCapture.IconCompatParcelizer();
            com.huawei.location.callback.d2 d2Var3 = getglobalkeyboardmodifiersui.IconCompatParcelizer;
            synchronized (setimportantforcontentcaptureIconCompatParcelizer2) {
                ViewCompatShimsApi30Impl.read().read(d2Var3);
            }
        }
        int i = getglobalkeyboardmodifiersui.read();
        E5 e6 = this.RatingCompat;
        if (e6 != null && ((i == 300 || i == 102 || i == 104) && ((AtomicInteger) e6.RemoteActionCompatParcelizer) != null && ((getContentCaptureSession) e6.write) != null)) {
            synchronized (((byte[]) e6.serializer)) {
                ((AtomicInteger) e6.RemoteActionCompatParcelizer).decrementAndGet();
                ((AtomicInteger) e6.RemoteActionCompatParcelizer).get();
                WrappedCompositionsetContent1211.read();
                if (((AtomicInteger) e6.RemoteActionCompatParcelizer).get() <= 0) {
                    E5.read((getContentCaptureSession) e6.write);
                    e6.read = true;
                    e6.write = null;
                    e6.RemoteActionCompatParcelizer = null;
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("GnssAndNetReceiver", "unregister network receiver");
                }
            }
        }
        if (!WindowRecomposerFactory.read().read.isEmpty() || (e5 = this.RatingCompat) == null) {
            return;
        }
        getContentCaptureSession getcontentcapturesession = (getContentCaptureSession) e5.write;
        if (getcontentcapturesession != null) {
            E5.read(getcontentcapturesession);
            e5.write = null;
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("GnssAndNetReceiver", "unregister network receiver");
        }
        getWindowRecomposerannotations getwindowrecomposerannotations = (getWindowRecomposerannotations) e5.IconCompatParcelizer;
        if (getwindowrecomposerannotations != null) {
            E5.read(getwindowrecomposerannotations);
            e5.IconCompatParcelizer = null;
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("GnssAndNetReceiver", "unregister gnss receiver");
        }
        this.RatingCompat = null;
    }

    public getOnSelectAllRequested() {
        boolean z = false;
        i$d.a aVar = new i$d.a(22, z);
        i$d.a aVar2 = new i$d.a(13, z);
        Object systemService = placeAtf8xVGno.read().getSystemService("location");
        if (systemService instanceof LocationManager) {
            aVar2.read = (LocationManager) systemService;
        }
        aVar.read = aVar2;
        this.IconCompatParcelizer = aVar;
        setOnAutofillRequested setonautofillrequested = new setOnAutofillRequested(0);
        setonautofillrequested.serializer = this;
        onCreateActionMode.write.IconCompatParcelizer(new setOnPasteRequested(1, setonautofillrequested));
    }

    public final com.huawei.location.callback.d2 IconCompatParcelizer(getGlobalKeyboardModifiersui getglobalkeyboardmodifiersui, createAndInstallWindowRecomposerui createandinstallwindowrecomposerui) {
        RequestLocationUpdatesRequest requestLocationUpdatesRequest = getglobalkeyboardmodifiersui.write;
        boolean zIsResendFromHMS = requestLocationUpdatesRequest.isResendFromHMS();
        i$d.a aVar = this.IconCompatParcelizer;
        if (zIsResendFromHMS) {
            getLifecycleAware getlifecycleaware = new getLifecycleAware(requestLocationUpdatesRequest, createandinstallwindowrecomposerui);
            getlifecycleaware.MediaMetadataCompat = write(getglobalkeyboardmodifiersui, getlifecycleaware);
            getglobalkeyboardmodifiersui.IconCompatParcelizer = getlifecycleaware;
            WindowRecomposerFactory.read().write(getglobalkeyboardmodifiersui);
            aVar.IconCompatParcelizer(getglobalkeyboardmodifiersui);
            return getlifecycleaware;
        }
        if (RemoteActionCompatParcelizer) {
            getLifecycleAware getlifecycleaware2 = new getLifecycleAware(requestLocationUpdatesRequest, createandinstallwindowrecomposerui);
            getlifecycleaware2.MediaMetadataCompat = write(getglobalkeyboardmodifiersui, getlifecycleaware2);
            getglobalkeyboardmodifiersui.IconCompatParcelizer = getlifecycleaware2;
            WindowRecomposerFactory.read().write(getglobalkeyboardmodifiersui);
            aVar.IconCompatParcelizer(getglobalkeyboardmodifiersui);
            setOnCopyRequested.IconCompatParcelizer().IconCompatParcelizer(requestLocationUpdatesRequest);
            return getlifecycleaware2;
        }
        setFactory setfactory = new setFactory(requestLocationUpdatesRequest, createandinstallwindowrecomposerui);
        setfactory.MediaMetadataCompat = write(getglobalkeyboardmodifiersui, setfactory);
        getglobalkeyboardmodifiersui.IconCompatParcelizer = setfactory;
        WindowRecomposerFactory.read().write(getglobalkeyboardmodifiersui);
        setOnCopyRequested.IconCompatParcelizer().IconCompatParcelizer(requestLocationUpdatesRequest);
        return setfactory;
    }

    public static boolean write(getGlobalKeyboardModifiersui getglobalkeyboardmodifiersui, com.huawei.location.callback.d2 d2Var) {
        RequestLocationUpdatesRequest requestLocationUpdatesRequest = getglobalkeyboardmodifiersui.write;
        LocationRequest locationRequest = requestLocationUpdatesRequest.getLocationRequest();
        if (locationRequest == null) {
            return false;
        }
        long maxWaitTime = locationRequest.getMaxWaitTime();
        if (maxWaitTime <= 0) {
            return false;
        }
        if (SystemClock.uptimeMillis() + maxWaitTime < 0) {
            String str = (String) withFactory.read.get(10101);
            if (str == null) {
                str = "unknown error code:10101";
            }
            throw new LocationServiceException(10101, str);
        }
        if (maxWaitTime / 2 < locationRequest.getInterval()) {
            return false;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "maxWaitTime is enable , add to MaxWaitTimeQueue");
        zp zpVar = setOnSelectAllRequested.serializer;
        String tid = requestLocationUpdatesRequest.getTid();
        long maxWaitTime2 = locationRequest.getMaxWaitTime();
        Handler handler = (Handler) zpVar.IconCompatParcelizer;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("MaxWaitTimeManager", "addMaxWaitTimeQueue start transactionID:" + tid);
        if (zpVar.write == 1073741822) {
            WrappedCompositionsetContent1211.read("MaxWaitTimeManager", "addMaxWaitTimeQueue failed , msgWhat is out of number");
            return true;
        }
        if (((ConcurrentHashMap) zpVar.serializer) == null) {
            zpVar.serializer = new ConcurrentHashMap();
        }
        if (!((ConcurrentHashMap) zpVar.serializer).containsKey(d2Var)) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("MaxWaitTimeManager", "addMaxWaitTimeQueue new bean and start queue");
            ((ConcurrentHashMap) zpVar.serializer).put(d2Var, new getOnCutRequested(tid, zpVar.write, maxWaitTime2, null));
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.what = zpVar.write;
            messageObtainMessage.obj = d2Var;
            handler.sendMessageDelayed(messageObtainMessage, maxWaitTime2);
            zpVar.write++;
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("MaxWaitTimeManager", "addMaxWaitTimeQueue new bean and restart queue send msg");
            return true;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("MaxWaitTimeManager", "addMaxWaitTimeQueue update bean and restart queue");
        getOnCutRequested getoncutrequested = (getOnCutRequested) ((ConcurrentHashMap) zpVar.serializer).get(d2Var);
        if (getoncutrequested != null) {
            getoncutrequested.write = maxWaitTime2;
            getoncutrequested.RemoteActionCompatParcelizer = tid;
            ((ConcurrentHashMap) zpVar.serializer).putIfAbsent(d2Var, getoncutrequested);
            Message messageObtainMessage2 = handler.obtainMessage();
            int i = getoncutrequested.read;
            messageObtainMessage2.what = i;
            messageObtainMessage2.obj = d2Var;
            handler.removeMessages(i);
            handler.sendMessageDelayed(messageObtainMessage2, maxWaitTime2);
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("MaxWaitTimeManager", "addMaxWaitTimeQueue update bean and restart queue send msg");
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    /* JADX WARN: Code duplicated, block: B:27:0x009e  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    public static Location read() {
        long elapsedRealtimeNanos;
        long elapsedRealtimeNanos2;
        Location location = null;
        if (!onPrepareActionMode.RemoteActionCompatParcelizer(placeAtf8xVGno.read())) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "location unable");
            return null;
        }
        Location locationSerializer = createLifecycleAwareWindowRecomposerdefault.read().serializer("gps");
        Location locationSerializer2 = createLifecycleAwareWindowRecomposerdefault.read().serializer("network");
        WindowRecomposerFactory windowRecomposerFactory = WindowRecomposerFactory.read();
        if (windowRecomposerFactory.serializer == null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("RequestRecordCache", "cached lastLocation is null");
        } else if (SystemClock.elapsedRealtime() - (windowRecomposerFactory.serializer.getElapsedRealtimeNanos() / 1000000) > 1200000) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("RequestRecordCache", "cached lastLocation is expired");
            windowRecomposerFactory.serializer = null;
        } else {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("RequestRecordCache", "cached lastLocation is in 20 minutes");
            location = windowRecomposerFactory.serializer;
        }
        if (locationSerializer2 != null) {
            if (location == null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "cacheLocation loacation is null,use native network");
            } else {
                long elapsedRealtimeNanos3 = locationSerializer2.getElapsedRealtimeNanos();
                long elapsedRealtimeNanos4 = location.getElapsedRealtimeNanos();
                StringBuilder sbM = c8$$ExternalSyntheticOutline0.m(elapsedRealtimeNanos3, "nativeLocTime:", ",cacheLocTime:");
                sbM.append(elapsedRealtimeNanos4);
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", sbM.toString());
                if (elapsedRealtimeNanos3 - elapsedRealtimeNanos4 <= 60000000000L) {
                }
            }
            if (locationSerializer == null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "return netBestLoc");
                return locationSerializer2;
            }
            if (locationSerializer2 == null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "return nativeGPSLoc");
                return locationSerializer;
            }
            elapsedRealtimeNanos = locationSerializer.getElapsedRealtimeNanos();
            elapsedRealtimeNanos2 = locationSerializer2.getElapsedRealtimeNanos();
            if (Math.abs(elapsedRealtimeNanos - elapsedRealtimeNanos2) < 11000000000L) {
                if (locationSerializer.getAccuracy() < locationSerializer2.getAccuracy()) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "return nativeGPSLoc");
                    return locationSerializer;
                }
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "return netBestLoc");
                return locationSerializer2;
            }
            if (elapsedRealtimeNanos > elapsedRealtimeNanos2) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "return nativeGPSLoc");
                return locationSerializer;
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "return netBestLoc");
            return locationSerializer2;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "native network is null,use cache network");
        locationSerializer2 = location;
        if (locationSerializer == null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "return netBestLoc");
            return locationSerializer2;
        }
        if (locationSerializer2 == null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "return nativeGPSLoc");
            return locationSerializer;
        }
        elapsedRealtimeNanos = locationSerializer.getElapsedRealtimeNanos();
        elapsedRealtimeNanos2 = locationSerializer2.getElapsedRealtimeNanos();
        if (Math.abs(elapsedRealtimeNanos - elapsedRealtimeNanos2) < 11000000000L) {
            if (locationSerializer.getAccuracy() < locationSerializer2.getAccuracy()) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "return nativeGPSLoc");
                return locationSerializer;
            }
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "return netBestLoc");
            return locationSerializer2;
        }
        if (elapsedRealtimeNanos > elapsedRealtimeNanos2) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "return nativeGPSLoc");
            return locationSerializer;
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "return netBestLoc");
        return locationSerializer2;
    }

    public static getOnSelectAllRequested write() {
        if (serializer == null) {
            synchronized (read) {
                if (serializer == null) {
                    serializer = new getOnSelectAllRequested();
                }
            }
        }
        return serializer;
    }

    public final void serializer(String str) {
        getGlobalKeyboardModifiersui getglobalkeyboardmodifiersui;
        ConcurrentHashMap concurrentHashMap = WindowRecomposerFactory.read().read;
        if (TextUtils.isEmpty(str)) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("RequestRecordCache", "removeRequestRecord isEmpty uuid");
            getglobalkeyboardmodifiersui = new getGlobalKeyboardModifiersui();
        } else if (concurrentHashMap.containsKey(str)) {
            getGlobalKeyboardModifiersui getglobalkeyboardmodifiersui2 = (getGlobalKeyboardModifiersui) concurrentHashMap.get(str);
            if (getglobalkeyboardmodifiersui2 != null && getglobalkeyboardmodifiersui2.IconCompatParcelizer != null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("RequestRecordCache", "removeRequestRecord getProvider:".concat(getglobalkeyboardmodifiersui2.serializer()));
                Handler handler = getglobalkeyboardmodifiersui2.IconCompatParcelizer.serializer;
                if (handler != null && handler.getLooper() != null) {
                    handler.getLooper().quitSafely();
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwBaseCallback", "handler quitSafely");
                }
            }
            getglobalkeyboardmodifiersui = (getGlobalKeyboardModifiersui) concurrentHashMap.remove(str);
        } else {
            getglobalkeyboardmodifiersui = new getGlobalKeyboardModifiersui();
        }
        if (getglobalkeyboardmodifiersui == null || TextUtils.isEmpty(getglobalkeyboardmodifiersui.serializer())) {
            throw new LocationServiceException(LocationStatusCode.NO_MATCHED_CALLBACK, LocationStatusCode.getStatusCodeString(LocationStatusCode.NO_MATCHED_CALLBACK));
        }
        RemoteActionCompatParcelizer(getglobalkeyboardmodifiersui);
    }
}
