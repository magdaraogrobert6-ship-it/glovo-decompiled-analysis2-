package com.mapbox.navigation.base.trip.model.roadobject.reststop;

import bo.app.ff$$ExternalSyntheticOutline0;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class Amenity {
    public final String brand;
    public final String name;
    public final String type;

    public final int hashCode() {
        int iHashCode = this.type.hashCode();
        String str = this.name;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.brand;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public Amenity(String str, String str2, String str3) {
        this.type = str;
        this.name = str2;
        this.brand = str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Amenity(type=");
        sb.append(this.type);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", brand=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.brand, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Amenity.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        Amenity amenity = (Amenity) obj;
        if (!this.type.equals(amenity.type)) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, amenity.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.brand, amenity.brand}, getCieXyz.write())).booleanValue();
    }
}
