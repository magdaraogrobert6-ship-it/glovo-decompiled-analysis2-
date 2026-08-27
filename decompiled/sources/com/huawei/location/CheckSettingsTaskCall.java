package com.huawei.location;

import android.provider.Settings;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huawei.hms.location.LocationSettingsStates;
import com.huawei.hms.support.api.client.Status;
import com.huawei.location.req.CheckLocationSettingsReq;
import com.huawei.location.resp.CheckLocationSettingsResp;
import com.huawei.location.resp.StatusCheck;
import com.huawei.location.router.RouterResponse;
import com.huawei.location.router.entity.StatusInfo;
import o.ViewCompatShimsApi26Impl;
import o.WrappedCompositionsetContent1211;
import o.getOnSelectAllRequested;
import o.onPrepareActionMode;
import o.placeAtf8xVGno;
import o.stringArrayResource;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class CheckSettingsTaskCall extends BaseApiRequest {
    private static final String LOCATION_SETTING_REQUEST = "locationSettingsRequest";
    private static final String TAG = "CheckLocationSettingsApi";

    private CheckLocationSettingsResp changeResponse(ViewCompatShimsApi26Impl viewCompatShimsApi26Impl) {
        CheckLocationSettingsResp checkLocationSettingsResp = new CheckLocationSettingsResp();
        StatusCheck statusCheck = new StatusCheck();
        statusCheck.setStatusCode(viewCompatShimsApi26Impl.serializer.getStatusCode());
        statusCheck.setStatusMessage(viewCompatShimsApi26Impl.serializer.getStatusMessage());
        checkLocationSettingsResp.setStatusCheck(statusCheck);
        checkLocationSettingsResp.setLocationSettingsStates(viewCompatShimsApi26Impl.write);
        return checkLocationSettingsResp;
    }

    private void parseCheckSettingJson(CheckLocationSettingsReq checkLocationSettingsReq, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            checkLocationSettingsReq.setTid(jSONObject.getString("locTransactionId"));
            checkLocationSettingsReq.setPackageName(jSONObject.getString("packageName"));
            String string = jSONObject.getString(LOCATION_SETTING_REQUEST);
            if (TextUtils.isEmpty(string)) {
                WrappedCompositionsetContent1211.read(TAG, "parseCheckSettingString locationSettingsRequest is null");
            }
            JSONObject jSONObject2 = new JSONObject(string);
            checkLocationSettingsReq.setAlwaysShow(jSONObject2.getBoolean("alwaysShow"));
            checkLocationSettingsReq.setNeedBle(jSONObject2.getBoolean("needBle"));
        } catch (JSONException unused) {
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "parseCheckSettingString JSONException");
        }
    }

    @Override // com.huawei.location.router.interfaces.IRouterRequest
    public void onRequest(String str) {
        boolean z;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer(TAG, "onRequest json begin");
        CheckLocationSettingsReq checkLocationSettingsReq = new CheckLocationSettingsReq();
        parseCheckSettingJson(checkLocationSettingsReq, str);
        getOnSelectAllRequested.write().getClass();
        LocationSettingsStates locationSettingsStates = new LocationSettingsStates();
        boolean zSerializer = stringArrayResource.serializer("gps");
        boolean zSerializer2 = stringArrayResource.serializer("network");
        locationSettingsStates.setGnssUsable(zSerializer);
        locationSettingsStates.setGnssPresent(zSerializer);
        locationSettingsStates.setGpsUsable(zSerializer);
        locationSettingsStates.setGpsPresent(zSerializer);
        locationSettingsStates.setHmsLocationUsable(false);
        locationSettingsStates.setHMSLocationPresent(false);
        locationSettingsStates.setNetworkLocationUsable(zSerializer2);
        locationSettingsStates.setNetworkLocationPresent(zSerializer2);
        boolean zRemoteActionCompatParcelizer = onPrepareActionMode.RemoteActionCompatParcelizer(placeAtf8xVGno.read());
        locationSettingsStates.setLocationUsable(zRemoteActionCompatParcelizer);
        locationSettingsStates.setLocationPresent(zRemoteActionCompatParcelizer);
        if (checkLocationSettingsReq.isNeedBle()) {
            boolean zHasSystemFeature = placeAtf8xVGno.read().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationUtil", "isBlePresent isBlePresent is " + zHasSystemFeature);
            locationSettingsStates.setBlePresent(zHasSystemFeature);
            boolean z2 = true;
            try {
                int i = Settings.Global.getInt(placeAtf8xVGno.read().getContentResolver(), "ble_scan_always_enabled");
                z = i == 1;
                try {
                    WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationUtil", "isScanBleEnabled locationMode is " + i);
                } catch (Settings.SettingNotFoundException unused) {
                    WrappedCompositionsetContent1211.read("LocationUtil", "isScanBleEnabled SettingNotFoundException");
                }
            } catch (Settings.SettingNotFoundException unused2) {
                z = false;
            }
            if (!z) {
                int i2 = Settings.Global.getInt(placeAtf8xVGno.read().getContentResolver(), "bluetooth_on", -1);
                boolean z3 = i2 == 1;
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationUtil", "isBlueBoothEnabled locationMode is " + i2);
                if (!z3) {
                    z2 = false;
                }
            }
            locationSettingsStates.setBleUsable(z2);
        } else {
            locationSettingsStates.setBleUsable(false);
            locationSettingsStates.setBlePresent(false);
        }
        ViewCompatShimsApi26Impl viewCompatShimsApi26Impl = new ViewCompatShimsApi26Impl();
        viewCompatShimsApi26Impl.serializer = Status.SUCCESS;
        viewCompatShimsApi26Impl.write = locationSettingsStates;
        onComplete(new RouterResponse(new Gson().toJson(changeResponse(viewCompatShimsApi26Impl)), new StatusInfo(0, 0, "SUCCESS")));
        this.reportBuilder.IconCompatParcelizer.setApiName("Location_checkSettings");
        this.reportBuilder.yn(checkLocationSettingsReq);
        this.reportBuilder.read().IconCompatParcelizer("0");
    }
}
