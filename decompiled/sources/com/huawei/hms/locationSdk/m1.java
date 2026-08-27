package com.huawei.hms.locationSdk;

import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.location.common.HMSLocationLog;
import com.huawei.hms.support.api.location.common.LocationJsonUtil;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.hms.support.api.location.common.exception.ServiceErrorCodeAdaptor;
import o.IconCompatParcelizer;
import o.ViewLayerCompanionOutlineProvider1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class m1 extends b<q0, Void> {
    private k1 d;

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getApiLevel() {
        return 4;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return HuaweiApiAvailability.HMS_VERSION_CODE_KIT_UPDATE;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public void doExecute(q0 q0Var, ResponseErrorCode responseErrorCode, String str, ViewLayerCompanionOutlineProvider1 viewLayerCompanionOutlineProvider1) {
        HMSLocationLog.i("RequestLocationUpdatesWithIntentTaskApiCall", ((b) this).a, "doExecute");
        try {
            if (responseErrorCode == null) {
                w0.b().c(this.d);
                throw new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000)));
            }
            if (responseErrorCode.getErrorCode() == 0) {
                JSONObject jSONObject = new JSONObject(str);
                k1 k1Var = this.d;
                if (k1Var != null && k1Var.d() != null) {
                    if (jSONObject.has("locationResult")) {
                        int size = LocationJsonUtil.parseLocationResultFromJsonObject(jSONObject).getLocations().size();
                        int iG = this.d.g();
                        HMSLocationLog.i("RequestLocationUpdatesWithIntentTaskApiCall", ((b) this).a, "modify numUpdates with callback, numUpdates:" + iG + " , locationSize:" + size);
                        if (iG > 0 && iG >= size) {
                            if (iG == size) {
                                HMSLocationLog.i("RequestLocationUpdatesWithIntentTaskApiCall", ((b) this).a, "modify numUpdates last need remove request");
                                t.b(q0Var.getContext(), (v0) null).a(this.d.b());
                            } else {
                                HMSLocationLog.i("RequestLocationUpdatesWithIntentTaskApiCall", ((b) this).a, "numUpdates greater than locationSize");
                            }
                            w0.b().a(this.d, iG - size);
                            return;
                        }
                        HMSLocationLog.i("RequestLocationUpdatesWithIntentTaskApiCall", ((b) this).a, "modify numUpdates exception need remove request");
                        t.b(q0Var.getContext(), (v0) null).a(this.d.b());
                        return;
                    }
                    if (jSONObject.has("locationAvailability")) {
                        return;
                    } else {
                        w0.b().d(this.d);
                    }
                }
                HMSLocationLog.e("RequestLocationUpdatesWithIntentTaskApiCall", ((b) this).a, "INTERNAL_ERROR : doExecute requestLocationUpdatesCache is null");
                return;
            }
            w0.b().c(this.d);
            ServiceErrorCodeAdaptor.getInstance().setTaskByServiceErrorCode(viewLayerCompanionOutlineProvider1, responseErrorCode, null);
        } catch (ApiException e) {
            w0.b().c(this.d);
            IconCompatParcelizer.RemoteActionCompatParcelizer(e, new StringBuilder("doExecute exception:"), "RequestLocationUpdatesWithIntentTaskApiCall", ((b) this).a);
            viewLayerCompanionOutlineProvider1.read(e);
        } catch (Exception unused) {
            w0.b().c(this.d);
            HMSLocationLog.e("RequestLocationUpdatesWithIntentTaskApiCall", ((b) this).a, "doExecute exception");
            viewLayerCompanionOutlineProvider1.read(new ApiException(new Status(10000, LocationStatusCode.getStatusCodeString(10000))));
        }
    }

    public m1(String str, String str2, String str3, k1 k1Var, String str4) {
        super(str, str2, str3, str4);
        this.d = k1Var;
    }
}
