package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class LocationRequest implements IMessageEntity, Parcelable {
    public static final int COORDINATE_TYPE_GCJ02 = 1;
    public static final int COORDINATE_TYPE_WGS84 = 0;
    public static final Parcelable.Creator<LocationRequest> CREATOR = new yn();
    private static final double FASTEST_INTERVAL_FACTOR = 6.0d;
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HD_ACCURACY = 200;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_HIGH_ACCURACY_AND_INDOOR = 400;
    public static final int PRIORITY_INDOOR = 300;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_MAG_POSITION = 301;
    public static final int PRIORITY_NO_POWER = 105;

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

    public final class yn implements Parcelable.Creator<LocationRequest> {
        @Override // android.os.Parcelable.Creator
        public final LocationRequest[] newArray(int i) {
            return new LocationRequest[i];
        }

        @Override // android.os.Parcelable.Creator
        public final LocationRequest createFromParcel(Parcel parcel) {
            return new LocationRequest(parcel);
        }
    }

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

    public LocationRequest setCountryCode(String str) {
        this.countryCode = str;
        return this;
    }

    public LocationRequest setLanguage(String str) {
        this.language = str;
        return this;
    }

    public LocationRequest setNeedAddress(boolean z) {
        this.needAddress = z;
        return this;
    }

    public static LocationRequest create() {
        return new LocationRequest();
    }

    public long getMaxWaitTime() {
        long j = this.maxWaitTime;
        long j2 = this.interval;
        return j < j2 ? j2 : j;
    }

    public LocationRequest setNumUpdates(int i) throws IllegalArgumentException {
        if (i > 0) {
            this.numUpdates = i;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("numUpdates is invalid");
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.priority);
        parcel.writeLong(this.interval);
        parcel.writeLong(this.fastestInterval);
        parcel.writeByte(this.isFastestIntervalExplicitlySet ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.expirationTime);
        parcel.writeInt(this.numUpdates);
        parcel.writeFloat(this.smallestDisplacement);
        parcel.writeLong(this.maxWaitTime);
        parcel.writeByte(this.needAddress ? (byte) 1 : (byte) 0);
        parcel.writeString(this.language);
        parcel.writeString(this.countryCode);
        parcel.writeMap(this.extras);
    }

    public LocationRequest(Parcel parcel) {
        this.priority = parcel.readInt();
        this.interval = parcel.readLong();
        this.fastestInterval = parcel.readLong();
        this.isFastestIntervalExplicitlySet = parcel.readByte() != 0;
        this.expirationTime = parcel.readLong();
        this.numUpdates = parcel.readInt();
        this.smallestDisplacement = parcel.readFloat();
        this.maxWaitTime = parcel.readLong();
        this.needAddress = parcel.readByte() != 0;
        this.language = parcel.readString();
        this.countryCode = parcel.readString();
        HashMap map = new HashMap();
        this.extras = map;
        parcel.readMap(map, LocationRequest.class.getClassLoader());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LocationRequest{priority=");
        sb.append(this.priority);
        sb.append(", interval=");
        sb.append(this.interval);
        sb.append(", fastestInterval=");
        sb.append(this.fastestInterval);
        sb.append(", isFastestIntervalExplicitlySet=");
        sb.append(this.isFastestIntervalExplicitlySet);
        sb.append(", expirationTime=");
        sb.append(this.expirationTime);
        sb.append(", numUpdates=");
        sb.append(this.numUpdates);
        sb.append(", smallestDisplacement=");
        sb.append(this.smallestDisplacement);
        sb.append(", maxWaitTime=");
        sb.append(this.maxWaitTime);
        sb.append(", needAddress=");
        sb.append(this.needAddress);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", countryCode=");
        return ff$$ExternalSyntheticOutline0.m(sb, this.countryCode, '}');
    }

    public LocationRequest setSmallestDisplacement(float f) {
        if (f >= 0.0f) {
            this.smallestDisplacement = f;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("smallestDisplacement param invalid");
        return null;
    }

    public int hashCode() {
        int i = this.priority;
        long j = this.interval;
        long j2 = this.fastestInterval;
        boolean z = this.isFastestIntervalExplicitlySet;
        long j3 = this.expirationTime;
        int i2 = this.numUpdates;
        float f = this.smallestDisplacement;
        long j4 = this.maxWaitTime;
        boolean z2 = this.needAddress;
        return Objects.hash(Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2), Boolean.valueOf(z), Long.valueOf(j3), Integer.valueOf(i2), Float.valueOf(f), Long.valueOf(j4), Boolean.valueOf(z2), this.language, this.countryCode);
    }

    public void putExtras(String str, String str2) {
        if (this.extras == null) {
            this.extras = new HashMap();
        }
        this.extras.put(str, str2);
    }

    public LocationRequest setInterval(long j) throws IllegalArgumentException {
        if (j >= 0) {
            this.interval = j;
            this.fastestInterval = this.isFastestIntervalExplicitlySet ? this.fastestInterval : (long) (j / FASTEST_INTERVAL_FACTOR);
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("interval is invalid");
        return null;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            LocationRequest locationRequest = obj instanceof LocationRequest ? (LocationRequest) obj : null;
            if (locationRequest == null) {
                return false;
            }
            boolean z = this.expirationTime == locationRequest.expirationTime && this.isFastestIntervalExplicitlySet == locationRequest.isFastestIntervalExplicitlySet && this.fastestInterval == locationRequest.fastestInterval && this.interval == locationRequest.interval && this.maxWaitTime == locationRequest.maxWaitTime && this.numUpdates == locationRequest.numUpdates && this.priority == locationRequest.priority && this.needAddress == locationRequest.needAddress && Float.compare(this.smallestDisplacement, locationRequest.smallestDisplacement) == 0;
            String str3 = this.language;
            boolean z2 = str3 != null && (str2 = locationRequest.language) != null && z && str3.equals(str2);
            String str4 = this.countryCode;
            if (str4 != null && (str = locationRequest.countryCode) != null && z2 && str4.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public LocationRequest setExpirationTime(long j) {
        if (j < 0) {
            j = 0;
        }
        this.expirationTime = j;
        return this;
    }

    public LocationRequest setFastestInterval(long j) throws IllegalArgumentException {
        if (j >= 0) {
            this.isFastestIntervalExplicitlySet = true;
            this.fastestInterval = j;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("FastestInterval is invalid");
        return null;
    }

    public LocationRequest setMaxWaitTime(long j) {
        if (SystemClock.uptimeMillis() + j >= 0) {
            this.maxWaitTime = j;
            return this;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("maxWaitTime value is out of system time,is invalid");
        return null;
    }

    public LocationRequest setExpirationDuration(long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = j <= Long.MAX_VALUE - jElapsedRealtime ? j + jElapsedRealtime : Long.MAX_VALUE;
        this.expirationTime = j2;
        if (j2 < 0) {
            j2 = 0;
        }
        this.expirationTime = j2;
        return this;
    }

    public LocationRequest setPriority(int i) {
        if (i != 102 && i != 100 && i != 104 && i != 105 && i != 200 && i != 300 && i != 400 && i != 301) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("priority is not a known constant");
            return null;
        }
        this.priority = i;
        return this;
    }

    public LocationRequest() {
        this.priority = 102;
        this.interval = 3600000L;
        this.fastestInterval = 600000L;
        this.isFastestIntervalExplicitlySet = false;
        this.expirationTime = Long.MAX_VALUE;
        this.numUpdates = Integer.MAX_VALUE;
        this.smallestDisplacement = 0.0f;
        this.maxWaitTime = 0L;
        this.needAddress = false;
        this.language = "";
        this.countryCode = "";
    }
}
