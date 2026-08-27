package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.destination.data.models.Location;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$Map;

/* JADX INFO: loaded from: classes3.dex */
public final class toAndroidArray implements Parcelable.Creator {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer;
        int i4 = i3 + 59;
        read = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        Object obj = null;
        if (i4 % 2 != 0) {
            ScrollableComponent$Map.PinComponent.VendorPin[] vendorPinArr = new ScrollableComponent$Map.PinComponent.VendorPin[i];
            throw null;
        }
        ScrollableComponent$Map.PinComponent.VendorPin[] vendorPinArr2 = new ScrollableComponent$Map.PinComponent.VendorPin[i];
        int i5 = i3 + 63;
        read = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return vendorPinArr2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        int i = 2 % 2;
        int i2 = read + 105;
        RemoteActionCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            parcel.getClass();
            Location.CREATOR.createFromParcel(parcel);
            parcel.readInt();
            throw null;
        }
        parcel.getClass();
        Location locationCreateFromParcel = Location.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            int i3 = RemoteActionCompatParcelizer + 25;
            read = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            int i4 = i3 % 2;
            z = false;
        }
        return new ScrollableComponent$Map.PinComponent.VendorPin(locationCreateFromParcel, z, parcel.readInt(), parcel.readString());
    }
}
