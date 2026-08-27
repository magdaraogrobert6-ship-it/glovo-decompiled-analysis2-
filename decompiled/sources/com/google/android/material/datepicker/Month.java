package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import o.accessgetDeactivateOutOfFramecp;

/* JADX INFO: loaded from: classes2.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new AnonymousClass1(0);
    public final int IconCompatParcelizer;
    public final long MediaMetadataCompat;
    public final int RatingCompat;
    public final Calendar RemoteActionCompatParcelizer;
    public final int read;
    public String serializer;
    public final int write;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.Month$1, reason: invalid class name */
    public final class AnonymousClass1 implements Parcelable.Creator {
        public final /* synthetic */ int serializer;

        public /* synthetic */ AnonymousClass1(int i) {
            this.serializer = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            int i2 = this.serializer;
            if (i2 == 0) {
                return new Month[i];
            }
            if (i2 != 1) {
                return i2 != 2 ? new SingleDateSelector[i] : new DateValidatorPointForward[i];
            }
            return new DateValidatorPointBackward[i];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i = this.serializer;
            if (i == 0) {
                return Month.read(parcel.readInt(), parcel.readInt());
            }
            if (i == 1) {
                return new DateValidatorPointBackward(parcel.readLong());
            }
            if (i == 2) {
                return new DateValidatorPointForward(parcel.readLong());
            }
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.IconCompatParcelizer = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }
    }

    public static Month read(int i, int i2) {
        Calendar calendarWrite = accessgetDeactivateOutOfFramecp.write((Calendar) null);
        calendarWrite.set(1, i);
        calendarWrite.set(2, i2);
        return new Month(calendarWrite);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Month month) {
        return this.RemoteActionCompatParcelizer.compareTo(month.RemoteActionCompatParcelizer);
    }

    public final int write(Month month) {
        if (!(this.RemoteActionCompatParcelizer instanceof GregorianCalendar)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Only Gregorian calendars are supported.");
            return 0;
        }
        return (month.IconCompatParcelizer - this.IconCompatParcelizer) + ((month.RatingCompat - this.RatingCompat) * 12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.RatingCompat);
        parcel.writeInt(this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.IconCompatParcelizer == month.IconCompatParcelizer && this.RatingCompat == month.RatingCompat;
    }

    public final String serializer() {
        if (this.serializer == null) {
            this.serializer = accessgetDeactivateOutOfFramecp.read("yMMMM", Locale.getDefault()).format(new Date(this.RemoteActionCompatParcelizer.getTimeInMillis()));
        }
        return this.serializer;
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarIconCompatParcelizer = accessgetDeactivateOutOfFramecp.IconCompatParcelizer(calendar);
        this.RemoteActionCompatParcelizer = calendarIconCompatParcelizer;
        this.IconCompatParcelizer = calendarIconCompatParcelizer.get(2);
        this.RatingCompat = calendarIconCompatParcelizer.get(1);
        this.write = calendarIconCompatParcelizer.getMaximum(7);
        this.read = calendarIconCompatParcelizer.getActualMaximum(5);
        this.MediaMetadataCompat = calendarIconCompatParcelizer.getTimeInMillis();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.RatingCompat)});
    }

    public static Month read(long j) {
        Calendar calendarWrite = accessgetDeactivateOutOfFramecp.write((Calendar) null);
        calendarWrite.setTimeInMillis(j);
        return new Month(calendarWrite);
    }
}
