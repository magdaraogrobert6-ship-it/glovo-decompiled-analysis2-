package com.mapbox.navigator;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes3.dex */
public class BorderCrossingInfo implements Serializable {
    private final AdminInfo from;
    private final String id;
    private final AdminInfo to;

    public AdminInfo getFrom() {
        return this.from;
    }

    public String getId() {
        return this.id;
    }

    public AdminInfo getTo() {
        return this.to;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.id, this.from, this.to);
    }

    public BorderCrossingInfo(String str, AdminInfo adminInfo, AdminInfo adminInfo2) {
        this.id = str;
        this.from = adminInfo;
        this.to = adminInfo2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[id: ");
        IconCompatParcelizer.read(sb, this.id, ", from: ");
        sb.append(RecordUtils.fieldToString(this.from));
        sb.append(", to: ");
        sb.append(RecordUtils.fieldToString(this.to));
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
        BorderCrossingInfo borderCrossingInfo = (BorderCrossingInfo) obj;
        return Objects.equals(this.id, borderCrossingInfo.id) && Objects.equals(this.from, borderCrossingInfo.from) && Objects.equals(this.to, borderCrossingInfo.to);
    }
}
