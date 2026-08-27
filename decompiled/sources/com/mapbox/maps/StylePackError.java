package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class StylePackError implements Serializable {
    private final String message;
    private final StylePackErrorType type;

    public String getMessage() {
        return this.message;
    }

    public StylePackErrorType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.message);
    }

    public StylePackError(StylePackErrorType stylePackErrorType, String str) {
        this.type = stylePackErrorType;
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
        StylePackError stylePackError = (StylePackError) obj;
        return Objects.equals(this.type, stylePackError.type) && Objects.equals(this.message, stylePackError.message);
    }
}
