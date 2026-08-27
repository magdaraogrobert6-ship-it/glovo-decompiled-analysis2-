package com.mapbox.search.internal.bindgen;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public class SuggestAction implements Serializable {
    private final byte[] body;
    private final String endpoint;
    private final boolean multiRetrievable;
    private final String path;
    private final String query;

    public byte[] getBody() {
        return this.body;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public boolean getMultiRetrievable() {
        return this.multiRetrievable;
    }

    public String getPath() {
        return this.path;
    }

    public String getQuery() {
        return this.query;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.endpoint, this.path, this.query, this.body, Boolean.valueOf(this.multiRetrievable));
    }

    public SuggestAction(String str, String str2, String str3, byte[] bArr, boolean z) {
        this.endpoint = str;
        this.path = str2;
        this.query = str3;
        this.body = bArr;
        this.multiRetrievable = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[endpoint: ");
        IconCompatParcelizer.read(sb, this.endpoint, ", path: ");
        IconCompatParcelizer.read(sb, this.path, ", query: ");
        IconCompatParcelizer.read(sb, this.query, ", body: ");
        sb.append(RecordUtils.fieldToString(this.body));
        sb.append(", multiRetrievable: ");
        return ff$$ExternalSyntheticOutline0.m(this.multiRetrievable, sb, "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SuggestAction suggestAction = (SuggestAction) obj;
        return Objects.equals(this.endpoint, suggestAction.endpoint) && Objects.equals(this.path, suggestAction.path) && Objects.equals(this.query, suggestAction.query) && Objects.equals(this.body, suggestAction.body) && this.multiRetrievable == suggestAction.multiRetrievable;
    }
}
