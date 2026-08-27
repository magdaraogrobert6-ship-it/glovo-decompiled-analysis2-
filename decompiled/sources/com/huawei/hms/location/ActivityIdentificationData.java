package com.huawei.hms.location;

import android.os.Parcel;
import android.os.Parcelable;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.c8$$ExternalSyntheticOutline0;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.location.common.exception.LocationStatusCode;
import com.huawei.location.gwi.util.GwiErrorCode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityIdentificationData implements Parcelable {
    public static final int BIKE = 101;
    public static final int FOOT = 102;
    public static final int OTHERS = 104;
    private static final int POSSIBILITY_MAX = 100;
    private static final int POSSIBILITY_MIN = 0;
    public static final int STILL = 103;
    public static final int VEHICLE = 100;
    public static final int WALKING = 107;
    private int identificationActivity;
    private int possibility;
    public static final Parcelable.Creator<ActivityIdentificationData> CREATOR = new yn();
    public static final int RUNNING = 108;
    private static final int[] VALID_TYPE_ARRAY = {100, 101, 102, 103, 107, RUNNING};

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getIdentificationActivity() {
        return this.identificationActivity;
    }

    public int getPossibility() {
        return this.possibility;
    }

    public void setIdentificationActivity(int i) {
        this.identificationActivity = i;
    }

    public final class yn implements Parcelable.Creator<ActivityIdentificationData> {
        @Override // android.os.Parcelable.Creator
        public final ActivityIdentificationData[] newArray(int i) {
            return new ActivityIdentificationData[i];
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityIdentificationData createFromParcel(Parcel parcel) {
            return new ActivityIdentificationData(parcel, (yn) null);
        }
    }

    public static boolean isValidType(int i) {
        return Arrays.binarySearch(VALID_TYPE_ARRAY, i) >= 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.identificationActivity);
        parcel.writeInt(this.possibility);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return true;
        }
        if (getClass() != obj.getClass() || !(obj instanceof ActivityIdentificationData)) {
            return false;
        }
        ActivityIdentificationData activityIdentificationData = (ActivityIdentificationData) obj;
        return this.identificationActivity == activityIdentificationData.getIdentificationActivity() && this.possibility == activityIdentificationData.getPossibility();
    }

    public String toString() {
        String string;
        int i = this.identificationActivity;
        switch (i) {
            case 100:
                string = "VEHICLE";
                break;
            case 101:
                string = "BIKE";
                break;
            case 102:
                string = "FOOT";
                break;
            case 103:
                string = "STILL";
                break;
            case 104:
                string = "OTHERS";
                break;
            case 105:
            case GwiErrorCode.ALG_LIBRARY_NOT_EXIST /* 106 */:
            default:
                string = Integer.toString(i);
                break;
            case 107:
                string = "WALKING";
                break;
            case RUNNING /* 108 */:
                string = "RUNNING";
                break;
        }
        return af$$ExternalSyntheticOutline0.m(c8$$ExternalSyntheticOutline0.m("ActivityIdentificationData{identificationActivity=", string, ", possibility="), this.possibility, '}');
    }

    public int hashCode() {
        return new Object[]{Integer.valueOf(this.identificationActivity), Integer.valueOf(this.possibility)}.hashCode();
    }

    public void setPossibility(int i) throws ApiException {
        if (i <= 100 && i >= 0) {
            this.possibility = i;
            return;
        }
        throw new ApiException(new Status(10802, LocationStatusCode.getStatusCodeString(10802)));
    }

    public ActivityIdentificationData(int i, int i2) throws ApiException {
        if (i2 > 100 || i2 < 0) {
            throw new ApiException(new Status(10802, LocationStatusCode.getStatusCodeString(10802)));
        }
        this.identificationActivity = i;
        this.possibility = i2;
    }

    private ActivityIdentificationData(Parcel parcel) {
        this.identificationActivity = parcel.readInt();
        this.possibility = parcel.readInt();
    }

    public /* synthetic */ ActivityIdentificationData(Parcel parcel, yn ynVar) {
        this(parcel);
    }
}
