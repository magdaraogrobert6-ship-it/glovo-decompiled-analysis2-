package com.mapbox.navigation.base.route;

import bo.app.af$$ExternalSyntheticOutline0;
import com.mapbox.geojson.Point;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import o.getCieXyz;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class LegWaypoint {
    public final Point location;
    public final Map metadata;
    public final String name;
    public final Point target;
    public final String type;

    /* JADX INFO: loaded from: classes4.dex */
    @Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.CLASS)
    public @interface Type {
    }

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.location.hashCode() * 31, 31, this.name);
        Point point = this.target;
        int iM2 = af$$ExternalSyntheticOutline0.m((iM + (point != null ? point.hashCode() : 0)) * 31, 31, this.type);
        Map map = this.metadata;
        return iM2 + (map != null ? map.hashCode() : 0);
    }

    public LegWaypoint(Point point, String str, Point point2, String str2, Map map) {
        this.location = point;
        this.name = str;
        this.target = point2;
        this.type = str2;
        this.metadata = map;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegWaypoint(location=");
        sb.append(this.location);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', target=");
        sb.append(this.target);
        sb.append(", type='");
        sb.append(this.type);
        sb.append("', metadata=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, this.metadata, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LegWaypoint.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        LegWaypoint legWaypoint = (LegWaypoint) obj;
        if (!this.location.equals(legWaypoint.location) || !this.name.equals(legWaypoint.name)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.target, legWaypoint.target}, getCieXyz.write())).booleanValue() || !this.type.equals(legWaypoint.type)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.metadata, legWaypoint.metadata}, getCieXyz.write())).booleanValue();
    }
}
