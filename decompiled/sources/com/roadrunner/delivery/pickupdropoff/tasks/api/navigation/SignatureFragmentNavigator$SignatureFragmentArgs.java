package com.roadrunner.delivery.pickupdropoff.tasks.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.mapbox.search.result.SearchResult;
import o.getBitmapFromCache;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class SignatureFragmentNavigator$SignatureFragmentArgs implements Parcelable {
    public static final Parcelable.Creator<SignatureFragmentNavigator$SignatureFragmentArgs> CREATOR = new SearchResult.Creator(22);
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaDescriptionCompat = 1;
    private static int RatingCompat = 1;
    private static int write;
    public final String IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 3;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 93;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SignatureFragmentNavigator$SignatureFragmentArgs(String str, String str2, long j, String str3) {
        str.getClass();
        this.RemoteActionCompatParcelizer = j;
        this.read = str;
        this.serializer = str2;
        this.IconCompatParcelizer = str3;
    }

    static {
        int i = write + 19;
        MediaDescriptionCompat = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            int i2 = 48 / 0;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 69;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeLong(this.RemoteActionCompatParcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.serializer);
        parcel.writeString(this.IconCompatParcelizer);
        int i5 = MediaBrowserCompatMediaItem + 87;
        RatingCompat = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 13;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sb = getBitmapFromCache.read("SignatureFragmentArgs(deliveryId=", ", uid=", this.RemoteActionCompatParcelizer, this.read);
        c8$$ExternalSyntheticOutline0.m(sb, ", title=", this.serializer, ", description=", this.IconCompatParcelizer);
        sb.append(")");
        String string = sb.toString();
        int i4 = RatingCompat + 81;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return string;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = RatingCompat + 45;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iM = af$$ExternalSyntheticOutline0.m(Long.hashCode(this.RemoteActionCompatParcelizer) * 31, 31, this.read);
        String str = this.serializer;
        if (str == null) {
            int i4 = MediaBrowserCompatMediaItem + 95;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.IconCompatParcelizer;
        int iHashCode2 = ((iM + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
        int i6 = MediaBrowserCompatMediaItem + 55;
        RatingCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return iHashCode2;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof SignatureFragmentNavigator$SignatureFragmentArgs) {
            SignatureFragmentNavigator$SignatureFragmentArgs signatureFragmentNavigator$SignatureFragmentArgs = (SignatureFragmentNavigator$SignatureFragmentArgs) obj;
            if (this.RemoteActionCompatParcelizer != signatureFragmentNavigator$SignatureFragmentArgs.RemoteActionCompatParcelizer) {
                return false;
            }
            Object[] objArr = {this.read, signatureFragmentNavigator$SignatureFragmentArgs.read};
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                Object[] objArr2 = {this.serializer, signatureFragmentNavigator$SignatureFragmentArgs.serializer};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                    Object[] objArr3 = {this.IconCompatParcelizer, signatureFragmentNavigator$SignatureFragmentArgs.IconCompatParcelizer};
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                        return true;
                    }
                }
                return false;
            }
            int i2 = MediaBrowserCompatMediaItem + 65;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        int i4 = RatingCompat + 63;
        MediaBrowserCompatMediaItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return false;
    }
}
