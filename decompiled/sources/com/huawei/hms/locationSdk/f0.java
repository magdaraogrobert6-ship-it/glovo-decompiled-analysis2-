package com.huawei.hms.locationSdk;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import bo.app.af$$ExternalSyntheticOutline0;
import com.google.gson.Gson;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationSettingsRequest;
import com.huawei.hms.location.LogConfig;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.checksettings.CheckLocationSettingsRequest;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;
import com.huawei.hms.support.api.entity.location.common.LocationNaming;
import com.huawei.hms.support.api.entity.location.lastlocation.GetLastLocationRequest;
import com.huawei.hms.support.api.entity.location.mock.SetMockLocationRequest;
import com.huawei.hms.support.api.entity.location.mock.SetMockModeRequest;
import com.huawei.hms.support.api.entity.location.offlinelocation.OfflineLocationRequest;
import com.huawei.hms.support.api.entity.location.updates.RemoveLocationUpdatesRequest;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.LocationJsonUtil;
import com.huawei.hms.support.api.location.common.LocationRequestHelper;
import com.huawei.hms.support.api.location.common.PermissionUtil;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.location.req.BackgroundReq;
import java.util.UUID;
import o.CollectionInfo_androidKttoAccessibilityCollectionItemInfo1;
import o.IconCompatParcelizer;
import o.ViewLayerCompanionOutlineProvider1;
import o.ViewLayerUniqueDrawingIdApi29;
import o.accessgetNodeToNodeStatep;
import o.placeAtf8xVGno;
import o.setShouldUseDispatchDrawui;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f0 extends HuaweiApi<v0> implements d0 {
    private static final e0 b = new e0();
    private static final Api<v0> c = new Api<>("HmsLocation.API");
    private u a;

    @Override // com.huawei.hms.common.HuaweiApi
    public int getKitSdkVersion() {
        return 61600302;
    }

    public f0(Activity activity, v0 v0Var) {
        super(activity, c, v0Var, (AbstractClientBuilder) b);
        c(activity);
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui d() {
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        if (y.a(getContext())) {
            viewLayerUniqueDrawingIdApi29.serializer(new ApiException(new Status(LocationStatusCode.NOT_YET_SUPPORTED, LocationStatusCode.getStatusCodeString(LocationStatusCode.NOT_YET_SUPPORTED))));
            return viewLayerUniqueDrawingIdApi29;
        }
        String tid = new BackgroundReq(getContext()).getTid();
        HMSLocationLog.i("LocationClientImpl", tid, "disableBackgroundLocation");
        return doWrite(new d("location.disableBackgroundLocation", "", tid));
    }

    private void c(Context context) {
        if (placeAtf8xVGno.RemoteActionCompatParcelizer == null) {
            placeAtf8xVGno.RemoteActionCompatParcelizer = context.getApplicationContext();
        }
        CollectionInfo_androidKttoAccessibilityCollectionItemInfo1 collectionInfo_androidKttoAccessibilityCollectionItemInfo1Write = CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write();
        if (collectionInfo_androidKttoAccessibilityCollectionItemInfo1Write.write.get()) {
            return;
        }
        collectionInfo_androidKttoAccessibilityCollectionItemInfo1Write.MediaDescriptionCompat.sendEmptyMessage(2);
    }

    private void e() throws ApiException {
        if (!PermissionUtil.isLocationPermissionAvailable(getContext())) {
            throw new ApiException(new Status(10803, LocationStatusCode.getStatusCodeString(10803)));
        }
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui a(Location location) {
        ApiException e;
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        SetMockLocationRequest setMockLocationRequest = new SetMockLocationRequest(getContext());
        String tid = setMockLocationRequest.getTid();
        try {
            HMSLocationLog.i("LocationClientImpl", tid, "set mock location begin");
            if (location == null) {
                throw new ApiException(new Status(LocationStatusCode.PARAM_ERROR_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.PARAM_ERROR_EMPTY)));
            }
            if (!PermissionUtil.isLocationPermissionAvailable(getContext()) || !PermissionUtil.canAccessMockLocation(getContext().getPackageName(), getContext())) {
                throw new ApiException(new Status(10803, LocationStatusCode.getStatusCodeString(10803)));
            }
            setMockLocationRequest.setPackageName(getContext().getPackageName());
            setMockLocationRequest.setMockLocation(location);
            JSONObject jSONObjectCreateLocationJsonObject = LocationJsonUtil.createLocationJsonObject(setMockLocationRequest.getMockLocation());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mockLocation", jSONObjectCreateLocationJsonObject);
            jSONObject.put("packageName", setMockLocationRequest.getPackageName());
            jSONObject.put("locTransactionId", setMockLocationRequest.getTid());
            return doWrite(new r1("location.setMockLocation", jSONObject.toString(), tid));
        } catch (ApiException e2) {
            e = e2;
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("set mock location api exception:"), "LocationClientImpl", tid);
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        } catch (Exception unused) {
            HMSLocationLog.e("LocationClientImpl", tid, "set mock location exception");
            e = new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        }
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui b() {
        ApiException apiException;
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        try {
            HMSLocationLog.i("LocationClientImpl", tid, "get last location begin. Version Code = 61600302");
            e();
            return doWrite(new j("location.getLastLocation", JsonUtil.createJsonString(locationBaseRequest), locationBaseRequest.getTid(), ""));
        } catch (ApiException e) {
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("get last location api exception:"), "LocationClientImpl", tid);
            apiException = e;
            viewLayerUniqueDrawingIdApi29.serializer(apiException);
            return viewLayerUniqueDrawingIdApi29;
        } catch (Exception unused) {
            HMSLocationLog.e("LocationClientImpl", tid, "get last location exception");
            apiException = new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            viewLayerUniqueDrawingIdApi29.serializer(apiException);
            return viewLayerUniqueDrawingIdApi29;
        }
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public <TResult, TClient extends AnyClient> setShouldUseDispatchDrawui doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
        u uVar;
        if (this.a == null) {
            Object objA = x.a(getContext(), new y());
            if (objA instanceof u) {
                this.a = (u) objA;
            }
        }
        return (y.a(getContext()) || (uVar = this.a) == null) ? super.doWrite(taskApiCall) : uVar.a(this, taskApiCall, b);
    }

    public f0(Context context, v0 v0Var) {
        super(context, c, v0Var, b);
        c(context);
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui c() {
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        viewLayerUniqueDrawingIdApi29.serializer(new ApiException(new Status(LocationStatusCode.NOT_YET_SUPPORTED, LocationStatusCode.getStatusCodeString(LocationStatusCode.NOT_YET_SUPPORTED))));
        return viewLayerUniqueDrawingIdApi29;
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui b(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        return a(locationRequest, locationCallback, looper, null, "ExCallback");
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui a(LocationSettingsRequest locationSettingsRequest) {
        ApiException e;
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        CheckLocationSettingsRequest checkLocationSettingsRequest = new CheckLocationSettingsRequest(getContext());
        String tid = checkLocationSettingsRequest.getTid();
        try {
            HMSLocationLog.i("LocationClientImpl", tid, "checkLocationSettings");
            if (locationSettingsRequest == null) {
                throw new ApiException(new Status(LocationStatusCode.PARAM_ERROR_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.PARAM_ERROR_EMPTY)));
            }
            checkLocationSettingsRequest.setLocationSettingsRequest(locationSettingsRequest);
            return doWrite(new c("location.checkLocationSettings", JsonUtil.createJsonString(checkLocationSettingsRequest), tid));
        } catch (ApiException e2) {
            e = e2;
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("check location settings api exception:"), "LocationClientImpl", tid);
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        } catch (Exception unused) {
            HMSLocationLog.e("LocationClientImpl", tid, "check location settings exception");
            e = new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        }
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui a(int i, Notification notification) {
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        if (y.a(getContext())) {
            e = new ApiException(new Status(LocationStatusCode.NOT_YET_SUPPORTED, LocationStatusCode.getStatusCodeString(LocationStatusCode.NOT_YET_SUPPORTED)));
        } else {
            BackgroundReq backgroundReq = new BackgroundReq(getContext());
            String tid = backgroundReq.getTid();
            try {
                HMSLocationLog.i("LocationClientImpl", tid, "enableBackgroundLocation");
                if (i == 0) {
                    throw new ApiException(new Status(10802, LocationStatusCode.getStatusCodeString(10802)));
                }
                if (notification == null) {
                    throw new ApiException(new Status(LocationStatusCode.PARAM_ERROR_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.PARAM_ERROR_EMPTY)));
                }
                if (!PermissionUtil.isPermissionAvailable(getContext(), "android.permission.FOREGROUND_SERVICE")) {
                    throw new ApiException(new Status(10803, LocationStatusCode.getStatusCodeString(10803)));
                }
                backgroundReq.setNotificationId(i);
                e eVar = new e("location.enableBackgroundLocation", JsonUtil.createJsonString(backgroundReq), tid);
                eVar.setParcelable(notification);
                return doWrite(eVar);
            } catch (ApiException e) {
                e = e;
                IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("enable background location api exception:"), "LocationClientImpl", tid);
            }
        }
        viewLayerUniqueDrawingIdApi29.serializer(e);
        return viewLayerUniqueDrawingIdApi29;
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui a(LocationRequest locationRequest) {
        ApiException apiException;
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        GetLastLocationRequest getLastLocationRequest = new GetLastLocationRequest(getContext(), locationRequest.getNeedAddress(), locationRequest.getLanguage(), locationRequest.getCountryCode());
        String tid = getLastLocationRequest.getTid();
        try {
            HMSLocationLog.i("LocationClientImpl", tid, "get last location begin. Version Code = 61600302");
            e();
            return doWrite(new i("location.getLastLocation", JsonUtil.createJsonString(getLastLocationRequest), getLastLocationRequest.getTid(), ""));
        } catch (ApiException e) {
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("get last location with address api exception:"), "LocationClientImpl", tid);
            apiException = e;
            viewLayerUniqueDrawingIdApi29.serializer(apiException);
            return viewLayerUniqueDrawingIdApi29;
        } catch (Exception unused) {
            HMSLocationLog.e("LocationClientImpl", tid, "get last location with address exception");
            apiException = new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            viewLayerUniqueDrawingIdApi29.serializer(apiException);
            return viewLayerUniqueDrawingIdApi29;
        }
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui a() {
        ApiException apiException;
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        try {
            HMSLocationLog.i("LocationClientImpl", tid, "get location availability begin");
            e();
            return doWrite(new k("location.getLocationAvailability", JsonUtil.createJsonString(locationBaseRequest), tid));
        } catch (ApiException e) {
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("getLocationAvailability ApiException:"), "LocationClientImpl", tid);
            apiException = e;
            viewLayerUniqueDrawingIdApi29.serializer(apiException);
            return viewLayerUniqueDrawingIdApi29;
        } catch (Exception unused) {
            HMSLocationLog.e("LocationClientImpl", tid, "getLocationAvailability exception");
            apiException = new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            viewLayerUniqueDrawingIdApi29.serializer(apiException);
            return viewLayerUniqueDrawingIdApi29;
        }
    }

    private setShouldUseDispatchDrawui a(LocationCallback locationCallback, PendingIntent pendingIntent, String str) {
        ApiException e;
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        RemoveLocationUpdatesRequest removeLocationUpdatesRequest = new RemoveLocationUpdatesRequest(getContext());
        String tid = removeLocationUpdatesRequest.getTid();
        try {
            HMSLocationLog.i("LocationClientImpl", tid, str + " removeLocationUpdates  begin");
            return doWrite(LocationRequestHelper.createRemoveTaskApiCall(locationCallback, pendingIntent, str, tid, removeLocationUpdatesRequest));
        } catch (ApiException e2) {
            e = e2;
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, af$$ExternalSyntheticOutline0.m(str, " remove location updates api exception:"), "LocationClientImpl", tid);
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        } catch (Exception unused) {
            HMSLocationLog.e("LocationClientImpl", tid, str + " remove location updates exception");
            e = new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        }
    }

    private setShouldUseDispatchDrawui a(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper, PendingIntent pendingIntent, String str) {
        ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1 = new ViewLayerCompanionOutlineProvider1();
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = viewLayerCompanionOutlineProvider1.RemoteActionCompatParcelizer;
        RequestLocationUpdatesRequest requestLocationUpdatesRequest = new RequestLocationUpdatesRequest(getContext());
        String tid = requestLocationUpdatesRequest.getTid();
        b bVarCreateRequestApiCall = null;
        try {
            HMSLocationLog.i("LocationClientImpl", tid, str + " requestLocationUpdates begin");
            bVarCreateRequestApiCall = LocationRequestHelper.createRequestApiCall(str, locationRequest, locationCallback, looper, pendingIntent, requestLocationUpdatesRequest);
            bVarCreateRequestApiCall.a(viewLayerCompanionOutlineProvider1);
            try {
                return doWrite(bVarCreateRequestApiCall);
            } catch (ApiException e) {
                e = e;
                if (bVarCreateRequestApiCall != null) {
                    bVarCreateRequestApiCall.a(true);
                }
                StringBuilder sbM = af$$ExternalSyntheticOutline0.m(str, " requestLocationUpdates api exception");
                sbM.append(e.getMessage());
                HMSLocationLog.e("LocationClientImpl", tid, sbM.toString());
                LocationRequestHelper.reportRequest(tid, e.getStatusCode(), e.getStatusMessage(), LocationRequestHelper.getCpTid(locationRequest));
                viewLayerCompanionOutlineProvider1.read(e);
                return viewLayerUniqueDrawingIdApi29;
            } catch (Exception unused) {
                HMSLocationLog.e("LocationClientImpl", tid, str + " requestLocationUpdates exception");
                if (bVarCreateRequestApiCall != null) {
                    bVarCreateRequestApiCall.a(true);
                }
                LocationRequestHelper.reportRequest(tid, 10000, LocationStatusCode.getStatusCodeString(10000), LocationRequestHelper.getCpTid(locationRequest));
                viewLayerCompanionOutlineProvider1.read(new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000))));
                return viewLayerUniqueDrawingIdApi29;
            }
        } catch (ApiException e2) {
            e = e2;
        } catch (Exception unused2) {
        }
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui a(PendingIntent pendingIntent) {
        return a((LocationCallback) null, pendingIntent, "Intent");
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui a(LocationCallback locationCallback) {
        return a(locationCallback, (PendingIntent) null, "NORMAL Callback");
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui a(LocationRequest locationRequest, PendingIntent pendingIntent) {
        return a(locationRequest, null, null, pendingIntent, "Intent");
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui a(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        return a(locationRequest, locationCallback, looper, null, "NORMAL Callback");
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui a(LogConfig logConfig) {
        ApiException e;
        String string = UUID.randomUUID().toString();
        HMSLocationLog.i("LocationClientImpl", string, "setLogConfig start");
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        try {
            if (logConfig == null) {
                throw new ApiException(new Status(LocationStatusCode.ARGUMENTS_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.ARGUMENTS_EMPTY)));
            }
            HMSLocationLog.i("LocationClientImpl", string, "setLogConfig logConfig check");
            String logPath = logConfig.getLogPath();
            Context context = getContext();
            if (placeAtf8xVGno.RemoteActionCompatParcelizer == null) {
                placeAtf8xVGno.RemoteActionCompatParcelizer = context.getApplicationContext();
            }
            w1.a(getContext(), logPath, string);
            w1.b(getContext(), logPath, string);
            accessgetNodeToNodeStatep.IconCompatParcelizer(w1.a(logConfig));
            if (w1.b()) {
                accessgetNodeToNodeStatep.read("LocationClientImpl", w1.a(getContext()));
            }
            return viewLayerUniqueDrawingIdApi29;
        } catch (ApiException e2) {
            e = e2;
            HMSLocationLog.e("LocationClientImpl", string, "setLogConfig apiException");
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        } catch (Exception unused) {
            HMSLocationLog.e("LocationClientImpl", string, "setLogConfig exception");
            e = new ApiException(new Status(LocationStatusCode.METHOD_INVOKE_ERROR, LocationStatusCode.getStatusCodeString(LocationStatusCode.METHOD_INVOKE_ERROR)));
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        }
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui a(OfflineLocationRequest offlineLocationRequest) {
        ApiException e;
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        if (offlineLocationRequest != null) {
            try {
                if (offlineLocationRequest.getRequestDataList() != null && !offlineLocationRequest.getRequestDataList().isEmpty()) {
                    String tid = offlineLocationRequest.getTid();
                    HMSLocationLog.i("LocationClientImpl", tid, "getOfflineLocation begin. Version Code = 61600302");
                    e();
                    return doWrite(new n(LocationNaming.GET_OFFLINE_LOCATION_NAME, new Gson().toJson(offlineLocationRequest), tid));
                }
            } catch (ApiException e2) {
                e = e2;
                IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("getOfflineLocation api exception:"), "LocationClientImpl", null);
                viewLayerUniqueDrawingIdApi29.serializer(e);
                return viewLayerUniqueDrawingIdApi29;
            } catch (Exception unused) {
                HMSLocationLog.e("LocationClientImpl", null, "getOfflineLocation exception");
                e = new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
                viewLayerUniqueDrawingIdApi29.serializer(e);
                return viewLayerUniqueDrawingIdApi29;
            }
        }
        throw new ApiException(new Status(LocationStatusCode.PARAM_ERROR_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.PARAM_ERROR_EMPTY)));
    }

    @Override // com.huawei.hms.locationSdk.d0
    public setShouldUseDispatchDrawui a(boolean z) {
        ApiException e;
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        String tid = new LocationBaseRequest(getContext()).getTid();
        try {
            HMSLocationLog.i("LocationClientImpl", tid, "set mock mode begin");
            if (!PermissionUtil.isLocationPermissionAvailable(getContext()) || !PermissionUtil.canAccessMockLocation(getContext().getPackageName(), getContext())) {
                HMSLocationLog.e("LocationClientImpl", tid, "setMockEnabled,Permission is false ");
                throw new ApiException(new Status(10803, LocationStatusCode.getStatusCodeString(10803)));
            }
            SetMockModeRequest setMockModeRequest = new SetMockModeRequest(getContext());
            setMockModeRequest.setMockMode(z);
            return doWrite(new s1("location.setMockMode", JsonUtil.createJsonString(setMockModeRequest), tid));
        } catch (ApiException e2) {
            e = e2;
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("set mock mode api exception:"), "LocationClientImpl", tid);
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        } catch (Exception unused) {
            HMSLocationLog.e("LocationClientImpl", tid, "set mock mode exception");
            e = new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        }
    }
}
