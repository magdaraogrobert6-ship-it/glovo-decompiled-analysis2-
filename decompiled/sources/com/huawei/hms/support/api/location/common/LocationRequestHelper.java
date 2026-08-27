package com.huawei.hms.support.api.location.common;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import androidx.compose.ui.graphics.Fields;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.locationSdk.a1;
import com.huawei.hms.locationSdk.b;
import com.huawei.hms.locationSdk.h1;
import com.huawei.hms.locationSdk.i1;
import com.huawei.hms.locationSdk.j1;
import com.huawei.hms.locationSdk.k1;
import com.huawei.hms.locationSdk.l1;
import com.huawei.hms.locationSdk.m1;
import com.huawei.hms.locationSdk.w0;
import com.huawei.hms.locationSdk.y;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.binder.InnerBinder;
import com.huawei.hms.support.api.entity.location.updates.RemoveLocationUpdatesRequest;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.location.lite.common.report.ReportBuilder;
import com.huawei.location.lite.common.util.APKUtil;
import com.huawei.location.lite.common.util.NetworkUtil;
import com.huawei.location.lite.common.util.ReflectionUtils;
import java.util.Map;
import o.CollectionInfo_androidKttoAccessibilityCollectionItemInfo1;
import o.ViewConfigurationDefaultImpls;
import o.WrappedCompositionsetContent1211;
import o.addMenuItemui;
import o.onCreateActionMode;
import o.onPrepareActionMode;
import o.onStateChanged;
import o.placeAtf8xVGno;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class LocationRequestHelper {
    public static final String CP_TRANS_ID = "cpTransId";
    private static final String LOCATION_REQUEST_API_NAME = "Location_requestLocationUpdates_SDK";
    public static final String PETAL_MAPS_CAR_PACKAGE_NAME = "com.huawei.maps.car.app";
    public static final String PETAL_MAPS_PACKAGE_NAME = "com.huawei.maps.app";
    private static final String TAG = "LocationRequestHelper";
    private static final String VDR_ENABLE = "1";
    private static final String VDR_GNSS_OPTION = "vdrEnable";

    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ int b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        public a(String str, int i, String str2, String str3) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            ReportBuilder reportBuilder = new ReportBuilder();
            reportBuilder.setApiName(LocationRequestHelper.LOCATION_REQUEST_API_NAME);
            reportBuilder.setWLANScan();
            reportBuilder.setLocationEnable(onPrepareActionMode.RemoteActionCompatParcelizer(placeAtf8xVGno.read()));
            reportBuilder.setTransactionID(this.a);
            reportBuilder.setPackage(placeAtf8xVGno.read().getPackageName());
            reportBuilder.setCpAppVersion((String) APKUtil.getApkInfo(Fields.Clip, placeAtf8xVGno.read().getPackageName()).read);
            reportBuilder.setErrorCode(this.b + "");
            reportBuilder.setErrorMessage(this.c);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(LocationRequestHelper.CP_TRANS_ID, this.d);
                reportBuilder.setExt(jSONObject.toString());
            } catch (JSONException unused) {
                HMSLocationLog.i(LocationRequestHelper.TAG, this.a, "reportRequest put ext failed");
            }
            CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().read(reportBuilder);
            CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.write().getClass();
            CollectionInfo_androidKttoAccessibilityCollectionItemInfo1.read();
        }
    }

    private static boolean isCodeAllowReport(int i) {
        return i == 10811;
    }

    private static void checkMethodSupport(String str) throws ApiException {
        if (TextUtils.equals(str, "Intent") && !y.a(placeAtf8xVGno.read())) {
            throw new ApiException(new Status(LocationStatusCode.NOT_YET_SUPPORTED, LocationStatusCode.getStatusCodeString(LocationStatusCode.NOT_YET_SUPPORTED)));
        }
    }

    public static String getCpTid(LocationRequest locationRequest) {
        Map<String, String> extras;
        return (locationRequest == null || (extras = locationRequest.getExtras()) == null || extras.isEmpty()) ? "" : extras.get(CP_TRANS_ID);
    }

    private static void logCurrentStatus(LocationRequest locationRequest, String str, Context context) {
        if (context == null || locationRequest == null) {
            HMSLocationLog.e(TAG, str, (context == null ? "context is null, " : "context is not null, ").concat(locationRequest == null ? "request is null, " : "request is not null, "));
            return;
        }
        HMSLocationLog.i(TAG, str, "priority: " + locationRequest.getPriority() + ", locationMode: " + onPrepareActionMode.RemoteActionCompatParcelizer(context) + ", netWork available: " + NetworkUtil.RemoteActionCompatParcelizer(context) + ", model is: " + Build.MODEL + ",WLANScan:" + addMenuItemui.read(placeAtf8xVGno.read()));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    private static void checkPriority(String str, LocationRequest locationRequest) throws ApiException {
        byte b;
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != -2099895620) {
            if (iHashCode != -1598699650) {
                if (iHashCode == 1366690360 && str.equals("ExCallback")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("NORMAL Callback")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("Intent")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0 || b == 1) {
            if (locationRequest.getPriority() == 200 || locationRequest.getPriority() == 300 || locationRequest.getPriority() == 400) {
                throw new ApiException(new Status(LocationStatusCode.METHOD_INVOKE_ERROR, LocationStatusCode.getStatusCodeString(LocationStatusCode.METHOD_INVOKE_ERROR)));
            }
            return;
        }
        if (b == 2 && locationRequest.getPriority() == 200) {
            locationRequest.setNeedAddress(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    private static void checkRequestParam(String str, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper, PendingIntent pendingIntent) throws ApiException {
        String str2;
        assertNoNull(locationRequest);
        int iHashCode = str.hashCode();
        if (iHashCode == -2099895620) {
            if (str.equals("Intent")) {
                assertNoNull(pendingIntent);
            }
            if (locationRequest.getNumUpdates() > 0) {
                throw new ApiException(new Status(10802, LocationStatusCode.getStatusCodeString(10802)));
            }
        }
        if (iHashCode != -1598699650) {
            str2 = iHashCode == 1366690360 ? "ExCallback" : "NORMAL Callback";
        }
        str.equals(str2);
        assertNoNull(locationCallback);
        assertNoNull(looper);
        if (locationRequest.getNumUpdates() > 0) {
            throw new ApiException(new Status(10802, LocationStatusCode.getStatusCodeString(10802)));
        }
    }

    public static b createRequestApiCall(String str, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper, PendingIntent pendingIntent, RequestLocationUpdatesRequest requestLocationUpdatesRequest) throws ApiException {
        checkMethodSupport(str);
        checkRequestParam(str, locationRequest, locationCallback, looper, pendingIntent);
        checkLocationPermission();
        checkPriority(str, locationRequest);
        buildRequestEntity(str, locationRequest, locationCallback, requestLocationUpdatesRequest);
        k1 k1Var = new k1(locationRequest, pendingIntent, locationCallback, looper, requestLocationUpdatesRequest.getTid(), str);
        String strCreateJsonString = JsonUtil.createJsonString(requestLocationUpdatesRequest);
        w0.b().c(locationCallback);
        return buildTaskApiCall(str, locationCallback, looper, pendingIntent, requestLocationUpdatesRequest, k1Var, strCreateJsonString);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    private static b buildTaskApiCall(String str, LocationCallback locationCallback, Looper looper, PendingIntent pendingIntent, RequestLocationUpdatesRequest requestLocationUpdatesRequest, k1 k1Var, String str2) throws ApiException {
        byte b;
        l1 i1Var;
        l1 j1Var;
        StringBuilder sb;
        b m1Var;
        String tid = requestLocationUpdatesRequest.getTid();
        int iHashCode = str.hashCode();
        if (iHashCode != -2099895620) {
            if (iHashCode != -1598699650) {
                if (iHashCode == 1366690360 && str.equals("ExCallback")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals("NORMAL Callback")) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals("Intent")) {
            b = 1;
        } else {
            b = -1;
        }
        if (b != 0) {
            if (b != 1) {
                i1Var = new l1("location.requestLocationUpdates", str2, tid, k1Var, looper, "");
                i1Var.setParcelable(InnerBinder.getInnerBinder());
                sb = new StringBuilder("requestLocationUpdates with callback uuid=");
            } else {
                m1Var = new m1("location.requestLocationUpdates", str2, tid, k1Var, "");
                m1Var.setParcelable(pendingIntent);
                sb = new StringBuilder("requestLocationUpdates with intent tid = ");
                sb.append(requestLocationUpdatesRequest.getTid());
                sb.append(" Version Code = 61600302");
            }
            HMSLocationLog.i(TAG, tid, sb.toString());
            logCurrentStatus(requestLocationUpdatesRequest.getLocationRequest(), tid, placeAtf8xVGno.read());
            return m1Var;
        }
        if (isNeedMdcLocation()) {
            j1Var = new h1("location.requestLocationUpdatesEx", str2, tid, k1Var, looper, "", requestLocationUpdatesRequest.getPackageName());
        } else {
            if (isVdrEnable(requestLocationUpdatesRequest)) {
                j1Var = new j1("location.requestLocationUpdatesEx", str2, tid, k1Var, looper, "", requestLocationUpdatesRequest.getPackageName());
            } else {
                i1Var = new i1("location.requestLocationUpdatesEx", str2, tid, k1Var, looper, "");
            }
            i1Var.setParcelable(InnerBinder.getInnerBinder());
            sb = new StringBuilder("requestLocationUpdates with callback uuid=");
        }
        i1Var = j1Var;
        i1Var.setParcelable(InnerBinder.getInnerBinder());
        sb = new StringBuilder("requestLocationUpdates with callback uuid=");
        sb.append(locationCallback.getUuid());
        sb.append(", tid=");
        sb.append(requestLocationUpdatesRequest.getTid());
        sb.append(", Version Code = 61600302");
        m1Var = i1Var;
        HMSLocationLog.i(TAG, tid, sb.toString());
        logCurrentStatus(requestLocationUpdatesRequest.getLocationRequest(), tid, placeAtf8xVGno.read());
        return m1Var;
    }

    private static void checkLocationPermission() throws ApiException {
        if (!PermissionUtil.isLocationPermissionAvailable(placeAtf8xVGno.read())) {
            throw new ApiException(new Status(10803, LocationStatusCode.getStatusCodeString(10803)));
        }
    }

    public static b createRemoveTaskApiCall(LocationCallback locationCallback, PendingIntent pendingIntent, String str, String str2, RemoveLocationUpdatesRequest removeLocationUpdatesRequest) throws ApiException {
        k1 k1VarCreateRemoveLocationUpdatesCache = createRemoveLocationUpdatesCache(locationCallback, pendingIntent, str, str2);
        String strA = k1VarCreateRemoveLocationUpdatesCache.a();
        removeLocationUpdatesRequest.setTid(strA);
        if (TextUtils.equals(str, "NORMAL Callback")) {
            removeLocationUpdatesRequest.setUuid(locationCallback.getUuid());
        }
        a1 a1Var = new a1("location.removeLocationUpdates", JsonUtil.createJsonString(removeLocationUpdatesRequest), strA, k1VarCreateRemoveLocationUpdatesCache, "");
        if (TextUtils.equals(str, "Intent")) {
            a1Var.setParcelable(pendingIntent);
        }
        HMSLocationLog.i(TAG, strA, str + " removeLocationUpdates tid =" + strA + ",uuid = " + removeLocationUpdatesRequest.getUuid() + " Version Code = 61600302");
        return a1Var;
    }

    private static String getOption(RequestLocationUpdatesRequest requestLocationUpdatesRequest) {
        Map<String, String> extras = requestLocationUpdatesRequest.getLocationRequest().getExtras();
        String str = extras != null ? extras.get("vdrEnable") : "";
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "vdrEnable is: " + str);
        return str;
    }

    private static String getProductId() {
        try {
            return ((ViewConfigurationDefaultImpls) onStateChanged.write(placeAtf8xVGno.read())).serializer("client/product_id");
        } catch (Exception unused) {
            HMSLog.e(TAG, "get agc productId by exception");
            return "";
        }
    }

    public static boolean isNeedMdcLocation() {
        if (PETAL_MAPS_CAR_PACKAGE_NAME.equals(placeAtf8xVGno.read().getPackageName())) {
            return true;
        }
        HMSLocationLog.i(TAG, "", "do not need mdc location, not target package");
        return false;
    }

    private static boolean isVdrEnable(RequestLocationUpdatesRequest requestLocationUpdatesRequest) {
        if (requestLocationUpdatesRequest.getLocationRequest().getPriority() != 200) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "do not support vdr, priority is: " + requestLocationUpdatesRequest.getLocationRequest().getPriority());
            return false;
        }
        if (ReflectionUtils.getClass("com.huawei.location.vdr.VdrManager") != null) {
            return TextUtils.equals(getOption(requestLocationUpdatesRequest), VDR_ENABLE);
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "no vdr module, do not support vdr");
        return false;
    }

    public static void reportRequest(String str, int i, String str2, String str3) {
        if (PETAL_MAPS_CAR_PACKAGE_NAME.equals(placeAtf8xVGno.read().getPackageName()) || PETAL_MAPS_PACKAGE_NAME.equals(placeAtf8xVGno.read().getPackageName()) || isCodeAllowReport(i)) {
            onCreateActionMode.write.IconCompatParcelizer(new a(str, i, str2, str3));
        }
    }

    private static void buildRequestEntity(String str, LocationRequest locationRequest, LocationCallback locationCallback, RequestLocationUpdatesRequest requestLocationUpdatesRequest) {
        requestLocationUpdatesRequest.setLocationRequest(locationRequest);
        if (!TextUtils.equals(str, "Intent")) {
            requestLocationUpdatesRequest.setUuid(locationCallback.getUuid());
        }
        if (TextUtils.equals(str, "ExCallback")) {
            locationRequest.putExtras("productId", getProductId());
        }
    }

    public static void assertNoNull(Object obj) throws ApiException {
        if (obj == null) {
            throw new ApiException(new Status(LocationStatusCode.PARAM_ERROR_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.PARAM_ERROR_EMPTY)));
        }
    }

    private static k1 createRemoveLocationUpdatesCache(LocationCallback locationCallback, PendingIntent pendingIntent, String str, String str2) throws ApiException {
        checkRemoveRequestParam(locationCallback, pendingIntent, str);
        k1 k1Var = (k1) w0.b().b(new k1(null, pendingIntent, locationCallback, null, str2, str));
        if (k1Var != null) {
            return k1Var;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2099895620) {
            if (iHashCode == -1598699650) {
                str.equals("NORMAL Callback");
            }
        } else if (str.equals("Intent")) {
            HMSLocationLog.e(TAG, str2, "remove location updates with intent cannot find intent");
            throw new ApiException(new Status(LocationStatusCode.NO_MATCHED_INTENT, LocationStatusCode.getStatusCodeString(LocationStatusCode.NO_MATCHED_INTENT)));
        }
        HMSLocationLog.e(TAG, str2, "remove location updates with callback cannot find callback");
        w0.b().a(locationCallback);
        throw new ApiException(new Status(LocationStatusCode.NO_MATCHED_CALLBACK, LocationStatusCode.getStatusCodeString(LocationStatusCode.NO_MATCHED_CALLBACK)));
    }

    private static void checkRemoveRequestParam(LocationCallback locationCallback, PendingIntent pendingIntent, String str) throws ApiException {
        int iHashCode = str.hashCode();
        if (iHashCode != -2099895620) {
            if (iHashCode == -1598699650) {
                str.equals("NORMAL Callback");
            }
        } else if (str.equals("Intent")) {
            assertNoNull(pendingIntent);
            return;
        }
        assertNoNull(locationCallback);
    }
}
