package com.mapbox.search.internal.bindgen;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes4.dex */
public class CategoryOptions implements Serializable {
    private final String language;
    private final Integer limit;

    public String getLanguage() {
        return this.language;
    }

    public Integer getLimit() {
        return this.limit;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.language, this.limit);
    }

    public CategoryOptions(String str, Integer num) {
        this.language = str;
        this.limit = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[language: ");
        IconCompatParcelizer.read(sb, this.language, ", limit: ");
        sb.append(RecordUtils.fieldToString(this.limit));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CategoryOptions categoryOptions = (CategoryOptions) obj;
        return Objects.equals(this.language, categoryOptions.language) && Objects.equals(this.limit, categoryOptions.limit);
    }
}
