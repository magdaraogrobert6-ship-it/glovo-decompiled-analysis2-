package com.sentiance.sdk.util;

import android.location.Location;
import android.util.Pair;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.shutdownAllDataStoresdefault;
import o.writeMap;

/* JADX INFO: loaded from: classes3.dex */
public class BoundingBox {
    final double RemoteActionCompatParcelizer;
    final double read;
    final double serializer;
    final double write;

    public enum Direction {
        SOUTH,
        NORTH,
        WEST,
        EAST
    }

    public static class write {
        private double RemoteActionCompatParcelizer;
        private double read;
        private double serializer;
        private double write;

        public final void IconCompatParcelizer(double d) {
            this.write = d;
        }

        public final void read(double d) {
            this.read = d;
        }

        public final void write(double d) {
            this.RemoteActionCompatParcelizer = d;
        }

        public final BoundingBox serializer() {
            return new BoundingBox(this.RemoteActionCompatParcelizer, this.serializer, this.write, this.read);
        }

        public final void serializer(double d) {
            this.serializer = d;
        }
    }

    public final double IconCompatParcelizer() {
        return this.read;
    }

    public final double MediaDescriptionCompat() {
        return this.RemoteActionCompatParcelizer;
    }

    public final double RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final double read() {
        return this.serializer;
    }

    public final List write() {
        double d = this.write;
        double d2 = this.serializer;
        double d3 = this.read;
        double d4 = this.RemoteActionCompatParcelizer;
        if (d - d2 <= 0.0d || d3 - d4 <= 0.0d) {
            return Collections.EMPTY_LIST;
        }
        Location location = new Location("");
        location.setLatitude(d);
        location.setLongitude(d3);
        Location location2 = new Location("");
        location2.setLatitude(d2);
        location2.setLongitude(d4);
        writeMap writemapWrite = shutdownAllDataStoresdefault.write(location.getLatitude(), location.getLongitude(), 12);
        writeMap writemapWrite2 = shutdownAllDataStoresdefault.write(location2.getLatitude(), location2.getLongitude(), 12);
        int iMax = Math.max(writemapWrite.write(), writemapWrite2.write());
        int iMin = Math.min(writemapWrite.read(), writemapWrite2.read());
        int iMax2 = Math.max(writemapWrite.read(), writemapWrite2.read());
        ArrayList arrayList = new ArrayList();
        for (int iMin2 = Math.min(writemapWrite.write(), writemapWrite2.write()); iMin2 <= iMax; iMin2++) {
            for (int i = iMin; i <= iMax2; i++) {
                arrayList.add(shutdownAllDataStoresdefault.RemoteActionCompatParcelizer(new writeMap(iMin2, i, 12)));
            }
        }
        return arrayList;
    }

    public BoundingBox(double d, double d2, double d3, double d4) {
        this.serializer = d;
        this.write = d2;
        this.RemoteActionCompatParcelizer = d3;
        this.read = d4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoundingBox{minLat=");
        sb.append(this.serializer);
        sb.append(", maxLat=");
        sb.append(this.write);
        sb.append(", minLon=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", maxLon=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.read, '}');
    }

    public final Pair<Double, Double> serializer() {
        return Pair.create(Double.valueOf((this.write + this.serializer) / 2.0d), Double.valueOf((this.read + this.RemoteActionCompatParcelizer) / 2.0d));
    }

    public static BoundingBox IconCompatParcelizer(double[][] dArr) {
        double[] dArr2 = dArr[0];
        double d = dArr2[0];
        double d2 = dArr2[1];
        double d3 = d;
        double d4 = d3;
        double d5 = d2;
        double d6 = d5;
        for (int i = 1; i < dArr.length; i++) {
            double[] dArr3 = dArr[i];
            double d7 = dArr3[0];
            if (d7 < d3) {
                d3 = d7;
            }
            double d8 = dArr3[1];
            if (d8 < d5) {
                d5 = d8;
            }
            if (d7 > d4) {
                d4 = d7;
            }
            if (d8 > d6) {
                d6 = d8;
            }
        }
        return new BoundingBox(d3, d4, d5, d6);
    }

    public final boolean RemoteActionCompatParcelizer(Location location) {
        return location.getLatitude() >= this.serializer && location.getLatitude() <= this.write && location.getLongitude() >= this.RemoteActionCompatParcelizer && location.getLongitude() <= this.read;
    }

    public static Location RemoteActionCompatParcelizer(Location location, int i, Direction direction) {
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        double d = (((double) i) / 6371000.0d) * 57.29577951308232d;
        double dCos = d / Math.cos((3.141592653589793d * latitude) / 180.0d);
        if (direction == Direction.NORTH) {
            latitude += d;
        } else if (direction == Direction.SOUTH) {
            latitude -= d;
        } else if (direction == Direction.WEST) {
            longitude -= dCos;
        } else if (direction == Direction.EAST) {
            longitude += dCos;
        }
        Location location2 = new Location(location);
        location2.setLatitude(latitude);
        location2.setLongitude(longitude);
        return location2;
    }
}
