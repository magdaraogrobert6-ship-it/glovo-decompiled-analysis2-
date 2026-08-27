package com.mapbox.navigator.route_data;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.geojson.Point;
import com.mapbox.navigator.MapboxNavigationNativeInitializerImpl;
import java.io.Serializable;
import java.util.Objects;
import o.IconCompatParcelizer;

/* JADX INFO: loaded from: classes5.dex */
public class RdManeuver implements Serializable {
    private final short bearingAfter;
    private final short bearingBefore;
    private final String instruction;
    private final Point location;
    private final RdManeuverModifier modifier;
    private final RdManeuverType type;

    public short getBearingAfter() {
        return this.bearingAfter;
    }

    public short getBearingBefore() {
        return this.bearingBefore;
    }

    public String getInstruction() {
        return this.instruction;
    }

    public Point getLocation() {
        return this.location;
    }

    public RdManeuverModifier getModifier() {
        return this.modifier;
    }

    public RdManeuverType getType() {
        return this.type;
    }

    static {
        BaseMapboxInitializer.init(MapboxNavigationNativeInitializerImpl.class);
    }

    public RdManeuver(short s, short s2, String str, Point point, RdManeuverModifier rdManeuverModifier) {
        this.bearingBefore = s;
        this.bearingAfter = s2;
        this.instruction = str;
        this.location = point;
        this.modifier = rdManeuverModifier;
        this.type = RdManeuverType.TURN;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[bearingBefore: ");
        sb.append(RecordUtils.fieldToString(Short.valueOf(this.bearingBefore)));
        sb.append(", bearingAfter: ");
        sb.append(RecordUtils.fieldToString(Short.valueOf(this.bearingAfter)));
        sb.append(", instruction: ");
        IconCompatParcelizer.read(sb, this.instruction, ", location: ");
        c8$$ExternalSyntheticOutline0.m(this.location, sb, ", modifier: ");
        sb.append(RecordUtils.fieldToString(this.modifier));
        sb.append(", type: ");
        sb.append(RecordUtils.fieldToString(this.type));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        short s = this.bearingBefore;
        short s2 = this.bearingAfter;
        return Objects.hash(Short.valueOf(s), Short.valueOf(s2), this.instruction, this.location, this.modifier, this.type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RdManeuver rdManeuver = (RdManeuver) obj;
        return this.bearingBefore == rdManeuver.bearingBefore && this.bearingAfter == rdManeuver.bearingAfter && Objects.equals(this.instruction, rdManeuver.instruction) && Objects.equals(this.location, rdManeuver.location) && Objects.equals(this.modifier, rdManeuver.modifier) && Objects.equals(this.type, rdManeuver.type);
    }

    public RdManeuver(short s, short s2, String str, Point point, RdManeuverModifier rdManeuverModifier, RdManeuverType rdManeuverType) {
        this.bearingBefore = s;
        this.bearingAfter = s2;
        this.instruction = str;
        this.location = point;
        this.modifier = rdManeuverModifier;
        this.type = rdManeuverType;
    }
}
