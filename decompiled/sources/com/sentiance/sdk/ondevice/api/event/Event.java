package com.sentiance.sdk.ondevice.api.event;

import android.os.Parcelable;
import bo.app.d$$ExternalSyntheticOutline0;
import com.sentiance.sdk.DontObfuscate;
import com.sentiance.sdk.util.DateTime;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@DontObfuscate
public abstract class Event implements Parcelable {
    final DateTime mEndTime;
    final String mId;
    final boolean mIsProvisional;
    final DateTime mLastUpdateTime;
    final DateTime mStartTime;

    public DateTime getEndTime() {
        return this.mEndTime;
    }

    public abstract EventType getEventType();

    public String getId() {
        return this.mId;
    }

    public DateTime getLastUpdateTime() {
        return this.mLastUpdateTime;
    }

    public DateTime getStartTime() {
        return this.mStartTime;
    }

    public boolean hasEnded() {
        return this.mEndTime != null;
    }

    public boolean isProvisional() {
        return this.mIsProvisional;
    }

    public int hashCode() {
        int iHashCode = this.mId.hashCode();
        int iHashCode2 = this.mStartTime.hashCode();
        return Objects.hashCode(this.mEndTime) + d$$ExternalSyntheticOutline0.m((this.mLastUpdateTime.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31, 31, this.mIsProvisional);
    }

    public Event(String str, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, boolean z) {
        this.mId = str;
        this.mStartTime = dateTime;
        this.mEndTime = dateTime2;
        this.mLastUpdateTime = dateTime3;
        this.mIsProvisional = z;
    }

    public String toString() {
        return "Event{mId='" + this.mId + "', mStartTime=" + this.mStartTime + ", mLastUpdateTime=" + this.mLastUpdateTime + ", mIsProvisional=" + this.mIsProvisional + ", mEndTime=" + this.mEndTime + '}';
    }

    public Long getDurationInSeconds() {
        DateTime dateTime = this.mEndTime;
        if (dateTime == null) {
            return null;
        }
        return Long.valueOf(this.mStartTime.durationInSecondsUntil(dateTime));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Event event = (Event) obj;
        return this.mIsProvisional == event.mIsProvisional && this.mId.equals(event.mId) && this.mStartTime.equals(event.mStartTime) && this.mLastUpdateTime.equals(event.mLastUpdateTime) && Objects.equals(this.mEndTime, event.mEndTime);
    }

    public Event(String str, DateTime dateTime, DateTime dateTime2) {
        this(str, dateTime, dateTime2, DateTime.now(), false);
    }
}
