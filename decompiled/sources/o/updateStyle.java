package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class updateStyle implements Parcelable.Creator {
    private static int RemoteActionCompatParcelizer = 0;
    private static int serializer = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 31;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        if (i3 % 2 != 0) {
            OrderDetails.Vendor[] vendorArr = new OrderDetails.Vendor[i];
            throw null;
        }
        OrderDetails.Vendor[] vendorArr2 = new OrderDetails.Vendor[i];
        int i5 = i4 + 69;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return vendorArr2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        OrderDetails.Address addressCreateFromParcel;
        int i = 2 % 2;
        parcel.getClass();
        String string = parcel.readString();
        String string2 = parcel.readString();
        if (parcel.readInt() == 0) {
            int i2 = serializer + 71;
            RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i2 % 2 != 0) {
                int i3 = 10 / 0;
            }
            addressCreateFromParcel = null;
        } else {
            addressCreateFromParcel = OrderDetails.Address.CREATOR.createFromParcel(parcel);
        }
        OrderDetails.Vendor vendor = new OrderDetails.Vendor(string, string2, addressCreateFromParcel);
        int i4 = RemoteActionCompatParcelizer + 57;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            return vendor;
        }
        throw null;
    }
}
