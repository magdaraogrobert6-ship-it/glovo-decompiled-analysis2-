package com.huawei.hms.locationSdk;

import com.deliveryhero.fwf_cache.UtilKt;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.location.NavigationResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.support.api.location.common.exception.ServiceErrorCodeAdaptor;
import o.IconCompatParcelizer;
import o.ViewLayerCompanionOutlineProvider1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class m extends b<r0, NavigationResult> {
    private int d;

    public m(String str, String str2, String str3, int i) {
        super(str, str2, str3);
        this.d = i;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(r0 r0Var, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        try {
            HMSLocationLog.i("GetNavigationContextStateTaskApiCall", ((b) this).a, "doExecute");
            if (responseErrorCode == null) {
                throw new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            }
            int errorCode = responseErrorCode.getErrorCode();
            HMSLocationLog.d("GetNavigationContextStateTaskApiCall", ((b) this).a, "getNavigationContextState message start");
            NavigationResult navigationResult = new NavigationResult();
            if (errorCode == 0) {
                JSONObject jSONObject = new JSONObject(str);
                navigationResult.setState(jSONObject.getInt(UtilKt.ENVIRONMENT_KEY));
                navigationResult.setPossibility(jSONObject.getInt("confidence"));
            }
            ServiceErrorCodeAdaptor.getInstance().setTaskByServiceErrorCode(viewLayerCompanionOutlineProvider1, responseErrorCode, navigationResult);
            HMSLocationLog.d("GetNavigationContextStateTaskApiCall", ((b) this).a, "getNavigationContextState message success");
        } catch (ApiException e) {
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("get navi doExecute exception:"), "GetNavigationContextStateTaskApiCall", ((b) this).a);
            viewLayerCompanionOutlineProvider1.read(e);
        } catch (Exception unused) {
            HMSLocationLog.e("GetNavigationContextStateTaskApiCall", ((b) this).a, "get navi doExecute exception");
            viewLayerCompanionOutlineProvider1.read(new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000))));
        }
    }
}
