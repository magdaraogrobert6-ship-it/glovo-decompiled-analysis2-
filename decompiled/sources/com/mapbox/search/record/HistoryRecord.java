package com.mapbox.search.record;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.mapbox.geojson.Point;
import com.mapbox.search.SearchResultMetadata;
import com.mapbox.search.result.SearchAddress;
import com.mapbox.search.result.SearchResult;
import com.mapbox.search.result.SearchResultType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class HistoryRecord implements IndexableRecord, Parcelable {
    public static final Parcelable.Creator<HistoryRecord> CREATOR = new SearchResult.Creator(3);
    public final SearchAddress address;
    public final List categories;
    public final Point coordinate;
    public final String descriptionText;
    public final String id;
    public final String makiIcon;
    public final SearchResultMetadata metadata;
    public final String name;
    public final String newType;
    public final List routablePoints;
    public final long timestamp;
    public final SearchResultType type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.name);
        String str = this.descriptionText;
        int iHashCode = str != null ? str.hashCode() : 0;
        SearchAddress searchAddress = this.address;
        int iHashCode2 = searchAddress != null ? searchAddress.hashCode() : 0;
        List list = this.routablePoints;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        List list2 = this.categories;
        int iHashCode4 = list2 != null ? list2.hashCode() : 0;
        String str2 = this.makiIcon;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        int iHashCode6 = this.coordinate.hashCode();
        int iHashCode7 = this.type.hashCode();
        SearchResultMetadata searchResultMetadata = this.metadata;
        return this.newType.hashCode() + d$$ExternalSyntheticOutline0.m((((iHashCode7 + ((iHashCode6 + ((((((((((iM + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31)) * 31)) * 31) + (searchResultMetadata != null ? searchResultMetadata.coreMetadata.hashCode() : 0)) * 31, 31, this.timestamp);
    }

    public HistoryRecord(String str, String str2, String str3, SearchAddress searchAddress, ArrayList arrayList, ArrayList arrayList2, String str4, Point point, SearchResultType searchResultType, SearchResultMetadata searchResultMetadata, long j, String str5) {
        str.getClass();
        str2.getClass();
        point.getClass();
        searchResultType.getClass();
        str5.getClass();
        this.id = str;
        this.name = str2;
        this.descriptionText = str3;
        this.address = searchAddress;
        this.routablePoints = arrayList;
        this.categories = arrayList2;
        this.makiIcon = str4;
        this.coordinate = point;
        this.type = searchResultType;
        this.metadata = searchResultMetadata;
        this.timestamp = j;
        this.newType = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.descriptionText);
        SearchAddress searchAddress = this.address;
        if (searchAddress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchAddress.writeToParcel(parcel, i);
        }
        List list = this.routablePoints;
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
        parcel.writeStringList(this.categories);
        parcel.writeString(this.makiIcon);
        parcel.writeSerializable(this.coordinate);
        parcel.writeString(this.type.name());
        SearchResultMetadata searchResultMetadata = this.metadata;
        if (searchResultMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeSerializable(searchResultMetadata.coreMetadata);
        }
        parcel.writeLong(this.timestamp);
        parcel.writeString(this.newType);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryRecord(id='");
        sb.append(this.id);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', descriptionText=");
        sb.append(this.descriptionText);
        sb.append(", address=");
        sb.append(this.address);
        sb.append(", routablePoints=");
        sb.append(this.routablePoints);
        sb.append(", categories=");
        sb.append(this.categories);
        sb.append(", makiIcon=");
        sb.append(this.makiIcon);
        sb.append(", coordinate=");
        sb.append(this.coordinate);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", newType=");
        sb.append(this.newType);
        sb.append(", metadata=");
        sb.append(this.metadata);
        sb.append(", timestamp=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.timestamp, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!HistoryRecord.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        HistoryRecord historyRecord = (HistoryRecord) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.id, historyRecord.id}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.name, historyRecord.name}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.descriptionText, historyRecord.descriptionText}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.address, historyRecord.address}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.routablePoints, historyRecord.routablePoints}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.categories, historyRecord.categories}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.makiIcon, historyRecord.makiIcon}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.coordinate, historyRecord.coordinate}, getCieXyz.write())).booleanValue() || this.type != historyRecord.type) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.metadata, historyRecord.metadata}, getCieXyz.write())).booleanValue() || this.timestamp != historyRecord.timestamp) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.newType, historyRecord.newType}, getCieXyz.write())).booleanValue();
    }
}
