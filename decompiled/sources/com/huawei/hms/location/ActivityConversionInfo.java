package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.af$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityConversionInfo implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<ActivityConversionInfo> CREATOR = new yn();
    public static final int ENTER_ACTIVITY_CONVERSION = 0;
    public static final int EXIT_ACTIVITY_CONVERSION = 1;

    @Packed
    private int activityType;

    @Packed
    private int conversionType;

    public final class yn implements Parcelable.Creator<ActivityConversionInfo> {
        @Override // android.os.Parcelable.Creator
        public final ActivityConversionInfo[] newArray(int i) {
            return new ActivityConversionInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityConversionInfo createFromParcel(Parcel parcel) {
            return new ActivityConversionInfo(parcel);
        }
    }

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

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.activityType);
        parcel.writeInt(this.conversionType);
    }

    public ActivityConversionInfo(int i, int i2) {
        if (!ActivityIdentificationData.isValidType(i) || (i2 != 0 && i2 != 1)) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ActivityConversionInfo:The parameter is out of range");
            throw null;
        }
        this.activityType = i;
        this.conversionType = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return true;
        }
        if (!(obj instanceof ActivityConversionInfo)) {
            return false;
        }
        ActivityConversionInfo activityConversionInfo = (ActivityConversionInfo) obj;
        return this.activityType == activityConversionInfo.getActivityType() && this.conversionType == activityConversionInfo.getConversionType();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ActivityConversionInfo{activityType=");
        sb.append(this.activityType);
        sb.append(", conversionType=");
        return af$$ExternalSyntheticOutline0.m(sb, this.conversionType, '}');
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class Builder {
        private int mActivityType = -1;
        private int mConversionType = -1;

        public Builder setActivityType(int i) {
            if (ActivityIdentificationData.isValidType(i)) {
                this.mActivityType = i;
                return this;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ActivityConversionInfo:The parameter is out of range");
            return null;
        }

        public Builder setConversionType(int i) {
            if (i != 0 && i != 1) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ActivityConversionInfo:The parameter is out of range");
                return null;
            }
            this.mConversionType = i;
            return this;
        }

        public ActivityConversionInfo build() {
            Preconditions.checkState(this.mActivityType != -1, "ActivityType not set.");
            Preconditions.checkState(this.mConversionType != -1, "ConversionType not set.");
            return new ActivityConversionInfo(this.mActivityType, this.mConversionType);
        }
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.activityType), Integer.valueOf(this.conversionType));
    }

    public void setActivityType(int i) {
        if (ActivityIdentificationData.isValidType(i)) {
            this.activityType = i;
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ActivityConversionInfo:The parameter is out of range");
        }
    }

    public void setConversionType(int i) {
        if (i != 0 && i != 1) {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ActivityConversionInfo:The parameter is out of range");
        } else {
            this.conversionType = i;
        }
    }

    public ActivityConversionInfo() {
    }

    public ActivityConversionInfo(Parcel parcel) {
        this.activityType = parcel.readInt();
        this.conversionType = parcel.readInt();
    }
}
