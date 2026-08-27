package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;

/* JADX INFO: loaded from: classes3.dex */
public final class closeSessionlambda2 implements Parcelable.Creator {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 63;
        RemoteActionCompatParcelizer = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return new StartWorkingNavAction.StartExistingShiftInsideStartingArea[i];
        }
        StartWorkingNavAction.StartExistingShiftInsideStartingArea[] startExistingShiftInsideStartingAreaArr = new StartWorkingNavAction.StartExistingShiftInsideStartingArea[i];
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StartWorkingNavAction.StartExistingShiftInsideStartingArea startExistingShiftInsideStartingArea;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 85;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            parcel.getClass();
            parcel.readInt();
            startExistingShiftInsideStartingArea = StartWorkingNavAction.StartExistingShiftInsideStartingArea.serializer;
            int i3 = 73 / 0;
        } else {
            parcel.getClass();
            parcel.readInt();
            startExistingShiftInsideStartingArea = StartWorkingNavAction.StartExistingShiftInsideStartingArea.serializer;
        }
        int i4 = RemoteActionCompatParcelizer + 41;
        IconCompatParcelizer = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i4 % 2 == 0) {
            int i5 = 39 / 0;
        }
        return startExistingShiftInsideStartingArea;
    }
}
