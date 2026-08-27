package com.roadrunner.instant.shifts.presentation.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import bo.app.m1$$ExternalSyntheticOutline0;
import o.access700;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class BookShiftConfirmationParams implements Parcelable {
    public static final Parcelable.Creator<BookShiftConfirmationParams> CREATOR = new access700(9);
    private static int MediaDescriptionCompat = 1;
    private static int MediaMetadataCompat = 0;
    private static int MediaSessionCompatQueueItem = 0;
    private static int RatingCompat = 1;
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompatMediaItem;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final String write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = RatingCompat + 59;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return 0;
    }

    public BookShiftConfirmationParams(int i, String str, String str2, String str3, String str4, String str5) {
        m1$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        this.RemoteActionCompatParcelizer = i;
        this.serializer = str;
        this.read = str2;
        this.MediaBrowserCompatMediaItem = str3;
        this.IconCompatParcelizer = str4;
        this.write = str5;
    }

    static {
        int i = MediaDescriptionCompat + 85;
        MediaMetadataCompat = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 93;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        parcel.writeString(this.serializer);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompatMediaItem);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.write);
        int i5 = RatingCompat + 19;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 57;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = d$$ExternalSyntheticOutline0.m("BookShiftConfirmationParams(shiftId=", this.RemoteActionCompatParcelizer, ", shiftMonth=", this.serializer, ", shiftDay=");
        c8$$ExternalSyntheticOutline0.m(sbM, this.read, ", shiftNameOfDay=", this.MediaBrowserCompatMediaItem, ", shiftDuration=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ", shiftArea=", this.write, ")");
        int i4 = MediaSessionCompatQueueItem + 41;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 78 / 0;
        }
        return strM;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 27;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.write.hashCode() + af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(af$$ExternalSyntheticOutline0.m(Integer.hashCode(this.RemoteActionCompatParcelizer) * 31, 31, this.serializer), 31, this.read), 31, this.MediaBrowserCompatMediaItem), 31, this.IconCompatParcelizer);
        int i4 = MediaSessionCompatQueueItem + 79;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof BookShiftConfirmationParams) {
            BookShiftConfirmationParams bookShiftConfirmationParams = (BookShiftConfirmationParams) obj;
            if (this.RemoteActionCompatParcelizer != bookShiftConfirmationParams.RemoteActionCompatParcelizer) {
                return false;
            }
            Object[] objArr = {this.serializer, bookShiftConfirmationParams.serializer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr2 = {this.read, bookShiftConfirmationParams.read};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr2, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr3 = {this.MediaBrowserCompatMediaItem, bookShiftConfirmationParams.MediaBrowserCompatMediaItem};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr3, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr4 = {this.IconCompatParcelizer, bookShiftConfirmationParams.IconCompatParcelizer};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr4, getCieXyz.write())).booleanValue()) {
                return false;
            }
            Object[] objArr5 = {this.write, bookShiftConfirmationParams.write};
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr5, getCieXyz.write())).booleanValue()) {
                int i2 = MediaSessionCompatQueueItem + 31;
                RatingCompat = i2 % Fields.SpotShadowColor;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = RatingCompat + 11;
            MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                return true;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int i5 = RatingCompat + 117;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return false;
    }
}
