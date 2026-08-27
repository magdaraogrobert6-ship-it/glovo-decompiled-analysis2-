package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.destination.data.models.Location;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$Map;

/* JADX INFO: loaded from: classes3.dex */
public final class toAndroidStringlambda0 implements Parcelable.Creator {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 117;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        IconCompatParcelizer = i4;
        int i5 = i3 % 2;
        ScrollableComponent$Map.PinComponent.Unknown[] unknownArr = new ScrollableComponent$Map.PinComponent.Unknown[i];
        int i6 = i4 + 9;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 == 0) {
            int i7 = 85 / 0;
        }
        return unknownArr;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 79;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            parcel.getClass();
            Location.CREATOR.createFromParcel(parcel);
            parcel.readInt();
            throw null;
        }
        parcel.getClass();
        ScrollableComponent$Map.PinComponent.Unknown unknown = new ScrollableComponent$Map.PinComponent.Unknown(Location.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt(), parcel.readString());
        int i3 = RemoteActionCompatParcelizer + 23;
        IconCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return unknown;
    }
}
