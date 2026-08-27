package com.mapbox.search.base.result;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.af$$ExternalSyntheticOutline0;
import com.huawei.location.resp.Vw;
import java.util.Arrays;
import o.IconCompatParcelizer;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseSuggestAction implements Parcelable {
    public static final Parcelable.Creator<BaseSuggestAction> CREATOR = new Vw.yn(14);
    public final byte[] body;
    public final String endpoint;
    public final boolean multiRetrievable;
    public final String path;
    public final String query;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int iM = af$$ExternalSyntheticOutline0.m(this.endpoint.hashCode() * 31, 31, this.path);
        String str = this.query;
        int iHashCode = str != null ? str.hashCode() : 0;
        byte[] bArr = this.body;
        return Boolean.hashCode(this.multiRetrievable) + ((((iM + iHashCode) * 31) + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31);
    }

    public BaseSuggestAction(String str, String str2, String str3, byte[] bArr, boolean z) {
        str.getClass();
        str2.getClass();
        this.endpoint = str;
        this.path = str2;
        this.query = str3;
        this.body = bArr;
        this.multiRetrievable = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.endpoint);
        parcel.writeString(this.path);
        parcel.writeString(this.query);
        parcel.writeByteArray(this.body);
        parcel.writeInt(this.multiRetrievable ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseSuggestAction(endpoint=");
        sb.append(this.endpoint);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", query=");
        sb.append(this.query);
        sb.append(", body=");
        sb.append(Arrays.toString(this.body));
        sb.append(", multiRetrievable=");
        return IconCompatParcelizer.IconCompatParcelizer(sb, this.multiRetrievable, ')');
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!BaseSuggestAction.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        BaseSuggestAction baseSuggestAction = (BaseSuggestAction) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.endpoint, baseSuggestAction.endpoint}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.path, baseSuggestAction.path}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.query, baseSuggestAction.query}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        byte[] bArr = baseSuggestAction.body;
        byte[] bArr2 = this.body;
        if (bArr2 != null) {
            if (bArr == null || !Arrays.equals(bArr2, bArr)) {
                return false;
            }
        } else if (bArr != null) {
            return false;
        }
        return this.multiRetrievable == baseSuggestAction.multiRetrievable;
    }
}
