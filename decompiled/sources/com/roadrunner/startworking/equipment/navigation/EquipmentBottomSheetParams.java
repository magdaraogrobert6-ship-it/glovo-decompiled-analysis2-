package com.roadrunner.startworking.equipment.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;
import o.access700;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class EquipmentBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<EquipmentBottomSheetParams> CREATOR = new access700(13);
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final StartWorkingNavAction read;
    public final boolean serializer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 35;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 37;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    public EquipmentBottomSheetParams(boolean z, StartWorkingNavAction startWorkingNavAction) {
        startWorkingNavAction.getClass();
        this.serializer = z;
        this.read = startWorkingNavAction;
    }

    static {
        int i = write + 95;
        RemoteActionCompatParcelizer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 67;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeInt(this.serializer ? 1 : 0);
        parcel.writeParcelable(this.read, i);
        int i5 = MediaBrowserCompatMediaItem + 107;
        IconCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 41;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iHashCode = this.read.hashCode() * (Boolean.hashCode(this.serializer) - 92);
        } else {
            iHashCode = this.read.hashCode() + (Boolean.hashCode(this.serializer) * 31);
        }
        int i3 = IconCompatParcelizer + 11;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EquipmentBottomSheetParams)) {
            return false;
        }
        EquipmentBottomSheetParams equipmentBottomSheetParams = (EquipmentBottomSheetParams) obj;
        if (this.serializer == equipmentBottomSheetParams.serializer) {
            Object[] objArr = {this.read, equipmentBottomSheetParams.read};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                int i2 = MediaBrowserCompatMediaItem + 69;
                IconCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = IconCompatParcelizer + 7;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = MediaBrowserCompatMediaItem + 7;
        IconCompatParcelizer = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "EquipmentBottomSheetParams(shouldNavigateToStartWorkingOnSave=" + this.serializer + ", startWorkingNavAction=" + this.read + ")";
        int i2 = IconCompatParcelizer + 45;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
