package com.sentiance.sdk.ondevice.api.event;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.ondevice.api.Waypoint;
import com.sentiance.sdk.util.DateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o.getStoryStylelambda0;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class TransportEvent extends Event {
    public static final Parcelable.Creator<TransportEvent> CREATOR = new getStoryStylelambda0();
    private final Integer mDistanceInMeters;
    private final OccupantRole mOccupantRole;
    private final Map<String, String> mTags;
    private final TransportMode mTransportMode;
    private final List<Waypoint> mWaypoints;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Integer getDistanceInMeters() {
        return this.mDistanceInMeters;
    }

    @Override // com.sentiance.sdk.ondevice.api.event.Event
    public EventType getEventType() {
        return EventType.IN_TRANSPORT;
    }

    public OccupantRole getOccupantRole() {
        return this.mOccupantRole;
    }

    public Map<String, String> getTags() {
        return this.mTags;
    }

    public TransportMode getTransportMode() {
        return this.mTransportMode;
    }

    public List<Waypoint> getWaypoints() {
        return this.mWaypoints;
    }

    @Override // com.sentiance.sdk.ondevice.api.event.Event
    public int hashCode() {
        return Objects.hash(this.mTransportMode, this.mWaypoints, this.mDistanceInMeters, this.mTags, this.mOccupantRole);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeParcelable(this.mStartTime, i);
        parcel.writeParcelable(this.mEndTime, i);
        parcel.writeParcelable(this.mLastUpdateTime, i);
        parcel.writeInt(this.mIsProvisional ? 1 : 0);
        parcel.writeInt(this.mTransportMode.ordinal());
        parcel.writeTypedList(this.mWaypoints);
        parcel.writeValue(this.mDistanceInMeters);
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : this.mTags.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        parcel.writeBundle(bundle);
        parcel.writeInt(this.mOccupantRole.ordinal());
    }

    @Override // com.sentiance.sdk.ondevice.api.event.Event
    public String toString() {
        return "TransportEvent{mTransportMode=" + this.mTransportMode + ", mWaypoints=" + this.mWaypoints + ", mDistanceInMeters=" + this.mDistanceInMeters + ", mTags=" + this.mTags + ", occupantRole=" + this.mOccupantRole + ", mId='" + this.mId + "', mStartTime=" + this.mStartTime + ", mLastUpdateTime=" + this.mLastUpdateTime + ", mIsProvisional=" + this.mIsProvisional + ", mEndTime=" + this.mEndTime + '}';
    }

    public TransportEvent(Parcel parcel) {
        super(parcel.readString(), (DateTime) parcel.readParcelable(DateTime.class.getClassLoader()), (DateTime) parcel.readParcelable(DateTime.class.getClassLoader()), (DateTime) parcel.readParcelable(DateTime.class.getClassLoader()), parcel.readInt() == 1);
        this.mTransportMode = TransportMode.values()[parcel.readInt()];
        this.mWaypoints = parcel.createTypedArrayList(Waypoint.CREATOR);
        this.mDistanceInMeters = (Integer) parcel.readValue(Integer.class.getClassLoader());
        Bundle bundle = parcel.readBundle(Bundle.class.getClassLoader());
        this.mTags = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.mTags.put(str, bundle.getString(str));
            }
        }
        this.mOccupantRole = OccupantRole.values()[parcel.readInt()];
    }

    @Override // com.sentiance.sdk.ondevice.api.event.Event
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        TransportEvent transportEvent = (TransportEvent) obj;
        return this.mTransportMode == transportEvent.mTransportMode && Objects.equals(this.mWaypoints, transportEvent.mWaypoints) && Objects.equals(this.mDistanceInMeters, transportEvent.mDistanceInMeters) && Objects.equals(this.mTags, transportEvent.mTags) && this.mOccupantRole == transportEvent.mOccupantRole;
    }

    public TransportEvent(String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, TransportMode transportMode, List<Waypoint> list, Integer num, Map<String, String> map) {
        this(str, dateTime, dateTime2, dateTime3, transportMode, list, num, map, OccupantRole.UNAVAILABLE, false);
    }

    public TransportEvent(String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, TransportMode transportMode, List<Waypoint> list, Integer num, Map<String, String> map, OccupantRole occupantRole) {
        this(str, dateTime, dateTime2, dateTime3, transportMode, list, num, map, occupantRole, false);
    }

    public TransportEvent(String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, TransportMode transportMode, List<Waypoint> list, Integer num, Map<String, String> map, OccupantRole occupantRole, boolean z) {
        super(str, dateTime, dateTime2, dateTime3, z);
        this.mTransportMode = transportMode;
        this.mWaypoints = list;
        this.mDistanceInMeters = num;
        this.mTags = map;
        this.mOccupantRole = occupantRole;
    }

    public TransportEvent(String str, DateTime dateTime, DateTime dateTime2, TransportMode transportMode, List<Waypoint> list, Integer num, Map<String, String> map) {
        this(str, dateTime, dateTime2, DateTime.now(), transportMode, list, num, map);
    }
}
