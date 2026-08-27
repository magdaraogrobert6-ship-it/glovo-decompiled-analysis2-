package com.roadrunner.delivery.pickupdropoff.tasks.cashpayment.presentation.transferchange;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Fields;
import bo.app.d$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.mapbox.search.result.SearchResult;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class CalculatorState implements Parcelable {
    public static final Parcelable.Creator<CalculatorState> CREATOR = new SearchResult.Creator(24);
    private static int IconCompatParcelizer = 1;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RatingCompat;
    private static int write;
    public final String RemoteActionCompatParcelizer;
    public final boolean read;
    public final boolean serializer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 37;
        int i3 = i2 % Fields.SpotShadowColor;
        RatingCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        MediaBrowserCompatMediaItem = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return 0;
    }

    static {
        int i = IconCompatParcelizer + 79;
        write = i % Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CalculatorState(String str, int i, boolean z) {
        if ((i & 1) != 0) {
            int i2 = RatingCompat + 13;
            int i3 = i2 % Fields.SpotShadowColor;
            MediaBrowserCompatMediaItem = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 117;
            RatingCompat = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            z = false;
        }
        this((i & 4) != 0 ? "--" : str, z, false);
    }

    public CalculatorState(String str, boolean z, boolean z2) {
        str.getClass();
        this.read = z;
        this.serializer = z2;
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 95;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        parcel.getClass();
        parcel.writeInt(this.read ? 1 : 0);
        parcel.writeInt(this.serializer ? 1 : 0);
        parcel.writeString(this.RemoteActionCompatParcelizer);
        int i5 = MediaBrowserCompatMediaItem + 33;
        RatingCompat = i5 % Fields.SpotShadowColor;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final int hashCode() {
        int iM;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 119;
        RatingCompat = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            iM = this.RemoteActionCompatParcelizer.hashCode() << d$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.read) - 111, 112, this.serializer);
        } else {
            iM = d$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.read) * 31, 31, this.serializer) + this.RemoteActionCompatParcelizer.hashCode();
        }
        int i3 = MediaBrowserCompatMediaItem + 99;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return iM;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder("CalculatorState(isError=");
        sb.append(this.read);
        sb.append(", isLoadingState=");
        sb.append(this.serializer);
        sb.append(", calculatedAmountWithCurrency=");
        String strM = ff$$ExternalSyntheticOutline0.m(sb, this.RemoteActionCompatParcelizer, ")");
        int i2 = RatingCompat + 83;
        MediaBrowserCompatMediaItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return strM;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalculatorState)) {
            int i2 = MediaBrowserCompatMediaItem + 125;
            RatingCompat = i2 % Fields.SpotShadowColor;
            int i3 = i2 % 2;
            return false;
        }
        CalculatorState calculatorState = (CalculatorState) obj;
        if (this.read != calculatorState.read) {
            int i4 = MediaBrowserCompatMediaItem + 49;
            RatingCompat = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return false;
        }
        if (this.serializer != calculatorState.serializer) {
            int i6 = MediaBrowserCompatMediaItem + 65;
            RatingCompat = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return false;
        }
        Object[] objArr = {this.RemoteActionCompatParcelizer, calculatorState.RemoteActionCompatParcelizer};
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
            int i8 = MediaBrowserCompatMediaItem + 79;
            RatingCompat = i8 % Fields.SpotShadowColor;
            int i9 = i8 % 2;
            return true;
        }
        int i10 = RatingCompat + 33;
        MediaBrowserCompatMediaItem = i10 % Fields.SpotShadowColor;
        if (i10 % 2 != 0) {
            return false;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }
}
