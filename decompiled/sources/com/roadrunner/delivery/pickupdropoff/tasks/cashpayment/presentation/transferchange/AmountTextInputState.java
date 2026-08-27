package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.search.result.SearchResult;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class AmountTextInputState implements Parcelable {
    public static final Parcelable.Creator<AmountTextInputState> CREATOR = new SearchResult.Creator(23);
    private static int MediaBrowserCompatMediaItem = 1;
    private static int MediaDescriptionCompat = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RatingCompat;
    public final boolean IconCompatParcelizer;
    public final boolean RemoteActionCompatParcelizer;
    public final String read;
    public final String serializer;
    public final boolean write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 91;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 65;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    public AmountTextInputState(String str, boolean z, boolean z2, boolean z3, String str2) {
        str.getClass();
        str2.getClass();
        this.read = str;
        this.write = z;
        this.IconCompatParcelizer = z2;
        this.RemoteActionCompatParcelizer = z3;
        this.serializer = str2;
    }

    static {
        int i = MediaBrowserCompatMediaItem + 103;
        MediaDescriptionCompat = i % Fields.SpotShadowColor;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaSessionCompatQueueItem + 121;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeString(this.read);
        parcel.writeInt(this.write ? 1 : 0);
        parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
        parcel.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
        parcel.writeString(this.serializer);
        int i5 = RatingCompat + 109;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 93;
        RatingCompat = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        StringBuilder sbM = af$$ExternalSyntheticOutline0.m("AmountTextInputState(text=", this.read, ", isError=", ", isRegexValidationError=", this.write);
        af$$ExternalSyntheticOutline0.m(sbM, this.IconCompatParcelizer, ", shouldShowErrorMessage=", this.RemoteActionCompatParcelizer, ", errorMessage=");
        String strM = ff$$ExternalSyntheticOutline0.m(sbM, this.serializer, ")");
        int i4 = MediaSessionCompatQueueItem + 93;
        RatingCompat = i4 % Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            return strM;
        }
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = RatingCompat + 107;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.serializer.hashCode() + d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(d$$ExternalSyntheticOutline0.m(this.read.hashCode() * 31, 31, this.write), 31, this.IconCompatParcelizer), 31, this.RemoteActionCompatParcelizer);
        int i4 = RatingCompat + 83;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this != obj) {
            if (obj instanceof AmountTextInputState) {
                AmountTextInputState amountTextInputState = (AmountTextInputState) obj;
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.read, amountTextInputState.read}, getCieXyz.write())).booleanValue()) {
                    if (this.write != amountTextInputState.write) {
                        return false;
                    }
                    if (this.IconCompatParcelizer == amountTextInputState.IconCompatParcelizer) {
                        if (this.RemoteActionCompatParcelizer != amountTextInputState.RemoteActionCompatParcelizer) {
                            return false;
                        }
                        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, amountTextInputState.serializer}, getCieXyz.write())).booleanValue()) {
                            return true;
                        }
                        int i2 = MediaSessionCompatQueueItem + 7;
                        RatingCompat = i2 % Fields.SpotShadowColor;
                        int i3 = i2 % 2;
                        return false;
                    }
                    int i4 = RatingCompat + 55;
                    MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                    if (i4 % 2 != 0) {
                        return false;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i5 = RatingCompat + 65;
                MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
                return i5 % 2 == 0;
            }
            int i6 = RatingCompat + 5;
            MediaSessionCompatQueueItem = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        int i8 = MediaSessionCompatQueueItem + 25;
        RatingCompat = i8 % Fields.SpotShadowColor;
        return i8 % 2 == 0;
    }
}
