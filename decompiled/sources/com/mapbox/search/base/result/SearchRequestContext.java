package com.mapbox.search.base.result;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.resp.Vw;
import com.mapbox.search.base.utils.orientation.ScreenOrientation;
import com.mapbox.search.internal.bindgen.ApiType;
import java.util.Locale;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchRequestContext implements Parcelable {
    public static final Parcelable.Creator<SearchRequestContext> CREATOR = new Vw.yn(15);
    public final ApiType apiType;
    public final Locale keyboardLocale;
    public final String responseUuid;
    public final ScreenOrientation screenOrientation;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int iHashCode = this.apiType.hashCode();
        Locale locale = this.keyboardLocale;
        int iHashCode2 = locale == null ? 0 : locale.hashCode();
        ScreenOrientation screenOrientation = this.screenOrientation;
        int iHashCode3 = screenOrientation == null ? 0 : screenOrientation.hashCode();
        String str = this.responseUuid;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public SearchRequestContext(ApiType apiType, Locale locale, ScreenOrientation screenOrientation, String str) {
        apiType.getClass();
        this.apiType = apiType;
        this.keyboardLocale = locale;
        this.screenOrientation = screenOrientation;
        this.responseUuid = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.apiType.name());
        parcel.writeSerializable(this.keyboardLocale);
        ScreenOrientation screenOrientation = this.screenOrientation;
        if (screenOrientation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(screenOrientation.name());
        }
        parcel.writeString(this.responseUuid);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchRequestContext)) {
            return false;
        }
        SearchRequestContext searchRequestContext = (SearchRequestContext) obj;
        if (this.apiType != searchRequestContext.apiType) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.keyboardLocale, searchRequestContext.keyboardLocale}, getCieXyz.write())).booleanValue() || this.screenOrientation != searchRequestContext.screenOrientation) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.responseUuid, searchRequestContext.responseUuid}, getCieXyz.write())).booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchRequestContext(apiType=");
        sb.append(this.apiType);
        sb.append(", keyboardLocale=");
        sb.append(this.keyboardLocale);
        sb.append(", screenOrientation=");
        sb.append(this.screenOrientation);
        sb.append(", responseUuid=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.responseUuid, ')');
    }
}
