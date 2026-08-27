package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.destination.data.models.FooterComponent;

/* JADX INFO: loaded from: classes3.dex */
public final class accessgetW500cp implements Parcelable.Creator {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 7;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return new FooterComponent.Arrival[i];
        }
        FooterComponent.Arrival[] arrivalArr = new FooterComponent.Arrival[i];
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        FooterComponent.Arrival arrival = new FooterComponent.Arrival(parcel.readString(), parcel.readString(), FooterComponent.Arrival.ArrivalDetails.CREATOR.createFromParcel(parcel));
        int i2 = IconCompatParcelizer + 45;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return arrival;
    }
}
