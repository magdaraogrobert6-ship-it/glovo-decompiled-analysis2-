package com.mapbox.common.http_backend;

import bo.app.af$$ExternalSyntheticOutline1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.HttpMethod;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.NetworkRestriction;
import com.mapbox.common.SizedReadStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class Request implements Serializable {
    private final SizedReadStream body;
    private final int flags;
    private HashMap<String, String> headers;
    private HttpMethod method;
    private final NetworkRestriction networkRestriction;
    private final long timeout;
    private final String url;

    public SizedReadStream getBody() {
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
        return Objects.hash(httpMethod, str, map, Long.valueOf(j), this.networkRestriction, this.body, Integer.valueOf(this.flags));
    }

    public Builder toBuilder() {
        return new Builder().method(this.method).url(this.url).headers(this.headers).timeout(this.timeout).networkRestriction(this.networkRestriction).body(this.body).flags(this.flags);
    }

    public static final class Builder {
        private SizedReadStream body;
        private HashMap<String, String> headers;
        private String url;
        private HttpMethod method = HttpMethod.GET;
        private long timeout = 0;
        private NetworkRestriction networkRestriction = NetworkRestriction.NONE;
        private int flags = 0;

        public Builder body(SizedReadStream sizedReadStream) {
            this.body = sizedReadStream;
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

        public Builder timeout(long j) {
            this.timeout = j;
            return this;
        }

        public Builder url(String str) {
            this.url = str;
            return this;
        }

        public Request build() {
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
            if (networkRestriction != null) {
                return new Request(httpMethod, str, map, this.timeout, networkRestriction, this.body, this.flags);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("networkRestriction shouldn't be null");
            return null;
        }
    }

    private Request(String str, HashMap<String, String> map, SizedReadStream sizedReadStream) {
        this.url = str;
        this.headers = map;
        this.body = sizedReadStream;
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
        Request request = (Request) obj;
        return Objects.equals(this.method, request.method) && Objects.equals(this.url, request.url) && Objects.equals(this.headers, request.headers) && this.timeout == request.timeout && Objects.equals(this.networkRestriction, request.networkRestriction) && Objects.equals(this.body, request.body) && this.flags == request.flags;
    }

    private Request(HttpMethod httpMethod, String str, HashMap<String, String> map, long j, NetworkRestriction networkRestriction, SizedReadStream sizedReadStream, int i) {
        this.method = httpMethod;
        this.url = str;
        this.headers = map;
        this.timeout = j;
        this.networkRestriction = networkRestriction;
        this.body = sizedReadStream;
        this.flags = i;
    }
}
