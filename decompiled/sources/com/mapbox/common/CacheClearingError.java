package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class CacheClearingError implements Serializable {
    private final String message;
    private final CacheClearingErrorType type;

    public String getMessage() {
        return this.message;
    }

    public CacheClearingErrorType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message);
    }

    public CacheClearingError(CacheClearingErrorType cacheClearingErrorType, String str) {
        this.type = cacheClearingErrorType;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[type: ");
        sb.append(RecordUtils.fieldToString(this.type));
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
        CacheClearingError cacheClearingError = (CacheClearingError) obj;
        return Objects.equals(this.type, cacheClearingError.type) && Objects.equals(this.message, cacheClearingError.message);
    }
}
