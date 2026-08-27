package com.mapbox.search.common.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.resp.Vw;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class ImageInfo implements Parcelable {
    public static final Parcelable.Creator<ImageInfo> CREATOR = new Vw.yn(23);
    public final int height;
    public final String imageCategory;
    public final String thumbnailUrl;
    public final String type;
    public final String url;
    public final int width;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int iHashCode = this.url.hashCode();
        int i = this.width;
        int i2 = this.height;
        String str = this.thumbnailUrl;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.imageCategory;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.type;
        return (((((((((iHashCode * 31) + i) * 31) + i2) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public ImageInfo(String str, int i, int i2, String str2, String str3, String str4) {
        str.getClass();
        this.url = str;
        this.width = i;
        this.height = i2;
        this.thumbnailUrl = str2;
        this.imageCategory = str3;
        this.type = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.url);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.thumbnailUrl);
        parcel.writeString(this.imageCategory);
        parcel.writeString(this.type);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageInfo(url='");
        sb.append(this.url);
        sb.append("', width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", thumbnailUrl=");
        sb.append(this.thumbnailUrl);
        sb.append(", imageCategory=");
        sb.append(this.imageCategory);
        sb.append(", type=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.type, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ImageInfo.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ImageInfo imageInfo = (ImageInfo) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.url, imageInfo.url}, getCieXyz.write())).booleanValue() || this.width != imageInfo.width || this.height != imageInfo.height) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.thumbnailUrl, imageInfo.thumbnailUrl}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.imageCategory, imageInfo.imageCategory}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.type, imageInfo.type}, getCieXyz.write())).booleanValue();
    }
}
