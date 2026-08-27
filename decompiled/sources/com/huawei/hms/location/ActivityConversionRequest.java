package com.huawei.hms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityConversionRequest implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<ActivityConversionRequest> CREATOR = new yn();
    public static final Comparator<ActivityConversionInfo> IS_EQUAL_CONVERSION = new Vw();

    @Packed
    private List<ActivityConversionInfo> activityConversions;

    public final class Vw implements Comparator<ActivityConversionInfo> {
        @Override // java.util.Comparator
        public final int compare(ActivityConversionInfo activityConversionInfo, ActivityConversionInfo activityConversionInfo2) {
            ActivityConversionInfo activityConversionInfo3 = activityConversionInfo;
            ActivityConversionInfo activityConversionInfo4 = activityConversionInfo2;
            int activityType = activityConversionInfo3.getActivityType() - activityConversionInfo4.getActivityType();
            if (activityType != 0) {
                return activityType > 0 ? 1 : -1;
            }
            int conversionType = activityConversionInfo3.getConversionType() - activityConversionInfo4.getConversionType();
            if (conversionType != 0) {
                return conversionType > 0 ? 1 : -1;
            }
            return 0;
        }
    }

    public final class yn implements Parcelable.Creator<ActivityConversionRequest> {
        @Override // android.os.Parcelable.Creator
        public final ActivityConversionRequest[] newArray(int i) {
            return new ActivityConversionRequest[i];
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityConversionRequest createFromParcel(Parcel parcel) {
            return new ActivityConversionRequest(parcel);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<ActivityConversionInfo> getActivityConversions() {
        return this.activityConversions;
    }

    public void setActivityConversions(List<ActivityConversionInfo> list) {
        this.activityConversions = list;
    }

    public int hashCode() {
        return this.activityConversions.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.activityConversions);
    }

    public ActivityConversionRequest(Parcel parcel) {
        this.activityConversions = parcel.createTypedArrayList(ActivityConversionInfo.CREATOR);
    }

    public void setDataToIntent(Intent intent) {
        if (intent != null) {
            intent.putExtra("com.huawei.hms.location.internal.EXTRA_ACTIVITY_CONVERSION_REQUEST", this);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("ActivityConversionRequest:The parameter is null");
        }
    }

    public String toString() {
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(new StringBuilder("ActivityConversionRequest{activityConversions="), (List) this.activityConversions, '}');
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && (obj instanceof ActivityConversionRequest)) {
            return Objects.equals(this.activityConversions, ((ActivityConversionRequest) obj).getActivityConversions());
        }
        return false;
    }

    public ActivityConversionRequest() {
    }

    public ActivityConversionRequest(List<ActivityConversionInfo> list) {
        this.activityConversions = list;
    }
}
