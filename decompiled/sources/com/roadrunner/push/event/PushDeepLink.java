package com.roadrunner.push.event;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import o.access700;
import o.getCieXyz;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class PushDeepLink implements Parcelable {
    public static final Parcelable.Creator<PushDeepLink> CREATOR = new access700(0);
    private static int IconCompatParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    private static int serializer = 1;
    private static int write;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = write + 99;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 37;
        write = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    static {
        int i = IconCompatParcelizer + 89;
        serializer = i % Fields.SpotShadowColor;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public PushDeepLink(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = write + 81;
        MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            parcel.getClass();
            parcel.writeString(this.RemoteActionCompatParcelizer);
            parcel.writeString(this.read);
            int i4 = 79 / 0;
        } else {
            parcel.getClass();
            parcel.writeString(this.RemoteActionCompatParcelizer);
            parcel.writeString(this.read);
        }
        int i5 = write + 81;
        MediaDescriptionCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 109;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PushDeepLink(url=", this.RemoteActionCompatParcelizer, ", openButtonText=", this.read, ")");
        }
        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("PushDeepLink(url=", this.RemoteActionCompatParcelizer, ", openButtonText=", this.read, ")");
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = write + 49;
        MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + (this.RemoteActionCompatParcelizer.hashCode() * 31);
        int i4 = write + 25;
        MediaDescriptionCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = write + 91;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return true;
        }
        if (!(obj instanceof PushDeepLink)) {
            return false;
        }
        PushDeepLink pushDeepLink = (PushDeepLink) obj;
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, pushDeepLink.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            if (!(!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, pushDeepLink.read}, getCieXyz.write())).booleanValue())) {
                return true;
            }
            int i4 = MediaDescriptionCompat;
            int i5 = i4 + 95;
            write = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = i4 + 85;
            write = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return false;
        }
        int i9 = write + 7;
        MediaDescriptionCompat = i9 % Fields.SpotShadowColor;
        int i10 = i9 % 2;
        return false;
    }
}
