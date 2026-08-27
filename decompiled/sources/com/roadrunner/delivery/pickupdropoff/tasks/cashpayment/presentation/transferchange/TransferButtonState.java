package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import com.mapbox.search.result.SearchResult;
import o.MediaSessionCompatQueueItem;

/* JADX INFO: loaded from: classes3.dex */
public final class TransferButtonState implements Parcelable {
    public static final Parcelable.Creator<TransferButtonState> CREATOR = new SearchResult.Creator(25);
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer = 1;
    private static int write;
    public final boolean read;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 61;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public TransferButtonState(boolean z) {
        this.read = z;
    }

    static {
        int i = write + 75;
        serializer = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 59;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            Boolean.hashCode(this.read);
            throw null;
        }
        int iHashCode = Boolean.hashCode(this.read);
        int i3 = RemoteActionCompatParcelizer + 51;
        IconCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 3;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            parcel.getClass();
            parcel.writeInt(this.read ? 1 : 0);
        } else {
            parcel.getClass();
            parcel.writeInt(this.read ? 1 : 0);
            throw null;
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        IconCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        String strSerializer = MediaSessionCompatQueueItem.serializer("TransferButtonState(isEnabled=", ")", this.read);
        int i4 = RemoteActionCompatParcelizer + 15;
        IconCompatParcelizer = i4 % Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            int i5 = 60 / 0;
        }
        return strSerializer;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 83;
        RemoteActionCompatParcelizer = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransferButtonState) {
            if (this.read == ((TransferButtonState) obj).read) {
                return true;
            }
            int i5 = i2 + 87;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return false;
        }
        int i7 = i2 + 3;
        RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
        int i8 = i7 % 2;
        return false;
    }
}
