package com.sentiance.sdk.util;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.af$$ExternalSyntheticOutline0;
import com.sentiance.sdk.DontObfuscate;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import o.migratePushDeliveryEventsToJsonlambda3;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class DateTime implements Parcelable {
    public static final Parcelable.Creator<DateTime> CREATOR = new migratePushDeliveryEventsToJsonlambda3();
    private static final String DATE_TIME_PATTERN_M = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private final long mEpochTime;
    private final String mTimezoneId;
    private final int mTimezoneOffsetInMinutes;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getEpochTime() {
        return this.mEpochTime;
    }

    public String getTimezoneId() {
        return this.mTimezoneId;
    }

    public int getTimezoneOffsetInMinutes() {
        return this.mTimezoneOffsetInMinutes;
    }

    private TimeZone getTimeZone() {
        return TimeZone.getTimeZone(this.mTimezoneId);
    }

    public long durationInSecondsUntil(DateTime dateTime) {
        return (dateTime.mEpochTime - this.mEpochTime) / 1000;
    }

    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_TIME_PATTERN_M, Locale.ENGLISH);
        simpleDateFormat.setTimeZone(getTimeZone());
        return simpleDateFormat.format(toCalendar().getTime());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mEpochTime);
        parcel.writeString(this.mTimezoneId);
        parcel.writeInt(this.mTimezoneOffsetInMinutes);
    }

    public DateTime(Parcel parcel) {
        this.mEpochTime = parcel.readLong();
        this.mTimezoneId = parcel.readString();
        this.mTimezoneOffsetInMinutes = parcel.readInt();
    }

    public static DateTime fromMillis(long j) {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        return new DateTime(j, (int) (((long) timeZone.getRawOffset()) / 60000), timeZone.getID());
    }

    public static DateTime now() {
        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = calendar.getTimeZone();
        return new DateTime(calendar.getTimeInMillis(), (int) (((long) timeZone.getRawOffset()) / 60000), timeZone.getID());
    }

    public Calendar toCalendar() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.mEpochTime);
        calendar.setTimeZone(getTimeZone());
        return calendar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DateTime dateTime = (DateTime) obj;
        if (this.mEpochTime == dateTime.mEpochTime && this.mTimezoneOffsetInMinutes == dateTime.mTimezoneOffsetInMinutes) {
            return this.mTimezoneId.equals(dateTime.mTimezoneId);
        }
        return false;
    }

    public int hashCode() {
        long j = this.mEpochTime;
        return af$$ExternalSyntheticOutline0.m(((int) (j ^ (j >>> 32))) * 31, 31, this.mTimezoneId) + this.mTimezoneOffsetInMinutes;
    }

    public DateTime(long j, int i, String str) {
        this.mEpochTime = j;
        this.mTimezoneOffsetInMinutes = i;
        this.mTimezoneId = str;
    }
}
