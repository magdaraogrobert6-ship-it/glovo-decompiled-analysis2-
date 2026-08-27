package com.huawei.hms.locationSdk;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.work.RxWorker$1$$ExternalSyntheticLambda0;
import bo.app.af$$ExternalSyntheticOutline0;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.LocationClientStateManager;
import com.huawei.hms.support.api.location.common.LocationJsonUtil;
import com.huawei.hms.support.api.location.common.LocationRequestHelper;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.support.api.location.common.exception.ServiceErrorCodeAdaptor;
import com.huawei.riemann.location.common.utils.Constant;
import java.util.Map;
import o.IconCompatParcelizer;
import o.ViewLayerCompanionOutlineProvider1;
import o.ViewLayerUniqueDrawingIdApi29;
import o.Wrapper_androidKt;
import o.Wrapper_androidKtsetContent1;
import o.accessgetViewRootjd;
import o.getShouldUseDispatchDraw;
import o.onCreateActionMode;
import o.placeAtf8xVGno;
import o.r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY;
import o.resetClipBounds;
import o.setShouldUseDispatchDrawui;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l1 extends b<q0, Void> {
    protected k1 d;
    private Location e;
    private boolean f;
    protected Handler g;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            l1.this.a(message);
        }
    }

    public void b(boolean z) {
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return HuaweiApiAvailability.HMS_VERSION_CODE_KIT_UPDATE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(Message message) {
        HMSLocationLog.i(a(), ((b) this).a, "handleOnResultMessage code:" + message.what);
        try {
            int i = message.what;
            if (i == 1) {
                Object obj = message.obj;
                if (obj instanceof LocationResult) {
                    a((LocationResult) obj);
                    return;
                }
                return;
            }
            if (i == 2) {
                Object obj2 = message.obj;
                if (obj2 instanceof LocationAvailability) {
                    LocationAvailability locationAvailability = (LocationAvailability) obj2;
                    HMSLocationLog.i(a(), ((b) this).a, "getLocationStatus:" + locationAvailability.getLocationStatus());
                    this.d.c().onLocationAvailability(locationAvailability);
                    return;
                }
                return;
            }
            if (i != 3) {
                return;
            }
            if (!y.a(placeAtf8xVGno.read()) || ((b) this).c == null) {
                HMSLocationLog.i(a(), ((b) this).a, "request time out,report and remove");
                w0.b().c(this.d);
            } else {
                HMSLocationLog.i(a(), ((b) this).a, "request time out re send");
                w0.b().c(this.d);
                y.a(true);
                this.f = true;
                f0 f0Var = new f0(placeAtf8xVGno.read(), (v0) null);
                ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = ((b) this).c.RemoteActionCompatParcelizer;
                l1$$ExternalSyntheticLambda0 l1__externalsyntheticlambda0 = new l1$$ExternalSyntheticLambda0(f0Var, this, 0);
                viewLayerUniqueDrawingIdApi29.getClass();
                viewLayerUniqueDrawingIdApi29.read((resetClipBounds) new accessgetViewRootjd(getShouldUseDispatchDraw.write.read, new i$d(l1__externalsyntheticlambda0, new ViewLayerUniqueDrawingIdApi29(), 0 == true ? 1 : 0, 0 == true ? 1 : 0)));
                ((b) this).c.IconCompatParcelizer(null);
            }
            LocationRequestHelper.reportRequest(((b) this).a, 10811, "REQUEST_GET_RESULT_TIME_OUT", LocationRequestHelper.getCpTid(this.d.d()));
        } catch (Exception e) {
            HMSLocationLog.e(a(), ((b) this).a, "handleOnResultMessage exception:" + e.getCause());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(q0 q0Var, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        HMSLocationLog.i(a(), ((b) this).a, "doExecute");
        boolean z = false;
        Object[] objArr = 0;
        int i = 1;
        try {
            a(true);
            if (responseErrorCode == null) {
                w0.b().c(this.d);
                LocationRequestHelper.reportRequest(((b) this).a, 10000, LocationStatusCode.getStatusCodeString(10000), LocationRequestHelper.getCpTid(this.d.d()));
                throw new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            }
            if (responseErrorCode.getStatusCode() == 0 && responseErrorCode.getErrorCode() == 0) {
                JSONObject jSONObject = new JSONObject(str);
                k1 k1Var = this.d;
                if (k1Var != null && k1Var.d() != null && this.d.c() != null) {
                    if (jSONObject.has("locationResult")) {
                        a(q0Var, jSONObject);
                        return;
                    }
                    if (jSONObject.has("locationAvailability")) {
                        a(str);
                        return;
                    }
                    w0.b().d(this.d);
                    if (w0.b().b(this.d.c())) {
                        HMSLocationLog.e(a(), ((b) this).a, "remove no match callback here: " + this.d.h());
                        w0.b().c(this.d.c());
                        t.b(q0Var.getContext(), (v0) null).a(this.d.c());
                    }
                    LocationRequestHelper.reportRequest(((b) this).a, responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), LocationRequestHelper.getCpTid(this.d.d()));
                    b(true);
                }
                LocationRequestHelper.reportRequest(((b) this).a, 10000, LocationStatusCode.getStatusCodeString(10000), LocationRequestHelper.getCpTid(this.d.d()));
                HMSLocationLog.e(a(), ((b) this).a, "INTERNAL_ERROR : doExecute requestLocationUpdatesCache is null");
                return;
            }
            Map<String, String> extras = this.d.d().getExtras();
            if (extras != null && TextUtils.equals(extras.get(LocationClientStateManager.IS_RE_REQUEST), "1")) {
                HMSLocationLog.w(a(), ((b) this).a, "is re request,not remove");
                return;
            }
            w0.b().c(this.d);
            if ((responseErrorCode.getErrorCode() < 10000 || responseErrorCode.getErrorCode() > 20000 || responseErrorCode.getErrorCode() == 10102) && y.a(q0Var.getContext())) {
                y.a(true);
                this.f = true;
                f0 f0Var = new f0(q0Var.getContext(), (v0) null);
                ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = viewLayerCompanionOutlineProvider1.RemoteActionCompatParcelizer;
                l1$$ExternalSyntheticLambda0 l1__externalsyntheticlambda0 = new l1$$ExternalSyntheticLambda0(f0Var, this, i);
                viewLayerUniqueDrawingIdApi29.getClass();
                viewLayerUniqueDrawingIdApi29.read((resetClipBounds) new accessgetViewRootjd(getShouldUseDispatchDraw.write.read, new i$d(l1__externalsyntheticlambda0, new ViewLayerUniqueDrawingIdApi29(), z, objArr == true ? 1 : 0)));
                viewLayerCompanionOutlineProvider1.IconCompatParcelizer(null);
            } else {
                LocationRequestHelper.reportRequest(((b) this).a, responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason(), LocationRequestHelper.getCpTid(this.d.d()));
            }
            if (this.f) {
                return;
            }
            ServiceErrorCodeAdaptor.getInstance().setTaskByServiceErrorCode(viewLayerCompanionOutlineProvider1, responseErrorCode, null);
        } catch (ApiException e) {
            w0.b().c(this.d);
            LocationRequestHelper.reportRequest(((b) this).a, e.getStatusCode(), e.getStatusMessage(), LocationRequestHelper.getCpTid(this.d.d()));
            b(false);
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("request location doExecute exception:"), a(), ((b) this).a);
            viewLayerCompanionOutlineProvider1.read(e);
        } catch (Exception unused) {
            w0.b().c(this.d);
            LocationRequestHelper.reportRequest(((b) this).a, 10000, LocationStatusCode.getStatusCodeString(10000), LocationRequestHelper.getCpTid(this.d.d()));
            b(false);
            HMSLocationLog.e(a(), ((b) this).a, "request location doExecute exception");
            viewLayerCompanionOutlineProvider1.read(new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000))));
        }
    }

    public l1(String str, String str2, String str3, k1 k1Var, Looper looper, String str4) throws ApiException {
        super(str, str2, str3, str4);
        this.f = false;
        this.d = k1Var;
        if (looper == null) {
            throw new ApiException(new Status(LocationStatusCode.PARAM_ERROR_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.PARAM_ERROR_EMPTY)));
        }
        a aVar = new a(looper);
        this.g = aVar;
        aVar.sendEmptyMessageDelayed(3, DeviceOrientationRequest.OUTPUT_PERIOD_MEDIUM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(LocationResult locationResult) {
        c0.b().b(locationResult.getLastHWLocation());
    }

    public void c(LocationResult locationResult) {
        HWLocation lastHWLocation;
        Location lastLocation;
        Map<String, Object> extraInfo;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4 = -1;
        if (locationResult == null || (lastHWLocation = locationResult.getLastHWLocation()) == null || (lastLocation = locationResult.getLastLocation()) == null || (extraInfo = lastHWLocation.getExtraInfo()) == null) {
            return;
        }
        Location location = this.e;
        float fDistanceTo = location != null ? lastLocation.distanceTo(location) : -1.0f;
        String strA = a();
        String str = ((b) this).a;
        StringBuilder sb = new StringBuilder("log location info, SourceType: ");
        sb.append(extraInfo.containsKey(Constant.LOCATION_SOURCE_TYPE) ? extraInfo.get(Constant.LOCATION_SOURCE_TYPE) : obj4);
        sb.append(", provider: ");
        sb.append(lastHWLocation.getProvider());
        sb.append(", acc: ");
        sb.append(lastHWLocation.getAccuracy());
        sb.append(", bearing: ");
        sb.append(lastHWLocation.getBearing());
        sb.append(", speed: ");
        sb.append(lastHWLocation.getSpeed());
        sb.append(", positionType: ");
        if (extraInfo.containsKey("positionType")) {
            obj4 = extraInfo.get("positionType");
        }
        sb.append(obj4);
        sb.append(", tripId: ");
        Object obj5 = "";
        if (!extraInfo.containsKey("tripId")) {
            obj = "";
        } else {
            obj = extraInfo.get("tripId");
        }
        sb.append(obj);
        sb.append(", requestId: ");
        if (!extraInfo.containsKey("session_id")) {
            obj2 = "";
        } else {
            obj2 = extraInfo.get("session_id");
        }
        sb.append(obj2);
        sb.append(", vendorType: ");
        if (!extraInfo.containsKey("vendorType")) {
            obj3 = "";
        } else {
            obj3 = extraInfo.get("vendorType");
        }
        sb.append(obj3);
        sb.append(",distanceToPrev:");
        sb.append(fDistanceTo);
        sb.append(", locationSource:");
        if (extraInfo.containsKey("LocationSource")) {
            obj5 = extraInfo.get("LocationSource");
        }
        sb.append(obj5);
        HMSLocationLog.i(strA, str, sb.toString());
        this.e = lastLocation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ setShouldUseDispatchDrawui b(f0 f0Var, TaskApiCall taskApiCall, setShouldUseDispatchDrawui setshouldusedispatchdrawui) throws Exception {
        return f0Var.doWrite(taskApiCall);
    }

    public String a() {
        return "RequestLocationUpdatesTaskApiCall";
    }

    public void a(LocationResult locationResult) {
        if (locationResult == null || locationResult.getLastHWLocation() == null) {
            HMSLocationLog.e(a(), ((b) this).a, "locationResult is null or locationResult.getLastHWLocation is null");
        } else {
            onCreateActionMode.write.IconCompatParcelizer(new RxWorker$1$$ExternalSyntheticLambda0(28, locationResult));
            this.d.c().onLocationResult(locationResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ setShouldUseDispatchDrawui a(f0 f0Var, TaskApiCall taskApiCall, setShouldUseDispatchDrawui setshouldusedispatchdrawui) throws Exception {
        return f0Var.doWrite(taskApiCall);
    }

    private void a(String str) throws JSONException {
        LocationAvailability locationAvailabilityFromString = LocationJsonUtil.parseLocationAvailabilityFromString(str);
        HMSLocationLog.i(a(), ((b) this).a, "doExecute onLocationAvailability");
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = locationAvailabilityFromString;
        this.g.sendMessage(messageObtain);
    }

    private void a(q0 q0Var, JSONObject jSONObject) throws ApiException, JSONException {
        HMSLocationLog.i(a(), ((b) this).a, "doExecute onLocationResult");
        LocationResult locationResultFromJsonObject = LocationJsonUtil.parseLocationResultFromJsonObject(jSONObject);
        int iG = this.d.g();
        int size = locationResultFromJsonObject.getLocations().size();
        HMSLocationLog.i(a(), ((b) this).a, af$$ExternalSyntheticOutline0.m(iG, "modify numUpdates with callback, numUpdates:", size, " , locationSize:"));
        c(locationResultFromJsonObject);
        if (iG <= 0 || iG < size) {
            t.b(q0Var.getContext(), (v0) null).a(this.d.c());
            return;
        }
        if (iG == size) {
            t.b(q0Var.getContext(), (v0) null).a(this.d.c());
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = locationResultFromJsonObject;
        this.g.sendMessage(messageObtain);
        if (w1.b()) {
            String strA = w1.a(((b) this).a, locationResultFromJsonObject);
            boolean zB = w1.b();
            if (r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY.write && zB) {
                Wrapper_androidKtsetContent1 wrapper_androidKtsetContent1 = Wrapper_androidKtsetContent1.RemoteActionCompatParcelizer;
                Wrapper_androidKt wrapper_androidKt = new Wrapper_androidKt();
                wrapper_androidKt.IconCompatParcelizer = strA;
                wrapper_androidKt.write = "location";
                wrapper_androidKtsetContent1.serializer.offer(wrapper_androidKt);
            }
        }
        int i = iG - size;
        this.d.a(i);
        w0.b().a(this.d, i);
    }

    @Override // com.huawei.hms.locationSdk.b
    public void a(boolean z) {
        super.a(z);
        this.g.removeMessages(3);
    }
}
