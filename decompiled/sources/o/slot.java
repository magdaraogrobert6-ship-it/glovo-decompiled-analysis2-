package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class slot implements Parcelable.Creator {
    private static int read = 1;
    private static int serializer;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = read + 63;
        serializer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return new OrderDetails.Address[i];
        }
        int i4 = 7 / 0;
        return new OrderDetails.Address[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        int i2 = read + 71;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        parcel.getClass();
        OrderDetails.Address address = new OrderDetails.Address(parcel.readString(), parcel.readInt() == 0 ? null : OrderDetails.Address.LatLong.CREATOR.createFromParcel(parcel), parcel.readString());
        int i4 = serializer + 85;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return address;
    }
}
