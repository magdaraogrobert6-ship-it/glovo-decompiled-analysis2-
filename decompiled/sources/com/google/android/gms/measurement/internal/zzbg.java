package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.zza;
import o.accessgetSystemNavigationDowncp;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new zza(10);
    public final String IconCompatParcelizer;
    public final zzbe read;
    public final long serializer;
    public final String write;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zza.IconCompatParcelizer(this, parcel, i);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.read);
        String str = this.write;
        int length = String.valueOf(str).length();
        String str2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        c8$$ExternalSyntheticOutline0.m(sb, "origin=", str, ",name=", str2);
        return ff$$ExternalSyntheticOutline0.m(sb, ",params=", strValueOf);
    }

    public zzbg(zzbg zzbgVar, long j) {
        accessgetSystemNavigationDowncp.IconCompatParcelizer(zzbgVar);
        this.IconCompatParcelizer = zzbgVar.IconCompatParcelizer;
        this.read = zzbgVar.read;
        this.write = zzbgVar.write;
        this.serializer = j;
    }

    public zzbg(String str, zzbe zzbeVar, String str2, long j) {
        this.IconCompatParcelizer = str;
        this.read = zzbeVar;
        this.write = str2;
        this.serializer = j;
    }
}
