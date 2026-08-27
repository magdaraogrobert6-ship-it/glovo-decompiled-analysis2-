package com.mapbox.maps.module.telemetry;

import android.annotation.SuppressLint;
import android.os.Build;
import bo.app.af$$ExternalSyntheticOutline0;
import com.braze.models.inappmessage.InAppMessageBase;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.adapter.internal.CommonCode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint
public final class MapLoadEvent extends MapBaseEvent {
    public static final Companion Companion = new Companion(null);
    private static final String EVENT_NAME = "map.load";

    @SerializedName("accessibilityFontScale")
    private final float accessibilityFontScale;

    @SerializedName("batteryLevel")
    private final int batteryLevel;

    @SerializedName("carrier")
    private final String carrier;

    @SerializedName("cellularNetworkType")
    private final String cellularNetworkType;

    @SerializedName("pluggedIn")
    private final boolean isPluggedIn;

    @SerializedName("wifi")
    private final boolean isWifi;

    @SerializedName("model")
    private final String model;

    @SerializedName("operatingSystem")
    private final String operatingSystem;

    @SerializedName(InAppMessageBase.ORIENTATION)
    private final String orientation;

    @SerializedName(CommonCode.MapKey.HAS_RESOLUTION)
    private final float resolution;

    @SerializedName("sdkIdentifier")
    private final String sdkIdentifier;

    @SerializedName("sdkVersion")
    private final String sdkVersion;

    @SerializedName("userId")
    private final String userId;

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

    public final String getModel() {
        return this.model;
    }

    public final String getOperatingSystem() {
        return this.operatingSystem;
    }

    public final String getOrientation() {
        return this.orientation;
    }

    public final float getResolution() {
        return this.resolution;
    }

    public final String getSdkIdentifier() {
        return this.sdkIdentifier;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isPluggedIn() {
        return this.isPluggedIn;
    }

    public final boolean isWifi() {
        return this.isWifi;
    }

    @Override // com.mapbox.maps.module.telemetry.MapBaseEvent
    public String getEventName() {
        return EVENT_NAME;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapLoadEvent(String str, PhoneState phoneState) {
        super(phoneState);
        phoneState.getClass();
        this.userId = str;
        this.operatingSystem = "Android - " + Build.VERSION.RELEASE;
        this.sdkIdentifier = com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_IDENTIFIER;
        this.sdkVersion = com.mapbox.maps.base.BuildConfig.MAPBOX_SDK_VERSION;
        String str2 = Build.MODEL;
        str2.getClass();
        this.model = str2;
        this.carrier = phoneState.getCarrier();
        this.cellularNetworkType = phoneState.getCellularNetworkType();
        this.orientation = phoneState.getOrientation().getOrientation();
        this.resolution = phoneState.getResolution();
        this.accessibilityFontScale = phoneState.getAccessibilityFontScale();
        this.batteryLevel = phoneState.getBatteryLevel();
        this.isPluggedIn = phoneState.isPluggedIn();
        this.isWifi = phoneState.isWifi();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MapLoadEvent{, operatingSystem='");
        sb.append(this.operatingSystem);
        sb.append("', sdkIdentifier='");
        sb.append(this.sdkIdentifier);
        sb.append("', sdkVersion='");
        sb.append(this.sdkVersion);
        sb.append("', model='");
        sb.append(this.model);
        sb.append("', userId='");
        sb.append(this.userId);
        sb.append("', carrier='");
        sb.append(this.carrier);
        sb.append("', cellularNetworkType='");
        sb.append(this.cellularNetworkType);
        sb.append("', orientation='");
        sb.append(this.orientation);
        sb.append("', resolution=");
        sb.append(this.resolution);
        sb.append(", accessibilityFontScale=");
        sb.append(this.accessibilityFontScale);
        sb.append(", batteryLevel=");
        sb.append(this.batteryLevel);
        sb.append(", pluggedIn=");
        sb.append(this.isPluggedIn);
        sb.append(", wifi=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.isWifi, '}');
    }

    public int hashCode() {
        String str = this.operatingSystem;
        int iHashCode = str != null ? str.hashCode() : 0;
        int iM = af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m((getCreated().hashCode() + ((getEvent().hashCode() + (iHashCode * 31)) * 31)) * 31, 31, this.sdkIdentifier), 31, this.sdkVersion), 31, this.model);
        String str2 = this.userId;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.carrier;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.cellularNetworkType;
        int iM2 = af$$ExternalSyntheticOutline0.m((((((iM + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.orientation);
        float f = this.resolution;
        int iFloatToIntBits = f == 0.0f ? 0 : Float.floatToIntBits(f);
        float f2 = this.accessibilityFontScale;
        return ((((((((iM2 + iFloatToIntBits) * 31) + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + this.batteryLevel) * 31) + (this.isPluggedIn ? 1 : 0)) * 31) + (this.isWifi ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !MapLoadEvent.class.equals(obj.getClass())) {
            return false;
        }
        MapLoadEvent mapLoadEvent = (MapLoadEvent) obj;
        Object[] objArr = {getEvent(), mapLoadEvent.getEvent()};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr2 = {getCreated(), mapLoadEvent.getCreated()};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue() || Float.compare(mapLoadEvent.resolution, this.resolution) != 0 || Float.compare(mapLoadEvent.accessibilityFontScale, this.accessibilityFontScale) != 0 || this.batteryLevel != mapLoadEvent.batteryLevel || this.isPluggedIn != mapLoadEvent.isPluggedIn || this.isWifi != mapLoadEvent.isWifi) {
            return false;
        }
        Object[] objArr3 = {this.operatingSystem, mapLoadEvent.operatingSystem};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr4 = {this.sdkIdentifier, mapLoadEvent.sdkIdentifier};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr5 = {this.sdkVersion, mapLoadEvent.sdkVersion};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr6 = {this.model, mapLoadEvent.model};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr6, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr7 = {this.userId, mapLoadEvent.userId};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr7, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr8 = {this.carrier, mapLoadEvent.carrier};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr8, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr9 = {this.cellularNetworkType, mapLoadEvent.cellularNetworkType};
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr9, getCieXyz.write())).booleanValue()) {
            return false;
        }
        Object[] objArr10 = {this.orientation, mapLoadEvent.orientation};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr10, getCieXyz.write())).booleanValue();
    }
}
