package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.destination.data.models.Location;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$Map;

/* JADX INFO: loaded from: classes3.dex */
public final class PlatformFontLoader implements Parcelable.Creator {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = read;
        int i4 = i3 + 87;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        ScrollableComponent$Map.PinComponent.EntrancePin[] entrancePinArr = new ScrollableComponent$Map.PinComponent.EntrancePin[i];
        int i6 = i3 + 123;
        IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 9 / 0;
        }
        return entrancePinArr;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        int i = 2 % 2;
        int i2 = read + 9;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            parcel.getClass();
            Location.CREATOR.createFromParcel(parcel);
            parcel.readInt();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        parcel.getClass();
        Location locationCreateFromParcel = Location.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            int i3 = read + 25;
            IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                int i4 = 2 / 4;
            }
            z = true;
        } else {
            z = false;
        }
        return new ScrollableComponent$Map.PinComponent.EntrancePin(locationCreateFromParcel, z, parcel.readInt(), parcel.readString());
    }
}
