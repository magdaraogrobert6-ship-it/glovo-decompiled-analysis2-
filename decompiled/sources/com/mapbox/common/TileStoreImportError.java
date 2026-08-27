package com.mapbox.common;

import com.mapbox.annotation.MapboxExperimental;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
@MapboxExperimental
public class TileStoreImportError implements Serializable {
    private final String message;
    private final TileStoreImportErrorType type;

    @MapboxExperimental
    public String getMessage() {
        return this.message;
    }

    @MapboxExperimental
    public TileStoreImportErrorType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message);
    }

    public TileStoreImportError(TileStoreImportErrorType tileStoreImportErrorType, String str) {
        this.type = tileStoreImportErrorType;
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
        TileStoreImportError tileStoreImportError = (TileStoreImportError) obj;
        return Objects.equals(this.type, tileStoreImportError.type) && Objects.equals(this.message, tileStoreImportError.message);
    }
}
