package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class TileRegionError implements Serializable {
    private final String message;
    private final TileRegionErrorType type;

    public String getMessage() {
        return this.message;
    }

    public TileRegionErrorType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message);
    }

    public TileRegionError(TileRegionErrorType tileRegionErrorType, String str) {
        this.type = tileRegionErrorType;
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
        TileRegionError tileRegionError = (TileRegionError) obj;
        return Objects.equals(this.type, tileRegionError.type) && Objects.equals(this.message, tileRegionError.message);
    }
}
