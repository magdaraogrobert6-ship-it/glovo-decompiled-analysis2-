package com.mapbox.common.location;

import android.os.Looper;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.getBitmapFromCache;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendedLocationProviderParameters implements Serializable {
    private final Boolean allowUserDefined;
    private final DeviceLocationProviderType deviceLocationProviderType;
    private final String locationProviderName;
    private final Looper looper;

    public static final class Builder {
        private Boolean allowUserDefined;
        private DeviceLocationProviderType deviceLocationProviderType;
        private String locationProviderName;
        private Looper looper;

        public Builder allowUserDefined(Boolean bool) {
            this.allowUserDefined = bool;
            return this;
        }

        public Builder deviceLocationProviderType(DeviceLocationProviderType deviceLocationProviderType) {
            this.deviceLocationProviderType = deviceLocationProviderType;
            return this;
        }

        public Builder locationProviderName(String str) {
            this.locationProviderName = str;
            return this;
        }

        public Builder looper(Looper looper) {
            this.looper = looper;
            return this;
        }

        public ExtendedLocationProviderParameters build() {
            return new ExtendedLocationProviderParameters(this.deviceLocationProviderType, this.allowUserDefined, this.locationProviderName, this.looper);
        }
    }

    public Boolean getAllowUserDefined() {
        return this.allowUserDefined;
    }

    public DeviceLocationProviderType getDeviceLocationProviderType() {
        return this.deviceLocationProviderType;
    }

    public String getLocationProviderName() {
        return this.locationProviderName;
    }

    public Looper getLooper() {
        return this.looper;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.deviceLocationProviderType, this.allowUserDefined, this.locationProviderName, this.looper);
    }

    public Builder toBuilder() {
        return new Builder().deviceLocationProviderType(this.deviceLocationProviderType).allowUserDefined(this.allowUserDefined).locationProviderName(this.locationProviderName).looper(this.looper);
    }

    private ExtendedLocationProviderParameters(DeviceLocationProviderType deviceLocationProviderType, Boolean bool, String str, Looper looper) {
        this.deviceLocationProviderType = deviceLocationProviderType;
        this.allowUserDefined = bool;
        this.locationProviderName = str;
        this.looper = looper;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[deviceLocationProviderType: ");
        sb.append(RecordUtils.fieldToString(this.deviceLocationProviderType));
        sb.append(", allowUserDefined: ");
        getBitmapFromCache.write(sb, ", locationProviderName: ", this.allowUserDefined);
        IconCompatParcelizer.read(sb, this.locationProviderName, ", looper: ");
        sb.append(RecordUtils.fieldToString(this.looper));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtendedLocationProviderParameters extendedLocationProviderParameters = (ExtendedLocationProviderParameters) obj;
        return Objects.equals(this.deviceLocationProviderType, extendedLocationProviderParameters.deviceLocationProviderType) && Objects.equals(this.allowUserDefined, extendedLocationProviderParameters.allowUserDefined) && Objects.equals(this.locationProviderName, extendedLocationProviderParameters.locationProviderName) && Objects.equals(this.looper, extendedLocationProviderParameters.looper);
    }
}
