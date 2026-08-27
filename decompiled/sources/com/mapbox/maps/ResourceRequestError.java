package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public final class ResourceRequestError implements Serializable {
    private final String message;
    private final RequestErrorType reason;

    public String getMessage() {
        return this.message;
    }

    public RequestErrorType getReason() {
        return this.reason;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.reason, this.message);
    }

    public ResourceRequestError(RequestErrorType requestErrorType, String str) {
        this.reason = requestErrorType;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[reason: ");
        sb.append(RecordUtils.fieldToString(this.reason));
        sb.append(", message: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.message, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ResourceRequestError.class != obj.getClass()) {
            return false;
        }
        ResourceRequestError resourceRequestError = (ResourceRequestError) obj;
        return Objects.equals(this.reason, resourceRequestError.reason) && Objects.equals(this.message, resourceRequestError.message);
    }
}
