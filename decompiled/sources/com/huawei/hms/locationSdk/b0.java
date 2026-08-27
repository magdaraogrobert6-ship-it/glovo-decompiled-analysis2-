package com.huawei.hms.locationSdk;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import com.google.gson.Gson;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.location.ActivityConversionInfo;
import com.huawei.hms.location.ActivityConversionRequest;
import com.huawei.hms.location.ActivityIdentificationData;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.activityrecognition.RequestActivityConversionRequest;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;
import com.huawei.hms.support.api.location.common.CollectionsUtil;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.PermissionUtil;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.utils.JsonUtil;
import java.util.List;
import java.util.UUID;
import o.IconCompatParcelizer;
import o.ViewLayerUniqueDrawingIdApi29;
import o.setShouldUseDispatchDrawui;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b0 extends HuaweiApi<v0> implements z {
    private static final a0 b = new a0();
    private static final Api<v0> c = new Api<>("HmsLocation.API");
    private u a;

    @Override // com.huawei.hms.common.HuaweiApi
    public int getKitSdkVersion() {
        return 61600302;
    }

    public b0(Activity activity, v0 v0Var) {
        super(activity, c, v0Var, (AbstractClientBuilder) b);
    }

    @Override // com.huawei.hms.locationSdk.z
    public setShouldUseDispatchDrawui a(ActivityConversionRequest activityConversionRequest, PendingIntent pendingIntent) {
        ApiException e;
        RequestActivityConversionRequest requestActivityConversionRequest = new RequestActivityConversionRequest(getContext());
        String tid = requestActivityConversionRequest.getTid();
        HMSLocationLog.i("LocationArClientImpl", tid, "createActivityConversionUpdates begin");
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        try {
            if (activityConversionRequest == null || pendingIntent == null) {
                throw new ApiException(new Status(LocationStatusCode.PARAM_ERROR_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.PARAM_ERROR_EMPTY)));
            }
            a(tid);
            List<ActivityConversionInfo> activityConversions = activityConversionRequest.getActivityConversions();
            if (!CollectionsUtil.isEmpty(activityConversions)) {
                for (ActivityConversionInfo activityConversionInfo : activityConversions) {
                    int conversionType = activityConversionInfo.getConversionType();
                    int activityType = activityConversionInfo.getActivityType();
                    if (conversionType != 0 && conversionType != 1) {
                        throw new ApiException(new Status(10802, LocationStatusCode.getStatusCodeString(10802)));
                    }
                    if (!ActivityIdentificationData.isValidType(activityType)) {
                        throw new ApiException(new Status(10802, LocationStatusCode.getStatusCodeString(10802)));
                    }
                }
            }
            b1 b1Var = new b1();
            b1Var.a(pendingIntent);
            b1Var.a(tid);
            requestActivityConversionRequest.setActivityConversions(activityConversionRequest.getActivityConversions());
            d1 d1Var = new d1("location.requestActivityConversionUpdates", y.a(getContext()) ? JsonUtil.createJsonString(requestActivityConversionRequest) : new Gson().toJson(requestActivityConversionRequest), b1Var);
            d1Var.setParcelable(pendingIntent);
            return doWrite(d1Var);
        } catch (ApiException e2) {
            e = e2;
            HMSLocationLog.e("LocationArClientImpl", tid, "createActivityConversionUpdates api exception");
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        } catch (Exception unused) {
            HMSLocationLog.e("LocationArClientImpl", tid, "createActivityConversionUpdates exception");
            e = new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        }
    }

    @Override // com.huawei.hms.locationSdk.z
    public setShouldUseDispatchDrawui b(PendingIntent pendingIntent) {
        ApiException e;
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        HMSLocationLog.i("LocationArClientImpl", tid, "deleteActivityIdentificationUpdates begin");
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        try {
            if (pendingIntent == null) {
                throw new ApiException(new Status(LocationStatusCode.PARAM_ERROR_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.PARAM_ERROR_EMPTY)));
            }
            e1 e1Var = new e1();
            e1Var.a(pendingIntent);
            e1 e1Var2 = (e1) f1.b().b(e1Var);
            if (e1Var2 != null) {
                HMSLocationLog.e("LocationArClientImpl", tid, "deleteActivityIdentificationUpdates cannot find cache");
                tid = e1Var2.a();
            }
            locationBaseRequest.setTid(tid);
            e1Var.a(tid);
            y0 y0Var = new y0("location.removeActivityIdentificationUpdates", JsonUtil.createJsonString(locationBaseRequest), e1Var);
            y0Var.setParcelable(pendingIntent);
            return doWrite(y0Var);
        } catch (ApiException e2) {
            e = e2;
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("deleteActivityIdentificationUpdates api exception:"), "LocationArClientImpl", tid);
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        } catch (Exception unused) {
            HMSLocationLog.e("LocationArClientImpl", tid, "deleteActivityIdentificationUpdates exception");
            e = new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            viewLayerUniqueDrawingIdApi29.serializer(e);
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

    public b0(Context context, v0 v0Var) {
        super(context, c, v0Var, b);
    }

    @Override // com.huawei.hms.locationSdk.z
    public setShouldUseDispatchDrawui a(PendingIntent pendingIntent) {
        ApiException e;
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        HMSLocationLog.i("LocationArClientImpl", tid, "deleteActivityConversionUpdates begin");
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        try {
            if (pendingIntent == null) {
                throw new ApiException(new Status(LocationStatusCode.PARAM_ERROR_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.PARAM_ERROR_EMPTY)));
            }
            b1 b1Var = new b1();
            b1Var.a(pendingIntent);
            b1 b1Var2 = (b1) c1.b().b(b1Var);
            if (b1Var2 != null) {
                HMSLocationLog.e("LocationArClientImpl", tid, "deleteActivityConversionUpdates cannot find cache");
                tid = b1Var2.a();
            }
            locationBaseRequest.setTid(tid);
            b1Var.a(tid);
            x0 x0Var = new x0("location.removeActivityConversionUpdates", JsonUtil.createJsonString(locationBaseRequest), b1Var);
            x0Var.setParcelable(pendingIntent);
            return doWrite(x0Var);
        } catch (ApiException e2) {
            e = e2;
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("deleteActivityConversionUpdates api exception:"), "LocationArClientImpl", tid);
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        } catch (Exception unused) {
            HMSLocationLog.e("LocationArClientImpl", tid, "deleteActivityConversionUpdates exception");
            e = new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        }
    }

    private void a(String str) throws ApiException {
        if (Build.VERSION.SDK_INT > 28) {
            if (PermissionUtil.isPermissionAvailable(getContext(), "android.permission.ACTIVITY_RECOGNITION")) {
                return;
            }
            HMSLocationLog.e("LocationArClientImpl", str, "android Q requestActivityUpdates isPermissionAvailable is false ");
            throw new ApiException(new Status(10803, LocationStatusCode.getStatusCodeString(10803)));
        }
        if (!y.a(getContext()) || PermissionUtil.isPermissionAvailable(getContext(), "com.huawei.hms.permission.ACTIVITY_RECOGNITION")) {
            return;
        }
        HMSLocationLog.e("LocationArClientImpl", str, "requestActivityUpdates isPermissionAvailable is false ");
        throw new ApiException(new Status(10803, LocationStatusCode.getStatusCodeString(10803)));
    }

    @Override // com.huawei.hms.locationSdk.z
    public setShouldUseDispatchDrawui a(long j, PendingIntent pendingIntent) {
        ApiException e;
        String string = UUID.randomUUID().toString();
        HMSLocationLog.i("LocationArClientImpl", string, "createActivityIdentificationUpdates begin");
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        try {
            if (pendingIntent == null) {
                throw new ApiException(new Status(LocationStatusCode.PARAM_ERROR_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.PARAM_ERROR_EMPTY)));
            }
            a(string);
            if (j < 0) {
                throw new ApiException(new Status(10802, LocationStatusCode.getStatusCodeString(10802)));
            }
            e1 e1Var = new e1();
            e1Var.a(pendingIntent);
            e1Var.a(string);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("detectionIntervalMillis", j);
            jSONObject.put("locTransactionId", string);
            jSONObject.put("packageName", getContext().getPackageName());
            g1 g1Var = new g1("location.requestActivityIdentificationUpdates", jSONObject.toString(), e1Var);
            g1Var.setParcelable(pendingIntent);
            return doWrite(g1Var);
        } catch (ApiException e2) {
            e = e2;
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("createActivityIdentificationUpdates api exception:"), "LocationArClientImpl", string);
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        } catch (Exception unused) {
            HMSLocationLog.e("LocationArClientImpl", string, "createActivityIdentificationUpdates exception");
            e = new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        }
    }
}
