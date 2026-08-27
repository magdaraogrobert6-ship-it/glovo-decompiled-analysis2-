package com.huawei.location.base.activity.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzq;

/* JADX INFO: loaded from: classes2.dex */
public class MovementEvent implements Parcelable {
    public static final Parcelable.Creator<MovementEvent> CREATOR = new zzq(26);
    private int mEventType;
    private String mMovement;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getEventType() {
        return this.mEventType;
    }

    public String getMovement() {
        return this.mMovement;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mMovement);
        parcel.writeInt(this.mEventType);
    }

    public MovementEvent(String str, int i) {
        this.mMovement = str;
        this.mEventType = i;
    }
}
