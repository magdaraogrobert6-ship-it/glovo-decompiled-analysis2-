package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public class MergingAreaInfo implements Serializable {
    private final String id;
    private final MergingAreaType mergeType;

    public String getId() {
        return this.id;
    }

    public MergingAreaType getMergeType() {
        return this.mergeType;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.mergeType);
    }

    public MergingAreaInfo(String str, MergingAreaType mergingAreaType) {
        this.id = str;
        this.mergeType = mergingAreaType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", mergeType: ");
        sb.append(RecordUtils.fieldToString(this.mergeType));
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
        MergingAreaInfo mergingAreaInfo = (MergingAreaInfo) obj;
        return Objects.equals(this.id, mergingAreaInfo.id) && Objects.equals(this.mergeType, mergingAreaInfo.mergeType);
    }
}
