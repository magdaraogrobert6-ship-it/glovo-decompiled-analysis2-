package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetails;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class updatePulsingUi implements Parcelable.Creator {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer;
        int i4 = i3 + 97;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        OrderDetails[] orderDetailsArr = new OrderDetails[i];
        int i6 = i3 + 25;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return orderDetailsArr;
        }
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        long j = parcel.readLong();
        String string = parcel.readString();
        int i2 = parcel.readInt();
        OrderDetails.Vendor vendorCreateFromParcel = OrderDetails.Vendor.CREATOR.createFromParcel(parcel);
        OrderDetails.Customer customerCreateFromParcel = OrderDetails.Customer.CREATOR.createFromParcel(parcel);
        int i3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i3);
        int i4 = RemoteActionCompatParcelizer + 97;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        int i6 = 0;
        while (i6 != i3) {
            int i7 = RemoteActionCompatParcelizer + 21;
            IconCompatParcelizer = i7 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i7 % 2 == 0) {
                arrayList.add(OrderDetails.Item.CREATOR.createFromParcel(parcel));
                i6 += 6;
            } else {
                arrayList.add(OrderDetails.Item.CREATOR.createFromParcel(parcel));
                i6++;
            }
        }
        return new OrderDetails(j, string, i2, vendorCreateFromParcel, customerCreateFromParcel, arrayList);
    }
}
