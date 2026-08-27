package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.instant.shifts.presentation.BookShiftConfirmationResult;

/* JADX INFO: loaded from: classes3.dex */
public final class saveOldPosition implements Parcelable.Creator {
    private static int read = 1;
    private static int write;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = read + 51;
        write = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i3 % 2 == 0) {
            return new BookShiftConfirmationResult.ShiftBookedSuccessfully[i];
        }
        BookShiftConfirmationResult.ShiftBookedSuccessfully[] shiftBookedSuccessfullyArr = new BookShiftConfirmationResult.ShiftBookedSuccessfully[i];
        throw null;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        BookShiftConfirmationResult.ShiftBookedSuccessfully shiftBookedSuccessfully = new BookShiftConfirmationResult.ShiftBookedSuccessfully(parcel.readString());
        int i2 = write + 97;
        read = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            return shiftBookedSuccessfully;
        }
        throw null;
    }
}
