package com.huawei.hms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import o.SweepGradientShader9KIMszodefault;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityIdentificationResponse implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<ActivityIdentificationResponse> CREATOR = new yn();
    private static final String EXTRA_CONSTANT = "com.huawei.hms.location.internal.EXTRA_ACTIVITY_RESULT";
    private static final String TAG = "ActivityIdentificationResponse";

    @Packed
    private List<ActivityIdentificationData> activityIdentificationDatas;

    @Packed
    private long elapsedTimeFromReboot;

    @Packed
    private long time;

    public static ActivityIdentificationResponse getDataFromIntent(Intent intent) {
        try {
            if (containDataFromIntent(intent)) {
                Parcelable parcelableExtra = intent.getParcelableExtra(EXTRA_CONSTANT);
                if (parcelableExtra == null) {
                    parcelableExtra = null;
                } else if (parcelableExtra instanceof Bundle) {
                    parcelableExtra = ((Bundle) parcelableExtra).getParcelable("KEY_RESPONSE");
                }
                if (parcelableExtra instanceof ActivityIdentificationResponse) {
                    return (ActivityIdentificationResponse) parcelableExtra;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<ActivityIdentificationData> getActivityIdentificationDatas() {
        return this.activityIdentificationDatas;
    }

    public long getElapsedTimeFromReboot() {
        return this.elapsedTimeFromReboot;
    }

    public long getTime() {
        return this.time;
    }

    public void setActivityIdentificationDatas(List<ActivityIdentificationData> list) {
        this.activityIdentificationDatas = list;
    }

    public void setElapsedTimeFromReboot(long j) {
        this.elapsedTimeFromReboot = j;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public final class yn implements Parcelable.Creator<ActivityIdentificationResponse> {
        @Override // android.os.Parcelable.Creator
        public final ActivityIdentificationResponse[] newArray(int i) {
            return new ActivityIdentificationResponse[0];
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityIdentificationResponse createFromParcel(Parcel parcel) {
            return new ActivityIdentificationResponse(parcel, null);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.time);
        parcel.writeLong(this.elapsedTimeFromReboot);
        parcel.writeTypedList(this.activityIdentificationDatas);
    }

    private ActivityIdentificationResponse(Parcel parcel) {
        this.time = parcel.readLong();
        this.elapsedTimeFromReboot = parcel.readLong();
        this.activityIdentificationDatas = parcel.createTypedArrayList(ActivityIdentificationData.CREATOR);
    }

    public int getActivityPossibility(int i) {
        List<ActivityIdentificationData> list = this.activityIdentificationDatas;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        for (ActivityIdentificationData activityIdentificationData : this.activityIdentificationDatas) {
            if (activityIdentificationData.getIdentificationActivity() == i) {
                return activityIdentificationData.getPossibility();
            }
        }
        return 0;
    }

    public ActivityIdentificationData getMostActivityIdentification() {
        List<ActivityIdentificationData> list = this.activityIdentificationDatas;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.activityIdentificationDatas.get(0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ActivityIdentificationResponse{time=");
        sb.append(this.time);
        sb.append(", elapsedTimeFromReboot=");
        sb.append(this.elapsedTimeFromReboot);
        sb.append(", activityIdentificationDatas=");
        return SweepGradientShader9KIMszodefault.IconCompatParcelizer(sb, (List) this.activityIdentificationDatas, '}');
    }

    public static boolean containDataFromIntent(Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            return intent.hasExtra(EXTRA_CONSTANT);
        } catch (Exception unused) {
            return false;
        }
    }

    public int hashCode() {
        long j = this.time;
        long j2 = this.elapsedTimeFromReboot;
        return new Object[]{Long.valueOf(j), Long.valueOf(j2), this.activityIdentificationDatas}.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !(obj instanceof ActivityIdentificationResponse)) {
            return false;
        }
        ActivityIdentificationResponse activityIdentificationResponse = (ActivityIdentificationResponse) obj;
        return this.time == activityIdentificationResponse.getTime() && this.elapsedTimeFromReboot == activityIdentificationResponse.getElapsedTimeFromReboot() && Objects.equals(this.activityIdentificationDatas, activityIdentificationResponse.getActivityIdentificationDatas());
    }

    public ActivityIdentificationResponse() {
    }

    public /* synthetic */ ActivityIdentificationResponse(Parcel parcel, yn ynVar) {
        this(parcel);
    }

    public ActivityIdentificationResponse(ActivityIdentificationData activityIdentificationData, long j, long j2) {
        this.activityIdentificationDatas = Collections.singletonList(activityIdentificationData);
        this.time = j;
        this.elapsedTimeFromReboot = j2;
    }

    public ActivityIdentificationResponse(List<ActivityIdentificationData> list, long j, long j2) {
        this.activityIdentificationDatas = list;
        this.time = j;
        this.elapsedTimeFromReboot = j2;
    }
}
