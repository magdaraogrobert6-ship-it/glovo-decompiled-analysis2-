package com.mapbox.navigator;

import bo.app.af$$ExternalSyntheticOutline1;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class RouterError implements Serializable {
    private final boolean isRetryable;
    private final String message;
    private final Integer refreshTtl;
    private final long requestId;
    private final RouterOrigin routerOrigin;
    private final RouterErrorType type;
    private final String url;

    public boolean getIsRetryable() {
        return this.isRetryable;
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getRefreshTtl() {
        return this.refreshTtl;
    }

    public long getRequestId() {
        return this.requestId;
    }

    public RouterOrigin getRouterOrigin() {
        return this.routerOrigin;
    }

    public RouterErrorType getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.message;
        RouterErrorType routerErrorType = this.type;
        long j = this.requestId;
        return Objects.hash(str, routerErrorType, Long.valueOf(j), this.refreshTtl, this.routerOrigin, this.url, Boolean.valueOf(this.isRetryable));
    }

    public RouterError(String str, RouterErrorType routerErrorType, long j, Integer num, RouterOrigin routerOrigin, String str2) {
        this.message = str;
        this.type = routerErrorType;
        this.requestId = j;
        this.refreshTtl = num;
        this.routerOrigin = routerOrigin;
        this.url = str2;
        this.isRetryable = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[message: ");
        IconCompatParcelizer.read(sb, this.message, ", type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append(", requestId: ");
        af$$ExternalSyntheticOutline1.m(this.requestId, ", refreshTtl: ", sb);
        SweepGradientShader9KIMszodefault.read(this.refreshTtl, ", routerOrigin: ", sb);
        sb.append(RecordUtils.fieldToString(this.routerOrigin));
        sb.append(", url: ");
        IconCompatParcelizer.read(sb, this.url, ", isRetryable: ");
        return ff$$ExternalSyntheticOutline0.m(this.isRetryable, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RouterError routerError = (RouterError) obj;
        return Objects.equals(this.message, routerError.message) && Objects.equals(this.type, routerError.type) && this.requestId == routerError.requestId && Objects.equals(this.refreshTtl, routerError.refreshTtl) && Objects.equals(this.routerOrigin, routerError.routerOrigin) && Objects.equals(this.url, routerError.url) && this.isRetryable == routerError.isRetryable;
    }

    public RouterError(String str, RouterErrorType routerErrorType, long j, Integer num, RouterOrigin routerOrigin, String str2, boolean z) {
        this.message = str;
        this.type = routerErrorType;
        this.requestId = j;
        this.refreshTtl = num;
        this.routerOrigin = routerOrigin;
        this.url = str2;
        this.isRetryable = z;
    }
}
