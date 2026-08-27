package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class HttpRequest implements Serializable {
    private final byte[] body;
    private final int flags;
    private HashMap<String, String> headers;
    private HttpMethod method;
    private final NetworkRestriction networkRestriction;
    private final SdkInformation sdkInformation;
    private final long timeout;
    private final String url;

    public byte[] getBody() {
        return this.body;
    }

    public int getFlags() {
        return this.flags;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public HttpMethod getMethod() {
        return this.method;
    }

    public NetworkRestriction getNetworkRestriction() {
        return this.networkRestriction;
    }

    public SdkInformation getSdkInformation() {
        return this.sdkInformation;
    }

    public long getTimeout() {
        return this.timeout;
    }

    public String getUrl() {
        return this.url;
    }

    public void setHeaders(HashMap<String, String> map) {
        this.headers = map;
    }

    public void setMethod(HttpMethod httpMethod) {
        this.method = httpMethod;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        HttpMethod httpMethod = this.method;
        String str = this.url;
        HashMap<String, String> map = this.headers;
        long j = this.timeout;
        return Objects.hash(httpMethod, str, map, Long.valueOf(j), this.networkRestriction, this.sdkInformation, this.body, Integer.valueOf(this.flags));
    }

    public Builder toBuilder() {
        return new Builder().method(this.method).url(this.url).headers(this.headers).timeout(this.timeout).networkRestriction(this.networkRestriction).sdkInformation(this.sdkInformation).body(this.body).flags(this.flags);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class Builder {
        private byte[] body;
        private HashMap<String, String> headers;
        private SdkInformation sdkInformation;
        private String url;
        private HttpMethod method = HttpMethod.GET;
        private long timeout = 0;
        private NetworkRestriction networkRestriction = NetworkRestriction.NONE;
        private int flags = 0;

        public Builder body(byte[] bArr) {
            this.body = bArr;
            return this;
        }

        public Builder flags(int i) {
            this.flags = i;
            return this;
        }

        public Builder headers(HashMap<String, String> map) {
            this.headers = map;
            return this;
        }

        public Builder method(HttpMethod httpMethod) {
            this.method = httpMethod;
            return this;
        }

        public Builder networkRestriction(NetworkRestriction networkRestriction) {
            this.networkRestriction = networkRestriction;
            return this;
        }

        public Builder sdkInformation(SdkInformation sdkInformation) {
            this.sdkInformation = sdkInformation;
            return this;
        }

        public Builder timeout(long j) {
            this.timeout = j;
            return this;
        }

        public Builder url(String str) {
            this.url = str;
            return this;
        }

        public HttpRequest build() {
            HttpMethod httpMethod = this.method;
            if (httpMethod == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("method shouldn't be null");
                return null;
            }
            String str = this.url;
            if (str == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("url shouldn't be null");
                return null;
            }
            HashMap<String, String> map = this.headers;
            if (map == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("headers shouldn't be null");
                return null;
            }
            NetworkRestriction networkRestriction = this.networkRestriction;
            if (networkRestriction == null) {
                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("networkRestriction shouldn't be null");
                return null;
            }
            SdkInformation sdkInformation = this.sdkInformation;
            if (sdkInformation != null) {
                return new HttpRequest(httpMethod, str, map, this.timeout, networkRestriction, sdkInformation, this.body, this.flags);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("sdkInformation shouldn't be null");
            return null;
        }
    }

    private HttpRequest(String str, HashMap<String, String> map, SdkInformation sdkInformation, byte[] bArr) {
        this.url = str;
        this.headers = map;
        this.sdkInformation = sdkInformation;
        this.body = bArr;
        this.method = HttpMethod.GET;
        this.timeout = 0L;
        this.networkRestriction = NetworkRestriction.NONE;
        this.flags = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[method: ");
        sb.append(RecordUtils.fieldToString(this.method));
        sb.append(", url: ");
        IconCompatParcelizer.read(sb, this.url, ", headers: ");
        sb.append(RecordUtils.fieldToString(this.headers));
        sb.append(", timeout: ");
        af$$ExternalSyntheticOutline1.m(this.timeout, ", networkRestriction: ", sb);
        sb.append(RecordUtils.fieldToString(this.networkRestriction));
        sb.append(", sdkInformation: ");
        sb.append(RecordUtils.fieldToString(this.sdkInformation));
        sb.append(", body: ");
        sb.append(RecordUtils.fieldToString(this.body));
        sb.append(", flags: ");
        return SweepGradientShader9KIMszodefault.serializer(this.flags, "]", sb);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return Objects.equals(this.method, httpRequest.method) && Objects.equals(this.url, httpRequest.url) && Objects.equals(this.headers, httpRequest.headers) && this.timeout == httpRequest.timeout && Objects.equals(this.networkRestriction, httpRequest.networkRestriction) && Objects.equals(this.sdkInformation, httpRequest.sdkInformation) && Objects.equals(this.body, httpRequest.body) && this.flags == httpRequest.flags;
    }

    private HttpRequest(HttpMethod httpMethod, String str, HashMap<String, String> map, long j, NetworkRestriction networkRestriction, SdkInformation sdkInformation, byte[] bArr, int i) {
        this.method = httpMethod;
        this.url = str;
        this.headers = map;
        this.timeout = j;
        this.networkRestriction = networkRestriction;
        this.sdkInformation = sdkInformation;
        this.body = bArr;
        this.flags = i;
    }
}
