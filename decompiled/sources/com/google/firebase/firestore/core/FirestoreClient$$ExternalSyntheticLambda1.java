package com.google.firebase.firestore.core;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.ImageCapture$1;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.compose.ui.graphics.Fields;
import androidx.lifecycle.BlockRunner;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import androidx.work.WorkerParameters;
import coil3.network.okhttp.internal.CallsKt$await$2$2;
import coil3.util.UtilsKt;
import com.google.android.gms.net.zza;
import com.huawei.wisesecurity.ucs_credential.x;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.bindgen.Expected;
import com.mapbox.navigation.base.internal.utils.RouterExKt;
import com.mapbox.navigation.base.route.RouterFailure;
import com.mapbox.navigation.core.internal.router.RouterErrorMapperKt;
import com.mapbox.navigation.utils.internal.LoggerProviderKt;
import com.mapbox.navigator.RouterError;
import com.mapbox.navigator.RouterErrorType;
import com.mapbox.navigator.RouterOrigin;
import com.mapbox.search.analytics.AnalyticsServiceImpl;
import com.roadrunner.auth.api.tokens.SessionInvalidException;
import com.roadrunner.logger.logger.sentry.SentryCriticalIssueLogger;
import com.roadrunner.push.messages.display.backgroud.services.SendPushReceiptWorker;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ranges.RangesKt;
import o.DrawModifierNodeKt;
import o.EncoderImplMediaCodecCallback;
import o.EnumColumnAdapter;
import o.ParentDataModifierDefaultImpls;
import o.PreviewExternalSyntheticLambda0;
import o.SimpleItemTouchHelperCallback;
import o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import o.VideoQualityQuirk;
import o.accessgetInstancedelegatecp;
import o.accesssetRenderEffectjd;
import o.accessupdateUnsafe;
import o.createFromParcel;
import o.executeAsList;
import o.getRectManager;
import o.getTextInputService;
import o.getThumbScrollRange;
import o.handleAttributionCallbackI;
import o.handleThirdPartySharingCallbackI;
import o.obtainShadowContext;
import o.onDrawBehind;
import o.onDrawWithContent;
import o.onMove;
import o.onViewAttachedToWindowlambda0;
import o.pageUp;
import o.removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release;
import o.setAmbientShadowColor8_81llA;
import o.setOffset;
import o.setThumbDrawable;
import o.withTopLeftBottomRight;
import timber.log.Timber;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class FirestoreClient$$ExternalSyntheticLambda1 implements obtainShadowContext, StopCodecAfterSurfaceRemovalCrashMediaServerQuirk, Expected.Transformer, Function {
    private static int RatingCompat = 1;
    private static int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object IconCompatParcelizer;
    public final /* synthetic */ Object read;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ Object write;

    public /* synthetic */ FirestoreClient$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4) {
        this.IconCompatParcelizer = obj;
        this.write = obj2;
        this.serializer = obj3;
        this.read = obj4;
    }

    @Override // o.obtainShadowContext
    public Object serializer(onDrawWithContent ondrawwithcontent) {
        String str;
        getThumbScrollRange getthumbscrollrange = (getThumbScrollRange) this.IconCompatParcelizer;
        List list = (List) this.write;
        ImageCapture$1 imageCapture$1 = (ImageCapture$1) this.serializer;
        setThumbDrawable setthumbdrawable = (setThumbDrawable) this.read;
        synchronized (getthumbscrollrange.MediaSessionCompatToken) {
            synchronized (getthumbscrollrange.MediaSessionCompatToken) {
                synchronized (getthumbscrollrange.MediaSessionCompatToken) {
                    List list2 = getthumbscrollrange.MediaSessionCompatQueueItem;
                    if (list2 != null) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            ((PreviewExternalSyntheticLambda0) it.next()).serializer();
                        }
                        getthumbscrollrange.MediaSessionCompatQueueItem = null;
                    }
                }
                if (list.isEmpty()) {
                    getthumbscrollrange.MediaSessionCompatQueueItem = list;
                } else {
                    int i = 0;
                    do {
                        try {
                            ((PreviewExternalSyntheticLambda0) list.get(i)).read();
                            i++;
                        } catch (DeferrableSurface$SurfaceClosedException e) {
                            for (int i2 = i - 1; i2 >= 0; i2--) {
                                ((PreviewExternalSyntheticLambda0) list.get(i2)).serializer();
                            }
                            throw e;
                        }
                    } while (i < list.size());
                    getthumbscrollrange.MediaSessionCompatQueueItem = list;
                }
                throw th;
            }
            UtilsKt.RemoteActionCompatParcelizer("The openCaptureSessionCompleter can only set once!", getthumbscrollrange.PlaybackStateCompatCustomAction == null);
            getthumbscrollrange.PlaybackStateCompatCustomAction = ondrawwithcontent;
            ImageCapture$1 imageCapture$2 = (ImageCapture$1) imageCapture$1.MediaSessionCompatQueueItem;
            imageCapture$2.getClass();
            SessionConfiguration sessionConfiguration = setthumbdrawable.read.RemoteActionCompatParcelizer;
            sessionConfiguration.getClass();
            try {
                ((CameraDevice) imageCapture$2.MediaSessionCompatQueueItem).createCaptureSession(sessionConfiguration);
                str = "openCaptureSession[session=" + getthumbscrollrange + "]";
            } catch (CameraAccessException e2) {
                throw new CameraAccessExceptionCompat(e2);
            }
        }
        return str;
    }

    public void serializer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 77;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        accessupdateUnsafe accessupdateunsafe = (accessupdateUnsafe) this.IconCompatParcelizer;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.write;
        ParentDataModifierDefaultImpls parentDataModifierDefaultImpls = (ParentDataModifierDefaultImpls) this.serializer;
        getTextInputService gettextinputservice = (getTextInputService) this.read;
        if (!atomicBoolean.compareAndSet(false, true)) {
            gettextinputservice.RemoteActionCompatParcelizer(new RxWorker$1$$ExternalSyntheticLambda0(18, accessupdateunsafe));
            int i4 = RemoteActionCompatParcelizer + 7;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return;
        }
        int i6 = RatingCompat + 41;
        RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            getRectManager.RemoteActionCompatParcelizer(!parentDataModifierDefaultImpls.RemoteActionCompatParcelizer.isComplete(), "Already fulfilled first user task", new Object[0]);
        } else {
            getRectManager.RemoteActionCompatParcelizer(!parentDataModifierDefaultImpls.RemoteActionCompatParcelizer.isComplete(), "Already fulfilled first user task", new Object[0]);
        }
        parentDataModifierDefaultImpls.IconCompatParcelizer(setOffset.write);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0074  */
    /* JADX WARN: Code duplicated, block: B:16:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:17:0x00ac  */
    @Override // com.mapbox.bindgen.Expected.Transformer
    public Object invoke(Object obj) {
        ArrayList arrayList;
        Iterator it;
        RouterError routerError;
        boolean z;
        int i = 2 % 2;
        RouteOptions routeOptions = (RouteOptions) this.IconCompatParcelizer;
        RouterOrigin routerOrigin = (RouterOrigin) this.write;
        x xVar = (x) this.serializer;
        URL url = (URL) this.read;
        List list = (List) obj;
        routeOptions.getClass();
        routerOrigin.getClass();
        list.getClass();
        List list2 = list;
        boolean z2 = true;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            it = list2.iterator();
            int i2 = RemoteActionCompatParcelizer + 69;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            while (it.hasNext() == z2) {
                int i4 = RemoteActionCompatParcelizer + 101;
                RatingCompat = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                routerError = (RouterError) it.next();
                String strMapToSdkRouteOrigin = RouterExKt.mapToSdkRouteOrigin(routerOrigin);
                String message = routerError.getMessage();
                message.getClass();
                RouterErrorType type = routerError.getType();
                type.getClass();
                String strMapToSdkRouterFailureType = RouterErrorMapperKt.mapToSdkRouterFailureType(type);
                if (routerError.getType() == RouterErrorType.NETWORK_ERROR) {
                    int i6 = RatingCompat + 9;
                    RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
                    int i7 = i6 % 2;
                    z = z2;
                } else {
                    z = false;
                }
                arrayList.add(new RouterFailure(url, strMapToSdkRouteOrigin, message, strMapToSdkRouterFailureType, null, z));
                z2 = true;
            }
            LoggerProviderKt.logW("Route request failed with: " + arrayList, "RouterWrapper");
            xVar.onFailure(arrayList, routeOptions);
        } else {
            Iterator it2 = list2.iterator();
            while (!(it2.hasNext() ^ z2)) {
                int i8 = RatingCompat + 101;
                RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                if (((RouterError) it2.next()).getType() == RouterErrorType.REQUEST_CANCELLED) {
                    LoggerProviderKt.logI("Route request cancelled: " + routeOptions + ", " + routerOrigin, "RouterWrapper");
                    String strMapToSdkRouteOrigin2 = RouterExKt.mapToSdkRouteOrigin(routerOrigin);
                    routeOptions.getClass();
                    if (((LinkedHashMap) ((BlockRunner) xVar.IconCompatParcelizer).RatingCompat).remove((Long) xVar.read) != null) {
                        int i10 = RemoteActionCompatParcelizer + 53;
                        RatingCompat = i10 % Fields.SpotShadowColor;
                        int i11 = i10 % 2;
                        ((CallsKt$await$2$2) ((AnalyticsServiceImpl) xVar.RemoteActionCompatParcelizer).locationProvider).onCanceled(routeOptions, strMapToSdkRouteOrigin2);
                    }
                } else {
                    z2 = true;
                }
            }
            arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
            it = list2.iterator();
            int i12 = RemoteActionCompatParcelizer + 69;
            RatingCompat = i12 % Fields.SpotShadowColor;
            int i13 = i12 % 2;
            while (it.hasNext() == z2) {
                int i14 = RemoteActionCompatParcelizer + 101;
                RatingCompat = i14 % Fields.SpotShadowColor;
                int i15 = i14 % 2;
                routerError = (RouterError) it.next();
                String strMapToSdkRouteOrigin3 = RouterExKt.mapToSdkRouteOrigin(routerOrigin);
                String message2 = routerError.getMessage();
                message2.getClass();
                RouterErrorType type2 = routerError.getType();
                type2.getClass();
                String strMapToSdkRouterFailureType2 = RouterErrorMapperKt.mapToSdkRouterFailureType(type2);
                if (routerError.getType() == RouterErrorType.NETWORK_ERROR) {
                    int i16 = RatingCompat + 9;
                    RemoteActionCompatParcelizer = i16 % Fields.SpotShadowColor;
                    int i17 = i16 % 2;
                    z = z2;
                } else {
                    z = false;
                }
                arrayList.add(new RouterFailure(url, strMapToSdkRouteOrigin3, message2, strMapToSdkRouterFailureType2, null, z));
                z2 = true;
            }
            LoggerProviderKt.logW("Route request failed with: " + arrayList, "RouterWrapper");
            xVar.onFailure(arrayList, routeOptions);
        }
        return createFromParcel.INSTANCE;
    }

    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        boolean z;
        Object objSerializer;
        String string;
        Map mapSingletonMap;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 93;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        SendPushReceiptWorker sendPushReceiptWorker = (SendPushReceiptWorker) this.IconCompatParcelizer;
        String str = (String) this.write;
        Long l = (Long) this.serializer;
        String str2 = (String) this.read;
        Throwable th = (Throwable) obj;
        th.getClass();
        WorkerParameters workerParameters = sendPushReceiptWorker.MediaBrowserCompatMediaItem;
        if (workerParameters.write >= 5) {
            int i4 = RemoteActionCompatParcelizer + 95;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        boolean zRemoteActionCompatParcelizer = ((pageUp) sendPushReceiptWorker.MediaDescriptionCompat).RemoteActionCompatParcelizer();
        boolean z2 = !z && zRemoteActionCompatParcelizer;
        handleThirdPartySharingCallbackI handlethirdpartysharingcallbacki = sendPushReceiptWorker.RatingCompat;
        handlethirdpartysharingcallbacki.getClass();
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = new onViewAttachedToWindowlambda0("push_message_id", str);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda1 = new onViewAttachedToWindowlambda0("received_offset", l);
        onViewAttachedToWindowlambda0 onviewattachedtowindowlambda2 = new onViewAttachedToWindowlambda0("will_retry", Boolean.valueOf(z2));
        boolean z3 = th instanceof SessionInvalidException;
        if (z3) {
            objSerializer = "API executed when session was invalid";
        } else {
            objSerializer = th instanceof IOException ? "Network Error" : handleAttributionCallbackI.serializer(th.toString());
        }
        Map mapRemoteActionCompatParcelizer = onMove.RemoteActionCompatParcelizer(onviewattachedtowindowlambda0, onviewattachedtowindowlambda1, onviewattachedtowindowlambda2, new onViewAttachedToWindowlambda0("failure_reason", objSerializer), new onViewAttachedToWindowlambda0("failure_exception", th.toString()), new onViewAttachedToWindowlambda0("notification_message", handleAttributionCallbackI.serializer(str2)));
        LinkedHashMap linkedHashMap = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(mapRemoteActionCompatParcelizer.size()));
        Iterator it = mapRemoteActionCompatParcelizer.entrySet().iterator();
        while (true) {
            string = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                int i6 = RemoteActionCompatParcelizer + 69;
                RatingCompat = i6 % Fields.SpotShadowColor;
                int i7 = i6 % 2;
                string = value.toString();
            }
            if (string == null) {
                int i8 = RemoteActionCompatParcelizer + 87;
                RatingCompat = i8 % Fields.SpotShadowColor;
                string = "";
                if (i8 % 2 == 0) {
                    int i9 = 82 / 0;
                }
            }
            linkedHashMap.put(key, string);
        }
        handlethirdpartysharingcallbacki.IconCompatParcelizer.logEvent("push_acknowledgement_failed", linkedHashMap);
        if (z2) {
            Timber.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(th, "Failed to acknowledge push message. runAttemptCount: " + workerParameters.write + ", shouldRetry: " + z2 + ", inputData: " + workerParameters.RemoteActionCompatParcelizer, new Object[0]);
            return new setAmbientShadowColor8_81llA(0);
        }
        if (z && zRemoteActionCompatParcelizer) {
            int i10 = RatingCompat + 67;
            RemoteActionCompatParcelizer = i10 % Fields.SpotShadowColor;
            if (i10 % 2 != 0) {
                string.hashCode();
                throw null;
            }
            if (!z3) {
                EnumColumnAdapter enumColumnAdapter = sendPushReceiptWorker.MediaSessionCompatQueueItem;
                executeAsList executeaslist = executeAsList.OA;
                String string2 = th.toString();
                withTopLeftBottomRight withtopleftbottomrightIconCompatParcelizer = RangesKt.IconCompatParcelizer(th);
                if (withtopleftbottomrightIconCompatParcelizer != null) {
                    int i11 = RatingCompat + 67;
                    RemoteActionCompatParcelizer = i11 % Fields.SpotShadowColor;
                    int i12 = i11 % 2;
                    mapSingletonMap = Collections.singletonMap("http_error_code", String.valueOf(withtopleftbottomrightIconCompatParcelizer.read.read));
                    mapSingletonMap.getClass();
                } else {
                    mapSingletonMap = null;
                }
                if (mapSingletonMap == null) {
                    int i13 = RemoteActionCompatParcelizer + 113;
                    RatingCompat = i13 % Fields.SpotShadowColor;
                    if (i13 % 2 == 0) {
                        SimpleItemTouchHelperCallback simpleItemTouchHelperCallback = SimpleItemTouchHelperCallback.serializer;
                        string.hashCode();
                        throw null;
                    }
                    mapSingletonMap = SimpleItemTouchHelperCallback.serializer;
                }
                ((SentryCriticalIssueLogger) enumColumnAdapter).write("push_acknowledgement_failed", executeaslist, string2, mapSingletonMap);
            }
        }
        return new accesssetRenderEffectjd();
    }

    @Override // o.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk
    public DrawModifierNodeKt RemoteActionCompatParcelizer(Object obj) {
        getThumbScrollRange getthumbscrollrange = (getThumbScrollRange) this.IconCompatParcelizer;
        CameraDevice cameraDevice = (CameraDevice) this.write;
        setThumbDrawable setthumbdrawable = (setThumbDrawable) this.serializer;
        List list = (List) this.read;
        if (getthumbscrollrange.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss.IconCompatParcelizer) {
            Iterator it = getthumbscrollrange.RemoteActionCompatParcelizer.read().iterator();
            while (it.hasNext()) {
                ((getThumbScrollRange) it.next()).write();
            }
        }
        getThumbScrollRange.serializer();
        synchronized (getthumbscrollrange.MediaSessionCompatToken) {
            if (getthumbscrollrange.ComponentActivity) {
                return new EncoderImplMediaCodecCallback(0, new CancellationException("Opener is disabled"));
            }
            BlockRunner blockRunner = getthumbscrollrange.RemoteActionCompatParcelizer;
            synchronized (blockRunner.serializer) {
                ((LinkedHashSet) blockRunner.RemoteActionCompatParcelizer).add(getthumbscrollrange);
            }
            onDrawBehind ondrawbehindRemoteActionCompatParcelizer = UtilsKt.RemoteActionCompatParcelizer(new FirestoreClient$$ExternalSyntheticLambda1(getthumbscrollrange, list, new ImageCapture$1(cameraDevice, 13), setthumbdrawable));
            getthumbscrollrange.ParcelableVolumeInfo = ondrawbehindRemoteActionCompatParcelizer;
            ImageCapture$1 imageCapture$1 = new ImageCapture$1(9, getthumbscrollrange);
            ondrawbehindRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new zza(ondrawbehindRemoteActionCompatParcelizer, 1, imageCapture$1), removeGeofencesRegisteredWithGeofencingClientandroid_sdk_location_release.read());
            return VideoQualityQuirk.write((DrawModifierNodeKt) getthumbscrollrange.ParcelableVolumeInfo);
        }
    }
}
