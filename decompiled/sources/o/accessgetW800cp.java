package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.destination.data.models.FooterComponent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetW800cp implements Parcelable.Creator {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = read;
        int i4 = i3 + 43;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            FooterComponent.Arrival.ArrivalDetails.Data[] dataArr = new FooterComponent.Arrival.ArrivalDetails.Data[i];
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FooterComponent.Arrival.ArrivalDetails.Data[] dataArr2 = new FooterComponent.Arrival.ArrivalDetails.Data[i];
        int i5 = i3 + 91;
        RemoteActionCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return dataArr2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        String string = parcel.readString();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        int i3 = read + 3;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = 0;
        while (i5 != i2) {
            int i6 = read + 91;
            RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 == 0) {
                arrayList.add(Long.valueOf(parcel.readLong()));
                i5 += 79;
            } else {
                arrayList.add(Long.valueOf(parcel.readLong()));
                i5++;
            }
        }
        return new FooterComponent.Arrival.ArrivalDetails.Data(string, parcel.readString(), arrayList);
    }
}
