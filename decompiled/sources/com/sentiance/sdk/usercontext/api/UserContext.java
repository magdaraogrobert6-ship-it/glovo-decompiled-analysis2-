package com.sentiance.sdk.usercontext.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.GeoLocation;
import com.sentiance.sdk.ondevice.api.event.Event;
import com.sentiance.sdk.ondevice.api.segment.Segment;
import com.sentiance.sdk.ondevice.api.venue.Venue;
import com.sentiance.sdk.semantictime.api.SemanticTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import o.GeofenceDataStoreProvider;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class UserContext implements Parcelable {
    public static final Parcelable.Creator<UserContext> CREATOR = new GeofenceDataStoreProvider();
    private final List<Segment> mActiveSegments;
    private final List<Event> mEvents;
    private final Venue mHome;
    private final GeoLocation mLastKnownLocation;
    private final SemanticTime mSemanticTime;
    private final Venue mWork;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<Segment> getActiveSegments() {
        return this.mActiveSegments;
    }

    public List<Event> getEvents() {
        return this.mEvents;
    }

    public Venue getHome() {
        return this.mHome;
    }

    public GeoLocation getLastKnownLocation() {
        return this.mLastKnownLocation;
    }

    public SemanticTime getSemanticTime() {
        return this.mSemanticTime;
    }

    public Venue getWork() {
        return this.mWork;
    }

    @DontObfuscate
    public static class Builder {
        private Venue mHome;
        private GeoLocation mLastKnownLocation;
        private Venue mWork;
        private List<Event> mEvents = new ArrayList();
        private List<Segment> mActiveSegments = new ArrayList();
        private SemanticTime mSemanticTime = SemanticTime.UNKNOWN;

        public Builder setActiveSegments(List<Segment> list) {
            this.mActiveSegments = list;
            return this;
        }

        public Builder setEvents(List<Event> list) {
            this.mEvents = list;
            return this;
        }

        public Builder setHome(Venue venue) {
            this.mHome = venue;
            return this;
        }

        public Builder setLastKnownLocation(GeoLocation geoLocation) {
            this.mLastKnownLocation = geoLocation;
            return this;
        }

        public Builder setSemanticTime(SemanticTime semanticTime) {
            this.mSemanticTime = semanticTime;
            return this;
        }

        public Builder setWork(Venue venue) {
            this.mWork = venue;
            return this;
        }

        public UserContext build() {
            return new UserContext(this, null);
        }
    }

    public int hashCode() {
        int iHashCode = this.mEvents.hashCode();
        int iHashCode2 = this.mActiveSegments.hashCode();
        GeoLocation geoLocation = this.mLastKnownLocation;
        int iHashCode3 = geoLocation != null ? geoLocation.hashCode() : 0;
        Venue venue = this.mHome;
        int iHashCode4 = venue != null ? venue.hashCode() : 0;
        Venue venue2 = this.mWork;
        return this.mSemanticTime.hashCode() + ((((((((iHashCode2 + (iHashCode * 31)) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (venue2 != null ? venue2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.mEvents);
        parcel.writeTypedList(this.mActiveSegments);
        parcel.writeParcelable(this.mLastKnownLocation, i);
        parcel.writeParcelable(this.mHome, i);
        parcel.writeParcelable(this.mWork, i);
        parcel.writeString(this.mSemanticTime.name());
    }

    public String toString() {
        return "UserContext{mEvents=" + this.mEvents + ", mActiveSegments=" + this.mActiveSegments + ", mLastKnownLocation=" + this.mLastKnownLocation + ", mHome=" + this.mHome + ", mWork=" + this.mWork + ", mSemanticTime=" + this.mSemanticTime + '}';
    }

    public UserContext(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.mEvents = arrayList;
        parcel.readList(arrayList, Event.class.getClassLoader());
        this.mActiveSegments = parcel.createTypedArrayList(Segment.CREATOR);
        this.mLastKnownLocation = (GeoLocation) parcel.readParcelable(GeoLocation.class.getClassLoader());
        this.mHome = (Venue) parcel.readParcelable(Venue.class.getClassLoader());
        this.mWork = (Venue) parcel.readParcelable(Venue.class.getClassLoader());
        this.mSemanticTime = getSemanticTimeFromString(parcel.readString());
    }

    private SemanticTime getSemanticTimeFromString(String str) {
        try {
            return SemanticTime.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return SemanticTime.UNKNOWN;
        }
    }

    public UserContext copy() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeParcelable(this, 0);
        parcelObtain.setDataPosition(0);
        UserContext userContext = (UserContext) parcelObtain.readParcelable(UserContext.class.getClassLoader());
        parcelObtain.recycle();
        return userContext;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserContext userContext = (UserContext) obj;
        if (this.mEvents.equals(userContext.mEvents) && this.mActiveSegments.equals(userContext.mActiveSegments) && Objects.equals(this.mLastKnownLocation, userContext.mLastKnownLocation) && Objects.equals(this.mHome, userContext.mHome) && Objects.equals(this.mWork, userContext.mWork)) {
            return Objects.equals(this.mSemanticTime, userContext.mSemanticTime);
        }
        return false;
    }

    private UserContext(Builder builder) {
        this.mEvents = builder.mEvents;
        this.mActiveSegments = builder.mActiveSegments;
        this.mLastKnownLocation = builder.mLastKnownLocation;
        this.mHome = builder.mHome;
        this.mWork = builder.mWork;
        this.mSemanticTime = builder.mSemanticTime;
    }

    public /* synthetic */ UserContext(Builder builder, GeofenceDataStoreProvider geofenceDataStoreProvider) {
        this(builder);
    }
}
