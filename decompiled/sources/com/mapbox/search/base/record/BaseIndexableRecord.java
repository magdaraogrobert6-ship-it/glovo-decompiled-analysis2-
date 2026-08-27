package com.mapbox.search.base.record;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.location.resp.Vw;
import com.mapbox.geojson.Point;
import com.mapbox.search.base.result.BaseSearchResultType;
import com.mapbox.search.internal.bindgen.ResultMetadata;
import com.mapbox.search.internal.bindgen.SearchAddress;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseIndexableRecord implements Parcelable {
    public static final Parcelable.Creator<BaseIndexableRecord> CREATOR = new Vw.yn(9);
    public final SearchAddress address;
    public final List categories;
    public final Point coordinate;
    public final String descriptionText;
    public final String id;
    public final List indexTokens;
    public final String makiIcon;
    public final ResultMetadata metadata;
    public final String name;
    public final List routablePoints;
    public final Parcelable sdkResolvedRecord;
    public final BaseSearchResultType type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.name);
        String str = this.descriptionText;
        int iHashCode = str == null ? 0 : str.hashCode();
        SearchAddress searchAddress = this.address;
        int iHashCode2 = searchAddress == null ? 0 : searchAddress.hashCode();
        List list = this.routablePoints;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        List list2 = this.categories;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        String str2 = this.makiIcon;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = this.coordinate.hashCode();
        int iHashCode7 = this.type.hashCode();
        ResultMetadata resultMetadata = this.metadata;
        return this.sdkResolvedRecord.hashCode() + c8$$ExternalSyntheticOutline0.m(this.indexTokens, (((iHashCode7 + ((iHashCode6 + ((((((((((iM + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31)) * 31)) * 31) + (resultMetadata != null ? resultMetadata.hashCode() : 0)) * 31, 31);
    }

    public BaseIndexableRecord(String str, String str2, String str3, SearchAddress searchAddress, ArrayList arrayList, List list, String str4, Point point, BaseSearchResultType baseSearchResultType, ResultMetadata resultMetadata, ArrayList arrayList2, Parcelable parcelable) {
        str.getClass();
        str2.getClass();
        point.getClass();
        baseSearchResultType.getClass();
        arrayList2.getClass();
        parcelable.getClass();
        this.id = str;
        this.name = str2;
        this.descriptionText = str3;
        this.address = searchAddress;
        this.routablePoints = arrayList;
        this.categories = list;
        this.makiIcon = str4;
        this.coordinate = point;
        this.type = baseSearchResultType;
        this.metadata = resultMetadata;
        this.indexTokens = arrayList2;
        this.sdkResolvedRecord = parcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.descriptionText);
        parcel.writeSerializable(this.address);
        List list = this.routablePoints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                parcel.writeSerializable((Serializable) it.next());
            }
        }
        parcel.writeStringList(this.categories);
        parcel.writeString(this.makiIcon);
        parcel.writeSerializable(this.coordinate);
        parcel.writeString(this.type.name());
        parcel.writeSerializable(this.metadata);
        parcel.writeStringList(this.indexTokens);
        parcel.writeParcelable(this.sdkResolvedRecord, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseIndexableRecord)) {
            return false;
        }
        BaseIndexableRecord baseIndexableRecord = (BaseIndexableRecord) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, baseIndexableRecord.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, baseIndexableRecord.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.descriptionText, baseIndexableRecord.descriptionText}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, baseIndexableRecord.address}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routablePoints, baseIndexableRecord.routablePoints}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.categories, baseIndexableRecord.categories}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.makiIcon, baseIndexableRecord.makiIcon}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.coordinate, baseIndexableRecord.coordinate}, getCieXyz.write())).booleanValue() || this.type != baseIndexableRecord.type) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.metadata, baseIndexableRecord.metadata}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.indexTokens, baseIndexableRecord.indexTokens}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.sdkResolvedRecord, baseIndexableRecord.sdkResolvedRecord}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        return "BaseIndexableRecord(id=" + this.id + ", name=" + this.name + ", descriptionText=" + this.descriptionText + ", address=" + this.address + ", routablePoints=" + this.routablePoints + ", categories=" + this.categories + ", makiIcon=" + this.makiIcon + ", coordinate=" + this.coordinate + ", type=" + this.type + ", metadata=" + this.metadata + ", indexTokens=" + this.indexTokens + ", sdkResolvedRecord=" + this.sdkResolvedRecord + ')';
    }
}
