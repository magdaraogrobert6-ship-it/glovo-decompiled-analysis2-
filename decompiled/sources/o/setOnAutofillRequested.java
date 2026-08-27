package o;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.hms.location.HwLocationResult;
import com.huawei.hms.location.LocationProviderCallback;
import com.huawei.hms.location.entity.activity.ActivityTransitionRequest;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.location.activity.RiemannSoftArService;
import com.huawei.location.base.activity.callback.ARCallback;
import com.huawei.location.base.activity.callback.ATCallback;
import com.huawei.location.base.activity.constant.ActivityErrorCode;
import com.huawei.location.base.activity.entity.ClientInfo;
import com.mapbox.maps.MapboxMap$$ExternalSyntheticLambda0;
import com.sentiance.okhttp3.u$a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class setOnAutofillRequested implements LocationProviderCallback {
    public static volatile setOnAutofillRequested IconCompatParcelizer;
    public static volatile setOnAutofillRequested read;
    public Object serializer;
    public static final byte[] write = new byte[0];
    public static final byte[] RemoteActionCompatParcelizer = new byte[0];

    @Override // com.huawei.hms.location.LocationProviderCallback
    public void onLocationChanged(HwLocationResult hwLocationResult) {
        if (hwLocationResult == null || hwLocationResult.getCode() != 0) {
            WrappedCompositionsetContent1211.read("LocationInnerUtil", "checkLocationResult fail, hwLocationResult is invalid");
            return;
        }
        if (hwLocationResult.getLocation() == null) {
            WrappedCompositionsetContent1211.read("LocationInnerUtil", "checkLocationResult fail, location is null");
            return;
        }
        if (!getTitleResource.read(placeAtf8xVGno.read(), "android.permission.ACCESS_FINE_LOCATION") && !getTitleResource.read(placeAtf8xVGno.read(), "android.permission.ACCESS_COARSE_LOCATION")) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "dispatchCallback fail, location permission is denied");
            return;
        }
        getOnSelectAllRequested getonselectallrequested = (getOnSelectAllRequested) this.serializer;
        Iterator it = WindowRecomposerFactory.read().read.entrySet().iterator();
        while (it.hasNext()) {
            getGlobalKeyboardModifiersui getglobalkeyboardmodifiersui = (getGlobalKeyboardModifiersui) ((Map.Entry) it.next()).getValue();
            if (getglobalkeyboardmodifiersui == null) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "dispatchCallback fail, wrapLocationRequest is null");
            } else {
                RequestLocationUpdatesRequest requestLocationUpdatesRequest = getglobalkeyboardmodifiersui.write;
                if (getglobalkeyboardmodifiersui.IconCompatParcelizer == null || TextUtils.isEmpty(requestLocationUpdatesRequest.getUuid()) || !stringArrayResource.RemoteActionCompatParcelizer(requestLocationUpdatesRequest)) {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "dispatchCallback fail, request is invalid");
                    it.remove();
                    getonselectallrequested.RemoteActionCompatParcelizer(getglobalkeyboardmodifiersui);
                } else {
                    int i = getglobalkeyboardmodifiersui.read();
                    if (i == 102 || i == 104 || i == 300 || i == 400 || i == 100) {
                        getglobalkeyboardmodifiersui.IconCompatParcelizer.write(hwLocationResult);
                    }
                }
            }
        }
    }

    public setOnAutofillRequested() {
        if (read == null) {
            synchronized (RemoteActionCompatParcelizer) {
                if (read == null) {
                    setOnAutofillRequested setonautofillrequested = new setOnAutofillRequested(0);
                    setonautofillrequested.serializer = RiemannSoftArService.getInstance();
                    read = setonautofillrequested;
                }
            }
        }
        this.serializer = read;
        AtomicBoolean atomicBoolean = onPrepareActionMode.RemoteActionCompatParcelizer;
        synchronized (onPrepareActionMode.class) {
            AtomicBoolean atomicBoolean2 = onPrepareActionMode.RemoteActionCompatParcelizer;
            if (atomicBoolean2.get()) {
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationUtil", "registerScreenStatusBroadcast is Register");
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            Context context = placeAtf8xVGno.read();
            getWindowRecomposer getwindowrecomposer = new getWindowRecomposer();
            getwindowrecomposer.write = null;
            context.registerReceiver(getwindowrecomposer, intentFilter);
            atomicBoolean2.set(true);
        }
    }

    public void RemoteActionCompatParcelizer(ARCallback aRCallback, ClientInfo clientInfo) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwActivityRecognitionManager", "removeActivityUpdates begin.");
        setOnAutofillRequested setonautofillrequested = (setOnAutofillRequested) this.serializer;
        setonautofillrequested.getClass();
        if (PrimaryTextActionModeCallback.write() && PrimaryTextActionModeCallback.IconCompatParcelizer() < 17) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(clientInfo.getPackageName());
            arrayList.add(clientInfo.getTransactionID());
            arrayList.add("ARService is not support");
            u$a u_a = new u$a();
            u_a.IconCompatParcelizer = arrayList;
            WrappedCompositionsetContent1211.write(u_a);
            MapboxMap$$ExternalSyntheticLambda0.m4699m((Object) ActivityErrorCode.getErrorCodeMessage(ActivityErrorCode.ACTIVITY_IDENTIFICATION_NOT_AVAILABLE));
            return;
        }
        ((RiemannSoftArService) setonautofillrequested.serializer).removeActivityUpdates(aRCallback, clientInfo);
    }

    public void write(ATCallback aTCallback, ClientInfo clientInfo) {
        setOnAutofillRequested setonautofillrequested = (setOnAutofillRequested) this.serializer;
        setonautofillrequested.getClass();
        if (!PrimaryTextActionModeCallback.write() || PrimaryTextActionModeCallback.IconCompatParcelizer() >= 17) {
            ((RiemannSoftArService) setonautofillrequested.serializer).removeActivityTransitionUpdates(aTCallback, clientInfo);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(clientInfo.getPackageName());
        arrayList.add(clientInfo.getTransactionID());
        arrayList.add("ARService is not support");
        u$a u_a = new u$a();
        u_a.IconCompatParcelizer = arrayList;
        WrappedCompositionsetContent1211.write(u_a);
        MapboxMap$$ExternalSyntheticLambda0.m4699m((Object) ActivityErrorCode.getErrorCodeMessage(ActivityErrorCode.ACTIVITY_IDENTIFICATION_NOT_AVAILABLE));
    }

    public static setOnAutofillRequested read() {
        if (IconCompatParcelizer == null) {
            synchronized (write) {
                if (IconCompatParcelizer == null) {
                    IconCompatParcelizer = new setOnAutofillRequested();
                }
            }
        }
        return IconCompatParcelizer;
    }

    public void read(ActivityTransitionRequest activityTransitionRequest, setOnViewCreatedCallback setonviewcreatedcallback, ClientInfo clientInfo) {
        setOnAutofillRequested setonautofillrequested = (setOnAutofillRequested) this.serializer;
        setonautofillrequested.getClass();
        if (!PrimaryTextActionModeCallback.write() || PrimaryTextActionModeCallback.IconCompatParcelizer() >= 17) {
            ((RiemannSoftArService) setonautofillrequested.serializer).requestActivityTransitionUpdates(activityTransitionRequest, setonviewcreatedcallback, clientInfo);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(clientInfo.getPackageName());
        arrayList.add(clientInfo.getTransactionID());
        arrayList.add("ARService is not support");
        u$a u_a = new u$a();
        u_a.IconCompatParcelizer = arrayList;
        WrappedCompositionsetContent1211.write(u_a);
        MapboxMap$$ExternalSyntheticLambda0.m4699m((Object) ActivityErrorCode.getErrorCodeMessage(ActivityErrorCode.ACTIVITY_IDENTIFICATION_NOT_AVAILABLE));
    }

    public void read(long j, setOnViewCreatedCallback setonviewcreatedcallback, ClientInfo clientInfo) {
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwActivityRecognitionManager", "requestActivityUpdates begin.");
        setOnAutofillRequested setonautofillrequested = (setOnAutofillRequested) this.serializer;
        setonautofillrequested.getClass();
        if (!PrimaryTextActionModeCallback.write() || PrimaryTextActionModeCallback.IconCompatParcelizer() >= 17) {
            ((RiemannSoftArService) setonautofillrequested.serializer).requestActivityUpdates(j, setonviewcreatedcallback, clientInfo);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(clientInfo.getPackageName());
        arrayList.add(clientInfo.getTransactionID());
        arrayList.add("ARService is not support");
        u$a u_a = new u$a();
        u_a.IconCompatParcelizer = arrayList;
        WrappedCompositionsetContent1211.write(u_a);
        MapboxMap$$ExternalSyntheticLambda0.m4699m((Object) ActivityErrorCode.getErrorCodeMessage(ActivityErrorCode.ACTIVITY_IDENTIFICATION_NOT_AVAILABLE));
    }

    public setOnAutofillRequested(int i) {
    }
}
