package com.sentiance.sdk.ondevice.api.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.GeoLocation;
import com.sentiance.sdk.ondevice.api.venue.Venue;
import com.sentiance.sdk.util.DateTime;
import java.util.Objects;
import o.getNotificationStylelambda4;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class StationaryEvent extends Event {
    public static final Parcelable.Creator<StationaryEvent> CREATOR = new getNotificationStylelambda4();
    private final GeoLocation mLocation;
    private final Venue mVenue;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.sentiance.sdk.ondevice.api.event.Event
    public EventType getEventType() {
        return EventType.STATIONARY;
    }

    public GeoLocation getLocation() {
        return this.mLocation;
    }

    public Venue getVenue() {
        return this.mVenue;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeParcelable(this.mStartTime, i);
        parcel.writeParcelable(this.mEndTime, i);
        parcel.writeParcelable(this.mLastUpdateTime, i);
        parcel.writeInt(this.mIsProvisional ? 1 : 0);
        parcel.writeParcelable(this.mVenue, i);
        parcel.writeParcelable(this.mLocation, i);
    }

    @Override // com.sentiance.sdk.ondevice.api.event.Event
    public String toString() {
        return "StationaryEvent{mVenue=" + this.mVenue + ", mLocation=" + this.mLocation + ", mId='" + this.mId + "', mStartTime=" + this.mStartTime + ", mLastUpdateTime=" + this.mLastUpdateTime + ", mIsProvisional=" + this.mIsProvisional + ", mEndTime=" + this.mEndTime + '}';
    }

    public StationaryEvent(Parcel parcel) {
        super(parcel.readString(), (DateTime) parcel.readParcelable(DateTime.class.getClassLoader()), (DateTime) parcel.readParcelable(DateTime.class.getClassLoader()), (DateTime) parcel.readParcelable(DateTime.class.getClassLoader()), parcel.readInt() == 1);
        this.mVenue = (Venue) parcel.readParcelable(Venue.class.getClassLoader());
        this.mLocation = (GeoLocation) parcel.readParcelable(GeoLocation.class.getClassLoader());
    }

    @Override // com.sentiance.sdk.ondevice.api.event.Event
    public int hashCode() {
        int iHashCode = super.hashCode();
        return Objects.hashCode(this.mLocation) + ((this.mVenue.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // com.sentiance.sdk.ondevice.api.event.Event
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        StationaryEvent stationaryEvent = (StationaryEvent) obj;
        return this.mVenue.equals(stationaryEvent.mVenue) && Objects.equals(this.mLocation, stationaryEvent.mLocation);
    }

    public StationaryEvent(String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, Venue venue, GeoLocation geoLocation) {
        super(str, dateTime, dateTime2, dateTime3, false);
        this.mVenue = venue;
        this.mLocation = geoLocation;
    }

    public StationaryEvent(String str, DateTime dateTime, DateTime dateTime2, Venue venue, GeoLocation geoLocation) {
        this(str, dateTime, dateTime2, DateTime.now(), venue, geoLocation);
    }
}
