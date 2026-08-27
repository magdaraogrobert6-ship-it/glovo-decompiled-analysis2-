package com.mapbox.search.common.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.resp.Vw;
import o.DrawableTransformation;

/* JADX INFO: loaded from: classes3.dex */
public final class WeekTimestamp implements Parcelable {
    public static final Parcelable.Creator<WeekTimestamp> CREATOR = new Vw.yn(26);
    public final WeekDay day;
    public final int hour;
    public final int minute;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.minute) + af$$ExternalSyntheticOutline0.m(this.hour, this.day.hashCode() * 31, 31);
    }

    public WeekTimestamp(WeekDay weekDay, int i, int i2) {
        weekDay.getClass();
        this.day = weekDay;
        this.hour = i;
        this.minute = i2;
        if (i < 0 || i >= 25) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Hour should be specified in [0..24] range.");
            throw null;
        }
        if (i2 < 0 || i2 >= 60) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Minute should be specified in [0..60) range.");
            throw null;
        }
        int i3 = (i * 60) + i2;
        if (i3 < 0 || i3 >= 1441) {
            DrawableTransformation.serializer((Object) af$$ExternalSyntheticOutline0.m(i, i2, "There can't be ", " hours and ", " minutes in the day."));
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.day.name());
        parcel.writeInt(this.hour);
        parcel.writeInt(this.minute);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeekTimestamp)) {
            return false;
        }
        WeekTimestamp weekTimestamp = (WeekTimestamp) obj;
        return this.day == weekTimestamp.day && this.hour == weekTimestamp.hour && this.minute == weekTimestamp.minute;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WeekTimestamp(day=");
        sb.append(this.day);
        sb.append(", hour=");
        sb.append(this.hour);
        sb.append(", minute=");
        return af$$ExternalSyntheticOutline0.m(sb, this.minute, ')');
    }
}
