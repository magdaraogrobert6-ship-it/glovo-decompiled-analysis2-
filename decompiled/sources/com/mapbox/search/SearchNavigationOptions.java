package com.mapbox.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.search.common.NavigationProfile;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchNavigationOptions implements Parcelable {
    public static final Parcelable.Creator<SearchNavigationOptions> CREATOR = new EtaType.Creator(5);
    public final EtaType etaType;
    public final NavigationProfile navigationProfile;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int iHashCode = this.navigationProfile.rawName.hashCode();
        EtaType etaType = this.etaType;
        return (iHashCode * 31) + (etaType != null ? etaType.rawName.hashCode() : 0);
    }

    public SearchNavigationOptions(NavigationProfile navigationProfile, EtaType etaType) {
        navigationProfile.getClass();
        this.navigationProfile = navigationProfile;
        this.etaType = etaType;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.navigationProfile, i);
        EtaType etaType = this.etaType;
        if (etaType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(etaType.rawName);
        }
    }

    public final String toString() {
        return "SearchNavigationOptions(navigationProfile=" + this.navigationProfile + ", etaType=" + this.etaType + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SearchNavigationOptions.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        SearchNavigationOptions searchNavigationOptions = (SearchNavigationOptions) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.navigationProfile, searchNavigationOptions.navigationProfile}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.etaType, searchNavigationOptions.etaType}, getCieXyz.write())).booleanValue();
    }
}
