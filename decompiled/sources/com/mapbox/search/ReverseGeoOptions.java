package com.mapbox.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.mapbox.geojson.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.SweepGradientShader9KIMszodefault;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class ReverseGeoOptions implements Parcelable {
    public static final Parcelable.Creator<ReverseGeoOptions> CREATOR = new EtaType.Creator(3);
    public final Point center;
    public final List countries;
    public final List languages;
    public final Integer limit;
    public final List newTypes;
    public final ReverseMode reverseMode;
    public final List types;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int iHashCode = this.center.hashCode();
        List list = this.countries;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        List list2 = this.languages;
        int iHashCode3 = list2 != null ? list2.hashCode() : 0;
        Integer num = this.limit;
        int iIntValue = num != null ? num.intValue() : 0;
        ReverseMode reverseMode = this.reverseMode;
        int iHashCode4 = reverseMode != null ? reverseMode.hashCode() : 0;
        List list3 = this.types;
        int iHashCode5 = list3 != null ? list3.hashCode() : 0;
        List list4 = this.newTypes;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iIntValue) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list4 != null ? list4.hashCode() : 0);
    }

    public ReverseGeoOptions(Point point, ArrayList arrayList, List list, Integer num, ReverseMode reverseMode, ArrayList arrayList2, ArrayList arrayList3) {
        point.getClass();
        this.center = point;
        this.countries = arrayList;
        this.languages = list;
        this.limit = num;
        this.reverseMode = reverseMode;
        this.types = arrayList2;
        this.newTypes = arrayList3;
        if (num == null || num.intValue() > 0) {
            return;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.read("Provided limit should be greater than 0 (was found: ", num, ").");
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeSerializable(this.center);
        List list = this.countries;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i);
            }
        }
        List list2 = this.languages;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeParcelable((Parcelable) it2.next(), i);
            }
        }
        Integer num = this.limit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        ReverseMode reverseMode = this.reverseMode;
        if (reverseMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(reverseMode.name());
        }
        List list3 = this.types;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                parcel.writeString(((QueryType) it3.next()).name());
            }
        }
        parcel.writeStringList(this.newTypes);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReverseGeoOptions(center=");
        sb.append(this.center);
        sb.append(", countries=");
        sb.append(this.countries);
        sb.append(", languages=");
        sb.append(this.languages);
        sb.append(", limit=");
        sb.append(this.limit);
        sb.append(", reverseMode=");
        sb.append(this.reverseMode);
        sb.append(", types=");
        sb.append(this.types);
        sb.append(", newTypes=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, this.newTypes, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ReverseGeoOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ReverseGeoOptions reverseGeoOptions = (ReverseGeoOptions) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.center, reverseGeoOptions.center}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.countries, reverseGeoOptions.countries}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.languages, reverseGeoOptions.languages}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.limit, reverseGeoOptions.limit}, getCieXyz.write())).booleanValue() || this.reverseMode != reverseGeoOptions.reverseMode) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.types, reverseGeoOptions.types}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.newTypes, reverseGeoOptions.newTypes}, getCieXyz.write())).booleanValue();
    }
}
