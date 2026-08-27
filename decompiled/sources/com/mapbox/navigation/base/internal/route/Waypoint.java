package com.mapbox.navigation.base.internal.route;

import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.geojson.Point;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Waypoint {
    public final InternalType internalType;
    public final Point location;
    public final Map metadata;
    public final String name;
    public final Point target;
    public final TimeZone timeZone;
    public final int type;

    public enum InternalType {
        Regular,
        Silent,
        EvChargingServer,
        EvChargingUser
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.CLASS)
    public @interface Type {
    }

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(((this.location.hashCode() * 31) + this.type) * 31, 31, this.name);
        Point point = this.target;
        int iHashCode = point != null ? point.hashCode() : 0;
        Map map = this.metadata;
        int iHashCode2 = map != null ? map.hashCode() : 0;
        TimeZone timeZone = this.timeZone;
        return ((((iM + iHashCode) * 31) + iHashCode2) * 31) + (timeZone != null ? timeZone.hashCode() : 0);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalType.values().length];
            try {
                iArr[InternalType.Regular.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InternalType.Silent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InternalType.EvChargingServer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InternalType.EvChargingUser.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Waypoint(Point point, String str, Point point2, InternalType internalType, Map map, TimeZone timeZone) {
        internalType.getClass();
        this.location = point;
        this.name = str;
        this.target = point2;
        this.internalType = internalType;
        this.metadata = map;
        this.timeZone = timeZone;
        int i = WhenMappings.$EnumSwitchMapping$0[internalType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        throw null;
                    }
                }
            }
        }
        this.type = i2;
    }

    public final String toString() {
        return "Waypoint(location=" + this.location + ", type=" + this.type + ", name='" + this.name + "', target=" + this.target + ", metadata=" + this.metadata + ", timeZone=" + this.timeZone + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Waypoint.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        Waypoint waypoint = (Waypoint) obj;
        if (!this.location.equals(waypoint.location) || this.type != waypoint.type || !this.name.equals(waypoint.name)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.target, waypoint.target}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.metadata, waypoint.metadata}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.timeZone, waypoint.timeZone}, getCieXyz.write())).booleanValue();
    }
}
