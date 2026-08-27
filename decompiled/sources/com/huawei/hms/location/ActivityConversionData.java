package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityConversionData implements Parcelable {
    public static final Parcelable.Creator<ActivityConversionData> CREATOR = new yn();
    private int activityType;
    private int conversionType;
    private long elapsedTimeFromReboot;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getActivityType() {
        return this.activityType;
    }

    public int getConversionType() {
        return this.conversionType;
    }

    public long getElapsedTimeFromReboot() {
        return this.elapsedTimeFromReboot;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public final class yn implements Parcelable.Creator<ActivityConversionData> {
        @Override // android.os.Parcelable.Creator
        public final ActivityConversionData[] newArray(int i) {
            return new ActivityConversionData[0];
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityConversionData createFromParcel(Parcel parcel) {
            return new ActivityConversionData(parcel, null);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.activityType);
        parcel.writeInt(this.conversionType);
        parcel.writeLong(this.elapsedTimeFromReboot);
    }

    public ActivityConversionData(int i, int i2, long j) {
        if (!ActivityIdentificationData.isValidType(i) || (i2 != 0 && i2 != 1)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ActivityConversionData:The parameter is out of range");
            throw null;
        }
        this.activityType = i;
        this.conversionType = i2;
        this.elapsedTimeFromReboot = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityConversionData)) {
            return false;
        }
        ActivityConversionData activityConversionData = (ActivityConversionData) obj;
        return this.activityType == activityConversionData.getActivityType() && this.conversionType == activityConversionData.getConversionType() && this.elapsedTimeFromReboot == activityConversionData.getElapsedTimeFromReboot();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ActivityConversionData{activityType=");
        sb.append(this.activityType);
        sb.append(", conversionType=");
        sb.append(this.conversionType);
        sb.append(", elapsedTimeFromReboot=");
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.read(sb, this.elapsedTimeFromReboot, '}');
    }

    public ActivityConversionData() {
    }

    private ActivityConversionData(Parcel parcel) {
        this.activityType = parcel.readInt();
        this.conversionType = parcel.readInt();
        this.elapsedTimeFromReboot = parcel.readLong();
    }

    public /* synthetic */ ActivityConversionData(Parcel parcel, yn ynVar) {
        this(parcel);
    }
}
