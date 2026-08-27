package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new Month.AnonymousClass1(1);
    public final long serializer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean serializer(long j) {
        return j <= this.serializer;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.serializer);
    }

    public DateValidatorPointBackward(long j) {
        this.serializer = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointBackward) && this.serializer == ((DateValidatorPointBackward) obj).serializer;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.serializer)});
    }
}
