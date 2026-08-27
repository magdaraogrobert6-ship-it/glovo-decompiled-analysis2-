package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.destination.data.models.FooterComponent;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetW600cp implements Parcelable.Creator {
    private static int serializer = 1;
    private static int write;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = write + 93;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        FooterComponent.Arrival.ArrivalDetails[] arrivalDetailsArr = new FooterComponent.Arrival.ArrivalDetails[i];
        int i6 = i4 + 101;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            return arrivalDetailsArr;
        }
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        FooterComponent.Arrival.ArrivalDetails arrivalDetails = new FooterComponent.Arrival.ArrivalDetails(parcel.readString(), FooterComponent.Arrival.ArrivalDetails.Data.CREATOR.createFromParcel(parcel));
        int i2 = write + 7;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
        }
        return arrivalDetails;
    }
}
