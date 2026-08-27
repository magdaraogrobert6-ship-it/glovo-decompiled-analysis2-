package com.mapbox.search.common;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.resp.Vw;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class NavigationProfile implements Parcelable {
    public static final Parcelable.Creator<NavigationProfile> CREATOR = new Vw.yn(18);
    public final String rawName;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.rawName.hashCode();
    }

    public NavigationProfile(String str) {
        str.getClass();
        this.rawName = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.rawName);
    }

    static {
        new NavigationProfile("driving");
        new NavigationProfile("cycling");
        new NavigationProfile("walking");
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("SearchNavigationProfile(rawName='"), this.rawName, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NavigationProfile.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.rawName, ((NavigationProfile) obj).rawName}, getCieXyz.write())).booleanValue();
    }
}
