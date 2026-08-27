package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Objects;
import o.RulerKt;
import o.accessgetDeactivateOutOfFramecp;

/* JADX INFO: loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new RulerKt();
    public final Month IconCompatParcelizer;
    public final int MediaBrowserCompatMediaItem;
    public final DateValidator MediaSessionCompatQueueItem;
    public final Month RemoteActionCompatParcelizer;
    public Month read;
    public final int serializer;
    public final int write;

    public final class Builder {
        public static final long serializer = accessgetDeactivateOutOfFramecp.write(Month.read(1900, 0).MediaMetadataCompat);
        public static final long write = accessgetDeactivateOutOfFramecp.write(Month.read(2100, 11).MediaMetadataCompat);
        public long IconCompatParcelizer;
        public DateValidator MediaSessionCompatQueueItem;
        public long RatingCompat;
        public int RemoteActionCompatParcelizer;
        public Long read;

        public final CalendarConstraints serializer() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.MediaSessionCompatQueueItem);
            Month month = Month.read(this.RatingCompat);
            Month month2 = Month.read(this.IconCompatParcelizer);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.read;
            return new CalendarConstraints(month, month2, dateValidator, l == null ? null : Month.read(l.longValue()), this.RemoteActionCompatParcelizer);
        }

        public Builder() {
            this.RatingCompat = serializer;
            this.IconCompatParcelizer = write;
            this.MediaSessionCompatQueueItem = new DateValidatorPointForward(Long.MIN_VALUE);
        }

        public Builder(int i) {
        }
    }

    public interface DateValidator extends Parcelable {
        boolean serializer(long j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        Month month = this.read;
        int i = this.serializer;
        return Arrays.hashCode(new Object[]{this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, month, Integer.valueOf(i), this.MediaSessionCompatQueueItem});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.RemoteActionCompatParcelizer, 0);
        parcel.writeParcelable(this.IconCompatParcelizer, 0);
        parcel.writeParcelable(this.read, 0);
        parcel.writeParcelable(this.MediaSessionCompatQueueItem, 0);
        parcel.writeInt(this.serializer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.RemoteActionCompatParcelizer.equals(calendarConstraints.RemoteActionCompatParcelizer) && this.IconCompatParcelizer.equals(calendarConstraints.IconCompatParcelizer) && Objects.equals(this.read, calendarConstraints.read) && this.serializer == calendarConstraints.serializer && this.MediaSessionCompatQueueItem.equals(calendarConstraints.MediaSessionCompatQueueItem);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.RemoteActionCompatParcelizer = month;
        this.IconCompatParcelizer = month2;
        this.read = month3;
        this.serializer = i;
        this.MediaSessionCompatQueueItem = dateValidator;
        if (month3 != null && month.RemoteActionCompatParcelizer.compareTo(month3.RemoteActionCompatParcelizer) > 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("start Month cannot be after current Month");
            throw null;
        }
        if (month3 != null && month3.RemoteActionCompatParcelizer.compareTo(month2.RemoteActionCompatParcelizer) > 0) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("current Month cannot be after end Month");
            throw null;
        }
        if (i < 0 || i > accessgetDeactivateOutOfFramecp.write((Calendar) null).getMaximum(7)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("firstDayOfWeek is not valid");
            throw null;
        }
        this.write = month.write(month2) + 1;
        this.MediaBrowserCompatMediaItem = (month2.RatingCompat - month.RatingCompat) + 1;
    }
}
