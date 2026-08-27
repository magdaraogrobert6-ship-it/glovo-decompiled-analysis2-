package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public final class TileStoreGenericEvent implements Serializable {
    private final Value data;
    private final String name;
    private final String text;

    public Value getData() {
        return this.data;
    }

    public String getName() {
        return this.name;
    }

    public String getText() {
        return this.text;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.text, this.data);
    }

    public TileStoreGenericEvent(String str, String str2, Value value) {
        this.name = str;
        this.text = str2;
        this.data = value;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[name: ");
        IconCompatParcelizer.read(sb, this.name, ", text: ");
        IconCompatParcelizer.read(sb, this.text, ", data: ");
        sb.append(RecordUtils.fieldToString(this.data));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TileStoreGenericEvent.class != obj.getClass()) {
            return false;
        }
        TileStoreGenericEvent tileStoreGenericEvent = (TileStoreGenericEvent) obj;
        return Objects.equals(this.name, tileStoreGenericEvent.name) && Objects.equals(this.text, tileStoreGenericEvent.text) && Objects.equals(this.data, tileStoreGenericEvent.data);
    }
}
