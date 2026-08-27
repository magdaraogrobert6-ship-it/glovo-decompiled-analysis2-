package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.delivery.destination.data.models.NavigationDestination;
import com.roadrunner.delivery.destination.data.models.ScrollableComponent$Map;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class PlatformFontVariationSettings_androidKt implements Parcelable.Creator {
    private static int serializer = 0;
    private static int write = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = serializer + 53;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 != 0) {
            return new ScrollableComponent$Map.MapComponent.Navigation[i];
        }
        ScrollableComponent$Map.MapComponent.Navigation[] navigationArr = new ScrollableComponent$Map.MapComponent.Navigation[i];
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        while (i3 != i2) {
            int i4 = serializer + 27;
            write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i4 % 2 == 0) {
                arrayList.add(NavigationDestination.CREATOR.createFromParcel(parcel));
                i3 += 118;
            } else {
                arrayList.add(NavigationDestination.CREATOR.createFromParcel(parcel));
                i3++;
            }
        }
        ScrollableComponent$Map.MapComponent.Navigation navigation = new ScrollableComponent$Map.MapComponent.Navigation(parcel.readString(), parcel.readString(), arrayList);
        int i5 = serializer + 111;
        write = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return navigation;
    }
}
