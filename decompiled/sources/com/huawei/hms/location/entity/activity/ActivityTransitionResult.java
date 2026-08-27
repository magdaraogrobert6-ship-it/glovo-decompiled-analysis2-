package com.huawei.hms.location.entity.activity;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityTransitionResult implements Parcelable {
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new yn();
    private List<ActivityTransitionEvent> transitionEvents;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<ActivityTransitionEvent> getTransitionEvents() {
        return this.transitionEvents;
    }

    public final class yn implements Parcelable.Creator<ActivityTransitionResult> {
        @Override // android.os.Parcelable.Creator
        public final ActivityTransitionResult[] newArray(int i) {
            return new ActivityTransitionResult[0];
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityTransitionResult createFromParcel(Parcel parcel) {
            return new ActivityTransitionResult(parcel, null);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.transitionEvents);
    }

    private ActivityTransitionResult(Parcel parcel) {
        this.transitionEvents = parcel.createTypedArrayList(ActivityTransitionEvent.CREATOR);
    }

    public /* synthetic */ ActivityTransitionResult(Parcel parcel, yn ynVar) {
        this(parcel);
    }

    public ActivityTransitionResult(List<ActivityTransitionEvent> list) {
        this.transitionEvents = list;
    }
}
