package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;

/* JADX INFO: loaded from: classes3.dex */
public final class clearEndpointProvider implements Parcelable.Creator {
    private static int IconCompatParcelizer = 1;
    private static int serializer;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 101;
        serializer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 != 0) {
            StartWorkingNavAction.StartWorkNow[] startWorkNowArr = new StartWorkingNavAction.StartWorkNow[i];
            throw null;
        }
        StartWorkingNavAction.StartWorkNow[] startWorkNowArr2 = new StartWorkingNavAction.StartWorkNow[i];
        int i5 = i3 + 33;
        serializer = i5 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return startWorkNowArr2;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        StartWorkingNavAction.StartWorkNow startWorkNow = new StartWorkingNavAction.StartWorkNow(parcel.readString(), onServiceConnected.valueOf(parcel.readString()));
        int i2 = IconCompatParcelizer + 75;
        serializer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 17 / 0;
        }
        return startWorkNow;
    }
}
