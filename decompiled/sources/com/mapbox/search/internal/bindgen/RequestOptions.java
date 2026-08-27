package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;
import o.MediaSessionCompatQueueItem;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class RequestOptions implements Serializable {
    private final String endpoint;
    private final SearchOptions options;
    private final boolean originRewritten;
    private final boolean proximityRewritten;
    private final String query;
    private final String sessionID;

    public String getEndpoint() {
        return this.endpoint;
    }

    public SearchOptions getOptions() {
        return this.options;
    }

    public boolean getOriginRewritten() {
        return this.originRewritten;
    }

    public boolean getProximityRewritten() {
        return this.proximityRewritten;
    }

    public String getQuery() {
        return this.query;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        String str = this.query;
        String str2 = this.endpoint;
        SearchOptions searchOptions = this.options;
        boolean z = this.proximityRewritten;
        boolean z2 = this.originRewritten;
        return Objects.hash(str, str2, searchOptions, Boolean.valueOf(z), Boolean.valueOf(z2), this.sessionID);
    }

    public RequestOptions(String str, String str2, SearchOptions searchOptions, boolean z, boolean z2, String str3) {
        this.query = str;
        this.endpoint = str2;
        this.options = searchOptions;
        this.proximityRewritten = z;
        this.originRewritten = z2;
        this.sessionID = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[query: ");
        IconCompatParcelizer.read(sb, this.query, ", endpoint: ");
        IconCompatParcelizer.read(sb, this.endpoint, ", options: ");
        sb.append(RecordUtils.fieldToString(this.options));
        sb.append(", proximityRewritten: ");
        MediaSessionCompatQueueItem.write(sb, this.proximityRewritten, ", originRewritten: ");
        MediaSessionCompatQueueItem.write(sb, this.originRewritten, ", sessionID: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.sessionID, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RequestOptions requestOptions = (RequestOptions) obj;
        return Objects.equals(this.query, requestOptions.query) && Objects.equals(this.endpoint, requestOptions.endpoint) && Objects.equals(this.options, requestOptions.options) && this.proximityRewritten == requestOptions.proximityRewritten && this.originRewritten == requestOptions.originRewritten && Objects.equals(this.sessionID, requestOptions.sessionID);
    }
}
