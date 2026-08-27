package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;

/* JADX INFO: loaded from: classes3.dex */
public final class changeUserlambda15 implements Parcelable.Creator {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 33;
        int i4 = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        read = i4;
        int i5 = i3 % 2;
        StartWorkingNavAction.StartExistingShift[] startExistingShiftArr = new StartWorkingNavAction.StartExistingShift[i];
        int i6 = i4 + 83;
        RemoteActionCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return startExistingShiftArr;
        }
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        StartWorkingNavAction.StartExistingShift startExistingShift = new StartWorkingNavAction.StartExistingShift(parcel.readString(), parcel.readString());
        int i2 = RemoteActionCompatParcelizer + 89;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return startExistingShift;
    }
}
