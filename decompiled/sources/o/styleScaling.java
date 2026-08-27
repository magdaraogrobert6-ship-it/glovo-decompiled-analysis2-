package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class styleScaling implements Parcelable.Creator {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 51;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        serializer = i4;
        int i5 = i3 % 2;
        OrderDetails.Address.LatLong[] latLongArr = new OrderDetails.Address.LatLong[i];
        int i6 = i4 + 45;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return latLongArr;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        OrderDetails.Address.LatLong latLong = new OrderDetails.Address.LatLong(parcel.readDouble(), parcel.readDouble());
        int i2 = RemoteActionCompatParcelizer + 3;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
        return latLong;
    }
}
