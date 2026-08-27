package com.huawei.location;

import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.location.LocationAvailability;
import com.huawei.hms.support.api.entity.location.common.LocationBaseRequest;
import com.huawei.hms.support.api.entity.location.locationavailability.GetLocationAvailabilityResponse;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.entity.StatusInfo;
import java.lang.reflect.Field;
import o.ResourceResolutionException;
import o.WrappedCompositionsetContent1211;
import o.getOnSelectAllRequested;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class GetAvailabilityTaskCall extends BaseApiRequest {
    private static final String TAG = "GetLocationAvailabilityApi";

    @Override // com.huawei.location.router.interfaces.IRouterRequest
    public void onRequest(String str) {
        String str2;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "onRequest GetAvailabilityTaskCall");
        getOnSelectAllRequested.write().getClass();
        LocationAvailability locationAvailability = new LocationAvailability();
        if (getOnSelectAllRequested.read() != null) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("HwLocationManager", "get last location successful");
            locationAvailability.setLocationStatus(0);
        } else {
            WrappedCompositionsetContent1211.read("HwLocationManager", "get last location failed");
            locationAvailability.setLocationStatus(1001);
        }
        StatusInfo statusInfo = new StatusInfo(0, 0, "");
        GetLocationAvailabilityResponse getLocationAvailabilityResponse = new GetLocationAvailabilityResponse();
        LocationBaseRequest locationBaseRequest = new LocationBaseRequest();
        ResourceResolutionException.IconCompatParcelizer(str, locationBaseRequest);
        getLocationAvailabilityResponse.setLocationAvailability(locationAvailability);
        JSONObject jSONObject = new JSONObject();
        for (Class<GetLocationAvailabilityResponse> superclass = GetLocationAvailabilityResponse.class; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                for (Field field : superclass.getDeclaredFields()) {
                    if (field.isAnnotationPresent(Packed.class)) {
                        boolean zIsAccessible = field.isAccessible();
                        field.setAccessible(true);
                        String name = field.getName();
                        Object obj = field.get(getLocationAvailabilityResponse);
                        field.setAccessible(zIsAccessible);
                        ResourceResolutionException.read(name, obj, jSONObject);
                    }
                }
            } catch (IllegalAccessException unused) {
                str2 = "catch IllegalAccessException";
                WrappedCompositionsetContent1211.read("JsonUtil", str2);
                doExecute(new RouterResponse(jSONObject.toString(), statusInfo));
                this.errorCode = String.valueOf(0);
                this.reportBuilder.IconCompatParcelizer.setApiName("Location_getLocationAvailability");
                this.reportBuilder.yn(locationBaseRequest);
                this.reportBuilder.read().IconCompatParcelizer(this.errorCode);
            } catch (SecurityException unused2) {
                str2 = "catch SecurityException";
                WrappedCompositionsetContent1211.read("JsonUtil", str2);
                doExecute(new RouterResponse(jSONObject.toString(), statusInfo));
                this.errorCode = String.valueOf(0);
                this.reportBuilder.IconCompatParcelizer.setApiName("Location_getLocationAvailability");
                this.reportBuilder.yn(locationBaseRequest);
                this.reportBuilder.read().IconCompatParcelizer(this.errorCode);
            } catch (JSONException unused3) {
                str2 = "catch JSONException";
                WrappedCompositionsetContent1211.read("JsonUtil", str2);
                doExecute(new RouterResponse(jSONObject.toString(), statusInfo));
                this.errorCode = String.valueOf(0);
                this.reportBuilder.IconCompatParcelizer.setApiName("Location_getLocationAvailability");
                this.reportBuilder.yn(locationBaseRequest);
                this.reportBuilder.read().IconCompatParcelizer(this.errorCode);
            }
        }
        doExecute(new RouterResponse(jSONObject.toString(), statusInfo));
        this.errorCode = String.valueOf(0);
        this.reportBuilder.IconCompatParcelizer.setApiName("Location_getLocationAvailability");
        this.reportBuilder.yn(locationBaseRequest);
        this.reportBuilder.read().IconCompatParcelizer(this.errorCode);
    }
}
