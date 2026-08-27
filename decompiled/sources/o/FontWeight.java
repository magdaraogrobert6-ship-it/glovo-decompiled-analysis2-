package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.destination.data.models.Analytics;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class FontWeight implements Parcelable.Creator {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 59;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        RemoteActionCompatParcelizer = i4;
        if (i3 % 2 == 0) {
            Analytics[] analyticsArr = new Analytics[i];
            throw null;
        }
        Analytics[] analyticsArr2 = new Analytics[i];
        int i5 = i4 + 53;
        IconCompatParcelizer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return analyticsArr2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        String string = parcel.readString();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        int i3 = RemoteActionCompatParcelizer + 103;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        for (int i5 = 0; i5 != i2; i5++) {
            arrayList.add(Analytics.Parameter.CREATOR.createFromParcel(parcel));
        }
        Analytics analytics = new Analytics(string, arrayList);
        int i6 = IconCompatParcelizer + 63;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return analytics;
    }
}
