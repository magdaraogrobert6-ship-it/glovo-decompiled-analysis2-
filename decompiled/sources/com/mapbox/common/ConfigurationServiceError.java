package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class ConfigurationServiceError implements Serializable {
    private final ConfigurationServiceErrorCode code;
    private final String message;

    public ConfigurationServiceErrorCode getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.code, this.message);
    }

    public ConfigurationServiceError(ConfigurationServiceErrorCode configurationServiceErrorCode, String str) {
        this.code = configurationServiceErrorCode;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[code: ");
        sb.append(RecordUtils.fieldToString(this.code));
        sb.append(", message: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.message, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfigurationServiceError configurationServiceError = (ConfigurationServiceError) obj;
        return Objects.equals(this.code, configurationServiceError.code) && Objects.equals(this.message, configurationServiceError.message);
    }
}
