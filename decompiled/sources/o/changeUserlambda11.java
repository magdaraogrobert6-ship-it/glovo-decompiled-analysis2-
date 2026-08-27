package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.startworking.api.navigation.StartWorkingNavAction;

/* JADX INFO: loaded from: classes3.dex */
public final class changeUserlambda11 implements Parcelable.Creator {
    private static int IconCompatParcelizer = 0;
    private static int write = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 5;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        StartWorkingNavAction.BecomeAvailable[] becomeAvailableArr = new StartWorkingNavAction.BecomeAvailable[i];
        int i6 = i3 + 41;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            return becomeAvailableArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        parcel.getClass();
        parcel.readInt();
        StartWorkingNavAction.BecomeAvailable becomeAvailable = StartWorkingNavAction.BecomeAvailable.read;
        int i4 = IconCompatParcelizer + 51;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        return becomeAvailable;
    }
}
