package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.order.history.presentation.orderdetails.OrderDetails;

/* JADX INFO: loaded from: classes3.dex */
public final class RealImageLoader implements Parcelable.Creator {
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = serializer;
        int i4 = i3 + 31;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        OrderDetails.Item[] itemArr = new OrderDetails.Item[i];
        int i6 = i3 + 89;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return itemArr;
        }
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        OrderDetails.Item item = new OrderDetails.Item(parcel.readFloat(), parcel.readString());
        int i2 = RemoteActionCompatParcelizer + 83;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return item;
    }
}
