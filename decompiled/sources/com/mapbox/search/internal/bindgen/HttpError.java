package com.mapbox.search.internal.bindgen;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class HttpError implements Serializable {
    private final int httpCode;
    private final String message;

    public int getHttpCode() {
        return this.httpCode;
    }

    public String getMessage() {
        return this.message;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public HttpError(int i, String str) {
        this.httpCode = i;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[httpCode: ");
        IconCompatParcelizer.write(this.httpCode, ", message: ", sb);
        return SweepGradientShader9KIMszodefault.read(sb, this.message, "]");
    }

    public int hashCode() {
        int i = this.httpCode;
        return Objects.hash(Integer.valueOf(i), this.message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpError httpError = (HttpError) obj;
        return this.httpCode == httpError.httpCode && Objects.equals(this.message, httpError.message);
    }
}
