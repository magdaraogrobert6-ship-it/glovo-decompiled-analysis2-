package com.huawei.hms.locationSdk;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.location.GetFromLocationNameRequest;
import com.huawei.hms.location.GetFromLocationRequest;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.common.LocationNaming;
import com.huawei.hms.support.api.entity.location.geocoder.GeocoderRequest;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.utils.JsonUtil;
import java.util.Locale;
import o.ViewLayerUniqueDrawingIdApi29;
import o.WrappedCompositionsetContent1211;
import o.setShouldUseDispatchDrawui;

/* JADX INFO: loaded from: classes4.dex */
public class l0 extends HuaweiApi<v0> implements j0 {
    private static final k0 c = new k0();
    private static final Api<v0> d = new Api<>("HmsLocation.API");
    private u a;
    private Locale b;

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return 5;
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getKitSdkVersion() {
        return 61600302;
    }

    public l0(Activity activity, Locale locale, v0 v0Var) {
        super(activity, d, v0Var, (AbstractClientBuilder) c);
        this.b = locale;
    }

    @Override // com.huawei.hms.locationSdk.j0
    public setShouldUseDispatchDrawui a(GetFromLocationNameRequest getFromLocationNameRequest) {
        ApiException apiException;
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        if (getFromLocationNameRequest == null || getFromLocationNameRequest.getLocationName() == null || getFromLocationNameRequest.getLocationName().isEmpty()) {
            apiException = new ApiException(new Status(LocationStatusCode.PARAM_ERROR_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.PARAM_ERROR_EMPTY)));
        } else if (b(getFromLocationNameRequest)) {
            apiException = new ApiException(new Status(10802, LocationStatusCode.getStatusCodeString(10802)));
        } else {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationGeocoderClientImpl", "getFromLocationName checkParams success");
            GeocoderRequest geocoderRequest = new GeocoderRequest(getContext(), getFromLocationNameRequest.getLocationName(), getFromLocationNameRequest.getMaxResults());
            geocoderRequest.setLowerLeftLatitude(getFromLocationNameRequest.getLowerLeftLatitude());
            geocoderRequest.setLowerLeftLongitude(getFromLocationNameRequest.getLowerLeftLongitude());
            geocoderRequest.setUpperRightLatitude(getFromLocationNameRequest.getUpperRightLatitude());
            geocoderRequest.setUpperRightLongitude(getFromLocationNameRequest.getUpperRightLongitude());
            Locale locale = this.b;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            geocoderRequest.setLanguage(locale.getLanguage());
            Locale locale2 = this.b;
            if (locale2 == null) {
                locale2 = Locale.getDefault();
            }
            geocoderRequest.setCountry(locale2.getCountry());
            String tid = geocoderRequest.getTid();
            try {
                HMSLocationLog.i("LocationGeocoderClientImpl", tid, "getFromLocationName begin. Version Code = 61600302");
                return doWrite(new f(getContext(), LocationNaming.GET_FROM_LOCATION_NAME, JsonUtil.createJsonString(geocoderRequest), geocoderRequest.getTid(), ""));
            } catch (Exception unused) {
                HMSLocationLog.e("LocationGeocoderClientImpl", tid, "getFromLocationName exception");
                apiException = new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            }
        }
        viewLayerUniqueDrawingIdApi29.serializer(apiException);
        return viewLayerUniqueDrawingIdApi29;
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
        return (y.a(getContext()) || (uVar = this.a) == null) ? super.doWrite(taskApiCall) : uVar.a(this, taskApiCall, c);
    }

    public l0(Context context, Locale locale, v0 v0Var) {
        super(context, d, v0Var, c);
        this.b = locale;
    }

    private boolean b(GetFromLocationNameRequest getFromLocationNameRequest) {
        boolean z = getFromLocationNameRequest.getLowerLeftLatitude() < -90.0d || getFromLocationNameRequest.getLowerLeftLatitude() > 90.0d;
        boolean z2 = getFromLocationNameRequest.getLowerLeftLongitude() < -180.0d || getFromLocationNameRequest.getLowerLeftLongitude() > 180.0d;
        boolean z3 = getFromLocationNameRequest.getUpperRightLatitude() < -90.0d || getFromLocationNameRequest.getUpperRightLatitude() > 90.0d;
        if (!z && !z2 && !z3) {
            boolean z4 = getFromLocationNameRequest.getUpperRightLongitude() < -180.0d || getFromLocationNameRequest.getUpperRightLongitude() > 180.0d;
            boolean z5 = getFromLocationNameRequest.getMaxResults() < 0;
            if (!z4 && !z5) {
                return false;
            }
        }
        return true;
    }

    private boolean b(GetFromLocationRequest getFromLocationRequest) {
        boolean z = getFromLocationRequest.getLatitude() < -90.0d || getFromLocationRequest.getLatitude() > 90.0d;
        boolean z2 = getFromLocationRequest.getLongitude() < -180.0d || getFromLocationRequest.getLongitude() > 180.0d;
        boolean z3 = getFromLocationRequest.getMaxResults() < 0;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationGeocoderClientImpl", "isValidReversesRequest latitudeState = " + z + ",longitudeState = " + z2 + ",maxState = " + z3);
        return z || z2 || z3;
    }

    @Override // com.huawei.hms.locationSdk.j0
    public setShouldUseDispatchDrawui a(GetFromLocationRequest getFromLocationRequest) {
        ApiException apiException;
        ViewLayerUniqueDrawingIdApi29 viewLayerUniqueDrawingIdApi29 = new ViewLayerUniqueDrawingIdApi29();
        if (getFromLocationRequest == null) {
            apiException = new ApiException(new Status(LocationStatusCode.PARAM_ERROR_EMPTY, LocationStatusCode.getStatusCodeString(LocationStatusCode.PARAM_ERROR_EMPTY)));
        } else if (b(getFromLocationRequest)) {
            apiException = new ApiException(new Status(10802, LocationStatusCode.getStatusCodeString(10802)));
        } else {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationGeocoderClientImpl", "getFromLocation checkParams success");
            GeocoderRequest geocoderRequest = new GeocoderRequest(getContext(), getFromLocationRequest.getLatitude(), getFromLocationRequest.getLongitude(), getFromLocationRequest.getMaxResults());
            Locale locale = this.b;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            geocoderRequest.setLanguage(locale.getLanguage());
            Locale locale2 = this.b;
            if (locale2 == null) {
                locale2 = Locale.getDefault();
            }
            geocoderRequest.setCountry(locale2.getCountry());
            String tid = geocoderRequest.getTid();
            try {
                HMSLocationLog.i("LocationGeocoderClientImpl", tid, "getFromLocation begin. Version Code = 61600302");
                return doWrite(new g(getContext(), LocationNaming.GET_FROM_LOCATION, JsonUtil.createJsonString(geocoderRequest), geocoderRequest.getTid(), ""));
            } catch (Exception unused) {
                HMSLocationLog.e("LocationGeocoderClientImpl", tid, "getFromLocation exception");
                apiException = new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            }
        }
        viewLayerUniqueDrawingIdApi29.serializer(apiException);
        return viewLayerUniqueDrawingIdApi29;
    }
}
