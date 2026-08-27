package com.sentiance.sdk.ondevice.api.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.util.DateTime;
import o.getNotificationStylelambda3;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public class UnknownEvent extends Event {
    public static final Parcelable.Creator<UnknownEvent> CREATOR = new getNotificationStylelambda3();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.sentiance.sdk.ondevice.api.event.Event
    public EventType getEventType() {
        return EventType.UNKNOWN;
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
        return "UnknownEvent{mId='" + this.mId + "', mStartTime=" + this.mStartTime + ", mLastUpdateTime=" + this.mLastUpdateTime + ", mIsProvisional=" + this.mIsProvisional + ", mEndTime=" + this.mEndTime + '}';
    }

    public UnknownEvent(Parcel parcel) {
        super(parcel.readString(), (DateTime) parcel.readParcelable(DateTime.class.getClassLoader()), (DateTime) parcel.readParcelable(DateTime.class.getClassLoader()), (DateTime) parcel.readParcelable(DateTime.class.getClassLoader()), parcel.readInt() == 1);
    }

    public UnknownEvent(String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3) {
        this(str, dateTime, dateTime2, dateTime3, false);
    }

    public UnknownEvent(String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, boolean z) {
        super(str, dateTime, dateTime2, dateTime3, z);
    }

    public UnknownEvent(String str, DateTime dateTime, DateTime dateTime2) {
        this(str, dateTime, dateTime2, DateTime.now());
    }
}
