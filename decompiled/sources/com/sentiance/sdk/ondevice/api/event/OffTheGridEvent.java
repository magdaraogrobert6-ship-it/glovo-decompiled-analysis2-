package com.sentiance.sdk.ondevice.api.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.util.DateTime;
import o.isRemoteViewNotificationAvailableSpaceConstrained;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class OffTheGridEvent extends Event {
    public static final Parcelable.Creator<OffTheGridEvent> CREATOR = new isRemoteViewNotificationAvailableSpaceConstrained();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.sentiance.sdk.ondevice.api.event.Event
    public EventType getEventType() {
        return EventType.OFF_THE_GRID;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeParcelable(this.mStartTime, i);
        parcel.writeParcelable(this.mEndTime, i);
        parcel.writeParcelable(this.mLastUpdateTime, i);
        parcel.writeInt(this.mIsProvisional ? 1 : 0);
    }

    @Override // com.sentiance.sdk.ondevice.api.event.Event
    public String toString() {
        return "OffTheGridEvent{mId='" + this.mId + "', mStartTime=" + this.mStartTime + ", mLastUpdateTime=" + this.mLastUpdateTime + ", mIsProvisional=" + this.mIsProvisional + ", mEndTime=" + this.mEndTime + '}';
    }

    public OffTheGridEvent(Parcel parcel) {
        super(parcel.readString(), (DateTime) parcel.readParcelable(DateTime.class.getClassLoader()), (DateTime) parcel.readParcelable(DateTime.class.getClassLoader()), (DateTime) parcel.readParcelable(DateTime.class.getClassLoader()), parcel.readInt() == 1);
    }

    public OffTheGridEvent(String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3) {
        super(str, dateTime, dateTime2, dateTime3, false);
    }

    public OffTheGridEvent(String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, boolean z) {
        super(str, dateTime, dateTime2, dateTime3, z);
    }

    public OffTheGridEvent(String str, DateTime dateTime, DateTime dateTime2) {
        this(str, dateTime, dateTime2, DateTime.now());
    }
}
