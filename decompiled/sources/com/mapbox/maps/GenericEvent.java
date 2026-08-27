package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public final class GenericEvent implements Serializable {
    private final Value data;
    private final String name;
    private final EventTimeInterval timeInterval;

    public Value getData() {
        return this.data;
    }

    public String getName() {
        return this.name;
    }

    public EventTimeInterval getTimeInterval() {
        return this.timeInterval;
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.data, this.timeInterval);
    }

    public GenericEvent(String str, Value value, EventTimeInterval eventTimeInterval) {
        this.name = str;
        this.data = value;
        this.timeInterval = eventTimeInterval;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[name: ");
        IconCompatParcelizer.read(sb, this.name, ", data: ");
        sb.append(RecordUtils.fieldToString(this.data));
        sb.append(", timeInterval: ");
        sb.append(RecordUtils.fieldToString(this.timeInterval));
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GenericEvent.class != obj.getClass()) {
            return false;
        }
        GenericEvent genericEvent = (GenericEvent) obj;
        return Objects.equals(this.name, genericEvent.name) && Objects.equals(this.data, genericEvent.data) && Objects.equals(this.timeInterval, genericEvent.timeInterval);
    }
}
