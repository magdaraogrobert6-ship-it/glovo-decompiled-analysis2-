package com.mapbox.search.internal.bindgen;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.search.core.MapboxSearchCoreInitializerImpl;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class AdditionalCpoGeoLocation implements Serializable {
    private final DisplayText name;
    private final Point position;

    public DisplayText getName() {
        return this.name;
    }

    public Point getPosition() {
        return this.position;
    }

    static {
        BaseMapboxInitializer.init(MapboxSearchCoreInitializerImpl.class);
    }

    public int hashCode() {
        return Objects.hash(this.position, this.name);
    }

    public AdditionalCpoGeoLocation(Point point, DisplayText displayText) {
        this.position = point;
        this.name = displayText;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[position: ");
        c8$$ExternalSyntheticOutline0.m(this.position, sb, ", name: ");
        sb.append(RecordUtils.fieldToString(this.name));
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
        AdditionalCpoGeoLocation additionalCpoGeoLocation = (AdditionalCpoGeoLocation) obj;
        return Objects.equals(this.position, additionalCpoGeoLocation.position) && Objects.equals(this.name, additionalCpoGeoLocation.name);
    }
}
