package com.mapbox.search.internal.bindgen;

import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes4.dex */
public class RetrieveOptions implements Serializable {
    private final List<AttributeSet> attributeSets;

    public List<AttributeSet> getAttributeSets() {
        return this.attributeSets;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.attributeSets);
    }

    public RetrieveOptions(List<AttributeSet> list) {
        this.attributeSets = list;
    }

    public String toString() {
        return MediaSessionCompatQueueItem.read(this.attributeSets, new StringBuilder("[attributeSets: "), "]");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Objects.equals(this.attributeSets, ((RetrieveOptions) obj).attributeSets);
    }
}
