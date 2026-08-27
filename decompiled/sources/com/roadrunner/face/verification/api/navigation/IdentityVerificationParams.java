package com.roadrunner.face.verification.api.navigation;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import o.access700;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint
public final class IdentityVerificationParams implements Parcelable {
    public static final Parcelable.Creator<IdentityVerificationParams> CREATOR = new access700(7);
    private static int IconCompatParcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 33;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 17;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 0 / 0;
        }
        return 0;
    }

    public final String write() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 49;
        MediaMetadataCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return this.RemoteActionCompatParcelizer;
        }
        int i3 = 53 / 0;
        return this.RemoteActionCompatParcelizer;
    }

    static {
        int i = IconCompatParcelizer + 21;
        RatingCompat = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 27 / 0;
        }
    }

    public IdentityVerificationParams(String str, String str2, String str3, String str4) {
        d$$ExternalSyntheticOutline0.m(str, str2, str3, str4);
        this.serializer = str;
        this.write = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.read = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 71;
        MediaBrowserCompatMediaItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            parcel.getClass();
            parcel.writeString(this.serializer);
            parcel.writeString(this.write);
            parcel.writeString(this.RemoteActionCompatParcelizer);
            parcel.writeString(this.read);
            int i4 = 66 / 0;
        } else {
            parcel.getClass();
            parcel.writeString(this.serializer);
            parcel.writeString(this.write);
            parcel.writeString(this.RemoteActionCompatParcelizer);
            parcel.writeString(this.read);
        }
        int i5 = MediaMetadataCompat + 7;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final String toString() {
        String strM;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 101;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("IdentityVerificationParams(country=", this.serializer, ", userId=", this.write, ", invocationSite="), this.RemoteActionCompatParcelizer, ", selfieTriggerHeaderValue=", this.read, ")");
            int i3 = 41 / 0;
        } else {
            strM = ff$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("IdentityVerificationParams(country=", this.serializer, ", userId=", this.write, ", invocationSite="), this.RemoteActionCompatParcelizer, ", selfieTriggerHeaderValue=", this.read, ")");
        }
        int i4 = MediaMetadataCompat + 19;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 45;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.read.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(this.serializer.hashCode() * 31, 31, this.write), 31, this.RemoteActionCompatParcelizer);
        int i4 = MediaBrowserCompatMediaItem + 125;
        MediaMetadataCompat = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentityVerificationParams) {
            IdentityVerificationParams identityVerificationParams = (IdentityVerificationParams) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, identityVerificationParams.serializer}, getCieXyz.write())).booleanValue()) {
                return false;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.write, identityVerificationParams.write}, getCieXyz.write())).booleanValue()) {
                int i2 = MediaBrowserCompatMediaItem + 109;
                MediaMetadataCompat = i2 % Fields.SpotShadowColor;
                if (i2 % 2 == 0) {
                    return false;
                }
                throw null;
            }
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, identityVerificationParams.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
                int i3 = MediaBrowserCompatMediaItem + 121;
                MediaMetadataCompat = i3 % Fields.SpotShadowColor;
                int i4 = i3 % 2;
                return false;
            }
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, identityVerificationParams.read}, getCieXyz.write())).booleanValue()) {
                return true;
            }
            int i5 = MediaMetadataCompat + 91;
            MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = MediaBrowserCompatMediaItem + 95;
        MediaMetadataCompat = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
