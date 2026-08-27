package o;

import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.SystemClock;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.support.api.entity.location.lastlocation.GetLastLocationResponse;
import com.huawei.hms.support.api.entity.location.updates.RequestLocationUpdatesRequest;
import com.huawei.riemann.location.common.utils.Constant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class stringArrayResource {
    public static JSONObject serializer(Location location) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (location == null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("mProvider", location.getProvider());
        jSONObject2.put("mAltitude", location.getAltitude());
        jSONObject2.put("mBearing", location.getBearing());
        jSONObject2.put("mHorizontalAccuracyMeters", location.getAccuracy());
        jSONObject2.put("mLatitude", location.getLatitude());
        jSONObject2.put("mLongitude", location.getLongitude());
        jSONObject2.put("mSpeed", location.getSpeed());
        jSONObject2.put("mTime", location.getTime());
        jSONObject2.put("mElapsedRealtimeNanos", location.getElapsedRealtimeNanos());
        jSONObject2.put("mBearingAccuracyDegrees", location.getBearingAccuracyDegrees());
        jSONObject2.put("mSpeedAccuracyMetersPerSecond", location.getSpeedAccuracyMetersPerSecond());
        jSONObject2.put("mVerticalAccuracyMeters", location.getVerticalAccuracyMeters());
        if (location.getExtras() != null) {
            JSONObject jSONObject3 = new JSONObject();
            if (location.getExtras().containsKey(Constant.LOCATION_SOURCE_TYPE)) {
                jSONObject3.put(Constant.LOCATION_SOURCE_TYPE, location.getExtras().getInt(Constant.LOCATION_SOURCE_TYPE, -1));
            }
            if (location.getExtras().containsKey("LocationSource")) {
                jSONObject3.put("LocationSource", location.getExtras().getInt("LocationSource", 0));
            }
            if (location.getExtras().containsKey("session_id")) {
                jSONObject3.put("session_id", location.getExtras().getString("session_id"));
            }
            if (location.getExtras().containsKey("vendorType")) {
                jSONObject3.put("vendorType", location.getExtras().getInt("vendorType"));
            }
            if (location.getExtras().containsKey("locateType")) {
                jSONObject3.put("locateType", location.getExtras().getString("locateType"));
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("mExtraInfo", jSONObject3);
            jSONObject.put("address", jSONObject4);
        }
        jSONObject.put("location", jSONObject2);
        return jSONObject;
    }

    public static boolean IconCompatParcelizer() {
        try {
            if (Build.VERSION.SDK_INT > 30 && !PrimaryTextActionModeCallback.read()) {
                return true ^ getTitleResource.read(placeAtf8xVGno.read(), "android.permission.ACCESS_FINE_LOCATION");
            }
            return false;
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("LocationInnerUtil", "checkApproximatelyPermission exception");
            return true;
        }
    }

    public static boolean RemoteActionCompatParcelizer(RequestLocationUpdatesRequest requestLocationUpdatesRequest) {
        String str;
        if (requestLocationUpdatesRequest == null) {
            return false;
        }
        LocationRequest locationRequest = requestLocationUpdatesRequest.getLocationRequest();
        if (locationRequest == null) {
            str = "checkRequestInvalid false, locationRequest is invalid";
        } else {
            if (locationRequest.getExpirationTime() >= SystemClock.elapsedRealtime()) {
                return locationRequest.getNumUpdates() >= 1;
            }
            str = "checkRequestInvalid false, expirationTime is invalid";
        }
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("LocationInnerUtil", str);
        return false;
    }

    public static String RemoteActionCompatParcelizer(GetLastLocationResponse getLastLocationResponse) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = serializer(getLastLocationResponse.getLocation());
        } catch (JSONException unused) {
            WrappedCompositionsetContent1211.read("LocationInnerUtil", "buildEntityFromResponse get jsonException .");
        }
        return jSONObject.toString();
    }

    public static boolean serializer(String str) {
        String str2;
        try {
            Object systemService = placeAtf8xVGno.read().getSystemService("location");
            if (systemService instanceof LocationManager) {
                return ((LocationManager) systemService).isProviderEnabled(str);
            }
            return false;
        } catch (IllegalArgumentException unused) {
            str2 = "isProviderEnabled IllegalArgumentException";
            WrappedCompositionsetContent1211.read("LocationInnerUtil", str2);
            return false;
        } catch (SecurityException unused2) {
            str2 = "isProviderEnabled SecurityException";
            WrappedCompositionsetContent1211.read("LocationInnerUtil", str2);
            return false;
        } catch (Exception unused3) {
            str2 = "isProviderEnabled exception";
            WrappedCompositionsetContent1211.read("LocationInnerUtil", str2);
            return false;
        }
    }
}
