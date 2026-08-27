package com.deliveryhero.fwf_http;

import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class HTTPClientConfig {
    private final String accessToken;
    private final Region region;
    private final long requestTimeout;
    private final String selfHostedUrl;
    private final Version version;

    private final Region component1() {
        return this.region;
    }

    private final String component2() {
        return this.selfHostedUrl;
    }

    private final Version component3() {
        return this.version;
    }

    public final String component4() {
        return this.accessToken;
    }

    public final long component5() {
        return this.requestTimeout;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getRequestTimeout() {
        return this.requestTimeout;
    }

    public int hashCode() {
        int iHashCode = this.region.hashCode();
        String str = this.selfHostedUrl;
        return Long.hashCode(this.requestTimeout) + af$$ExternalSyntheticOutline0.m((this.version.hashCode() + (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.accessToken);
    }

    public String toString() {
        Region region = this.region;
        String str = this.selfHostedUrl;
        Version version = this.version;
        String str2 = this.accessToken;
        long j = this.requestTimeout;
        StringBuilder sb = new StringBuilder("HTTPClientConfig(region=");
        sb.append(region);
        sb.append(", selfHostedUrl=");
        sb.append(str);
        sb.append(", version=");
        sb.append(version);
        sb.append(", accessToken=");
        sb.append(str2);
        sb.append(", requestTimeout=");
        return c8$$ExternalSyntheticOutline0.m(j, ")", sb);
    }

    public HTTPClientConfig(Region region, String str, Version version, String str2, long j) {
        region.getClass();
        version.getClass();
        str2.getClass();
        this.region = region;
        this.selfHostedUrl = str;
        this.version = version;
        this.accessToken = str2;
        this.requestTimeout = j;
    }

    public final HTTPClientConfig copy(Region region, String str, Version version, String str2, long j) {
        region.getClass();
        version.getClass();
        str2.getClass();
        return new HTTPClientConfig(region, str, version, str2, j);
    }

    public static /* synthetic */ HTTPClientConfig copy$default(HTTPClientConfig hTTPClientConfig, Region region, String str, Version version, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            region = hTTPClientConfig.region;
        }
        if ((i & 2) != 0) {
            str = hTTPClientConfig.selfHostedUrl;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            version = hTTPClientConfig.version;
        }
        Version version2 = version;
        if ((i & 8) != 0) {
            str2 = hTTPClientConfig.accessToken;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            j = hTTPClientConfig.requestTimeout;
        }
        return hTTPClientConfig.copy(region, str3, version2, str4, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPClientConfig)) {
            return false;
        }
        HTTPClientConfig hTTPClientConfig = (HTTPClientConfig) obj;
        if (this.region != hTTPClientConfig.region) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.selfHostedUrl, hTTPClientConfig.selfHostedUrl}, getCieXyz.write())).booleanValue() || this.version != hTTPClientConfig.version) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.accessToken, hTTPClientConfig.accessToken}, getCieXyz.write())).booleanValue() && this.requestTimeout == hTTPClientConfig.requestTimeout;
    }

    public final String getUrl() {
        String str = this.selfHostedUrl;
        return (str == null || str.length() <= 0) ? af$$ExternalSyntheticOutline0.m("https://", this.region.getValue(), ".fwf.deliveryhero.net/", this.version.getValue()) : af$$ExternalSyntheticOutline0.m(str, "/", this.version.getValue());
    }

    public /* synthetic */ HTTPClientConfig(Region region, String str, Version version, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(region, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ConstantKt.getDEFAULT_VERSION() : version, str2, j);
    }
}
