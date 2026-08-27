package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import com.mapbox.search.result.SearchResult;
import o.getCieXyz;
import o.removeNodeAtDepth;
import o.resizeToBitmapDimensionslambda0;

/* JADX INFO: loaded from: classes3.dex */
public final class TransferChangeViewState implements resizeToBitmapDimensionslambda0, Parcelable {
    public static final Parcelable.Creator<TransferChangeViewState> CREATOR = new SearchResult.Creator(26);
    private static int MediaDescriptionCompat = 1;
    private static int MediaSessionCompatQueueItem = 0;
    private static int read = 0;
    private static int write = 1;
    public final TransferButtonState IconCompatParcelizer;
    public final AmountTextInputState RemoteActionCompatParcelizer;
    public final CalculatorState serializer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 17;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return 0;
    }

    public TransferChangeViewState(AmountTextInputState amountTextInputState, CalculatorState calculatorState, TransferButtonState transferButtonState) {
        amountTextInputState.getClass();
        calculatorState.getClass();
        transferButtonState.getClass();
        this.RemoteActionCompatParcelizer = amountTextInputState;
        this.serializer = calculatorState;
        this.IconCompatParcelizer = transferButtonState;
    }

    static {
        int i = write + 89;
        read = i % Fields.SpotShadowColor;
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
        int i3 = MediaDescriptionCompat + 49;
        MediaSessionCompatQueueItem = i3 % Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            parcel.getClass();
            this.RemoteActionCompatParcelizer.writeToParcel(parcel, i);
            this.serializer.writeToParcel(parcel, i);
            TransferButtonState transferButtonState = this.IconCompatParcelizer;
            transferButtonState.getClass();
            parcel.writeInt(transferButtonState.read ? 1 : 0);
            return;
        }
        parcel.getClass();
        this.RemoteActionCompatParcelizer.writeToParcel(parcel, i);
        this.serializer.writeToParcel(parcel, i);
        TransferButtonState transferButtonState2 = this.IconCompatParcelizer;
        transferButtonState2.getClass();
        parcel.writeInt(transferButtonState2.read ? 1 : 0);
        int i4 = 81 / 0;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 33;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = Boolean.hashCode(this.IconCompatParcelizer.read) + ((this.serializer.hashCode() + (iHashCode * 31)) * 31);
        int i4 = MediaDescriptionCompat + 55;
        MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = "TransferChangeViewState(amountTextInputState=" + this.RemoteActionCompatParcelizer + ", calculatorState=" + this.serializer + ", transferButtonState=" + this.IconCompatParcelizer + ")";
        int i2 = MediaDescriptionCompat + 81;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            int i2 = MediaSessionCompatQueueItem + 45;
            MediaDescriptionCompat = i2 % Fields.SpotShadowColor;
            return i2 % 2 != 0;
        }
        if (!(obj instanceof TransferChangeViewState)) {
            int i3 = MediaSessionCompatQueueItem + 123;
            MediaDescriptionCompat = i3 % Fields.SpotShadowColor;
            if (i3 % 2 == 0) {
                int i4 = 47 / 0;
            }
            return false;
        }
        TransferChangeViewState transferChangeViewState = (TransferChangeViewState) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.RemoteActionCompatParcelizer, transferChangeViewState.RemoteActionCompatParcelizer}, getCieXyz.write())).booleanValue()) {
            int i5 = MediaDescriptionCompat + 15;
            MediaSessionCompatQueueItem = i5 % Fields.SpotShadowColor;
            if (i5 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.serializer, transferChangeViewState.serializer}, getCieXyz.write())).booleanValue()) {
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.IconCompatParcelizer, transferChangeViewState.IconCompatParcelizer}, getCieXyz.write())).booleanValue();
        }
        int i6 = MediaSessionCompatQueueItem + 67;
        MediaDescriptionCompat = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return false;
    }
}
