package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.roadrunner.instant.shifts.presentation.BookShiftConfirmationResult;

/* JADX INFO: loaded from: classes3.dex */
public final class setScrapContainer implements Parcelable.Creator {
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer;
        int i4 = i3 + 89;
        write = i4 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i5 = i4 % 2;
        BookShiftConfirmationResult.ShiftBookingFailed[] shiftBookingFailedArr = new BookShiftConfirmationResult.ShiftBookingFailed[i];
        int i6 = i3 + 51;
        write = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return shiftBookingFailedArr;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2 % 2;
        parcel.getClass();
        BookShiftConfirmationResult.ShiftBookingFailed shiftBookingFailed = new BookShiftConfirmationResult.ShiftBookingFailed(parcel.readString());
        int i2 = RemoteActionCompatParcelizer + 119;
        write = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        return shiftBookingFailed;
    }
}
