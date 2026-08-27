package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;

/* JADX INFO: loaded from: classes3.dex */
public final class closeSessionlambda0 implements Parcelable.Creator {
    private static int IconCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 59;
        RemoteActionCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        StartWorkingNavAction.StartOnDemand[] startOnDemandArr = new StartWorkingNavAction.StartOnDemand[i];
        int i6 = i3 + 87;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return startOnDemandArr;
        }
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 25;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        parcel.getClass();
        parcel.readInt();
        StartWorkingNavAction.StartOnDemand startOnDemand = StartWorkingNavAction.StartOnDemand.serializer;
        int i4 = RemoteActionCompatParcelizer + 107;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return startOnDemand;
    }
}
