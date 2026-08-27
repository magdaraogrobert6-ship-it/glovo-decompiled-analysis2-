package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;

/* JADX INFO: loaded from: classes2.dex */
public final class RulerKt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CalendarConstraints[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new CalendarConstraints((com.google.android.material.datepicker.Month) parcel.readParcelable(com.google.android.material.datepicker.Month.class.getClassLoader()), (com.google.android.material.datepicker.Month) parcel.readParcelable(com.google.android.material.datepicker.Month.class.getClassLoader()), (CalendarConstraints.DateValidator) parcel.readParcelable(CalendarConstraints.DateValidator.class.getClassLoader()), (com.google.android.material.datepicker.Month) parcel.readParcelable(com.google.android.material.datepicker.Month.class.getClassLoader()), parcel.readInt());
    }
}
