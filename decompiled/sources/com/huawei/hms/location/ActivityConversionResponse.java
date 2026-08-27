package com.huawei.hms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityConversionResponse implements Parcelable {
    public static final Parcelable.Creator<ActivityConversionResponse> CREATOR = new yn();
    private static final String EXTRA_CONSTANT = "com.huawei.hms.location.internal.EXTRA_ACTIVITY_CONVERSION_RESULT";
    private static final String TAG = "ActivityConversionResp";
    private List<ActivityConversionData> activityConversionDatas;

    public static ActivityConversionResponse getDataFromIntent(Intent intent) {
        try {
            if (containDataFromIntent(intent)) {
                Parcelable parcelableExtra = intent.getParcelableExtra(EXTRA_CONSTANT);
                if (parcelableExtra == null) {
                    parcelableExtra = null;
                } else if (parcelableExtra instanceof Bundle) {
                    parcelableExtra = ((Bundle) parcelableExtra).getParcelable("KEY_RESPONSE");
                }
                if (parcelableExtra instanceof ActivityConversionResponse) {
                    return (ActivityConversionResponse) parcelableExtra;
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

    public List<ActivityConversionData> getActivityConversionDatas() {
        return this.activityConversionDatas;
    }

    public final class yn implements Parcelable.Creator<ActivityConversionResponse> {
        @Override // android.os.Parcelable.Creator
        public final ActivityConversionResponse[] newArray(int i) {
            return new ActivityConversionResponse[i];
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityConversionResponse createFromParcel(Parcel parcel) {
            return new ActivityConversionResponse(parcel, null);
        }
    }

    public int hashCode() {
        return this.activityConversionDatas.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.activityConversionDatas);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActivityConversionResponse) && getClass() == obj.getClass() && this.activityConversionDatas.equals(((ActivityConversionResponse) obj).activityConversionDatas);
    }

    private ActivityConversionResponse(Parcel parcel) {
        this.activityConversionDatas = new ArrayList();
        this.activityConversionDatas = parcel.createTypedArrayList(ActivityConversionData.CREATOR);
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

    public ActivityConversionResponse() {
        this.activityConversionDatas = new ArrayList();
    }

    public /* synthetic */ ActivityConversionResponse(Parcel parcel, yn ynVar) {
        this(parcel);
    }

    public ActivityConversionResponse(List<ActivityConversionData> list) {
        new ArrayList();
        this.activityConversionDatas = list;
    }
}
