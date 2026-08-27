package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes3.dex */
public class SearchResponse implements Serializable {
    private final RequestOptions request;
    private final String responseUUID;
    private final Expected<Error, List<SearchResult>> results;

    public RequestOptions getRequest() {
        return this.request;
    }

    public String getResponseUUID() {
        return this.responseUUID;
    }

    public Expected<Error, List<SearchResult>> getResults() {
        return this.results;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.request, this.results, this.responseUUID);
    }

    public SearchResponse(RequestOptions requestOptions, Expected<Error, List<SearchResult>> expected, String str) {
        this.request = requestOptions;
        this.results = expected;
        this.responseUUID = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[request: ");
        sb.append(RecordUtils.fieldToString(this.request));
        sb.append(", results: ");
        sb.append(RecordUtils.fieldToString(this.results));
        sb.append(", responseUUID: ");
        return SweepGradientShader9KIMszodefault.read(sb, this.responseUUID, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchResponse searchResponse = (SearchResponse) obj;
        return Objects.equals(this.request, searchResponse.request) && Objects.equals(this.results, searchResponse.results) && Objects.equals(this.responseUUID, searchResponse.responseUUID);
    }
}
