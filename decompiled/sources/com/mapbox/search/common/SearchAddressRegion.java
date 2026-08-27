package com.mapbox.search.common;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.resp.Vw;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchAddressRegion implements Parcelable {
    public static final Parcelable.Creator<SearchAddressRegion> CREATOR = new Vw.yn(21);
    public final String code;
    public final String codeFull;
    public final String name;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode();
        String str = this.code;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.codeFull;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public SearchAddressRegion(String str, String str2, String str3) {
        str.getClass();
        this.name = str;
        this.code = str2;
        this.codeFull = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeString(this.code);
        parcel.writeString(this.codeFull);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchAddressRegion(name='");
        sb.append(this.name);
        sb.append("', code=");
        sb.append(this.code);
        sb.append(", codeFull=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.codeFull, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchAddressRegion.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SearchAddressRegion searchAddressRegion = (SearchAddressRegion) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, searchAddressRegion.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.code, searchAddressRegion.code}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.codeFull, searchAddressRegion.codeFull}, getCieXyz.write())).booleanValue();
    }
}
