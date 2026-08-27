package com.huawei.hms.locationSdk;

import android.content.Context;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.location.HWLocation;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.LocationJsonUtil;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.support.api.location.common.exception.ServiceErrorCodeAdaptor;
import java.util.List;
import o.IconCompatParcelizer;
import o.ViewLayerCompanionOutlineProvider1;
import o.onActionItemClicked;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class g extends b<s0, List<HWLocation>> {
    private Context d;

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        int iWrite = onActionItemClicked.write(this.d);
        return (iWrite == 0 || iWrite == 1) ? 6 : 5;
    }

    public g(Context context, String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
        this.d = context;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(s0 s0Var, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        try {
            HMSLocationLog.i("GetFromLocationTaskApiCall", ((b) this).a, "doExecute");
            if (responseErrorCode == null) {
                throw new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            }
            ServiceErrorCodeAdaptor.getInstance().setTaskByServiceErrorCode(viewLayerCompanionOutlineProvider1, responseErrorCode, responseErrorCode.getErrorCode() == 0 ? LocationJsonUtil.parseHwLocationsFromJsonObject(new JSONObject(str)) : null);
        } catch (ApiException e) {
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("getFromLocation doExecute exception:"), "GetFromLocationTaskApiCall", ((b) this).a);
            viewLayerCompanionOutlineProvider1.read(e);
        } catch (Exception unused) {
            HMSLocationLog.e("GetFromLocationTaskApiCall", ((b) this).a, "getFromLocation doExecute exception");
            viewLayerCompanionOutlineProvider1.read(new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000))));
        }
    }
}
