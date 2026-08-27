package com.mapbox.common.experimental.wss_backend;

import bo.app.af$$ExternalSyntheticOutline1;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.common.MapboxSDKCommonInitializerImpl;
import com.mapbox.common.NetworkRestriction;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes5.dex */
public class Request implements Serializable {
    private final int flags;
    private HashMap<String, String> headers;
    private final NetworkRestriction networkRestriction;
    private final long timeout;
    private final String url;

    public int getFlags() {
        return this.flags;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
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

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.url;
        HashMap<String, String> map = this.headers;
        long j = this.timeout;
        return Objects.hash(str, map, Long.valueOf(j), this.networkRestriction, Integer.valueOf(this.flags));
    }

    public Builder toBuilder() {
        return new Builder().url(this.url).headers(this.headers).timeout(this.timeout).networkRestriction(this.networkRestriction).flags(this.flags);
    }

    public static final class Builder {
        private HashMap<String, String> headers;
        private String url;
        private long timeout = 0;
        private NetworkRestriction networkRestriction = NetworkRestriction.NONE;
        private int flags = 0;

        public Builder flags(int i) {
            this.flags = i;
            return this;
        }

        public Builder headers(HashMap<String, String> map) {
            this.headers = map;
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
                return new Request(str, map, this.timeout, networkRestriction, this.flags);
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("networkRestriction shouldn't be null");
            return null;
        }
    }

    private Request(String str, HashMap<String, String> map) {
        this.url = str;
        this.headers = map;
        this.timeout = 0L;
        this.networkRestriction = NetworkRestriction.NONE;
        this.flags = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[url: ");
        IconCompatParcelizer.read(sb, this.url, ", headers: ");
        sb.append(RecordUtils.fieldToString(this.headers));
        sb.append(", timeout: ");
        af$$ExternalSyntheticOutline1.m(this.timeout, ", networkRestriction: ", sb);
        sb.append(RecordUtils.fieldToString(this.networkRestriction));
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
        return Objects.equals(this.url, request.url) && Objects.equals(this.headers, request.headers) && this.timeout == request.timeout && Objects.equals(this.networkRestriction, request.networkRestriction) && this.flags == request.flags;
    }

    private Request(String str, HashMap<String, String> map, long j, NetworkRestriction networkRestriction, int i) {
        this.url = str;
        this.headers = map;
        this.timeout = j;
        this.networkRestriction = networkRestriction;
        this.flags = i;
    }
}
