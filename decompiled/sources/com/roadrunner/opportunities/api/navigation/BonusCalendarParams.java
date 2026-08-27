package com.roadrunner.opportunities.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import o.access700;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class BonusCalendarParams implements Parcelable {
    public static final Parcelable.Creator<BonusCalendarParams> CREATOR = new access700(11);
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 0;
    private static int write = 1;
    public final String IconCompatParcelizer;
    public final int serializer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 35;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public BonusCalendarParams(String str, int i) {
        this.IconCompatParcelizer = str;
        this.serializer = i;
    }

    static {
        int i = read + 33;
        write = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 73;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.serializer);
        int i5 = MediaBrowserCompatMediaItem + 35;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 119;
        int i4 = i3 % Fields.SpotShadowColor;
        MediaBrowserCompatMediaItem = i4;
        int i5 = i3 % 2;
        String str = this.IconCompatParcelizer;
        if (str == null) {
            int i6 = i4 + 107;
            RemoteActionCompatParcelizer = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            int i8 = MediaBrowserCompatMediaItem + 105;
            RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            i = iHashCode;
        }
        return Integer.hashCode(this.serializer) + (i * 31);
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BonusCalendarParams) {
            BonusCalendarParams bonusCalendarParams = (BonusCalendarParams) obj;
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, bonusCalendarParams.IconCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                if (this.serializer == bonusCalendarParams.serializer) {
                    return true;
                }
                int i2 = MediaBrowserCompatMediaItem + 7;
                RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = RemoteActionCompatParcelizer + 103;
            MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = RemoteActionCompatParcelizer + 47;
        MediaBrowserCompatMediaItem = i6 % Fields.SpotShadowColor;
        return i6 % 2 == 0;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "BonusCalendarParams(zoneName=" + this.IconCompatParcelizer + ", zoneId=" + this.serializer + ")";
        int i2 = RemoteActionCompatParcelizer + 71;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return str;
    }
}
