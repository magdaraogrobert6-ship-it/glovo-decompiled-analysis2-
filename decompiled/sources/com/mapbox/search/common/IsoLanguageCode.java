package com.mapbox.search.common;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.huawei.location.resp.Vw;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class IsoLanguageCode implements Parcelable {
    public static final Parcelable.Creator<IsoLanguageCode> CREATOR = new Vw.yn(17);
    public final String code;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.code.hashCode();
    }

    public IsoLanguageCode(String str) {
        str.getClass();
        this.code = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.code);
    }

    static {
        new IsoLanguageCode("sq");
        new IsoLanguageCode("ar");
        new IsoLanguageCode("bs");
        new IsoLanguageCode("bg");
        new IsoLanguageCode("ca");
        new IsoLanguageCode("zh");
        new IsoLanguageCode("zh-Hans");
        new IsoLanguageCode("zh-Hant");
        new IsoLanguageCode("cs");
        new IsoLanguageCode("da");
        new IsoLanguageCode("nl");
        new IsoLanguageCode("en");
        new IsoLanguageCode("fi");
        new IsoLanguageCode("fr");
        new IsoLanguageCode("ka");
        new IsoLanguageCode("de");
        new IsoLanguageCode("he");
        new IsoLanguageCode("hu");
        new IsoLanguageCode("is");
        new IsoLanguageCode("id");
        new IsoLanguageCode("it");
        new IsoLanguageCode("ja");
        new IsoLanguageCode("kk");
        new IsoLanguageCode("ko");
        new IsoLanguageCode("lv");
        new IsoLanguageCode("mn");
        new IsoLanguageCode("nb");
        new IsoLanguageCode("pl");
        new IsoLanguageCode("pt");
        new IsoLanguageCode("ro");
        new IsoLanguageCode("sr");
        new IsoLanguageCode("sk");
        new IsoLanguageCode("sl");
        new IsoLanguageCode("es");
        new IsoLanguageCode("sv");
        new IsoLanguageCode("tl");
        new IsoLanguageCode("th");
        new IsoLanguageCode("tr");
    }

    public final String toString() {
        return ff$$ExternalSyntheticOutline0.m(new StringBuilder("Language(code='"), this.code, "')");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!IsoLanguageCode.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.code, ((IsoLanguageCode) obj).code}, getCieXyz.write())).booleanValue();
    }
}
