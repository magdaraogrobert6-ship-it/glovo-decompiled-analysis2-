package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class setLatLng implements Parcelable.Creator {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = read;
        int i4 = i3 + 119;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        OrderDetails.Customer[] customerArr = new OrderDetails.Customer[i];
        int i6 = i3 + 103;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return customerArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037 A[PHI: r1 r2
  0x0037: PHI (r1v8 java.lang.String) = (r1v4 java.lang.String), (r1v9 java.lang.String) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x0035 A[PHI: r1 r2
  0x0035: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v9 java.lang.String) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0035: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String) binds: [B:8:0x0033, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String string;
        String string2;
        OrderDetails.Address addressCreateFromParcel;
        int i = 2 % 2;
        int i2 = read + 1;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            parcel.getClass();
            string = parcel.readString();
            string2 = parcel.readString();
            int i3 = 89 / 0;
            if (parcel.readInt() == 0) {
                addressCreateFromParcel = null;
            } else {
                addressCreateFromParcel = OrderDetails.Address.CREATOR.createFromParcel(parcel);
            }
        } else {
            parcel.getClass();
            string = parcel.readString();
            string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                addressCreateFromParcel = null;
            } else {
                addressCreateFromParcel = OrderDetails.Address.CREATOR.createFromParcel(parcel);
            }
        }
        OrderDetails.Customer customer = new OrderDetails.Customer(string, string2, addressCreateFromParcel);
        int i4 = RemoteActionCompatParcelizer + 99;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return customer;
    }
}
