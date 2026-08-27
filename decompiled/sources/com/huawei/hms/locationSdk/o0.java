package com.huawei.hms.locationSdk;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.api.CommonStatusCodes;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.location.GeofenceRequest;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;
import com.huawei.hms.support.api.entity.location.fence.AddGeofencesRequest;
import com.huawei.hms.support.api.entity.location.fence.RemoveGeofencesRequest;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.PermissionUtil;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.utils.JsonUtil;
import java.util.List;
import o.IconCompatParcelizer;
import o.ViewLayerUniqueDrawingIdApi29;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes4.dex */
public class o0 extends HuaweiApi<v0> implements m0 {
    private static final n0 b = new n0();
    private static final Api<v0> c = new Api<>("HmsLocation.API");
    private u a;

    @Override // com.huawei.hms.common.HuaweiApi
    public int getKitSdkVersion() {
        return 61600302;
    }

    public o0(Activity activity, v0 v0Var) {
        super(activity, c, v0Var, (AbstractClientBuilder) b);
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

    @Override // com.huawei.hms.locationSdk.m0
    public setShouldUseDispatchDrawui a(PendingIntent pendingIntent) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest(getContext());
        String tid = locationBaseRequest.getTid();
        try {
            if (pendingIntent == null) {
                throw new ApiException(new Status(LocationStatusCode.PARAM_ERROR_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.PARAM_ERROR_EMPTY)));
            }
            z0 z0Var = new z0("location.removeGeofences", JsonUtil.createJsonString(locationBaseRequest), tid);
            z0Var.setParcelable(pendingIntent);
            setShouldUseDispatchDrawui setshouldusedispatchdrawuiDoWrite = doWrite(z0Var);
            HMSLocationLog.i("LocationGeofenceClientImpl", tid, "removeGeofences sdk useTime:" + (System.currentTimeMillis() - jCurrentTimeMillis));
            return setshouldusedispatchdrawuiDoWrite;
        } catch (ApiException e) {
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("removeGeofences api exception:"), "LocationGeofenceClientImpl", tid);
            viewLayerUniqueDrawingIdApi29.serializer(e);
            HMSLocationLog.i("LocationGeofenceClientImpl", tid, "removeGeofences sdk useTime:" + (System.currentTimeMillis() - jCurrentTimeMillis));
            return viewLayerUniqueDrawingIdApi29;
        }
    }

    public o0(Context context, v0 v0Var) {
        super(context, c, v0Var, b);
    }

    @Override // com.huawei.hms.locationSdk.m0
    public setShouldUseDispatchDrawui a(List<String> list) {
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        RemoveGeofencesRequest removeGeofencesRequest = new RemoveGeofencesRequest(getContext());
        String tid = removeGeofencesRequest.getTid();
        if (list != null) {
            try {
                if (list.size() != 0) {
                    removeGeofencesRequest.setGeofenceRequestIds(list);
                    return doWrite(new z0("location.removeGeofences", JsonUtil.createJsonString(removeGeofencesRequest), tid));
                }
            } catch (ApiException e) {
                IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("removeGeofences api exception:"), "LocationGeofenceClientImpl", tid);
                viewLayerUniqueDrawingIdApi29.serializer(e);
                return viewLayerUniqueDrawingIdApi29;
            }
        }
        throw new ApiException(new Status(LocationStatusCode.PARAM_ERROR_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.PARAM_ERROR_EMPTY)));
    }

    @Override // com.huawei.hms.locationSdk.m0
    public setShouldUseDispatchDrawui a(GeofenceRequest geofenceRequest, PendingIntent pendingIntent) {
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        AddGeofencesRequest addGeofencesRequest = new AddGeofencesRequest(getContext());
        String tid = addGeofencesRequest.getTid();
        try {
            if (geofenceRequest == null || pendingIntent == null) {
                throw new ApiException(new Status(LocationStatusCode.PARAM_ERROR_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.PARAM_ERROR_EMPTY)));
            }
            if (!PermissionUtil.isGeofencePermissionAvailable(getContext())) {
                throw new ApiException(new Status(10204, CommonStatusCodes.getStatusCodeString(10204)));
            }
            addGeofencesRequest.setGeofencingRequest(geofenceRequest);
            a aVar = new a("location.addGeofences", JsonUtil.createJsonString(addGeofencesRequest), tid);
            aVar.setParcelable(pendingIntent);
            return doWrite(aVar);
        } catch (ApiException e) {
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("addGeofences api exception:"), "LocationGeofenceClientImpl", tid);
            viewLayerUniqueDrawingIdApi29.serializer(e);
            return viewLayerUniqueDrawingIdApi29;
        }
    }
}
