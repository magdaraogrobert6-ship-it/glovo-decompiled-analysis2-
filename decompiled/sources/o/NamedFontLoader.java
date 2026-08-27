package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.destination.data.models.Location;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$Map;

/* JADX INFO: loaded from: classes3.dex */
public final class NamedFontLoader implements Parcelable.Creator {
    private static int serializer = 0;
    private static int write = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        ScrollableComponent$Map.PinComponent.CustomerPin[] customerPinArr;
        int i2 = 2 % 2;
        int i3 = serializer + 61;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        write = i4;
        if (i3 % 2 == 0) {
            customerPinArr = new ScrollableComponent$Map.PinComponent.CustomerPin[i];
            int i5 = 8 / 0;
        } else {
            customerPinArr = new ScrollableComponent$Map.PinComponent.CustomerPin[i];
        }
        int i6 = i4 + 11;
        serializer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 28 / 0;
        }
        return customerPinArr;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        int i = 2 % 2;
        int i2 = write + 35;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        parcel.getClass();
        Location locationCreateFromParcel = Location.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            int i4 = write + 75;
            serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        return new ScrollableComponent$Map.PinComponent.CustomerPin(locationCreateFromParcel, z, parcel.readInt(), parcel.readString());
    }
}
