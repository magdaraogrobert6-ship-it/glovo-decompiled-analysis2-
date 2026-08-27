package com.mapbox.search.common;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.resp.Vw;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchAddressCountry implements Parcelable {
    public static final Parcelable.Creator<SearchAddressCountry> CREATOR = new Vw.yn(20);
    public final String isoCodeAlpha2;
    public final String isoCodeAlpha3;
    public final String name;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode();
        String str = this.isoCodeAlpha2;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.isoCodeAlpha3;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public SearchAddressCountry(String str, String str2, String str3) {
        str.getClass();
        this.name = str;
        this.isoCodeAlpha2 = str2;
        this.isoCodeAlpha3 = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeString(this.isoCodeAlpha2);
        parcel.writeString(this.isoCodeAlpha3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchAddressCountry(name='");
        sb.append(this.name);
        sb.append("', isoCodeAlpha2=");
        sb.append(this.isoCodeAlpha2);
        sb.append(", isoCodeAlpha3=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.isoCodeAlpha3, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchAddressCountry.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SearchAddressCountry searchAddressCountry = (SearchAddressCountry) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, searchAddressCountry.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isoCodeAlpha2, searchAddressCountry.isoCodeAlpha2}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.isoCodeAlpha3, searchAddressCountry.isoCodeAlpha3}, getCieXyz.write())).booleanValue();
    }
}
