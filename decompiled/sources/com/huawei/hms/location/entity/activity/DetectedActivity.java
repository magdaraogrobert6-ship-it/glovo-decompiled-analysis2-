package com.huawei.hms.location.entity.activity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class DetectedActivity implements Parcelable {
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new yn();
    private int confidence;
    private int type;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getConfidence() {
        return this.confidence;
    }

    public int getType() {
        return this.type;
    }

    public void setConfidence(int i) {
        this.confidence = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public final class yn implements Parcelable.Creator<DetectedActivity> {
        @Override // android.os.Parcelable.Creator
        public final DetectedActivity[] newArray(int i) {
            return new DetectedActivity[i];
        }

        @Override // android.os.Parcelable.Creator
        public final DetectedActivity createFromParcel(Parcel parcel) {
            return new DetectedActivity(parcel, (yn) null);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.type);
        parcel.writeInt(this.confidence);
    }

    private DetectedActivity(Parcel parcel) {
        this.type = parcel.readInt();
        this.confidence = parcel.readInt();
    }

    public DetectedActivity(int i, int i2) {
        this.confidence = i2;
        this.type = i;
    }

    public DetectedActivity() {
    }

    public /* synthetic */ DetectedActivity(Parcel parcel, yn ynVar) {
        this(parcel);
    }
}
