package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.destination.data.models.Location;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$Map;

/* JADX INFO: loaded from: classes3.dex */
public final class LoadedFontFamily implements Parcelable.Creator {
    private static int read = 0;
    private static int write = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = read + 33;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return new ScrollableComponent$Map.PinComponent.ParkingPin[i];
        }
        int i4 = 26 / 0;
        return new ScrollableComponent$Map.PinComponent.ParkingPin[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        int i = 2 % 2;
        int i2 = write + 117;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        parcel.getClass();
        Location locationCreateFromParcel = Location.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            int i4 = write + 83;
            read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i5 = i4 % 2;
            z = false;
        }
        return new ScrollableComponent$Map.PinComponent.ParkingPin(locationCreateFromParcel, z, parcel.readInt(), parcel.readString());
    }
}
