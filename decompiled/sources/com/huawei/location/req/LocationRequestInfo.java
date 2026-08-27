package com.huawei.location.req;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzq;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.Map;
import o.r8lambdaLssewuUnwz__zuwPAhaX4NMGewA;

/* JADX INFO: loaded from: classes2.dex */
public class LocationRequestInfo implements IMessageEntity, Parcelable {
    public static final Parcelable.Creator<LocationRequestInfo> CREATOR = new zzq(29);

    @Packed
    private String countryCode;

    @Packed
    private long expirationTime;

    @Packed
    private Map<String, String> extras;

    @Packed
    private long fastestInterval;

    @Packed
    private long interval;

    @Packed
    private boolean isFastestIntervalExplicitlySet;

    @Packed
    private String language;

    @Packed
    private long maxWaitTime;

    @Packed
    private boolean needAddress;

    @Packed
    private int numUpdates;

    @Packed
    private int priority;

    @Packed
    private float smallestDisplacement;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public long getExpirationTime() {
        return this.expirationTime;
    }

    public Map<String, String> getExtras() {
        return this.extras;
    }

    public long getFastestInterval() {
        return this.fastestInterval;
    }

    public long getInterval() {
        return this.interval;
    }

    public String getLanguage() {
        return this.language;
    }

    public long getMaxWaitTime() {
        return this.maxWaitTime;
    }

    public boolean getNeedAddress() {
        return this.needAddress;
    }

    public int getNumUpdates() {
        return this.numUpdates;
    }

    public int getPriority() {
        return this.priority;
    }

    public float getSmallestDisplacement() {
        return this.smallestDisplacement;
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.isFastestIntervalExplicitlySet;
    }

    public boolean isValid() {
        int i = this.priority;
        return i == 200 || i == 100 || i == 102 || i == 104 || i == 300 || i == 105;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setExpirationTime(long j) {
        this.expirationTime = j;
    }

    public void setExtras(Map<String, String> map) {
        this.extras = map;
    }

    public void setFastestInterval(long j) {
        this.fastestInterval = j;
    }

    public void setFastestIntervalExplicitlySet(boolean z) {
        this.isFastestIntervalExplicitlySet = z;
    }

    public void setInterval(long j) {
        this.interval = j;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setMaxWaitTime(long j) {
        this.maxWaitTime = j;
    }

    public void setNeedAddress(boolean z) {
        this.needAddress = z;
    }

    public void setNumUpdates(int i) {
        this.numUpdates = i;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public void setSmallestDisplacement(float f) {
        this.smallestDisplacement = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.expirationTime);
        parcel.writeLong(this.fastestInterval);
        parcel.writeLong(this.interval);
        parcel.writeLong(this.maxWaitTime);
        parcel.writeInt(this.numUpdates);
        parcel.writeInt(this.priority);
        parcel.writeFloat(this.smallestDisplacement);
        parcel.writeByte(this.isFastestIntervalExplicitlySet ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.needAddress ? (byte) 1 : (byte) 0);
        parcel.writeString(this.language);
        parcel.writeString(this.countryCode);
    }

    public LocationRequestInfo(Parcel parcel) {
        this.expirationTime = parcel.readLong();
        this.fastestInterval = parcel.readLong();
        this.interval = parcel.readLong();
        this.maxWaitTime = parcel.readLong();
        this.numUpdates = parcel.readInt();
        this.priority = parcel.readInt();
        this.smallestDisplacement = parcel.readFloat();
        this.isFastestIntervalExplicitlySet = parcel.readByte() != 0;
        this.needAddress = parcel.readByte() != 0;
        this.language = parcel.readString();
        this.countryCode = parcel.readString();
    }

    public int deductNumUpdates() {
        int i = this.numUpdates - 1;
        this.numUpdates = i;
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{expirationTime=");
        sb.append(this.expirationTime);
        sb.append(", fastestInterval=");
        sb.append(this.fastestInterval);
        sb.append(", interval=");
        sb.append(this.interval);
        sb.append(", maxWaitTime=");
        sb.append(this.maxWaitTime);
        sb.append(", numUpdates=");
        sb.append(this.numUpdates);
        sb.append(", priority=");
        sb.append(this.priority);
        sb.append(", smallestDisplacement=");
        sb.append(this.smallestDisplacement);
        sb.append(", isFastestIntervalExplicitlySet=");
        sb.append(this.isFastestIntervalExplicitlySet);
        sb.append(", needAddress=");
        sb.append(this.needAddress);
        sb.append(", language='");
        sb.append(this.language);
        sb.append("', countryCode='");
        sb.append(this.countryCode);
        sb.append("', extras=");
        return r8lambdaLssewuUnwz__zuwPAhaX4NMGewA.read(sb, (Map) this.extras, '}');
    }

    public LocationRequestInfo() {
    }
}
