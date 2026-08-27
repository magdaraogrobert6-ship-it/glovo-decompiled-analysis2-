package com.roadrunner.permission.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import com.google.android.gms.common.zza;
import o.r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08;

/* JADX INFO: loaded from: classes3.dex */
public final class PermissionModel implements Parcelable {
    public static final Parcelable.Creator<PermissionModel> CREATOR = new zza(23);
    private static int MediaDescriptionCompat = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 0;
    private static int write = 1;
    public final r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08 IconCompatParcelizer;
    public final boolean read;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = serializer;
        int i3 = i2 + 5;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 41;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    public PermissionModel(r8lambda60pWJrJ_IeYyPZNB7guGmuaMR08 r8lambda60pwjrj_ieyypznb7gugmuamr08, boolean z) {
        r8lambda60pwjrj_ieyypznb7gugmuamr08.getClass();
        this.IconCompatParcelizer = r8lambda60pwjrj_ieyypznb7gugmuamr08;
        this.read = z;
    }

    static {
        int i = write + 115;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = serializer + 9;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = Boolean.hashCode(this.read) + (this.IconCompatParcelizer.hashCode() * 31);
        int i4 = MediaDescriptionCompat + 101;
        serializer = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 125;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            parcel.getClass();
            parcel.writeString(this.IconCompatParcelizer.name());
            parcel.writeInt(this.read ? 1 : 0);
            int i4 = 95 / 0;
        } else {
            parcel.getClass();
            parcel.writeString(this.IconCompatParcelizer.name());
            parcel.writeInt(this.read ? 1 : 0);
        }
        int i5 = serializer + 99;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 105;
        int i4 = i3 % Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PermissionModel)) {
            int i6 = i4 + 119;
            MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            int i8 = i4 + 119;
            MediaDescriptionCompat = i8 % Fields.SpotShadowColor;
            if (i8 % 2 == 0) {
                int i9 = 5 / 0;
            }
            return false;
        }
        PermissionModel permissionModel = (PermissionModel) obj;
        if (this.IconCompatParcelizer != permissionModel.IconCompatParcelizer) {
            int i10 = i2 + 13;
            serializer = i10 % Fields.SpotShadowColor;
            return i10 % 2 != 0;
        }
        if (this.read == permissionModel.read) {
            return true;
        }
        int i11 = i2 + 125;
        serializer = i11 % Fields.SpotShadowColor;
        int i12 = i11 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "PermissionModel(permissionType=" + this.IconCompatParcelizer + ", isDismissible=" + this.read + ")";
        int i2 = MediaDescriptionCompat + 99;
        serializer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
