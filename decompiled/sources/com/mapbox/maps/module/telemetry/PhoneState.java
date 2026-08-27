package com.mapbox.maps.module.telemetry;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.adapter.internal.CommonCode;
import com.mapbox.common.TelemetrySystemUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class PhoneState {
    public static final Companion Companion = new Companion(null);
    private static final String NO_CARRIER = "EMPTY_CARRIER";
    private static final int NO_NETWORK = -1;

    @SerializedName("accessibilityFontScale")
    private float accessibilityFontScale;

    @SerializedName("batteryLevel")
    private int batteryLevel;

    @SerializedName("carrier")
    private String carrier;

    @SerializedName("cellularNetworkType")
    private String cellularNetworkType;

    @SerializedName("created")
    private String created;

    @SerializedName("pluggedIn")
    private boolean isPluggedIn;

    @SerializedName("wifi")
    private boolean isWifi;

    @SerializedName(InAppMessageBase.ORIENTATION)
    private Orientation orientation;

    @SerializedName(CommonCode.MapKey.HAS_RESOLUTION)
    private float resolution;

    public enum Orientation {
        ORIENTATION_PORTRAIT("Portrait"),
        ORIENTATION_LANDSCAPE("Landscape");

        public static final Companion Companion = new Companion(null);
        private final String orientation;

        public final String getOrientation() {
            return this.orientation;
        }

        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Orientation getOrientation(int i) {
                if (1 == i) {
                    return Orientation.ORIENTATION_PORTRAIT;
                }
                return Orientation.ORIENTATION_LANDSCAPE;
            }

            private Companion() {
            }
        }

        Orientation(String str) {
            this.orientation = str;
        }
    }

    @SuppressLint
    private final boolean isConnectedToWifi(Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            Object systemService = context.getApplicationContext().getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasTransport(1);
        } catch (Exception unused) {
            return false;
        }
    }

    public final float getAccessibilityFontScale() {
        return this.accessibilityFontScale;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final String getCellularNetworkType() {
        return this.cellularNetworkType;
    }

    public final String getCreated() {
        return this.created;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final float getResolution() {
        return this.resolution;
    }

    public final boolean isPluggedIn() {
        return this.isPluggedIn;
    }

    public final boolean isWifi() {
        return this.isWifi;
    }

    public final void setAccessibilityFontScale(float f) {
        this.accessibilityFontScale = f;
    }

    public final void setBatteryLevel(int i) {
        this.batteryLevel = i;
    }

    public final void setCarrier(String str) {
        this.carrier = str;
    }

    public final void setCellularNetworkType(String str) {
        this.cellularNetworkType = str;
    }

    public final void setPluggedIn(boolean z) {
        this.isPluggedIn = z;
    }

    public final void setResolution(float f) {
        this.resolution = f;
    }

    public final void setWifi(boolean z) {
        this.isWifi = z;
    }

    private final String obtainCellularCarrier(Context context) {
        Object systemService = context.getSystemService("phone");
        systemService.getClass();
        String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
        if (TextUtils.isEmpty(networkOperatorName)) {
            return NO_CARRIER;
        }
        networkOperatorName.getClass();
        return networkOperatorName;
    }

    private final float obtainDisplayDensity(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PhoneState(Context context) {
        context.getClass();
        String strObtainCurrentDate = TelemetrySystemUtils.obtainCurrentDate();
        strObtainCurrentDate.getClass();
        this.created = strObtainCurrentDate;
        this.batteryLevel = TelemetrySystemUtils.obtainBatteryLevel(context);
        this.isPluggedIn = TelemetrySystemUtils.isPluggedIn(context);
        this.cellularNetworkType = TelemetrySystemUtils.obtainCellularNetworkType(context);
        this.orientation = Orientation.Companion.getOrientation(context.getResources().getConfiguration().orientation);
        this.accessibilityFontScale = context.getResources().getConfiguration().fontScale;
        this.carrier = obtainCellularCarrier(context);
        this.resolution = obtainDisplayDensity(context);
        this.isWifi = isConnectedToWifi(context);
    }

    public final void setCreated(String str) {
        str.getClass();
        this.created = str;
    }

    public final void setOrientation(Orientation orientation) {
        orientation.getClass();
        this.orientation = orientation;
    }

    public PhoneState() {
        this.created = "2020-07-12";
        this.orientation = Orientation.ORIENTATION_PORTRAIT;
    }
}
